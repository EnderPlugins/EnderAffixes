package eu.endermite.enderaffixes;

import eu.endermite.enderaffixes.affixes.AffixManager;
import eu.endermite.enderaffixes.affixes.CreateAffixes;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderAffixes extends JavaPlugin {


    private static EnderAffixes plugin;
    public static EnderAffixes getPlugin() {return plugin;}
    private static AffixManager affixManager;
    public static AffixManager getAffixManager() {return affixManager;}

    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();
        plugin = this;
        affixManager = new AffixManager();

        CreateAffixes.create();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
