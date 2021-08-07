package mj.project.delievery2.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import mj.project.delievery2.screen.main.home.restaurant.RestaurantCategory

@Parcelize // 번들이나 인텐트로 넘겨서 처리하려고 사용
data class RestaurantEntity(
    override val id: Long, // model의 고유 아이디값
    val restaurantInfoId: Long, //api 호출용
    val restaurantCategory: RestaurantCategory, //뷰페이지 탭들
    val restaurantTitle: String,
    val restaurantImageUrl: String,
    val grade: Float,
    val reviewCount: Int,
    val deliveryTimeRange: Pair<Int, Int>,
    val deliveryTipRange: Pair<Int, Int>

): Entity, Parcelable
