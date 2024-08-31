
package net.mcreator.thejonkler.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EviljonklerItem extends Item {
	public EviljonklerItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}
