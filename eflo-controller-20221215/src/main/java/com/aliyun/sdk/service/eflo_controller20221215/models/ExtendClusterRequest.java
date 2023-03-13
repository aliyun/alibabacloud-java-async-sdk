// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExtendClusterRequest} extends {@link RequestModel}
 *
 * <p>ExtendClusterRequest</p>
 */
public class ExtendClusterRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ClusterId")
    private String clusterId;

    @Body
    @NameInMap("IgnoreFailedNodeTasks")
    private Boolean ignoreFailedNodeTasks;

    @Body
    @NameInMap("NodeGroups")
    private java.util.List < NodeGroups> nodeGroups;

    @Body
    @NameInMap("VpdSubnets")
    private java.util.List < String > vpdSubnets;

    private ExtendClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.nodeGroups = builder.nodeGroups;
        this.vpdSubnets = builder.vpdSubnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExtendClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return ignoreFailedNodeTasks
     */
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    /**
     * @return nodeGroups
     */
    public java.util.List < NodeGroups> getNodeGroups() {
        return this.nodeGroups;
    }

    /**
     * @return vpdSubnets
     */
    public java.util.List < String > getVpdSubnets() {
        return this.vpdSubnets;
    }

    public static final class Builder extends Request.Builder<ExtendClusterRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private Boolean ignoreFailedNodeTasks; 
        private java.util.List < NodeGroups> nodeGroups; 
        private java.util.List < String > vpdSubnets; 

        private Builder() {
            super();
        } 

        private Builder(ExtendClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.nodeGroups = request.nodeGroups;
            this.vpdSubnets = request.vpdSubnets;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 集群id
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 是否允许跳过失败节点，默认值为Flase
         */
        public Builder ignoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
            this.putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks);
            this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
            return this;
        }

        /**
         * 节点组
         */
        public Builder nodeGroups(java.util.List < NodeGroups> nodeGroups) {
            String nodeGroupsShrink = shrink(nodeGroups, "NodeGroups", "json");
            this.putBodyParameter("NodeGroups", nodeGroupsShrink);
            this.nodeGroups = nodeGroups;
            return this;
        }

        /**
         * VpdSubnets.
         */
        public Builder vpdSubnets(java.util.List < String > vpdSubnets) {
            String vpdSubnetsShrink = shrink(vpdSubnets, "VpdSubnets", "json");
            this.putBodyParameter("VpdSubnets", vpdSubnetsShrink);
            this.vpdSubnets = vpdSubnets;
            return this;
        }

        @Override
        public ExtendClusterRequest build() {
            return new ExtendClusterRequest(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("LoginPassword")
        private String loginPassword;

        @NameInMap("NodeId")
        private String nodeId;

        private Nodes(Builder builder) {
            this.hostname = builder.hostname;
            this.loginPassword = builder.loginPassword;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return loginPassword
         */
        public String getLoginPassword() {
            return this.loginPassword;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String hostname; 
            private String loginPassword; 
            private String nodeId; 

            /**
             * 主机名
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * 登录密码
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * 节点id
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class NodeGroups extends TeaModel {
        @NameInMap("NodeGroupId")
        private String nodeGroupId;

        @NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        private NodeGroups(Builder builder) {
            this.nodeGroupId = builder.nodeGroupId;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroups create() {
            return builder().build();
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private String nodeGroupId; 
            private java.util.List < Nodes> nodes; 

            /**
             * 节点组id
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * 节点列表
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public NodeGroups build() {
                return new NodeGroups(this);
            } 

        } 

    }
}
