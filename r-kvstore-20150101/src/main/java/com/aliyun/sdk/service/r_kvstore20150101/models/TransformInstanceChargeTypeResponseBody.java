// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link TransformInstanceChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>TransformInstanceChargeTypeResponseBody</p>
 */
public class TransformInstanceChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TransformInstanceChargeTypeResponseBody model) {
            this.endTime = model.endTime;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time when the instance expires.</p>
         * <blockquote>
         * <p> A value is returned for this parameter only if the instance was changed from pay-as-you-go to subscription.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-05-13T00:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>20881824000****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>82C791FB-8979-489E-853D-706D7743****</p>
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
