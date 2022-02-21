// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesResponseBody</p>
 */
public class ListTablesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableList")
    private TableList tableList;

    @NameInMap("TotalCount")
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
         * RequestId.
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

        /**
         * TableList.
         */
        public Builder tableList(TableList tableList) {
            this.tableList = tableList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTablesResponseBody build() {
            return new ListTablesResponseBody(this);
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
    public static class Table extends TeaModel {
        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("NumRows")
        private Long numRows;

        @NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @NameInMap("StoreCapacity")
        private Long storeCapacity;

        @NameInMap("TableGuid")
        private String tableGuid;

        @NameInMap("TableId")
        private String tableId;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TableSchemaName")
        private String tableSchemaName;

        @NameInMap("TableType")
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

            /**
             * DatabaseId.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Encoding.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * NumRows.
             */
            public Builder numRows(Long numRows) {
                this.numRows = numRows;
                return this;
            }

            /**
             * OwnerIdList.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * OwnerNameList.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * StoreCapacity.
             */
            public Builder storeCapacity(Long storeCapacity) {
                this.storeCapacity = storeCapacity;
                return this;
            }

            /**
             * TableGuid.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * TableId.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TableSchemaName.
             */
            public Builder tableSchemaName(String tableSchemaName) {
                this.tableSchemaName = tableSchemaName;
                return this;
            }

            /**
             * TableType.
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
    public static class TableList extends TeaModel {
        @NameInMap("Table")
        private java.util.List < Table> table;

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
        public java.util.List < Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < Table> table; 

            /**
             * Table.
             */
            public Builder table(java.util.List < Table> table) {
                this.table = table;
                return this;
            }

            public TableList build() {
                return new TableList(this);
            } 

        } 

    }
}
