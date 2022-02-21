// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendFileResponseBody} extends {@link TeaModel}
 *
 * <p>SendFileResponseBody</p>
 */
public class SendFileResponseBody extends TeaModel {
    @NameInMap("InvokeId")
    private String invokeId;

    @NameInMap("RequestId")
    private String requestId;

    private SendFileResponseBody(Builder builder) {
        this.invokeId = builder.invokeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String invokeId; 
        private String requestId; 

        /**
         * The ID of the command execution.
         */
        public Builder invokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendFileResponseBody build() {
            return new SendFileResponseBody(this);
        } 

    } 

}
