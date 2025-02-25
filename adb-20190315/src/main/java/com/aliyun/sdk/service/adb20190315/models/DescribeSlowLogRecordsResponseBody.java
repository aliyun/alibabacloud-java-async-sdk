// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
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

    public static DescribeSlowLogRecordsResponseBody create() {
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
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1rqvm70uh2****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Details of the slow query logs.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7559209-7EC3-41E1-8F78-156990******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
    public static class SlowLogRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("OutputSize")
        private String outputSize;

        @com.aliyun.core.annotation.NameInMap("ParseRowCounts")
        private Long parseRowCounts;

        @com.aliyun.core.annotation.NameInMap("PeakMemoryUsage")
        private String peakMemoryUsage;

        @com.aliyun.core.annotation.NameInMap("PlanningTime")
        private Long planningTime;

        @com.aliyun.core.annotation.NameInMap("ProcessID")
        private String processID;

        @com.aliyun.core.annotation.NameInMap("QueryTime")
        private Long queryTime;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Long queueTime;

        @com.aliyun.core.annotation.NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("ScanSize")
        private String scanSize;

        @com.aliyun.core.annotation.NameInMap("ScanTime")
        private Long scanTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("WallTime")
        private Long wallTime;

        private SlowLogRecord(Builder builder) {
            this.DBName = builder.DBName;
            this.executionStartTime = builder.executionStartTime;
            this.hostAddress = builder.hostAddress;
            this.outputSize = builder.outputSize;
            this.parseRowCounts = builder.parseRowCounts;
            this.peakMemoryUsage = builder.peakMemoryUsage;
            this.planningTime = builder.planningTime;
            this.processID = builder.processID;
            this.queryTime = builder.queryTime;
            this.queueTime = builder.queueTime;
            this.returnRowCounts = builder.returnRowCounts;
            this.SQLText = builder.SQLText;
            this.scanRows = builder.scanRows;
            this.scanSize = builder.scanSize;
            this.scanTime = builder.scanTime;
            this.state = builder.state;
            this.userName = builder.userName;
            this.wallTime = builder.wallTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlowLogRecord create() {
            return builder().build();
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return executionStartTime
         */
        public String getExecutionStartTime() {
            return this.executionStartTime;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return outputSize
         */
        public String getOutputSize() {
            return this.outputSize;
        }

        /**
         * @return parseRowCounts
         */
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        /**
         * @return peakMemoryUsage
         */
        public String getPeakMemoryUsage() {
            return this.peakMemoryUsage;
        }

        /**
         * @return planningTime
         */
        public Long getPlanningTime() {
            return this.planningTime;
        }

        /**
         * @return processID
         */
        public String getProcessID() {
            return this.processID;
        }

        /**
         * @return queryTime
         */
        public Long getQueryTime() {
            return this.queryTime;
        }

        /**
         * @return queueTime
         */
        public Long getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return returnRowCounts
         */
        public Long getReturnRowCounts() {
            return this.returnRowCounts;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
        }

        /**
         * @return scanSize
         */
        public String getScanSize() {
            return this.scanSize;
        }

        /**
         * @return scanTime
         */
        public Long getScanTime() {
            return this.scanTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return wallTime
         */
        public Long getWallTime() {
            return this.wallTime;
        }

        public static final class Builder {
            private String DBName; 
            private String executionStartTime; 
            private String hostAddress; 
            private String outputSize; 
            private Long parseRowCounts; 
            private String peakMemoryUsage; 
            private Long planningTime; 
            private String processID; 
            private Long queryTime; 
            private Long queueTime; 
            private Long returnRowCounts; 
            private String SQLText; 
            private Long scanRows; 
            private String scanSize; 
            private Long scanTime; 
            private String state; 
            private String userName; 
            private Long wallTime; 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adb_demo</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The time when the execution started. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-27T08:04:43Z</p>
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * <p>The IP address of the client that is used to connect to the database.</p>
             * 
             * <strong>example:</strong>
             * <p><code>172.16.**.**</code></p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The amount of output data in the task. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0.009</p>
             */
            public Builder outputSize(String outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * <p>The number of rows parsed by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parseRowCounts(Long parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * <p>The maximum memory usage when the SQL statement is executed. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>431.447</p>
             */
            public Builder peakMemoryUsage(String peakMemoryUsage) {
                this.peakMemoryUsage = peakMemoryUsage;
                return this;
            }

            /**
             * <p>The amount of time consumed to generate execution plans. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder planningTime(Long planningTime) {
                this.planningTime = planningTime;
                return this;
            }

            /**
             * <p>The ID of the process.</p>
             * 
             * <strong>example:</strong>
             * <p>2021052716044317201616624903453******</p>
             */
            public Builder processID(String processID) {
                this.processID = processID;
                return this;
            }

            /**
             * <p>The time consumed to execute the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2344</p>
             */
            public Builder queryTime(Long queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * <p>The queuing duration before the query is executed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder queueTime(Long queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * <p>The number of rows returned by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * <p>Details of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>INSERT OVERWRITE INTO hdfs_import_external\nSELECT *\nFROM adb_hdfs_import_source</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The number of rows scanned from a data source in the task.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The amount of scanned data. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>0.035</p>
             */
            public Builder scanSize(String scanSize) {
                this.scanSize = scanSize;
                return this;
            }

            /**
             * <p>The total amount of time consumed to scan data. It is an accumulated value collected from multiple TableScanNode nodes. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scanTime(Long scanTime) {
                this.scanTime = scanTime;
                return this;
            }

            /**
             * <p>The execution state of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESSED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The accumulated CPU Time value of all operators collected from all nodes. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>6100</p>
             */
            public Builder wallTime(Long wallTime) {
                this.wallTime = wallTime;
                return this;
            }

            public SlowLogRecord build() {
                return new SlowLogRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlowLogRecord")
        private java.util.List < SlowLogRecord> slowLogRecord;

        private Items(Builder builder) {
            this.slowLogRecord = builder.slowLogRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return slowLogRecord
         */
        public java.util.List < SlowLogRecord> getSlowLogRecord() {
            return this.slowLogRecord;
        }

        public static final class Builder {
            private java.util.List < SlowLogRecord> slowLogRecord; 

            /**
             * SlowLogRecord.
             */
            public Builder slowLogRecord(java.util.List < SlowLogRecord> slowLogRecord) {
                this.slowLogRecord = slowLogRecord;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
