// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetCursorTimeResponseBody} extends {@link TeaModel}
 *
 * <p>GetCursorTimeResponseBody</p>
 */
public class GetCursorTimeResponseBody extends TeaModel {
    @NameInMap("cursor_time")
    private String cursorTime;

    private GetCursorTimeResponseBody(Builder builder) {
        this.cursorTime = builder.cursorTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCursorTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return cursorTime
     */
    public String getCursorTime() {
        return this.cursorTime;
    }

    public static final class Builder {
        private String cursorTime; 

        /**
         * The server time that is queried based on the cursor. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder cursorTime(String cursorTime) {
            this.cursorTime = cursorTime;
            return this;
        }

        public GetCursorTimeResponseBody build() {
            return new GetCursorTimeResponseBody(this);
        } 

    } 

}
