package aqario.oubliette.item.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class LightningRodItem extends Item {
    public LightningRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient) {
            ItemStack itemStack = context.getStack();
            Vec3d vec3d = context.getHitPos();
            Direction direction = context.getSide();
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(world);
            world.spawnEntity(lightningEntity);
            context.getStack().damage(1, context.getPlayer(),
                    (player) -> player.sendToolBreakStatus(player.getActiveHand()));
        }
        return super.useOnBlock(context);
    }
}
