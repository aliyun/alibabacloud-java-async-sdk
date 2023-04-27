// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserPermissionsResponseBody</p>
 */
public class ListUserPermissionsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("UserPermissions")
    private UserPermissions userPermissions;

    private ListUserPermissionsResponseBody(Builder builder) {
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

    public static ListUserPermissionsResponseBody create() {
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
         * The ID of the user. You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the ID of the user.
         * <p>
         * 
         * >  The user ID is different from the ID of your Alibaba Cloud account.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The type of the environment to which the database belongs. Valid values:
         * <p>
         * 
         * *   product: production environment
         * *   dev: development environment
         * *   pre: staging environment
         * *   test: test environment
         * *   sit: SIT environment
         * *   uat: user acceptance testing (UAT) environment
         * *   pet: stress testing environment
         * *   stag: STAG environment
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The details of the permissions that the user has.
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

        /**
         * The permissions on a specific type of resources that you want to query. Valid values:
         * <p>
         * 
         * *   DATABASE: permissions on databases
         * *   TABLE: permissions on tables
         * *   COLUMN: permissions on fields
         * *   INSTANCE: permissions on instances
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Indicates whether the database is a logical database. Valid values:
         * <p>
         * 
         * *   true: The database is a logical database.
         * *   false: The database is a physical database.
         */
        public Builder userPermissions(UserPermissions userPermissions) {
            this.userPermissions = userPermissions;
            return this;
        }

        public ListUserPermissionsResponseBody build() {
            return new ListUserPermissionsResponseBody(this);
        } 

    } 

    public static class PermDetail extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("ExpireDate")
        private String expireDate;

        @NameInMap("ExtraData")
        private String extraData;

        @NameInMap("OriginFrom")
        private String originFrom;

        @NameInMap("PermType")
        private String permType;

        @NameInMap("UserAccessId")
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
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * Queries the permissions of a specific user on a database or a table.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * ExtraData.
             */
            public Builder extraData(String extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * The type of the permissions. Valid values:
             * <p>
             * 
             * *   QUERY: the query permissions
             * *   EXPORT: the export permissions
             * *   CORRECT: the change permissions
             */
            public Builder originFrom(String originFrom) {
                this.originFrom = originFrom;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder permType(String permType) {
                this.permType = permType;
                return this;
            }

            /**
             * UserAccessId.
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
        @NameInMap("PermDetail")
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
        @NameInMap("Alias")
        private String alias;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("DbId")
        private String dbId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("DsType")
        private String dsType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Host")
        private String host;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("PermDetails")
        private PermDetails permDetails;

        @NameInMap("Port")
        private Long port;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SearchName")
        private String searchName;

        @NameInMap("TableId")
        private String tableId;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserNickName")
        private String userNickName;

        private UserPermission(Builder builder) {
            this.alias = builder.alias;
            this.columnName = builder.columnName;
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.dsType = builder.dsType;
            this.envType = builder.envType;
            this.host = builder.host;
            this.instanceId = builder.instanceId;
            this.logic = builder.logic;
            this.permDetails = builder.permDetails;
            this.port = builder.port;
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
         * @return host
         */
        public String getHost() {
            return this.host;
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
         * @return port
         */
        public Long getPort() {
            return this.port;
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
            private String host; 
            private String instanceId; 
            private Boolean logic; 
            private PermDetails permDetails; 
            private Long port; 
            private String schemaName; 
            private String searchName; 
            private String tableId; 
            private String tableName; 
            private String userId; 
            private String userNickName; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The user who grants the permissions.
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * DsType.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The details of permissions.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The number of the page to return.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder permDetails(PermDetails permDetails) {
                this.permDetails = permDetails;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * The error message.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * SearchName.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * TableId.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The ID of the user.
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
        @NameInMap("UserPermission")
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
