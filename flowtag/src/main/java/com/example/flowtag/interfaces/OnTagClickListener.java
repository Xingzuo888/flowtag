package com.example.flowtag.interfaces;

import android.view.View;

import com.example.flowtag.flow.FlowTagLayout;

/**
 * Author : wxz
 * Time   : 2020/03/26
 * Desc   :
 */
public interface OnTagClickListener {
    void onItemClick(FlowTagLayout parent, View view, int position);
}
