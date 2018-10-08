package com.rosberry.abstractrecycler

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * @author Alexei Korshun on 20/04/2018.
 */
abstract class AbstractViewHolder<in ITEM : AbstractItem>(view: View) : RecyclerView.ViewHolder(view) {

    open fun bind(item: ITEM) {}
}