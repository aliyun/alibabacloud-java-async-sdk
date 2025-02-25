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
 * {@link GetPermApplyOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetPermApplyOrderDetailResponseBody</p>
 */
public class GetPermApplyOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PermApplyOrderDetail")
    private PermApplyOrderDetail permApplyOrderDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPermApplyOrderDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.permApplyOrderDetail = builder.permApplyOrderDetail;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermApplyOrderDetailResponseBody create() {
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
     * @return permApplyOrderDetail
     */
    public PermApplyOrderDetail getPermApplyOrderDetail() {
        return this.permApplyOrderDetail;
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
        private String errorCode; 
        private String errorMessage; 
        private PermApplyOrderDetail permApplyOrderDetail; 
        private String requestId; 
        private Boolean success; 

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
         * <p>The details of the permission application ticket.</p>
         */
        public Builder permApplyOrderDetail(PermApplyOrderDetail permApplyOrderDetail) {
            this.permApplyOrderDetail = permApplyOrderDetail;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A4C4499E-5AC2-4318-9FCF-03E426781A04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPermApplyOrderDetailResponseBody build() {
            return new GetPermApplyOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPermApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermApplyOrderDetailResponseBody</p>
     */
    public static class ColumnInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private ColumnInfo(Builder builder) {
            this.columnName = builder.columnName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnInfo create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String columnName; 
            private String tableName; 

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>test_col</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_tb</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public ColumnInfo build() {
                return new ColumnInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPermApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermApplyOrderDetailResponseBody</p>
     */
    public static class DatabaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List<Long> ownerIds;

        @com.aliyun.core.annotation.NameInMap("OwnerNickNames")
        private java.util.List<String> ownerNickNames;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private DatabaseInfo(Builder builder) {
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.ownerIds = builder.ownerIds;
            this.ownerNickNames = builder.ownerNickNames;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseInfo create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return ownerIds
         */
        public java.util.List<Long> getOwnerIds() {
            return this.ownerIds;
        }

        /**
         * @return ownerNickNames
         */
        public java.util.List<String> getOwnerNickNames() {
            return this.ownerNickNames;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private Long dbId; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private java.util.List<Long> ownerIds; 
            private java.util.List<String> ownerNickNames; 
            private String searchName; 

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The IDs of the owners of the database.</p>
             */
            public Builder ownerIds(java.util.List<Long> ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * <p>The nicknames of the owners of the database.</p>
             */
            public Builder ownerNickNames(java.util.List<String> ownerNickNames) {
                this.ownerNickNames = ownerNickNames;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test@xxxx:3306【test】</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public DatabaseInfo build() {
                return new DatabaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPermApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermApplyOrderDetailResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DbaId")
        private Long dbaId;

        @com.aliyun.core.annotation.NameInMap("DbaNickName")
        private String dbaNickName;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List<Long> ownerIds;

        @com.aliyun.core.annotation.NameInMap("OwnerNickName")
        private java.util.List<String> ownerNickName;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Long port;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private InstanceInfo(Builder builder) {
            this.dbType = builder.dbType;
            this.dbaId = builder.dbaId;
            this.dbaNickName = builder.dbaNickName;
            this.envType = builder.envType;
            this.host = builder.host;
            this.instanceId = builder.instanceId;
            this.ownerIds = builder.ownerIds;
            this.ownerNickName = builder.ownerNickName;
            this.port = builder.port;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return dbaId
         */
        public Long getDbaId() {
            return this.dbaId;
        }

        /**
         * @return dbaNickName
         */
        public String getDbaNickName() {
            return this.dbaNickName;
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
         * @return ownerIds
         */
        public java.util.List<Long> getOwnerIds() {
            return this.ownerIds;
        }

        /**
         * @return ownerNickName
         */
        public java.util.List<String> getOwnerNickName() {
            return this.ownerNickName;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private String dbType; 
            private Long dbaId; 
            private String dbaNickName; 
            private String envType; 
            private String host; 
            private String instanceId; 
            private java.util.List<Long> ownerIds; 
            private java.util.List<String> ownerNickName; 
            private Long port; 
            private String searchName; 

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The ID of the database administrator (DBA) of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder dbaId(Long dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * <p>The nickname of the DBA of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test_dba</p>
             */
            public Builder dbaNickName(String dbaNickName) {
                this.dbaNickName = dbaNickName;
                return this;
            }

            /**
             * <p>The type of the environment to which the instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IDs of the owners of the instance.</p>
             */
            public Builder ownerIds(java.util.List<Long> ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * <p>The nicknames of the owners of the instance.</p>
             */
            public Builder ownerNickName(java.util.List<String> ownerNickName) {
                this.ownerNickName = ownerNickName;
                return this;
            }

            /**
             * <p>The port that is used to connect to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Long port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The name that is used to search for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx:3306</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPermApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermApplyOrderDetailResponseBody</p>
     */
    public static class TableInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private TableInfo(Builder builder) {
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfo create() {
            return builder().build();
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String tableName; 

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_tb</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableInfo build() {
                return new TableInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPermApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermApplyOrderDetailResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnInfo")
        private ColumnInfo columnInfo;

        @com.aliyun.core.annotation.NameInMap("DatabaseInfo")
        private DatabaseInfo databaseInfo;

        @com.aliyun.core.annotation.NameInMap("InstanceInfo")
        private InstanceInfo instanceInfo;

        @com.aliyun.core.annotation.NameInMap("TableInfo")
        private TableInfo tableInfo;

        private Resources(Builder builder) {
            this.columnInfo = builder.columnInfo;
            this.databaseInfo = builder.databaseInfo;
            this.instanceInfo = builder.instanceInfo;
            this.tableInfo = builder.tableInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return columnInfo
         */
        public ColumnInfo getColumnInfo() {
            return this.columnInfo;
        }

        /**
         * @return databaseInfo
         */
        public DatabaseInfo getDatabaseInfo() {
            return this.databaseInfo;
        }

        /**
         * @return instanceInfo
         */
        public InstanceInfo getInstanceInfo() {
            return this.instanceInfo;
        }

        /**
         * @return tableInfo
         */
        public TableInfo getTableInfo() {
            return this.tableInfo;
        }

        public static final class Builder {
            private ColumnInfo columnInfo; 
            private DatabaseInfo databaseInfo; 
            private InstanceInfo instanceInfo; 
            private TableInfo tableInfo; 

            /**
             * <p>The information about the column.</p>
             */
            public Builder columnInfo(ColumnInfo columnInfo) {
                this.columnInfo = columnInfo;
                return this;
            }

            /**
             * <p>The information about the database.</p>
             */
            public Builder databaseInfo(DatabaseInfo databaseInfo) {
                this.databaseInfo = databaseInfo;
                return this;
            }

            /**
             * <p>The information about the instance.</p>
             */
            public Builder instanceInfo(InstanceInfo instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            /**
             * <p>The information about the table.</p>
             */
            public Builder tableInfo(TableInfo tableInfo) {
                this.tableInfo = tableInfo;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPermApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermApplyOrderDetailResponseBody</p>
     */
    public static class PermApplyOrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyType")
        private String applyType;

        @com.aliyun.core.annotation.NameInMap("PermType")
        private Long permType;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List<Resources> resources;

        @com.aliyun.core.annotation.NameInMap("Seconds")
        private Long seconds;

        private PermApplyOrderDetail(Builder builder) {
            this.applyType = builder.applyType;
            this.permType = builder.permType;
            this.resources = builder.resources;
            this.seconds = builder.seconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermApplyOrderDetail create() {
            return builder().build();
        }

        /**
         * @return applyType
         */
        public String getApplyType() {
            return this.applyType;
        }

        /**
         * @return permType
         */
        public Long getPermType() {
            return this.permType;
        }

        /**
         * @return resources
         */
        public java.util.List<Resources> getResources() {
            return this.resources;
        }

        /**
         * @return seconds
         */
        public Long getSeconds() {
            return this.seconds;
        }

        public static final class Builder {
            private String applyType; 
            private Long permType; 
            private java.util.List<Resources> resources; 
            private Long seconds; 

            /**
             * <p>The type of objects on which you apply for permissions. Valid values:</p>
             * <ul>
             * <li><strong>DB</strong>: database</li>
             * <li><strong>TAB</strong>: table</li>
             * <li><strong>COL</strong>: column</li>
             * <li><strong>INSTANT</strong>: instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DB</p>
             */
            public Builder applyType(String applyType) {
                this.applyType = applyType;
                return this;
            }

            /**
             * <p>The type of the permissions that you apply for. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: the permissions to query information.</li>
             * <li><strong>2</strong>: the permissions to export information.</li>
             * <li><strong>3</strong>: the permissions to query and export information.</li>
             * <li><strong>4</strong>: the permissions to modify information.</li>
             * <li><strong>5</strong>: the permissions to query and modify information.</li>
             * <li><strong>6</strong>: the permissions to export and modify information.</li>
             * <li><strong>7</strong>: the permissions to query, export, and modify information.</li>
             * <li><strong>8</strong>: the permissions to log on to the database.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder permType(Long permType) {
                this.permType = permType;
                return this;
            }

            /**
             * <p>The list of resources.</p>
             */
            public Builder resources(java.util.List<Resources> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The validity duration of the permissions. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder seconds(Long seconds) {
                this.seconds = seconds;
                return this;
            }

            public PermApplyOrderDetail build() {
                return new PermApplyOrderDetail(this);
            } 

        } 

    }
}
