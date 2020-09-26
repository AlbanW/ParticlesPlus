package fr.albanw.ParticlePlus.particles.wings;

import cn.nukkit.Player;
import cn.nukkit.level.Position;
import cn.nukkit.level.particle.FlameParticle;
import cn.nukkit.math.BlockFace;
import fr.albanw.ParticlePlus.particles.Particles;

public class FireWings implements Particles {

    public void sendParticle(Player p) {
        Position pPos = p.getPosition().add(0, 1.2, 0);
        switch (p.getDirection().getIndex()) {
            case 0:
                Position pos;
                pos = pPos.add(-0.5, 1.4, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 1.4, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 1.2, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 1.2, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 1.2, 1);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 1.2, -1);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 1, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 1, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 1, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 1, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 1, 1);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 1, -1);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 1, 1.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 1, -1.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.8, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.8, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.8, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.8, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.8, 1);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.8, -1);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.8, 1.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.8, -1.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.6, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.6, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.6, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.6, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.6, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.6, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.6, 1);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.6, -1);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.4, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.4, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.4, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.4, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.4, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.4, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.4, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.4, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.2, 0);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.2, -0);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.2, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.2, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.2, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.2, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0.2, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0.2, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0, 0);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0, -0);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, 0, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, 0, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.2, 0);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.2, -0);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.2, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.2, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.4, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.4, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.4, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.4, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.6, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.6, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.6, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.6, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.6, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.6, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.8, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.8, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -0.8, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -0.8, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(-0.5, -1, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.5, -1, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                break;
            case 1:
                pos = pPos.add(0.8, 1.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 1.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 1.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 1.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1, 1.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1, 1.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1, 1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1, 1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1.2, 1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1.2, 1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1, 0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1, 0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1.2, 0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1.2, 0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, 0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, 0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1, 0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1, 0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, 0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, 0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, 0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, 0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0, 0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0, 0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, 0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, 0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, 0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, 0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0, 0, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0, 0, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, 0, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, 0, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, 0, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, 0, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0, -0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0, -0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, -0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, -0.2, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, -0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, -0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, -0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, -0.4, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, -0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, -0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, -0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, -0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, -0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, -0.6, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, -0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, -0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, -0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, -0.8, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, -1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, -1, -0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                break;
            case 2:
                pos = pPos.add(0.5, 1.4, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 1.4, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 1.2, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 1.2, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 1.2, 1);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 1.2, -1);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 1, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 1, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 1, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 1, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 1, 1);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 1, -1);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 1, 1.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 1, -1.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.8, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.8, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.8, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.8, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.8, 1);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.8, -1);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.8, 1.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.8, -1.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.6, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.6, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.6, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.6, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.6, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.6, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.6, 1);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.6, -1);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.4, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.4, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.4, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.4, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.4, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.4, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.4, 0.8);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.4, -0.8);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.2, 0);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.2, -0);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.2, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.2, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.2, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.2, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0.2, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0.2, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0, 0);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0, -0);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, 0, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, 0, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.2, 0);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.2, -0);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.2, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.2, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.4, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.4, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.4, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.4, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.6, 0.2);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.6, -0.2);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.6, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.6, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.6, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.6, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.8, 0.4);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.8, -0.4);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -0.8, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -0.8, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.5, -1, 0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(0.5, -1, -0.6);
                p.getLevel().addParticle(new FlameParticle(pos));
                break;
            case 3:
                pos = pPos.add(0.8, 1.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 1.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 1.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 1.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1, 1.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1, 1.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1, 1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1, 1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1.2, 1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1.2, 1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1, 0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1, 0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1.2, 0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1.2, 0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, 0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, 0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(1, 0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-1, 0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, 0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, 0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, 0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, 0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.8, 0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.8, 0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0, 0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0, 0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, 0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, 0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, 0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, 0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, 0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, 0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0, 0, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0, 0, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, 0, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, 0, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, 0, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, 0, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0, -0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0, -0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, -0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, -0.2, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, -0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, -0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, -0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, -0.4, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.2, -0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.2, -0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, -0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, -0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, -0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, -0.6, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.4, -0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.4, -0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, -0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, -0.8, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));

                pos = pPos.add(0.6, -1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                pos = pPos.add(-0.6, -1, 0.5);
                p.getLevel().addParticle(new FlameParticle(pos));
                break;
            default: break;
        }
    }

}
