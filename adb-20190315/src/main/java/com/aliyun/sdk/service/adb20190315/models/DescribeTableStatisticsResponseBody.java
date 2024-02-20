// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableStatisticsResponseBody</p>
 */
public class DescribeTableStatisticsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private DescribeTableStatisticsResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableStatisticsResponseBody create() {
        return builder().build();
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
        private String totalCount; 

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Details about table statistics.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on the current page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTableStatisticsResponseBody build() {
            return new DescribeTableStatisticsResponseBody(this);
        } 

    } 

    public static class TableStatisticRecords extends TeaModel {
        @NameInMap("ColdDataSize")
        private Long coldDataSize;

        @NameInMap("DataSize")
        private Long dataSize;

        @NameInMap("HotDataSize")
        private Long hotDataSize;

        @NameInMap("IndexSize")
        private Long indexSize;

        @NameInMap("OtherSize")
        private Long otherSize;

        @NameInMap("PartitionCount")
        private Long partitionCount;

        @NameInMap("PrimaryKeyIndexSize")
        private Long primaryKeyIndexSize;

        @NameInMap("RowCount")
        private Long rowCount;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SpaceRatio")
        private Double spaceRatio;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TotalSize")
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

            /**
             * The total amount of cold data. Unit: byte.
             * <p>
             * 
             * >  The parameter is returned only when the engine version of the cluster is 3.1.3.4 or later.
             */
            public Builder coldDataSize(Long coldDataSize) {
                this.coldDataSize = coldDataSize;
                return this;
            }

            /**
             * The amount of data in the table. Unit: byte.
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
             * The amount of data in indexes. Unit: byte.
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
             * The number of partitions.
             */
            public Builder partitionCount(Long partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * The amount of data in primary key indexes. Unit: byte.
             */
            public Builder primaryKeyIndexSize(Long primaryKeyIndexSize) {
                this.primaryKeyIndexSize = primaryKeyIndexSize;
                return this;
            }

            /**
             * The number of rows in the table.
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
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
             * SpaceRatio.
             */
            public Builder spaceRatio(Double spaceRatio) {
                this.spaceRatio = spaceRatio;
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
    public static class Items extends TeaModel {
        @NameInMap("TableStatisticRecords")
        private java.util.List < TableStatisticRecords> tableStatisticRecords;

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
        public java.util.List < TableStatisticRecords> getTableStatisticRecords() {
            return this.tableStatisticRecords;
        }

        public static final class Builder {
            private java.util.List < TableStatisticRecords> tableStatisticRecords; 

            /**
             * TableStatisticRecords.
             */
            public Builder tableStatisticRecords(java.util.List < TableStatisticRecords> tableStatisticRecords) {
                this.tableStatisticRecords = tableStatisticRecords;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
