// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformDBClusterPayTypeResponseBody} extends {@link TeaModel}
 *
 * <p>TransformDBClusterPayTypeResponseBody</p>
 */
public class TransformDBClusterPayTypeResponseBody extends TeaModel {
    @NameInMap("ChargeType")
    private String chargeType;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private TransformDBClusterPayTypeResponseBody(Builder builder) {
        this.chargeType = builder.chargeType;
        this.DBClusterId = builder.DBClusterId;
        this.expiredTime = builder.expiredTime;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformDBClusterPayTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
        private String chargeType; 
        private String DBClusterId; 
        private String expiredTime; 
        private String orderId; 
        private String requestId; 

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
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
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TransformDBClusterPayTypeResponseBody build() {
            return new TransformDBClusterPayTypeResponseBody(this);
        } 

    } 

}
