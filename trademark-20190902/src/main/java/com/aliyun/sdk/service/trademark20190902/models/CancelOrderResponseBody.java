// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CancelOrderResponseBody</p>
 */
public class CancelOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelOrderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOrderResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelOrderResponseBody build() {
            return new CancelOrderResponseBody(this);
        } 

    } 

}
