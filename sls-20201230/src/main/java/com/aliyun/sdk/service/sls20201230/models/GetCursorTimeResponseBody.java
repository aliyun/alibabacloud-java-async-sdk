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
         * Cursor的服务端时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
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
