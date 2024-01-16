// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOrderRequestResponseBody} extends {@link TeaModel}
 *
 * <p>CancelOrderRequestResponseBody</p>
 */
public class CancelOrderRequestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelOrderRequestResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOrderRequestResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelOrderRequestResponseBody build() {
            return new CancelOrderRequestResponseBody(this);
        } 

    } 

}
