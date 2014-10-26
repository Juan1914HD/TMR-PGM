
package io.sporkpgm.commands;
import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.minecraft.util.commands.CommandException;
import com.sk89q.minecraft.util.commands.CommandPermissions;
import com.sk89q.minecraft.util.commands.NestedCommand;
import io.sporkpgm.map.SporkMap;
import io.sporkpgm.player.SporkPlayer;
import io.sporkpgm.team.SporkTeam;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AuthorCommands {
@Command(aliases = {"author","creador"}, desc = "Shows what team you are on", max = 0)
public static void myteam(CommandContext cmd, CommandSender sender) throws CommandException {
if(!(sender instanceof Player)) {
throw new CommandException("This command is for Players only");
}
SporkPlayer player = SporkPlayer.getPlayer((Player) sender);
SporkTeam team = player.getTeam();
sender.sendMessage(ChatColor.GRAY + "You are on " + team.getColoredName());
}
