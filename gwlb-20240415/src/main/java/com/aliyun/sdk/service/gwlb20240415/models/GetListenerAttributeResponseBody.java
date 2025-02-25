// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetListenerAttributeResponseBody</p>
 */
public class GetListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListenerDescription")
    private String listenerDescription;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("ListenerStatus")
    private String listenerStatus;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    private String serverGroupId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private GetListenerAttributeResponseBody(Builder builder) {
        this.listenerDescription = builder.listenerDescription;
        this.listenerId = builder.listenerId;
        this.listenerStatus = builder.listenerStatus;
        this.loadBalancerId = builder.loadBalancerId;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.serverGroupId = builder.serverGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListenerAttributeResponseBody create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String regionId; 
        private String requestId; 
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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

        public GetListenerAttributeResponseBody build() {
            return new GetListenerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetListenerAttributeResponseBody</p>
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
}
