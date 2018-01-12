/**
 * MIT License
 * Copyright (c) 2018 Yannic Rieger
 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.bergwerklabs.buycraft4j.wrapper.command

import de.bergwerklabs.buycraft4j.wrapper.Meta
import java.util.*

/**
 * Created by Yannic Rieger on 10.01.2018.
 *
 * List of commands to be executed.
 *
 * @author Yannic Rieger
 */
data class CommandList(val meta: Meta, val commands: Array<Command>) {
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        
        other as CommandList
        
        if (meta != other.meta) return false
        if (!Arrays.equals(commands, other.commands)) return false
        
        return true
    }
    
    override fun hashCode() = Objects.hash(this.meta, *this.commands)
}