// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link PutAutoScalingPolicyRequest} extends {@link RequestModel}
 *
 * <p>PutAutoScalingPolicyRequest</p>
 */
public class PutAutoScalingPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Constraints")
    private ScalingConstraints constraints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRules")
    private java.util.List<ScalingRule> scalingRules;

    private PutAutoScalingPolicyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.constraints = builder.constraints;
        this.nodeGroupId = builder.nodeGroupId;
        this.regionId = builder.regionId;
        this.scalingRules = builder.scalingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAutoScalingPolicyRequest create() {
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
     * @return constraints
     */
    public ScalingConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingRules
     */
    public java.util.List<ScalingRule> getScalingRules() {
        return this.scalingRules;
    }

    public static final class Builder extends Request.Builder<PutAutoScalingPolicyRequest, Builder> {
        private String clusterId; 
        private ScalingConstraints constraints; 
        private String nodeGroupId; 
        private String regionId; 
        private java.util.List<ScalingRule> scalingRules; 

        private Builder() {
            super();
        } 

        private Builder(PutAutoScalingPolicyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.constraints = request.constraints;
            this.nodeGroupId = request.nodeGroupId;
            this.regionId = request.regionId;
            this.scalingRules = request.scalingRules;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The constraints on the maximum and minimum numbers of nodes in a node group.</p>
         */
        public Builder constraints(ScalingConstraints constraints) {
            this.putQueryParameter("Constraints", constraints);
            this.constraints = constraints;
            return this;
        }

        /**
         * <p>The ID of the node group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
         * <p>The description list of auto scaling rules. Number of elements in the array: 0 to 100.</p>
         */
        public Builder scalingRules(java.util.List<ScalingRule> scalingRules) {
            this.putQueryParameter("ScalingRules", scalingRules);
            this.scalingRules = scalingRules;
            return this;
        }

        @Override
        public PutAutoScalingPolicyRequest build() {
            return new PutAutoScalingPolicyRequest(this);
        } 

    } 

}
