package mj.project.delievery2.screen.main.my

import mj.project.delievery2.databinding.FragmentMyBinding
import mj.project.delievery2.screen.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class MyFragment: BaseFragment<MyViewModel, FragmentMyBinding>() {
    override val viewModel by viewModel<MyViewModel>()

    override fun getViewBinding(): FragmentMyBinding = FragmentMyBinding.inflate(layoutInflater)

    override fun observeData() {

    }

    companion object {
        const val TAG = "MyFragment"
        fun newInstance() = MyFragment()
    }

}