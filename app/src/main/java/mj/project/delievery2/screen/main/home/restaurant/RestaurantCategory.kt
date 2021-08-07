package mj.project.delievery2.screen.main.home.restaurant

import androidx.annotation.StringRes
import mj.project.delievery2.R

enum class RestaurantCategory(
    @StringRes val categoryNameId: Int,
    @StringRes val categoryTypeId: Int
) {
    ALL(R.string.all, R.string.all_type)
}
