// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunRCInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>RunRCInstancesResponseBody</p>
 */
public class RunRCInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceIdSets")
    private InstanceIdSets instanceIdSets;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunRCInstancesResponseBody(Builder builder) {
        this.instanceIdSets = builder.instanceIdSets;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunRCInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceIdSets
     */
    public InstanceIdSets getInstanceIdSets() {
        return this.instanceIdSets;
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
        private InstanceIdSets instanceIdSets; 
        private String orderId; 
        private String requestId; 

        /**
         * InstanceIdSets.
         */
        public Builder instanceIdSets(InstanceIdSets instanceIdSets) {
            this.instanceIdSets = instanceIdSets;
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

        public RunRCInstancesResponseBody build() {
            return new RunRCInstancesResponseBody(this);
        } 

    } 

    public static class InstanceIdSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIdSet")
        private java.util.List < String > instanceIdSet;

        private InstanceIdSets(Builder builder) {
            this.instanceIdSet = builder.instanceIdSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIdSets create() {
            return builder().build();
        }

        /**
         * @return instanceIdSet
         */
        public java.util.List < String > getInstanceIdSet() {
            return this.instanceIdSet;
        }

        public static final class Builder {
            private java.util.List < String > instanceIdSet; 

            /**
             * InstanceIdSet.
             */
            public Builder instanceIdSet(java.util.List < String > instanceIdSet) {
                this.instanceIdSet = instanceIdSet;
                return this;
            }

            public InstanceIdSets build() {
                return new InstanceIdSets(this);
            } 

        } 

    }
}
