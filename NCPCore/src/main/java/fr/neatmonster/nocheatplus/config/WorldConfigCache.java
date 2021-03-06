package fr.neatmonster.nocheatplus.config;

import org.bukkit.World;

/**
 * World-specific cache for configurations. World names are used as keys, convenience methods are added.
 * @author web4web1
 *
 * @param <C>
 */
public abstract class WorldConfigCache<C> extends ConfigCache<String, C> {

    public WorldConfigCache(boolean cow) {
        this(cow, 10);
    }

    public WorldConfigCache(boolean cow, int initialCapacity) {
        super(cow, initialCapacity);
    }

    public C getConfig(final World world) {
        return getConfig(world.getName());
    }

    @Override
    protected C newConfig(final String key) {
        return newConfig(key, ConfigManager.getConfigFile(key));
    }

    protected abstract C newConfig(String key, ConfigFile configFile);

}
