// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkspaceResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkspaceResourceRequest</p>
 */
public class DeleteWorkspaceResourceRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    @Query
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("Option")
    private String option;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private DeleteWorkspaceResourceRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.groupName = builder.groupName;
        this.option = builder.option;
        this.productType = builder.productType;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceResourceRequest create() {
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
     * @return option
     */
    public String getOption() {
        return this.option;
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

    public static final class Builder extends Request.Builder<DeleteWorkspaceResourceRequest, Builder> {
        private String workspaceId; 
        private String groupName; 
        private String option; 
        private String productType; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkspaceResourceRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.groupName = request.groupName;
            this.option = request.option;
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
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Option.
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DeleteWorkspaceResourceRequest build() {
            return new DeleteWorkspaceResourceRequest(this);
        } 

    } 

}
