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

import de.bergwerklabs.buycraft4j.wrapper.Player

/**
 * Created by Yannic Rieger on 10.01.2018.
 *
 * Represents a command that should be executed in Minecraft. Wraps Command JSON object.
 *
 * @author Yannic Rieger
 */
class Command(val id: Int,
              val command: String,
              val payment: Int,
              val conditions: Conditions,
        // Make optional so we don't have to create 2 subclasses
              val player: Player = Player(-1, "null", "null")
)