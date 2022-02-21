// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLifecycleHookRequest} extends {@link RequestModel}
 *
 * <p>ModifyLifecycleHookRequest</p>
 */
public class ModifyLifecycleHookRequest extends Request {
    @Query
    @NameInMap("DefaultResult")
    private String defaultResult;

    @Query
    @NameInMap("HeartbeatTimeout")
    private Integer heartbeatTimeout;

    @Query
    @NameInMap("LifecycleHookId")
    private String lifecycleHookId;

    @Query
    @NameInMap("LifecycleHookName")
    private String lifecycleHookName;

    @Query
    @NameInMap("LifecycleTransition")
    private String lifecycleTransition;

    @Query
    @NameInMap("NotificationArn")
    private String notificationArn;

    @Query
    @NameInMap("NotificationMetadata")
    private String notificationMetadata;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScalingGroupId")
    private String scalingGroupId;

    private ModifyLifecycleHookRequest(Builder builder) {
        super(builder);
        this.defaultResult = builder.defaultResult;
        this.heartbeatTimeout = builder.heartbeatTimeout;
        this.lifecycleHookId = builder.lifecycleHookId;
        this.lifecycleHookName = builder.lifecycleHookName;
        this.lifecycleTransition = builder.lifecycleTransition;
        this.notificationArn = builder.notificationArn;
        this.notificationMetadata = builder.notificationMetadata;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLifecycleHookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultResult
     */
    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * @return heartbeatTimeout
     */
    public Integer getHeartbeatTimeout() {
        return this.heartbeatTimeout;
    }

    /**
     * @return lifecycleHookId
     */
    public String getLifecycleHookId() {
        return this.lifecycleHookId;
    }

    /**
     * @return lifecycleHookName
     */
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    /**
     * @return lifecycleTransition
     */
    public String getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * @return notificationArn
     */
    public String getNotificationArn() {
        return this.notificationArn;
    }

    /**
     * @return notificationMetadata
     */
    public String getNotificationMetadata() {
        return this.notificationMetadata;
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

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyLifecycleHookRequest, Builder> {
        private String defaultResult; 
        private Integer heartbeatTimeout; 
        private String lifecycleHookId; 
        private String lifecycleHookName; 
        private String lifecycleTransition; 
        private String notificationArn; 
        private String notificationMetadata; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLifecycleHookRequest response) {
            super(response);
            this.defaultResult = response.defaultResult;
            this.heartbeatTimeout = response.heartbeatTimeout;
            this.lifecycleHookId = response.lifecycleHookId;
            this.lifecycleHookName = response.lifecycleHookName;
            this.lifecycleTransition = response.lifecycleTransition;
            this.notificationArn = response.notificationArn;
            this.notificationMetadata = response.notificationMetadata;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scalingGroupId = response.scalingGroupId;
        } 

        /**
         * DefaultResult.
         */
        public Builder defaultResult(String defaultResult) {
            this.putQueryParameter("DefaultResult", defaultResult);
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * HeartbeatTimeout.
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            this.putQueryParameter("HeartbeatTimeout", heartbeatTimeout);
            this.heartbeatTimeout = heartbeatTimeout;
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
         * LifecycleHookName.
         */
        public Builder lifecycleHookName(String lifecycleHookName) {
            this.putQueryParameter("LifecycleHookName", lifecycleHookName);
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }

        /**
         * LifecycleTransition.
         */
        public Builder lifecycleTransition(String lifecycleTransition) {
            this.putQueryParameter("LifecycleTransition", lifecycleTransition);
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * NotificationArn.
         */
        public Builder notificationArn(String notificationArn) {
            this.putQueryParameter("NotificationArn", notificationArn);
            this.notificationArn = notificationArn;
            return this;
        }

        /**
         * NotificationMetadata.
         */
        public Builder notificationMetadata(String notificationMetadata) {
            this.putQueryParameter("NotificationMetadata", notificationMetadata);
            this.notificationMetadata = notificationMetadata;
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

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        @Override
        public ModifyLifecycleHookRequest build() {
            return new ModifyLifecycleHookRequest(this);
        } 

    } 

}
