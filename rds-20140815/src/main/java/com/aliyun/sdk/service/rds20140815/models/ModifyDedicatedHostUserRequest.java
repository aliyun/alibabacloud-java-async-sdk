// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostUserRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedHostUserRequest</p>
 */
public class ModifyDedicatedHostUserRequest extends Request {
    @Query
    @NameInMap("DedicatedHostName")
    @Validation(required = true)
    private String dedicatedHostName;

    @Query
    @NameInMap("NewPassword")
    @Validation(required = true)
    private String newPassword;

    @Query
    @NameInMap("OldPassword")
    @Validation(required = true)
    private String oldPassword;

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
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private ModifyDedicatedHostUserRequest(Builder builder) {
        super(builder);
        this.dedicatedHostName = builder.dedicatedHostName;
        this.newPassword = builder.newPassword;
        this.oldPassword = builder.oldPassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedHostUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dedicatedHostName
     */
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    /**
     * @return newPassword
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * @return oldPassword
     */
    public String getOldPassword() {
        return this.oldPassword;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ModifyDedicatedHostUserRequest, Builder> {
        private String dedicatedHostName; 
        private String newPassword; 
        private String oldPassword; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedHostUserRequest response) {
            super(response);
            this.dedicatedHostName = response.dedicatedHostName;
            this.newPassword = response.newPassword;
            this.oldPassword = response.oldPassword;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.userName = response.userName;
        } 

        /**
         * DedicatedHostName.
         */
        public Builder dedicatedHostName(String dedicatedHostName) {
            this.putQueryParameter("DedicatedHostName", dedicatedHostName);
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }

        /**
         * NewPassword.
         */
        public Builder newPassword(String newPassword) {
            this.putQueryParameter("NewPassword", newPassword);
            this.newPassword = newPassword;
            return this;
        }

        /**
         * OldPassword.
         */
        public Builder oldPassword(String oldPassword) {
            this.putQueryParameter("OldPassword", oldPassword);
            this.oldPassword = oldPassword;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ModifyDedicatedHostUserRequest build() {
            return new ModifyDedicatedHostUserRequest(this);
        } 

    } 

}
