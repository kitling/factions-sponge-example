package com.ktarian.kitling.factionsstub;
 
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.util.command.spec.CommandSpec;
import org.spongepowered.api.event.state.ServerStartedEvent;
import org.slf4j.Logger;
import org.spongepowered.api.text.Texts;
 
import org.spongepowered.api.util.event.Subscribe;
import com.google.inject.Inject;
 
import com.ktarian.kitling.factionsstub.command.BaseCommand;
 
@Plugin(id = "factionsstub", name = "Factions Stub", version = "alpha0")
class FactionsStub {
  @Inject
  private Logger logger;
   
  @Listener
  public void onServerStart(GameStartedServerEvent event) {
     
    CommandSpec base = new BaseCommand.init();
     
    game.getCommandDispatcher().register(plugin, base, "factions", "fac", "f");
  }
 
  @Listener
  public void onServerStop(GameStoppingServerEvent event) {
    //stub
  }
   
  public Logger getLogger() {
    return logger;
  }
}
