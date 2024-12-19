// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ModifyInstanceChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceChargeTypeResponseBody</p>
 */
public class ModifyInstanceChargeTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeeOfInstances")
    private FeeOfInstances feeOfInstances;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Details about the charges for the order.</p>
         */
        public Builder feeOfInstances(FeeOfInstances feeOfInstances) {
            this.feeOfInstances = feeOfInstances;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20413515388****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B61C08E5-403A-46A2-96C1-F7B1216DB10C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceChargeTypeResponseBody build() {
            return new ModifyInstanceChargeTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceChargeTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyInstanceChargeTypeResponseBody</p>
     */
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
             * <p>The unit of currency for the bill.</p>
             * <p>Alibaba Cloud China site (aliyun.com): CNY.</p>
             * <p>Alibaba Cloud International site (alibabacloud.com): USD.</p>
             * 
             * <strong>example:</strong>
             * <p>CNY</p>
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>The cost value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fee(String fee) {
                this.fee = fee;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp67acfmxazb4p****</p>
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
    /**
     * 
     * {@link ModifyInstanceChargeTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyInstanceChargeTypeResponseBody</p>
     */
    public static class FeeOfInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeeOfInstance")
        private java.util.List<FeeOfInstance> feeOfInstance;

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
        public java.util.List<FeeOfInstance> getFeeOfInstance() {
            return this.feeOfInstance;
        }

        public static final class Builder {
            private java.util.List<FeeOfInstance> feeOfInstance; 

            /**
             * FeeOfInstance.
             */
            public Builder feeOfInstance(java.util.List<FeeOfInstance> feeOfInstance) {
                this.feeOfInstance = feeOfInstance;
                return this;
            }

            public FeeOfInstances build() {
                return new FeeOfInstances(this);
            } 

        } 

    }
}
