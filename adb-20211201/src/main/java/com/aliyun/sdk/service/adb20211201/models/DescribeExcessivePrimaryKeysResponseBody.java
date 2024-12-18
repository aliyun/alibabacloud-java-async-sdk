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
    private java.util.List<DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private java.util.List<Tables> tables;

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
        private String accessDeniedDetail; 
        private String DBClusterId; 
        private java.util.List<DetectionItems> detectionItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Tables> tables; 
        private String totalCount; 

        /**
         * <p>The queried information about the request denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,
         *     &quot;AuthPrincipalOwnerId&quot;: &quot;1906102576997697&quot;,
         *     &quot;EncodedDiagnosticMessage&quot;: &quot;AQIBIAAAAOPdwKY2QLOvgMEc7SkkoJfj1kvZwsaRqNYMh10Tv0wTe0fCzaCdrvgazfNb0EnJKETgXyhR+3BIQjx9WAqZryejBsp1Bl4qI5En/D9dEhcXAtKCxCmE2kZCiEzpy8BoEUt+bs0DmlaGWO5xkEpttypLIB4rUhDvZd+zwPg4EXk4KSSWSWsurxtqDkKEMshKlQFBTKvJcNqPqHV6lwR4INiAGjIvK1ngXxN1O+6ORRB6A8YvztEOGywOk81ZmuNk0YrNy+qk7+UVDTHeXKsy8h9e/ePY/LMidj0RCmDpo/YpCumd0UGe0qEPe2U+UJAm/+UHlnEFLVg6BP3yIB5D++MCy7mgWm8Kwyhk62IeYly4hQ+5IpXjkh1GQXuDgLVVPVpxEek9n30vnCUL4KsaMgfa7dgojb+3TM8xGsD2zVK5STJNrsXclscIJEqyNXd7CBYiRJVZi1HPO6drN9WW0chLpCSTgjO8n0bNanZaxXKumW9PSwV58UoSFASeMWfZK3TLngX+oq8nGmnTwcJosVjfF4RGzAnS1IXt0Q9N2WHDnpwyLBU/nOz7Hsy8IZ+h+OVjsBTXSM9688/vOF707a5mNzpETvQeGRcua3A5livcKAM2cML0yeUs/Zyj/+BGqtVa+wektspDHC/CECh6R5lxQjRmUdPawY8VDs2onmdLuEH8DdmYt+Yv/jBFBUMWOyAluzkPYcX5nuQKouCIUJUFTSbsJsuH5CTIh7Ls5rbmkj+T1qTVz8gnDR8LxwaqoMSna+elXgVyOOxXtMkenVntsmoC3p/4G7yTPL1hu8JyWGIIvZHZGGLXGEH7FeSuMV8buKxPGFWG3arG8e9LGvDdz5dgTien4y6G5AQ0o1iQdXDos5VWdH3u7k5PrsvdEOpvMi6uSd8a42na80FsYlgGlwM5upydcWUC5Un2HCkJpT1xgk2L6shdVTrK6bidRrqE784FhW9bBQePzGaxSupPENZya0VUctRt+7uq3QwIn4y5jzjgX0E0jgmqPrgiVDjBesMQZYfGPCGysWYWYzfoh+G6V7N2VVGtNnGUwNWzM0WJBPONAgxPv+AmixFRCQ==&quot;,
         *     &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;,
         *     &quot;AuthPrincipalDisplayName&quot;: &quot;202515810214480629&quot;,
         *     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,
         *     &quot;AuthAction&quot;: &quot;adb:DescribeExcessivePrimaryKeys&quot;
         *   }</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1ub9grke1****</p>
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
         * <p>863D51B7-5321-41D8-A0B6-A088B0******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried tables that have excessive primary key fields.</p>
         */
        public Builder tables(java.util.List<Tables> tables) {
            this.tables = tables;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeExcessivePrimaryKeysResponseBody build() {
            return new DescribeExcessivePrimaryKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExcessivePrimaryKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExcessivePrimaryKeysResponseBody</p>
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

            /**
             * <p>The detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the detection item.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
             * WARNNING
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
     * {@link DescribeExcessivePrimaryKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExcessivePrimaryKeysResponseBody</p>
     */
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
             * <p>The total number of columns.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder columnCount(Integer columnCount) {
                this.columnCount = columnCount;
                return this;
            }

            /**
             * <p>The queried primary key fields.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder primaryKeyColumns(String primaryKeyColumns) {
                this.primaryKeyColumns = primaryKeyColumns;
                return this;
            }

            /**
             * <p>The number of primary key fields.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder primaryKeyCount(Integer primaryKeyCount) {
                this.primaryKeyCount = primaryKeyCount;
                return this;
            }

            /**
             * <p>The data size of primary key indexes. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>222</p>
             */
            public Builder primaryKeyIndexSize(Long primaryKeyIndexSize) {
                this.primaryKeyIndexSize = primaryKeyIndexSize;
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
             * <p>23</p>
             */
            public Builder spaceRatio(Double spaceRatio) {
                this.spaceRatio = spaceRatio;
                return this;
            }

            /**
             * <p>The name of the table</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The cold data size. Unit: bytes.</p>
             * <blockquote>
             * <p> Formula: Cold data size = Data size of table records + Data size of regular indexes + Data size of primary key indexes + Data size of other data.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
