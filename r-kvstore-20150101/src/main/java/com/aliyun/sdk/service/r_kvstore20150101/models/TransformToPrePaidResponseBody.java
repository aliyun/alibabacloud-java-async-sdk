// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformToPrePaidResponseBody} extends {@link TeaModel}
 *
 * <p>TransformToPrePaidResponseBody</p>
 */
public class TransformToPrePaidResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private TransformToPrePaidResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformToPrePaidResponseBody create() {
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
         * Specifies whether to enable auto-renewal. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no. In this case, you can renew your instance in the ApsaraDB for Redis console. For more information, see [Manually renew an instance](~~26352~~).
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **TransformToPrePaid**.
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

        public TransformToPrePaidResponseBody build() {
            return new TransformToPrePaidResponseBody(this);
        } 

    } 

}
