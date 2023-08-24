// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformInstanceChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>TransformInstanceChargeTypeResponseBody</p>
 */
public class TransformInstanceChargeTypeResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private TransformInstanceChargeTypeResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformInstanceChargeTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
        private String endTime; 
        private String orderId; 
        private String requestId; 

        /**
         * The new billing method. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription. If you set this parameter to PrePaid, you must also set the **Period** parameter.
         * *   **PostPaid**: pay-as-you-go.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **TransformInstanceChargeType**.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TransformInstanceChargeTypeResponseBody build() {
            return new TransformInstanceChargeTypeResponseBody(this);
        } 

    } 

}
