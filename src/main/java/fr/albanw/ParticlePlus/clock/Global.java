package fr.albanw.ParticlePlus.clock;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.scheduler.PluginTask;
import fr.albanw.ParticlePlus.Main;
import fr.albanw.ParticlePlus.particles.Particles;

public class Global extends PluginTask
{
    public Global() {
        super(Main.getMain());
    }

    public void onRun(int i) {

        for(Player p : Server.getInstance().getOnlinePlayers().values()) {
            if (Main.getMain().particlesMap.containsKey(p)) {
                Particles particles = Main.getMain().particlesMap.get(p);
                particles.sendParticle(p);
            }
        }

    }
}
