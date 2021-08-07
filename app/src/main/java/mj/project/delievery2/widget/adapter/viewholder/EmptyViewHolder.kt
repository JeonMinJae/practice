package mj.project.delievery2.widget.adapter.viewholder

import mj.project.delievery2.databinding.ViewholderEmptyBinding
import mj.project.delievery2.model.Model
import mj.project.delievery2.screen.base.BaseViewModel
import mj.project.delievery2.util.provider.ResourcesProvider
import mj.project.delievery2.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<Model>(binding, viewModel, resourcesProvider) {
    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener) = Unit
}