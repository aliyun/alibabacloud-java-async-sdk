// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromqlInsertPrivileges")
    private java.util.List<String> promqlInsertPrivileges;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromqlSelectNodePercentage")
    private Double promqlSelectNodePercentage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromqlSelectPrivileges")
    private java.util.List<String> promqlSelectPrivileges;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamUserList")
    private java.util.List<String> ramUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    private CreateAccountRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.accountType = builder.accountType;
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
        this.promqlInsertPrivileges = builder.promqlInsertPrivileges;
        this.promqlSelectNodePercentage = builder.promqlSelectNodePercentage;
        this.promqlSelectPrivileges = builder.promqlSelectPrivileges;
        this.ramUserList = builder.ramUserList;
        this.resourceGroupName = builder.resourceGroupName;
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
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return promqlInsertPrivileges
     */
    public java.util.List<String> getPromqlInsertPrivileges() {
        return this.promqlInsertPrivileges;
    }

    /**
     * @return promqlSelectNodePercentage
     */
    public Double getPromqlSelectNodePercentage() {
        return this.promqlSelectNodePercentage;
    }

    /**
     * @return promqlSelectPrivileges
     */
    public java.util.List<String> getPromqlSelectPrivileges() {
        return this.promqlSelectPrivileges;
    }

    /**
     * @return ramUserList
     */
    public java.util.List<String> getRamUserList() {
        return this.ramUserList;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<CreateAccountRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String accountPassword; 
        private String accountType; 
        private String DBClusterId; 
        private String engine; 
        private java.util.List<String> promqlInsertPrivileges; 
        private Double promqlSelectNodePercentage; 
        private java.util.List<String> promqlSelectPrivileges; 
        private java.util.List<String> ramUserList; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountRequest request) {
            super(request);
            this.accountDescription = request.accountDescription;
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.accountType = request.accountType;
            this.DBClusterId = request.DBClusterId;
            this.engine = request.engine;
            this.promqlInsertPrivileges = request.promqlInsertPrivileges;
            this.promqlSelectNodePercentage = request.promqlSelectNodePercentage;
            this.promqlSelectPrivileges = request.promqlSelectPrivileges;
            this.ramUserList = request.ramUserList;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * <p>The description of the account.</p>
         * <ul>
         * <li>The description cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>The description can be up to 256 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * <p>The name of the database account.</p>
         * <ul>
         * <li>The name must start with a lowercase letter and end with a lowercase letter or a digit.</li>
         * <li>The name can contain lowercase letters, digits, and underscores (_).</li>
         * <li>The name must be 2 to 16 characters in length.</li>
         * <li>Reserved account names such as root, admin, and opsadmin cannot be used.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_accout</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The password of the database account.</p>
         * <ul>
         * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></li>
         * <li>The password must be 8 to 32 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test_accout1</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>The type of the database account. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: standard account.</li>
         * <li><strong>Super</strong>: privileged account.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database engine of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>AnalyticDB</strong> (default): the AnalyticDB for MySQL engine.</li>
         * <li><strong>Clickhouse</strong>: the wide table engine.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Clickhouse</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * PromqlInsertPrivileges.
         */
        public Builder promqlInsertPrivileges(java.util.List<String> promqlInsertPrivileges) {
            String promqlInsertPrivilegesShrink = shrink(promqlInsertPrivileges, "PromqlInsertPrivileges", "json");
            this.putQueryParameter("PromqlInsertPrivileges", promqlInsertPrivilegesShrink);
            this.promqlInsertPrivileges = promqlInsertPrivileges;
            return this;
        }

        /**
         * PromqlSelectNodePercentage.
         */
        public Builder promqlSelectNodePercentage(Double promqlSelectNodePercentage) {
            this.putQueryParameter("PromqlSelectNodePercentage", promqlSelectNodePercentage);
            this.promqlSelectNodePercentage = promqlSelectNodePercentage;
            return this;
        }

        /**
         * PromqlSelectPrivileges.
         */
        public Builder promqlSelectPrivileges(java.util.List<String> promqlSelectPrivileges) {
            String promqlSelectPrivilegesShrink = shrink(promqlSelectPrivileges, "PromqlSelectPrivileges", "json");
            this.putQueryParameter("PromqlSelectPrivileges", promqlSelectPrivilegesShrink);
            this.promqlSelectPrivileges = promqlSelectPrivileges;
            return this;
        }

        /**
         * RamUserList.
         */
        public Builder ramUserList(java.util.List<String> ramUserList) {
            String ramUserListShrink = shrink(ramUserList, "RamUserList", "json");
            this.putQueryParameter("RamUserList", ramUserListShrink);
            this.ramUserList = ramUserList;
            return this;
        }

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

}
