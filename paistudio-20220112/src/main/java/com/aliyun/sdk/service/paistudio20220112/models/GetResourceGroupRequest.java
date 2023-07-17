// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>GetResourceGroupRequest</p>
 */
public class GetResourceGroupRequest extends Request {
    @Path
    @NameInMap("ResourceGroupID")
    @Validation(required = true)
    private String resourceGroupID;

    @Query
    @NameInMap("IsAIWorkspaceDataEnabled")
    private Boolean isAIWorkspaceDataEnabled;

    private GetResourceGroupRequest(Builder builder) {
        super(builder);
        this.resourceGroupID = builder.resourceGroupID;
        this.isAIWorkspaceDataEnabled = builder.isAIWorkspaceDataEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return isAIWorkspaceDataEnabled
     */
    public Boolean getIsAIWorkspaceDataEnabled() {
        return this.isAIWorkspaceDataEnabled;
    }

    public static final class Builder extends Request.Builder<GetResourceGroupRequest, Builder> {
        private String resourceGroupID; 
        private Boolean isAIWorkspaceDataEnabled; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceGroupRequest request) {
            super(request);
            this.resourceGroupID = request.resourceGroupID;
            this.isAIWorkspaceDataEnabled = request.isAIWorkspaceDataEnabled;
        } 

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putPathParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * IsAIWorkspaceDataEnabled.
         */
        public Builder isAIWorkspaceDataEnabled(Boolean isAIWorkspaceDataEnabled) {
            this.putQueryParameter("IsAIWorkspaceDataEnabled", isAIWorkspaceDataEnabled);
            this.isAIWorkspaceDataEnabled = isAIWorkspaceDataEnabled;
            return this;
        }

        @Override
        public GetResourceGroupRequest build() {
            return new GetResourceGroupRequest(this);
        } 

    } 

}
