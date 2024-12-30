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
         * <p>The topology of the data table.</p>
         */
        public Builder DBTopology(DBTopology DBTopology) {
            this.DBTopology = DBTopology;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
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
         * <p>853F7FD4-D922-4EFB-931C-D253EF159E06</p>
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

        public GetTableDBTopologyResponseBody build() {
            return new GetTableDBTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableDBTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableDBTopologyResponseBody</p>
     */
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
             * <p>The ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The name of the physical table.</p>
             * 
             * <strong>example:</strong>
             * <p>151977812</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The type of the table. This is a reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>yuyang_test_0000</p>
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
    /**
     * 
     * {@link GetTableDBTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableDBTopologyResponseBody</p>
     */
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
        private java.util.List<TableList> tableList;

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
        public java.util.List<TableList> getTableList() {
            return this.tableList;
        }

        public static final class Builder {
            private String dbId; 
            private String dbName; 
            private String dbType; 
            private String envType; 
            private java.util.List<TableList> tableList; 

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>489347</p>
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>db-test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the database belongs. Valid values:</p>
             * <ul>
             * <li><strong>product</strong>: production environment</li>
             * <li><strong>dev</strong>: development environment</li>
             * <li><strong>pre</strong>: pre-release environment</li>
             * <li><strong>test</strong>: test environment</li>
             * <li><strong>sit</strong>: system integration testing (SIT) environment</li>
             * <li><strong>uat</strong>: user acceptance testing (UAT) environment</li>
             * <li><strong>pet</strong>: stress testing environment</li>
             * <li><strong>stag</strong>: staging environment</li>
             * </ul>
             * <blockquote>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>pre</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The physical tables.</p>
             */
            public Builder tableList(java.util.List<TableList> tableList) {
                this.tableList = tableList;
                return this;
            }

            public DatabaseList build() {
                return new DatabaseList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTableDBTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableDBTopologyResponseBody</p>
     */
    public static class DataSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseList")
        private java.util.List<DatabaseList> databaseList;

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
        public java.util.List<DatabaseList> getDatabaseList() {
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
            private java.util.List<DatabaseList> databaseList; 
            private String dbType; 
            private String host; 
            private Integer port; 
            private String sid; 

            /**
             * <p>The physical databases.</p>
             */
            public Builder databaseList(java.util.List<DatabaseList> databaseList) {
                this.databaseList = databaseList;
                return this;
            }

            /**
             * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The endpoint of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.mysql.polardb.rds.aliyuncs.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port that is used to connect to the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The system ID (SID) of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>def</p>
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
    /**
     * 
     * {@link GetTableDBTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableDBTopologyResponseBody</p>
     */
    public static class DBTopology extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceList")
        private java.util.List<DataSourceList> dataSourceList;

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
        public java.util.List<DataSourceList> getDataSourceList() {
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
            private java.util.List<DataSourceList> dataSourceList; 
            private String tableGuid; 
            private String tableName; 

            /**
             * <p>The data sources.</p>
             */
            public Builder dataSourceList(java.util.List<DataSourceList> dataSourceList) {
                this.dataSourceList = dataSourceList;
                return this;
            }

            /**
             * <p>The GUID of the table in DMS.</p>
             * 
             * <strong>example:</strong>
             * <p>IDB_L_9032.db-test.yuyang_test</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If a logical table is queried, the name of the logical table is returned.</p>
             * </li>
             * <li><p>If a physical table is queried, the name of the physical table is returned.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>yuyang_test</p>
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
