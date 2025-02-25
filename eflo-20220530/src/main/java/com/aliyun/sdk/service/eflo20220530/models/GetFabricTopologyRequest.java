// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetFabricTopologyRequest} extends {@link RequestModel}
 *
 * <p>GetFabricTopologyRequest</p>
 */
public class GetFabricTopologyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LniIds")
    private java.util.List<String> lniIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    private String vpdId;

    private GetFabricTopologyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.lniIds = builder.lniIds;
        this.nodeIds = builder.nodeIds;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFabricTopologyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return lniIds
     */
    public java.util.List<String> getLniIds() {
        return this.lniIds;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
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

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<GetFabricTopologyRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> lniIds; 
        private java.util.List<String> nodeIds; 
        private String regionId; 
        private String vpcId; 
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(GetFabricTopologyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.lniIds = request.lniIds;
            this.nodeIds = request.nodeIds;
            this.regionId = request.regionId;
            this.vpcId = request.vpcId;
            this.vpdId = request.vpdId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-169263721924****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Lingjun network interface controller ID List</p>
         */
        public Builder lniIds(java.util.List<String> lniIds) {
            this.putBodyParameter("LniIds", lniIds);
            this.lniIds = lniIds;
            return this;
        }

        /**
         * <p>Node ID list</p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-k8i0g9fk68t7u0u2w****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>Lingjun CIDR block ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-aof7****</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public GetFabricTopologyRequest build() {
            return new GetFabricTopologyRequest(this);
        } 

    } 

}
