package us.com.zbeyer.tutorialmod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by zacharybeyer on 5/26/17.
 */
public class CreativeTabTutorial extends CreativeTabs{
    public CreativeTabTutorial(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        
        return Items.NETHER_STAR;
    }
}
