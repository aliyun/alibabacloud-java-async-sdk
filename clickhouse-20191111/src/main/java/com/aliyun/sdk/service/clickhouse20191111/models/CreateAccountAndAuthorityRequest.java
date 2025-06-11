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
 * {@link CreateAccountAndAuthorityRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountAndAuthorityRequest</p>
 */
public class CreateAccountAndAuthorityRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("AllowDatabases")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowDatabases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowDictionaries")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowDictionaries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DdlAuthority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean ddlAuthority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmlAuthority")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dmlAuthority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalDatabases")
    private String totalDatabases;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalDictionaries")
    private String totalDictionaries;

    private CreateAccountAndAuthorityRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.allowDatabases = builder.allowDatabases;
        this.allowDictionaries = builder.allowDictionaries;
        this.DBClusterId = builder.DBClusterId;
        this.ddlAuthority = builder.ddlAuthority;
        this.dmlAuthority = builder.dmlAuthority;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.totalDatabases = builder.totalDatabases;
        this.totalDictionaries = builder.totalDictionaries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountAndAuthorityRequest create() {
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
     * @return allowDatabases
     */
    public String getAllowDatabases() {
        return this.allowDatabases;
    }

    /**
     * @return allowDictionaries
     */
    public String getAllowDictionaries() {
        return this.allowDictionaries;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ddlAuthority
     */
    public Boolean getDdlAuthority() {
        return this.ddlAuthority;
    }

    /**
     * @return dmlAuthority
     */
    public String getDmlAuthority() {
        return this.dmlAuthority;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return totalDatabases
     */
    public String getTotalDatabases() {
        return this.totalDatabases;
    }

    /**
     * @return totalDictionaries
     */
    public String getTotalDictionaries() {
        return this.totalDictionaries;
    }

    public static final class Builder extends Request.Builder<CreateAccountAndAuthorityRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String accountPassword; 
        private String allowDatabases; 
        private String allowDictionaries; 
        private String DBClusterId; 
        private Boolean ddlAuthority; 
        private String dmlAuthority; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String totalDatabases; 
        private String totalDictionaries; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountAndAuthorityRequest request) {
            super(request);
            this.accountDescription = request.accountDescription;
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.allowDatabases = request.allowDatabases;
            this.allowDictionaries = request.allowDictionaries;
            this.DBClusterId = request.DBClusterId;
            this.ddlAuthority = request.ddlAuthority;
            this.dmlAuthority = request.dmlAuthority;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.totalDatabases = request.totalDatabases;
            this.totalDictionaries = request.totalDictionaries;
        } 

        /**
         * <p>The description of the database account.</p>
         * <ul>
         * <li>The description cannot start with http:// or https://.</li>
         * <li>The description must be 0 to 256 characters in length.</li>
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
         * <p>The database account.</p>
         * <ul>
         * <li>The name must be unique within the cluster.</li>
         * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
         * <li>The name must start with a lowercase letter and end with a lowercase letter or digit.</li>
         * <li>The name must be 2 to 64 characters in length.</li>
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
         * <p>The password of your database account.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The password contains at least three types of the following characters: uppercase letters, lowercase letters, digits, and special characters.</p>
         * </li>
         * <li><p>The password can contain the following special characters: ! @ # $ % ^ &amp; * ( ) _ + - =</p>
         * </li>
         * <li><p>The password must be 8 to 32 characters in length.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456Aa</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>The databases to which you want to grant permissions. Separate databases with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>db1</p>
         */
        public Builder allowDatabases(String allowDatabases) {
            this.putQueryParameter("AllowDatabases", allowDatabases);
            this.allowDatabases = allowDatabases;
            return this;
        }

        /**
         * <p>The dictionaries to which you want to grant permissions. Separate dictionaries with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dt1</p>
         */
        public Builder allowDictionaries(String allowDictionaries) {
            this.putQueryParameter("AllowDictionaries", allowDictionaries);
            this.allowDictionaries = allowDictionaries;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1p816075e21****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to grant the DDL permissions to the database account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ddlAuthority(Boolean ddlAuthority) {
            this.putQueryParameter("DdlAuthority", ddlAuthority);
            this.ddlAuthority = ddlAuthority;
            return this;
        }

        /**
         * <p>Specifies whether to grant DML permissions to the database account. Valid values:</p>
         * <ul>
         * <li><strong>all</strong></li>
         * <li><strong>readOnly,modify</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder dmlAuthority(String dmlAuthority) {
            this.putQueryParameter("DmlAuthority", dmlAuthority);
            this.dmlAuthority = dmlAuthority;
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
         * <p>The region ID You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>All databases. Separate databases with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>db1,db2</p>
         */
        public Builder totalDatabases(String totalDatabases) {
            this.putQueryParameter("TotalDatabases", totalDatabases);
            this.totalDatabases = totalDatabases;
            return this;
        }

        /**
         * <p>All dictionaries. Separate dictionaries with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>dt1,dt2</p>
         */
        public Builder totalDictionaries(String totalDictionaries) {
            this.putQueryParameter("TotalDictionaries", totalDictionaries);
            this.totalDictionaries = totalDictionaries;
            return this;
        }

        @Override
        public CreateAccountAndAuthorityRequest build() {
            return new CreateAccountAndAuthorityRequest(this);
        } 

    } 

}
