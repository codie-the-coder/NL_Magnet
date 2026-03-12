package org.codiethecoder.nextland.magnet.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;

public class MagnetItem extends Item {
    public MagnetItem(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if (level.isClientSide || !(entity instanceof Player player)) {
            return;
        }

        boolean isHeld = isSelected || player.getOffhandItem() == stack;

        if (isHeld) {
            double radius = 5.0;
            AABB area = player.getBoundingBox().inflate(radius);
            List<ItemEntity> nearbyEntities = level.getEntitiesOfClass(ItemEntity.class, area);

            for (ItemEntity target : nearbyEntities) {
                applyTargetLogic(target, player);
            }
        }
    }

    private void applyTargetLogic(ItemEntity target, Player player) {
        if (target.hasPickUpDelay())
            return;

        Vec3 targetPos = target.position();
        Vec3 playerPos = player.position();

        Vec3 direction = playerPos.subtract(targetPos);

        double distance = direction.length();
        if (distance < 0.5) {
            return;
        }

        Vec3 normalizedDirection = direction.normalize();

        double speed = 0.06;

        Vec3 pullVelocity = normalizedDirection.scale(speed);

        target.addDeltaMovement(pullVelocity);

        target.hurtMarked = true;
    }
}