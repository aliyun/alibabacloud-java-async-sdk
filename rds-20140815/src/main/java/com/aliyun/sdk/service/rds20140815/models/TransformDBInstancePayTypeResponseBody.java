// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformDBInstancePayTypeResponseBody} extends {@link TeaModel}
 *
 * <p>TransformDBInstancePayTypeResponseBody</p>
 */
public class TransformDBInstancePayTypeResponseBody extends TeaModel {
    @NameInMap("ChargeType")
    private String chargeType;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("OrderId")
    private Long orderId;

    @NameInMap("RequestId")
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
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
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

        public TransformDBInstancePayTypeResponseBody build() {
            return new TransformDBInstancePayTypeResponseBody(this);
        } 

    } 

}
