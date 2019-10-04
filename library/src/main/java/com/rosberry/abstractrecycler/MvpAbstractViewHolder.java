/*
 *
 *  * Copyright (c) 2018 Rosberry. All rights reserved.
 *
 */

package com.rosberry.abstractrecycler;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import moxy.MvpDelegate;

/**
 * @author Alexei Korshun on 2019-10-04.
 */
public class MvpAbstractViewHolder<ITEM extends AbstractItem> extends AbstractViewHolder<ITEM> {

    private final MvpDelegate parentDelegate;

    private MvpDelegate<MvpAbstractViewHolder> mvpDelegate = null;

    public MvpAbstractViewHolder(@NonNull View itemView, @NonNull MvpDelegate parentDelegate) {
        super(itemView);
        this.parentDelegate = parentDelegate;
    }

    @Override
    public void bind(@NonNull ITEM item) {
        if (mvpDelegate != null) {
            mvpDelegate.onSaveInstanceState();
            mvpDelegate.onDetach();
            mvpDelegate = null;
        }

        super.bind(item);
        if (getMvpDelegate() != null) {
            getMvpDelegate().onCreate();
            getMvpDelegate().onAttach();
            getMvpDelegate().onSaveInstanceState();
        }
    }

    @Nullable
    protected MvpDelegate getMvpDelegate() {
        if (mvpDelegate == null) {
            MvpDelegate delegate = new MvpDelegate<MvpAbstractViewHolder>(this);
            delegate.setParentDelegate(parentDelegate, String.valueOf(getAdapterPosition()));
            mvpDelegate = delegate;
        }

        return mvpDelegate;
    }
}
