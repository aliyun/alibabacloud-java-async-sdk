// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>MoveResourceGroupRequest</p>
 */
public class MoveResourceGroupRequest extends Request {
    @Query
    @NameInMap("NewResourceGroupId")
    @Validation(required = true)
    private String newResourceGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
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
         * The ID of the destination resource group.
         * <p>
         * 
         * For more information about resource groups, see [What is a resource group?](~~94475~~)
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.putQueryParameter("NewResourceGroupId", newResourceGroupId);
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * The region ID of the resource.
         * <p>
         * 
         * You can call the [DescribeRegions](~~131035~~) operation to query region IDs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * *   stack
         * *   stackgroup
         * *   template
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
