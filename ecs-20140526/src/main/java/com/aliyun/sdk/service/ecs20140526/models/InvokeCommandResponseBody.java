// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeCommandResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeCommandResponseBody</p>
 */
public class InvokeCommandResponseBody extends TeaModel {
    @NameInMap("InvokeId")
    private String invokeId;

    @NameInMap("RequestId")
    private String requestId;

    private InvokeCommandResponseBody(Builder builder) {
        this.invokeId = builder.invokeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeCommandResponseBody create() {
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
         * InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InvokeCommandResponseBody build() {
            return new InvokeCommandResponseBody(this);
        } 

    } 

}
