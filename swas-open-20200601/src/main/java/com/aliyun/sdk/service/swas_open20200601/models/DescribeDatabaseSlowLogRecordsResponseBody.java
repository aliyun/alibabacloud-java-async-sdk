// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseSlowLogRecordsResponseBody</p>
 */
public class DescribeDatabaseSlowLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PhysicalIORead")
    private Long physicalIORead;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlowLogs")
    private java.util.List < SlowLogs> slowLogs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDatabaseSlowLogRecordsResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.physicalIORead = builder.physicalIORead;
        this.requestId = builder.requestId;
        this.slowLogs = builder.slowLogs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseSlowLogRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
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
     * @return physicalIORead
     */
    public Long getPhysicalIORead() {
        return this.physicalIORead;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slowLogs
     */
    public java.util.List < SlowLogs> getSlowLogs() {
        return this.slowLogs;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String engine; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long physicalIORead; 
        private String requestId; 
        private java.util.List < SlowLogs> slowLogs; 
        private Integer totalCount; 

        /**
         * The database engine that the instance runs.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 30 to 100.
         * <p>
         * 
         * Default value: 30.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of logical reads.
         */
        public Builder physicalIORead(Long physicalIORead) {
            this.physicalIORead = physicalIORead;
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
         * The slow query logs returned.
         */
        public Builder slowLogs(java.util.List < SlowLogs> slowLogs) {
            this.slowLogs = slowLogs;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatabaseSlowLogRecordsResponseBody build() {
            return new DescribeDatabaseSlowLogRecordsResponseBody(this);
        } 

    } 

    public static class SlowLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("LockTimes")
        private Long lockTimes;

        @com.aliyun.core.annotation.NameInMap("ParseRowCounts")
        private Long parseRowCounts;

        @com.aliyun.core.annotation.NameInMap("QueryTimeMS")
        private Long queryTimeMS;

        @com.aliyun.core.annotation.NameInMap("QueryTimes")
        private Long queryTimes;

        @com.aliyun.core.annotation.NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        private SlowLogs(Builder builder) {
            this.DBName = builder.DBName;
            this.executionStartTime = builder.executionStartTime;
            this.hostAddress = builder.hostAddress;
            this.lockTimes = builder.lockTimes;
            this.parseRowCounts = builder.parseRowCounts;
            this.queryTimeMS = builder.queryTimeMS;
            this.queryTimes = builder.queryTimes;
            this.returnRowCounts = builder.returnRowCounts;
            this.SQLText = builder.SQLText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlowLogs create() {
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
         * @return lockTimes
         */
        public Long getLockTimes() {
            return this.lockTimes;
        }

        /**
         * @return parseRowCounts
         */
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        /**
         * @return queryTimeMS
         */
        public Long getQueryTimeMS() {
            return this.queryTimeMS;
        }

        /**
         * @return queryTimes
         */
        public Long getQueryTimes() {
            return this.queryTimes;
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

        public static final class Builder {
            private String DBName; 
            private String executionStartTime; 
            private String hostAddress; 
            private Long lockTimes; 
            private Long parseRowCounts; 
            private Long queryTimeMS; 
            private Long queryTimes; 
            private Long returnRowCounts; 
            private String SQLText; 

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The time when the execution of the SQL statement started. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             * <p>
             * 
             * >  The time displayed in the Simple Application Server console is in the format of UTC+8.
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * The name and IP address of the client that is connected to the database.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * The lock duration of the SQL statement. Unit: seconds.
             */
            public Builder lockTimes(Long lockTimes) {
                this.lockTimes = lockTimes;
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
             * The execution duration of the slow query. Unit: millisecond.
             */
            public Builder queryTimeMS(Long queryTimeMS) {
                this.queryTimeMS = queryTimeMS;
                return this;
            }

            /**
             * The execution duration of the slow query. Unit: seconds.
             */
            public Builder queryTimes(Long queryTimes) {
                this.queryTimes = queryTimes;
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
             * The details of the SQL statement.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            public SlowLogs build() {
                return new SlowLogs(this);
            } 

        } 

    }
}
