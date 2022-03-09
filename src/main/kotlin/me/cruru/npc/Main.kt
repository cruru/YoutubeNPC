package me.cruru.npc

import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {

    override fun onEnable() {
        getCommand("npc")!!.setExecutor(NpcCommand())
    }

}