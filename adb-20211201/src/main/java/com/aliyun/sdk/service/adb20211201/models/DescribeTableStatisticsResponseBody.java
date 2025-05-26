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
 * {@link DescribeTableStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableStatisticsResponseBody</p>
 */
public class DescribeTableStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SchemaNames")
    private String schemaNames;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeTableStatisticsResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.schemaNames = builder.schemaNames;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemaNames
     */
    public String getSchemaNames() {
        return this.schemaNames;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private Items items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String schemaNames; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTableStatisticsResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.schemaNames = model.schemaNames;
            this.totalCount = model.totalCount;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * SchemaNames.
         */
        public Builder schemaNames(String schemaNames) {
            this.schemaNames = schemaNames;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTableStatisticsResponseBody build() {
            return new DescribeTableStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTableStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTableStatisticsResponseBody</p>
     */
    public static class TableStatisticRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdDataSize")
        private Long coldDataSize;

        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("HotDataSize")
        private Long hotDataSize;

        @com.aliyun.core.annotation.NameInMap("IndexSize")
        private Long indexSize;

        @com.aliyun.core.annotation.NameInMap("OtherSize")
        private Long otherSize;

        @com.aliyun.core.annotation.NameInMap("PartitionCount")
        private Long partitionCount;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyIndexSize")
        private Long primaryKeyIndexSize;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Long rowCount;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SpaceRatio")
        private Double spaceRatio;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private TableStatisticRecords(Builder builder) {
            this.coldDataSize = builder.coldDataSize;
            this.dataSize = builder.dataSize;
            this.hotDataSize = builder.hotDataSize;
            this.indexSize = builder.indexSize;
            this.otherSize = builder.otherSize;
            this.partitionCount = builder.partitionCount;
            this.primaryKeyIndexSize = builder.primaryKeyIndexSize;
            this.rowCount = builder.rowCount;
            this.schemaName = builder.schemaName;
            this.spaceRatio = builder.spaceRatio;
            this.tableName = builder.tableName;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableStatisticRecords create() {
            return builder().build();
        }

        /**
         * @return coldDataSize
         */
        public Long getColdDataSize() {
            return this.coldDataSize;
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return hotDataSize
         */
        public Long getHotDataSize() {
            return this.hotDataSize;
        }

        /**
         * @return indexSize
         */
        public Long getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return otherSize
         */
        public Long getOtherSize() {
            return this.otherSize;
        }

        /**
         * @return partitionCount
         */
        public Long getPartitionCount() {
            return this.partitionCount;
        }

        /**
         * @return primaryKeyIndexSize
         */
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
        }

        /**
         * @return rowCount
         */
        public Long getRowCount() {
            return this.rowCount;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return spaceRatio
         */
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Long coldDataSize; 
            private Long dataSize; 
            private Long hotDataSize; 
            private Long indexSize; 
            private Long otherSize; 
            private Long partitionCount; 
            private Long primaryKeyIndexSize; 
            private Long rowCount; 
            private String schemaName; 
            private Double spaceRatio; 
            private String tableName; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(TableStatisticRecords model) {
                this.coldDataSize = model.coldDataSize;
                this.dataSize = model.dataSize;
                this.hotDataSize = model.hotDataSize;
                this.indexSize = model.indexSize;
                this.otherSize = model.otherSize;
                this.partitionCount = model.partitionCount;
                this.primaryKeyIndexSize = model.primaryKeyIndexSize;
                this.rowCount = model.rowCount;
                this.schemaName = model.schemaName;
                this.spaceRatio = model.spaceRatio;
                this.tableName = model.tableName;
                this.totalSize = model.totalSize;
            } 

            /**
             * ColdDataSize.
             */
            public Builder coldDataSize(Long coldDataSize) {
                this.coldDataSize = coldDataSize;
                return this;
            }

            /**
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * HotDataSize.
             */
            public Builder hotDataSize(Long hotDataSize) {
                this.hotDataSize = hotDataSize;
                return this;
            }

            /**
             * IndexSize.
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * OtherSize.
             */
            public Builder otherSize(Long otherSize) {
                this.otherSize = otherSize;
                return this;
            }

            /**
             * PartitionCount.
             */
            public Builder partitionCount(Long partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * PrimaryKeyIndexSize.
             */
            public Builder primaryKeyIndexSize(Long primaryKeyIndexSize) {
                this.primaryKeyIndexSize = primaryKeyIndexSize;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * SpaceRatio.
             */
            public Builder spaceRatio(Double spaceRatio) {
                this.spaceRatio = spaceRatio;
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
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public TableStatisticRecords build() {
                return new TableStatisticRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTableStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTableStatisticsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableStatisticRecords")
        private java.util.List<TableStatisticRecords> tableStatisticRecords;

        private Items(Builder builder) {
            this.tableStatisticRecords = builder.tableStatisticRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return tableStatisticRecords
         */
        public java.util.List<TableStatisticRecords> getTableStatisticRecords() {
            return this.tableStatisticRecords;
        }

        public static final class Builder {
            private java.util.List<TableStatisticRecords> tableStatisticRecords; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.tableStatisticRecords = model.tableStatisticRecords;
            } 

            /**
             * TableStatisticRecords.
             */
            public Builder tableStatisticRecords(java.util.List<TableStatisticRecords> tableStatisticRecords) {
                this.tableStatisticRecords = tableStatisticRecords;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
