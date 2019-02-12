/*
 *
 *  * Copyright (c) 2018 Rosberry. All rights reserved.
 *
 */

package com.rosberry.abstractrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author Alexei Korshun on 12/02/2019.
 */
public abstract class AbstractRecyclerAdapter extends RecyclerView.Adapter<AbstractViewHolder<AbstractItem>> {

    protected List<? extends AbstractItem> items;

    public AbstractRecyclerAdapter(List<? extends AbstractItem> items) {
        this.items = items;
    }

    public abstract AbstractViewHolder<? extends AbstractItem> createHolder(View view, int viewType);

    @NonNull
    @Override
    public AbstractViewHolder<AbstractItem> onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(viewType, viewGroup, false);
        return (AbstractViewHolder<AbstractItem>) createHolder(view, viewType);
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
