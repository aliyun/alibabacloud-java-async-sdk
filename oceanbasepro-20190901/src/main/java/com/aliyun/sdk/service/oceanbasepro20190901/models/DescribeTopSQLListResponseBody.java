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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TOPSQL列表
         */
        public Builder topSQLList(java.util.List < TopSQLList> topSQLList) {
            this.topSQLList = topSQLList;
            return this;
        }

        /**
         * 总数量
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
             * 影响行数
             */
            public Builder affectedRows(Long affectedRows) {
                this.affectedRows = affectedRows;
                return this;
            }

            /**
             * 客户端等待
             */
            public Builder appWaitTime(Float appWaitTime) {
                this.appWaitTime = appWaitTime;
                return this;
            }

            /**
             * BlockCache命中次数
             */
            public Builder blockCacheHit(Long blockCacheHit) {
                this.blockCacheHit = blockCacheHit;
                return this;
            }

            /**
             * BlockIndexCache命中次数
             */
            public Builder blockIndexCacheHit(Long blockIndexCacheHit) {
                this.blockIndexCacheHit = blockIndexCacheHit;
                return this;
            }

            /**
             * BloomFilterCache命中次数
             */
            public Builder bloomFilterCacheHit(Long bloomFilterCacheHit) {
                this.bloomFilterCacheHit = bloomFilterCacheHit;
                return this;
            }

            /**
             * 客户端IP
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * 并发等待
             */
            public Builder concurrencyWaitTime(Float concurrencyWaitTime) {
                this.concurrencyWaitTime = concurrencyWaitTime;
                return this;
            }

            /**
             * 平均CPU时间
             */
            public Builder cpuTime(Float cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * 数据库名
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * 解码等待
             */
            public Builder decodeTime(Float decodeTime) {
                this.decodeTime = decodeTime;
                return this;
            }

            /**
             * 物理读
             */
            public Builder diskRead(Long diskRead) {
                this.diskRead = diskRead;
                return this;
            }

            /**
             * 平均响应时间
             */
            public Builder elapsedTime(Float elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * 等待事件
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * 每秒次数
             */
            public Builder execPerSecond(Float execPerSecond) {
                this.execPerSecond = execPerSecond;
                return this;
            }

            /**
             * 内部执行时间
             */
            public Builder executeTime(Float executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * 执行次数
             */
            public Builder executions(Long executions) {
                this.executions = executions;
                return this;
            }

            /**
             * 失败次数
             */
            public Builder failTimes(Long failTimes) {
                this.failTimes = failTimes;
                return this;
            }

            /**
             * 硬解析时间
             */
            public Builder getPlanTime(Float getPlanTime) {
                this.getPlanTime = getPlanTime;
                return this;
            }

            /**
             * IO等待
             */
            public Builder IOWaitTime(Float IOWaitTime) {
                this.IOWaitTime = IOWaitTime;
                return this;
            }

            /**
             * 返回数据序号
             */
            public Builder key(Long key) {
                this.key = key;
                return this;
            }

            /**
             * 逻辑读
             */
            public Builder logicalRead(Long logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * 最大CPU时间
             */
            public Builder maxCpuTime(Float maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * 最大响应时间
             */
            public Builder maxElapsedTime(Float maxElapsedTime) {
                this.maxElapsedTime = maxElapsedTime;
                return this;
            }

            /**
             * 读内存行数
             */
            public Builder memstoreReadRowCount(Long memstoreReadRowCount) {
                this.memstoreReadRowCount = memstoreReadRowCount;
                return this;
            }

            /**
             * 未命中计划次数
             */
            public Builder missPlans(Long missPlans) {
                this.missPlans = missPlans;
                return this;
            }

            /**
             * 网络等待
             */
            public Builder netWaitTime(Float netWaitTime) {
                this.netWaitTime = netWaitTime;
                return this;
            }

            /**
             * 节点IP
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * 队列等待
             */
            public Builder queueTime(Float queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * RPC次数
             */
            public Builder RPCCount(Long RPCCount) {
                this.RPCCount = RPCCount;
                return this;
            }

            /**
             * 远程计划数
             */
            public Builder remotePlans(Long remotePlans) {
                this.remotePlans = remotePlans;
                return this;
            }

            /**
             * 重试次数
             */
            public Builder retryCount(Long retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * 返回行数
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * RowCache命中次数
             */
            public Builder rowCacheHit(Long rowCacheHit) {
                this.rowCacheHit = rowCacheHit;
                return this;
            }

            /**
             * SQLID
             */
            public Builder SQLId(String SQLId) {
                this.SQLId = SQLId;
                return this;
            }

            /**
             * sql文本
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            /**
             * sql类型
             */
            public Builder SQLType(Long SQLType) {
                this.SQLType = SQLType;
                return this;
            }

            /**
             * 调度时间
             */
            public Builder scheduleTime(Float scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * 读磁盘行数
             */
            public Builder ssstoreReadRowCount(Long ssstoreReadRowCount) {
                this.ssstoreReadRowCount = ssstoreReadRowCount;
                return this;
            }

            /**
             * 内部等待
             */
            public Builder totalWaitTime(Float totalWaitTime) {
                this.totalWaitTime = totalWaitTime;
                return this;
            }

            /**
             * 用户名
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
