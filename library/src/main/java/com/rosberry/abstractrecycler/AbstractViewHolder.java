/*
 *
 *  * Copyright (c) 2018 Rosberry. All rights reserved.
 *
 */

package com.rosberry.abstractrecycler;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author Alexei Korshun on 12/02/2019.
 */
public class AbstractViewHolder<ITEM extends AbstractItem> extends RecyclerView.ViewHolder {

    public AbstractViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    protected void bind(@NonNull ITEM item) {
    }
}
