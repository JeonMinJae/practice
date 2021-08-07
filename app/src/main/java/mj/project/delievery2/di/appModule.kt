package mj.project.delievery2.di

import kotlinx.coroutines.Dispatchers
import mj.project.delievery2.data.repository.DefaultRestaurantRepository
import mj.project.delievery2.data.repository.RestaurantRepository
import mj.project.delievery2.screen.main.home.HomeViewModel
import mj.project.delievery2.screen.main.home.restaurant.RestaurantCategory
import mj.project.delievery2.screen.main.home.restaurant.RestaurantListViewModel
import mj.project.delievery2.screen.main.my.MyViewModel
import mj.project.delievery2.util.provider.DefaultResourcesProvider
import mj.project.delievery2.util.provider.ResourcesProvider
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    //ViewModel
    viewModel { HomeViewModel() }
    viewModel { MyViewModel() }
    viewModel { (restaurantCategory : RestaurantCategory) -> RestaurantListViewModel(restaurantCategory,get()) }


    // Repository
    single<RestaurantRepository> { DefaultRestaurantRepository(get(),get()) }

    // ProvideAPI
    single { provideRetrofit(get(),get()) }
    single { provideGsonConverterFactory() }
    single { buildOkHttpClient() }

    // ResourcesProvider
    single<ResourcesProvider> { DefaultResourcesProvider(androidApplication()) }

    // 코루틴
    single { Dispatchers.IO }
    single { Dispatchers.Main }


}
