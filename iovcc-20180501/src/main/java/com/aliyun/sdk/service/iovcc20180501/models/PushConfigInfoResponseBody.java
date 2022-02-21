// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushConfigInfoResponseBody} extends {@link TeaModel}
 *
 * <p>PushConfigInfoResponseBody</p>
 */
public class PushConfigInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private PushConfigInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushConfigInfoResponseBody create() {
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushConfigInfoResponseBody build() {
            return new PushConfigInfoResponseBody(this);
        } 

    } 

}
