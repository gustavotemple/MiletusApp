/*
 * The MIT License (MIT)
 * Copyright (c) 2016 Gustavo Frederico Temple Pedrosa -- gustavof@motorola.com
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.moto.miletus.application.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.moto.miletus.application.OnRunCommandListener;
import com.moto.miletus.wrappers.CommandWrapper;

/**
 * ViewHolderEditValue
 */
abstract class ViewHolderEditValue extends RecyclerView.ViewHolder {

    private final TextView textView;
    private final Button button;

    ViewHolderEditValue(final View parentView,
                        final TextView textView,
                        final Button button,
                        final CommandWrapper command,
                        final OnRunCommandListener runCommandListener) {
        super(parentView);
        this.textView = textView;
        this.button = button;
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(v, command, runCommandListener);
            }
        });
    }

    /**
     * getTextView
     *
     * @return TextView
     */
    public TextView getTextView() {
        return textView;
    }

    /**
     * getButton
     *
     * @return Button
     */

    public Button getButton() {
        return button;
    }

    /**
     * showDialog
     *
     * @param v                  View
     * @param command            CommandWrapper
     * @param runCommandListener OnRunCommandListener
     */
    protected abstract void showDialog(final View v,
                                       final CommandWrapper command,
                                       final OnRunCommandListener runCommandListener);
}
