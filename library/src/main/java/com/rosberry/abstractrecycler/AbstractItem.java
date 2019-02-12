/*
 *
 *  * Copyright (c) 2018 Rosberry. All rights reserved.
 *
 */

package com.rosberry.abstractrecycler;

import android.support.annotation.LayoutRes;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @author Alexei Korshun on 12/02/2019.
 */
public class AbstractItem {

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

    @NotNull
    @Override
    public String toString() {
        return "AbstractItem{" +
                "type=" + type +
                '}';
    }
}
