// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDBTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableDBTopologyResponseBody</p>
 */
public class GetTableDBTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBTopology")
    private DBTopology DBTopology;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTableDBTopologyResponseBody(Builder builder) {
        this.DBTopology = builder.DBTopology;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableDBTopologyResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBTopology
     */
    public DBTopology getDBTopology() {
        return this.DBTopology;
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

    public static final class Builder {
        private DBTopology DBTopology; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The topology of the data table.
         */
        public Builder DBTopology(DBTopology DBTopology) {
            this.DBTopology = DBTopology;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
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

        public GetTableDBTopologyResponseBody build() {
            return new GetTableDBTopologyResponseBody(this);
        } 

    } 

    public static class TableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        private TableList(Builder builder) {
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.tableType = builder.tableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableList create() {
            return builder().build();
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
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        public static final class Builder {
            private String tableId; 
            private String tableName; 
            private String tableType; 

            /**
             * The ID of the table.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * The name of the physical table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The type of the table. This is a reserved parameter.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
    public static class DatabaseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("TableList")
        private java.util.List < TableList> tableList;

        private DatabaseList(Builder builder) {
            this.dbId = builder.dbId;
            this.dbName = builder.dbName;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.tableList = builder.tableList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
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
         * @return tableList
         */
        public java.util.List < TableList> getTableList() {
            return this.tableList;
        }

        public static final class Builder {
            private String dbId; 
            private String dbName; 
            private String dbType; 
            private String envType; 
            private java.util.List < TableList> tableList; 

            /**
             * The ID of the database.
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The type of the environment to which the database belongs. Valid values:
             * <p>
             * 
             * *   **product**: production environment
             * *   **dev**: development environment
             * *   **pre**: pre-release environment
             * *   **test**: test environment
             * *   **sit**: system integration testing (SIT) environment
             * *   **uat**: user acceptance testing (UAT) environment
             * *   **pet**: stress testing environment
             * *   **stag**: staging environment
             * 
             * > For more information, see [Change the environment type of an instance](~~163309~~).
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The physical tables.
             */
            public Builder tableList(java.util.List < TableList> tableList) {
                this.tableList = tableList;
                return this;
            }

            public DatabaseList build() {
                return new DatabaseList(this);
            } 

        } 

    }
    public static class DataSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseList")
        private java.util.List < DatabaseList> databaseList;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Sid")
        private String sid;

        private DataSourceList(Builder builder) {
            this.databaseList = builder.databaseList;
            this.dbType = builder.dbType;
            this.host = builder.host;
            this.port = builder.port;
            this.sid = builder.sid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceList create() {
            return builder().build();
        }

        /**
         * @return databaseList
         */
        public java.util.List < DatabaseList> getDatabaseList() {
            return this.databaseList;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        public static final class Builder {
            private java.util.List < DatabaseList> databaseList; 
            private String dbType; 
            private String host; 
            private Integer port; 
            private String sid; 

            /**
             * The physical databases.
             */
            public Builder databaseList(java.util.List < DatabaseList> databaseList) {
                this.databaseList = databaseList;
                return this;
            }

            /**
             * The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The endpoint of the data source.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The port that is used to connect to the data source.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The system ID (SID) of the data source.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            public DataSourceList build() {
                return new DataSourceList(this);
            } 

        } 

    }
    public static class DBTopology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceList")
        private java.util.List < DataSourceList> dataSourceList;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private DBTopology(Builder builder) {
            this.dataSourceList = builder.dataSourceList;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBTopology create() {
            return builder().build();
        }

        /**
         * @return dataSourceList
         */
        public java.util.List < DataSourceList> getDataSourceList() {
            return this.dataSourceList;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List < DataSourceList> dataSourceList; 
            private String tableGuid; 
            private String tableName; 

            /**
             * The data sources.
             */
            public Builder dataSourceList(java.util.List < DataSourceList> dataSourceList) {
                this.dataSourceList = dataSourceList;
                return this;
            }

            /**
             * The GUID of the table in DMS.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * The name of the table.
             * <p>
             * 
             * > 
             * 
             * *   If a logical table is queried, the name of the logical table is returned.
             * 
             * *   If a physical table is queried, the name of the physical table is returned.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public DBTopology build() {
                return new DBTopology(this);
            } 

        } 

    }
}
