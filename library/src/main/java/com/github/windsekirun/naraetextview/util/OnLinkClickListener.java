package com.github.windsekirun.naraetextview.util;

/**
 * NaraeTextView
 * class: OnLinkClickListener
 * Created by WindSekirun on 15. 8. 5..
 */
public interface OnLinkClickListener {

    void onClick(String text);
    
    /**
     * @params text: out text
     * return boolean: if true, execute onCLick after onLongClick.
     */
    boolean onLongClick(String text);
}
