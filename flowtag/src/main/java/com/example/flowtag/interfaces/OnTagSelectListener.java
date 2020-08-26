package com.example.flowtag.interfaces;

import com.example.flowtag.flow.FlowTagLayout;

import java.util.List;

/**
 * Author : wxz
 * Time   : 2020/03/26
 * Desc   :
 */
public interface OnTagSelectListener {
    void onItemSelect(FlowTagLayout parent, List<Integer> selectedList);
}
