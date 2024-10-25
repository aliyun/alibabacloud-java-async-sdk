// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerListenersResponseBody</p>
 */
public class DescribeLoadBalancerListenersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private Listeners listeners;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLoadBalancerListenersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerListenersResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public Listeners getListeners() {
        return this.listeners;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Listeners listeners; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Listeners.
         */
        public Builder listeners(Listeners listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLoadBalancerListenersResponseBody build() {
            return new DescribeLoadBalancerListenersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenersResponseBody</p>
     */
    public static class Listener extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ForwardPort")
        private String forwardPort;

        @com.aliyun.core.annotation.NameInMap("ListenerForward")
        private String listenerForward;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private String listenerPort;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Listener(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.forwardPort = builder.forwardPort;
            this.listenerForward = builder.listenerForward;
            this.listenerPort = builder.listenerPort;
            this.loadBalancerId = builder.loadBalancerId;
            this.protocol = builder.protocol;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listener create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return forwardPort
         */
        public String getForwardPort() {
            return this.forwardPort;
        }

        /**
         * @return listenerForward
         */
        public String getListenerForward() {
            return this.listenerForward;
        }

        /**
         * @return listenerPort
         */
        public String getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String forwardPort; 
            private String listenerForward; 
            private String listenerPort; 
            private String loadBalancerId; 
            private String protocol; 
            private String status; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ForwardPort.
             */
            public Builder forwardPort(String forwardPort) {
                this.forwardPort = forwardPort;
                return this;
            }

            /**
             * ListenerForward.
             */
            public Builder listenerForward(String listenerForward) {
                this.listenerForward = listenerForward;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(String listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Listener build() {
                return new Listener(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerListenersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenersResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Listener")
        private java.util.List < Listener> listener;

        private Listeners(Builder builder) {
            this.listener = builder.listener;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return listener
         */
        public java.util.List < Listener> getListener() {
            return this.listener;
        }

        public static final class Builder {
            private java.util.List < Listener> listener; 

            /**
             * Listener.
             */
            public Builder listener(java.util.List < Listener> listener) {
                this.listener = listener;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
