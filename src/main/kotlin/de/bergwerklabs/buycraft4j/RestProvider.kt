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

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestTemplate

internal val restTemplate = RestTemplate()

internal val ACCOUNT_INFORMATION_ENDPOINT   = "https://plugin.buycraft4j.net/information"
internal val DUE_PLAYERS_ENDPOINT           = "https://plugin.buycraft4j.net/queue"
internal val OFFLINE_COMMANDS_ENDPOINT      = "https://plugin.buycraft4j.net/queue/offline-commands"
internal val ONLINE_COMMANDS_ENDPOINT       = "https://plugin.buycraft4j.net/queue/online-commands/{playerId}"
internal val LISTING_ENDPOINT               = "https://plugin.buycraft4j.net/listing"
internal val PAYMENTS_ENDPOINT              = "https://plugin.buycraft4j.net/payments"
internal val ALL_PAYMENT_FIELDS_ENDPOINT    = "https://plugin.buycraft4j.net/payments/fields/{id}"
internal val CHANGE_PAYMENT_STATUS_ENDPOINT = "https://plugin.buycraft4j.net/payments/{transactionId}"
internal val CHECKOUT_ENDPOINT              = "https://plugin.buycraft4j.net/checkout"
internal val GIFT_CARDS_ENDPOINT            = "https://plugin.buycraft4j.net/gift-cards"
internal val EDIT_GIFT_CARD_ENDPOINT        = "https://plugin.buycraft4j.net/gift-cards/{id}"
internal val COUPONS_ENDPOINT               = "https://plugin.buycraft4j.net/coupons"
internal val EDIT_COUPONS_ENDPOINT          = "https://plugin.buycraft4j.net/coupons/{id}"
internal val BANS_ENDPOINT                  = "https://plugin.buycraft4j.net/bans"

internal fun <T> sendRequest(url: String, method: HttpMethod, headers: HttpHeaders, clazz: Class<T>, body: Any? = null): T {
    val entity = if (body == null) HttpEntity<String>(headers) else HttpEntity(body)
    
    try {
        return restTemplate.exchange<T>(url, method, entity, clazz).body!!
    }
    catch (ex: HttpClientErrorException) {
        throw jacksonObjectMapper().readValue(ex.responseBodyAsString, BuycraftException::class.java)
    }
}