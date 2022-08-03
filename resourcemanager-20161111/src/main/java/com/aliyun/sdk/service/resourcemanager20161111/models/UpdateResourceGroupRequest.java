// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

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
    @NameInMap("AccountId")
    private String accountId;

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
        this.accountId = builder.accountId;
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
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
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
        private String accountId; 
        private String newDisplayName; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceGroupRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.newDisplayName = request.newDisplayName;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * NewDisplayName.
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * ResourceGroupId.
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
