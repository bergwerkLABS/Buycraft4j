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
package de.bergwerklabs.buycraft4j

import de.bergwerklabs.buycraft4j.wrapper.command.OfflineCommandList
import de.bergwerklabs.buycraft4j.wrapper.command.OnlineCommandList
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

/**
 * Created by Yannic Rieger on 12.01.2018.
 *
 * Class providing easy access to the Buycraft REST API.
 *
 * @param secret Buycraft shop secret
 * @author Yannic Rieger
 */
class BuycraftClient(private val secret: String) {
    
    private val header by lazy {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON
        headers.set("X-Buycraft-Secret", secret)
        headers
    }
    
    /**
     * Returns general information about the authenticated account and server.
     */
    fun getInformation() {
    
    }
    
    /**
     * List the players who have commands due to be executed when they next login to the Minecraft Server.
     * This endpoint also returns if there are any offline commands to be processed and the amount
     * of seconds to wait before performing the queue check again. All clients should strictly follow the response of next_check,
     * failure to do so would result in your secret key being revoked or IP address being banned from accessing the API.
     */
    fun getDuePlayers() {
    
    }
    
    /**
     * Get the offline commands which are due to be executed.
     * These commands should be executed immediately and no checks are required against the related players.
     */
    fun getOfflineCommands(): OfflineCommandList {
        return sendRequest(OFFLINE_COMMANDS_ENDPOINT, HttpMethod.GET, this.header, OfflineCommandList::class.java)
    }
    
    /**
     * List the due online commands for a specific player.
     * These commands should only be executed when the player is online and all
     * conditions have been met (such as if the player has the required amount of inventory slots).
     */
    fun getOnlineCommands(): OnlineCommandList {
    
    }
    
    /**
     * Delete one or more commands which have been executed on the Minecraft Server.
     * An empty response consisting of a 204 No Content status code will be returned on completion.
     */
    fun deleteCommand(vararg ids: Int) {
    
    }
    
    /**
     * Get the categories and packages which should be displayed to players in game.
     * The returned order of this endpoint does not reflect the desired order of the category/packages -
     * please order based on the order object.
     */
    fun listCategoriesAndPackages() {
    
    }
    
    /**
     * Get the recent payments for displaying on in-game payment signs.
     * A limit parameter can be specified to restrict the amount of payments returned.
     * Please note that no more than 100 latest payments will be returned.
     */
    fun listPlayments() {
    
    }
    
    /**
     * Get the required fields for any package by ID.
     * An array of all the fields required will be returned - for a payment creation to succeed,
     * a value must be set for each field.
     */
    fun getRequiredPaymentFields() {
    
    }
    
    /**
     * Create a manual payment in the same way as is possible from the control panel.
     * One or more packages should be added to the payment, and the package commands will
     * be processed in the same way as would be for a standard manual payment.
     */
    fun createManualPayment() {
    
    }
    
    /**
     * Update the status of a manual payment.
     */
    fun changePaymentStatus() {
    
    }
    
    /**
     * Creates a URL which will redirect the player to the webstore and add the package to their basket.
     */
    fun checkout() {
    
    }
    
    /**
     * Returns an array of all gift cards on your account.
     */
    fun listGiftCars() {
    
    }
    
    /**
     * Create a gift card of a specified amount.
     */
    fun createGiftCard() {
    
    }
    
    /**
     * View a gift card by its ID.
     */
    fun getGiftCard() {
    
    }
    
    /**
     * Credit an existing gift card with the specified amount.
     */
    fun topUpGiftCard() {
    
    }
    
    /**
     * Void a gift card to prevent it from being used.
     */
    fun voidGiftCard() {
    
    }
    
    /**
     * Returns an array of all coupons on your account.
     */
    fun listCoupons() {
    
    }
    
    /**
     * View a coupon by its ID.
     */
    fun getCoupon() {
    
    }
    
    /**
     * Create a coupon code.
     */
    fun createCoupon() {
    
    }
    
    /**
     * Delete a coupon code.
     * Returns 204 No Content if coupon has been deleted.
     */
    fun deleteCoupon() {
    
    }
    
    /**
     * Returns an array of all bans on your account.
     */
    fun listBans() {
    
    }
    
    /**
     * Create a ban against the specified player (and optionally IP).
     */
    fun createBan() {
    
    }
}