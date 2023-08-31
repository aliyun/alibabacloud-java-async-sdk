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
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeSlowLogRecordsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.engine = builder.engine;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogRecordsResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String engine; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The ID of the instance.
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
         * An array that consists of the information about each slow log.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
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

        @NameInMap("SQLHash")
        private String SQLHash;

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
            this.SQLHash = builder.SQLHash;
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
         * @return SQLHash
         */
        public String getSQLHash() {
            return this.SQLHash;
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
            private String SQLHash; 
            private String SQLText; 
            private String userName; 
            private Long writeIOCount; 

            /**
             * The name of the application that is connected to the instance.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * The hostname of the client.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
             */
            public Builder clientHostName(String clientHostName) {
                this.clientHostName = clientHostName;
                return this;
            }

            /**
             * The duration during which the SQL statement is processed by the CPU. Unit: milliseconds.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
             */
            public Builder cpuTime(Long cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The time when the execution of the SQL statement started. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
             * The number of rows that are affected by the last SQL statement.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
             */
            public Builder lastRowsAffectedCount(Long lastRowsAffectedCount) {
                this.lastRowsAffectedCount = lastRowsAffectedCount;
                return this;
            }

            /**
             * The lock duration of the query. Unit: seconds.
             */
            public Builder lockTimes(Long lockTimes) {
                this.lockTimes = lockTimes;
                return this;
            }

            /**
             * The number of logical reads.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
             */
            public Builder logicalIORead(Long logicalIORead) {
                this.logicalIORead = logicalIORead;
                return this;
            }

            /**
             * The number of parsed rows.
             */
            public Builder parseRowCounts(Long parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * The number of physical reads.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
             */
            public Builder physicalIORead(Long physicalIORead) {
                this.physicalIORead = physicalIORead;
                return this;
            }

            /**
             * The execution duration of the query. Unit: milliseconds.
             */
            public Builder queryTimeMS(Long queryTimeMS) {
                this.queryTimeMS = queryTimeMS;
                return this;
            }

            /**
             * The execution duration of the query. Unit: seconds.
             */
            public Builder queryTimes(Long queryTimes) {
                this.queryTimes = queryTimes;
                return this;
            }

            /**
             * The number of rows returned.
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * The number of affected rows.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
             */
            public Builder rowsAffectedCount(Long rowsAffectedCount) {
                this.rowsAffectedCount = rowsAffectedCount;
                return this;
            }

            /**
             * The unique ID of the SQL statement.
             */
            public Builder SQLHash(String SQLHash) {
                this.SQLHash = SQLHash;
                return this;
            }

            /**
             * The details of the SQL statement.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The name of the user.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * The number of I/O writes.
             * <p>
             * 
             * > This parameter is returned only for instances that run SQL Server.
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
