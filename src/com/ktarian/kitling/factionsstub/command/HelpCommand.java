package com.ktarian.kitling.factionsstub.command;
 
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.spec.CommandSpec;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;
import org.spongepowered.api.util.command.args.CommandContext;
import org.spongepowered.api.util.command.spec.CommandExecutor;
 
public class HelpCommand implements CommandExecutor {
   
  public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
    src.sendMessage(Texts.of("Help Stub."));
    return CommandResult.success()
  }
   
  public CommandSpec init() {
    return new CommandSpec.builder()
      .description(Texts.of("Factions Help."))
      .permission("factions.help")
      .executor(this)
      .build();
  }
}
