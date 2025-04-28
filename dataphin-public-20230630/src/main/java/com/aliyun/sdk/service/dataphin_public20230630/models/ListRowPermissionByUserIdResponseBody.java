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
 * {@link ListRowPermissionByUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListRowPermissionByUserIdResponseBody</p>
 */
public class ListRowPermissionByUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRowPermissionByUserIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRowPermissionByUserIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRowPermissionByUserIdResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRowPermissionByUserIdResponseBody build() {
            return new ListRowPermissionByUserIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRowPermissionByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRowPermissionByUserIdResponseBody</p>
     */
    public static class Expressions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappingColumnName")
        private String mappingColumnName;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("SubConditions")
        private java.util.List<?> subConditions;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Values")
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
             * MappingColumnName.
             */
            public Builder mappingColumnName(String mappingColumnName) {
                this.mappingColumnName = mappingColumnName;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * SubConditions.
             */
            public Builder subConditions(java.util.List<?> subConditions) {
                this.subConditions = subConditions;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Values.
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
     * {@link ListRowPermissionByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRowPermissionByUserIdResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
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
             * AccountId.
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
     * {@link ListRowPermissionByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRowPermissionByUserIdResponseBody</p>
     */
    public static class UserMappingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Accounts")
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
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Accounts.
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
     * {@link ListRowPermissionByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRowPermissionByUserIdResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Expressions")
        private java.util.List<Expressions> expressions;

        @com.aliyun.core.annotation.NameInMap("IsDelete")
        private Boolean isDelete;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ScopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * Expressions.
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
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * ScopeType.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * Status.
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
     * {@link ListRowPermissionByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRowPermissionByUserIdResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("MappingColumnName")
        private String mappingColumnName;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * MappingColumnName.
             */
            public Builder mappingColumnName(String mappingColumnName) {
                this.mappingColumnName = mappingColumnName;
                return this;
            }

            /**
             * ResourceId.
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
     * {@link ListRowPermissionByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRowPermissionByUserIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private Data(Builder builder) {
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.modifier = builder.modifier;
            this.rules = builder.rules;
            this.tables = builder.tables;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
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

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private String modifier; 
            private java.util.List<Rules> rules; 
            private java.util.List<Tables> tables; 
            private Long tenantId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.modifier = model.modifier;
                this.rules = model.rules;
                this.tables = model.tables;
                this.tenantId = model.tenantId;
            } 

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
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

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRowPermissionByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRowPermissionByUserIdResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
