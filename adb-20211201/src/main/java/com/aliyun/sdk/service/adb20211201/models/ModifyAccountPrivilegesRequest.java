// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccountPrivilegesRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountPrivilegesRequest</p>
 */
public class ModifyAccountPrivilegesRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPrivileges")
    @Validation(required = true)
    private java.util.List < AccountPrivileges> accountPrivileges;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyAccountPrivilegesRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivileges = builder.accountPrivileges;
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountPrivilegesRequest create() {
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
     * @return accountPrivileges
     */
    public java.util.List < AccountPrivileges> getAccountPrivileges() {
        return this.accountPrivileges;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyAccountPrivilegesRequest, Builder> {
        private String accountName; 
        private java.util.List < AccountPrivileges> accountPrivileges; 
        private String DBClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountPrivilegesRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivileges = request.accountPrivileges;
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the database account.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * The permissions of the database account.
         */
        public Builder accountPrivileges(java.util.List < AccountPrivileges> accountPrivileges) {
            String accountPrivilegesShrink = shrink(accountPrivileges, "AccountPrivileges", "json");
            this.putQueryParameter("AccountPrivileges", accountPrivilegesShrink);
            this.accountPrivileges = accountPrivileges;
            return this;
        }

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The region ID of the cluster.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyAccountPrivilegesRequest build() {
            return new ModifyAccountPrivilegesRequest(this);
        } 

    } 

    public static class PrivilegeObject extends TeaModel {
        @NameInMap("Column")
        private String column;

        @NameInMap("Database")
        private String database;

        @NameInMap("Table")
        private String table;

        private PrivilegeObject(Builder builder) {
            this.column = builder.column;
            this.database = builder.database;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivilegeObject create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String column; 
            private String database; 
            private String table; 

            /**
             * The columns on which the database account has permissions. This parameter is required if the PrivilegeType parameter is set to Column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * The databases on which the database account has permissions. This parameter is required if the PrivilegeType parameter is set to Database, Table, or Column.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The tables on which the database account has permissions. This parameter is required if the PrivilegeType parameter is set to Table or Column.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public PrivilegeObject build() {
                return new PrivilegeObject(this);
            } 

        } 

    }
    public static class AccountPrivileges extends TeaModel {
        @NameInMap("PrivilegeObject")
        private PrivilegeObject privilegeObject;

        @NameInMap("PrivilegeType")
        private String privilegeType;

        @NameInMap("Privileges")
        private java.util.List < String > privileges;

        private AccountPrivileges(Builder builder) {
            this.privilegeObject = builder.privilegeObject;
            this.privilegeType = builder.privilegeType;
            this.privileges = builder.privileges;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountPrivileges create() {
            return builder().build();
        }

        /**
         * @return privilegeObject
         */
        public PrivilegeObject getPrivilegeObject() {
            return this.privilegeObject;
        }

        /**
         * @return privilegeType
         */
        public String getPrivilegeType() {
            return this.privilegeType;
        }

        /**
         * @return privileges
         */
        public java.util.List < String > getPrivileges() {
            return this.privileges;
        }

        public static final class Builder {
            private PrivilegeObject privilegeObject; 
            private String privilegeType; 
            private java.util.List < String > privileges; 

            /**
             * The objects on which the permission takes effect, including databases, tables, and columns.
             */
            public Builder privilegeObject(PrivilegeObject privilegeObject) {
                this.privilegeObject = privilegeObject;
                return this;
            }

            /**
             * The permission level of the database account. You can call the `DescribeEnabledPrivileges` operation to query the permission level of the database account.
             */
            public Builder privilegeType(String privilegeType) {
                this.privilegeType = privilegeType;
                return this;
            }

            /**
             * The permissions that you want to modify. You can call the `DescribeEnabledPrivileges` operation to query the permissions of the database account.
             */
            public Builder privileges(java.util.List < String > privileges) {
                this.privileges = privileges;
                return this;
            }

            public AccountPrivileges build() {
                return new AccountPrivileges(this);
            } 

        } 

    }
}
