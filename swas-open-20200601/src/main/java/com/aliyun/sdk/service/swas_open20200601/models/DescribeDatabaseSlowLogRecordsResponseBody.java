// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseSlowLogRecordsResponseBody</p>
 */
public class DescribeDatabaseSlowLogRecordsResponseBody extends TeaModel {
    @NameInMap("Engine")
    private String engine;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PhysicalIORead")
    private Long physicalIORead;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlowLogs")
    private java.util.List < SlowLogs> slowLogs;

    @NameInMap("TotalCount")
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
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PhysicalIORead.
         */
        public Builder physicalIORead(Long physicalIORead) {
            this.physicalIORead = physicalIORead;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlowLogs.
         */
        public Builder slowLogs(java.util.List < SlowLogs> slowLogs) {
            this.slowLogs = slowLogs;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("DBName")
        private String DBName;

        @NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @NameInMap("HostAddress")
        private String hostAddress;

        @NameInMap("LockTimes")
        private Long lockTimes;

        @NameInMap("ParseRowCounts")
        private Long parseRowCounts;

        @NameInMap("QueryTimeMS")
        private Long queryTimeMS;

        @NameInMap("QueryTimes")
        private Long queryTimes;

        @NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @NameInMap("SQLText")
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
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * ExecutionStartTime.
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * HostAddress.
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * LockTimes.
             */
            public Builder lockTimes(Long lockTimes) {
                this.lockTimes = lockTimes;
                return this;
            }

            /**
             * ParseRowCounts.
             */
            public Builder parseRowCounts(Long parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * QueryTimeMS.
             */
            public Builder queryTimeMS(Long queryTimeMS) {
                this.queryTimeMS = queryTimeMS;
                return this;
            }

            /**
             * QueryTimes.
             */
            public Builder queryTimes(Long queryTimes) {
                this.queryTimes = queryTimes;
                return this;
            }

            /**
             * ReturnRowCounts.
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * SQLText.
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
