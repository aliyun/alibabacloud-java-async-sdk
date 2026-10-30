// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link DescribeInstanceSpecsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceSpecsRequest</p>
 */
public class DescribeInstanceSpecsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeInstanceSpecsRequest(Builder builder) {
        super(builder);
        this.instanceIdList = builder.instanceIdList;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdList
     */
    public String getInstanceIdList() {
        return this.instanceIdList;
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

    public static final class Builder extends Request.Builder<DescribeInstanceSpecsRequest, Builder> {
        private String instanceIdList; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceSpecsRequest request) {
            super(request);
            this.instanceIdList = request.instanceIdList;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The IDs of the Anti-DDoS Origin instances to query. The value is a JSON array converted to a string. Each element in the JSON array represents an instance ID in string format. Multiple IDs are separated by commas (,).</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances in a specified region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ddosbgp-cn-n6w1r7nz****&quot;]</p>
         */
        public Builder instanceIdList(String instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * <p>The region ID of the Anti-DDoS Origin instance. Default value: <strong>cn-hangzhou</strong>, which indicates the China (Hangzhou) region.</p>
         * <blockquote>
         * <p>If your instance is not in the China (Hangzhou) region, you must specify the region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query all region IDs.</p>
         * </blockquote>
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
         * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management. Default value: empty, which indicates the default resource group.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeInstanceSpecsRequest build() {
            return new DescribeInstanceSpecsRequest(this);
        } 

    } 

}
