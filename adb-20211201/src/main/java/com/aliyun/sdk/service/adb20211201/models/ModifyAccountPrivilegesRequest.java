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
 * {@link ModifyAccountPrivilegesRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountPrivilegesRequest</p>
 */
public class ModifyAccountPrivilegesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPrivileges")
    private java.util.List<AccountPrivileges> accountPrivileges;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
    private String resourceGroupName;

    private ModifyAccountPrivilegesRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPrivileges = builder.accountPrivileges;
        this.DBClusterId = builder.DBClusterId;
        this.promqlInsertPrivileges = builder.promqlInsertPrivileges;
        this.promqlSelectNodePercentage = builder.promqlSelectNodePercentage;
        this.promqlSelectPrivileges = builder.promqlSelectPrivileges;
        this.regionId = builder.regionId;
        this.resourceGroupName = builder.resourceGroupName;
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
    public java.util.List<AccountPrivileges> getAccountPrivileges() {
        return this.accountPrivileges;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public static final class Builder extends Request.Builder<ModifyAccountPrivilegesRequest, Builder> {
        private String accountName; 
        private java.util.List<AccountPrivileges> accountPrivileges; 
        private String DBClusterId; 
        private java.util.List<String> promqlInsertPrivileges; 
        private Double promqlSelectNodePercentage; 
        private java.util.List<String> promqlSelectPrivileges; 
        private String regionId; 
        private String resourceGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountPrivilegesRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPrivileges = request.accountPrivileges;
            this.DBClusterId = request.DBClusterId;
            this.promqlInsertPrivileges = request.promqlInsertPrivileges;
            this.promqlSelectNodePercentage = request.promqlSelectNodePercentage;
            this.promqlSelectPrivileges = request.promqlSelectPrivileges;
            this.regionId = request.regionId;
            this.resourceGroupName = request.resourceGroupName;
        } 

        /**
         * <p>The name of the database account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account1</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>The permissions that you want to grant to the database account.</p>
         */
        public Builder accountPrivileges(java.util.List<AccountPrivileges> accountPrivileges) {
            String accountPrivilegesShrink = shrink(accountPrivileges, "AccountPrivileges", "json");
            this.putQueryParameter("AccountPrivileges", accountPrivilegesShrink);
            this.accountPrivileges = accountPrivileges;
            return this;
        }

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1k5p066e1a****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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

        /**
         * ResourceGroupName.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("ResourceGroupName", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        @Override
        public ModifyAccountPrivilegesRequest build() {
            return new ModifyAccountPrivilegesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAccountPrivilegesRequest} extends {@link TeaModel}
     *
     * <p>ModifyAccountPrivilegesRequest</p>
     */
    public static class PrivilegeObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Table")
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

            private Builder() {
            } 

            private Builder(PrivilegeObject model) {
                this.column = model.column;
                this.database = model.database;
                this.table = model.table;
            } 

            /**
             * <p>The columns on which you want to grant permissions. This parameter must be specified when the PrivilegeType parameter is set to Column.</p>
             * 
             * <strong>example:</strong>
             * <p>column1</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The databases on which you want to grant permissions. This parameter must be specified when the PrivilegeType parameter is set to Database, Table, or Column.</p>
             * 
             * <strong>example:</strong>
             * <p>tsdb1</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The tables on which you want to grant permissions. This parameter must be specified when the PrivilegeType parameter is set to Table or Column.</p>
             * 
             * <strong>example:</strong>
             * <p>table1</p>
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
    /**
     * 
     * {@link ModifyAccountPrivilegesRequest} extends {@link TeaModel}
     *
     * <p>ModifyAccountPrivilegesRequest</p>
     */
    public static class AccountPrivileges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivilegeObject")
        private PrivilegeObject privilegeObject;

        @com.aliyun.core.annotation.NameInMap("PrivilegeType")
        private String privilegeType;

        @com.aliyun.core.annotation.NameInMap("Privileges")
        private java.util.List<String> privileges;

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
        public java.util.List<String> getPrivileges() {
            return this.privileges;
        }

        public static final class Builder {
            private PrivilegeObject privilegeObject; 
            private String privilegeType; 
            private java.util.List<String> privileges; 

            private Builder() {
            } 

            private Builder(AccountPrivileges model) {
                this.privilegeObject = model.privilegeObject;
                this.privilegeType = model.privilegeType;
                this.privileges = model.privileges;
            } 

            /**
             * <p>The objects on which you want to grant permissions, including databases, tables, and columns.</p>
             */
            public Builder privilegeObject(PrivilegeObject privilegeObject) {
                this.privilegeObject = privilegeObject;
                return this;
            }

            /**
             * <p>The permission level that you want to assign to the database account. You can call the <code>DescribeEnabledPrivileges</code> operation to query the permission level that can be assigned to the database account.</p>
             * 
             * <strong>example:</strong>
             * <p>Global</p>
             */
            public Builder privilegeType(String privilegeType) {
                this.privilegeType = privilegeType;
                return this;
            }

            /**
             * <p>The permissions that you want to grant to the database account.</p>
             */
            public Builder privileges(java.util.List<String> privileges) {
                this.privileges = privileges;
                return this;
            }

            public AccountPrivileges build() {
                return new AccountPrivileges(this);
            } 

        } 

    }
}
