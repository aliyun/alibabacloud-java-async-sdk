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
 * {@link DescribeOversizeNonPartitionTableInfosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOversizeNonPartitionTableInfosResponseBody</p>
 */
public class DescribeOversizeNonPartitionTableInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DetectionItems")
    private java.util.List<DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private java.util.List<Tables> tables;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeOversizeNonPartitionTableInfosResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.detectionItems = builder.detectionItems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tables = builder.tables;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOversizeNonPartitionTableInfosResponseBody create() {
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
     * @return detectionItems
     */
    public java.util.List<DetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tables
     */
    public java.util.List<Tables> getTables() {
        return this.tables;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List<DetectionItems> detectionItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Tables> tables; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeOversizeNonPartitionTableInfosResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.detectionItems = model.detectionItems;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.tables = model.tables;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp16t5ci7r74s****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The queried detection items and detection results.</p>
         */
        public Builder detectionItems(java.util.List<DetectionItems> detectionItems) {
            this.detectionItems = detectionItems;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried oversized non-partitioned tables.</p>
         */
        public Builder tables(java.util.List<Tables> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOversizeNonPartitionTableInfosResponseBody build() {
            return new DescribeOversizeNonPartitionTableInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOversizeNonPartitionTableInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOversizeNonPartitionTableInfosResponseBody</p>
     */
    public static class DetectionItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DetectionItems(Builder builder) {
            this.message = builder.message;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionItems create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(DetectionItems model) {
                this.message = model.message;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * <p>The information about the detection result.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the detection item.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The severity level of the detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL
             * WARNING
             * CRITICAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DetectionItems build() {
                return new DetectionItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOversizeNonPartitionTableInfosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOversizeNonPartitionTableInfosResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("IndexSize")
        private Long indexSize;

        @com.aliyun.core.annotation.NameInMap("LocalDataSize")
        private Long localDataSize;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeySize")
        private Long primaryKeySize;

        @com.aliyun.core.annotation.NameInMap("RemoteDataSize")
        private Long remoteDataSize;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Long rowCount;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SpaceRatio")
        private Double spaceRatio;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Tables(Builder builder) {
            this.dataSize = builder.dataSize;
            this.indexSize = builder.indexSize;
            this.localDataSize = builder.localDataSize;
            this.primaryKeySize = builder.primaryKeySize;
            this.remoteDataSize = builder.remoteDataSize;
            this.rowCount = builder.rowCount;
            this.schemaName = builder.schemaName;
            this.spaceRatio = builder.spaceRatio;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return indexSize
         */
        public Long getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return localDataSize
         */
        public Long getLocalDataSize() {
            return this.localDataSize;
        }

        /**
         * @return primaryKeySize
         */
        public Long getPrimaryKeySize() {
            return this.primaryKeySize;
        }

        /**
         * @return remoteDataSize
         */
        public Long getRemoteDataSize() {
            return this.remoteDataSize;
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

        public static final class Builder {
            private Long dataSize; 
            private Long indexSize; 
            private Long localDataSize; 
            private Long primaryKeySize; 
            private Long remoteDataSize; 
            private Long rowCount; 
            private String schemaName; 
            private Double spaceRatio; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.dataSize = model.dataSize;
                this.indexSize = model.indexSize;
                this.localDataSize = model.localDataSize;
                this.primaryKeySize = model.primaryKeySize;
                this.remoteDataSize = model.remoteDataSize;
                this.rowCount = model.rowCount;
                this.schemaName = model.schemaName;
                this.spaceRatio = model.spaceRatio;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The data size of the table. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2921132457984</p>
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * <p>The data size of regular indexes. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * <p>The size of hot data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1223</p>
             */
            public Builder localDataSize(Long localDataSize) {
                this.localDataSize = localDataSize;
                return this;
            }

            /**
             * <p>The data size of the primary key index. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder primaryKeySize(Long primaryKeySize) {
                this.primaryKeySize = primaryKeySize;
                return this;
            }

            /**
             * <p>The size of cold data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder remoteDataSize(Long remoteDataSize) {
                this.remoteDataSize = remoteDataSize;
                return this;
            }

            /**
             * <p>The number of rows in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1222</p>
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adb_demo</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The percentage of the table size. Unit: %.</p>
             * <blockquote>
             * <p> Formula: Table storage percentage = Total data size of a table/Total data size of the cluster × 100%.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.3</p>
             */
            public Builder spaceRatio(Double spaceRatio) {
                this.spaceRatio = spaceRatio;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
