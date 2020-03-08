package de.westnordost.streetcomplete.data.achievements

data class Link(val id: String,
                val url: String,
                val title: String,
                val category: LinkCategory,
                val icon: Int? = null,
                val description: Int? = null)

enum class LinkCategory {
    INTRO,
    EDITORS,
    SHOWCASE,
    GOODIES
}
