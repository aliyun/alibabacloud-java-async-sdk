// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountPrivilegeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountPrivilegeRequest</p>
 */
public class ModifyAccountPrivilegeRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPrivilege")
    private String accountPrivilege;

    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("DbName")
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

    private ModifyAccountPrivilegeRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivilege = builder.accountPrivilege;
        this.DBInstanceName = builder.DBInstanceName;
        this.dbName = builder.dbName;
        this.regionId = builder.regionId;
        this.securityAccountName = builder.securityAccountName;
        this.securityAccountPassword = builder.securityAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountPrivilegeRequest create() {
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
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
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

    public static final class Builder extends Request.Builder<ModifyAccountPrivilegeRequest, Builder> {
        private String accountName; 
        private String accountPrivilege; 
        private String DBInstanceName; 
        private String dbName; 
        private String regionId; 
        private String securityAccountName; 
        private String securityAccountPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountPrivilegeRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivilege = request.accountPrivilege;
            this.DBInstanceName = request.DBInstanceName;
            this.dbName = request.dbName;
            this.regionId = request.regionId;
            this.securityAccountName = request.securityAccountName;
            this.securityAccountPassword = request.securityAccountPassword;
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
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
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
        public ModifyAccountPrivilegeRequest build() {
            return new ModifyAccountPrivilegeRequest(this);
        } 

    } 

}
