// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeScalingRuleRequest</p>
 */
public class DescribeScalingRuleRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("HostGroupId")
    private String hostGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScalingRuleId")
    @Validation(required = true)
    private String scalingRuleId;

    private DescribeScalingRuleRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.hostGroupId = builder.hostGroupId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingRuleId = builder.scalingRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingRuleRequest create() {
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
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scalingRuleId
     */
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public static final class Builder extends Request.Builder<DescribeScalingRuleRequest, Builder> {
        private String clusterId; 
        private String hostGroupId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String scalingRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingRuleRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.hostGroupId = response.hostGroupId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingRuleId = response.scalingRuleId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.putQueryParameter("HostGroupId", hostGroupId);
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ScalingRuleId.
         */
        public Builder scalingRuleId(String scalingRuleId) {
            this.putQueryParameter("ScalingRuleId", scalingRuleId);
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        @Override
        public DescribeScalingRuleRequest build() {
            return new DescribeScalingRuleRequest(this);
        } 

    } 

}
