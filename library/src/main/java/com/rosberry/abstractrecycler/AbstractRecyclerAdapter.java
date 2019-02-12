/*
 *
 *  * Copyright (c) 2018 Rosberry. All rights reserved.
 *
 */

package com.rosberry.abstractrecycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author Alexei Korshun on 12/02/2019.
 */
public abstract class AbstractRecyclerAdapter extends RecyclerView.Adapter<AbstractViewHolder<AbstractItem>> {

    protected List<AbstractItem> items;

    public AbstractRecyclerAdapter(List<AbstractItem> items) {
        this.items = items;
    }

    abstract AbstractViewHolder<AbstractItem> createViewHolder();

    @NonNull
    @Override
    public AbstractViewHolder<AbstractItem> onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return createViewHolder();
    }

    @Override
    public void onBindViewHolder(@NonNull AbstractViewHolder<AbstractItem> viewHolder, int position) {
        viewHolder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }
}
