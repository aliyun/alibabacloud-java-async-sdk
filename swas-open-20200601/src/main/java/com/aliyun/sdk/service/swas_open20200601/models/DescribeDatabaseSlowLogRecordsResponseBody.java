// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The database engine that the instance runs.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Pages start from page 1.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 30 to 100.</p>
         * <p>Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The number of logical reads.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder physicalIORead(Long physicalIORead) {
            this.physicalIORead = physicalIORead;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The slow query logs returned.</p>
         */
        public Builder slowLogs(java.util.List < SlowLogs> slowLogs) {
            this.slowLogs = slowLogs;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatabaseSlowLogRecordsResponseBody build() {
            return new DescribeDatabaseSlowLogRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatabaseSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabaseSlowLogRecordsResponseBody</p>
     */
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
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testDB</p>
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * <p>The time when the execution of the SQL statement started. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * <blockquote>
             * <p> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-09-08T01:40:44Z</p>
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * <p>The name and IP address of the client that is connected to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx[xxx] @ [1xx.xxx.xxx.xx]</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The lock duration of the SQL statement. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lockTimes(Long lockTimes) {
                this.lockTimes = lockTimes;
                return this;
            }

            /**
             * <p>The number of rows parsed by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parseRowCounts(Long parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * <p>The execution duration of the slow query. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder queryTimeMS(Long queryTimeMS) {
                this.queryTimeMS = queryTimeMS;
                return this;
            }

            /**
             * <p>The execution duration of the slow query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder queryTimes(Long queryTimes) {
                this.queryTimes = queryTimes;
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
             * <p>The details of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>select sleep(2)</p>
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
