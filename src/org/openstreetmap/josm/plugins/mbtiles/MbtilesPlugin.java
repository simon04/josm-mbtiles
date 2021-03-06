package org.openstreetmap.josm.plugins.mbtiles;

import org.openstreetmap.josm.actions.ExtensionFileFilter;
import org.openstreetmap.josm.gui.preferences.PreferenceSetting;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

/**
 * Main class for the mbtiles plugin.
 *
 * @author Ian Dees <ian.dees@gmail.com>
 *
 */
public class MbtilesPlugin extends Plugin
{
    public MbtilesPlugin(PluginInformation info)
    {
        super(info);
        ExtensionFileFilter.addImporter(new MbtilesFileImporter());
        ExtensionFileFilter.updateAllFormatsImporter();
    }
    
    @Override
    public PreferenceSetting getPreferenceSetting() {
      return new CacheExportPanel();
    }
}
