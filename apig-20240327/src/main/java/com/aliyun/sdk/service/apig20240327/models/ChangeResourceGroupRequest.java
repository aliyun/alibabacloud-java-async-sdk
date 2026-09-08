// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ChangeResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ChangeResourceGroupRequest</p>
 */
public class ChangeResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Service")
    private String service;

    private ChangeResourceGroupRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResourceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder extends Request.Builder<ChangeResourceGroupRequest, Builder> {
        private String resourceGroupId; 
        private String resourceId; 
        private String resourceType; 
        private String service; 

        private Builder() {
            super();
        } 

        private Builder(ChangeResourceGroupRequest request) {
            super(request);
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.service = request.service;
        } 

        /**
         * <p>The ID of the destination resource group. You can view resource group IDs in the Resource Management console.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzuqyxxxxxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the resource to be moved. The value must match the specified ResourceType.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq2vmc93km41m3dm4bg0</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The resource type. The value is case-sensitive and must exactly match one of the valid values.</p>
         * 
         * <strong>example:</strong>
         * <p>Gateway</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The cloud service identifier. Fixed as APIG. You generally do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>APIG</p>
         */
        public Builder service(String service) {
            this.putQueryParameter("Service", service);
            this.service = service;
            return this;
        }

        @Override
        public ChangeResourceGroupRequest build() {
            return new ChangeResourceGroupRequest(this);
        } 

    } 

}
