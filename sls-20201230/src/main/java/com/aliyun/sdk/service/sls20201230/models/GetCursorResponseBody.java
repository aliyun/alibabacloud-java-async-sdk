// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetCursorResponseBody} extends {@link TeaModel}
 *
 * <p>GetCursorResponseBody</p>
 */
public class GetCursorResponseBody extends TeaModel {
    @NameInMap("cursor")
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
         * cursor.
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
