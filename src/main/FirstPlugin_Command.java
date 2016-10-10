package main;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;

public class FirstPlugin_Command extends PluginBase{
  
  @Override
  public void onEnable(){
    this.getLogger().info("FirstPlugin_Command Loaded");
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
    try{
      Position spawn = ((Player) sender).teleport(((Player) sender).getSpawn());
      return true;
    } catch(ClassCastException e){
      //이러한 경우에는 콘솔에서 친거인지 확인하세요.
      return false;
    }
    return true;
    
