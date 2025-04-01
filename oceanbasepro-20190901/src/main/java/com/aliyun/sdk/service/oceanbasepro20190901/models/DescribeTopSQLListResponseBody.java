// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTopSQLListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTopSQLListResponseBody</p>
 */
public class DescribeTopSQLListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TopSQLList")
    private java.util.List<TopSQLList> topSQLList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TopSQLList> getTopSQLList() {
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
        private java.util.List<TopSQLList> topSQLList; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTopSQLListResponseBody model) {
            this.requestId = model.requestId;
            this.topSQLList = model.topSQLList;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Alibaba Cloud CLI</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The I/O wait time, in ms.</p>
         */
        public Builder topSQLList(java.util.List<TopSQLList> topSQLList) {
            this.topSQLList = topSQLList;
            return this;
        }

        /**
         * <p>It is an online CLI tool that allows you to quickly retrieve and debug APIs. It can dynamically generate executable SDK code samples.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTopSQLListResponseBody build() {
            return new DescribeTopSQLListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTopSQLListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTopSQLListResponseBody</p>
     */
    public static class TopSQLList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedRows")
        private Long affectedRows;

        @com.aliyun.core.annotation.NameInMap("AppWaitTime")
        private Float appWaitTime;

        @com.aliyun.core.annotation.NameInMap("BlockCacheHit")
        private Long blockCacheHit;

        @com.aliyun.core.annotation.NameInMap("BlockIndexCacheHit")
        private Long blockIndexCacheHit;

        @com.aliyun.core.annotation.NameInMap("BloomFilterCacheHit")
        private Long bloomFilterCacheHit;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ConcurrencyWaitTime")
        private Float concurrencyWaitTime;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Float cpuTime;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("DecodeTime")
        private Float decodeTime;

        @com.aliyun.core.annotation.NameInMap("DiskRead")
        private Long diskRead;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Float elapsedTime;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("ExecPerSecond")
        private Float execPerSecond;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Float executeTime;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private Long executions;

        @com.aliyun.core.annotation.NameInMap("FailTimes")
        private Long failTimes;

        @com.aliyun.core.annotation.NameInMap("GetPlanTime")
        private Float getPlanTime;

        @com.aliyun.core.annotation.NameInMap("IOWaitTime")
        private Float IOWaitTime;

        @com.aliyun.core.annotation.NameInMap("Key")
        private Long key;

        @com.aliyun.core.annotation.NameInMap("LogicalRead")
        private Long logicalRead;

        @com.aliyun.core.annotation.NameInMap("MaxCpuTime")
        private Float maxCpuTime;

        @com.aliyun.core.annotation.NameInMap("MaxElapsedTime")
        private Float maxElapsedTime;

        @com.aliyun.core.annotation.NameInMap("MemstoreReadRowCount")
        private Long memstoreReadRowCount;

        @com.aliyun.core.annotation.NameInMap("MissPlans")
        private Long missPlans;

        @com.aliyun.core.annotation.NameInMap("NetWaitTime")
        private Float netWaitTime;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Float queueTime;

        @com.aliyun.core.annotation.NameInMap("RPCCount")
        private Long RPCCount;

        @com.aliyun.core.annotation.NameInMap("RemotePlans")
        private Long remotePlans;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Long retryCount;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Long returnRows;

        @com.aliyun.core.annotation.NameInMap("RowCacheHit")
        private Long rowCacheHit;

        @com.aliyun.core.annotation.NameInMap("SQLId")
        private String SQLId;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        @com.aliyun.core.annotation.NameInMap("SQLType")
        private Long SQLType;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private Float scheduleTime;

        @com.aliyun.core.annotation.NameInMap("SsstoreReadRowCount")
        private Long ssstoreReadRowCount;

        @com.aliyun.core.annotation.NameInMap("TotalWaitTime")
        private Float totalWaitTime;

        @com.aliyun.core.annotation.NameInMap("UserName")
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

            private Builder() {
            } 

            private Builder(TopSQLList model) {
                this.affectedRows = model.affectedRows;
                this.appWaitTime = model.appWaitTime;
                this.blockCacheHit = model.blockCacheHit;
                this.blockIndexCacheHit = model.blockIndexCacheHit;
                this.bloomFilterCacheHit = model.bloomFilterCacheHit;
                this.clientIp = model.clientIp;
                this.concurrencyWaitTime = model.concurrencyWaitTime;
                this.cpuTime = model.cpuTime;
                this.dbName = model.dbName;
                this.decodeTime = model.decodeTime;
                this.diskRead = model.diskRead;
                this.elapsedTime = model.elapsedTime;
                this.event = model.event;
                this.execPerSecond = model.execPerSecond;
                this.executeTime = model.executeTime;
                this.executions = model.executions;
                this.failTimes = model.failTimes;
                this.getPlanTime = model.getPlanTime;
                this.IOWaitTime = model.IOWaitTime;
                this.key = model.key;
                this.logicalRead = model.logicalRead;
                this.maxCpuTime = model.maxCpuTime;
                this.maxElapsedTime = model.maxElapsedTime;
                this.memstoreReadRowCount = model.memstoreReadRowCount;
                this.missPlans = model.missPlans;
                this.netWaitTime = model.netWaitTime;
                this.nodeIp = model.nodeIp;
                this.queueTime = model.queueTime;
                this.RPCCount = model.RPCCount;
                this.remotePlans = model.remotePlans;
                this.retryCount = model.retryCount;
                this.returnRows = model.returnRows;
                this.rowCacheHit = model.rowCacheHit;
                this.SQLId = model.SQLId;
                this.SQLText = model.SQLText;
                this.SQLType = model.SQLType;
                this.scheduleTime = model.scheduleTime;
                this.ssstoreReadRowCount = model.ssstoreReadRowCount;
                this.totalWaitTime = model.totalWaitTime;
                this.userName = model.userName;
            } 

            /**
             * <p>The internal wait time, in ms.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder affectedRows(Long affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * <p>The wait time in concurrent execution, in ms.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder appWaitTime(Float appWaitTime) {
                this.appWaitTime = appWaitTime;
                return this;
            }

            /**
             * <p>The average CPU time, in ms.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder blockCacheHit(Long blockCacheHit) {
                this.blockCacheHit = blockCacheHit;
                return this;
            }

            /**
             * <p>$.parameters[16].schema.example</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder blockIndexCacheHit(Long blockIndexCacheHit) {
                this.blockIndexCacheHit = blockIndexCacheHit;
                return this;
            }

            /**
             * <p>$.parameters[14].schema.enumValueTitles</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bloomFilterCacheHit(Long bloomFilterCacheHit) {
                this.bloomFilterCacheHit = bloomFilterCacheHit;
                return this;
            }

            /**
             * <p>$.parameters[14].schema.description</p>
             * 
             * <strong>example:</strong>
             * <p>1<em>2.</em><strong>.1<em>3.</em></strong></p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The number of rows returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder concurrencyWaitTime(Float concurrencyWaitTime) {
                this.concurrencyWaitTime = concurrencyWaitTime;
                return this;
            }

            /**
             * <p>The maximum CPU time, in ms.</p>
             * 
             * <strong>example:</strong>
             * <p>50.13</p>
             */
            public Builder cpuTime(Float cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * <p>The number of remote plans.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The number of rows to return on each page.   </p>
             * <ul>
             * <li>Maximum value: 100   </li>
             * <li>Default value: 10</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder decodeTime(Float decodeTime) {
                this.decodeTime = decodeTime;
                return this;
            }

            /**
             * <p>The IP address of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder diskRead(Long diskRead) {
                this.diskRead = diskRead;
                return this;
            }

            /**
             * <p>The sorting rule.</p>
             * 
             * <strong>example:</strong>
             * <p>76.382</p>
             */
            public Builder elapsedTime(Float elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The number of rows read from the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql response wait client</p>
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeTopSQLList</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>163.0</p>
             */
            public Builder execPerSecond(Float execPerSecond) {
                this.execPerSecond = execPerSecond;
                return this;
            }

            /**
             * <p>The number of rows read from the memory.</p>
             * 
             * <strong>example:</strong>
             * <p>61.044</p>
             */
            public Builder executeTime(Float executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The number of executions per second.</p>
             * 
             * <strong>example:</strong>
             * <p>89403</p>
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * <p>$.parameters[12].schema.description</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failTimes(Long failTimes) {
                this.failTimes = failTimes;
                return this;
            }

            /**
             * <p>The queuing time, in ms.</p>
             * 
             * <strong>example:</strong>
             * <p>0.052</p>
             */
            public Builder getPlanTime(Float getPlanTime) {
                this.getPlanTime = getPlanTime;
                return this;
            }

            /**
             * <p>$.parameters[15].schema.example</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder IOWaitTime(Float IOWaitTime) {
                this.IOWaitTime = IOWaitTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder key(Long key) {
                this.key = key;
                return this;
            }

            /**
             * <p>You can call this operation to query SQL execution performance data collected by the diagnostic system.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder logicalRead(Long logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * <p>SQLID.</p>
             * 
             * <strong>example:</strong>
             * <p>257.967</p>
             */
            public Builder maxCpuTime(Float maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * <p>The sequence number of the returned SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>260.044</p>
             */
            public Builder maxElapsedTime(Float maxElapsedTime) {
                this.maxElapsedTime = maxElapsedTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>527</p>
             */
            public Builder memstoreReadRowCount(Long memstoreReadRowCount) {
                this.memstoreReadRowCount = memstoreReadRowCount;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder missPlans(Long missPlans) {
                this.missPlans = missPlans;
                return this;
            }

            /**
             * <p>The end time of the time range for querying TOP SQL statements.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder netWaitTime(Float netWaitTime) {
                this.netWaitTime = netWaitTime;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp18qljorblo8es*****</p>
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * <p>$.parameters[12].schema.enumValueTitles</p>
             * 
             * <strong>example:</strong>
             * <p>15.275</p>
             */
            public Builder queueTime(Float queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * <p>The start time of the time range for querying TOP SQL statements.<br>The value must be UTC time in the format of YYYY-MM-DDThh:mm:ssZ.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder RPCCount(Long RPCCount) {
                this.RPCCount = RPCCount;
                return this;
            }

            /**
             * <p>The return result of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remotePlans(Long remotePlans) {
                this.remotePlans = remotePlans;
                return this;
            }

            /**
             * <p>$.parameters[13].schema.description</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retryCount(Long retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The wait event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * <pre><code>http(s)://[Endpoint]/?Action=DescribeTopSQLList
             * &amp;TenantId=t2mr3oae0****
             * &amp;StartTime=2021-06-13 15:40:43
             * &amp;EndTime=2021-09-13 15:40:43
             * &amp;DbName=testdb
             * &amp;SearchKeyWord=update
             * &amp;SearchParameter=cputime
             * &amp;SearchRule=&gt;
             * &amp;SearchValue=0.01
             * &amp;SQLId=8D6E84****0B8FB1823D199E2CA1****
             * &amp;NodeIp=i-bp19y05uq6xpacyqnlrc
             * &amp;PageNumber=1
             * &amp;PageSize=10
             * &amp;SortColumn=cputime
             * &amp;SortOrder=desc
             * &amp;Common request parameters
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowCacheHit(Long rowCacheHit) {
                this.rowCacheHit = rowCacheHit;
                return this;
            }

            /**
             * <p>$.parameters[13].schema.example</p>
             * 
             * <strong>example:</strong>
             * <p>8D6E84<strong><strong>0B8FB1823D199E2CA1</strong></strong></p>
             */
            public Builder SQLId(String SQLId) {
                this.SQLId = SQLId;
                return this;
            }

            /**
             * <p>The list of top SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT  ****   FROM ****   WHERE **** = ? AND **** = ?   ORDER BY **** ASC</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder SQLType(Long SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * <p>The search keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
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
             * <ul>
             * <li></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.966</p>
             */
            public Builder totalWaitTime(Float totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
                return this;
            }

            /**
             * <p>The number of Bloom filter cache hits.</p>
             * 
             * <strong>example:</strong>
             * <p>tester</p>
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
