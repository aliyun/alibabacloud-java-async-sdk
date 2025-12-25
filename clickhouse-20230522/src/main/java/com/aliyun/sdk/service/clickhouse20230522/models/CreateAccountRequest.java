// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmlAuthSetting")
    private DmlAuthSetting dmlAuthSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateAccountRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.accountType = builder.accountType;
        this.DBInstanceId = builder.DBInstanceId;
        this.description = builder.description;
        this.dmlAuthSetting = builder.dmlAuthSetting;
        this.password = builder.password;
        this.product = builder.product;
        this.regionId = builder.regionId;
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
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dmlAuthSetting
     */
    public DmlAuthSetting getDmlAuthSetting() {
        return this.dmlAuthSetting;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateAccountRequest, Builder> {
        private String account; 
        private String accountType; 
        private String DBInstanceId; 
        private String description; 
        private DmlAuthSetting dmlAuthSetting; 
        private String password; 
        private String product; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountRequest request) {
            super(request);
            this.account = request.account;
            this.accountType = request.accountType;
            this.DBInstanceId = request.DBInstanceId;
            this.description = request.description;
            this.dmlAuthSetting = request.dmlAuthSetting;
            this.password = request.password;
            this.product = request.product;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>The type of the database account. Valid values:</p>
         * <ul>
         * <li><strong>NormalAccount</strong>: standard account</li>
         * <li><strong>SuperAccount</strong>: privileged account</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NormalAccount</p>
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The description of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>Used for account</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The information about permissions.</p>
         */
        public Builder dmlAuthSetting(DmlAuthSetting dmlAuthSetting) {
            String dmlAuthSettingShrink = shrink(dmlAuthSetting, "DmlAuthSetting", "json");
            this.putQueryParameter("DmlAuthSetting", dmlAuthSettingShrink);
            this.dmlAuthSetting = dmlAuthSetting;
            return this;
        }

        /**
         * <p>The password of the database account. The password must meet the following requirements:</p>
         * <ul>
         * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>The following special characters are supported: ! @ # $ % ^ &amp; * ( ) _ + - =</li>
         * <li>The password must be 8 to 32 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4@</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The code of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>clickhouse</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAccountRequest} extends {@link TeaModel}
     *
     * <p>CreateAccountRequest</p>
     */
    public static class DmlAuthSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowDatabases")
        private java.util.List<String> allowDatabases;

        @com.aliyun.core.annotation.NameInMap("AllowDictionaries")
        private java.util.List<String> allowDictionaries;

        @com.aliyun.core.annotation.NameInMap("DdlAuthority")
        private Boolean ddlAuthority;

        @com.aliyun.core.annotation.NameInMap("DmlAuthority")
        private Integer dmlAuthority;

        private DmlAuthSetting(Builder builder) {
            this.allowDatabases = builder.allowDatabases;
            this.allowDictionaries = builder.allowDictionaries;
            this.ddlAuthority = builder.ddlAuthority;
            this.dmlAuthority = builder.dmlAuthority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DmlAuthSetting create() {
            return builder().build();
        }

        /**
         * @return allowDatabases
         */
        public java.util.List<String> getAllowDatabases() {
            return this.allowDatabases;
        }

        /**
         * @return allowDictionaries
         */
        public java.util.List<String> getAllowDictionaries() {
            return this.allowDictionaries;
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
        public Integer getDmlAuthority() {
            return this.dmlAuthority;
        }

        public static final class Builder {
            private java.util.List<String> allowDatabases; 
            private java.util.List<String> allowDictionaries; 
            private Boolean ddlAuthority; 
            private Integer dmlAuthority; 

            private Builder() {
            } 

            private Builder(DmlAuthSetting model) {
                this.allowDatabases = model.allowDatabases;
                this.allowDictionaries = model.allowDictionaries;
                this.ddlAuthority = model.ddlAuthority;
                this.dmlAuthority = model.dmlAuthority;
            } 

            /**
             * <p>The databases on which you want to grant permissions. Separate multiple databases with commas (,).</p>
             */
            public Builder allowDatabases(java.util.List<String> allowDatabases) {
                this.allowDatabases = allowDatabases;
                return this;
            }

            /**
             * <p>The dictionaries on which you want to grant permissions. Separate multiple dictionaries with commas (,).</p>
             */
            public Builder allowDictionaries(java.util.List<String> allowDictionaries) {
                this.allowDictionaries = allowDictionaries;
                return this;
            }

            /**
             * <p>Specifies whether to grant the DDL permissions to the database account. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The account has the permissions to execute DDL statements.</li>
             * <li><strong>false</strong>: The account does not have the permissions to execute DDL statements.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ddlAuthority(Boolean ddlAuthority) {
                this.ddlAuthority = ddlAuthority;
                return this;
            }

            /**
             * <p>Specifies whether to grant the DML permissions to the database account. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The account has the permissions to read data from the database, write data to the database, and modify the settings of the database.</li>
             * <li><strong>1</strong>: The account only has the permissions to read data from the database.</li>
             * <li><strong>2</strong>: The account only has the permissions to read data from the database and modify the settings of the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dmlAuthority(Integer dmlAuthority) {
                this.dmlAuthority = dmlAuthority;
                return this;
            }

            public DmlAuthSetting build() {
                return new DmlAuthSetting(this);
            } 

        } 

    }
}
