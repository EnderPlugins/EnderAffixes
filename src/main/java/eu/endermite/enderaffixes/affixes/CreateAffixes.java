package eu.endermite.enderaffixes.affixes;

import eu.endermite.enderaffixes.EnderAffixes;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class CreateAffixes {

    private static FileConfiguration config = EnderAffixes.getPlugin().getConfig();
    private static Logger logger = EnderAffixes.getPlugin().getLogger();

    public static void create() {

        // Major Affixes
        List<String> allMajorAffixes = new ArrayList();
        allMajorAffixes.add("double-or-nothing");
        allMajorAffixes.add("no-armor");
        allMajorAffixes.add("killstreak");
        allMajorAffixes.add("axes-no-cooldown");

        // Minor Affixes
        List<String> allMinorAffixes = new ArrayList();
        allMinorAffixes.add("boomers");

        String affixname;
        String affixnameString;
        String affixdescString;
        String affixiconString;
        ItemMeta meta;

        logger.info("Starting initializing major affixes...");
        for (String s : allMajorAffixes) {
            affixname = "affixes.major."+s+".";
            affixnameString = affixname+"friendly-name";
            affixdescString = affixname+"description";
            affixiconString = affixname+"icon";
            if (config.getBoolean(affixname+".enabled")) {
                try {
                    ItemStack icon = new ItemStack(Material.getMaterial(config.getString(affixiconString)), 1);
                    meta = icon.getItemMeta();
                    meta.setLocalizedName(affixnameString);
                    meta.setLore(Collections.singletonList(affixdescString));
                    meta.addEnchant(Enchantment.BINDING_CURSE,1,true);
                    meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                    icon.setItemMeta(meta);
                    EnderAffix double_or_nothing = new EnderAffix(affixnameString,affixdescString,icon);
                    EnderAffixes.getAffixManager().addMajorAffix(double_or_nothing);
                } catch (NullPointerException e) {
                    logger.severe("Error loading affix "+s);
                }

            }
        }
        logger.info("Finished initializing major affixes.");

        logger.info("Starting initializing minor affixes...");
        for (String s : allMinorAffixes) {
            affixname = "affixes.major."+s+".";
            affixnameString = affixname+"friendly-name";
            affixdescString = affixname+"description";
            affixiconString = affixname+"icon";
            try {
                ItemStack icon = new ItemStack(Material.getMaterial(config.getString(affixiconString)), 1);
                meta = icon.getItemMeta();
                meta.setLocalizedName(affixnameString);
                meta.setLore(Collections.singletonList(affixdescString));
                meta.addEnchant(Enchantment.BINDING_CURSE,1,true);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                icon.setItemMeta(meta);
                EnderAffix double_or_nothing = new EnderAffix(affixnameString,affixdescString,icon);
                EnderAffixes.getAffixManager().addMinorAffix(double_or_nothing);
            } catch (NullPointerException e) {
                logger.severe("Error loading affix "+s);
            }
        }
        logger.info("Finished initializing minor affixes.");
    }

}
