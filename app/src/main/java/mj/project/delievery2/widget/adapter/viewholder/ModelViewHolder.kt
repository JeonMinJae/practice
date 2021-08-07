package mj.project.delievery2.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import mj.project.delievery2.model.Model
import mj.project.delievery2.screen.base.BaseViewModel
import mj.project.delievery2.util.provider.ResourcesProvider
import mj.project.delievery2.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M: Model>(
    binding: ViewBinding,
    protected val viewModel: BaseViewModel,
    protected val resourcesProvider: ResourcesProvider
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun reset()

    open fun bindData(model: M) {
        reset()
    }

    abstract fun bindViews(model: M, adapterListener: AdapterListener)

}
