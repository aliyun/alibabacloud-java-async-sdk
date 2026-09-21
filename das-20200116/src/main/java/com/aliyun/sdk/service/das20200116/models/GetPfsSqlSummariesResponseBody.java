// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetPfsSqlSummariesResponseBody} extends {@link TeaModel}
 *
 * <p>GetPfsSqlSummariesResponseBody</p>
 */
public class GetPfsSqlSummariesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPfsSqlSummariesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPfsSqlSummariesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPfsSqlSummariesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * <blockquote>
         * <p>If the request succeeds, this parameter returns <strong>Successful</strong>. If it fails, it returns error details such as an error code.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54F3DBAE-9420-511A-9C29-265E8C04****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded:</p>
         * <ul>
         * <li><p><strong>true</strong>: Succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPfsSqlSummariesResponseBody build() {
            return new GetPfsSqlSummariesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPfsSqlSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPfsSqlSummariesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgLatency")
        private Double avgLatency;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("CountRate")
        private Double countRate;

        @com.aliyun.core.annotation.NameInMap("CpuRate")
        private Double cpuRate;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Double cpuTime;

        @com.aliyun.core.annotation.NameInMap("DataReadTime")
        private Double dataReadTime;

        @com.aliyun.core.annotation.NameInMap("DataReads")
        private Integer dataReads;

        @com.aliyun.core.annotation.NameInMap("DataWriteTime")
        private Double dataWriteTime;

        @com.aliyun.core.annotation.NameInMap("DataWrites")
        private Integer dataWrites;

        @com.aliyun.core.annotation.NameInMap("Db")
        private String db;

        @com.aliyun.core.annotation.NameInMap("ElapsedTime")
        private Double elapsedTime;

        @com.aliyun.core.annotation.NameInMap("ErrCount")
        private Long errCount;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("FullScan")
        private Boolean fullScan;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("LockLatencyAvg")
        private Double lockLatencyAvg;

        @com.aliyun.core.annotation.NameInMap("LogicId")
        private Long logicId;

        @com.aliyun.core.annotation.NameInMap("LogicReads")
        private Long logicReads;

        @com.aliyun.core.annotation.NameInMap("MaxLatency")
        private Double maxLatency;

        @com.aliyun.core.annotation.NameInMap("MutexSpins")
        private Integer mutexSpins;

        @com.aliyun.core.annotation.NameInMap("MutexWaits")
        private Integer mutexWaits;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PhysicalAsyncReads")
        private Long physicalAsyncReads;

        @com.aliyun.core.annotation.NameInMap("PhysicalReads")
        private Long physicalReads;

        @com.aliyun.core.annotation.NameInMap("Psql")
        private String psql;

        @com.aliyun.core.annotation.NameInMap("RedoWrites")
        private Long redoWrites;

        @com.aliyun.core.annotation.NameInMap("RowsAffected")
        private Long rowsAffected;

        @com.aliyun.core.annotation.NameInMap("RowsAffectedAvg")
        private Double rowsAffectedAvg;

        @com.aliyun.core.annotation.NameInMap("RowsExamined")
        private Long rowsExamined;

        @com.aliyun.core.annotation.NameInMap("RowsExaminedAvg")
        private Double rowsExaminedAvg;

        @com.aliyun.core.annotation.NameInMap("RowsSendAvg")
        private Double rowsSendAvg;

        @com.aliyun.core.annotation.NameInMap("RowsSent")
        private Long rowsSent;

        @com.aliyun.core.annotation.NameInMap("RowsSentAvg")
        private Double rowsSentAvg;

        @com.aliyun.core.annotation.NameInMap("RowsSorted")
        private Long rowsSorted;

        @com.aliyun.core.annotation.NameInMap("RtRate")
        private Double rtRate;

        @com.aliyun.core.annotation.NameInMap("RwlockOsWaits")
        private Integer rwlockOsWaits;

        @com.aliyun.core.annotation.NameInMap("RwlockSpinRounds")
        private Integer rwlockSpinRounds;

        @com.aliyun.core.annotation.NameInMap("RwlockSpinWaits")
        private Integer rwlockSpinWaits;

        @com.aliyun.core.annotation.NameInMap("SelectFullJoinAvg")
        private Double selectFullJoinAvg;

        @com.aliyun.core.annotation.NameInMap("SelectFullRangeJoinAvg")
        private Double selectFullRangeJoinAvg;

        @com.aliyun.core.annotation.NameInMap("SelectRangeAvg")
        private Double selectRangeAvg;

        @com.aliyun.core.annotation.NameInMap("SelectScanAvg")
        private Double selectScanAvg;

        @com.aliyun.core.annotation.NameInMap("SemisyncDelayTime")
        private Double semisyncDelayTime;

        @com.aliyun.core.annotation.NameInMap("ServerLockTime")
        private Double serverLockTime;

        @com.aliyun.core.annotation.NameInMap("SortMergePasses")
        private Long sortMergePasses;

        @com.aliyun.core.annotation.NameInMap("SortRangeAvg")
        private Double sortRangeAvg;

        @com.aliyun.core.annotation.NameInMap("SortRowsAvg")
        private Double sortRowsAvg;

        @com.aliyun.core.annotation.NameInMap("SortScanAvg")
        private Double sortScanAvg;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<String> tables;

        @com.aliyun.core.annotation.NameInMap("TimerWaitAvg")
        private Double timerWaitAvg;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TmpDiskTables")
        private Long tmpDiskTables;

        @com.aliyun.core.annotation.NameInMap("TmpDiskTablesAvg")
        private Double tmpDiskTablesAvg;

        @com.aliyun.core.annotation.NameInMap("TmpTables")
        private Long tmpTables;

        @com.aliyun.core.annotation.NameInMap("TmpTablesAvg")
        private Double tmpTablesAvg;

        @com.aliyun.core.annotation.NameInMap("TotalLatency")
        private Double totalLatency;

        @com.aliyun.core.annotation.NameInMap("TransactionLockTime")
        private Double transactionLockTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WarnCount")
        private Long warnCount;

        private List(Builder builder) {
            this.avgLatency = builder.avgLatency;
            this.count = builder.count;
            this.countRate = builder.countRate;
            this.cpuRate = builder.cpuRate;
            this.cpuTime = builder.cpuTime;
            this.dataReadTime = builder.dataReadTime;
            this.dataReads = builder.dataReads;
            this.dataWriteTime = builder.dataWriteTime;
            this.dataWrites = builder.dataWrites;
            this.db = builder.db;
            this.elapsedTime = builder.elapsedTime;
            this.errCount = builder.errCount;
            this.firstTime = builder.firstTime;
            this.fullScan = builder.fullScan;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.lastTime = builder.lastTime;
            this.lockLatencyAvg = builder.lockLatencyAvg;
            this.logicId = builder.logicId;
            this.logicReads = builder.logicReads;
            this.maxLatency = builder.maxLatency;
            this.mutexSpins = builder.mutexSpins;
            this.mutexWaits = builder.mutexWaits;
            this.nodeId = builder.nodeId;
            this.physicalAsyncReads = builder.physicalAsyncReads;
            this.physicalReads = builder.physicalReads;
            this.psql = builder.psql;
            this.redoWrites = builder.redoWrites;
            this.rowsAffected = builder.rowsAffected;
            this.rowsAffectedAvg = builder.rowsAffectedAvg;
            this.rowsExamined = builder.rowsExamined;
            this.rowsExaminedAvg = builder.rowsExaminedAvg;
            this.rowsSendAvg = builder.rowsSendAvg;
            this.rowsSent = builder.rowsSent;
            this.rowsSentAvg = builder.rowsSentAvg;
            this.rowsSorted = builder.rowsSorted;
            this.rtRate = builder.rtRate;
            this.rwlockOsWaits = builder.rwlockOsWaits;
            this.rwlockSpinRounds = builder.rwlockSpinRounds;
            this.rwlockSpinWaits = builder.rwlockSpinWaits;
            this.selectFullJoinAvg = builder.selectFullJoinAvg;
            this.selectFullRangeJoinAvg = builder.selectFullRangeJoinAvg;
            this.selectRangeAvg = builder.selectRangeAvg;
            this.selectScanAvg = builder.selectScanAvg;
            this.semisyncDelayTime = builder.semisyncDelayTime;
            this.serverLockTime = builder.serverLockTime;
            this.sortMergePasses = builder.sortMergePasses;
            this.sortRangeAvg = builder.sortRangeAvg;
            this.sortRowsAvg = builder.sortRowsAvg;
            this.sortScanAvg = builder.sortScanAvg;
            this.sqlId = builder.sqlId;
            this.sqlType = builder.sqlType;
            this.tables = builder.tables;
            this.timerWaitAvg = builder.timerWaitAvg;
            this.timestamp = builder.timestamp;
            this.tmpDiskTables = builder.tmpDiskTables;
            this.tmpDiskTablesAvg = builder.tmpDiskTablesAvg;
            this.tmpTables = builder.tmpTables;
            this.tmpTablesAvg = builder.tmpTablesAvg;
            this.totalLatency = builder.totalLatency;
            this.transactionLockTime = builder.transactionLockTime;
            this.userId = builder.userId;
            this.warnCount = builder.warnCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return avgLatency
         */
        public Double getAvgLatency() {
            return this.avgLatency;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return countRate
         */
        public Double getCountRate() {
            return this.countRate;
        }

        /**
         * @return cpuRate
         */
        public Double getCpuRate() {
            return this.cpuRate;
        }

        /**
         * @return cpuTime
         */
        public Double getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return dataReadTime
         */
        public Double getDataReadTime() {
            return this.dataReadTime;
        }

        /**
         * @return dataReads
         */
        public Integer getDataReads() {
            return this.dataReads;
        }

        /**
         * @return dataWriteTime
         */
        public Double getDataWriteTime() {
            return this.dataWriteTime;
        }

        /**
         * @return dataWrites
         */
        public Integer getDataWrites() {
            return this.dataWrites;
        }

        /**
         * @return db
         */
        public String getDb() {
            return this.db;
        }

        /**
         * @return elapsedTime
         */
        public Double getElapsedTime() {
            return this.elapsedTime;
        }

        /**
         * @return errCount
         */
        public Long getErrCount() {
            return this.errCount;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return fullScan
         */
        public Boolean getFullScan() {
            return this.fullScan;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return lockLatencyAvg
         */
        public Double getLockLatencyAvg() {
            return this.lockLatencyAvg;
        }

        /**
         * @return logicId
         */
        public Long getLogicId() {
            return this.logicId;
        }

        /**
         * @return logicReads
         */
        public Long getLogicReads() {
            return this.logicReads;
        }

        /**
         * @return maxLatency
         */
        public Double getMaxLatency() {
            return this.maxLatency;
        }

        /**
         * @return mutexSpins
         */
        public Integer getMutexSpins() {
            return this.mutexSpins;
        }

        /**
         * @return mutexWaits
         */
        public Integer getMutexWaits() {
            return this.mutexWaits;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return physicalAsyncReads
         */
        public Long getPhysicalAsyncReads() {
            return this.physicalAsyncReads;
        }

        /**
         * @return physicalReads
         */
        public Long getPhysicalReads() {
            return this.physicalReads;
        }

        /**
         * @return psql
         */
        public String getPsql() {
            return this.psql;
        }

        /**
         * @return redoWrites
         */
        public Long getRedoWrites() {
            return this.redoWrites;
        }

        /**
         * @return rowsAffected
         */
        public Long getRowsAffected() {
            return this.rowsAffected;
        }

        /**
         * @return rowsAffectedAvg
         */
        public Double getRowsAffectedAvg() {
            return this.rowsAffectedAvg;
        }

        /**
         * @return rowsExamined
         */
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        /**
         * @return rowsExaminedAvg
         */
        public Double getRowsExaminedAvg() {
            return this.rowsExaminedAvg;
        }

        /**
         * @return rowsSendAvg
         */
        public Double getRowsSendAvg() {
            return this.rowsSendAvg;
        }

        /**
         * @return rowsSent
         */
        public Long getRowsSent() {
            return this.rowsSent;
        }

        /**
         * @return rowsSentAvg
         */
        public Double getRowsSentAvg() {
            return this.rowsSentAvg;
        }

        /**
         * @return rowsSorted
         */
        public Long getRowsSorted() {
            return this.rowsSorted;
        }

        /**
         * @return rtRate
         */
        public Double getRtRate() {
            return this.rtRate;
        }

        /**
         * @return rwlockOsWaits
         */
        public Integer getRwlockOsWaits() {
            return this.rwlockOsWaits;
        }

        /**
         * @return rwlockSpinRounds
         */
        public Integer getRwlockSpinRounds() {
            return this.rwlockSpinRounds;
        }

        /**
         * @return rwlockSpinWaits
         */
        public Integer getRwlockSpinWaits() {
            return this.rwlockSpinWaits;
        }

        /**
         * @return selectFullJoinAvg
         */
        public Double getSelectFullJoinAvg() {
            return this.selectFullJoinAvg;
        }

        /**
         * @return selectFullRangeJoinAvg
         */
        public Double getSelectFullRangeJoinAvg() {
            return this.selectFullRangeJoinAvg;
        }

        /**
         * @return selectRangeAvg
         */
        public Double getSelectRangeAvg() {
            return this.selectRangeAvg;
        }

        /**
         * @return selectScanAvg
         */
        public Double getSelectScanAvg() {
            return this.selectScanAvg;
        }

        /**
         * @return semisyncDelayTime
         */
        public Double getSemisyncDelayTime() {
            return this.semisyncDelayTime;
        }

        /**
         * @return serverLockTime
         */
        public Double getServerLockTime() {
            return this.serverLockTime;
        }

        /**
         * @return sortMergePasses
         */
        public Long getSortMergePasses() {
            return this.sortMergePasses;
        }

        /**
         * @return sortRangeAvg
         */
        public Double getSortRangeAvg() {
            return this.sortRangeAvg;
        }

        /**
         * @return sortRowsAvg
         */
        public Double getSortRowsAvg() {
            return this.sortRowsAvg;
        }

        /**
         * @return sortScanAvg
         */
        public Double getSortScanAvg() {
            return this.sortScanAvg;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        /**
         * @return timerWaitAvg
         */
        public Double getTimerWaitAvg() {
            return this.timerWaitAvg;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return tmpDiskTables
         */
        public Long getTmpDiskTables() {
            return this.tmpDiskTables;
        }

        /**
         * @return tmpDiskTablesAvg
         */
        public Double getTmpDiskTablesAvg() {
            return this.tmpDiskTablesAvg;
        }

        /**
         * @return tmpTables
         */
        public Long getTmpTables() {
            return this.tmpTables;
        }

        /**
         * @return tmpTablesAvg
         */
        public Double getTmpTablesAvg() {
            return this.tmpTablesAvg;
        }

        /**
         * @return totalLatency
         */
        public Double getTotalLatency() {
            return this.totalLatency;
        }

        /**
         * @return transactionLockTime
         */
        public Double getTransactionLockTime() {
            return this.transactionLockTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return warnCount
         */
        public Long getWarnCount() {
            return this.warnCount;
        }

        public static final class Builder {
            private Double avgLatency; 
            private Long count; 
            private Double countRate; 
            private Double cpuRate; 
            private Double cpuTime; 
            private Double dataReadTime; 
            private Integer dataReads; 
            private Double dataWriteTime; 
            private Integer dataWrites; 
            private String db; 
            private Double elapsedTime; 
            private Long errCount; 
            private Long firstTime; 
            private Boolean fullScan; 
            private Long id; 
            private String instanceId; 
            private Long lastTime; 
            private Double lockLatencyAvg; 
            private Long logicId; 
            private Long logicReads; 
            private Double maxLatency; 
            private Integer mutexSpins; 
            private Integer mutexWaits; 
            private String nodeId; 
            private Long physicalAsyncReads; 
            private Long physicalReads; 
            private String psql; 
            private Long redoWrites; 
            private Long rowsAffected; 
            private Double rowsAffectedAvg; 
            private Long rowsExamined; 
            private Double rowsExaminedAvg; 
            private Double rowsSendAvg; 
            private Long rowsSent; 
            private Double rowsSentAvg; 
            private Long rowsSorted; 
            private Double rtRate; 
            private Integer rwlockOsWaits; 
            private Integer rwlockSpinRounds; 
            private Integer rwlockSpinWaits; 
            private Double selectFullJoinAvg; 
            private Double selectFullRangeJoinAvg; 
            private Double selectRangeAvg; 
            private Double selectScanAvg; 
            private Double semisyncDelayTime; 
            private Double serverLockTime; 
            private Long sortMergePasses; 
            private Double sortRangeAvg; 
            private Double sortRowsAvg; 
            private Double sortScanAvg; 
            private String sqlId; 
            private String sqlType; 
            private java.util.List<String> tables; 
            private Double timerWaitAvg; 
            private Long timestamp; 
            private Long tmpDiskTables; 
            private Double tmpDiskTablesAvg; 
            private Long tmpTables; 
            private Double tmpTablesAvg; 
            private Double totalLatency; 
            private Double transactionLockTime; 
            private String userId; 
            private Long warnCount; 

            private Builder() {
            } 

            private Builder(List model) {
                this.avgLatency = model.avgLatency;
                this.count = model.count;
                this.countRate = model.countRate;
                this.cpuRate = model.cpuRate;
                this.cpuTime = model.cpuTime;
                this.dataReadTime = model.dataReadTime;
                this.dataReads = model.dataReads;
                this.dataWriteTime = model.dataWriteTime;
                this.dataWrites = model.dataWrites;
                this.db = model.db;
                this.elapsedTime = model.elapsedTime;
                this.errCount = model.errCount;
                this.firstTime = model.firstTime;
                this.fullScan = model.fullScan;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.lastTime = model.lastTime;
                this.lockLatencyAvg = model.lockLatencyAvg;
                this.logicId = model.logicId;
                this.logicReads = model.logicReads;
                this.maxLatency = model.maxLatency;
                this.mutexSpins = model.mutexSpins;
                this.mutexWaits = model.mutexWaits;
                this.nodeId = model.nodeId;
                this.physicalAsyncReads = model.physicalAsyncReads;
                this.physicalReads = model.physicalReads;
                this.psql = model.psql;
                this.redoWrites = model.redoWrites;
                this.rowsAffected = model.rowsAffected;
                this.rowsAffectedAvg = model.rowsAffectedAvg;
                this.rowsExamined = model.rowsExamined;
                this.rowsExaminedAvg = model.rowsExaminedAvg;
                this.rowsSendAvg = model.rowsSendAvg;
                this.rowsSent = model.rowsSent;
                this.rowsSentAvg = model.rowsSentAvg;
                this.rowsSorted = model.rowsSorted;
                this.rtRate = model.rtRate;
                this.rwlockOsWaits = model.rwlockOsWaits;
                this.rwlockSpinRounds = model.rwlockSpinRounds;
                this.rwlockSpinWaits = model.rwlockSpinWaits;
                this.selectFullJoinAvg = model.selectFullJoinAvg;
                this.selectFullRangeJoinAvg = model.selectFullRangeJoinAvg;
                this.selectRangeAvg = model.selectRangeAvg;
                this.selectScanAvg = model.selectScanAvg;
                this.semisyncDelayTime = model.semisyncDelayTime;
                this.serverLockTime = model.serverLockTime;
                this.sortMergePasses = model.sortMergePasses;
                this.sortRangeAvg = model.sortRangeAvg;
                this.sortRowsAvg = model.sortRowsAvg;
                this.sortScanAvg = model.sortScanAvg;
                this.sqlId = model.sqlId;
                this.sqlType = model.sqlType;
                this.tables = model.tables;
                this.timerWaitAvg = model.timerWaitAvg;
                this.timestamp = model.timestamp;
                this.tmpDiskTables = model.tmpDiskTables;
                this.tmpDiskTablesAvg = model.tmpDiskTablesAvg;
                this.tmpTables = model.tmpTables;
                this.tmpTablesAvg = model.tmpTablesAvg;
                this.totalLatency = model.totalLatency;
                this.transactionLockTime = model.transactionLockTime;
                this.userId = model.userId;
                this.warnCount = model.warnCount;
            } 

            /**
             * <p>Average SQL execution duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1717</p>
             */
            public Builder avgLatency(Double avgLatency) {
                this.avgLatency = avgLatency;
                return this;
            }

            /**
             * <p>Total number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Percentage of total executions.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0586</p>
             */
            public Builder countRate(Double countRate) {
                this.countRate = countRate;
                return this;
            }

            /**
             * <p>Ratio of CPU execution time to total SQL execution time.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cpuRate(Double cpuRate) {
                this.cpuRate = cpuRate;
                return this;
            }

            /**
             * <p>CPU runtime, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cpuTime(Double cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * <p>Data read time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataReadTime(Double dataReadTime) {
                this.dataReadTime = dataReadTime;
                return this;
            }

            /**
             * <p>Number of readable data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataReads(Integer dataReads) {
                this.dataReads = dataReads;
                return this;
            }

            /**
             * <p>Data write time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataWriteTime(Double dataWriteTime) {
                this.dataWriteTime = dataWriteTime;
                return this;
            }

            /**
             * <p>Number of writable data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataWrites(Integer dataWrites) {
                this.dataWrites = dataWrites;
                return this;
            }

            /**
             * <p>Database name.</p>
             * 
             * <strong>example:</strong>
             * <p>testDB</p>
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * <p>Actual runtime, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder elapsedTime(Double elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>Number of errors.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errCount(Long errCount) {
                this.errCount = errCount;
                return this;
            }

            /**
             * <p>First execution time, in Unix time format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1659308149000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>Indicates whether a full table scan occurred. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Yes.</p>
             * </li>
             * <li><p><strong>false</strong>: No.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder fullScan(Boolean fullScan) {
                this.fullScan = fullScan;
                return this;
            }

            /**
             * <p>Primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>26186357</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Last update time, in Unix time format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1661306520000</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>Average lock wait time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lockLatencyAvg(Double lockLatencyAvg) {
                this.lockLatencyAvg = lockLatencyAvg;
                return this;
            }

            /**
             * <p>Logical database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>58275984</p>
             */
            public Builder logicId(Long logicId) {
                this.logicId = logicId;
                return this;
            }

            /**
             * <p>Number of logical nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder logicReads(Long logicReads) {
                this.logicReads = logicReads;
                return this;
            }

            /**
             * <p>Maximum execution duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>36.233</p>
             */
            public Builder maxLatency(Double maxLatency) {
                this.maxLatency = maxLatency;
                return this;
            }

            /**
             * <p>Number of mutex spins.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mutexSpins(Integer mutexSpins) {
                this.mutexSpins = mutexSpins;
                return this;
            }

            /**
             * <p>Number of mutex waits.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mutexWaits(Integer mutexWaits) {
                this.mutexWaits = mutexWaits;
                return this;
            }

            /**
             * <p>Node ID.</p>
             * <blockquote>
             * <p>This parameter is returned for ApsaraDB RDS for MySQL Cluster Edition or PolarDB for MySQL database instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>r-x****-db-0</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Number of physical asynchronous nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalAsyncReads(Long physicalAsyncReads) {
                this.physicalAsyncReads = physicalAsyncReads;
                return this;
            }

            /**
             * <p>Number of physical nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalReads(Long physicalReads) {
                this.physicalReads = physicalReads;
                return this;
            }

            /**
             * <p>SQL template.</p>
             * 
             * <strong>example:</strong>
             * <p>select ?</p>
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * <p>Number of redo nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder redoWrites(Long redoWrites) {
                this.redoWrites = redoWrites;
                return this;
            }

            /**
             * <p>Number of rows affected.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsAffected(Long rowsAffected) {
                this.rowsAffected = rowsAffected;
                return this;
            }

            /**
             * <p>Average number of rows affected.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsAffectedAvg(Double rowsAffectedAvg) {
                this.rowsAffectedAvg = rowsAffectedAvg;
                return this;
            }

            /**
             * <p>Total number of rows scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rowsExamined(Long rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * <p>Average number of rows scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsExaminedAvg(Double rowsExaminedAvg) {
                this.rowsExaminedAvg = rowsExaminedAvg;
                return this;
            }

            /**
             * <p>Average number of rows sent.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsSendAvg(Double rowsSendAvg) {
                this.rowsSendAvg = rowsSendAvg;
                return this;
            }

            /**
             * <p>Number of rows returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsSent(Long rowsSent) {
                this.rowsSent = rowsSent;
                return this;
            }

            /**
             * <p>Average number of rows returned per SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0.52</p>
             */
            public Builder rowsSentAvg(Double rowsSentAvg) {
                this.rowsSentAvg = rowsSentAvg;
                return this;
            }

            /**
             * <p>Number of rows sorted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsSorted(Long rowsSorted) {
                this.rowsSorted = rowsSorted;
                return this;
            }

            /**
             * <p>Percentage of total execution duration.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1384</p>
             */
            public Builder rtRate(Double rtRate) {
                this.rtRate = rtRate;
                return this;
            }

            /**
             * <p>Indicates whether read/write splitting is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Disabled.</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rwlockOsWaits(Integer rwlockOsWaits) {
                this.rwlockOsWaits = rwlockOsWaits;
                return this;
            }

            /**
             * <p>Read/write splitting parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rwlockSpinRounds(Integer rwlockSpinRounds) {
                this.rwlockSpinRounds = rwlockSpinRounds;
                return this;
            }

            /**
             * <p>Indicates whether multiple index scans are enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Disabled.</p>
             * </li>
             * <li><p><strong>1</strong>: Enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rwlockSpinWaits(Integer rwlockSpinWaits) {
                this.rwlockSpinWaits = rwlockSpinWaits;
                return this;
            }

            /**
             * <p>The average number of connections that perform table scans without using an index.</p>
             * <blockquote>
             * <p>Notice: If this parameter value is not 0, carefully check the indexes of the table.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectFullJoinAvg(Double selectFullJoinAvg) {
                this.selectFullJoinAvg = selectFullJoinAvg;
                return this;
            }

            /**
             * <p>Average number of range joins.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectFullRangeJoinAvg(Double selectFullRangeJoinAvg) {
                this.selectFullRangeJoinAvg = selectFullRangeJoinAvg;
                return this;
            }

            /**
             * <p>Average range selection.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectRangeAvg(Double selectRangeAvg) {
                this.selectRangeAvg = selectRangeAvg;
                return this;
            }

            /**
             * <p>Average number of scans.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectScanAvg(Double selectScanAvg) {
                this.selectScanAvg = selectScanAvg;
                return this;
            }

            /**
             * <p>Semi-synchronous replication delay, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.12</p>
             */
            public Builder semisyncDelayTime(Double semisyncDelayTime) {
                this.semisyncDelayTime = semisyncDelayTime;
                return this;
            }

            /**
             * <p>Server lock time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serverLockTime(Double serverLockTime) {
                this.serverLockTime = serverLockTime;
                return this;
            }

            /**
             * <p>Number of merge passes required by the sort algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortMergePasses(Long sortMergePasses) {
                this.sortMergePasses = sortMergePasses;
                return this;
            }

            /**
             * <p>Average number of range-based sorts.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortRangeAvg(Double sortRangeAvg) {
                this.sortRangeAvg = sortRangeAvg;
                return this;
            }

            /**
             * <p>Average number of sorted rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortRowsAvg(Double sortRowsAvg) {
                this.sortRowsAvg = sortRowsAvg;
                return this;
            }

            /**
             * <p>Average number of sorted scans.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortScanAvg(Double sortScanAvg) {
                this.sortScanAvg = sortScanAvg;
                return this;
            }

            /**
             * <p>SQL template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>SQL type. Valid values:</p>
             * <ul>
             * <li><p><strong>SELECT</strong></p>
             * </li>
             * <li><p><strong>UPDATE</strong></p>
             * </li>
             * <li><p><strong>DELETE</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SELECT</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>Database table names.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>Reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder timerWaitAvg(Double timerWaitAvg) {
                this.timerWaitAvg = timerWaitAvg;
                return this;
            }

            /**
             * <p>Data timestamp in Unix time format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1643040000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>Number of temporary disk tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tmpDiskTables(Long tmpDiskTables) {
                this.tmpDiskTables = tmpDiskTables;
                return this;
            }

            /**
             * <p>Average number of temporary disk tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tmpDiskTablesAvg(Double tmpDiskTablesAvg) {
                this.tmpDiskTablesAvg = tmpDiskTablesAvg;
                return this;
            }

            /**
             * <p>Number of temporary tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tmpTables(Long tmpTables) {
                this.tmpTables = tmpTables;
                return this;
            }

            /**
             * <p>Average number of temporary tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tmpTablesAvg(Double tmpTablesAvg) {
                this.tmpTablesAvg = tmpTablesAvg;
                return this;
            }

            /**
             * <p>Total execution duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60913.256</p>
             */
            public Builder totalLatency(Double totalLatency) {
                this.totalLatency = totalLatency;
                return this;
            }

            /**
             * <p>Transaction lock time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder transactionLockTime(Double transactionLockTime) {
                this.transactionLockTime = transactionLockTime;
                return this;
            }

            /**
             * <p>User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>196278346919****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Number of warnings.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder warnCount(Long warnCount) {
                this.warnCount = warnCount;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPfsSqlSummariesResponseBody} extends {@link TeaModel}
     *
     * <p>GetPfsSqlSummariesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private Object extra;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public Object getExtra() {
            return this.extra;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Object extra; 
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.extra = model.extra;
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>Reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder extra(Object extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>Detailed information list.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>Maximum number of records per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>264</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
