// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
    @Query
    @NameInMap("Account")
    @Validation(required = true)
    private String account;

    @Query
    @NameInMap("AccountType")
    @Validation(required = true)
    private String accountType;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DmlAuthSetting")
    private DmlAuthSetting dmlAuthSetting;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * Account.
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DmlAuthSetting.
         */
        public Builder dmlAuthSetting(DmlAuthSetting dmlAuthSetting) {
            String dmlAuthSettingShrink = shrink(dmlAuthSetting, "DmlAuthSetting", "json");
            this.putQueryParameter("DmlAuthSetting", dmlAuthSettingShrink);
            this.dmlAuthSetting = dmlAuthSetting;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
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

        @Override
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

    public static class DmlAuthSetting extends TeaModel {
        @NameInMap("AllowDatabases")
        private java.util.List < String > allowDatabases;

        @NameInMap("AllowDictionaries")
        private java.util.List < String > allowDictionaries;

        @NameInMap("DdlAuthority")
        private Boolean ddlAuthority;

        @NameInMap("DmlAuthority")
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
        public java.util.List < String > getAllowDatabases() {
            return this.allowDatabases;
        }

        /**
         * @return allowDictionaries
         */
        public java.util.List < String > getAllowDictionaries() {
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
            private java.util.List < String > allowDatabases; 
            private java.util.List < String > allowDictionaries; 
            private Boolean ddlAuthority; 
            private Integer dmlAuthority; 

            /**
             * AllowDatabases.
             */
            public Builder allowDatabases(java.util.List < String > allowDatabases) {
                this.allowDatabases = allowDatabases;
                return this;
            }

            /**
             * AllowDictionaries.
             */
            public Builder allowDictionaries(java.util.List < String > allowDictionaries) {
                this.allowDictionaries = allowDictionaries;
                return this;
            }

            /**
             * DdlAuthority.
             */
            public Builder ddlAuthority(Boolean ddlAuthority) {
                this.ddlAuthority = ddlAuthority;
                return this;
            }

            /**
             * DmlAuthority.
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
