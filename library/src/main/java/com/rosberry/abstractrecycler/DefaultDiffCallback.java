/*
 *
 *  * Copyright (c) 2018 Rosberry. All rights reserved.
 *
 */

package com.rosberry.abstractrecycler;

import java.util.List;

import androidx.recyclerview.widget.DiffUtil;

/**
 * @author Alexei Korshun on 12/02/2019.
 */
public final class DefaultDiffCallback extends DiffUtil.Callback {

    private final List<? extends AbstractItem> oldItems;
    private final List<? extends AbstractItem> newItems;

    public DefaultDiffCallback(List<? extends AbstractItem> oldItems, List<? extends AbstractItem> newItems) {
        this.oldItems = oldItems;
        this.newItems = newItems;
    }

    @Override
    public int getOldListSize() {
        return oldItems.size();
    }

    @Override
    public int getNewListSize() {
        return newItems.size();
    }

    @Override
    public boolean areItemsTheSame(int oldPosition, int newPosition) {
        AbstractItem oldItem = oldItems.get(oldPosition);
        AbstractItem newItem = newItems.get(newPosition);
        return oldItem.equals(newItem);
    }

    @Override
    public boolean areContentsTheSame(int oldPosition, int newPosition) {
        AbstractItem oldItem = oldItems.get(oldPosition);
        AbstractItem newItem = newItems.get(newPosition);
        return oldItem.equals(newItem);
    }
}
