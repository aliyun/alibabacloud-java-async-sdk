// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>ChangeResourceManagerResourceGroup</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
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
