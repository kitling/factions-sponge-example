package com.ktarian.kitling.factions.sponge.command;
 
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.spec.CommandSpec;
 
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;
import org.spongepowered.api.util.command.args.CommandContext;
import org.spongepowered.api.util.command.spec.CommandExecutor;
 
import com.ktarian.kitling.factionsstub.command.HelpCommand;
import com.ktarian.kitling.factionsstub.command.AuthorCommand;
import com.ktarian.kitling.factionsstub.command.chat.ChatCommand;
 
public class BaseCommand implements CommandExecutor {
   
  @Override
  public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
     
    return HelpCommand.execute(src, args);
     
  }
   
  public CommandSpec init() {
     
    CommandSpec helpCmd = new HelpCommand().init();
    CommandSpec authorCmd = new AuthorCommand().init();
    CommandSpec chatCmd = new ChatCommand().init();
     
    return new CommandSpec.builder()
      .description(Texts.of("Base Factions Command."))
      .permission("factions.base")
      .executor(this)
      .child(helpCmd, "help", "h", "?")
      .child(authorCmd, "author")
      .child(chatCmd, "chat", "c")
      .build()
  }
}
