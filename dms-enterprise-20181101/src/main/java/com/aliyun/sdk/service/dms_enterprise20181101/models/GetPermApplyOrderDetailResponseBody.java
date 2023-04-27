// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermApplyOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetPermApplyOrderDetailResponseBody</p>
 */
public class GetPermApplyOrderDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PermApplyOrderDetail")
    private PermApplyOrderDetail permApplyOrderDetail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * PermApplyOrderDetail.
         */
        public Builder permApplyOrderDetail(PermApplyOrderDetail permApplyOrderDetail) {
            this.permApplyOrderDetail = permApplyOrderDetail;
            return this;
        }

        /**
         * Id of the request
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

        public GetPermApplyOrderDetailResponseBody build() {
            return new GetPermApplyOrderDetailResponseBody(this);
        } 

    } 

    public static class ColumnInfo extends TeaModel {
        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("TableName")
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * TableName.
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
    public static class DatabaseInfo extends TeaModel {
        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("OwnerIds")
        private java.util.List < Long > ownerIds;

        @NameInMap("OwnerNickNames")
        private java.util.List < String > ownerNickNames;

        @NameInMap("SearchName")
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
        public java.util.List < Long > getOwnerIds() {
            return this.ownerIds;
        }

        /**
         * @return ownerNickNames
         */
        public java.util.List < String > getOwnerNickNames() {
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
            private java.util.List < Long > ownerIds; 
            private java.util.List < String > ownerNickNames; 
            private String searchName; 

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
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
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List < Long > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * OwnerNickNames.
             */
            public Builder ownerNickNames(java.util.List < String > ownerNickNames) {
                this.ownerNickNames = ownerNickNames;
                return this;
            }

            /**
             * SearchName.
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
    public static class InstanceInfo extends TeaModel {
        @NameInMap("DbType")
        private String dbType;

        @NameInMap("DbaId")
        private Long dbaId;

        @NameInMap("DbaNickName")
        private String dbaNickName;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Host")
        private String host;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OwnerIds")
        private java.util.List < Long > ownerIds;

        @NameInMap("OwnerNickName")
        private java.util.List < String > ownerNickName;

        @NameInMap("Port")
        private Long port;

        @NameInMap("SearchName")
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
        public java.util.List < Long > getOwnerIds() {
            return this.ownerIds;
        }

        /**
         * @return ownerNickName
         */
        public java.util.List < String > getOwnerNickName() {
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
            private java.util.List < Long > ownerIds; 
            private java.util.List < String > ownerNickName; 
            private Long port; 
            private String searchName; 

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * DbaId.
             */
            public Builder dbaId(Long dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * DbaNickName.
             */
            public Builder dbaNickName(String dbaNickName) {
                this.dbaNickName = dbaNickName;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List < Long > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            /**
             * OwnerNickName.
             */
            public Builder ownerNickName(java.util.List < String > ownerNickName) {
                this.ownerNickName = ownerNickName;
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
             * SearchName.
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
    public static class TableInfo extends TeaModel {
        @NameInMap("TableName")
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
             * TableName.
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
    public static class Resources extends TeaModel {
        @NameInMap("ColumnInfo")
        private ColumnInfo columnInfo;

        @NameInMap("DatabaseInfo")
        private DatabaseInfo databaseInfo;

        @NameInMap("InstanceInfo")
        private InstanceInfo instanceInfo;

        @NameInMap("TableInfo")
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
             * ColumnInfo.
             */
            public Builder columnInfo(ColumnInfo columnInfo) {
                this.columnInfo = columnInfo;
                return this;
            }

            /**
             * DatabaseInfo.
             */
            public Builder databaseInfo(DatabaseInfo databaseInfo) {
                this.databaseInfo = databaseInfo;
                return this;
            }

            /**
             * InstanceInfo.
             */
            public Builder instanceInfo(InstanceInfo instanceInfo) {
                this.instanceInfo = instanceInfo;
                return this;
            }

            /**
             * TableInfo.
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
    public static class PermApplyOrderDetail extends TeaModel {
        @NameInMap("ApplyType")
        private String applyType;

        @NameInMap("PermType")
        private Long permType;

        @NameInMap("Resources")
        private java.util.List < Resources> resources;

        @NameInMap("Seconds")
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
        public java.util.List < Resources> getResources() {
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
            private java.util.List < Resources> resources; 
            private Long seconds; 

            /**
             * ApplyType.
             */
            public Builder applyType(String applyType) {
                this.applyType = applyType;
                return this;
            }

            /**
             * PermType.
             */
            public Builder permType(Long permType) {
                this.permType = permType;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(java.util.List < Resources> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * Seconds.
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
