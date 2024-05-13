// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabaseUserPermssionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabaseUserPermssionsResponseBody</p>
 */
public class ListDatabaseUserPermssionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UserPermissions")
    private UserPermissions userPermissions;

    private ListDatabaseUserPermssionsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.userPermissions = builder.userPermissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseUserPermssionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userPermissions
     */
    public UserPermissions getUserPermissions() {
        return this.userPermissions;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private UserPermissions userPermissions; 

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The details of user permissions.
         */
        public Builder userPermissions(UserPermissions userPermissions) {
            this.userPermissions = userPermissions;
            return this;
        }

        public ListDatabaseUserPermssionsResponseBody build() {
            return new ListDatabaseUserPermssionsResponseBody(this);
        } 

    } 

    public static class PermDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("ExtraData")
        private String extraData;

        @com.aliyun.core.annotation.NameInMap("OriginFrom")
        private String originFrom;

        @com.aliyun.core.annotation.NameInMap("PermType")
        private String permType;

        @com.aliyun.core.annotation.NameInMap("UserAccessId")
        private String userAccessId;

        private PermDetail(Builder builder) {
            this.createDate = builder.createDate;
            this.expireDate = builder.expireDate;
            this.extraData = builder.extraData;
            this.originFrom = builder.originFrom;
            this.permType = builder.permType;
            this.userAccessId = builder.userAccessId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermDetail create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return extraData
         */
        public String getExtraData() {
            return this.extraData;
        }

        /**
         * @return originFrom
         */
        public String getOriginFrom() {
            return this.originFrom;
        }

        /**
         * @return permType
         */
        public String getPermType() {
            return this.permType;
        }

        /**
         * @return userAccessId
         */
        public String getUserAccessId() {
            return this.userAccessId;
        }

        public static final class Builder {
            private String createDate; 
            private String expireDate; 
            private String extraData; 
            private String originFrom; 
            private String permType; 
            private String userAccessId; 

            /**
             * The time when the permission was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The time when the permissions expire.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * The extra information. This parameter is reserved.
             */
            public Builder extraData(String extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * The description of the entity that authorizes the permission.
             */
            public Builder originFrom(String originFrom) {
                this.originFrom = originFrom;
                return this;
            }

            /**
             * The type of the permission. Valid values:
             * <p>
             * 
             * *   QUERY: the query permissions
             * *   EXPORT: the export permissions
             * *   CORRECT: the change permissions
             */
            public Builder permType(String permType) {
                this.permType = permType;
                return this;
            }

            /**
             * The ID of the authorization record.
             */
            public Builder userAccessId(String userAccessId) {
                this.userAccessId = userAccessId;
                return this;
            }

            public PermDetail build() {
                return new PermDetail(this);
            } 

        } 

    }
    public static class PermDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PermDetail")
        private java.util.List < PermDetail> permDetail;

        private PermDetails(Builder builder) {
            this.permDetail = builder.permDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermDetails create() {
            return builder().build();
        }

        /**
         * @return permDetail
         */
        public java.util.List < PermDetail> getPermDetail() {
            return this.permDetail;
        }

        public static final class Builder {
            private java.util.List < PermDetail> permDetail; 

            /**
             * PermDetail.
             */
            public Builder permDetail(java.util.List < PermDetail> permDetail) {
                this.permDetail = permDetail;
                return this;
            }

            public PermDetails build() {
                return new PermDetails(this);
            } 

        } 

    }
    public static class UserPermission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("PermDetails")
        private PermDetails permDetails;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserNickName")
        private String userNickName;

        private UserPermission(Builder builder) {
            this.alias = builder.alias;
            this.columnName = builder.columnName;
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.dsType = builder.dsType;
            this.envType = builder.envType;
            this.instanceId = builder.instanceId;
            this.logic = builder.logic;
            this.permDetails = builder.permDetails;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.userId = builder.userId;
            this.userNickName = builder.userNickName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPermission create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return permDetails
         */
        public PermDetails getPermDetails() {
            return this.permDetails;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNickName
         */
        public String getUserNickName() {
            return this.userNickName;
        }

        public static final class Builder {
            private String alias; 
            private String columnName; 
            private String dbId; 
            private String dbType; 
            private String dsType; 
            private String envType; 
            private String instanceId; 
            private Boolean logic; 
            private PermDetails permDetails; 
            private String schemaName; 
            private String searchName; 
            private String tableId; 
            private String tableName; 
            private String userId; 
            private String userNickName; 

            /**
             * The alias of the database instance.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The name of a column.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The ID of the database.
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The type of the database engine.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The type of resources on which the user has permissions.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * The type of the environment to which the database belongs.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the database is a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The details of user permissions.
             */
            public Builder permDetails(PermDetails permDetails) {
                this.permDetails = permDetails;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The name that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The ID of the table.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The nickname of the user.
             */
            public Builder userNickName(String userNickName) {
                this.userNickName = userNickName;
                return this;
            }

            public UserPermission build() {
                return new UserPermission(this);
            } 

        } 

    }
    public static class UserPermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserPermission")
        private java.util.List < UserPermission> userPermission;

        private UserPermissions(Builder builder) {
            this.userPermission = builder.userPermission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPermissions create() {
            return builder().build();
        }

        /**
         * @return userPermission
         */
        public java.util.List < UserPermission> getUserPermission() {
            return this.userPermission;
        }

        public static final class Builder {
            private java.util.List < UserPermission> userPermission; 

            /**
             * UserPermission.
             */
            public Builder userPermission(java.util.List < UserPermission> userPermission) {
                this.userPermission = userPermission;
                return this;
            }

            public UserPermissions build() {
                return new UserPermissions(this);
            } 

        } 

    }
}
