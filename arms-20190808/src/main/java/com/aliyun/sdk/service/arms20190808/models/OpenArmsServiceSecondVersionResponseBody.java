// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link OpenArmsServiceSecondVersionResponseBody} extends {@link TeaModel}
 *
 * <p>OpenArmsServiceSecondVersionResponseBody</p>
 */
public class OpenArmsServiceSecondVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OpenArmsServiceSecondVersionResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenArmsServiceSecondVersionResponseBody create() {
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

    public static final class Builder {
        private String orderId; 
        private String requestId; 

        /**
         * <p>The service ID returned if the service is activated.</p>
         * 
         * <strong>example:</strong>
         * <p>20896874992****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9ED50893-F3C4-42DF-ABB2-C200BE******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OpenArmsServiceSecondVersionResponseBody build() {
            return new OpenArmsServiceSecondVersionResponseBody(this);
        } 

    } 

}
