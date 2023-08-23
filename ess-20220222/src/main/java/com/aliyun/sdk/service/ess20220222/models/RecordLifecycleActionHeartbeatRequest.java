// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecordLifecycleActionHeartbeatRequest} extends {@link RequestModel}
 *
 * <p>RecordLifecycleActionHeartbeatRequest</p>
 */
public class RecordLifecycleActionHeartbeatRequest extends Request {
    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("heartbeatTimeout")
    private Integer heartbeatTimeout;

    @Query
    @NameInMap("lifecycleActionToken")
    @Validation(required = true)
    private String lifecycleActionToken;

    @Query
    @NameInMap("lifecycleHookId")
    @Validation(required = true)
    private String lifecycleHookId;

    private RecordLifecycleActionHeartbeatRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.heartbeatTimeout = builder.heartbeatTimeout;
        this.lifecycleActionToken = builder.lifecycleActionToken;
        this.lifecycleHookId = builder.lifecycleHookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecordLifecycleActionHeartbeatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return heartbeatTimeout
     */
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
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

    public static final class Builder extends Request.Builder<RecordLifecycleActionHeartbeatRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Integer heartbeatTimeout; 
        private String lifecycleActionToken; 
        private String lifecycleHookId; 

        private Builder() {
            super();
        } 

        private Builder(RecordLifecycleActionHeartbeatRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.heartbeatTimeout = request.heartbeatTimeout;
            this.lifecycleActionToken = request.lifecycleActionToken;
            this.lifecycleHookId = request.lifecycleHookId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * heartbeatTimeout.
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            this.putQueryParameter("heartbeatTimeout", heartbeatTimeout);
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * lifecycleActionToken.
         */
        public Builder lifecycleActionToken(String lifecycleActionToken) {
            this.putQueryParameter("lifecycleActionToken", lifecycleActionToken);
            this.lifecycleActionToken = lifecycleActionToken;
            return this;
        }

        /**
         * lifecycleHookId.
         */
        public Builder lifecycleHookId(String lifecycleHookId) {
            this.putQueryParameter("lifecycleHookId", lifecycleHookId);
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }

        @Override
        public RecordLifecycleActionHeartbeatRequest build() {
            return new RecordLifecycleActionHeartbeatRequest(this);
        } 

    } 

}
