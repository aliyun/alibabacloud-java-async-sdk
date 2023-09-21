// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReimageNodesRequest} extends {@link RequestModel}
 *
 * <p>ReimageNodesRequest</p>
 */
public class ReimageNodesRequest extends Request {
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
    @NameInMap("Nodes")
    private java.util.List < Nodes> nodes;

    @Body
    @NameInMap("UserData")
    private String userData;

    private ReimageNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.nodes = builder.nodes;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReimageNodesRequest create() {
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
     * @return nodes
     */
    public java.util.List < Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<ReimageNodesRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private Boolean ignoreFailedNodeTasks; 
        private java.util.List < Nodes> nodes; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(ReimageNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.nodes = request.nodes;
            this.userData = request.userData;
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * IgnoreFailedNodeTasks.
         */
        public Builder ignoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
            this.putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks);
            this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            String nodesShrink = shrink(nodes, "Nodes", "json");
            this.putBodyParameter("Nodes", nodesShrink);
            this.nodes = nodes;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putBodyParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public ReimageNodesRequest build() {
            return new ReimageNodesRequest(this);
        } 

    } 

    public static class Nodes extends TeaModel {
        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("LoginPassword")
        private String loginPassword;

        @NameInMap("NodeId")
        private String nodeId;

        private Nodes(Builder builder) {
            this.hostname = builder.hostname;
            this.imageId = builder.imageId;
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
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
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
            private String imageId; 
            private String loginPassword; 
            private String nodeId; 

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * LoginPassword.
             */
            public Builder loginPassword(String loginPassword) {
                this.loginPassword = loginPassword;
                return this;
            }

            /**
             * NodeId.
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
}
