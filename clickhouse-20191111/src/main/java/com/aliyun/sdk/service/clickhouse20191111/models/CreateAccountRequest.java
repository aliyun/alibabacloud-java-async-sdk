// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountDescription")
    private String accountDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateAccountRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountDescription
     */
    public String getAccountDescription() {
        return this.accountDescription;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateAccountRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String accountPassword; 
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountRequest request) {
            super(request);
            this.accountDescription = request.accountDescription;
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The description of the database account.</p>
         * <blockquote>
         * <ul>
         * <li>It cannot start with http:// or https://.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>It must be 0 to 256 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ceshi</p>
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * <p>The database account name.</p>
         * <blockquote>
         * <ul>
         * <li>The name must be unique.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>It can contain lowercase letters, digits, and underscores (_).</li>
         * <li>It must start with a lowercase letter and end with a lowercase letter or digit.</li>
         * <li>It must be 2 to 64 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * <blockquote>
         * <ul>
         * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Special characters include !@#$%^&amp;*()_+-=</li>
         * <li>It must be 8 to 32 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123789Ff!</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

}
