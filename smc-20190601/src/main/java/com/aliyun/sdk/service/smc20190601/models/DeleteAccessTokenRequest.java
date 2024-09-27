// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>DeleteAccessTokenRequest</p>
 */
public class DeleteAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessTokenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessTokenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private DeleteAccessTokenRequest(Builder builder) {
        super(builder);
        this.accessTokenId = builder.accessTokenId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAccessTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessTokenId
     */
    public String getAccessTokenId() {
        return this.accessTokenId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<DeleteAccessTokenRequest, Builder> {
        private String accessTokenId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAccessTokenRequest request) {
            super(request);
            this.accessTokenId = request.accessTokenId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * <p>The ID of the activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>at-bp1akz2zp67r0k6r****</p>
         */
        public Builder accessTokenId(String accessTokenId) {
            this.putQueryParameter("AccessTokenId", accessTokenId);
            this.accessTokenId = accessTokenId;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        @Override
        public DeleteAccessTokenRequest build() {
            return new DeleteAccessTokenRequest(this);
        } 

    } 

}
