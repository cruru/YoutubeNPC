package me.cruru.npc

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class NpcCommand: CommandExecutor{

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {

        if(sender is Player) {

            val player: Player = sender

            if(args.size == 1) {
                NPC.createNPC(player, args[0])
            }

        }

        return false
    }

}