// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListLoadBalancerOriginStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListLoadBalancerOriginStatusResponseBody</p>
 */
public class ListLoadBalancerOriginStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OriginStatus")
    private java.util.List<OriginStatus> originStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLoadBalancerOriginStatusResponseBody(Builder builder) {
        this.originStatus = builder.originStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLoadBalancerOriginStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return originStatus
     */
    public java.util.List<OriginStatus> getOriginStatus() {
        return this.originStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OriginStatus> originStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLoadBalancerOriginStatusResponseBody model) {
            this.originStatus = model.originStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of origin statuses under the load balancer.</p>
         */
        public Builder originStatus(java.util.List<OriginStatus> originStatus) {
            this.originStatus = originStatus;
            return this;
        }

        /**
         * <p>Request ID, used for tracking the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLoadBalancerOriginStatusResponseBody build() {
            return new ListLoadBalancerOriginStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLoadBalancerOriginStatusResponseBody} extends {@link TeaModel}
     *
     * <p>ListLoadBalancerOriginStatusResponseBody</p>
     */
    public static class OriginStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private Long loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("OriginId")
        private Long originId;

        @com.aliyun.core.annotation.NameInMap("PoolId")
        private Long poolId;

        @com.aliyun.core.annotation.NameInMap("PoolType")
        private String poolType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private OriginStatus(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.originId = builder.originId;
            this.poolId = builder.poolId;
            this.poolType = builder.poolType;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginStatus create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public Long getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return originId
         */
        public Long getOriginId() {
            return this.originId;
        }

        /**
         * @return poolId
         */
        public Long getPoolId() {
            return this.poolId;
        }

        /**
         * @return poolType
         */
        public String getPoolType() {
            return this.poolType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long loadBalancerId; 
            private Long originId; 
            private Long poolId; 
            private String poolType; 
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(OriginStatus model) {
                this.loadBalancerId = model.loadBalancerId;
                this.originId = model.originId;
                this.poolId = model.poolId;
                this.poolType = model.poolType;
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>ID of the load balancer.</p>
             * 
             * <strong>example:</strong>
             * <p>99874066052****</p>
             */
            public Builder loadBalancerId(Long loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>ID of the origin.</p>
             * 
             * <strong>example:</strong>
             * <p>99750209487****</p>
             */
            public Builder originId(Long originId) {
                this.originId = originId;
                return this;
            }

            /**
             * <p>ID of the source address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>99750209487****</p>
             */
            public Builder poolId(Long poolId) {
                this.poolId = poolId;
                return this;
            }

            /**
             * <p>The origin pool to which the source belongs, under this load balancer. Only &quot;default_pool&quot; (default address pool) will be displayed; other types will return an empty string.</p>
             * 
             * <strong>example:</strong>
             * <p>default_pool</p>
             */
            public Builder poolType(String poolType) {
                this.poolType = poolType;
                return this;
            }

            /**
             * <p>Reason for the probe failure.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP connection error</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Status of the origin:</p>
             * <ul>
             * <li>Healthy(healthy): The probe result is available.</li>
             * <li>Unhealthy(unhealthy): The probe result is unavailable.</li>
             * <li>Unknown(unknown): Unknown, the monitor has not yet probed.</li>
             * <li>Undetected(undetected): The load balancer to which the origin belongs is not bound to a monitor.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public OriginStatus build() {
                return new OriginStatus(this);
            } 

        } 

    }
}
