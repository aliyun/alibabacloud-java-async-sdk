// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformDBInstancePayTypeResponseBody} extends {@link TeaModel}
 *
 * <p>TransformDBInstancePayTypeResponseBody</p>
 */
public class TransformDBInstancePayTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TransformDBInstancePayTypeResponseBody(Builder builder) {
        this.chargeType = builder.chargeType;
        this.DBInstanceId = builder.DBInstanceId;
        this.expiredTime = builder.expiredTime;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformDBInstancePayTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String chargeType; 
        private String DBInstanceId; 
        private String expiredTime; 
        private Long orderId; 
        private String requestId; 

        /**
         * The payment type.
         * <p>
         * 
         * *   Valid value if the new billing method is pay-as-you-go: POSTPAY
         * *   Valid value if the new billing method is subscription: PREPAY
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The expiration time.
         * <p>
         * 
         * > If you call this operation to change the billing method of an instance from subscription to pay-as-you-go, this parameter is not returned.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The order ID.
         */
        public Builder orderId(Long orderId) {
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

        public TransformDBInstancePayTypeResponseBody build() {
            return new TransformDBInstancePayTypeResponseBody(this);
        } 

    } 

}
