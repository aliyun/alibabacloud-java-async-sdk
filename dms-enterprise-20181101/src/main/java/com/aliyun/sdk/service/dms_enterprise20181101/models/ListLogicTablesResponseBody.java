// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogicTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogicTablesResponseBody</p>
 */
public class ListLogicTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("LogicTableList")
    private LogicTableList logicTableList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListLogicTablesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.logicTableList = builder.logicTableList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogicTablesResponseBody create() {
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
     * @return logicTableList
     */
    public LogicTableList getLogicTableList() {
        return this.logicTableList;
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
        private String errorCode; 
        private String errorMessage; 
        private LogicTableList logicTableList; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

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
         * The details of the logical tables.
         */
        public Builder logicTableList(LogicTableList logicTableList) {
            this.logicTableList = logicTableList;
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
         * The total number of logical tables that meet the query conditions.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLogicTablesResponseBody build() {
            return new ListLogicTablesResponseBody(this);
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
    public static class LogicTable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @com.aliyun.core.annotation.NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableCount")
        private String tableCount;

        @com.aliyun.core.annotation.NameInMap("TableExpr")
        private String tableExpr;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private LogicTable(Builder builder) {
            this.databaseId = builder.databaseId;
            this.logic = builder.logic;
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.schemaName = builder.schemaName;
            this.tableCount = builder.tableCount;
            this.tableExpr = builder.tableExpr;
            this.tableGuid = builder.tableGuid;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicTable create() {
            return builder().build();
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
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
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return tableCount
         */
        public String getTableCount() {
            return this.tableCount;
        }

        /**
         * @return tableExpr
         */
        public String getTableExpr() {
            return this.tableExpr;
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

        public static final class Builder {
            private String databaseId; 
            private Boolean logic; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private String schemaName; 
            private String tableCount; 
            private String tableExpr; 
            private String tableGuid; 
            private String tableId; 
            private String tableName; 

            /**
             * The ID of the logical database.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * Indicates whether the table is a logical table. The value is fixed to true.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The IDs of the owners of the logical tables.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * The nicknames of the owners of the logical tables.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * The logical database to which the logical table belongs.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The number of logical tables.
             */
            public Builder tableCount(String tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * The expression of the logical table.
             */
            public Builder tableExpr(String tableExpr) {
                this.tableExpr = tableExpr;
                return this;
            }

            /**
             * The GUID of the logical table.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * The ID of the logical table.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * The name of the logical table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public LogicTable build() {
                return new LogicTable(this);
            } 

        } 

    }
    public static class LogicTableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogicTable")
        private java.util.List < LogicTable> logicTable;

        private LogicTableList(Builder builder) {
            this.logicTable = builder.logicTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogicTableList create() {
            return builder().build();
        }

        /**
         * @return logicTable
         */
        public java.util.List < LogicTable> getLogicTable() {
            return this.logicTable;
        }

        public static final class Builder {
            private java.util.List < LogicTable> logicTable; 

            /**
             * LogicTable.
             */
            public Builder logicTable(java.util.List < LogicTable> logicTable) {
                this.logicTable = logicTable;
                return this;
            }

            public LogicTableList build() {
                return new LogicTableList(this);
            } 

        } 

    }
}
