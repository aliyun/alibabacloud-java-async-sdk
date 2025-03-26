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
         * <p>The ID of the global active database cluster.</p>
         * <ul>
         * <li>If you leave this parameter empty, this operation returns the details about all global active database clusters that are created within your Alibaba Cloud account.</li>
         * <li>If you specify this parameter, this operation returns the details about the global active database cluster that you specify.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter when you call this operation for the first time, the IDs of all clusters that are created by using the current account are returned. Then, you can specify the cluster ID to view the cluster details.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gad-rm-bp1npi2j8********</p>
         */
        public Builder gadInstanceName(String gadInstanceName) {
            this.putQueryParameter("GadInstanceName", gadInstanceName);
            this.gadInstanceName = gadInstanceName;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
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
