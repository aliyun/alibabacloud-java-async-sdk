// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link GetCursorResponseBody} extends {@link TeaModel}
 *
 * <p>GetCursorResponseBody</p>
 */
public class GetCursorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cursor")
    private String cursor;

    private GetCursorResponseBody(Builder builder) {
        this.cursor = builder.cursor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCursorResponseBody create() {
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
         * <p>The value of the cursor.</p>
         * 
         * <strong>example:</strong>
         * <p>MTQ0NzI5OTYwNjg5NjYzMjM1Ng==</p>
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public GetCursorResponseBody build() {
            return new GetCursorResponseBody(this);
        } 

    } 

}
