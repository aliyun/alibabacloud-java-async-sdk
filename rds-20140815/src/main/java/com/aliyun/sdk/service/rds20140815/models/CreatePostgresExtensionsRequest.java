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
 * {@link CreatePostgresExtensionsRequest} extends {@link RequestModel}
 *
 * <p>CreatePostgresExtensionsRequest</p>
 */
public class CreatePostgresExtensionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extensions")
    private String extensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskConfirmed")
    private Boolean riskConfirmed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDatabase")
    private String sourceDatabase;

    private CreatePostgresExtensionsRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBNames = builder.DBNames;
        this.extensions = builder.extensions;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.riskConfirmed = builder.riskConfirmed;
        this.sourceDatabase = builder.sourceDatabase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePostgresExtensionsRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBNames
     */
    public String getDBNames() {
        return this.DBNames;
    }

    /**
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return riskConfirmed
     */
    public Boolean getRiskConfirmed() {
        return this.riskConfirmed;
    }

    /**
     * @return sourceDatabase
     */
    public String getSourceDatabase() {
        return this.sourceDatabase;
    }

    public static final class Builder extends Request.Builder<CreatePostgresExtensionsRequest, Builder> {
        private String accountName; 
        private String clientToken; 
        private String DBInstanceId; 
        private String DBNames; 
        private String extensions; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean riskConfirmed; 
        private String sourceDatabase; 

        private Builder() {
            super();
        } 

        private Builder(CreatePostgresExtensionsRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.DBNames = request.DBNames;
            this.extensions = request.extensions;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.riskConfirmed = request.riskConfirmed;
            this.sourceDatabase = request.sourceDatabase;
        } 

        /**
         * <p>The user to which the plug-in belongs. Only privileged accounts are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_user</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate requests. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Instance ID of the instance. You can call the DescribeDBInstances operation to obtain instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-gc7f1****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database on the instance. You can call the DescribeDatabases operation to obtain the name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        public Builder DBNames(String DBNames) {
            this.putQueryParameter("DBNames", DBNames);
            this.DBNames = DBNames;
            return this;
        }

        /**
         * <p>The plug-ins to be installed. Separate multiple plug-ins with commas (,).
         * If you do not specify the <strong>SourceDatabase</strong> request parameter, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>citext,pg_profile</p>
         */
        public Builder extensions(String extensions) {
            this.putQueryParameter("Extensions", extensions);
            this.extensions = extensions;
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>Specifies whether security risk of installing specific plug-ins on instances with outdated minor engine versions is confirmed. You can install the plug-ins only after you confirm security risk.
         * Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false<blockquote>
         * <p>For information about the related risks, see <a href="https://help.aliyun.com/document_detail/2587815.html">Limits on creating plug-ins in ApsaraDB RDS for PostgreSQL</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder riskConfirmed(Boolean riskConfirmed) {
            this.putQueryParameter("RiskConfirmed", riskConfirmed);
            this.riskConfirmed = riskConfirmed;
            return this;
        }

        /**
         * <p>The source database from which plug-ins are synchronized to the destination database. If you do not specify the <strong>Extensions</strong> request parameter, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>source_db</p>
         */
        public Builder sourceDatabase(String sourceDatabase) {
            this.putQueryParameter("SourceDatabase", sourceDatabase);
            this.sourceDatabase = sourceDatabase;
            return this;
        }

        @Override
        public CreatePostgresExtensionsRequest build() {
            return new CreatePostgresExtensionsRequest(this);
        } 

    } 

}
