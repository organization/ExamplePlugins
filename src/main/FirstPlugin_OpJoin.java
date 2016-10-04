package aaa;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerAchievementAwardedEvent;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

class FirstPlugin_OpJoin extends PluginBase implements Listener {
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info("FirstPlugin 활성화");
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		/* 접속한 플레이어가 오피인지 확인 */
		if (event.getPlayer().isOp()) {
			/*관리자가 접속함을 알림*/
			this.getServer().broadcastMessage(TextFormat.GOLD + "관리진" + TextFormat.WHITE + event.getPlayer().getName()
					+ TextFormat.YELLOW + " 님이 접속하셨습니다");
		}

	}

	@Override
	public void onDisable() {
		this.getLogger().info("FirstPlugin 비활성화");
		super.onDisable();
	}

}
