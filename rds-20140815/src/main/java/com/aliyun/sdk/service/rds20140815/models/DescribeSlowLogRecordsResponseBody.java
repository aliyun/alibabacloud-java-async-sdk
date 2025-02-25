// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogRecordsResponseBody</p>
 */
public class DescribeSlowLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>An array that consists of the information about each slow log.</p>
         */
        public Builder items(Items items) {
            this.items = items;
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
         * <p>The number of SQL log reports on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4DBB1BB0-E5D8-4D41-B1C9-142364DB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
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
    public static class SQLSlowRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ClientHostName")
        private String clientHostName;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Long cpuTime;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExecutionStartTime")
        private String executionStartTime;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("LastRowsAffectedCount")
        private Long lastRowsAffectedCount;

        @com.aliyun.core.annotation.NameInMap("LockTimes")
        private Long lockTimes;

        @com.aliyun.core.annotation.NameInMap("LogicalIORead")
        private Long logicalIORead;

        @com.aliyun.core.annotation.NameInMap("ParseRowCounts")
        private Long parseRowCounts;

        @com.aliyun.core.annotation.NameInMap("PhysicalIORead")
        private Long physicalIORead;

        @com.aliyun.core.annotation.NameInMap("QueryTimeMS")
        private Long queryTimeMS;

        @com.aliyun.core.annotation.NameInMap("QueryTimes")
        private Long queryTimes;

        @com.aliyun.core.annotation.NameInMap("ReturnRowCounts")
        private Long returnRowCounts;

        @com.aliyun.core.annotation.NameInMap("RowsAffectedCount")
        private Long rowsAffectedCount;

        @com.aliyun.core.annotation.NameInMap("SQLHash")
        private String SQLHash;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("WriteIOCount")
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
             * <p>The name of the application that is connected to the instance.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The hostname of the client.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder clientHostName(String clientHostName) {
                this.clientHostName = clientHostName;
                return this;
            }

            /**
             * <p>The duration during which the SQL statement is processed by the CPU. Unit: milliseconds.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.002</p>
             */
            public Builder cpuTime(Long cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

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
             * <p>The time when the execution of the SQL statement started. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-18T01:40:44Z</p>
             */
            public Builder executionStartTime(String executionStartTime) {
                this.executionStartTime = executionStartTime;
                return this;
            }

            /**
             * <p>The name and IP address of the client that is connected to the database.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx[xxx] @  [1xx.xxx.xxx.xx]</p>
             */
            public Builder hostAddress(String hostAddress) {
                this.hostAddress = hostAddress;
                return this;
            }

            /**
             * <p>The number of rows that are affected by the last SQL statement.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder lastRowsAffectedCount(Long lastRowsAffectedCount) {
                this.lastRowsAffectedCount = lastRowsAffectedCount;
                return this;
            }

            /**
             * <p>The lock duration of the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lockTimes(Long lockTimes) {
                this.lockTimes = lockTimes;
                return this;
            }

            /**
             * <p>The number of logical reads.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>383</p>
             */
            public Builder logicalIORead(Long logicalIORead) {
                this.logicalIORead = logicalIORead;
                return this;
            }

            /**
             * <p>The number of parsed rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parseRowCounts(Long parseRowCounts) {
                this.parseRowCounts = parseRowCounts;
                return this;
            }

            /**
             * <p>The number of physical reads.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder physicalIORead(Long physicalIORead) {
                this.physicalIORead = physicalIORead;
                return this;
            }

            /**
             * <p>The execution duration of the query. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2001</p>
             */
            public Builder queryTimeMS(Long queryTimeMS) {
                this.queryTimeMS = queryTimeMS;
                return this;
            }

            /**
             * <p>The execution duration of the query. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder queryTimes(Long queryTimes) {
                this.queryTimes = queryTimes;
                return this;
            }

            /**
             * <p>The number of rows returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnRowCounts(Long returnRowCounts) {
                this.returnRowCounts = returnRowCounts;
                return this;
            }

            /**
             * <p>The number of affected rows.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder rowsAffectedCount(Long rowsAffectedCount) {
                this.rowsAffectedCount = rowsAffectedCount;
                return this;
            }

            /**
             * <p>The unique ID of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>U2FsdGVk****</p>
             */
            public Builder SQLHash(String SQLHash) {
                this.SQLHash = SQLHash;
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

            /**
             * <p>The name of the user.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * <p>The number of I/O writes.</p>
             * <blockquote>
             * <p>This parameter is returned only for instances that run SQL Server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>22</p>
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
    /**
     * 
     * {@link DescribeSlowLogRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlowLogRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLSlowRecord")
        private java.util.List<SQLSlowRecord> SQLSlowRecord;

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
        public java.util.List<SQLSlowRecord> getSQLSlowRecord() {
            return this.SQLSlowRecord;
        }

        public static final class Builder {
            private java.util.List<SQLSlowRecord> SQLSlowRecord; 

            /**
             * SQLSlowRecord.
             */
            public Builder SQLSlowRecord(java.util.List<SQLSlowRecord> SQLSlowRecord) {
                this.SQLSlowRecord = SQLSlowRecord;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
