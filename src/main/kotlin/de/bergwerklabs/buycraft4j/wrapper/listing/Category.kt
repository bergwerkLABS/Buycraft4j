package de.bergwerklabs.buycraft4j.wrapper.listing

import com.fasterxml.jackson.annotation.JsonProperty

data class Category(
        val id: Int,
        val order: Int,
        val name: String,
        @JsonProperty("only_subcategories") val onlySubcategories: Boolean,
        @JsonProperty("subcategories") val subCategories: Array<Category>
)