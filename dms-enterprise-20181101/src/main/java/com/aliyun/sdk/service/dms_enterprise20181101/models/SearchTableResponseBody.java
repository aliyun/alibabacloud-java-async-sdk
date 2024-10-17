// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchTableResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTableResponseBody</p>
 */
public class SearchTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchTableList")
    private SearchTableList searchTableList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>1489257F-1B5D-4B5B-89EF-923C12CEEBD1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the tables.</p>
         */
        public Builder searchTableList(SearchTableList searchTableList) {
            this.searchTableList = searchTableList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchTableResponseBody build() {
            return new SearchTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchTableResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTableResponseBody</p>
     */
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
    /**
     * 
     * {@link SearchTableResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTableResponseBody</p>
     */
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
    /**
     * 
     * {@link SearchTableResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTableResponseBody</p>
     */
    public static class SearchTable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBSearchName")
        private String DBSearchName;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @com.aliyun.core.annotation.NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableSchemaName")
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
             * <p>The name that is used to search for the database to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBSearchName(String DBSearchName) {
                this.DBSearchName = DBSearchName;
                return this;
            }

            /**
             * <p>The ID of the database to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The type of the database. Valid values:</p>
             * <ul>
             * <li><strong>MySQL</strong></li>
             * <li><strong>SQLServer</strong></li>
             * <li><strong>PostgreSQL</strong></li>
             * <li><strong>Oracle</strong></li>
             * <li><strong>DRDS</strong></li>
             * <li><strong>OceanBase</strong></li>
             * <li><strong>Mongo</strong></li>
             * <li><strong>Redis</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The description of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The encoding format of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8</p>
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * <p>The engine of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>innodb</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The type of the environment to which the database belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>Indicates whether the table is a logical table. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The table is a logical table.</li>
             * <li><strong>false</strong>: The table is not a logical table.</li>
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
             * <p>The IDs of the table owners.</p>
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * <p>The nicknames of the table owners.</p>
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * <p>The GUID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>IDB_L_9032.db-test.yuyang_test</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>The ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The name of the database to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@xxx.xxx.xxx.xxx">test@xxx.xxx.xxx.xxx</a>:3306</p>
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
    /**
     * 
     * {@link SearchTableResponseBody} extends {@link TeaModel}
     *
     * <p>SearchTableResponseBody</p>
     */
    public static class SearchTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchTable")
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
