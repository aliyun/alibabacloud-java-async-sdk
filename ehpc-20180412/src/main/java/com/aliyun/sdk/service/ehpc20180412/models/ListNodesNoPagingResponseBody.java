// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListNodesNoPagingResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesNoPagingResponseBody</p>
 */
public class ListNodesNoPagingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private Nodes nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNodesNoPagingResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesNoPagingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodes
     */
    public Nodes getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Nodes nodes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNodesNoPagingResponseBody model) {
            this.nodes = model.nodes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of nodes.</p>
         */
        public Builder nodes(Nodes nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNodesNoPagingResponseBody build() {
            return new ListNodesNoPagingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodesNoPagingResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesNoPagingResponseBody</p>
     */
    public static class NodeInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private NodeInfo(Builder builder) {
            this.hostName = builder.hostName;
            this.id = builder.id;
            this.imageId = builder.imageId;
            this.instanceType = builder.instanceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeInfo create() {
            return builder().build();
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String hostName; 
            private String id; 
            private String imageId; 
            private String instanceType; 
            private String status; 

            private Builder() {
            } 

            private Builder(NodeInfo model) {
                this.hostName = model.hostName;
                this.id = model.id;
                this.imageId = model.imageId;
                this.instanceType = model.instanceType;
                this.status = model.status;
            } 

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>compute0</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp13p7vlcb1uihfv****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7_02_64_20G_alibase_20170818****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.n1.tiny</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The status of the node. Valid values:</p>
             * <ul>
             * <li>uninit: The node is being installed.</li>
             * <li>exception: An exception occurred on the node.</li>
             * <li>running: The node is running.</li>
             * <li>initing: The node is being initialized.</li>
             * <li>releasing: The node is being released.</li>
             * <li>untracking: The node is not added to the cluster.</li>
             * <li>stopped: The node is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>untracking</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NodeInfo build() {
                return new NodeInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodesNoPagingResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesNoPagingResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeInfo")
        private java.util.List<NodeInfo> nodeInfo;

        private Nodes(Builder builder) {
            this.nodeInfo = builder.nodeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return nodeInfo
         */
        public java.util.List<NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List<NodeInfo> nodeInfo; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.nodeInfo = model.nodeInfo;
            } 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List<NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
