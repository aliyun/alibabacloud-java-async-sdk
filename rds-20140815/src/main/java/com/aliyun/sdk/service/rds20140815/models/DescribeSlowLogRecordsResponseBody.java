// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @NameInMap("CPUTime")
    private Long CPUTime;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("Items")
    private Items items;

    @NameInMap("LastRowsAffectedCount")
    private Long lastRowsAffectedCount;

    @NameInMap("LogicalIORead")
    private Long logicalIORead;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("PhysicalIORead")
    private Long physicalIORead;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RowsAffectedCount")
    private Long rowsAffectedCount;

    @NameInMap("SQLHash")
    private String SQLHash;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    @NameInMap("UserName")
    private String userName;

    @NameInMap("WritesIOCount")
    private Long writesIOCount;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
        this.CPUTime = builder.CPUTime;
        this.DBInstanceId = builder.DBInstanceId;
        this.engine = builder.engine;
        this.items = builder.items;
        this.lastRowsAffectedCount = builder.lastRowsAffectedCount;
        this.logicalIORead = builder.logicalIORead;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.physicalIORead = builder.physicalIORead;
        this.requestId = builder.requestId;
        this.rowsAffectedCount = builder.rowsAffectedCount;
        this.SQLHash = builder.SQLHash;
        this.totalRecordCount = builder.totalRecordCount;
        this.userName = builder.userName;
        this.writesIOCount = builder.writesIOCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return CPUTime
     */
    public Long getCPUTime() {
        return this.CPUTime;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return lastRowsAffectedCount
     */
    public Long getLastRowsAffectedCount() {
        return this.lastRowsAffectedCount;
    }

    /**
     * @return logicalIORead
     */
    public Long getLogicalIORead() {
        return this.logicalIORead;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
     * @return rowsAffectedCount
     */
    public Long getRowsAffectedCount() {
        return this.rowsAffectedCount;
    }

    /**
     * @return SQLHash
     */
    public String getSQLHash() {
        return this.SQLHash;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return writesIOCount
     */
    public Long getWritesIOCount() {
        return this.writesIOCount;
    }

    public static final class Builder {
        private Long CPUTime; 
        private String DBInstanceId; 
        private String engine; 
        private Items items; 
        private Long lastRowsAffectedCount; 
        private Long logicalIORead; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private Long physicalIORead; 
        private String requestId; 
        private Long rowsAffectedCount; 
        private String SQLHash; 
        private Integer totalRecordCount; 
        private String userName; 
        private Long writesIOCount; 

        /**
         * CPUTime.
         */
        public Builder CPUTime(Long CPUTime) {
            this.CPUTime = CPUTime;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * LastRowsAffectedCount.
         */
        public Builder lastRowsAffectedCount(Long lastRowsAffectedCount) {
            this.lastRowsAffectedCount = lastRowsAffectedCount;
            return this;
        }

        /**
         * LogicalIORead.
         */
        public Builder logicalIORead(Long logicalIORead) {
            this.logicalIORead = logicalIORead;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RowsAffectedCount.
         */
        public Builder rowsAffectedCount(Long rowsAffectedCount) {
            this.rowsAffectedCount = rowsAffectedCount;
            return this;
        }

        /**
         * SQLHash.
         */
        public Builder SQLHash(String SQLHash) {
            this.SQLHash = SQLHash;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * WritesIOCount.
         */
        public Builder writesIOCount(Long writesIOCount) {
            this.writesIOCount = writesIOCount;
            return this;
        }

        public DescribeSlowLogRecordsResponseBody build() {
            return new DescribeSlowLogRecordsResponseBody(this);
        } 

    } 

    public static class SQLSlowRecord extends TeaModel {
        @NameInMap("ApplicationName")
        private String applicationName;

        @NameInMap("ClientHostName")
        private String clientHostName;

        @NameInMap("CpuTime")
        private Long cpuTime;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @NameInMap("HostAddress")
        private String hostAddress;

        @NameInMap("LastRowsAffectedCount")
        private Long lastRowsAffectedCount;

        @NameInMap("LockTimes")
        private Long lockTimes;

        @NameInMap("LogicalIORead")
        private Long logicalIORead;

        @NameInMap("ParseRowCounts")
        private Long parseRowCounts;

        @NameInMap("PhysicalIORead")
        private Long physicalIORead;

        @NameInMap("QueryTimeMS")
        private Long queryTimeMS;

        @NameInMap("QueryTimes")
        private Long queryTimes;

        @NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @NameInMap("RowsAffectedCount")
        private Long rowsAffectedCount;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("WriteIOCount")
        private Long writeIOCount;

        private SQLSlowRecord(Builder builder) {
            this.applicationName = builder.applicationName;
            this.clientHostName = builder.clientHostName;
            this.cpuTime = builder.cpuTime;
            this.DBName = builder.DBName;
            this.executionStartTime = builder.executionStartTime;
            this.hostAddress = builder.hostAddress;
            this.lastRowsAffectedCount = builder.lastRowsAffectedCount;
            this.lockTimes = builder.lockTimes;
            this.logicalIORead = builder.logicalIORead;
            this.parseRowCounts = builder.parseRowCounts;
            this.physicalIORead = builder.physicalIORead;
            this.queryTimeMS = builder.queryTimeMS;
            this.queryTimes = builder.queryTimes;
            this.returnRowCounts = builder.returnRowCounts;
            this.rowsAffectedCount = builder.rowsAffectedCount;
            this.SQLText = builder.SQLText;
            this.userName = builder.userName;
            this.writeIOCount = builder.writeIOCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLSlowRecord create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return clientHostName
         */
        public String getClientHostName() {
            return this.clientHostName;
        }

        /**
         * @return cpuTime
         */
        public Long getCpuTime() {
            return this.cpuTime;
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
         * @return lastRowsAffectedCount
         */
        public Long getLastRowsAffectedCount() {
            return this.lastRowsAffectedCount;
        }

        /**
         * @return lockTimes
         */
        public Long getLockTimes() {
            return this.lockTimes;
        }

        /**
         * @return logicalIORead
         */
        public Long getLogicalIORead() {
            return this.logicalIORead;
        }

        /**
         * @return parseRowCounts
         */
        public Long getParseRowCounts() {
            return this.parseRowCounts;
        }

        /**
         * @return physicalIORead
         */
        public Long getPhysicalIORead() {
            return this.physicalIORead;
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
         * @return rowsAffectedCount
         */
        public Long getRowsAffectedCount() {
            return this.rowsAffectedCount;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return writeIOCount
         */
        public Long getWriteIOCount() {
            return this.writeIOCount;
        }

        public static final class Builder {
            private String applicationName; 
            private String clientHostName; 
            private Long cpuTime; 
            private String DBName; 
            private String executionStartTime; 
            private String hostAddress; 
            private Long lastRowsAffectedCount; 
            private Long lockTimes; 
            private Long logicalIORead; 
            private Long parseRowCounts; 
            private Long physicalIORead; 
            private Long queryTimeMS; 
            private Long queryTimes; 
            private Long returnRowCounts; 
            private Long rowsAffectedCount; 
            private String SQLText; 
            private String userName; 
            private Long writeIOCount; 

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * ClientHostName.
             */
            public Builder clientHostName(String clientHostName) {
                this.clientHostName = clientHostName;
                return this;
            }

            /**
             * CpuTime.
             */
            public Builder cpuTime(Long cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

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
             * LastRowsAffectedCount.
             */
            public Builder lastRowsAffectedCount(Long lastRowsAffectedCount) {
                this.lastRowsAffectedCount = lastRowsAffectedCount;
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
             * LogicalIORead.
             */
            public Builder logicalIORead(Long logicalIORead) {
                this.logicalIORead = logicalIORead;
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
             * PhysicalIORead.
             */
            public Builder physicalIORead(Long physicalIORead) {
                this.physicalIORead = physicalIORead;
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
             * RowsAffectedCount.
             */
            public Builder rowsAffectedCount(Long rowsAffectedCount) {
                this.rowsAffectedCount = rowsAffectedCount;
                return this;
            }

            /**
             * SQLText.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * WriteIOCount.
             */
            public Builder writeIOCount(Long writeIOCount) {
                this.writeIOCount = writeIOCount;
                return this;
            }

            public SQLSlowRecord build() {
                return new SQLSlowRecord(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("SQLSlowRecord")
        private java.util.List < SQLSlowRecord> SQLSlowRecord;

        private Items(Builder builder) {
            this.SQLSlowRecord = builder.SQLSlowRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return SQLSlowRecord
         */
        public java.util.List < SQLSlowRecord> getSQLSlowRecord() {
            return this.SQLSlowRecord;
        }

        public static final class Builder {
            private java.util.List < SQLSlowRecord> SQLSlowRecord; 

            /**
             * SQLSlowRecord.
             */
            public Builder SQLSlowRecord(java.util.List < SQLSlowRecord> SQLSlowRecord) {
                this.SQLSlowRecord = SQLSlowRecord;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
