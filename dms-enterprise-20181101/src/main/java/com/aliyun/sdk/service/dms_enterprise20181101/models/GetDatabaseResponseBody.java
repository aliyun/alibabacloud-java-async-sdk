// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseResponseBody</p>
 */
public class GetDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Database")
    private Database database;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDatabaseResponseBody(Builder builder) {
        this.database = builder.database;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return database
     */
    public Database getDatabase() {
        return this.database;
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
        private Database database; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the database.
         */
        public Builder database(Database database) {
            this.database = database;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**: The request is successful.
         * *   **false**: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDatabaseResponseBody build() {
            return new GetDatabaseResponseBody(this);
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

        @com.aliyun.core.annotation.NameInMap("InstanceAlias")
        private String instanceAlias;

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
            this.instanceAlias = builder.instanceAlias;
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
         * @return instanceAlias
         */
        public String getInstanceAlias() {
            return this.instanceAlias;
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
            private String instanceAlias; 
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
             * The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The ID of the database administrator (DBA).
             */
            public Builder dbaId(String dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * The nickname of the DBA.
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
             * The type of the environment to which the database belongs. Valid values:
             * <p>
             * 
             * *   **product**: production environment
             * *   **dev**: development environment
             * *   **pre**: staging environment
             * *   **test**: test environment
             * *   **sit**: SIT environment
             * *   **uat**: user acceptance testing (UAT) environment
             * *   **pet**: stress testing environment
             * *   **stag**: STAG environment
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The endpoint that is used to connect to the database.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The alias of the instance.
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
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
             * The IDs of the owners of the database.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * The names of the owners of the database.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * The port that is used to connect to the database.
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
             * The keyword that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The SID of the database.
             * <p>
             * 
             * >  The value of the parameter is returned only for Oracle databases.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * The status of the database. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The database is running as expected.
             * *   **DISABLE**: The database is disabled.
             * *   **OFFLINE**: The database is unpublished.
             * *   **NOT_EXIST**: The database does not exist.
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
}
