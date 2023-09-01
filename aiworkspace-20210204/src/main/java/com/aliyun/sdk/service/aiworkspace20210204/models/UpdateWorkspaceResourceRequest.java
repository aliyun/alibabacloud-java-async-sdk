// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkspaceResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceResourceRequest</p>
 */
public class UpdateWorkspaceResourceRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    @Body
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Body
    @NameInMap("IsDefault")
    private Boolean isDefault;

    @Body
    @NameInMap("ProductType")
    private String productType;

    @Body
    @NameInMap("ResourceType")
    private String resourceType;

    private UpdateWorkspaceResourceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.groupName = builder.groupName;
        this.isDefault = builder.isDefault;
        this.productType = builder.productType;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceResourceRequest, Builder> {
        private String workspaceId; 
        private String groupName; 
        private Boolean isDefault; 
        private String productType; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceResourceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.groupName = request.groupName;
            this.isDefault = request.isDefault;
            this.productType = request.productType;
            this.resourceType = request.resourceType;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * IsDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.putBodyParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public UpdateWorkspaceResourceRequest build() {
            return new UpdateWorkspaceResourceRequest(this);
        } 

    } 

}
