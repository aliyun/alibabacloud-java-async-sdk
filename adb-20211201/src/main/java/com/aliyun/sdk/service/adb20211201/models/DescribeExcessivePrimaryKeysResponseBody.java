// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExcessivePrimaryKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExcessivePrimaryKeysResponseBody</p>
 */
public class DescribeExcessivePrimaryKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DetectionItems")
    private java.util.List < DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private java.util.List < Tables> tables;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeExcessivePrimaryKeysResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public static DescribeExcessivePrimaryKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List < DetectionItems> getDetectionItems() {
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
    public java.util.List < Tables> getTables() {
        return this.tables;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String DBClusterId; 
        private java.util.List < DetectionItems> detectionItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < Tables> tables; 
        private String totalCount; 

        /**
         * The queried information about the request denial.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The queried detection items and detection results.
         */
        public Builder detectionItems(java.util.List < DetectionItems> detectionItems) {
            this.detectionItems = detectionItems;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   **30** (default)
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried tables that have excessive primary key fields.
         */
        public Builder tables(java.util.List < Tables> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExcessivePrimaryKeysResponseBody build() {
            return new DescribeExcessivePrimaryKeysResponseBody(this);
        } 

    } 

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

            /**
             * The detection result.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The name of the detection item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The severity level of the detection result.
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
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnCount")
        private Integer columnCount;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyColumns")
        private String primaryKeyColumns;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyCount")
        private Integer primaryKeyCount;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyIndexSize")
        private Long primaryKeyIndexSize;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SpaceRatio")
        private Double spaceRatio;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private Tables(Builder builder) {
            this.columnCount = builder.columnCount;
            this.primaryKeyColumns = builder.primaryKeyColumns;
            this.primaryKeyCount = builder.primaryKeyCount;
            this.primaryKeyIndexSize = builder.primaryKeyIndexSize;
            this.schemaName = builder.schemaName;
            this.spaceRatio = builder.spaceRatio;
            this.tableName = builder.tableName;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return columnCount
         */
        public Integer getColumnCount() {
            return this.columnCount;
        }

        /**
         * @return primaryKeyColumns
         */
        public String getPrimaryKeyColumns() {
            return this.primaryKeyColumns;
        }

        /**
         * @return primaryKeyCount
         */
        public Integer getPrimaryKeyCount() {
            return this.primaryKeyCount;
        }

        /**
         * @return primaryKeyIndexSize
         */
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
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
            private Integer columnCount; 
            private String primaryKeyColumns; 
            private Integer primaryKeyCount; 
            private Long primaryKeyIndexSize; 
            private String schemaName; 
            private Double spaceRatio; 
            private String tableName; 
            private Long totalSize; 

            /**
             * The total number of columns.
             */
            public Builder columnCount(Integer columnCount) {
                this.columnCount = columnCount;
                return this;
            }

            /**
             * The queried primary key fields.
             */
            public Builder primaryKeyColumns(String primaryKeyColumns) {
                this.primaryKeyColumns = primaryKeyColumns;
                return this;
            }

            /**
             * The number of primary key fields.
             */
            public Builder primaryKeyCount(Integer primaryKeyCount) {
                this.primaryKeyCount = primaryKeyCount;
                return this;
            }

            /**
             * The data size of primary key indexes. Unit: bytes.
             */
            public Builder primaryKeyIndexSize(Long primaryKeyIndexSize) {
                this.primaryKeyIndexSize = primaryKeyIndexSize;
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
             * The percentage of the table size. Unit: %.
             * <p>
             * 
             * >  Formula: Table storage percentage = Total data size of a table/Total data size of the cluster × 100%.
             */
            public Builder spaceRatio(Double spaceRatio) {
                this.spaceRatio = spaceRatio;
                return this;
            }

            /**
             * The name of the table
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The cold data size. Unit: bytes.
             * <p>
             * 
             * >  Formula: Cold data size = Data size of table records + Data size of regular indexes + Data size of primary key indexes + Data size of other data.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
