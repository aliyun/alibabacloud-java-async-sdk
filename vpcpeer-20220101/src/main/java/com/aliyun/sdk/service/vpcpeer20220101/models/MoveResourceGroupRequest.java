// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

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
 * {@link MoveResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>MoveResourceGroupRequest</p>
 */
public class MoveResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private MoveResourceGroupRequest(Builder builder) {
        super(builder);
        this.newResourceGroupId = builder.newResourceGroupId;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newResourceGroupId
     */
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<MoveResourceGroupRequest, Builder> {
        private String newResourceGroupId; 
        private String regionId; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(MoveResourceGroupRequest request) {
            super(request);
            this.newResourceGroupId = request.newResourceGroupId;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The ID of the new resource group.</p>
         * <blockquote>
         * <p> You can use resource groups to manage resources within your Alibaba Cloud account by group. This helps you resolve issues such as resource grouping and permission management for your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is resource management?</a></p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3peow3k****</p>
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.putQueryParameter("NewResourceGroupId", newResourceGroupId);
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * <p>The region ID of the resource.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the VPC peering connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pcc-gu32s92f9ytsk9****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource type. Set the value to <strong>PeerConnection</strong>, which specifies a VPC peering connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PeerConnection</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public MoveResourceGroupRequest build() {
            return new MoveResourceGroupRequest(this);
        } 

    } 

}
