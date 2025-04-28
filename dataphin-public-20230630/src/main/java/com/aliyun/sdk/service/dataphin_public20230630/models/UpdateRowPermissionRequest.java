// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateRowPermissionRequest} extends {@link RequestModel}
 *
 * <p>UpdateRowPermissionRequest</p>
 */
public class UpdateRowPermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateRowPermissionCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateRowPermissionCommand updateRowPermissionCommand;

    private UpdateRowPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateRowPermissionCommand = builder.updateRowPermissionCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRowPermissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return updateRowPermissionCommand
     */
    public UpdateRowPermissionCommand getUpdateRowPermissionCommand() {
        return this.updateRowPermissionCommand;
    }

    public static final class Builder extends Request.Builder<UpdateRowPermissionRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateRowPermissionCommand updateRowPermissionCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRowPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateRowPermissionCommand = request.updateRowPermissionCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateRowPermissionCommand(UpdateRowPermissionCommand updateRowPermissionCommand) {
            String updateRowPermissionCommandShrink = shrink(updateRowPermissionCommand, "UpdateRowPermissionCommand", "json");
            this.putBodyParameter("UpdateRowPermissionCommand", updateRowPermissionCommandShrink);
            this.updateRowPermissionCommand = updateRowPermissionCommand;
            return this;
        }

        @Override
        public UpdateRowPermissionRequest build() {
            return new UpdateRowPermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdateRowPermissionRequest</p>
     */
    public static class MappingColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnDesc")
        private String columnDesc;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnType;

        private MappingColumns(Builder builder) {
            this.columnDesc = builder.columnDesc;
            this.columnName = builder.columnName;
            this.columnType = builder.columnType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MappingColumns create() {
            return builder().build();
        }

        /**
         * @return columnDesc
         */
        public String getColumnDesc() {
            return this.columnDesc;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        public static final class Builder {
            private String columnDesc; 
            private String columnName; 
            private String columnType; 

            private Builder() {
            } 

            private Builder(MappingColumns model) {
                this.columnDesc = model.columnDesc;
                this.columnName = model.columnName;
                this.columnType = model.columnType;
            } 

            /**
             * ColumnDesc.
             */
            public Builder columnDesc(String columnDesc) {
                this.columnDesc = columnDesc;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>business_id</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            public MappingColumns build() {
                return new MappingColumns(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdateRowPermissionRequest</p>
     */
    public static class Expressions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappingColumnName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mappingColumnName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operator;

        @com.aliyun.core.annotation.NameInMap("SubConditions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<?> subConditions;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Values")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> values;

        private Expressions(Builder builder) {
            this.mappingColumnName = builder.mappingColumnName;
            this.operator = builder.operator;
            this.subConditions = builder.subConditions;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expressions create() {
            return builder().build();
        }

        /**
         * @return mappingColumnName
         */
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return subConditions
         */
        public java.util.List<?> getSubConditions() {
            return this.subConditions;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String mappingColumnName; 
            private String operator; 
            private java.util.List<?> subConditions; 
            private String type; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Expressions model) {
                this.mappingColumnName = model.mappingColumnName;
                this.operator = model.operator;
                this.subConditions = model.subConditions;
                this.type = model.type;
                this.values = model.values;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>business_id</p>
             */
            public Builder mappingColumnName(String mappingColumnName) {
                this.mappingColumnName = mappingColumnName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OR</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder subConditions(java.util.List<?> subConditions) {
                this.subConditions = subConditions;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>EXPRESSION</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Expressions build() {
                return new Expressions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdateRowPermissionRequest</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private Accounts(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountId = model.accountId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdateRowPermissionRequest</p>
     */
    public static class UserMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Accounts")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Accounts> accounts;

        private UserMappingList(Builder builder) {
            this.accountType = builder.accountType;
            this.accounts = builder.accounts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserMappingList create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return accounts
         */
        public java.util.List<Accounts> getAccounts() {
            return this.accounts;
        }

        public static final class Builder {
            private String accountType; 
            private java.util.List<Accounts> accounts; 

            private Builder() {
            } 

            private Builder(UserMappingList model) {
                this.accountType = model.accountType;
                this.accounts = model.accounts;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PERSONAL</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder accounts(java.util.List<Accounts> accounts) {
                this.accounts = accounts;
                return this;
            }

            public UserMappingList build() {
                return new UserMappingList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdateRowPermissionRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expressions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Expressions> expressions;

        @com.aliyun.core.annotation.NameInMap("IsDelete")
        private Boolean isDelete;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UserMappingList")
        private java.util.List<UserMappingList> userMappingList;

        private Rules(Builder builder) {
            this.expressions = builder.expressions;
            this.isDelete = builder.isDelete;
            this.ruleName = builder.ruleName;
            this.scopeType = builder.scopeType;
            this.status = builder.status;
            this.userMappingList = builder.userMappingList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return expressions
         */
        public java.util.List<Expressions> getExpressions() {
            return this.expressions;
        }

        /**
         * @return isDelete
         */
        public Boolean getIsDelete() {
            return this.isDelete;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userMappingList
         */
        public java.util.List<UserMappingList> getUserMappingList() {
            return this.userMappingList;
        }

        public static final class Builder {
            private java.util.List<Expressions> expressions; 
            private Boolean isDelete; 
            private String ruleName; 
            private String scopeType; 
            private Integer status; 
            private java.util.List<UserMappingList> userMappingList; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.expressions = model.expressions;
                this.isDelete = model.isDelete;
                this.ruleName = model.ruleName;
                this.scopeType = model.scopeType;
                this.status = model.status;
                this.userMappingList = model.userMappingList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder expressions(java.util.List<Expressions> expressions) {
                this.expressions = expressions;
                return this;
            }

            /**
             * IsDelete.
             */
            public Builder isDelete(Boolean isDelete) {
                this.isDelete = isDelete;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT_COLUMN</p>
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UserMappingList.
             */
            public Builder userMappingList(java.util.List<UserMappingList> userMappingList) {
                this.userMappingList = userMappingList;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdateRowPermissionRequest</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("MappingColumnName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mappingColumnName;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        private Tables(Builder builder) {
            this.columnName = builder.columnName;
            this.mappingColumnName = builder.mappingColumnName;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return mappingColumnName
         */
        public String getMappingColumnName() {
            return this.mappingColumnName;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private String columnName; 
            private String mappingColumnName; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.columnName = model.columnName;
                this.mappingColumnName = model.mappingColumnName;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>business_id</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>business_id</p>
             */
            public Builder mappingColumnName(String mappingColumnName) {
                this.mappingColumnName = mappingColumnName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300199897.project_name.table_name</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateRowPermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdateRowPermissionRequest</p>
     */
    public static class UpdateRowPermissionCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappingColumns")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<MappingColumns> mappingColumns;

        @com.aliyun.core.annotation.NameInMap("RowPermissionDesc")
        private String rowPermissionDesc;

        @com.aliyun.core.annotation.NameInMap("RowPermissionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long rowPermissionId;

        @com.aliyun.core.annotation.NameInMap("RowPermissionName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String rowPermissionName;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        private UpdateRowPermissionCommand(Builder builder) {
            this.mappingColumns = builder.mappingColumns;
            this.rowPermissionDesc = builder.rowPermissionDesc;
            this.rowPermissionId = builder.rowPermissionId;
            this.rowPermissionName = builder.rowPermissionName;
            this.rules = builder.rules;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateRowPermissionCommand create() {
            return builder().build();
        }

        /**
         * @return mappingColumns
         */
        public java.util.List<MappingColumns> getMappingColumns() {
            return this.mappingColumns;
        }

        /**
         * @return rowPermissionDesc
         */
        public String getRowPermissionDesc() {
            return this.rowPermissionDesc;
        }

        /**
         * @return rowPermissionId
         */
        public Long getRowPermissionId() {
            return this.rowPermissionId;
        }

        /**
         * @return rowPermissionName
         */
        public String getRowPermissionName() {
            return this.rowPermissionName;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private java.util.List<MappingColumns> mappingColumns; 
            private String rowPermissionDesc; 
            private Long rowPermissionId; 
            private String rowPermissionName; 
            private java.util.List<Rules> rules; 
            private java.util.List<Tables> tables; 

            private Builder() {
            } 

            private Builder(UpdateRowPermissionCommand model) {
                this.mappingColumns = model.mappingColumns;
                this.rowPermissionDesc = model.rowPermissionDesc;
                this.rowPermissionId = model.rowPermissionId;
                this.rowPermissionName = model.rowPermissionName;
                this.rules = model.rules;
                this.tables = model.tables;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder mappingColumns(java.util.List<MappingColumns> mappingColumns) {
                this.mappingColumns = mappingColumns;
                return this;
            }

            /**
             * RowPermissionDesc.
             */
            public Builder rowPermissionDesc(String rowPermissionDesc) {
                this.rowPermissionDesc = rowPermissionDesc;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30009999</p>
             */
            public Builder rowPermissionId(Long rowPermissionId) {
                this.rowPermissionId = rowPermissionId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder rowPermissionName(String rowPermissionName) {
                this.rowPermissionName = rowPermissionName;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            public UpdateRowPermissionCommand build() {
                return new UpdateRowPermissionCommand(this);
            } 

        } 

    }
}
