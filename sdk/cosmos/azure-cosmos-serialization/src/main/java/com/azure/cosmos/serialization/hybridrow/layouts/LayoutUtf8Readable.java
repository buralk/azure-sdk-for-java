// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.serialization.hybridrow.layouts;

import com.azure.cosmos.serialization.hybridrow.Result;
import com.azure.cosmos.serialization.hybridrow.RowBuffer;
import com.azure.cosmos.serialization.hybridrow.RowCursor;
import com.azure.cosmos.core.Out;
import com.azure.cosmos.core.Utf8String;

import javax.annotation.Nonnull;

/**
 * An optional interface that indicates a {@link LayoutType} can also be read as a {@link Utf8String}.
 */
public interface LayoutUtf8Readable extends ILayoutType {

    @Nonnull
    Result readFixedSpan(RowBuffer buffer, RowCursor scope, LayoutColumn column, Out<Utf8String> value);

    @Nonnull
    Result readSparseSpan(RowBuffer buffer, RowCursor scope, Out<Utf8String> value);

    @Nonnull
    Result readVariableSpan(RowBuffer buffer, RowCursor scope, LayoutColumn column, Out<Utf8String> value);
}