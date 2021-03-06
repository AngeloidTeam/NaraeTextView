package com.github.windsekirun.naraetextview;

import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

import com.github.windsekirun.naraetextview.util.Range;

public class ClickableLinkSpan extends ClickableSpan {

    private Clickable clickable;
    private Range mRange;

    public ClickableLinkSpan(Clickable link, Range range) {
        this.clickable = link;
        this.mRange = range;
    }

    @Override
    public void onClick(View widget) {
        TextView tv = (TextView) widget;
        Spanned s = (Spanned) tv.getText();

        if (clickable.getLinkClickListener() != null) {
            clickable.getLinkClickListener().onClick(s.subSequence(mRange.start, mRange.end).toString());
        }
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public void updateDrawState(TextPaint ds) {
        if (clickable.getTextColor() != 0) {
            ds.setColor(clickable.getTextColor());
        }
        ds.setUnderlineText(false);
    }
}