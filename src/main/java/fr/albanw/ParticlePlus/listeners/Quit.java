package fr.albanw.ParticlePlus.listeners;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.player.PlayerQuitEvent;
import cn.nukkit.level.Position;
import cn.nukkit.level.particle.FlameParticle;

public class Quit
{

    @EventHandler
    public void onQuit(PlayerQuitEvent e)
    {
        Player p = e.getPlayer();

    }
}
