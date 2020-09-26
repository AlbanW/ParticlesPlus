package fr.albanw.ParticlePlus.commands;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.PluginCommand;
import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.plugin.Plugin;
import fr.albanw.ParticlePlus.Main;

public class ParticlesCommand extends PluginCommand {

    public ParticlesCommand() {
        super("particle", Main.getMain());
        this.setAliases(new String[] {
                "particles", "particlemenu", "particlesmenu"
        });
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        FormWindowSimple form = new FormWindowSimple("ParticlesPlus", "");

        form.addButton(new ElementButton("Fire Wings"));
        form.addButton(new ElementButton("Heart Wings"));
        form.addButton(new ElementButton("Fire Circle"));
        form.addButton(new ElementButton("Heart Circle"));

        if(sender.isPlayer())
            ((Player) sender).showFormWindow(form);
        return false;
    }
}
