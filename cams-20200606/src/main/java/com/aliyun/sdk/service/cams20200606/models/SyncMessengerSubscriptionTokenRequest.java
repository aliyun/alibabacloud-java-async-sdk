// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link SyncMessengerSubscriptionTokenRequest} extends {@link RequestModel}
 *
 * <p>SyncMessengerSubscriptionTokenRequest</p>
 */
public class SyncMessengerSubscriptionTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAudienceId")
    private String customAudienceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tokenType;

    private SyncMessengerSubscriptionTokenRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.customAudienceId = builder.customAudienceId;
        this.ownerId = builder.ownerId;
        this.pageId = builder.pageId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tokenType = builder.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncMessengerSubscriptionTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return customAudienceId
     */
    public String getCustomAudienceId() {
        return this.customAudienceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageId
     */
    public String getPageId() {
        return this.pageId;
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
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tokenType
     */
    public String getTokenType() {
        return this.tokenType;
    }

    public static final class Builder extends Request.Builder<SyncMessengerSubscriptionTokenRequest, Builder> {
        private String custSpaceId; 
        private String customAudienceId; 
        private Long ownerId; 
        private String pageId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tokenType; 

        private Builder() {
            super();
        } 

        private Builder(SyncMessengerSubscriptionTokenRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.customAudienceId = request.customAudienceId;
            this.ownerId = request.ownerId;
            this.pageId = request.pageId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tokenType = request.tokenType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-xi****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * CustomAudienceId.
         */
        public Builder customAudienceId(String customAudienceId) {
            this.putQueryParameter("CustomAudienceId", customAudienceId);
            this.customAudienceId = customAudienceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2030***</p>
         */
        public Builder pageId(String pageId) {
            this.putQueryParameter("PageId", pageId);
            this.pageId = pageId;
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
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customAudience</p>
         */
        public Builder tokenType(String tokenType) {
            this.putQueryParameter("TokenType", tokenType);
            this.tokenType = tokenType;
            return this;
        }

        @Override
        public SyncMessengerSubscriptionTokenRequest build() {
            return new SyncMessengerSubscriptionTokenRequest(this);
        } 

    } 

}
