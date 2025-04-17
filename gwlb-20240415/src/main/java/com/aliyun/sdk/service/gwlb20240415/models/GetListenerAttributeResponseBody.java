// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
    private java.util.List<Tags> tags;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(GetListenerAttributeResponseBody model) {
            this.listenerDescription = model.listenerDescription;
            this.listenerId = model.listenerId;
            this.listenerStatus = model.listenerStatus;
            this.loadBalancerId = model.loadBalancerId;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.serverGroupId = model.serverGroupId;
            this.tags = model.tags;
        } 

        /**
         * <p>The listener description.</p>
         * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>listener_description</p>
         */
        public Builder listenerDescription(String listenerDescription) {
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * <p>The listener ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-3kbj3587mqhm3p****</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The listener status. Valid values:</p>
         * <ul>
         * <li><strong>Provisioning</strong>: The listener is being created.</li>
         * <li><strong>Running</strong>: The listener is running.</li>
         * <li><strong>Configuring</strong>: The listener is being configured.</li>
         * <li><strong>Deleting</strong>: The listener is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Provisioning</p>
         */
        public Builder listenerStatus(String listenerStatus) {
            this.listenerStatus = listenerStatus;
            return this;
        }

        /**
         * <p>The GWLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gwlb-te609d6696632f76****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The region ID of the GWLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75CC3312-7757-5EE1-90D8-49CEA66608AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The server group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-sp8d2r6y7t0xtl****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The tag key cannot be an empty string. The tag key can be up to 128 characters in length, and cannot start with <code>acs: </code>or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The tag value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
