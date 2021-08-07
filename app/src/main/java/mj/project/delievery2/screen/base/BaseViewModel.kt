package mj.project.delievery2.screen.base

import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

abstract class BaseViewModel: ViewModel() {

    protected var stateBundle: Bundle? = null

    //koin 라이브러리 사용
    open fun fetchData(): Job = viewModelScope.launch {  }

    open fun storeState(stateBundle: Bundle) {
        this.stateBundle = stateBundle

    }

}
