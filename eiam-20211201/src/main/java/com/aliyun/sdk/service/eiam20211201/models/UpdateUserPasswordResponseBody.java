// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserPasswordResponseBody</p>
 */
public class UpdateUserPasswordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateUserPasswordResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserPasswordResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateUserPasswordResponseBody build() {
            return new UpdateUserPasswordResponseBody(this);
        } 

    } 

}
