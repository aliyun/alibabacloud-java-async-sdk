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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RunRCInstancesResponseBody model) {
            this.instanceIdSets = model.instanceIdSets;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance IDs (InstanceIdSet).</p>
         */
        public Builder instanceIdSets(InstanceIdSets instanceIdSets) {
            this.instanceIdSets = instanceIdSets;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>237850846720798</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>535BD857-E88F-5B4F-A18C-FAF59A74741F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunRCInstancesResponseBody build() {
            return new RunRCInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunRCInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>RunRCInstancesResponseBody</p>
     */
    public static class InstanceIdSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIdSet")
        private java.util.List<String> instanceIdSet;

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
        public java.util.List<String> getInstanceIdSet() {
            return this.instanceIdSet;
        }

        public static final class Builder {
            private java.util.List<String> instanceIdSet; 

            private Builder() {
            } 

            private Builder(InstanceIdSets model) {
                this.instanceIdSet = model.instanceIdSet;
            } 

            /**
             * InstanceIdSet.
             */
            public Builder instanceIdSet(java.util.List<String> instanceIdSet) {
                this.instanceIdSet = instanceIdSet;
                return this;
            }

            public InstanceIdSets build() {
                return new InstanceIdSets(this);
            } 

        } 

    }
}
