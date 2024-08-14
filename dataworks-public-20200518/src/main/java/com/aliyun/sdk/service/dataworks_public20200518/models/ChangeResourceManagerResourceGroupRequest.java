// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeResourceManagerResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeResourceManagerResourceGroupRequest</p>
 */
public class ChangeResourceManagerResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private ChangeResourceManagerResourceGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResourceManagerResourceGroupRequest create() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ChangeResourceManagerResourceGroupRequest, Builder> {
        private String regionId; 
        private String resourceId; 
        private String resourceManagerResourceGroupId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ChangeResourceManagerResourceGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceType = request.resourceType;
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
         * The ID of the resource type.
         * <p>
         * 
         * *   If you set ResourceType to project, set this parameter to the value of ProjectIdentifier. You can call the [ListProjects](~~2780068~~) operation to obtain the value of ProjectIdentifier.
         * *   If you set ResourceType to tenantresourcegroup, set this parameter to the value of ResourceGroupType. You can call the [ListResourceGroups](~~2780075~~) operation to obtain the value of ResourceGroupType. Only the values 7, 8, and 9 are valid.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The ID of the new resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The resource type. Valid values:
         * <p>
         * 
         * *   project: workspace. If you want to change the resource group that you specify when you activate DataWorks, set the value to project.
         * *   tenantresourcegroup: exclusive resource group. If you want to change the resource group that you specify when you purchase a DataWorks exclusive resource group, set the value to tenantresourcegroup.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ChangeResourceManagerResourceGroupRequest build() {
            return new ChangeResourceManagerResourceGroupRequest(this);
        } 

    } 

}
