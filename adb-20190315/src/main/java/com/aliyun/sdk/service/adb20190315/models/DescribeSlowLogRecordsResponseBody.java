// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
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
         * The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Details of the slow query logs.
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
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    public static class SlowLogRecord extends TeaModel {
        @NameInMap("DBName")
        private String DBName;

        @NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @NameInMap("HostAddress")
        private String hostAddress;

        @NameInMap("OutputSize")
        private String outputSize;

        @NameInMap("ParseRowCounts")
        private Long parseRowCounts;

        @NameInMap("PeakMemoryUsage")
        private String peakMemoryUsage;

        @NameInMap("PlanningTime")
        private Long planningTime;

        @NameInMap("ProcessID")
        private String processID;

        @NameInMap("QueryTime")
        private Long queryTime;

        @NameInMap("QueueTime")
        private Long queueTime;

        @NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("ScanRows")
        private Long scanRows;

        @NameInMap("ScanSize")
        private String scanSize;

        @NameInMap("ScanTime")
        private Long scanTime;

        @NameInMap("State")
        private String state;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("WallTime")
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
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The time when the execution started. The time follows the ISO 8601 standard in the *yyyy-MM-ddTHH:mm:ssZ* format. The time is displayed in UTC.
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * The IP address of the client that is used to connect to the database.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * The amount of output data in the task. Unit: bytes.
             */
            public Builder outputSize(String outputSize) {
                this.outputSize = outputSize;
                return this;
            }

            /**
             * The number of rows parsed by the SQL statement.
             */
            public Builder parseRowCounts(Long parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * The maximum memory usage when the SQL statement is executed. Unit: KB.
             */
            public Builder peakMemoryUsage(String peakMemoryUsage) {
                this.peakMemoryUsage = peakMemoryUsage;
                return this;
            }

            /**
             * The amount of time consumed to generate execution plans. Unit: milliseconds.
             */
            public Builder planningTime(Long planningTime) {
                this.planningTime = planningTime;
                return this;
            }

            /**
             * The ID of the process.
             */
            public Builder processID(String processID) {
                this.processID = processID;
                return this;
            }

            /**
             * The time consumed to execute the SQL statement. Unit: milliseconds.
             */
            public Builder queryTime(Long queryTime) {
                this.queryTime = queryTime;
                return this;
            }

            /**
             * The queuing duration before the query is executed. Unit: milliseconds.
             */
            public Builder queueTime(Long queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * The number of rows returned by the SQL statement.
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * Details of the SQL statement.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The number of rows scanned from a data source in the task.
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * The amount of scanned data. Unit: KB.
             */
            public Builder scanSize(String scanSize) {
                this.scanSize = scanSize;
                return this;
            }

            /**
             * The total amount of time consumed to scan data. It is an accumulated value collected from multiple TableScanNode nodes. Unit: milliseconds.
             */
            public Builder scanTime(Long scanTime) {
                this.scanTime = scanTime;
                return this;
            }

            /**
             * The execution state of the SQL statement.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The username.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The accumulated CPU Time value of all operators collected from all nodes. Unit: milliseconds.
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
    public static class Items extends TeaModel {
        @NameInMap("SlowLogRecord")
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
