// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private MoveResourceGroupRequest(Builder builder) {
        super(builder);
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.resourceRegionId = builder.resourceRegionId;
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
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<MoveResourceGroupRequest, Builder> {
        private String resourceGroupId; 
        private String resourceId; 
        private String resourceRegionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(MoveResourceGroupRequest request) {
            super(request);
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3peow3k****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddos_originpre_public_cn-7213kxxxxx</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
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
