// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostsChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedHostsChargeTypeResponseBody</p>
 */
public class ModifyDedicatedHostsChargeTypeResponseBody extends TeaModel {
    @NameInMap("FeeOfInstances")
    private FeeOfInstances feeOfInstances;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyDedicatedHostsChargeTypeResponseBody(Builder builder) {
        this.feeOfInstances = builder.feeOfInstances;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostsChargeTypeResponseBody create() {
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

        public ModifyDedicatedHostsChargeTypeResponseBody build() {
            return new ModifyDedicatedHostsChargeTypeResponseBody(this);
        } 

    } 

    public static class FeeOfInstance extends TeaModel {
        @NameInMap("Currency")
        private String currency;

        @NameInMap("Fee")
        private String fee;

        @NameInMap("InstanceId")
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
        @NameInMap("FeeOfInstance")
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
