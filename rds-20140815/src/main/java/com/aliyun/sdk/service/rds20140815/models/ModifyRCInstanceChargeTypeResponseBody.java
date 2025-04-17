// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyRCInstanceChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRCInstanceChargeTypeResponseBody</p>
 */
public class ModifyRCInstanceChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private java.util.List<String> expiredTime;

    @com.aliyun.core.annotation.NameInMap("FeeOfInstances")
    private java.util.List<FeeOfInstances> feeOfInstances;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyRCInstanceChargeTypeResponseBody(Builder builder) {
        this.chargeType = builder.chargeType;
        this.expiredTime = builder.expiredTime;
        this.feeOfInstances = builder.feeOfInstances;
        this.instanceIds = builder.instanceIds;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceChargeTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return expiredTime
     */
    public java.util.List<String> getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return feeOfInstances
     */
    public java.util.List<FeeOfInstances> getFeeOfInstances() {
        return this.feeOfInstances;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
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
        private java.util.List<String> expiredTime; 
        private java.util.List<FeeOfInstances> feeOfInstances; 
        private java.util.List<String> instanceIds; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyRCInstanceChargeTypeResponseBody model) {
            this.chargeType = model.chargeType;
            this.expiredTime = model.expiredTime;
            this.feeOfInstances = model.feeOfInstances;
            this.instanceIds = model.instanceIds;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The billing method.</p>
         * <ul>
         * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
         * <li><strong>PREPAY</strong>: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The time when the instance expires.</p>
         * <blockquote>
         * <p> If you change the billing method from subscription to pay-as-you-go, this parameter is not returned.</p>
         * </blockquote>
         */
        public Builder expiredTime(java.util.List<String> expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         */
        public Builder feeOfInstances(java.util.List<FeeOfInstances> feeOfInstances) {
            this.feeOfInstances = feeOfInstances;
            return this;
        }

        /**
         * <p>The instance IDs.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2133400000****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF82B07-28D2-48D1-B5D6-7E78FED277C7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyRCInstanceChargeTypeResponseBody build() {
            return new ModifyRCInstanceChargeTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyRCInstanceChargeTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyRCInstanceChargeTypeResponseBody</p>
     */
    public static class FeeOfInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("Fee")
        private String fee;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private FeeOfInstances(Builder builder) {
            this.currency = builder.currency;
            this.fee = builder.fee;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeeOfInstances create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return fee
         */
        public String getFee() {
            return this.fee;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String currency; 
            private String fee; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(FeeOfInstances model) {
                this.currency = model.currency;
                this.fee = model.fee;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder fee(String fee) {
                this.fee = fee;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public FeeOfInstances build() {
                return new FeeOfInstances(this);
            } 

        } 

    }
}
