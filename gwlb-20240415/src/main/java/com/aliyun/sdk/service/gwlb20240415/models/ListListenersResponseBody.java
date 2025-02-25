// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListListenersResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenersResponseBody</p>
 */
public class ListListenersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List < Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < Listeners> listeners; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Listeners.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListListenersResponseBody build() {
            return new ListListenersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ListenerDescription")
        private String listenerDescription;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerStatus")
        private String listenerStatus;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Listeners(Builder builder) {
            this.listenerDescription = builder.listenerDescription;
            this.listenerId = builder.listenerId;
            this.listenerStatus = builder.listenerStatus;
            this.loadBalancerId = builder.loadBalancerId;
            this.serverGroupId = builder.serverGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return listenerDescription
         */
        public String getListenerDescription() {
            return this.listenerDescription;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return listenerStatus
         */
        public String getListenerStatus() {
            return this.listenerStatus;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String listenerDescription; 
            private String listenerId; 
            private String listenerStatus; 
            private String loadBalancerId; 
            private String serverGroupId; 
            private java.util.List < Tags> tags; 

            /**
             * ListenerDescription.
             */
            public Builder listenerDescription(String listenerDescription) {
                this.listenerDescription = listenerDescription;
                return this;
            }

            /**
             * ListenerId.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * ListenerStatus.
             */
            public Builder listenerStatus(String listenerStatus) {
                this.listenerStatus = listenerStatus;
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
             * ServerGroupId.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
