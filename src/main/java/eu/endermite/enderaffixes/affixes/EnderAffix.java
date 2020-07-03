package eu.endermite.enderaffixes.affixes;

import org.bukkit.inventory.ItemStack;

public class EnderAffix implements Affix {

    private String affixname;
    private String affixdesc;
    private ItemStack affixicon;

    public EnderAffix(String name, String desc, ItemStack icon) {

        this.affixname = name;
        this.affixdesc = desc;
        this.affixicon = icon;

    }

    @Override
    public String getName() {
        return this.affixname;
    }

    @Override
    public String getDesc() {
        return this.affixdesc;
    }

    @Override
    public ItemStack getIcon() {
        return this.affixicon;
    }
}
