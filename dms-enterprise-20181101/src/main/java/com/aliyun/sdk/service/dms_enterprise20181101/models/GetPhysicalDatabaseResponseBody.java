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
 * {@link GetPhysicalDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhysicalDatabaseResponseBody</p>
 */
public class GetPhysicalDatabaseResponseBody extends TeaModel {
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

    private GetPhysicalDatabaseResponseBody(Builder builder) {
        this.database = builder.database;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalDatabaseResponseBody create() {
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
         * <p>The information about the physical database.</p>
         */
        public Builder database(Database database) {
            this.database = database;
            return this;
        }

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
         * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
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

        public GetPhysicalDatabaseResponseBody build() {
            return new GetPhysicalDatabaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPhysicalDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalDatabaseResponseBody</p>
     */
    public static class OwnerIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerIds")
        private java.util.List<String> ownerIds;

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
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

        public static final class Builder {
            private java.util.List<String> ownerIds; 

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List<String> ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            public OwnerIdList build() {
                return new OwnerIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPhysicalDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalDatabaseResponseBody</p>
     */
    public static class OwnerNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerNames")
        private java.util.List<String> ownerNames;

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
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

        public static final class Builder {
            private java.util.List<String> ownerNames; 

            /**
             * OwnerNames.
             */
            public Builder ownerNames(java.util.List<String> ownerNames) {
                this.ownerNames = ownerNames;
                return this;
            }

            public OwnerNameList build() {
                return new OwnerNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPhysicalDatabaseResponseBody} extends {@link TeaModel}
     *
     * <p>GetPhysicalDatabaseResponseBody</p>
     */
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
             * <p>The name of the catalog to which the database belongs.</p>
             * <blockquote>
             * <p>: If the database is a PostgreSQL database, the name of the database is displayed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>def</p>
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * <p>The ID of the physical database.</p>
             * 
             * <strong>example:</strong>
             * <p>43125312</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
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
             * <p>The user ID of the DBA in the destination database.</p>
             * 
             * <strong>example:</strong>
             * <p>43253</p>
             */
            public Builder dbaId(String dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * <p>The nickname of the database administrator (DBA) in the destination database.</p>
             * 
             * <strong>example:</strong>
             * <p>dmstest</p>
             */
            public Builder dbaName(String dbaName) {
                this.dbaName = dbaName;
                return this;
            }

            /**
             * <p>The encoding format of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8mb4</p>
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * <p>The type of the environment to which the database belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The endpoint that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-xxxab3r272.mysql.rds.aliyuncs.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The alias of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * <p>The instance ID of the destination database.</p>
             * 
             * <strong>example:</strong>
             * <p>43215325</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The user IDs of the database owners.</p>
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * <p>The nicknames of the database owners.</p>
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * <p>The port that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * <blockquote>
             * <p>: If the database is a PostgreSQL database, the name of the mode is displayed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dmstest</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name that is used for searching the database.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:dmstest@rm-xxxab3r272.mysql.rds.aliyuncs.com">dmstest@rm-xxxab3r272.mysql.rds.aliyuncs.com</a>:3306</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * <p>The system ID (SID) of the database.</p>
             * <blockquote>
             * <p>: The value of the parameter is returned only for Oracle databases.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>def</p>
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * <p>The state of the database. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong>: The database is normal.</li>
             * <li><strong>DISABLE</strong>: The database is disabled.</li>
             * <li><strong>OFFLINE</strong>: The database is unpublished.</li>
             * <li><strong>NOT_EXIST</strong>: The database does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
