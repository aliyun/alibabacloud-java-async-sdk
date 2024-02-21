// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingGroupV2Request} extends {@link RequestModel}
 *
 * <p>DescribeScalingGroupV2Request</p>
 */
public class DescribeScalingGroupV2Request extends Request {
    @Query
    @NameInMap("HostGroupBizId")
    private String hostGroupBizId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScalingGroupBizId")
    private String scalingGroupBizId;

    private DescribeScalingGroupV2Request(Builder builder) {
        super(builder);
        this.hostGroupBizId = builder.hostGroupBizId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingGroupBizId = builder.scalingGroupBizId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostGroupBizId
     */
    public String getHostGroupBizId() {
        return this.hostGroupBizId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scalingGroupBizId
     */
    public String getScalingGroupBizId() {
        return this.scalingGroupBizId;
    }

    public static final class Builder extends Request.Builder<DescribeScalingGroupV2Request, Builder> {
        private String hostGroupBizId; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String scalingGroupBizId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingGroupV2Request request) {
            super(request);
            this.hostGroupBizId = request.hostGroupBizId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingGroupBizId = request.scalingGroupBizId;
        } 

        /**
         * HostGroupBizId.
         */
        public Builder hostGroupBizId(String hostGroupBizId) {
            this.putQueryParameter("HostGroupBizId", hostGroupBizId);
            this.hostGroupBizId = hostGroupBizId;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * ScalingGroupBizId.
         */
        public Builder scalingGroupBizId(String scalingGroupBizId) {
            this.putQueryParameter("ScalingGroupBizId", scalingGroupBizId);
            this.scalingGroupBizId = scalingGroupBizId;
            return this;
        }

        @Override
        public DescribeScalingGroupV2Request build() {
            return new DescribeScalingGroupV2Request(this);
        } 

    } 

}
