
package io.sporkpgm.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AuthorCommands {
@Command(aliases = {"author","creador"}, desc = "Show thee author of the modification of SporkPGM", max = 0)
public static void author(CommandContext cmd, CommandSender sender) throws CommandException {
if(!(sender instanceof Player)) {
throw new CommandException("This command is for Players only");
}
sender.sendMessage(ChatColor.RED + "Creador:" + ChatColor.BLUE + "ElFlambMC(TheMikelRex)");
}
