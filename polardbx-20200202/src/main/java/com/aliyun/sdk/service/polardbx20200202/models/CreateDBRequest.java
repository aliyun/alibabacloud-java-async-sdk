// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBRequest} extends {@link RequestModel}
 *
 * <p>CreateDBRequest</p>
 */
public class CreateDBRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPrivilege")
    private String accountPrivilege;

    @Query
    @NameInMap("Charset")
    @Validation(required = true)
    private String charset;

    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("DbDescription")
    private String dbDescription;

    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityAccountName")
    private String securityAccountName;

    @Query
    @NameInMap("SecurityAccountPassword")
    private String securityAccountPassword;

    private CreateDBRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivilege = builder.accountPrivilege;
        this.charset = builder.charset;
        this.DBInstanceName = builder.DBInstanceName;
        this.dbDescription = builder.dbDescription;
        this.dbName = builder.dbName;
        this.regionId = builder.regionId;
        this.securityAccountName = builder.securityAccountName;
        this.securityAccountPassword = builder.securityAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBRequest create() {
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
     * @return accountPrivilege
     */
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    /**
     * @return charset
     */
    public String getCharset() {
        return this.charset;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return dbDescription
     */
    public String getDbDescription() {
        return this.dbDescription;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityAccountName
     */
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    /**
     * @return securityAccountPassword
     */
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

    public static final class Builder extends Request.Builder<CreateDBRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String charset; 
        private String DBInstanceName; 
        private String dbDescription; 
        private String dbName; 
        private String regionId; 
        private String securityAccountName; 
        private String securityAccountPassword; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.accountPrivilege = response.accountPrivilege;
            this.charset = response.charset;
            this.DBInstanceName = response.DBInstanceName;
            this.dbDescription = response.dbDescription;
            this.dbName = response.dbName;
            this.regionId = response.regionId;
            this.securityAccountName = response.securityAccountName;
            this.securityAccountPassword = response.securityAccountPassword;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AccountPrivilege.
         */
        public Builder accountPrivilege(String accountPrivilege) {
            this.putQueryParameter("AccountPrivilege", accountPrivilege);
            this.accountPrivilege = accountPrivilege;
            return this;
        }

        /**
         * Charset.
         */
        public Builder charset(String charset) {
            this.putQueryParameter("Charset", charset);
            this.charset = charset;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DbDescription.
         */
        public Builder dbDescription(String dbDescription) {
            this.putQueryParameter("DbDescription", dbDescription);
            this.dbDescription = dbDescription;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
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
         * SecurityAccountName.
         */
        public Builder securityAccountName(String securityAccountName) {
            this.putQueryParameter("SecurityAccountName", securityAccountName);
            this.securityAccountName = securityAccountName;
            return this;
        }

        /**
         * SecurityAccountPassword.
         */
        public Builder securityAccountPassword(String securityAccountPassword) {
            this.putQueryParameter("SecurityAccountPassword", securityAccountPassword);
            this.securityAccountPassword = securityAccountPassword;
            return this;
        }

        @Override
        public CreateDBRequest build() {
            return new CreateDBRequest(this);
        } 

    } 

}
