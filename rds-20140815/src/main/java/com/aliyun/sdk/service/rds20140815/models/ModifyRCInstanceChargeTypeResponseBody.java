// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRCInstanceChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRCInstanceChargeTypeResponseBody</p>
 */
public class ModifyRCInstanceChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeeOfInstances")
    private FeeOfInstances feeOfInstances;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyRCInstanceChargeTypeResponseBody(Builder builder) {
        this.feeOfInstances = builder.feeOfInstances;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceChargeTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return feeOfInstances
     */
    public FeeOfInstances getFeeOfInstances() {
        return this.feeOfInstances;
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
        private FeeOfInstances feeOfInstances; 
        private String orderId; 
        private String requestId; 

        /**
         * FeeOfInstances.
         */
        public Builder feeOfInstances(FeeOfInstances feeOfInstances) {
            this.feeOfInstances = feeOfInstances;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyRCInstanceChargeTypeResponseBody build() {
            return new ModifyRCInstanceChargeTypeResponseBody(this);
        } 

    } 

    public static class FeeOfInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("Fee")
        private String fee;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private FeeOfInstance(Builder builder) {
            this.currency = builder.currency;
            this.fee = builder.fee;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeeOfInstance create() {
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

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * Fee.
             */
            public Builder fee(String fee) {
                this.fee = fee;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public FeeOfInstance build() {
                return new FeeOfInstance(this);
            } 

        } 

    }
    public static class FeeOfInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeeOfInstance")
        private java.util.List < FeeOfInstance> feeOfInstance;

        private FeeOfInstances(Builder builder) {
            this.feeOfInstance = builder.feeOfInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeeOfInstances create() {
            return builder().build();
        }

        /**
         * @return feeOfInstance
         */
        public java.util.List < FeeOfInstance> getFeeOfInstance() {
            return this.feeOfInstance;
        }

        public static final class Builder {
            private java.util.List < FeeOfInstance> feeOfInstance; 

            /**
             * FeeOfInstance.
             */
            public Builder feeOfInstance(java.util.List < FeeOfInstance> feeOfInstance) {
                this.feeOfInstance = feeOfInstance;
                return this;
            }

            public FeeOfInstances build() {
                return new FeeOfInstances(this);
            } 

        } 

    }
}
