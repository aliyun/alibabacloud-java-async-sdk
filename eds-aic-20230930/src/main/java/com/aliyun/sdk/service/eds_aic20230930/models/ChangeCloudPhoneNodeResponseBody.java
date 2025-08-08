// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ChangeCloudPhoneNodeResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeCloudPhoneNodeResponseBody</p>
 */
public class ChangeCloudPhoneNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeInfos")
    private java.util.List<NodeInfos> nodeInfos;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ChangeCloudPhoneNodeResponseBody(Builder builder) {
        this.nodeInfos = builder.nodeInfos;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCloudPhoneNodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeInfos
     */
    public java.util.List<NodeInfos> getNodeInfos() {
        return this.nodeInfos;
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
        private java.util.List<NodeInfos> nodeInfos; 
        private String orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ChangeCloudPhoneNodeResponseBody model) {
            this.nodeInfos = model.nodeInfos;
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * NodeInfos.
         */
        public Builder nodeInfos(java.util.List<NodeInfos> nodeInfos) {
            this.nodeInfos = nodeInfos;
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

        public ChangeCloudPhoneNodeResponseBody build() {
            return new ChangeCloudPhoneNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ChangeCloudPhoneNodeResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeCloudPhoneNodeResponseBody</p>
     */
    public static class InstanceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PhoneDataVolume")
        private Integer phoneDataVolume;

        private InstanceInfos(Builder builder) {
            this.instanceId = builder.instanceId;
            this.phoneDataVolume = builder.phoneDataVolume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfos create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return phoneDataVolume
         */
        public Integer getPhoneDataVolume() {
            return this.phoneDataVolume;
        }

        public static final class Builder {
            private String instanceId; 
            private Integer phoneDataVolume; 

            private Builder() {
            } 

            private Builder(InstanceInfos model) {
                this.instanceId = model.instanceId;
                this.phoneDataVolume = model.phoneDataVolume;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PhoneDataVolume.
             */
            public Builder phoneDataVolume(Integer phoneDataVolume) {
                this.phoneDataVolume = phoneDataVolume;
                return this;
            }

            public InstanceInfos build() {
                return new InstanceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeCloudPhoneNodeResponseBody} extends {@link TeaModel}
     *
     * <p>ChangeCloudPhoneNodeResponseBody</p>
     */
    public static class NodeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceInfos")
        private java.util.List<InstanceInfos> instanceInfos;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ShareDataVolume")
        private Integer shareDataVolume;

        private NodeInfos(Builder builder) {
            this.instanceInfos = builder.instanceInfos;
            this.nodeId = builder.nodeId;
            this.shareDataVolume = builder.shareDataVolume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfos create() {
            return builder().build();
        }

        /**
         * @return instanceInfos
         */
        public java.util.List<InstanceInfos> getInstanceInfos() {
            return this.instanceInfos;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return shareDataVolume
         */
        public Integer getShareDataVolume() {
            return this.shareDataVolume;
        }

        public static final class Builder {
            private java.util.List<InstanceInfos> instanceInfos; 
            private String nodeId; 
            private Integer shareDataVolume; 

            private Builder() {
            } 

            private Builder(NodeInfos model) {
                this.instanceInfos = model.instanceInfos;
                this.nodeId = model.nodeId;
                this.shareDataVolume = model.shareDataVolume;
            } 

            /**
             * InstanceInfos.
             */
            public Builder instanceInfos(java.util.List<InstanceInfos> instanceInfos) {
                this.instanceInfos = instanceInfos;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * ShareDataVolume.
             */
            public Builder shareDataVolume(Integer shareDataVolume) {
                this.shareDataVolume = shareDataVolume;
                return this;
            }

            public NodeInfos build() {
                return new NodeInfos(this);
            } 

        } 

    }
}
