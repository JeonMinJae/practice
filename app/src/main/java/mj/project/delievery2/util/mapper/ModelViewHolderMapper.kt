package mj.project.delievery2.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import mj.project.delievery2.databinding.ViewholderEmptyBinding
import mj.project.delievery2.model.CellType
import mj.project.delievery2.model.Model
import mj.project.delievery2.screen.base.BaseViewModel
import mj.project.delievery2.util.provider.ResourcesProvider
import mj.project.delievery2.widget.adapter.viewholder.EmptyViewHolder
import mj.project.delievery2.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M: Model> map(
        parent: ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourcesProvider: ResourcesProvider
    ): ModelViewHolder<M> {
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when (type) {
            CellType.EMPTY_CELL -> EmptyViewHolder(
                    ViewholderEmptyBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
            )
        }

        return viewHolder as ModelViewHolder<M>
    }

}
