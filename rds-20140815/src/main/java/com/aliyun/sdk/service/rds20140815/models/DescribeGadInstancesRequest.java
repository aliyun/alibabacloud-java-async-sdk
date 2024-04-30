// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGadInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGadInstancesRequest</p>
 */
public class DescribeGadInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GadInstanceName")
    private String gadInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeGadInstancesRequest(Builder builder) {
        super(builder);
        this.gadInstanceName = builder.gadInstanceName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGadInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gadInstanceName
     */
    public String getGadInstanceName() {
        return this.gadInstanceName;
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

    public static final class Builder extends Request.Builder<DescribeGadInstancesRequest, Builder> {
        private String gadInstanceName; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGadInstancesRequest request) {
            super(request);
            this.gadInstanceName = request.gadInstanceName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the global active database cluster.
         * <p>
         * 
         * *   If you leave this parameter empty, this operation returns the details about all global active database clusters that are created within your Alibaba Cloud account.
         * *   If you specify this parameter, this operation returns the details about the global active database cluster that you specify.
         * 
         * >  If you do not specify this parameter when you call this operation for the first time, the IDs of all clusters that are created by using the current account are returned. Then, you can specify the cluster ID to view the cluster details.
         */
        public Builder gadInstanceName(String gadInstanceName) {
            this.putQueryParameter("GadInstanceName", gadInstanceName);
            this.gadInstanceName = gadInstanceName;
            return this;
        }

        /**
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeGadInstancesRequest build() {
            return new DescribeGadInstancesRequest(this);
        } 

    } 

}
