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
 * {@link ListTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesResponseBody</p>
 */
public class ListTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TableList")
    private TableList tableList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTablesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableList = builder.tableList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return tableList
     */
    public TableList getTableList() {
        return this.tableList;
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
        private Boolean success; 
        private TableList tableList; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTablesResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tableList = model.tableList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
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
         * <p>B16FB618-5E96-4FFD-BB0D-490C890A4030</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The details of the tables.</p>
         */
        public Builder tableList(TableList tableList) {
            this.tableList = tableList;
            return this;
        }

        /**
         * <p>The total number of tables that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTablesResponseBody build() {
            return new ListTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OwnerIdList model) {
                this.ownerIds = model.ownerIds;
            } 

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
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(OwnerNameList model) {
                this.ownerNames = model.ownerNames;
            } 

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
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Encoding")
        private String encoding;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("NumRows")
        private Long numRows;

        @com.aliyun.core.annotation.NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @com.aliyun.core.annotation.NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @com.aliyun.core.annotation.NameInMap("StoreCapacity")
        private Long storeCapacity;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableSchemaName")
        private String tableSchemaName;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        private Table(Builder builder) {
            this.databaseId = builder.databaseId;
            this.description = builder.description;
            this.encoding = builder.encoding;
            this.engine = builder.engine;
            this.numRows = builder.numRows;
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.storeCapacity = builder.storeCapacity;
            this.tableGuid = builder.tableGuid;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
            this.tableSchemaName = builder.tableSchemaName;
            this.tableType = builder.tableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
            return builder().build();
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
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
         * @return numRows
         */
        public Long getNumRows() {
            return this.numRows;
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
         * @return storeCapacity
         */
        public Long getStoreCapacity() {
            return this.storeCapacity;
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

        /**
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        public static final class Builder {
            private String databaseId; 
            private String description; 
            private String encoding; 
            private String engine; 
            private Long numRows; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private Long storeCapacity; 
            private String tableGuid; 
            private String tableId; 
            private String tableName; 
            private String tableSchemaName; 
            private String tableType; 

            private Builder() {
            } 

            private Builder(Table model) {
                this.databaseId = model.databaseId;
                this.description = model.description;
                this.encoding = model.encoding;
                this.engine = model.engine;
                this.numRows = model.numRows;
                this.ownerIdList = model.ownerIdList;
                this.ownerNameList = model.ownerNameList;
                this.storeCapacity = model.storeCapacity;
                this.tableGuid = model.tableGuid;
                this.tableId = model.tableId;
                this.tableName = model.tableName;
                this.tableSchemaName = model.tableSchemaName;
                this.tableType = model.tableType;
            } 

            /**
             * <p>The ID of the physical database.</p>
             * 
             * <strong>example:</strong>
             * <p>1860****</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
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
             * <p>InnoDB</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The number of rows in the table. This is a statistical value and does not indicate the actual number of rows.</p>
             * 
             * <strong>example:</strong>
             * <p>10085</p>
             */
            public Builder numRows(Long numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * <p>The ID list of the table owners.</p>
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * <p>The nickname list of the table owners.</p>
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * <p>The storage space that is occupied by the table. This is a statistical value and does not indicate the accurate storage space. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder storeCapacity(Long storeCapacity) {
                this.storeCapacity = storeCapacity;
                return this;
            }

            /**
             * <p>The GUID of the table in DMS.</p>
             * 
             * <strong>example:</strong>
             * <p>IDB_44743****.qntest.consumption_records</p>
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * <p>The ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>44743****</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>consumption_records</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The database in which the table resides.</p>
             * 
             * <strong>example:</strong>
             * <p>qntest</p>
             */
            public Builder tableSchemaName(String tableSchemaName) {
                this.tableSchemaName = tableSchemaName;
                return this;
            }

            /**
             * <p>The type of the table. Default value: NORMAL.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class TableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List<Table> table;

        private TableList(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableList create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List<Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List<Table> table; 

            private Builder() {
            } 

            private Builder(TableList model) {
                this.table = model.table;
            } 

            /**
             * Table.
             */
            public Builder table(java.util.List<Table> table) {
                this.table = table;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
}
