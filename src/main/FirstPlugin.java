package main;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;

class FirstPlugin extends PluginBase implements Listener{
	@Override
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info("FirstPlugin 활성화");
	}
	@Override
	public void onDisable(){
		this.getLogger().info("FirstPlugin 비활성화");
		super.onDisable();
	}
}
