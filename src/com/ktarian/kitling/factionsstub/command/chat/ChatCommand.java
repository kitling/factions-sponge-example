package com.ktarian.kitling.factionsstub.command.chat;
 
import org.spongepowered.api.text.Texts;
import org.spongepowered.api.util.command.spec.CommandSpec;
import org.spongepowered.api.util.command.CommandException;
import org.spongepowered.api.util.command.CommandResult;
import org.spongepowered.api.util.command.CommandSource;
import org.spongepowered.api.util.command.args.CommandContext;
import org.spongepowered.api.util.command.spec.CommandExecutor;

import com.ktarian.kitling.factionsstub.command.chat.GlobalChatCommand;
import com.ktarian.kitling.factionsstub.command.chat.AlliedChatCommand;
import com.ktarian.kitling.factionsstub.command.chat.FactionChatCommand;

public class ChatCommand implements CommandExecutor {
   
  public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
    src.sendMessage(Texts.of("Chat Stub."));
    // Stub. Need to rotate between calling the subcommands here.
    return CommandResult.success()
  }
   
  public CommandSpec init() {
    CommandSpec cmdGlobalChat = new GlobalChatCommand().init();
    CommandSpec cmdAlliedChat = new AlliedChatCommand().init();
    CommandSpec cmdFactionChat = new FactionChatCommand().init();
     
    return new CommandSpec.builder()
      .description(Texts.of("Factions chat mode switcher."))
      .permission("factions.chat")
      .executor(this)
      .child(cmdGlobalChat, "global", "g")
      .child(cmdAlliedChat, "allied", "a")
      .child(cmdFactionChat, "faction", "f")
      .build();
  }
}
