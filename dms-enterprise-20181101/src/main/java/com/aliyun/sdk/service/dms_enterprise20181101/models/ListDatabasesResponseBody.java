// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabasesResponseBody</p>
 */
public class ListDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseList")
    private DatabaseList databaseList;

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

    private ListDatabasesResponseBody(Builder builder) {
        this.databaseList = builder.databaseList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseList
     */
    public DatabaseList getDatabaseList() {
        return this.databaseList;
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

    public static final class Builder {
        private DatabaseList databaseList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The details of the databases.
         */
        public Builder databaseList(DatabaseList databaseList) {
            this.databaseList = databaseList;
            return this;
        }

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
         * The number of databases that belong to an instance.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatabasesResponseBody build() {
            return new ListDatabasesResponseBody(this);
        } 

    } 

    public static class OwnerIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List < String > ownerIds;

        private OwnerIdList(Builder builder) {
            this.ownerIds = builder.ownerIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerIdList create() {
            return builder().build();
        }

        /**
         * @return ownerIds
         */
        public java.util.List < String > getOwnerIds() {
            return this.ownerIds;
        }

        public static final class Builder {
            private java.util.List < String > ownerIds; 

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List < String > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            public OwnerIdList build() {
                return new OwnerIdList(this);
            } 

        } 

    }
    public static class OwnerNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerNames")
        private java.util.List < String > ownerNames;

        private OwnerNameList(Builder builder) {
            this.ownerNames = builder.ownerNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerNameList create() {
            return builder().build();
        }

        /**
         * @return ownerNames
         */
        public java.util.List < String > getOwnerNames() {
            return this.ownerNames;
        }

        public static final class Builder {
            private java.util.List < String > ownerNames; 

            /**
             * OwnerNames.
             */
            public Builder ownerNames(java.util.List < String > ownerNames) {
                this.ownerNames = ownerNames;
                return this;
            }

            public OwnerNameList build() {
                return new OwnerNameList(this);
            } 

        } 

    }
    public static class Database extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DbaId")
        private String dbaId;

        @com.aliyun.core.annotation.NameInMap("DbaName")
        private String dbaName;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @com.aliyun.core.annotation.NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("Sid")
        private String sid;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Database(Builder builder) {
            this.catalogName = builder.catalogName;
            this.databaseId = builder.databaseId;
            this.dbType = builder.dbType;
            this.dbaId = builder.dbaId;
            this.dbaName = builder.dbaName;
            this.encoding = builder.encoding;
            this.envType = builder.envType;
            this.host = builder.host;
            this.instanceId = builder.instanceId;
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.port = builder.port;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.sid = builder.sid;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
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
        public String getDbaId() {
            return this.dbaId;
        }

        /**
         * @return dbaName
         */
        public String getDbaName() {
            return this.dbaName;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
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
         * @return ownerIdList
         */
        public OwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        /**
         * @return ownerNameList
         */
        public OwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        /**
         * @return port
         */
        public Integer getPort() {
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
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String catalogName; 
            private String databaseId; 
            private String dbType; 
            private String dbaId; 
            private String dbaName; 
            private String encoding; 
            private String envType; 
            private String host; 
            private String instanceId; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private Integer port; 
            private String schemaName; 
            private String searchName; 
            private String sid; 
            private String state; 

            /**
             * The name of the catalog to which the database belongs.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * The ID of the database.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
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
             * The ID of the DBA.
             */
            public Builder dbaId(String dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * The nickname of the Database administrator (DBA) to which the database belongs.
             */
            public Builder dbaName(String dbaName) {
                this.dbaName = dbaName;
                return this;
            }

            /**
             * The encoding format of the database.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
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
             * The endpoint of the instance to which the database belongs.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The ID of the instance to which the database belongs.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The IDs of the owners of the database.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * The nicknames of the database owners.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * The connection port of the instance to which the database belongs.
             */
            public Builder port(Integer port) {
                this.port = port;
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
             * The name that is used for searching the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The system ID (SID) of the instance to which the database belongs.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * The state of the database. Valid values:
             * <p>
             * 
             * *   NORMAL: The database is normal.
             * *   DISABLE: The database is disabled.
             * *   OFFLINE: The database is unpublished.
             * *   NOT_EXIST: The database does not exist.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    public static class DatabaseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private java.util.List < Database> database;

        private DatabaseList(Builder builder) {
            this.database = builder.database;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseList create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public java.util.List < Database> getDatabase() {
            return this.database;
        }

        public static final class Builder {
            private java.util.List < Database> database; 

            /**
             * Database.
             */
            public Builder database(java.util.List < Database> database) {
                this.database = database;
                return this;
            }

            public DatabaseList build() {
                return new DatabaseList(this);
            } 

        } 

    }
}
