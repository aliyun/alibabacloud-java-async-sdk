// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAutoScalingPolicyRequest} extends {@link RequestModel}
 *
 * <p>PutAutoScalingPolicyRequest</p>
 */
public class PutAutoScalingPolicyRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Constraints")
    private ScalingConstraints constraints;

    @Query
    @NameInMap("NodeGroupId")
    @Validation(required = true)
    private String nodeGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScalingRules")
    private java.util.List < ScalingRule > scalingRules;

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
    public java.util.List < ScalingRule > getScalingRules() {
        return this.scalingRules;
    }

    public static final class Builder extends Request.Builder<PutAutoScalingPolicyRequest, Builder> {
        private String clusterId; 
        private ScalingConstraints constraints; 
        private String nodeGroupId; 
        private String regionId; 
        private java.util.List < ScalingRule > scalingRules; 

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
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 最大最小值约束。
         */
        public Builder constraints(ScalingConstraints constraints) {
            this.putQueryParameter("Constraints", constraints);
            this.constraints = constraints;
            return this;
        }

        /**
         * 节点组ID。节点组 Id-针对 ACK 集群，此字段为空。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 弹性伸缩规则描述列表。
         * <p>
         * <p>
         */
        public Builder scalingRules(java.util.List < ScalingRule > scalingRules) {
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
