// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSqlLogRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlLogRecordsResponseBody</p>
 */
public class DescribeSqlLogRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSqlLogRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * SqlLogDetailResult
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSqlLogRecordsResponseBody build() {
            return new DescribeSqlLogRecordsResponseBody(this);
        } 

    } 

    public static class SQLLogRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Collection")
        private String collection;

        @com.aliyun.core.annotation.NameInMap("Consume")
        private Long consume;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Long cpuTime;

        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("Frows")
        private Long frows;

        @com.aliyun.core.annotation.NameInMap("HostAddress")
        private String hostAddress;

        @com.aliyun.core.annotation.NameInMap("LockTime")
        private Long lockTime;

        @com.aliyun.core.annotation.NameInMap("LogicRead")
        private Long logicRead;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OriginTime")
        private Long originTime;

        @com.aliyun.core.annotation.NameInMap("ParallelDegree")
        private String parallelDegree;

        @com.aliyun.core.annotation.NameInMap("ParallelQueueTime")
        private String parallelQueueTime;

        @com.aliyun.core.annotation.NameInMap("PhysicAsyncRead")
        private Long physicAsyncRead;

        @com.aliyun.core.annotation.NameInMap("PhysicRead")
        private Long physicRead;

        @com.aliyun.core.annotation.NameInMap("PhysicSyncRead")
        private Long physicSyncRead;

        @com.aliyun.core.annotation.NameInMap("ReturnRows")
        private Long returnRows;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private Long rows;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("Scnt")
        private Long scnt;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlText")
        private String sqlText;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private Long threadId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("TrxId")
        private Long trxId;

        @com.aliyun.core.annotation.NameInMap("UpdateRows")
        private Long updateRows;

        @com.aliyun.core.annotation.NameInMap("UseImciEngine")
        private String useImciEngine;

        @com.aliyun.core.annotation.NameInMap("Vip")
        private String vip;

        @com.aliyun.core.annotation.NameInMap("Writes")
        private Long writes;

        private SQLLogRecord(Builder builder) {
            this.accountName = builder.accountName;
            this.collection = builder.collection;
            this.consume = builder.consume;
            this.cpuTime = builder.cpuTime;
            this.DBName = builder.DBName;
            this.executeTime = builder.executeTime;
            this.ext = builder.ext;
            this.frows = builder.frows;
            this.hostAddress = builder.hostAddress;
            this.lockTime = builder.lockTime;
            this.logicRead = builder.logicRead;
            this.nodeId = builder.nodeId;
            this.originTime = builder.originTime;
            this.parallelDegree = builder.parallelDegree;
            this.parallelQueueTime = builder.parallelQueueTime;
            this.physicAsyncRead = builder.physicAsyncRead;
            this.physicRead = builder.physicRead;
            this.physicSyncRead = builder.physicSyncRead;
            this.returnRows = builder.returnRows;
            this.rows = builder.rows;
            this.scanRows = builder.scanRows;
            this.scnt = builder.scnt;
            this.sqlId = builder.sqlId;
            this.sqlText = builder.sqlText;
            this.sqlType = builder.sqlType;
            this.state = builder.state;
            this.threadId = builder.threadId;
            this.traceId = builder.traceId;
            this.trxId = builder.trxId;
            this.updateRows = builder.updateRows;
            this.useImciEngine = builder.useImciEngine;
            this.vip = builder.vip;
            this.writes = builder.writes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLLogRecord create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return collection
         */
        public String getCollection() {
            return this.collection;
        }

        /**
         * @return consume
         */
        public Long getConsume() {
            return this.consume;
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
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return frows
         */
        public Long getFrows() {
            return this.frows;
        }

        /**
         * @return hostAddress
         */
        public String getHostAddress() {
            return this.hostAddress;
        }

        /**
         * @return lockTime
         */
        public Long getLockTime() {
            return this.lockTime;
        }

        /**
         * @return logicRead
         */
        public Long getLogicRead() {
            return this.logicRead;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return originTime
         */
        public Long getOriginTime() {
            return this.originTime;
        }

        /**
         * @return parallelDegree
         */
        public String getParallelDegree() {
            return this.parallelDegree;
        }

        /**
         * @return parallelQueueTime
         */
        public String getParallelQueueTime() {
            return this.parallelQueueTime;
        }

        /**
         * @return physicAsyncRead
         */
        public Long getPhysicAsyncRead() {
            return this.physicAsyncRead;
        }

        /**
         * @return physicRead
         */
        public Long getPhysicRead() {
            return this.physicRead;
        }

        /**
         * @return physicSyncRead
         */
        public Long getPhysicSyncRead() {
            return this.physicSyncRead;
        }

        /**
         * @return returnRows
         */
        public Long getReturnRows() {
            return this.returnRows;
        }

        /**
         * @return rows
         */
        public Long getRows() {
            return this.rows;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
        }

        /**
         * @return scnt
         */
        public Long getScnt() {
            return this.scnt;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlText
         */
        public String getSqlText() {
            return this.sqlText;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return threadId
         */
        public Long getThreadId() {
            return this.threadId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return trxId
         */
        public Long getTrxId() {
            return this.trxId;
        }

        /**
         * @return updateRows
         */
        public Long getUpdateRows() {
            return this.updateRows;
        }

        /**
         * @return useImciEngine
         */
        public String getUseImciEngine() {
            return this.useImciEngine;
        }

        /**
         * @return vip
         */
        public String getVip() {
            return this.vip;
        }

        /**
         * @return writes
         */
        public Long getWrites() {
            return this.writes;
        }

        public static final class Builder {
            private String accountName; 
            private String collection; 
            private Long consume; 
            private Long cpuTime; 
            private String DBName; 
            private String executeTime; 
            private String ext; 
            private Long frows; 
            private String hostAddress; 
            private Long lockTime; 
            private Long logicRead; 
            private String nodeId; 
            private Long originTime; 
            private String parallelDegree; 
            private String parallelQueueTime; 
            private Long physicAsyncRead; 
            private Long physicRead; 
            private Long physicSyncRead; 
            private Long returnRows; 
            private Long rows; 
            private Long scanRows; 
            private Long scnt; 
            private String sqlId; 
            private String sqlText; 
            private String sqlType; 
            private String state; 
            private Long threadId; 
            private String traceId; 
            private Long trxId; 
            private Long updateRows; 
            private String useImciEngine; 
            private String vip; 
            private Long writes; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * Collection.
             */
            public Builder collection(String collection) {
                this.collection = collection;
                return this;
            }

            /**
             * Consume.
             */
            public Builder consume(Long consume) {
                this.consume = consume;
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
             * ExecuteTime.
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * Frows.
             */
            public Builder frows(Long frows) {
                this.frows = frows;
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
             * LockTime.
             */
            public Builder lockTime(Long lockTime) {
                this.lockTime = lockTime;
                return this;
            }

            /**
             * LogicRead.
             */
            public Builder logicRead(Long logicRead) {
                this.logicRead = logicRead;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * OriginTime.
             */
            public Builder originTime(Long originTime) {
                this.originTime = originTime;
                return this;
            }

            /**
             * ParallelDegree.
             */
            public Builder parallelDegree(String parallelDegree) {
                this.parallelDegree = parallelDegree;
                return this;
            }

            /**
             * ParallelQueueTime.
             */
            public Builder parallelQueueTime(String parallelQueueTime) {
                this.parallelQueueTime = parallelQueueTime;
                return this;
            }

            /**
             * PhysicAsyncRead.
             */
            public Builder physicAsyncRead(Long physicAsyncRead) {
                this.physicAsyncRead = physicAsyncRead;
                return this;
            }

            /**
             * PhysicRead.
             */
            public Builder physicRead(Long physicRead) {
                this.physicRead = physicRead;
                return this;
            }

            /**
             * PhysicSyncRead.
             */
            public Builder physicSyncRead(Long physicSyncRead) {
                this.physicSyncRead = physicSyncRead;
                return this;
            }

            /**
             * ReturnRows.
             */
            public Builder returnRows(Long returnRows) {
                this.returnRows = returnRows;
                return this;
            }

            /**
             * Rows.
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * ScanRows.
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * Scnt.
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * SQL ID。
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * SqlText.
             */
            public Builder sqlText(String sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            /**
             * SqlType.
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * ThreadId.
             */
            public Builder threadId(Long threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * TrxId.
             */
            public Builder trxId(Long trxId) {
                this.trxId = trxId;
                return this;
            }

            /**
             * UpdateRows.
             */
            public Builder updateRows(Long updateRows) {
                this.updateRows = updateRows;
                return this;
            }

            /**
             * UseImciEngine.
             */
            public Builder useImciEngine(String useImciEngine) {
                this.useImciEngine = useImciEngine;
                return this;
            }

            /**
             * Vip.
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            /**
             * Writes.
             */
            public Builder writes(Long writes) {
                this.writes = writes;
                return this;
            }

            public SQLLogRecord build() {
                return new SQLLogRecord(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLLogRecord")
        private java.util.List < SQLLogRecord> SQLLogRecord;

        private Items(Builder builder) {
            this.SQLLogRecord = builder.SQLLogRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return SQLLogRecord
         */
        public java.util.List < SQLLogRecord> getSQLLogRecord() {
            return this.SQLLogRecord;
        }

        public static final class Builder {
            private java.util.List < SQLLogRecord> SQLLogRecord; 

            /**
             * SQLLogRecord.
             */
            public Builder SQLLogRecord(java.util.List < SQLLogRecord> SQLLogRecord) {
                this.SQLLogRecord = SQLLogRecord;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Finish")
        private String finish;

        @com.aliyun.core.annotation.NameInMap("Items")
        private Items items;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TotalRecords")
        private Long totalRecords;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.finish = builder.finish;
            this.items = builder.items;
            this.jobId = builder.jobId;
            this.startTime = builder.startTime;
            this.totalRecords = builder.totalRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return finish
         */
        public String getFinish() {
            return this.finish;
        }

        /**
         * @return items
         */
        public Items getItems() {
            return this.items;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalRecords
         */
        public Long getTotalRecords() {
            return this.totalRecords;
        }

        public static final class Builder {
            private Long endTime; 
            private String finish; 
            private Items items; 
            private String jobId; 
            private Long startTime; 
            private Long totalRecords; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Finish.
             */
            public Builder finish(String finish) {
                this.finish = finish;
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
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalRecords.
             */
            public Builder totalRecords(Long totalRecords) {
                this.totalRecords = totalRecords;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
