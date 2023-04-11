// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTableResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTableResponseBody</p>
 */
public class SearchTableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SearchTableList")
    private SearchTableList searchTableList;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private SearchTableResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.searchTableList = builder.searchTableList;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTableResponseBody create() {
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
     * @return searchTableList
     */
    public SearchTableList getSearchTableList() {
        return this.searchTableList;
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
        private SearchTableList searchTableList; 
        private Boolean success; 
        private Long totalCount; 

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
         * The details of the tables.
         */
        public Builder searchTableList(SearchTableList searchTableList) {
            this.searchTableList = searchTableList;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries that are returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchTableResponseBody build() {
            return new SearchTableResponseBody(this);
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
    public static class SearchTable extends TeaModel {
        @NameInMap("DBSearchName")
        private String DBSearchName;

        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @NameInMap("TableGuid")
        private String tableGuid;

        @NameInMap("TableId")
        private String tableId;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TableSchemaName")
        private String tableSchemaName;

        private SearchTable(Builder builder) {
            this.DBSearchName = builder.DBSearchName;
            this.databaseId = builder.databaseId;
            this.dbName = builder.dbName;
            this.dbType = builder.dbType;
            this.description = builder.description;
            this.encoding = builder.encoding;
            this.engine = builder.engine;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.tableGuid = builder.tableGuid;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.tableSchemaName = builder.tableSchemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchTable create() {
            return builder().build();
        }

        /**
         * @return DBSearchName
         */
        public String getDBSearchName() {
            return this.DBSearchName;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
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
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
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
         * @return tableSchemaName
         */
        public String getTableSchemaName() {
            return this.tableSchemaName;
        }

        public static final class Builder {
            private String DBSearchName; 
            private String databaseId; 
            private String dbName; 
            private String dbType; 
            private String description; 
            private String encoding; 
            private String engine; 
            private String envType; 
            private Boolean logic; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private String tableGuid; 
            private String tableId; 
            private String tableName; 
            private String tableSchemaName; 

            /**
             * The name that is used to search for the database to which the table belongs.
             */
            public Builder DBSearchName(String DBSearchName) {
                this.DBSearchName = DBSearchName;
                return this;
            }

            /**
             * The ID of the database to which the table belongs.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
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
             * The type of the database. Valid values:
             * <p>
             * 
             * *   **MySQL**
             * *   **SQLServer**
             * *   **PostgreSQL**
             * *   **Oracle**
             * *   **DRDS**
             * *   **OceanBase**
             * *   **Mongo**
             * *   **Redis**
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The description of the table.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The encoding format of the table.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The engine of the table.
             */
            public Builder engine(String engine) {
                this.engine = engine;
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
             * Indicates whether the table is a logical table. Valid values:
             * <p>
             * 
             * *   **true**: The table is a logical table.
             * *   **false**: The table is not a logical table.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The IDs of the table owners.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * The nicknames of the table owners.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * The GUID of the table.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * The ID of the table.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The name of the database to which the table belongs.
             */
            public Builder tableSchemaName(String tableSchemaName) {
                this.tableSchemaName = tableSchemaName;
                return this;
            }

            public SearchTable build() {
                return new SearchTable(this);
            } 

        } 

    }
    public static class SearchTableList extends TeaModel {
        @NameInMap("SearchTable")
        private java.util.List < SearchTable> searchTable;

        private SearchTableList(Builder builder) {
            this.searchTable = builder.searchTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchTableList create() {
            return builder().build();
        }

        /**
         * @return searchTable
         */
        public java.util.List < SearchTable> getSearchTable() {
            return this.searchTable;
        }

        public static final class Builder {
            private java.util.List < SearchTable> searchTable; 

            /**
             * SearchTable.
             */
            public Builder searchTable(java.util.List < SearchTable> searchTable) {
                this.searchTable = searchTable;
                return this;
            }

            public SearchTableList build() {
                return new SearchTableList(this);
            } 

        } 

    }
}
