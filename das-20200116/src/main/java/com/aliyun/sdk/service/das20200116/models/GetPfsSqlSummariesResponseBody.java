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
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54F3DBAE-9420-511A-9C29-265E8C04****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
             * <p>The average execution latency. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1717</p>
             */
            public Builder avgLatency(Double avgLatency) {
                this.avgLatency = avgLatency;
                return this;
            }

            /**
             * <p>The total number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The percentage of the number of executions.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0586</p>
             */
            public Builder countRate(Double countRate) {
                this.countRate = countRate;
                return this;
            }

            /**
             * <p>The ratio of the CPU execution duration to the total execution duration of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cpuRate(Double cpuRate) {
                this.cpuRate = cpuRate;
                return this;
            }

            /**
             * <p>The CPU execution duration. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cpuTime(Double cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * <p>The data read duration. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataReadTime(Double dataReadTime) {
                this.dataReadTime = dataReadTime;
                return this;
            }

            /**
             * <p>The number of nodes from which data can be read.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataReads(Integer dataReads) {
                this.dataReads = dataReads;
                return this;
            }

            /**
             * <p>The data write duration. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataWriteTime(Double dataWriteTime) {
                this.dataWriteTime = dataWriteTime;
                return this;
            }

            /**
             * <p>The number of nodes to which data can be written.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dataWrites(Integer dataWrites) {
                this.dataWrites = dataWrites;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testDB</p>
             */
            public Builder db(String db) {
                this.db = db;
                return this;
            }

            /**
             * <p>The execution duration. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder elapsedTime(Double elapsedTime) {
                this.elapsedTime = elapsedTime;
                return this;
            }

            /**
             * <p>The number of errors.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder errCount(Long errCount) {
                this.errCount = errCount;
                return this;
            }

            /**
             * <p>The time when the SQL statement was executed for the first time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1659308149000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>Indicates whether full table scan was enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The primary key ID.</p>
             * 
             * <strong>example:</strong>
             * <p>26186357</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the SQL statement was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1661306520000</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The average lock wait latency. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lockLatencyAvg(Double lockLatencyAvg) {
                this.lockLatencyAvg = lockLatencyAvg;
                return this;
            }

            /**
             * <p>The logical database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>58275984</p>
             */
            public Builder logicId(Long logicId) {
                this.logicId = logicId;
                return this;
            }

            /**
             * <p>The number of logical nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder logicReads(Long logicReads) {
                this.logicReads = logicReads;
                return this;
            }

            /**
             * <p>The maximum execution latency. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>36.233</p>
             */
            public Builder maxLatency(Double maxLatency) {
                this.maxLatency = maxLatency;
                return this;
            }

            /**
             * <p>The number of mutex spins.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mutexSpins(Integer mutexSpins) {
                this.mutexSpins = mutexSpins;
                return this;
            }

            /**
             * <p>The number of mutex waits.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mutexWaits(Integer mutexWaits) {
                this.mutexWaits = mutexWaits;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * <blockquote>
             * <p> This parameter is returned only if the database instance is an ApsaraDB RDS for MySQL Cluster Edition instance or a PolarDB for MySQL cluster.</p>
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
             * <p>The number of physical asynchronous nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalAsyncReads(Long physicalAsyncReads) {
                this.physicalAsyncReads = physicalAsyncReads;
                return this;
            }

            /**
             * <p>The number of physical nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalReads(Long physicalReads) {
                this.physicalReads = physicalReads;
                return this;
            }

            /**
             * <p>The SQL template.</p>
             * 
             * <strong>example:</strong>
             * <p>select ?</p>
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * <p>The number of redo nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder redoWrites(Long redoWrites) {
                this.redoWrites = redoWrites;
                return this;
            }

            /**
             * <p>The number of rows that are affected by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsAffected(Long rowsAffected) {
                this.rowsAffected = rowsAffected;
                return this;
            }

            /**
             * <p>The average number of rows affected by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsAffectedAvg(Double rowsAffectedAvg) {
                this.rowsAffectedAvg = rowsAffectedAvg;
                return this;
            }

            /**
             * <p>The total number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder rowsExamined(Long rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * <p>The average number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsExaminedAvg(Double rowsExaminedAvg) {
                this.rowsExaminedAvg = rowsExaminedAvg;
                return this;
            }

            /**
             * <p>The average number of returned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsSendAvg(Double rowsSendAvg) {
                this.rowsSendAvg = rowsSendAvg;
                return this;
            }

            /**
             * <p>The number of rows returned by the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsSent(Long rowsSent) {
                this.rowsSent = rowsSent;
                return this;
            }

            /**
             * <p>The average number of rows returned for the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>0.52</p>
             */
            public Builder rowsSentAvg(Double rowsSentAvg) {
                this.rowsSentAvg = rowsSentAvg;
                return this;
            }

            /**
             * <p>The number of sorted rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rowsSorted(Long rowsSorted) {
                this.rowsSorted = rowsSorted;
                return this;
            }

            /**
             * <p>The execution duration percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1384</p>
             */
            public Builder rtRate(Double rtRate) {
                this.rtRate = rtRate;
                return this;
            }

            /**
             * <p>Indicates whether read/write splitting was enabled. Valid values:</p>
             * <ul>
             * <li><strong>0:</strong> Read/write splitting was disabled.</li>
             * <li><strong>1:</strong> Read/write splitting was enabled.</li>
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
             * <p>The read/write splitting parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder rwlockSpinRounds(Integer rwlockSpinRounds) {
                this.rwlockSpinRounds = rwlockSpinRounds;
                return this;
            }

            /**
             * <p>Indices whether multi-index scanning was enabled. Valid values:</p>
             * <ul>
             * <li><strong>0:</strong> Multi-index scanning was disabled.</li>
             * <li><strong>1:</strong> Multi-index scanning was enabled.</li>
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
             * <p>The average number of joins that performed table scans without using indexes.</p>
             * <blockquote>
             * <p>If the value of this parameter is not 0, check the table indexes.</p>
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
             * <p>The average number of joins that selected a range.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectFullRangeJoinAvg(Double selectFullRangeJoinAvg) {
                this.selectFullRangeJoinAvg = selectFullRangeJoinAvg;
                return this;
            }

            /**
             * <p>The average selected range.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectRangeAvg(Double selectRangeAvg) {
                this.selectRangeAvg = selectRangeAvg;
                return this;
            }

            /**
             * <p>The average number of scanned rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder selectScanAvg(Double selectScanAvg) {
                this.selectScanAvg = selectScanAvg;
                return this;
            }

            /**
             * <p>The semi-synchronous replication latency. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0.12</p>
             */
            public Builder semisyncDelayTime(Double semisyncDelayTime) {
                this.semisyncDelayTime = semisyncDelayTime;
                return this;
            }

            /**
             * <p>The amount of time consumed for locking the server. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serverLockTime(Double serverLockTime) {
                this.serverLockTime = serverLockTime;
                return this;
            }

            /**
             * <p>The number of merges that the sorting algorithm must perform.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortMergePasses(Long sortMergePasses) {
                this.sortMergePasses = sortMergePasses;
                return this;
            }

            /**
             * <p>The average number of sorts that were performed by using a range.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortRangeAvg(Double sortRangeAvg) {
                this.sortRangeAvg = sortRangeAvg;
                return this;
            }

            /**
             * <p>The average number of sorted rows.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortRowsAvg(Double sortRowsAvg) {
                this.sortRowsAvg = sortRowsAvg;
                return this;
            }

            /**
             * <p>The average number of sorts that were performed during table scans.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sortScanAvg(Double sortScanAvg) {
                this.sortScanAvg = sortScanAvg;
                return this;
            }

            /**
             * <p>The SQL template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The type of the SQL statement. Valid values:</p>
             * <ul>
             * <li><strong>SELECT</strong></li>
             * <li><strong>UPDATE</strong></li>
             * <li><strong>DELETE</strong></li>
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
             * <p>The names of tables in the database.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder timerWaitAvg(Double timerWaitAvg) {
                this.timerWaitAvg = timerWaitAvg;
                return this;
            }

            /**
             * <p>The data timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1643040000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The number of on-disk temporary tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tmpDiskTables(Long tmpDiskTables) {
                this.tmpDiskTables = tmpDiskTables;
                return this;
            }

            /**
             * <p>The average number of on-disk temporary tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tmpDiskTablesAvg(Double tmpDiskTablesAvg) {
                this.tmpDiskTablesAvg = tmpDiskTablesAvg;
                return this;
            }

            /**
             * <p>The number of temporary tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tmpTables(Long tmpTables) {
                this.tmpTables = tmpTables;
                return this;
            }

            /**
             * <p>The average number of temporary tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder tmpTablesAvg(Double tmpTablesAvg) {
                this.tmpTablesAvg = tmpTablesAvg;
                return this;
            }

            /**
             * <p>The execution latency. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>60913.256</p>
             */
            public Builder totalLatency(Double totalLatency) {
                this.totalLatency = totalLatency;
                return this;
            }

            /**
             * <p>The amount of time consumed for locking the storage transaction. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder transactionLockTime(Double transactionLockTime) {
                this.transactionLockTime = transactionLockTime;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>196278346919****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The number of warnings.</p>
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
             * <p>The reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder extra(Object extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The details of the data returned.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
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
