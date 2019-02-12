/*
 *
 *  * Copyright (c) 2018 Rosberry. All rights reserved.
 *
 */

package com.rosberry.abstractrecycler;

import java.util.Objects;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

/**
 * @author Alexei Korshun on 12/02/2019.
 */
public abstract class AbstractItem {

    private final int type;

    public AbstractItem(@LayoutRes Integer type) {
        this.type = type;
    }

    @LayoutRes
    public int getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractItem that = (AbstractItem) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @NonNull
    @Override
    public String toString() {
        return "AbstractItem{" +
                "type=" + type +
                '}';
    }
}
