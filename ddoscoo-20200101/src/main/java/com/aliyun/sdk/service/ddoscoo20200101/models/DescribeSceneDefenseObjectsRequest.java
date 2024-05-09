// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneDefenseObjectsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSceneDefenseObjectsRequest</p>
 */
public class DescribeSceneDefenseObjectsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeSceneDefenseObjectsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.policyId = builder.policyId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneDefenseObjectsRequest create() {
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
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeSceneDefenseObjectsRequest, Builder> {
        private String regionId; 
        private String policyId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSceneDefenseObjectsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.policyId = request.policyId;
            this.resourceGroupId = request.resourceGroupId;
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
         * The ID of the policy that you want to query.
         * <p>
         * 
         * > You can call the [DescribeSceneDefensePolicies](~~159382~~) operation to query the IDs of all policies.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management.
         * <p>
         * 
         * If you do not configure this parameter, the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeSceneDefenseObjectsRequest build() {
            return new DescribeSceneDefenseObjectsRequest(this);
        } 

    } 

}
