// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckPolicy")
    private Boolean checkPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

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
        this.accountType = builder.accountType;
        this.checkPolicy = builder.checkPolicy;
        this.DBInstanceId = builder.DBInstanceId;
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
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return checkPolicy
     */
    public Boolean getCheckPolicy() {
        return this.checkPolicy;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
        private String accountType; 
        private Boolean checkPolicy; 
        private String DBInstanceId; 
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
            this.accountType = request.accountType;
            this.checkPolicy = request.checkPolicy;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The description of the account. The value must be 2 to 256 characters in length. The value can contain letters, digits, underscores (_), and hyphens (-), and must start with a letter.</p>
         * <blockquote>
         * <p>: The name cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test Account A</p>
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * <ul>
         * <li><p>The name must be unique.</p>
         * </li>
         * <li><p>The name can contain lowercase letters, digits, and underscores (_). For MySQL databases, the name can contain uppercase letters.</p>
         * </li>
         * <li><p>The name must start with a letter and end with a letter or digit.</p>
         * </li>
         * <li><p>For MySQL databases, the name of the privileged account cannot be the same as that of the standard account. For example, if the name of the privileged account is <code>Test1</code>, the name of the standard account cannot be <code>test1</code>.</p>
         * </li>
         * <li><p>The length of the value must meet the following requirements:</p>
         * <ul>
         * <li>If the instance runs MySQL 5.7 or MySQL 8.0, the value must be 2 to 32 characters in length.</li>
         * <li>If the instance runs MySQL 5.6, the value must be 2 to 16 characters in length.</li>
         * <li>If the instance runs SQL Server, the value must be 2 to 64 characters in length.</li>
         * <li>If the instance runs PostgreSQL with cloud disks, the value must be 2 to 63 characters in length.</li>
         * <li>If the instance runs PostgreSQL with local disks, the value must be 2 to 16 characters in length.</li>
         * <li>If the instance runs MariaDB, the value must be 2 to 16 characters in length.</li>
         * </ul>
         * </li>
         * <li><p>For more information about invalid characters, see <a href="https://help.aliyun.com/document_detail/26317.html">Forbidden keywords</a>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The password of the account.</p>
         * <ul>
         * <li><p>The value must be 8 to 32 characters in length.</p>
         * </li>
         * <li><p>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
         * </li>
         * <li><p>Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>The account type. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong> (default): standard account.</li>
         * <li><strong>Super</strong>: privileged account.</li>
         * <li><strong>Sysadmin</strong>: system admin account. The account type is available only for ApsaraDB RDS for SQL Server instances.</li>
         * </ul>
         * <p>Before you create a system admin account, check whether the instance meets all prerequisites. For more information, see <a href="https://help.aliyun.com/document_detail/170736.html">Create a system admin account</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>Specifies whether to use a password policy.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is available only for ApsaraDB RDS for SQL Server instances that do not belong to the shared instance family and do not run SQL Server 2008 R2.</p>
         * </li>
         * <li><p>Before you call this operation, you must configure a password policy for the account of your instance. For more information, see <a href="https://help.aliyun.com/document_detail/2848317.html">Configure a password policy for the account of an ApsaraDB RDS for SQL Server instance</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkPolicy(Boolean checkPolicy) {
            this.putQueryParameter("CheckPolicy", checkPolicy);
            this.checkPolicy = checkPolicy;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
