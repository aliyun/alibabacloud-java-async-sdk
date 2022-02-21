// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingActivityRequest} extends {@link RequestModel}
 *
 * <p>DescribeScalingActivityRequest</p>
 */
public class DescribeScalingActivityRequest extends Request {
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
    @NameInMap("ScalingActivityId")
    @Validation(required = true)
    private String scalingActivityId;

    private DescribeScalingActivityRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.hostGroupId = builder.hostGroupId;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingActivityRequest create() {
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
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder extends Request.Builder<DescribeScalingActivityRequest, Builder> {
        private String clusterId; 
        private String hostGroupId; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String scalingActivityId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeScalingActivityRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.hostGroupId = response.hostGroupId;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingActivityId = response.scalingActivityId;
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
         * ScalingActivityId.
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.putQueryParameter("ScalingActivityId", scalingActivityId);
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        @Override
        public DescribeScalingActivityRequest build() {
            return new DescribeScalingActivityRequest(this);
        } 

    } 

}
