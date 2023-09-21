// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootNodesRequest} extends {@link RequestModel}
 *
 * <p>RebootNodesRequest</p>
 */
public class RebootNodesRequest extends Request {
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
    private java.util.List < String > nodes;

    private RebootNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.ignoreFailedNodeTasks = builder.ignoreFailedNodeTasks;
        this.nodes = builder.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootNodesRequest create() {
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
    public java.util.List < String > getNodes() {
        return this.nodes;
    }

    public static final class Builder extends Request.Builder<RebootNodesRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private Boolean ignoreFailedNodeTasks; 
        private java.util.List < String > nodes; 

        private Builder() {
            super();
        } 

        private Builder(RebootNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.ignoreFailedNodeTasks = request.ignoreFailedNodeTasks;
            this.nodes = request.nodes;
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
        public Builder nodes(java.util.List < String > nodes) {
            String nodesShrink = shrink(nodes, "Nodes", "json");
            this.putBodyParameter("Nodes", nodesShrink);
            this.nodes = nodes;
            return this;
        }

        @Override
        public RebootNodesRequest build() {
            return new RebootNodesRequest(this);
        } 

    } 

}
