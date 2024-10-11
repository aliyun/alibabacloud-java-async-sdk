// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSqlPatternResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlPatternResponseBody</p>
 */
public class DescribeSqlPatternResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSqlPatternResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlPatternResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The queried SQL pattern.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>DB1F6C23-CBCA-5260-9366-BA7BB5EBF6F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSqlPatternResponseBody build() {
            return new DescribeSqlPatternResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlPatternResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlPatternResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessIP")
        private String accessIP;

        @com.aliyun.core.annotation.NameInMap("AvgCpuTime")
        private String avgCpuTime;

        @com.aliyun.core.annotation.NameInMap("AvgPeakMemory")
        private String avgPeakMemory;

        @com.aliyun.core.annotation.NameInMap("AvgScanSize")
        private String avgScanSize;

        @com.aliyun.core.annotation.NameInMap("AvgStageCount")
        private String avgStageCount;

        @com.aliyun.core.annotation.NameInMap("AvgTaskCount")
        private String avgTaskCount;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MaxCpuTime")
        private String maxCpuTime;

        @com.aliyun.core.annotation.NameInMap("MaxPeakMemory")
        private String maxPeakMemory;

        @com.aliyun.core.annotation.NameInMap("MaxScanSize")
        private String maxScanSize;

        @com.aliyun.core.annotation.NameInMap("MaxStageCount")
        private String maxStageCount;

        @com.aliyun.core.annotation.NameInMap("MaxTaskCount")
        private String maxTaskCount;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        @com.aliyun.core.annotation.NameInMap("QueryCount")
        private String queryCount;

        @com.aliyun.core.annotation.NameInMap("ReportDate")
        private String reportDate;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Items(Builder builder) {
            this.accessIP = builder.accessIP;
            this.avgCpuTime = builder.avgCpuTime;
            this.avgPeakMemory = builder.avgPeakMemory;
            this.avgScanSize = builder.avgScanSize;
            this.avgStageCount = builder.avgStageCount;
            this.avgTaskCount = builder.avgTaskCount;
            this.instanceName = builder.instanceName;
            this.maxCpuTime = builder.maxCpuTime;
            this.maxPeakMemory = builder.maxPeakMemory;
            this.maxScanSize = builder.maxScanSize;
            this.maxStageCount = builder.maxStageCount;
            this.maxTaskCount = builder.maxTaskCount;
            this.pattern = builder.pattern;
            this.queryCount = builder.queryCount;
            this.reportDate = builder.reportDate;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return accessIP
         */
        public String getAccessIP() {
            return this.accessIP;
        }

        /**
         * @return avgCpuTime
         */
        public String getAvgCpuTime() {
            return this.avgCpuTime;
        }

        /**
         * @return avgPeakMemory
         */
        public String getAvgPeakMemory() {
            return this.avgPeakMemory;
        }

        /**
         * @return avgScanSize
         */
        public String getAvgScanSize() {
            return this.avgScanSize;
        }

        /**
         * @return avgStageCount
         */
        public String getAvgStageCount() {
            return this.avgStageCount;
        }

        /**
         * @return avgTaskCount
         */
        public String getAvgTaskCount() {
            return this.avgTaskCount;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return maxCpuTime
         */
        public String getMaxCpuTime() {
            return this.maxCpuTime;
        }

        /**
         * @return maxPeakMemory
         */
        public String getMaxPeakMemory() {
            return this.maxPeakMemory;
        }

        /**
         * @return maxScanSize
         */
        public String getMaxScanSize() {
            return this.maxScanSize;
        }

        /**
         * @return maxStageCount
         */
        public String getMaxStageCount() {
            return this.maxStageCount;
        }

        /**
         * @return maxTaskCount
         */
        public String getMaxTaskCount() {
            return this.maxTaskCount;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        /**
         * @return queryCount
         */
        public String getQueryCount() {
            return this.queryCount;
        }

        /**
         * @return reportDate
         */
        public String getReportDate() {
            return this.reportDate;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String accessIP; 
            private String avgCpuTime; 
            private String avgPeakMemory; 
            private String avgScanSize; 
            private String avgStageCount; 
            private String avgTaskCount; 
            private String instanceName; 
            private String maxCpuTime; 
            private String maxPeakMemory; 
            private String maxScanSize; 
            private String maxStageCount; 
            private String maxTaskCount; 
            private String pattern; 
            private String queryCount; 
            private String reportDate; 
            private String user; 

            /**
             * <p>The IP address of the client.</p>
             * <blockquote>
             * <p> This parameter is returned only when <strong>Type</strong> is set to <strong>accessip</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100.104.xx.xx</p>
             */
            public Builder accessIP(String accessIP) {
                this.accessIP = accessIP;
                return this;
            }

            /**
             * <p>The average execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0625</p>
             */
            public Builder avgCpuTime(String avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * <p>The average peak memory usage of the SQL pattern within the query time range. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>240048</p>
             */
            public Builder avgPeakMemory(String avgPeakMemory) {
                this.avgPeakMemory = avgPeakMemory;
                return this;
            }

            /**
             * <p>The average amount of data scanned based on the SQL pattern within the query time range. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>244</p>
             */
            public Builder avgScanSize(String avgScanSize) {
                this.avgScanSize = avgScanSize;
                return this;
            }

            /**
             * <p>The average number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder avgStageCount(String avgStageCount) {
                this.avgStageCount = avgStageCount;
                return this;
            }

            /**
             * <p>The average number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder avgTaskCount(String avgTaskCount) {
                this.avgTaskCount = avgTaskCount;
                return this;
            }

            /**
             * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-bp1ej1nq9n6****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The maximum execution duration of the SQL pattern within the query time range. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder maxCpuTime(String maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * <p>The maximum peak memory usage of the SQL pattern within the query time range. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>480096</p>
             */
            public Builder maxPeakMemory(String maxPeakMemory) {
                this.maxPeakMemory = maxPeakMemory;
                return this;
            }

            /**
             * <p>The maximum amount of data scanned based on the SQL pattern within the query time range. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder maxScanSize(String maxScanSize) {
                this.maxScanSize = maxScanSize;
                return this;
            }

            /**
             * <p>The maximum number of stages.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxStageCount(String maxStageCount) {
                this.maxStageCount = maxStageCount;
                return this;
            }

            /**
             * <p>The maximum number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxTaskCount(String maxTaskCount) {
                this.maxTaskCount = maxTaskCount;
                return this;
            }

            /**
             * <p>The SQL pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT table_name, table_schema AS schema_name, create_time, create_time AS last_ddl_time, table_comment AS description , ceil((data_length + index_length) / ? / ?) AS store_capacity , data_length AS data_bytes, index_length AS index_bytes, table_collation AS collation, auto_increment, table_rows AS num_rows , engine FROM information_schema.tables WHERE table_type != ? AND table_schema = ? AND table_name IN (?) ORDER BY 1</p>
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * <p>The number of queries performed in association with the SQL pattern within the query time range.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder queryCount(String queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * <p>The start date of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-30</p>
             */
            public Builder reportDate(String reportDate) {
                this.reportDate = reportDate;
                return this;
            }

            /**
             * <p>The username.</p>
             * <blockquote>
             * <p> This parameter is returned only when <strong>Type</strong> is left empty or set to <strong>user</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_acc</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
