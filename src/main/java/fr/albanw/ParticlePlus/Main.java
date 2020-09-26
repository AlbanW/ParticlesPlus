package fr.albanw.ParticlePlus;

import cn.nukkit.Player;
import cn.nukkit.command.defaults.ParticleCommand;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
import fr.albanw.ParticlePlus.clock.Global;
import fr.albanw.ParticlePlus.commands.ParticlesCommand;
import fr.albanw.ParticlePlus.particles.Particles;
import fr.albanw.ParticlePlus.particles.wings.FireWings;

import java.util.HashMap;

public class Main extends PluginBase {

    public static Main main;
    public String prefix = TextFormat.BLACK + "["+TextFormat.YELLOW+"Particles+"+TextFormat.BLACK+"]";
    public HashMap<Player, Particles> particlesMap;

    @Override
    public void onEnable() {
        main = this;
        particlesMap = new HashMap<Player, Particles>();
        getServer().getCommandMap().register("particle", new ParticlesCommand());
        getServer().getScheduler().scheduleRepeatingTask(new Global(), 20);
    }

    /**
     * Retourne une instance unique de la class Main.
     * @return Main
     */
    public static Main getMain() {
        return main;
    }
}
