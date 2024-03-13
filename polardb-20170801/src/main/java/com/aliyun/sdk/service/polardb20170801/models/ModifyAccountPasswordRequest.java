// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountPasswordRequest</p>
 */
public class ModifyAccountPasswordRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("NewAccountPassword")
    @Validation(required = true)
    private String newAccountPassword;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PasswordType")
    private String passwordType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyAccountPasswordRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.DBClusterId = builder.DBClusterId;
        this.newAccountPassword = builder.newAccountPassword;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.passwordType = builder.passwordType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return newAccountPassword
     */
    public String getNewAccountPassword() {
        return this.newAccountPassword;
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
     * @return passwordType
     */
    public String getPasswordType() {
        return this.passwordType;
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

    public static final class Builder extends Request.Builder<ModifyAccountPasswordRequest, Builder> {
        private String accountName; 
        private String DBClusterId; 
        private String newAccountPassword; 
        private String ownerAccount; 
        private Long ownerId; 
        private String passwordType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountPasswordRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.DBClusterId = request.DBClusterId;
            this.newAccountPassword = request.newAccountPassword;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.passwordType = request.passwordType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The username of the account.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The new password of the account. The new password must meet the following requirements:
         * <p>
         * 
         * *   It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         * *   It must be 8 to 32 characters in length.
         * *   Special characters include `! @ # $ % ^ & * ( ) _ + - =`
         */
        public Builder newAccountPassword(String newAccountPassword) {
            this.putQueryParameter("NewAccountPassword", newAccountPassword);
            this.newAccountPassword = newAccountPassword;
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
         * PasswordType.
         */
        public Builder passwordType(String passwordType) {
            this.putQueryParameter("PasswordType", passwordType);
            this.passwordType = passwordType;
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

        @Override
        public ModifyAccountPasswordRequest build() {
            return new ModifyAccountPasswordRequest(this);
        } 

    } 

}
