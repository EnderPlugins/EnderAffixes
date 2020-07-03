package eu.endermite.enderaffixes.affixes;

import java.util.ArrayList;
import java.util.List;

public class AffixManager {

    private List<EnderAffix> majorAffixList = new ArrayList<>();
    public List<EnderAffix> getMajorAffixList() {return majorAffixList;}

    private List<EnderAffix> minorAffixList = new ArrayList<>();
    public List<EnderAffix> getMinorAffixList() {return minorAffixList;}

    private List<EnderAffix> activeMajorAffixes = new ArrayList<>();
    public List<EnderAffix> getActiveMajorAffixes() {return  activeMajorAffixes;}

    private List<EnderAffix> activeMinorAffixes = new ArrayList<>();
    public List<EnderAffix> getActiveMinorAffixes() {return  activeMinorAffixes;}

    public void addMajorAffix(EnderAffix affix) {
        majorAffixList.add(affix);
    }
    public void addMinorAffix(EnderAffix affix) {
        minorAffixList.add(affix);
    }
    public void activateMajorAffix(EnderAffix affix) {
        activeMajorAffixes.add(affix);
    }
    public void activateMinorAffix(EnderAffix affix) {
        activeMinorAffixes.add(affix);
    }
    public void deactivateMajorAffix(EnderAffix affix) {
        activeMajorAffixes.remove(affix);
    }
    public void deactivateMinorAffix(EnderAffix affix) {
        activeMinorAffixes.remove(affix);
    }

}
