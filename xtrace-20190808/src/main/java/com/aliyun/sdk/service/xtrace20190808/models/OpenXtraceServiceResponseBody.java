// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenXtraceServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenXtraceServiceResponseBody</p>
 */
public class OpenXtraceServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    private OpenXtraceServiceResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenXtraceServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 
        private String result; 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public OpenXtraceServiceResponseBody build() {
            return new OpenXtraceServiceResponseBody(this);
        } 

    } 

}
