package mj.project.delievery2.widget.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import mj.project.delievery2.model.CellType
import mj.project.delievery2.model.Model
import mj.project.delievery2.screen.base.BaseViewModel
import mj.project.delievery2.util.mapper.ModelViewHolderMapper
import mj.project.delievery2.util.provider.ResourcesProvider
import mj.project.delievery2.widget.adapter.listener.AdapterListener
import mj.project.delievery2.widget.adapter.viewholder.ModelViewHolder

//모든 adapter의 base
class ModelRecyclerAdapter<M : Model, VM: BaseViewModel>(
    private var modelList: List<Model>,
    private var viewModel: VM,
    private val resourcesProvider: ResourcesProvider,
    private val adapterListener: AdapterListener
) : ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {

    override fun getItemCount(): Int = modelList.size

    override fun getItemViewType(position: Int): Int = modelList[position].type.ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder<M> {
        return ModelViewHolderMapper.map(parent, CellType.values()[viewType], viewModel, resourcesProvider)
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: ModelViewHolder<M>, position: Int) {
        with(holder) {
            bindData(modelList[position] as M)
            bindViews(modelList[position] as M, adapterListener)
        }
    }

    override fun submitList(list: List<Model>?) {
        list?.let { modelList = it }
        super.submitList(list)
    }
}
