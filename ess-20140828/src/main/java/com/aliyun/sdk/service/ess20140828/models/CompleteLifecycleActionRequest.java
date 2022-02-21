// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteLifecycleActionRequest} extends {@link RequestModel}
 *
 * <p>CompleteLifecycleActionRequest</p>
 */
public class CompleteLifecycleActionRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("LifecycleActionResult")
    private String lifecycleActionResult;

    @Query
    @NameInMap("LifecycleActionToken")
    @Validation(required = true)
    private String lifecycleActionToken;

    @Query
    @NameInMap("LifecycleHookId")
    @Validation(required = true)
    private String lifecycleHookId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private CompleteLifecycleActionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.lifecycleActionResult = builder.lifecycleActionResult;
        this.lifecycleActionToken = builder.lifecycleActionToken;
        this.lifecycleHookId = builder.lifecycleHookId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteLifecycleActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return lifecycleActionResult
     */
    public String getLifecycleActionResult() {
        return this.lifecycleActionResult;
    }

    /**
     * @return lifecycleActionToken
     */
    public String getLifecycleActionToken() {
        return this.lifecycleActionToken;
    }

    /**
     * @return lifecycleHookId
     */
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
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
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<CompleteLifecycleActionRequest, Builder> {
        private String clientToken; 
        private String lifecycleActionResult; 
        private String lifecycleActionToken; 
        private String lifecycleHookId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(CompleteLifecycleActionRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.lifecycleActionResult = response.lifecycleActionResult;
            this.lifecycleActionToken = response.lifecycleActionToken;
            this.lifecycleHookId = response.lifecycleHookId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * LifecycleActionResult.
         */
        public Builder lifecycleActionResult(String lifecycleActionResult) {
            this.putQueryParameter("LifecycleActionResult", lifecycleActionResult);
            this.lifecycleActionResult = lifecycleActionResult;
            return this;
        }

        /**
         * LifecycleActionToken.
         */
        public Builder lifecycleActionToken(String lifecycleActionToken) {
            this.putQueryParameter("LifecycleActionToken", lifecycleActionToken);
            this.lifecycleActionToken = lifecycleActionToken;
            return this;
        }

        /**
         * LifecycleHookId.
         */
        public Builder lifecycleHookId(String lifecycleHookId) {
            this.putQueryParameter("LifecycleHookId", lifecycleHookId);
            this.lifecycleHookId = lifecycleHookId;
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
        public CompleteLifecycleActionRequest build() {
            return new CompleteLifecycleActionRequest(this);
        } 

    } 

}
