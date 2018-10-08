package com.rosberry.abstractrecycler

import android.support.v7.util.DiffUtil

/**
 * @author Alexei Korshun on 08/10/2018.
 */
class DefaultDiffCallback(
        private val oldItems: List<AbstractItem>,
        private val newItems: List<AbstractItem>
) : DiffUtil.Callback() {

    override fun areItemsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        val oldItem = oldItems[oldPosition]
        val newItem = newItems[newPosition]

        return oldItem == newItem
    }

    override fun getOldListSize(): Int = oldItems.size

    override fun getNewListSize(): Int = newItems.size

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        val oldItem = oldItems[oldPosition]
        val newItem = newItems[newPosition]

        return oldItem == newItem
    }

}