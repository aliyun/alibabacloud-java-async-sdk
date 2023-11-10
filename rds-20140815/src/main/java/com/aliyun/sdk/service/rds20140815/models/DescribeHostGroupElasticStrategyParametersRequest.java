// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostGroupElasticStrategyParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeHostGroupElasticStrategyParametersRequest</p>
 */
public class DescribeHostGroupElasticStrategyParametersRequest extends Request {
    @Query
    @NameInMap("DedicatedHostGroupName")
    @Validation(required = true)
    private String dedicatedHostGroupName;

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

    private DescribeHostGroupElasticStrategyParametersRequest(Builder builder) {
        super(builder);
        this.dedicatedHostGroupName = builder.dedicatedHostGroupName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHostGroupElasticStrategyParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dedicatedHostGroupName
     */
    public String getDedicatedHostGroupName() {
        return this.dedicatedHostGroupName;
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

    public static final class Builder extends Request.Builder<DescribeHostGroupElasticStrategyParametersRequest, Builder> {
        private String dedicatedHostGroupName; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHostGroupElasticStrategyParametersRequest request) {
            super(request);
            this.dedicatedHostGroupName = request.dedicatedHostGroupName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The name of the dedicated cluster.
         */
        public Builder dedicatedHostGroupName(String dedicatedHostGroupName) {
            this.putQueryParameter("DedicatedHostGroupName", dedicatedHostGroupName);
            this.dedicatedHostGroupName = dedicatedHostGroupName;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID.
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

        @Override
        public DescribeHostGroupElasticStrategyParametersRequest build() {
            return new DescribeHostGroupElasticStrategyParametersRequest(this);
        } 

    } 

}
