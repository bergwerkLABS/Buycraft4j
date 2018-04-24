package de.bergwerklabs.buycraft4j.wrapper

/**
 * Created by Yannic Rieger on 14.01.2018.
 *
 * Metadata that will be sent when requesting due players.
 *
 * @author Yannic Rieger
 */
data class DuePlayersMeta(
        @JsonProperty("execute_offline") val executeOffline: Boolean,
        @JsonProperty("next_check") val nextCheck: Int,
        val more: Boolean
)