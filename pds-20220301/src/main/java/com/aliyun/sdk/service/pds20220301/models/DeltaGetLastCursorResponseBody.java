// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeltaGetLastCursorResponseBody} extends {@link TeaModel}
 *
 * <p>DeltaGetLastCursorResponseBody</p>
 */
public class DeltaGetLastCursorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cursor")
    private String cursor;

    private DeltaGetLastCursorResponseBody(Builder builder) {
        this.cursor = builder.cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeltaGetLastCursorResponseBody create() {
        return builder().build();
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    public static final class Builder {
        private String cursor; 

        /**
         * The latest cursor of incremental information in the specified drive or synced folder.
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public DeltaGetLastCursorResponseBody build() {
            return new DeltaGetLastCursorResponseBody(this);
        } 

    } 

}
