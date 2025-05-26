// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAdbMySqlTableMetaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlTableMetaResponseBody</p>
 */
public class DescribeAdbMySqlTableMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TableMeta")
    private TableMeta tableMeta;

    private DescribeAdbMySqlTableMetaResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableMeta = builder.tableMeta;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdbMySqlTableMetaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return tableMeta
     */
    public TableMeta getTableMeta() {
        return this.tableMeta;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TableMeta tableMeta; 

        private Builder() {
        } 

        private Builder(DescribeAdbMySqlTableMetaResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tableMeta = model.tableMeta;
        } 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * TableMeta.
         */
        public Builder tableMeta(TableMeta tableMeta) {
            this.tableMeta = tableMeta;
            return this;
        }

        public DescribeAdbMySqlTableMetaResponseBody build() {
            return new DescribeAdbMySqlTableMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdbMySqlTableMetaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdbMySqlTableMetaResponseBody</p>
     */
    public static class TableMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DistributeColumn")
        private String distributeColumn;

        @com.aliyun.core.annotation.NameInMap("DistributeType")
        private String distributeType;

        @com.aliyun.core.annotation.NameInMap("IsAllIndex")
        private Boolean isAllIndex;

        @com.aliyun.core.annotation.NameInMap("IsDictEncode")
        private Boolean isDictEncode;

        @com.aliyun.core.annotation.NameInMap("IsFullTextDict")
        private Boolean isFullTextDict;

        @com.aliyun.core.annotation.NameInMap("IsHidden")
        private Boolean isHidden;

        @com.aliyun.core.annotation.NameInMap("PartitionColumn")
        private String partitionColumn;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyColumn")
        private String primaryKeyColumn;

        @com.aliyun.core.annotation.NameInMap("TableEngine")
        private String tableEngine;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableSchema")
        private String tableSchema;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private TableMeta(Builder builder) {
            this.createTime = builder.createTime;
            this.distributeColumn = builder.distributeColumn;
            this.distributeType = builder.distributeType;
            this.isAllIndex = builder.isAllIndex;
            this.isDictEncode = builder.isDictEncode;
            this.isFullTextDict = builder.isFullTextDict;
            this.isHidden = builder.isHidden;
            this.partitionColumn = builder.partitionColumn;
            this.partitionType = builder.partitionType;
            this.primaryKeyColumn = builder.primaryKeyColumn;
            this.tableEngine = builder.tableEngine;
            this.tableName = builder.tableName;
            this.tableSchema = builder.tableSchema;
            this.tableType = builder.tableType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableMeta create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return distributeColumn
         */
        public String getDistributeColumn() {
            return this.distributeColumn;
        }

        /**
         * @return distributeType
         */
        public String getDistributeType() {
            return this.distributeType;
        }

        /**
         * @return isAllIndex
         */
        public Boolean getIsAllIndex() {
            return this.isAllIndex;
        }

        /**
         * @return isDictEncode
         */
        public Boolean getIsDictEncode() {
            return this.isDictEncode;
        }

        /**
         * @return isFullTextDict
         */
        public Boolean getIsFullTextDict() {
            return this.isFullTextDict;
        }

        /**
         * @return isHidden
         */
        public Boolean getIsHidden() {
            return this.isHidden;
        }

        /**
         * @return partitionColumn
         */
        public String getPartitionColumn() {
            return this.partitionColumn;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return primaryKeyColumn
         */
        public String getPrimaryKeyColumn() {
            return this.primaryKeyColumn;
        }

        /**
         * @return tableEngine
         */
        public String getTableEngine() {
            return this.tableEngine;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableSchema
         */
        public String getTableSchema() {
            return this.tableSchema;
        }

        /**
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String distributeColumn; 
            private String distributeType; 
            private Boolean isAllIndex; 
            private Boolean isDictEncode; 
            private Boolean isFullTextDict; 
            private Boolean isHidden; 
            private String partitionColumn; 
            private String partitionType; 
            private String primaryKeyColumn; 
            private String tableEngine; 
            private String tableName; 
            private String tableSchema; 
            private String tableType; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(TableMeta model) {
                this.createTime = model.createTime;
                this.distributeColumn = model.distributeColumn;
                this.distributeType = model.distributeType;
                this.isAllIndex = model.isAllIndex;
                this.isDictEncode = model.isDictEncode;
                this.isFullTextDict = model.isFullTextDict;
                this.isHidden = model.isHidden;
                this.partitionColumn = model.partitionColumn;
                this.partitionType = model.partitionType;
                this.primaryKeyColumn = model.primaryKeyColumn;
                this.tableEngine = model.tableEngine;
                this.tableName = model.tableName;
                this.tableSchema = model.tableSchema;
                this.tableType = model.tableType;
                this.updateTime = model.updateTime;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DistributeColumn.
             */
            public Builder distributeColumn(String distributeColumn) {
                this.distributeColumn = distributeColumn;
                return this;
            }

            /**
             * DistributeType.
             */
            public Builder distributeType(String distributeType) {
                this.distributeType = distributeType;
                return this;
            }

            /**
             * IsAllIndex.
             */
            public Builder isAllIndex(Boolean isAllIndex) {
                this.isAllIndex = isAllIndex;
                return this;
            }

            /**
             * IsDictEncode.
             */
            public Builder isDictEncode(Boolean isDictEncode) {
                this.isDictEncode = isDictEncode;
                return this;
            }

            /**
             * IsFullTextDict.
             */
            public Builder isFullTextDict(Boolean isFullTextDict) {
                this.isFullTextDict = isFullTextDict;
                return this;
            }

            /**
             * IsHidden.
             */
            public Builder isHidden(Boolean isHidden) {
                this.isHidden = isHidden;
                return this;
            }

            /**
             * PartitionColumn.
             */
            public Builder partitionColumn(String partitionColumn) {
                this.partitionColumn = partitionColumn;
                return this;
            }

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * PrimaryKeyColumn.
             */
            public Builder primaryKeyColumn(String primaryKeyColumn) {
                this.primaryKeyColumn = primaryKeyColumn;
                return this;
            }

            /**
             * TableEngine.
             */
            public Builder tableEngine(String tableEngine) {
                this.tableEngine = tableEngine;
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
             * TableSchema.
             */
            public Builder tableSchema(String tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            /**
             * TableType.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public TableMeta build() {
                return new TableMeta(this);
            } 

        } 

    }
}
