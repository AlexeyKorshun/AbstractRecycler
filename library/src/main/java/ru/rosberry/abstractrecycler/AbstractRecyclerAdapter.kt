package ru.rossbery.abstractrecycler

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * @author Alexei Korshun on 20/04/2018.
 */
abstract class AbstractRecyclerAdapter(
        protected var items: List<AbstractItem>
) : RecyclerView.Adapter<AbstractViewHolder<AbstractItem>>() {

    abstract fun createViewHolder(view: View, viewType: Int): AbstractViewHolder<*>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbstractViewHolder<AbstractItem> {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return createViewHolder(view, viewType) as AbstractViewHolder<AbstractItem>
    }

    override fun onBindViewHolder(holder: AbstractViewHolder<AbstractItem>, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int) = items[position].type
}