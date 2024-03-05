// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodesNoPagingResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesNoPagingResponseBody</p>
 */
public class ListNodesNoPagingResponseBody extends TeaModel {
    @NameInMap("Nodes")
    private Nodes nodes;

    @NameInMap("RequestId")
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

        /**
         * The list of nodes.
         */
        public Builder nodes(Nodes nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNodesNoPagingResponseBody build() {
            return new ListNodesNoPagingResponseBody(this);
        } 

    } 

    public static class NodeInfo extends TeaModel {
        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Id")
        private String id;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("Status")
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

            /**
             * The node name.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The image ID.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The node type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The status of the node. Valid values:
             * <p>
             * 
             * *   uninit: The node is being installed.
             * *   exception: An exception occurred on the node.
             * *   running: The node is running.
             * *   initing: The node is being initialized.
             * *   releasing: The node is being released.
             * *   untracking: The node is not added to the cluster.
             * *   stopped: The node is stopped.
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
    public static class Nodes extends TeaModel {
        @NameInMap("NodeInfo")
        private java.util.List < NodeInfo> nodeInfo;

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
        public java.util.List < NodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public static final class Builder {
            private java.util.List < NodeInfo> nodeInfo; 

            /**
             * NodeInfo.
             */
            public Builder nodeInfo(java.util.List < NodeInfo> nodeInfo) {
                this.nodeInfo = nodeInfo;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
