// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceChargeTypeResponseBody</p>
 */
public class ModifyInstanceChargeTypeResponseBody extends TeaModel {
    @NameInMap("FeeOfInstances")
    private FeeOfInstances feeOfInstances;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceChargeTypeResponseBody(Builder builder) {
        this.feeOfInstances = builder.feeOfInstances;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceChargeTypeResponseBody create() {
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
         * Details about the charges for the order.
         */
        public Builder feeOfInstances(FeeOfInstances feeOfInstances) {
            this.feeOfInstances = feeOfInstances;
            return this;
        }

        /**
         * The ID of the order.
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

        public ModifyInstanceChargeTypeResponseBody build() {
            return new ModifyInstanceChargeTypeResponseBody(this);
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
             * The unit of currency for the bill.
             * <p>
             * 
             * Alibaba Cloud China site (aliyun.com): CNY.
             * 
             * Alibaba Cloud International site (alibabacloud.com): USD.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * The cost value.
             */
            public Builder fee(String fee) {
                this.fee = fee;
                return this;
            }

            /**
             * The ID of the instance.
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
