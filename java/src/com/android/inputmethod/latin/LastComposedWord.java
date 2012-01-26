/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.android.inputmethod.latin;

/**
 * This class encapsulates data about a word previously composed, but that has been
 * committed already. This is used for resuming suggestion, and cancel auto-correction.
 */
public class LastComposedWord {
    // COMMIT_TYPE_USER_TYPED_WORD is used when the word committed is the exact typed word, with
    // no hinting from the IME. It happens when some external event happens (rotating the device,
    // for example) or when auto-correction is off by settings or editor attributes.
    public static final int COMMIT_TYPE_USER_TYPED_WORD = 0;
    // COMMIT_TYPE_MANUAL_PICK is used when the user pressed a field in the suggestion strip.
    public static final int COMMIT_TYPE_MANUAL_PICK = 1;
    // COMMIT_TYPE_DECIDED_WORD is used when the IME commits the word it decided was best
    // for the current user input. It may be different from what the user typed (true auto-correct)
    // or it may be exactly what the user typed if it's in the dictionary or the IME does not have
    // enough confidence in any suggestion to auto-correct (auto-correct to typed word).
    public static final int COMMIT_TYPE_DECIDED_WORD = 2;
    // COMMIT_TYPE_CANCEL_AUTO_CORRECT is used upon committing back the old word upon cancelling
    // an auto-correction.
    public static final int COMMIT_TYPE_CANCEL_AUTO_CORRECT = 3;

    public final int mType;

    public LastComposedWord(final int type) {
        mType = type;
    }
}
