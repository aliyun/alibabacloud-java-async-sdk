// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>68075D06-7406-4887-83A7-F558A4D28C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The details of user permissions.</p>
         */
        public Builder userPermissions(UserPermissions userPermissions) {
            this.userPermissions = userPermissions;
            return this;
        }

        public ListDatabaseUserPermssionsResponseBody build() {
            return new ListDatabaseUserPermssionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDatabaseUserPermssionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabaseUserPermssionsResponseBody</p>
     */
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
             * <p>The time when the permission was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-12 00:00:00</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The time when the permissions expire.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-12 00:00:00</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The extra information. This parameter is reserved.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder extraData(String extraData) {
                this.extraData = extraData;
                return this;
            }

            /**
             * <p>The description of the entity that authorizes the permission.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx grant</p>
             */
            public Builder originFrom(String originFrom) {
                this.originFrom = originFrom;
                return this;
            }

            /**
             * <p>The type of the permission. Valid values:</p>
             * <ul>
             * <li>QUERY: the query permissions</li>
             * <li>EXPORT: the export permissions</li>
             * <li>CORRECT: the change permissions</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>QUERY</p>
             */
            public Builder permType(String permType) {
                this.permType = permType;
                return this;
            }

            /**
             * <p>The ID of the authorization record.</p>
             * 
             * <strong>example:</strong>
             * <p>13434</p>
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
    /**
     * 
     * {@link ListDatabaseUserPermssionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabaseUserPermssionsResponseBody</p>
     */
    public static class PermDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PermDetail")
        private java.util.List<PermDetail> permDetail;

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
        public java.util.List<PermDetail> getPermDetail() {
            return this.permDetail;
        }

        public static final class Builder {
            private java.util.List<PermDetail> permDetail; 

            /**
             * PermDetail.
             */
            public Builder permDetail(java.util.List<PermDetail> permDetail) {
                this.permDetail = permDetail;
                return this;
            }

            public PermDetails build() {
                return new PermDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDatabaseUserPermssionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabaseUserPermssionsResponseBody</p>
     */
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
             * <p>The alias of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_alias</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The name of a column.</p>
             * 
             * <strong>example:</strong>
             * <p>column_name</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of resources on which the user has permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>DATABASE</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * <p>The type of the environment to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1443</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The details of user permissions.</p>
             */
            public Builder permDetails(PermDetails permDetails) {
                this.permDetails = permDetails;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx@xxxx:3306</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * <p>The ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>42345</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>table_name</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>14324</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The nickname of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>user_nick_name</p>
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
    /**
     * 
     * {@link ListDatabaseUserPermssionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDatabaseUserPermssionsResponseBody</p>
     */
    public static class UserPermissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserPermission")
        private java.util.List<UserPermission> userPermission;

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
        public java.util.List<UserPermission> getUserPermission() {
            return this.userPermission;
        }

        public static final class Builder {
            private java.util.List<UserPermission> userPermission; 

            /**
             * UserPermission.
             */
            public Builder userPermission(java.util.List<UserPermission> userPermission) {
                this.userPermission = userPermission;
                return this;
            }

            public UserPermissions build() {
                return new UserPermissions(this);
            } 

        } 

    }
}
