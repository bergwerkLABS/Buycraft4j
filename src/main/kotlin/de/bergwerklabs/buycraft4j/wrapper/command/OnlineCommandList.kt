package de.bergwerklabs.buycraft4j.wrapper.command

import java.util.*

/**
 * Created by Yannic Rieger on 14.01.2018.
 * <p>
 * @author Yannic Rieger
 */
data class OnlineCommandList(val commands: Array<Command>) {
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        
        other as OnlineCommandList
        
        if (!Arrays.equals(commands, other.commands)) return false
        
        return true
    }
    
    override fun hashCode() =  Arrays.hashCode(commands)
}