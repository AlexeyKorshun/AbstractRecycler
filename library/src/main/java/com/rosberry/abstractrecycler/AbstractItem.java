/*
 *
 *  * Copyright (c) 2018 Rosberry. All rights reserved.
 *
 */

package com.rosberry.abstractrecycler;

import android.support.annotation.LayoutRes;

/**
 * @author Alexei Korshun on 12/02/2019.
 */
public class AbstractItem {

    private final Integer type;

    public AbstractItem(@LayoutRes Integer type) {
        this.type = type;
    }

    @LayoutRes
    public Integer getType() {
        return type;
    }
}
