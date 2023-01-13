// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>SearchDatabaseResponseBody</p>
 */
public class SearchDatabaseResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SearchDatabaseList")
    private SearchDatabaseList searchDatabaseList;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private SearchDatabaseResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.searchDatabaseList = builder.searchDatabaseList;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchDatabaseResponseBody create() {
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
     * @return searchDatabaseList
     */
    public SearchDatabaseList getSearchDatabaseList() {
        return this.searchDatabaseList;
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
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SearchDatabaseList searchDatabaseList; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
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
         * The information about the databases.
         */
        public Builder searchDatabaseList(SearchDatabaseList searchDatabaseList) {
            this.searchDatabaseList = searchDatabaseList;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * - **true**: The request was successful.
         * - **false**: The request failed.
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

        public SearchDatabaseResponseBody build() {
            return new SearchDatabaseResponseBody(this);
        } 

    } 

    public static class OwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
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
        @NameInMap("OwnerNames")
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
    public static class SearchDatabase extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("CatalogName")
        private String catalogName;

        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("DatalinkName")
        private String datalinkName;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("DbaId")
        private String dbaId;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Host")
        private String host;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SearchName")
        private String searchName;

        @NameInMap("Sid")
        private String sid;

        private SearchDatabase(Builder builder) {
            this.alias = builder.alias;
            this.catalogName = builder.catalogName;
            this.databaseId = builder.databaseId;
            this.datalinkName = builder.datalinkName;
            this.dbType = builder.dbType;
            this.dbaId = builder.dbaId;
            this.encoding = builder.encoding;
            this.envType = builder.envType;
            this.host = builder.host;
            this.logic = builder.logic;
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.port = builder.port;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.sid = builder.sid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchDatabase create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
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
         * @return datalinkName
         */
        public String getDatalinkName() {
            return this.datalinkName;
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
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
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

        public static final class Builder {
            private String alias; 
            private String catalogName; 
            private String databaseId; 
            private String datalinkName; 
            private String dbType; 
            private String dbaId; 
            private String encoding; 
            private String envType; 
            private String host; 
            private Boolean logic; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private Integer port; 
            private String schemaName; 
            private String searchName; 
            private String sid; 

            /**
             * The alias of the database.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * CatalogName.
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
             * The name of the data link for cross-database queries.
             */
            public Builder datalinkName(String datalinkName) {
                this.datalinkName = datalinkName;
                return this;
            }

            /**
             * The type of the database.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The ID of the user who assumes the database administrator (DBA) role.
             */
            public Builder dbaId(String dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * The encoding method of the database.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The type of the environment to which the database belongs. For more information, see [Change the environment type of an instance](~~163309~~).
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The endpoint of the instance in which the database resides.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Indicates whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The database is a logical database.
             * *   **false**: The database is not a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
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
             * The port number of the instance in which the database resides.
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
             * The name that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The system ID (Sid) of the instance in which the database resides.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            public SearchDatabase build() {
                return new SearchDatabase(this);
            } 

        } 

    }
    public static class SearchDatabaseList extends TeaModel {
        @NameInMap("SearchDatabase")
        private java.util.List < SearchDatabase> searchDatabase;

        private SearchDatabaseList(Builder builder) {
            this.searchDatabase = builder.searchDatabase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchDatabaseList create() {
            return builder().build();
        }

        /**
         * @return searchDatabase
         */
        public java.util.List < SearchDatabase> getSearchDatabase() {
            return this.searchDatabase;
        }

        public static final class Builder {
            private java.util.List < SearchDatabase> searchDatabase; 

            /**
             * SearchDatabase.
             */
            public Builder searchDatabase(java.util.List < SearchDatabase> searchDatabase) {
                this.searchDatabase = searchDatabase;
                return this;
            }

            public SearchDatabaseList build() {
                return new SearchDatabaseList(this);
            } 

        } 

    }
}
