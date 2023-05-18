// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceGroupRequest</p>
 */
public class UpdateResourceGroupRequest extends Request {
    @Query
    @NameInMap("NewDisplayName")
    @Validation(required = true)
    private String newDisplayName;

    @Query
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    private String resourceGroupId;

    private UpdateResourceGroupRequest(Builder builder) {
        super(builder);
        this.newDisplayName = builder.newDisplayName;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newDisplayName
     */
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateResourceGroupRequest, Builder> {
        private String newDisplayName; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceGroupRequest request) {
            super(request);
            this.newDisplayName = request.newDisplayName;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The display name of the resource group.
         * <p>
         * 
         * The name must be 1 to 50 characters in length.
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * The ID of the resource group.
         * <p>
         * 
         * You can call the [ListResourceGroups](~~158855~~) operation to obtain the ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public UpdateResourceGroupRequest build() {
            return new UpdateResourceGroupRequest(this);
        } 

    } 

}
