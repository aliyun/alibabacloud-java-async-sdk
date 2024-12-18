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
 * {@link DescribeHostGroupElasticStrategyParametersRequest} extends {@link RequestModel}
 *
 * <p>DescribeHostGroupElasticStrategyParametersRequest</p>
 */
public class DescribeHostGroupElasticStrategyParametersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dedicatedHostGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
         * <p>The name of the dedicated cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-d0dwi82293b2w9t5</p>
         */
        public Builder dedicatedHostGroupName(String dedicatedHostGroupName) {
            this.putQueryParameter("DedicatedHostGroupName", dedicatedHostGroupName);
            this.dedicatedHostGroupName = dedicatedHostGroupName;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
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
