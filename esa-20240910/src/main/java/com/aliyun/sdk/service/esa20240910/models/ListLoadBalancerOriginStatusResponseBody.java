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

        /**
         * OriginStatus.
         */
        public Builder originStatus(java.util.List<OriginStatus> originStatus) {
            this.originStatus = originStatus;
            return this;
        }

        /**
         * <p>Id of the request</p>
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

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(Long loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * OriginId.
             */
            public Builder originId(Long originId) {
                this.originId = originId;
                return this;
            }

            /**
             * PoolId.
             */
            public Builder poolId(Long poolId) {
                this.poolId = poolId;
                return this;
            }

            /**
             * PoolType.
             */
            public Builder poolType(String poolType) {
                this.poolType = poolType;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
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
