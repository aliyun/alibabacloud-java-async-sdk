// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DeleteRCClusterNodesRequest} extends {@link RequestModel}
 *
 * <p>DeleteRCClusterNodesRequest</p>
 */
public class DeleteRCClusterNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<String> nodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DeleteRCClusterNodesRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.nodes = builder.nodes;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRCClusterNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return nodes
     */
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DeleteRCClusterNodesRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private java.util.List<String> nodes; 
        private String regionId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRCClusterNodesRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.nodes = request.nodes;
            this.regionId = request.regionId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The instance IDs.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "simple");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The node information.</p>
         */
        public Builder nodes(java.util.List<String> nodes) {
            String nodesShrink = shrink(nodes, "Nodes", "simple");
            this.putQueryParameter("Nodes", nodesShrink);
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * <blockquote>
         * <p> This is a reserved parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DeleteRCClusterNodesRequest build() {
            return new DeleteRCClusterNodesRequest(this);
        } 

    } 

}
