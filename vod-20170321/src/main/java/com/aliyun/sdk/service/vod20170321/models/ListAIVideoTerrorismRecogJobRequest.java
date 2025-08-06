// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListAIVideoTerrorismRecogJobRequest} extends {@link RequestModel}
 *
 * <p>ListAIVideoTerrorismRecogJobRequest</p>
 */
public class ListAIVideoTerrorismRecogJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIVideoTerrorismRecogJobIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIVideoTerrorismRecogJobIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    private ListAIVideoTerrorismRecogJobRequest(Builder builder) {
        super(builder);
        this.AIVideoTerrorismRecogJobIds = builder.AIVideoTerrorismRecogJobIds;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIVideoTerrorismRecogJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIVideoTerrorismRecogJobIds
     */
    public String getAIVideoTerrorismRecogJobIds() {
        return this.AIVideoTerrorismRecogJobIds;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ListAIVideoTerrorismRecogJobRequest, Builder> {
        private String AIVideoTerrorismRecogJobIds; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ListAIVideoTerrorismRecogJobRequest request) {
            super(request);
            this.AIVideoTerrorismRecogJobIds = request.AIVideoTerrorismRecogJobIds;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder AIVideoTerrorismRecogJobIds(String AIVideoTerrorismRecogJobIds) {
            this.putQueryParameter("AIVideoTerrorismRecogJobIds", AIVideoTerrorismRecogJobIds);
            this.AIVideoTerrorismRecogJobIds = AIVideoTerrorismRecogJobIds;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ListAIVideoTerrorismRecogJobRequest build() {
            return new ListAIVideoTerrorismRecogJobRequest(this);
        } 

    } 

}
