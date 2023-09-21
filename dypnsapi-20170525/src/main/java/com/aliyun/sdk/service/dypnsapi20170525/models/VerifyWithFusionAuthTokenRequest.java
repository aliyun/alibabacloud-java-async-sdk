// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyWithFusionAuthTokenRequest} extends {@link RequestModel}
 *
 * <p>VerifyWithFusionAuthTokenRequest</p>
 */
public class VerifyWithFusionAuthTokenRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VerifyToken")
    @Validation(required = true)
    private String verifyToken;

    private VerifyWithFusionAuthTokenRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.verifyToken = builder.verifyToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWithFusionAuthTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return verifyToken
     */
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public static final class Builder extends Request.Builder<VerifyWithFusionAuthTokenRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String verifyToken; 

        private Builder() {
            super();
        } 

        private Builder(VerifyWithFusionAuthTokenRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.verifyToken = request.verifyToken;
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * VerifyToken.
         */
        public Builder verifyToken(String verifyToken) {
            this.putQueryParameter("VerifyToken", verifyToken);
            this.verifyToken = verifyToken;
            return this;
        }

        @Override
        public VerifyWithFusionAuthTokenRequest build() {
            return new VerifyWithFusionAuthTokenRequest(this);
        } 

    } 

}
