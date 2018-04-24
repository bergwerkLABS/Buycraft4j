package de.bergwerklabs.buycraft4j.wrapper

import java.util.*

/**
 * Created by Yannic Rieger on 14.01.2018.
 * <p>
 * @author Yannic Rieger
 */
data class Payment(@JsonProperty("ign") val userName: String, val price: Int, val packages: Array<Package>) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Payment

        if (userName != other.userName) return false
        if (!Arrays.equals(packages, other.packages)) return false

        return true
    }

    override fun hashCode() = Objects.hash(userName, price, packages)
}