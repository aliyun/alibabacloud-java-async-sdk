// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeResourceGroupRequest</p>
 */
public class AuthorizeResourceGroupRequest extends Request {
    @Query
    @NameInMap("ResourceGroupIds")
    @Validation(required = true)
    private String resourceGroupIds;

    @Query
    @NameInMap("TargetUserId")
    @Validation(required = true)
    private String targetUserId;

    private AuthorizeResourceGroupRequest(Builder builder) {
        super(builder);
        this.resourceGroupIds = builder.resourceGroupIds;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupIds
     */
    public String getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<AuthorizeResourceGroupRequest, Builder> {
        private String resourceGroupIds; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeResourceGroupRequest request) {
            super(request);
            this.resourceGroupIds = request.resourceGroupIds;
            this.targetUserId = request.targetUserId;
        } 

        /**
         * The ID of the resource group. You can call the ListResourceGroup operation to query the resource group ID. For more information, see [ListResourceGroup](~~62055~~).
         * <p>
         * 
         * You can specify multiple resource group IDs. Separate multiple resource group IDs with semicolons (;).
         */
        public Builder resourceGroupIds(String resourceGroupIds) {
            this.putQueryParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        /**
         * The ID of the RAM user to be authorized.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public AuthorizeResourceGroupRequest build() {
            return new AuthorizeResourceGroupRequest(this);
        } 

    } 

}
