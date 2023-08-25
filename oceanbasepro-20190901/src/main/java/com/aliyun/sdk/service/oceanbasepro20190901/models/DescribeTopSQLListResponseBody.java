// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTopSQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTopSQLListResponseBody</p>
 */
public class DescribeTopSQLListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TopSQLList")
    private java.util.List < TopSQLList> topSQLList;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeTopSQLListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.topSQLList = builder.topSQLList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTopSQLListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return topSQLList
     */
    public java.util.List < TopSQLList> getTopSQLList() {
        return this.topSQLList;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < TopSQLList> topSQLList; 
        private Long totalCount; 

        /**
         * Alibaba Cloud CLI
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The I/O wait time, in ms.
         */
        public Builder topSQLList(java.util.List < TopSQLList> topSQLList) {
            this.topSQLList = topSQLList;
            return this;
        }

        /**
         * It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTopSQLListResponseBody build() {
            return new DescribeTopSQLListResponseBody(this);
        } 

    } 

    public static class TopSQLList extends TeaModel {
        @NameInMap("AffectedRows")
        private Long affectedRows;

        @NameInMap("AppWaitTime")
        private Float appWaitTime;

        @NameInMap("BlockCacheHit")
        private Long blockCacheHit;

        @NameInMap("BlockIndexCacheHit")
        private Long blockIndexCacheHit;

        @NameInMap("BloomFilterCacheHit")
        private Long bloomFilterCacheHit;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("ConcurrencyWaitTime")
        private Float concurrencyWaitTime;

        @NameInMap("CpuTime")
        private Float cpuTime;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("DecodeTime")
        private Float decodeTime;

        @NameInMap("DiskRead")
        private Long diskRead;

        @NameInMap("ElapsedTime")
        private Float elapsedTime;

        @NameInMap("Event")
        private String event;

        @NameInMap("ExecPerSecond")
        private Float execPerSecond;

        @NameInMap("ExecuteTime")
        private Float executeTime;

        @NameInMap("Executions")
        private Long executions;

        @NameInMap("FailTimes")
        private Long failTimes;

        @NameInMap("GetPlanTime")
        private Float getPlanTime;

        @NameInMap("IOWaitTime")
        private Float IOWaitTime;

        @NameInMap("Key")
        private Long key;

        @NameInMap("LogicalRead")
        private Long logicalRead;

        @NameInMap("MaxCpuTime")
        private Float maxCpuTime;

        @NameInMap("MaxElapsedTime")
        private Float maxElapsedTime;

        @NameInMap("MemstoreReadRowCount")
        private Long memstoreReadRowCount;

        @NameInMap("MissPlans")
        private Long missPlans;

        @NameInMap("NetWaitTime")
        private Float netWaitTime;

        @NameInMap("NodeIp")
        private String nodeIp;

        @NameInMap("QueueTime")
        private Float queueTime;

        @NameInMap("RPCCount")
        private Long RPCCount;

        @NameInMap("RemotePlans")
        private Long remotePlans;

        @NameInMap("RetryCount")
        private Long retryCount;

        @NameInMap("ReturnRows")
        private Long returnRows;

        @NameInMap("RowCacheHit")
        private Long rowCacheHit;

        @NameInMap("SQLId")
        private String SQLId;

        @NameInMap("SQLText")
        private String SQLText;

        @NameInMap("SQLType")
        private Long SQLType;

        @NameInMap("ScheduleTime")
        private Float scheduleTime;

        @NameInMap("SsstoreReadRowCount")
        private Long ssstoreReadRowCount;

        @NameInMap("TotalWaitTime")
        private Float totalWaitTime;

        @NameInMap("UserName")
        private String userName;

        private TopSQLList(Builder builder) {
            this.affectedRows = builder.affectedRows;
            this.appWaitTime = builder.appWaitTime;
            this.blockCacheHit = builder.blockCacheHit;
            this.blockIndexCacheHit = builder.blockIndexCacheHit;
            this.bloomFilterCacheHit = builder.bloomFilterCacheHit;
            this.clientIp = builder.clientIp;
            this.concurrencyWaitTime = builder.concurrencyWaitTime;
            this.cpuTime = builder.cpuTime;
            this.dbName = builder.dbName;
            this.decodeTime = builder.decodeTime;
            this.diskRead = builder.diskRead;
            this.elapsedTime = builder.elapsedTime;
            this.event = builder.event;
            this.execPerSecond = builder.execPerSecond;
            this.executeTime = builder.executeTime;
            this.executions = builder.executions;
            this.failTimes = builder.failTimes;
            this.getPlanTime = builder.getPlanTime;
            this.IOWaitTime = builder.IOWaitTime;
            this.key = builder.key;
            this.logicalRead = builder.logicalRead;
            this.maxCpuTime = builder.maxCpuTime;
            this.maxElapsedTime = builder.maxElapsedTime;
            this.memstoreReadRowCount = builder.memstoreReadRowCount;
            this.missPlans = builder.missPlans;
            this.netWaitTime = builder.netWaitTime;
            this.nodeIp = builder.nodeIp;
            this.queueTime = builder.queueTime;
            this.RPCCount = builder.RPCCount;
            this.remotePlans = builder.remotePlans;
            this.retryCount = builder.retryCount;
            this.returnRows = builder.returnRows;
            this.rowCacheHit = builder.rowCacheHit;
            this.SQLId = builder.SQLId;
            this.SQLText = builder.SQLText;
            this.SQLType = builder.SQLType;
            this.scheduleTime = builder.scheduleTime;
            this.ssstoreReadRowCount = builder.ssstoreReadRowCount;
            this.totalWaitTime = builder.totalWaitTime;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopSQLList create() {
            return builder().build();
        }

        /**
         * @return affectedRows
         */
        public Long getAffectedRows() {
            return this.affectedRows;
        }

        /**
         * @return appWaitTime
         */
        public Float getAppWaitTime() {
            return this.appWaitTime;
        }

        /**
         * @return blockCacheHit
         */
        public Long getBlockCacheHit() {
            return this.blockCacheHit;
        }

        /**
         * @return blockIndexCacheHit
         */
        public Long getBlockIndexCacheHit() {
            return this.blockIndexCacheHit;
        }

        /**
         * @return bloomFilterCacheHit
         */
        public Long getBloomFilterCacheHit() {
            return this.bloomFilterCacheHit;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return concurrencyWaitTime
         */
        public Float getConcurrencyWaitTime() {
            return this.concurrencyWaitTime;
        }

        /**
         * @return cpuTime
         */
        public Float getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return decodeTime
         */
        public Float getDecodeTime() {
            return this.decodeTime;
        }

        /**
         * @return diskRead
         */
        public Long getDiskRead() {
            return this.diskRead;
        }

        /**
         * @return elapsedTime
         */
        public Float getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return execPerSecond
         */
        public Float getExecPerSecond() {
            return this.execPerSecond;
        }

        /**
         * @return executeTime
         */
        public Float getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return executions
         */
        public Long getExecutions() {
            return this.executions;
        }

        /**
         * @return failTimes
         */
        public Long getFailTimes() {
            return this.failTimes;
        }

        /**
         * @return getPlanTime
         */
        public Float getGetPlanTime() {
            return this.getPlanTime;
        }

        /**
         * @return IOWaitTime
         */
        public Float getIOWaitTime() {
            return this.IOWaitTime;
        }

        /**
         * @return key
         */
        public Long getKey() {
            return this.key;
        }

        /**
         * @return logicalRead
         */
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        /**
         * @return maxCpuTime
         */
        public Float getMaxCpuTime() {
            return this.maxCpuTime;
        }

        /**
         * @return maxElapsedTime
         */
        public Float getMaxElapsedTime() {
            return this.maxElapsedTime;
        }

        /**
         * @return memstoreReadRowCount
         */
        public Long getMemstoreReadRowCount() {
            return this.memstoreReadRowCount;
        }

        /**
         * @return missPlans
         */
        public Long getMissPlans() {
            return this.missPlans;
        }

        /**
         * @return netWaitTime
         */
        public Float getNetWaitTime() {
            return this.netWaitTime;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return queueTime
         */
        public Float getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return RPCCount
         */
        public Long getRPCCount() {
            return this.RPCCount;
        }

        /**
         * @return remotePlans
         */
        public Long getRemotePlans() {
            return this.remotePlans;
        }

        /**
         * @return retryCount
         */
        public Long getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return returnRows
         */
        public Long getReturnRows() {
            return this.returnRows;
        }

        /**
         * @return rowCacheHit
         */
        public Long getRowCacheHit() {
            return this.rowCacheHit;
        }

        /**
         * @return SQLId
         */
        public String getSQLId() {
            return this.SQLId;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        /**
         * @return SQLType
         */
        public Long getSQLType() {
            return this.SQLType;
        }

        /**
         * @return scheduleTime
         */
        public Float getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return ssstoreReadRowCount
         */
        public Long getSsstoreReadRowCount() {
            return this.ssstoreReadRowCount;
        }

        /**
         * @return totalWaitTime
         */
        public Float getTotalWaitTime() {
            return this.totalWaitTime;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long affectedRows; 
            private Float appWaitTime; 
            private Long blockCacheHit; 
            private Long blockIndexCacheHit; 
            private Long bloomFilterCacheHit; 
            private String clientIp; 
            private Float concurrencyWaitTime; 
            private Float cpuTime; 
            private String dbName; 
            private Float decodeTime; 
            private Long diskRead; 
            private Float elapsedTime; 
            private String event; 
            private Float execPerSecond; 
            private Float executeTime; 
            private Long executions; 
            private Long failTimes; 
            private Float getPlanTime; 
            private Float IOWaitTime; 
            private Long key; 
            private Long logicalRead; 
            private Float maxCpuTime; 
            private Float maxElapsedTime; 
            private Long memstoreReadRowCount; 
            private Long missPlans; 
            private Float netWaitTime; 
            private String nodeIp; 
            private Float queueTime; 
            private Long RPCCount; 
            private Long remotePlans; 
            private Long retryCount; 
            private Long returnRows; 
            private Long rowCacheHit; 
            private String SQLId; 
            private String SQLText; 
            private Long SQLType; 
            private Float scheduleTime; 
            private Long ssstoreReadRowCount; 
            private Float totalWaitTime; 
            private String userName; 

            /**
             * The internal wait time, in ms.
             */
            public Builder affectedRows(Long affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * The wait time in concurrent execution, in ms.
             */
            public Builder appWaitTime(Float appWaitTime) {
                this.appWaitTime = appWaitTime;
                return this;
            }

            /**
             * The average CPU time, in ms.
             */
            public Builder blockCacheHit(Long blockCacheHit) {
                this.blockCacheHit = blockCacheHit;
                return this;
            }

            /**
             * $.parameters[16].schema.example
             */
            public Builder blockIndexCacheHit(Long blockIndexCacheHit) {
                this.blockIndexCacheHit = blockIndexCacheHit;
                return this;
            }

            /**
             * $.parameters[14].schema.enumValueTitles
             */
            public Builder bloomFilterCacheHit(Long bloomFilterCacheHit) {
                this.bloomFilterCacheHit = bloomFilterCacheHit;
                return this;
            }

            /**
             * $.parameters[14].schema.description
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The number of rows returned.
             */
            public Builder concurrencyWaitTime(Float concurrencyWaitTime) {
                this.concurrencyWaitTime = concurrencyWaitTime;
                return this;
            }

            /**
             * The maximum CPU time, in ms.
             */
            public Builder cpuTime(Float cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * The number of remote plans.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The number of rows to return on each page.   
             * <p>
             * - Maximum value: 100   
             * - Default value: 10
             */
            public Builder decodeTime(Float decodeTime) {
                this.decodeTime = decodeTime;
                return this;
            }

            /**
             * The IP address of the client.
             */
            public Builder diskRead(Long diskRead) {
                this.diskRead = diskRead;
                return this;
            }

            /**
             * The sorting rule.
             */
            public Builder elapsedTime(Float elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * The number of rows read from the disk.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * The operation that you want to perform.   
             * <p>
             * Set the value to **DescribeTopSQLList**.
             */
            public Builder execPerSecond(Float execPerSecond) {
                this.execPerSecond = execPerSecond;
                return this;
            }

            /**
             * The number of rows read from the memory.
             */
            public Builder executeTime(Float executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The number of executions per second.
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * $.parameters[12].schema.description
             */
            public Builder failTimes(Long failTimes) {
                this.failTimes = failTimes;
                return this;
            }

            /**
             * The queuing time, in ms.
             */
            public Builder getPlanTime(Float getPlanTime) {
                this.getPlanTime = getPlanTime;
                return this;
            }

            /**
             * $.parameters[15].schema.example
             */
            public Builder IOWaitTime(Float IOWaitTime) {
                this.IOWaitTime = IOWaitTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder key(Long key) {
                this.key = key;
                return this;
            }

            /**
             * You can call this operation to query SQL execution performance data collected by the diagnostic system.
             */
            public Builder logicalRead(Long logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * SQLID.
             */
            public Builder maxCpuTime(Float maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * The sequence number of the returned SQL statement.
             */
            public Builder maxElapsedTime(Float maxElapsedTime) {
                this.maxElapsedTime = maxElapsedTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder memstoreReadRowCount(Long memstoreReadRowCount) {
                this.memstoreReadRowCount = memstoreReadRowCount;
                return this;
            }

            /**
             * The total count.
             */
            public Builder missPlans(Long missPlans) {
                this.missPlans = missPlans;
                return this;
            }

            /**
             * The end time of the time range for querying TOP SQL statements.   
             * <p>
             * The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.
             */
            public Builder netWaitTime(Float netWaitTime) {
                this.netWaitTime = netWaitTime;
                return this;
            }

            /**
             * The username.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * $.parameters[12].schema.enumValueTitles
             */
            public Builder queueTime(Float queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * The start time of the time range for querying TOP SQL statements.   
             * <p>
             * The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.
             */
            public Builder RPCCount(Long RPCCount) {
                this.RPCCount = RPCCount;
                return this;
            }

            /**
             * The return result of the request.
             */
            public Builder remotePlans(Long remotePlans) {
                this.remotePlans = remotePlans;
                return this;
            }

            /**
             * $.parameters[13].schema.description
             */
            public Builder retryCount(Long retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * The wait event.
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * ```
             * <p>
             * http(s)://[Endpoint]/?Action=DescribeTopSQLList
             * &TenantId=t2mr3oae0****
             * &StartTime=2021-06-13 15:40:43
             * &EndTime=2021-09-13 15:40:43
             * &DbName=testdb
             * &SearchKeyWord=update
             * &SearchParameter=cputime
             * &SearchRule=>
             * &SearchValue=0.01
             * &SQLId=8D6E84****0B8FB1823D199E2CA1****
             * &NodeIp=i-bp19y05uq6xpacyqnlrc
             * &PageNumber=1
             * &PageSize=10
             * &SortColumn=cputime
             * &SortOrder=desc
             * &Common request parameters
             * ```
             */
            public Builder rowCacheHit(Long rowCacheHit) {
                this.rowCacheHit = rowCacheHit;
                return this;
            }

            /**
             * $.parameters[13].schema.example
             */
            public Builder SQLId(String SQLId) {
                this.SQLId = SQLId;
                return this;
            }

            /**
             * The list of top SQL statements.
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder SQLType(Long SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * The search keyword.
             */
            public Builder scheduleTime(Float scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * SsstoreReadRowCount.
             */
            public Builder ssstoreReadRowCount(Long ssstoreReadRowCount) {
                this.ssstoreReadRowCount = ssstoreReadRowCount;
                return this;
            }

            /**
             * -
             */
            public Builder totalWaitTime(Float totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
                return this;
            }

            /**
             * The number of Bloom filter cache hits.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public TopSQLList build() {
                return new TopSQLList(this);
            } 

        } 

    }
}
