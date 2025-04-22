// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    public static final class Builder {
        private String cursor; 

        private Builder() {
        } 

        private Builder(DeltaGetLastCursorResponseBody model) {
            this.cursor = model.cursor;
        } 

        /**
         * <p>The latest cursor of incremental information in the specified drive or synced folder.</p>
         * 
         * <strong>example:</strong>
         * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
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
