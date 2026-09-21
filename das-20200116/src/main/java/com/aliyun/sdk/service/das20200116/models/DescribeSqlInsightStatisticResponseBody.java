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
 * {@link DescribeSqlInsightStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlInsightStatisticResponseBody</p>
 */
public class DescribeSqlInsightStatisticResponseBody extends TeaModel {
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

    private DescribeSqlInsightStatisticResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlInsightStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSqlInsightStatisticResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The envelope for asynchronous query results. The first call returns <strong>ResultId</strong> and <strong>State</strong>. Poll with the exact same request parameters until <strong>State</strong> is <strong>SUCCESS</strong>, then retrieve the statistical details from <strong>List</strong>.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. An error description is returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique ID of the request, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed. Check the <strong>Code</strong> and <strong>Message</strong> fields to determine the cause.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSqlInsightStatisticResponseBody build() {
            return new DescribeSqlInsightStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlInsightStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlInsightStatisticResponseBody</p>
     */
    public static class Trend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Object value;

        private Trend(Builder builder) {
            this.timestamp = builder.timestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trend create() {
            return builder().build();
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long timestamp; 
            private Object value; 

            private Builder() {
            } 

            private Builder(Trend model) {
                this.timestamp = model.timestamp;
                this.value = model.value;
            } 

            /**
             * <p>The timestamp of the trend data point. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1718000000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The number of SQL executions within the time slice.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public Trend build() {
                return new Trend(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSqlInsightStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlInsightStatisticResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectRows")
        private Long affectRows;

        @com.aliyun.core.annotation.NameInMap("AggKey")
        private String aggKey;

        @com.aliyun.core.annotation.NameInMap("AvgAffectRows")
        private Double avgAffectRows;

        @com.aliyun.core.annotation.NameInMap("AvgCpuTime")
        private Double avgCpuTime;

        @com.aliyun.core.annotation.NameInMap("AvgFrows")
        private Double avgFrows;

        @com.aliyun.core.annotation.NameInMap("AvgLockWaitTime")
        private Double avgLockWaitTime;

        @com.aliyun.core.annotation.NameInMap("AvgLogicalRead")
        private Double avgLogicalRead;

        @com.aliyun.core.annotation.NameInMap("AvgPhysicalAsyncRead")
        private Double avgPhysicalAsyncRead;

        @com.aliyun.core.annotation.NameInMap("AvgPhysicalRead")
        private Double avgPhysicalRead;

        @com.aliyun.core.annotation.NameInMap("AvgPhysicalSyncRead")
        private Double avgPhysicalSyncRead;

        @com.aliyun.core.annotation.NameInMap("AvgRows")
        private Double avgRows;

        @com.aliyun.core.annotation.NameInMap("AvgRowsExamined")
        private Double avgRowsExamined;

        @com.aliyun.core.annotation.NameInMap("AvgRowsReturned")
        private Double avgRowsReturned;

        @com.aliyun.core.annotation.NameInMap("AvgRowsUpdated")
        private Double avgRowsUpdated;

        @com.aliyun.core.annotation.NameInMap("AvgRt")
        private Double avgRt;

        @com.aliyun.core.annotation.NameInMap("AvgScanRows")
        private Double avgScanRows;

        @com.aliyun.core.annotation.NameInMap("AvgScnt")
        private Double avgScnt;

        @com.aliyun.core.annotation.NameInMap("AvgWrites")
        private Double avgWrites;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("CountRate")
        private Double countRate;

        @com.aliyun.core.annotation.NameInMap("CpuTime")
        private Long cpuTime;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("Frows")
        private Long frows;

        @com.aliyun.core.annotation.NameInMap("Hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("LockWaitTime")
        private Double lockWaitTime;

        @com.aliyun.core.annotation.NameInMap("LogicalRead")
        private Double logicalRead;

        @com.aliyun.core.annotation.NameInMap("MaxCpuTime")
        private Long maxCpuTime;

        @com.aliyun.core.annotation.NameInMap("MaxLogicalRead")
        private Long maxLogicalRead;

        @com.aliyun.core.annotation.NameInMap("MaxPhysicalRead")
        private Long maxPhysicalRead;

        @com.aliyun.core.annotation.NameInMap("MaxRowsExamined")
        private Long maxRowsExamined;

        @com.aliyun.core.annotation.NameInMap("MaxRowsReturned")
        private Long maxRowsReturned;

        @com.aliyun.core.annotation.NameInMap("MaxRt")
        private Double maxRt;

        @com.aliyun.core.annotation.NameInMap("MaxWrites")
        private Long maxWrites;

        @com.aliyun.core.annotation.NameInMap("MinCpuTime")
        private Long minCpuTime;

        @com.aliyun.core.annotation.NameInMap("MinLogicalRead")
        private Long minLogicalRead;

        @com.aliyun.core.annotation.NameInMap("MinPhysicalRead")
        private Long minPhysicalRead;

        @com.aliyun.core.annotation.NameInMap("MinRowsReturned")
        private Long minRowsReturned;

        @com.aliyun.core.annotation.NameInMap("MinRt")
        private Double minRt;

        @com.aliyun.core.annotation.NameInMap("MinWrites")
        private Long minWrites;

        @com.aliyun.core.annotation.NameInMap("OriginAlias")
        private String originAlias;

        @com.aliyun.core.annotation.NameInMap("OriginHost")
        private String originHost;

        @com.aliyun.core.annotation.NameInMap("Params")
        private String params;

        @com.aliyun.core.annotation.NameInMap("PhysicalAsyncRead")
        private Double physicalAsyncRead;

        @com.aliyun.core.annotation.NameInMap("PhysicalRead")
        private Long physicalRead;

        @com.aliyun.core.annotation.NameInMap("PhysicalSyncRead")
        private Double physicalSyncRead;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Psql")
        private String psql;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private Long rows;

        @com.aliyun.core.annotation.NameInMap("RowsExamined")
        private Long rowsExamined;

        @com.aliyun.core.annotation.NameInMap("RowsReturned")
        private Long rowsReturned;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private Double rt;

        @com.aliyun.core.annotation.NameInMap("RtGreaterThanOneSecondCount")
        private Long rtGreaterThanOneSecondCount;

        @com.aliyun.core.annotation.NameInMap("RtRate")
        private Double rtRate;

        @com.aliyun.core.annotation.NameInMap("SampleType")
        private String sampleType;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("Scnt")
        private Long scnt;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private String sqlId;

        @com.aliyun.core.annotation.NameInMap("SqlNew")
        private String sqlNew;

        @com.aliyun.core.annotation.NameInMap("SqlTextFeature")
        private String sqlTextFeature;

        @com.aliyun.core.annotation.NameInMap("SqlType")
        private String sqlType;

        @com.aliyun.core.annotation.NameInMap("SumRowsUpdated")
        private Double sumRowsUpdated;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<String> tables;

        @com.aliyun.core.annotation.NameInMap("ThreadId")
        private String threadId;

        @com.aliyun.core.annotation.NameInMap("TimeRate")
        private Double timeRate;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("TotalAffectRows")
        private Long totalAffectRows;

        @com.aliyun.core.annotation.NameInMap("TotalRt")
        private Long totalRt;

        @com.aliyun.core.annotation.NameInMap("TotalScanRows")
        private Long totalScanRows;

        @com.aliyun.core.annotation.NameInMap("Trend")
        private java.util.List<Trend> trend;

        @com.aliyun.core.annotation.NameInMap("UpdateRows")
        private Long updateRows;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Writes")
        private Long writes;

        private List(Builder builder) {
            this.affectRows = builder.affectRows;
            this.aggKey = builder.aggKey;
            this.avgAffectRows = builder.avgAffectRows;
            this.avgCpuTime = builder.avgCpuTime;
            this.avgFrows = builder.avgFrows;
            this.avgLockWaitTime = builder.avgLockWaitTime;
            this.avgLogicalRead = builder.avgLogicalRead;
            this.avgPhysicalAsyncRead = builder.avgPhysicalAsyncRead;
            this.avgPhysicalRead = builder.avgPhysicalRead;
            this.avgPhysicalSyncRead = builder.avgPhysicalSyncRead;
            this.avgRows = builder.avgRows;
            this.avgRowsExamined = builder.avgRowsExamined;
            this.avgRowsReturned = builder.avgRowsReturned;
            this.avgRowsUpdated = builder.avgRowsUpdated;
            this.avgRt = builder.avgRt;
            this.avgScanRows = builder.avgScanRows;
            this.avgScnt = builder.avgScnt;
            this.avgWrites = builder.avgWrites;
            this.count = builder.count;
            this.countRate = builder.countRate;
            this.cpuTime = builder.cpuTime;
            this.database = builder.database;
            this.errorCode = builder.errorCode;
            this.errorCount = builder.errorCount;
            this.firstTime = builder.firstTime;
            this.frows = builder.frows;
            this.hash = builder.hash;
            this.ip = builder.ip;
            this.lockWaitTime = builder.lockWaitTime;
            this.logicalRead = builder.logicalRead;
            this.maxCpuTime = builder.maxCpuTime;
            this.maxLogicalRead = builder.maxLogicalRead;
            this.maxPhysicalRead = builder.maxPhysicalRead;
            this.maxRowsExamined = builder.maxRowsExamined;
            this.maxRowsReturned = builder.maxRowsReturned;
            this.maxRt = builder.maxRt;
            this.maxWrites = builder.maxWrites;
            this.minCpuTime = builder.minCpuTime;
            this.minLogicalRead = builder.minLogicalRead;
            this.minPhysicalRead = builder.minPhysicalRead;
            this.minRowsReturned = builder.minRowsReturned;
            this.minRt = builder.minRt;
            this.minWrites = builder.minWrites;
            this.originAlias = builder.originAlias;
            this.originHost = builder.originHost;
            this.params = builder.params;
            this.physicalAsyncRead = builder.physicalAsyncRead;
            this.physicalRead = builder.physicalRead;
            this.physicalSyncRead = builder.physicalSyncRead;
            this.port = builder.port;
            this.psql = builder.psql;
            this.rows = builder.rows;
            this.rowsExamined = builder.rowsExamined;
            this.rowsReturned = builder.rowsReturned;
            this.rt = builder.rt;
            this.rtGreaterThanOneSecondCount = builder.rtGreaterThanOneSecondCount;
            this.rtRate = builder.rtRate;
            this.sampleType = builder.sampleType;
            this.scanRows = builder.scanRows;
            this.scnt = builder.scnt;
            this.sql = builder.sql;
            this.sqlId = builder.sqlId;
            this.sqlNew = builder.sqlNew;
            this.sqlTextFeature = builder.sqlTextFeature;
            this.sqlType = builder.sqlType;
            this.sumRowsUpdated = builder.sumRowsUpdated;
            this.tables = builder.tables;
            this.threadId = builder.threadId;
            this.timeRate = builder.timeRate;
            this.timestamp = builder.timestamp;
            this.totalAffectRows = builder.totalAffectRows;
            this.totalRt = builder.totalRt;
            this.totalScanRows = builder.totalScanRows;
            this.trend = builder.trend;
            this.updateRows = builder.updateRows;
            this.user = builder.user;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
            this.writes = builder.writes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return affectRows
         */
        public Long getAffectRows() {
            return this.affectRows;
        }

        /**
         * @return aggKey
         */
        public String getAggKey() {
            return this.aggKey;
        }

        /**
         * @return avgAffectRows
         */
        public Double getAvgAffectRows() {
            return this.avgAffectRows;
        }

        /**
         * @return avgCpuTime
         */
        public Double getAvgCpuTime() {
            return this.avgCpuTime;
        }

        /**
         * @return avgFrows
         */
        public Double getAvgFrows() {
            return this.avgFrows;
        }

        /**
         * @return avgLockWaitTime
         */
        public Double getAvgLockWaitTime() {
            return this.avgLockWaitTime;
        }

        /**
         * @return avgLogicalRead
         */
        public Double getAvgLogicalRead() {
            return this.avgLogicalRead;
        }

        /**
         * @return avgPhysicalAsyncRead
         */
        public Double getAvgPhysicalAsyncRead() {
            return this.avgPhysicalAsyncRead;
        }

        /**
         * @return avgPhysicalRead
         */
        public Double getAvgPhysicalRead() {
            return this.avgPhysicalRead;
        }

        /**
         * @return avgPhysicalSyncRead
         */
        public Double getAvgPhysicalSyncRead() {
            return this.avgPhysicalSyncRead;
        }

        /**
         * @return avgRows
         */
        public Double getAvgRows() {
            return this.avgRows;
        }

        /**
         * @return avgRowsExamined
         */
        public Double getAvgRowsExamined() {
            return this.avgRowsExamined;
        }

        /**
         * @return avgRowsReturned
         */
        public Double getAvgRowsReturned() {
            return this.avgRowsReturned;
        }

        /**
         * @return avgRowsUpdated
         */
        public Double getAvgRowsUpdated() {
            return this.avgRowsUpdated;
        }

        /**
         * @return avgRt
         */
        public Double getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgScanRows
         */
        public Double getAvgScanRows() {
            return this.avgScanRows;
        }

        /**
         * @return avgScnt
         */
        public Double getAvgScnt() {
            return this.avgScnt;
        }

        /**
         * @return avgWrites
         */
        public Double getAvgWrites() {
            return this.avgWrites;
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
         * @return cpuTime
         */
        public Long getCpuTime() {
            return this.cpuTime;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return frows
         */
        public Long getFrows() {
            return this.frows;
        }

        /**
         * @return hash
         */
        public String getHash() {
            return this.hash;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return lockWaitTime
         */
        public Double getLockWaitTime() {
            return this.lockWaitTime;
        }

        /**
         * @return logicalRead
         */
        public Double getLogicalRead() {
            return this.logicalRead;
        }

        /**
         * @return maxCpuTime
         */
        public Long getMaxCpuTime() {
            return this.maxCpuTime;
        }

        /**
         * @return maxLogicalRead
         */
        public Long getMaxLogicalRead() {
            return this.maxLogicalRead;
        }

        /**
         * @return maxPhysicalRead
         */
        public Long getMaxPhysicalRead() {
            return this.maxPhysicalRead;
        }

        /**
         * @return maxRowsExamined
         */
        public Long getMaxRowsExamined() {
            return this.maxRowsExamined;
        }

        /**
         * @return maxRowsReturned
         */
        public Long getMaxRowsReturned() {
            return this.maxRowsReturned;
        }

        /**
         * @return maxRt
         */
        public Double getMaxRt() {
            return this.maxRt;
        }

        /**
         * @return maxWrites
         */
        public Long getMaxWrites() {
            return this.maxWrites;
        }

        /**
         * @return minCpuTime
         */
        public Long getMinCpuTime() {
            return this.minCpuTime;
        }

        /**
         * @return minLogicalRead
         */
        public Long getMinLogicalRead() {
            return this.minLogicalRead;
        }

        /**
         * @return minPhysicalRead
         */
        public Long getMinPhysicalRead() {
            return this.minPhysicalRead;
        }

        /**
         * @return minRowsReturned
         */
        public Long getMinRowsReturned() {
            return this.minRowsReturned;
        }

        /**
         * @return minRt
         */
        public Double getMinRt() {
            return this.minRt;
        }

        /**
         * @return minWrites
         */
        public Long getMinWrites() {
            return this.minWrites;
        }

        /**
         * @return originAlias
         */
        public String getOriginAlias() {
            return this.originAlias;
        }

        /**
         * @return originHost
         */
        public String getOriginHost() {
            return this.originHost;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return physicalAsyncRead
         */
        public Double getPhysicalAsyncRead() {
            return this.physicalAsyncRead;
        }

        /**
         * @return physicalRead
         */
        public Long getPhysicalRead() {
            return this.physicalRead;
        }

        /**
         * @return physicalSyncRead
         */
        public Double getPhysicalSyncRead() {
            return this.physicalSyncRead;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return psql
         */
        public String getPsql() {
            return this.psql;
        }

        /**
         * @return rows
         */
        public Long getRows() {
            return this.rows;
        }

        /**
         * @return rowsExamined
         */
        public Long getRowsExamined() {
            return this.rowsExamined;
        }

        /**
         * @return rowsReturned
         */
        public Long getRowsReturned() {
            return this.rowsReturned;
        }

        /**
         * @return rt
         */
        public Double getRt() {
            return this.rt;
        }

        /**
         * @return rtGreaterThanOneSecondCount
         */
        public Long getRtGreaterThanOneSecondCount() {
            return this.rtGreaterThanOneSecondCount;
        }

        /**
         * @return rtRate
         */
        public Double getRtRate() {
            return this.rtRate;
        }

        /**
         * @return sampleType
         */
        public String getSampleType() {
            return this.sampleType;
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
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return sqlId
         */
        public String getSqlId() {
            return this.sqlId;
        }

        /**
         * @return sqlNew
         */
        public String getSqlNew() {
            return this.sqlNew;
        }

        /**
         * @return sqlTextFeature
         */
        public String getSqlTextFeature() {
            return this.sqlTextFeature;
        }

        /**
         * @return sqlType
         */
        public String getSqlType() {
            return this.sqlType;
        }

        /**
         * @return sumRowsUpdated
         */
        public Double getSumRowsUpdated() {
            return this.sumRowsUpdated;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        /**
         * @return timeRate
         */
        public Double getTimeRate() {
            return this.timeRate;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return totalAffectRows
         */
        public Long getTotalAffectRows() {
            return this.totalAffectRows;
        }

        /**
         * @return totalRt
         */
        public Long getTotalRt() {
            return this.totalRt;
        }

        /**
         * @return totalScanRows
         */
        public Long getTotalScanRows() {
            return this.totalScanRows;
        }

        /**
         * @return trend
         */
        public java.util.List<Trend> getTrend() {
            return this.trend;
        }

        /**
         * @return updateRows
         */
        public Long getUpdateRows() {
            return this.updateRows;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return writes
         */
        public Long getWrites() {
            return this.writes;
        }

        public static final class Builder {
            private Long affectRows; 
            private String aggKey; 
            private Double avgAffectRows; 
            private Double avgCpuTime; 
            private Double avgFrows; 
            private Double avgLockWaitTime; 
            private Double avgLogicalRead; 
            private Double avgPhysicalAsyncRead; 
            private Double avgPhysicalRead; 
            private Double avgPhysicalSyncRead; 
            private Double avgRows; 
            private Double avgRowsExamined; 
            private Double avgRowsReturned; 
            private Double avgRowsUpdated; 
            private Double avgRt; 
            private Double avgScanRows; 
            private Double avgScnt; 
            private Double avgWrites; 
            private Long count; 
            private Double countRate; 
            private Long cpuTime; 
            private String database; 
            private String errorCode; 
            private Long errorCount; 
            private Long firstTime; 
            private Long frows; 
            private String hash; 
            private String ip; 
            private Double lockWaitTime; 
            private Double logicalRead; 
            private Long maxCpuTime; 
            private Long maxLogicalRead; 
            private Long maxPhysicalRead; 
            private Long maxRowsExamined; 
            private Long maxRowsReturned; 
            private Double maxRt; 
            private Long maxWrites; 
            private Long minCpuTime; 
            private Long minLogicalRead; 
            private Long minPhysicalRead; 
            private Long minRowsReturned; 
            private Double minRt; 
            private Long minWrites; 
            private String originAlias; 
            private String originHost; 
            private String params; 
            private Double physicalAsyncRead; 
            private Long physicalRead; 
            private Double physicalSyncRead; 
            private Integer port; 
            private String psql; 
            private Long rows; 
            private Long rowsExamined; 
            private Long rowsReturned; 
            private Double rt; 
            private Long rtGreaterThanOneSecondCount; 
            private Double rtRate; 
            private String sampleType; 
            private Long scanRows; 
            private Long scnt; 
            private String sql; 
            private String sqlId; 
            private String sqlNew; 
            private String sqlTextFeature; 
            private String sqlType; 
            private Double sumRowsUpdated; 
            private java.util.List<String> tables; 
            private String threadId; 
            private Double timeRate; 
            private Long timestamp; 
            private Long totalAffectRows; 
            private Long totalRt; 
            private Long totalScanRows; 
            private java.util.List<Trend> trend; 
            private Long updateRows; 
            private String user; 
            private Integer version; 
            private String vpcId; 
            private Long writes; 

            private Builder() {
            } 

            private Builder(List model) {
                this.affectRows = model.affectRows;
                this.aggKey = model.aggKey;
                this.avgAffectRows = model.avgAffectRows;
                this.avgCpuTime = model.avgCpuTime;
                this.avgFrows = model.avgFrows;
                this.avgLockWaitTime = model.avgLockWaitTime;
                this.avgLogicalRead = model.avgLogicalRead;
                this.avgPhysicalAsyncRead = model.avgPhysicalAsyncRead;
                this.avgPhysicalRead = model.avgPhysicalRead;
                this.avgPhysicalSyncRead = model.avgPhysicalSyncRead;
                this.avgRows = model.avgRows;
                this.avgRowsExamined = model.avgRowsExamined;
                this.avgRowsReturned = model.avgRowsReturned;
                this.avgRowsUpdated = model.avgRowsUpdated;
                this.avgRt = model.avgRt;
                this.avgScanRows = model.avgScanRows;
                this.avgScnt = model.avgScnt;
                this.avgWrites = model.avgWrites;
                this.count = model.count;
                this.countRate = model.countRate;
                this.cpuTime = model.cpuTime;
                this.database = model.database;
                this.errorCode = model.errorCode;
                this.errorCount = model.errorCount;
                this.firstTime = model.firstTime;
                this.frows = model.frows;
                this.hash = model.hash;
                this.ip = model.ip;
                this.lockWaitTime = model.lockWaitTime;
                this.logicalRead = model.logicalRead;
                this.maxCpuTime = model.maxCpuTime;
                this.maxLogicalRead = model.maxLogicalRead;
                this.maxPhysicalRead = model.maxPhysicalRead;
                this.maxRowsExamined = model.maxRowsExamined;
                this.maxRowsReturned = model.maxRowsReturned;
                this.maxRt = model.maxRt;
                this.maxWrites = model.maxWrites;
                this.minCpuTime = model.minCpuTime;
                this.minLogicalRead = model.minLogicalRead;
                this.minPhysicalRead = model.minPhysicalRead;
                this.minRowsReturned = model.minRowsReturned;
                this.minRt = model.minRt;
                this.minWrites = model.minWrites;
                this.originAlias = model.originAlias;
                this.originHost = model.originHost;
                this.params = model.params;
                this.physicalAsyncRead = model.physicalAsyncRead;
                this.physicalRead = model.physicalRead;
                this.physicalSyncRead = model.physicalSyncRead;
                this.port = model.port;
                this.psql = model.psql;
                this.rows = model.rows;
                this.rowsExamined = model.rowsExamined;
                this.rowsReturned = model.rowsReturned;
                this.rt = model.rt;
                this.rtGreaterThanOneSecondCount = model.rtGreaterThanOneSecondCount;
                this.rtRate = model.rtRate;
                this.sampleType = model.sampleType;
                this.scanRows = model.scanRows;
                this.scnt = model.scnt;
                this.sql = model.sql;
                this.sqlId = model.sqlId;
                this.sqlNew = model.sqlNew;
                this.sqlTextFeature = model.sqlTextFeature;
                this.sqlType = model.sqlType;
                this.sumRowsUpdated = model.sumRowsUpdated;
                this.tables = model.tables;
                this.threadId = model.threadId;
                this.timeRate = model.timeRate;
                this.timestamp = model.timestamp;
                this.totalAffectRows = model.totalAffectRows;
                this.totalRt = model.totalRt;
                this.totalScanRows = model.totalScanRows;
                this.trend = model.trend;
                this.updateRows = model.updateRows;
                this.user = model.user;
                this.version = model.version;
                this.vpcId = model.vpcId;
                this.writes = model.writes;
            } 

            /**
             * <p>The number of affected rows for a single SQL statement. For <strong>SELECT</strong> statements, this indicates the number of scanned rows. For <strong>DML</strong> statements, this indicates the number of affected rows.</p>
             * <blockquote>
             * <p>Returned only for Lindorm instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder affectRows(Long affectRows) {
                this.affectRows = affectRows;
                return this;
            }

            /**
             * <p>The value of the aggregation dimension for this statistical entry, which varies based on the <strong>Type</strong> request parameter. Valid values:</p>
             * <ul>
             * <li>When aggregated by SQL template: the SQL template ID, which is the same as <strong>SqlId</strong>.</li>
             * <li>When <strong>Type</strong> is set to <strong>FullRequestOrigin</strong>: the access source address.</li>
             * <li>When <strong>Type</strong> is set to <strong>FullRequestUser</strong>: the database username.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>651b56fe9418d48edb8fdf0980ec****</p>
             */
            public Builder aggKey(String aggKey) {
                this.aggKey = aggKey;
                return this;
            }

            /**
             * <p>The average number of affected rows.</p>
             * <blockquote>
             * <p>Returned only for Lindorm instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30.2</p>
             */
            public Builder avgAffectRows(Double avgAffectRows) {
                this.avgAffectRows = avgAffectRows;
                return this;
            }

            /**
             * <p>The average CPU time consumed by SQL execution, in microseconds.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12.5</p>
             */
            public Builder avgCpuTime(Double avgCpuTime) {
                this.avgCpuTime = avgCpuTime;
                return this;
            }

            /**
             * <p>The average number of rows fetched by the PolarDB-X compute node from data nodes.</p>
             * <blockquote>
             * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder avgFrows(Double avgFrows) {
                this.avgFrows = avgFrows;
                return this;
            }

            /**
             * <p>The average lock wait time per execution, in milliseconds.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.00009589874265269765</p>
             */
            public Builder avgLockWaitTime(Double avgLockWaitTime) {
                this.avgLockWaitTime = avgLockWaitTime;
                return this;
            }

            /**
             * <p>The average number of logical reads per execution.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>654.4470327860251</p>
             */
            public Builder avgLogicalRead(Double avgLogicalRead) {
                this.avgLogicalRead = avgLogicalRead;
                return this;
            }

            /**
             * <p>The average number of physical asynchronous reads per execution.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgPhysicalAsyncRead(Double avgPhysicalAsyncRead) {
                this.avgPhysicalAsyncRead = avgPhysicalAsyncRead;
                return this;
            }

            /**
             * <p>The average number of physical reads.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>654.4</p>
             */
            public Builder avgPhysicalRead(Double avgPhysicalRead) {
                this.avgPhysicalRead = avgPhysicalRead;
                return this;
            }

            /**
             * <p>The average number of physical synchronous reads per execution.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder avgPhysicalSyncRead(Double avgPhysicalSyncRead) {
                this.avgPhysicalSyncRead = avgPhysicalSyncRead;
                return this;
            }

            /**
             * <p>The average number of updated rows and returned rows for the PolarDB-X compute node.</p>
             * <blockquote>
             * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder avgRows(Double avgRows) {
                this.avgRows = avgRows;
                return this;
            }

            /**
             * <p>The average number of rows scanned per execution.</p>
             * 
             * <strong>example:</strong>
             * <p>53421.0</p>
             */
            public Builder avgRowsExamined(Double avgRowsExamined) {
                this.avgRowsExamined = avgRowsExamined;
                return this;
            }

            /**
             * <p>The average number of rows returned per execution.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder avgRowsReturned(Double avgRowsReturned) {
                this.avgRowsReturned = avgRowsReturned;
                return this;
            }

            /**
             * <p>The average number of rows updated per execution.</p>
             * 
             * <strong>example:</strong>
             * <p>30.2</p>
             */
            public Builder avgRowsUpdated(Double avgRowsUpdated) {
                this.avgRowsUpdated = avgRowsUpdated;
                return this;
            }

            /**
             * <p>The average execution time per execution, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2.499</p>
             */
            public Builder avgRt(Double avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * <p>The average number of scanned rows.</p>
             * <blockquote>
             * <p>This field is not returned by this operation. Use <strong>AvgRowsExamined</strong> for the average number of scanned rows.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>53421.0</p>
             */
            public Builder avgScanRows(Double avgScanRows) {
                this.avgScanRows = avgScanRows;
                return this;
            }

            /**
             * <p>The average number of requests sent by the PolarDB-X compute node to data nodes.</p>
             * <blockquote>
             * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder avgScnt(Double avgScnt) {
                this.avgScnt = avgScnt;
                return this;
            }

            /**
             * <p>The average number of logical writes.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder avgWrites(Double avgWrites) {
                this.avgWrites = avgWrites;
                return this;
            }

            /**
             * <p>The total number of executions of the SQL template within the statistical interval.</p>
             * 
             * <strong>example:</strong>
             * <p>127</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The ratio of the number of executions of this statistical entry to the total number of executions of all SQL statements on the instance. The value ranges from 0 to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0586</p>
             */
            public Builder countRate(Double countRate) {
                this.countRate = countRate;
                return this;
            }

            /**
             * <p>The total CPU time consumed by SQL execution, in microseconds.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder cpuTime(Long cpuTime) {
                this.cpuTime = cpuTime;
                return this;
            }

            /**
             * <p>The name of the database where the SQL statement is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>dbtest01</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The error code returned by SQL execution.</p>
             * <blockquote>
             * <p>The error code is a detail of a single SQL statement. This operation returns template-level aggregated statistics and does not return this field. Use <strong>ErrorCount</strong> for error information.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1146</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The number of execution errors for the SQL template within the statistical interval.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * <p>The time when the SQL template first appeared.</p>
             * <blockquote>
             * <p>This field is not returned by this operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1659308149000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The total number of rows fetched by the PolarDB-X compute node from data nodes.</p>
             * <blockquote>
             * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder frows(Long frows) {
                this.frows = frows;
                return this;
            }

            /**
             * <p>The hash value of the SQL template, returned together with the SQL template.</p>
             * <blockquote>
             * <p>This value is generated by the PolarDB-X compute node kernel. The value is empty for non-PolarDB-X compute node instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2e8147b5ca2dfc640dfd5e43d96a****</p>
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * <p>The endpoint of the instance to which the statistical data belongs.</p>
             * <blockquote>
             * <p>Whether this field is returned depends on the aggregated storage link of the instance. The value is null for some links.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1jdv45i7l6****.mysql.rds.aliyuncs.com</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The total lock wait time, in milliseconds.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1089.4177720290281</p>
             */
            public Builder lockWaitTime(Double lockWaitTime) {
                this.lockWaitTime = lockWaitTime;
                return this;
            }

            /**
             * <p>The total number of logical reads.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>165848</p>
             */
            public Builder logicalRead(Double logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * <p>The maximum CPU time in a single execution, in microseconds.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder maxCpuTime(Long maxCpuTime) {
                this.maxCpuTime = maxCpuTime;
                return this;
            }

            /**
             * <p>The maximum number of logical reads in a single execution.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3186</p>
             */
            public Builder maxLogicalRead(Long maxLogicalRead) {
                this.maxLogicalRead = maxLogicalRead;
                return this;
            }

            /**
             * <p>The maximum number of physical reads in a single execution.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3186</p>
             */
            public Builder maxPhysicalRead(Long maxPhysicalRead) {
                this.maxPhysicalRead = maxPhysicalRead;
                return this;
            }

            /**
             * <p>The maximum number of rows scanned in a single execution.</p>
             * <blockquote>
             * <p>This field is not returned by this operation. Use <strong>RowsExamined</strong> and <strong>AvgRowsExamined</strong> for scanned row counts.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>318613</p>
             */
            public Builder maxRowsExamined(Long maxRowsExamined) {
                this.maxRowsExamined = maxRowsExamined;
                return this;
            }

            /**
             * <p>The maximum number of rows returned in a single execution.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxRowsReturned(Long maxRowsReturned) {
                this.maxRowsReturned = maxRowsReturned;
                return this;
            }

            /**
             * <p>The maximum execution time in a single execution, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12.499</p>
             */
            public Builder maxRt(Double maxRt) {
                this.maxRt = maxRt;
                return this;
            }

            /**
             * <p>The maximum number of logical writes in a single execution.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxWrites(Long maxWrites) {
                this.maxWrites = maxWrites;
                return this;
            }

            /**
             * <p>The minimum CPU time in a single execution, in microseconds.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minCpuTime(Long minCpuTime) {
                this.minCpuTime = minCpuTime;
                return this;
            }

            /**
             * <p>The minimum number of logical reads in a single execution.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder minLogicalRead(Long minLogicalRead) {
                this.minLogicalRead = minLogicalRead;
                return this;
            }

            /**
             * <p>The minimum number of physical reads in a single execution.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder minPhysicalRead(Long minPhysicalRead) {
                this.minPhysicalRead = minPhysicalRead;
                return this;
            }

            /**
             * <p>The minimum number of rows returned in a single execution.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minRowsReturned(Long minRowsReturned) {
                this.minRowsReturned = minRowsReturned;
                return this;
            }

            /**
             * <p>The minimum execution time in a single execution, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0.409789</p>
             */
            public Builder minRt(Double minRt) {
                this.minRt = minRt;
                return this;
            }

            /**
             * <p>The minimum number of logical writes in a single execution.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder minWrites(Long minWrites) {
                this.minWrites = minWrites;
                return this;
            }

            /**
             * <p>The display alias configured for the access source address.</p>
             * <blockquote>
             * <p>Returned only when aggregated by access source (when <strong>Type</strong> is set to <strong>FullRequestOrigin</strong>). The value is null in other scenarios.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>order-1</p>
             */
            public Builder originAlias(String originAlias) {
                this.originAlias = originAlias;
                return this;
            }

            /**
             * <p>The source address of the client that initiated the SQL statement.</p>
             * <blockquote>
             * <p>When <strong>Type</strong> is set to <strong>FullRequestOrigin</strong>, this field serves as the aggregation dimension for the statistical entry.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>172.26.XX.XXX</p>
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * <p>The parameter content of the SQL sample.</p>
             * <blockquote>
             * <p>This operation returns template-level aggregated statistics and does not return this field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>[1, &quot;das&quot;]</p>
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The total number of physical asynchronous reads.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalAsyncRead(Double physicalAsyncRead) {
                this.physicalAsyncRead = physicalAsyncRead;
                return this;
            }

            /**
             * <p>The total number of physical reads.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other database engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>165848</p>
             */
            public Builder physicalRead(Long physicalRead) {
                this.physicalRead = physicalRead;
                return this;
            }

            /**
             * <p>The total number of physical synchronous reads.</p>
             * <blockquote>
             * <p>Data is available only when <strong>Version</strong> is set to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder physicalSyncRead(Double physicalSyncRead) {
                this.physicalSyncRead = physicalSyncRead;
                return this;
            }

            /**
             * <p>The port of the instance to which the statistical data belongs.</p>
             * <blockquote>
             * <p>Whether this field is returned depends on the aggregated storage link of the instance. The value is null for some links.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The parameterized SQL template text, which is the statement with constants in the SQL replaced by placeholders.</p>
             * 
             * <strong>example:</strong>
             * <p>select * from t_order where id = ?</p>
             */
            public Builder psql(String psql) {
                this.psql = psql;
                return this;
            }

            /**
             * <p>The total number of updated rows and returned rows for the PolarDB-X compute node.</p>
             * <blockquote>
             * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rows(Long rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The total number of rows examined by the SQL template within the statistical interval.</p>
             * 
             * <strong>example:</strong>
             * <p>2048576</p>
             */
            public Builder rowsExamined(Long rowsExamined) {
                this.rowsExamined = rowsExamined;
                return this;
            }

            /**
             * <p>The total number of rows returned by the SQL template within the statistical interval.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder rowsReturned(Long rowsReturned) {
                this.rowsReturned = rowsReturned;
                return this;
            }

            /**
             * <p>The total execution duration of the SQL template within the statistical interval. Unit: milliseconds.</p>
             * <blockquote>
             * <p>For PolarDB-X compute nodes (where <strong>Role</strong> is <strong>polarx_cn</strong>) with kernel versions earlier than 5.4.13, this value is converted from microseconds to milliseconds.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.409789</p>
             */
            public Builder rt(Double rt) {
                this.rt = rt;
                return this;
            }

            /**
             * <p>The number of times the execution duration exceeds 1 second.</p>
             * <blockquote>
             * <p>Whether this field is returned depends on the aggregation storage link of the instance. The value is null for certain links.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder rtGreaterThanOneSecondCount(Long rtGreaterThanOneSecondCount) {
                this.rtGreaterThanOneSecondCount = rtGreaterThanOneSecondCount;
                return this;
            }

            /**
             * <p>The ratio of the total execution duration of this entry to the total execution duration of all SQL statements on the instance. Valid values: 0 to 1.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1384</p>
             */
            public Builder rtRate(Double rtRate) {
                this.rtRate = rtRate;
                return this;
            }

            /**
             * <p>The type identifier of the sample data.</p>
             * <blockquote>
             * <p>This operation returns aggregated statistics and does not return this field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sql</p>
             */
            public Builder sampleType(String sampleType) {
                this.sampleType = sampleType;
                return this;
            }

            /**
             * <p>The number of rows scanned by a single SQL statement.</p>
             * <blockquote>
             * <p>This operation returns template-level aggregated statistics and does not return this field. Use the aggregated metrics <strong>RowsExamined</strong> and <strong>AvgRowsExamined</strong> instead.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>29</p>
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * <p>The total number of requests sent from the PolarDB-X compute node to data nodes.</p>
             * <blockquote>
             * <p>This metric is exclusive to PolarDB-X compute nodes. The value is null or 0 for other engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scnt(Long scnt) {
                this.scnt = scnt;
                return this;
            }

            /**
             * <p>The original SQL text.</p>
             * <blockquote>
             * <p>The statistical results return the SQL template (<strong>Psql</strong>) and do not return this field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>select * from t_order where id = 1</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The SQL template ID that uniquely identifies a type of parameterized SQL statement. Multiple executions under the same template are aggregated into a single statistical entry. You can use this ID to correlate the same type of SQL across multi-dimensional queries.</p>
             * 
             * <strong>example:</strong>
             * <p>651b56fe9418d48edb8fdf0980ec****</p>
             */
            public Builder sqlId(String sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            /**
             * <p>The SQL text with parameter values uniformly processed, used in sample data scenarios.</p>
             * <blockquote>
             * <p>This operation does not return this field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>select * from t_order where id = ?</p>
             */
            public Builder sqlNew(String sqlNew) {
                this.sqlNew = sqlNew;
                return this;
            }

            /**
             * <p>The SQL text feature value, used in SQL analysis scenarios.</p>
             * <blockquote>
             * <p>This operation does not return this field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>select_from_t_order</p>
             */
            public Builder sqlTextFeature(String sqlTextFeature) {
                this.sqlTextFeature = sqlTextFeature;
                return this;
            }

            /**
             * <p>The SQL type. Valid values:</p>
             * <ul>
             * <li><strong>select</strong></li>
             * <li><strong>insert</strong></li>
             * <li><strong>update</strong></li>
             * <li><strong>delete</strong></li>
             * <li><strong>other</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>select</p>
             */
            public Builder sqlType(String sqlType) {
                this.sqlType = sqlType;
                return this;
            }

            /**
             * <p>The total number of rows updated by the SQL template within the statistical interval.</p>
             * 
             * <strong>example:</strong>
             * <p>3810</p>
             */
            public Builder sumRowsUpdated(Double sumRowsUpdated) {
                this.sumRowsUpdated = sumRowsUpdated;
                return this;
            }

            /**
             * <p>The list of table names involved in the SQL statement.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The database thread ID that executed the SQL statement.</p>
             * <blockquote>
             * <p>The thread ID is a detail of a single SQL statement. This operation returns template-level aggregated statistics and does not return this field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>57472578</p>
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * <p>The execution duration ratio.</p>
             * <blockquote>
             * <p>This operation returns the execution duration ratio through <strong>RtRate</strong> and does not return this field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.1384</p>
             */
            public Builder timeRate(Double timeRate) {
                this.timeRate = timeRate;
                return this;
            }

            /**
             * <p>The data timestamp. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * <blockquote>
             * <p>The statistical results are aggregated at the SQL template level and do not return this field.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1718600000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The total number of affected rows.</p>
             * <blockquote>
             * <p>This field is returned only for Lindorm instances. The value is null for other engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3810</p>
             */
            public Builder totalAffectRows(Long totalAffectRows) {
                this.totalAffectRows = totalAffectRows;
                return this;
            }

            /**
             * <p>The total SQL execution duration.</p>
             * <blockquote>
             * <p>This operation does not return this field. Use <strong>Rt</strong> for the total execution duration.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>310</p>
             */
            public Builder totalRt(Long totalRt) {
                this.totalRt = totalRt;
                return this;
            }

            /**
             * <p>The total number of rows scanned.</p>
             * <blockquote>
             * <p>This operation does not return this field. Use <strong>RowsExamined</strong> for the total number of rows scanned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2048576</p>
             */
            public Builder totalScanRows(Long totalScanRows) {
                this.totalScanRows = totalScanRows;
                return this;
            }

            /**
             * <p>The execution count trend sequence of the SQL template, divided into time slices within the query time window.</p>
             * <blockquote>
             * <p>This field is returned only when the request parameter <strong>DoFillTrend</strong> is set to <strong>true</strong> and the trend padding capability is enabled for the instance. The time slice interval is automatically determined by the query span. Time slices with no data may be padded with zeros.</p>
             * </blockquote>
             */
            public Builder trend(java.util.List<Trend> trend) {
                this.trend = trend;
                return this;
            }

            /**
             * <p>The number of rows updated by a single SQL statement.</p>
             * <blockquote>
             * <p>This operation returns template-level aggregated statistics and does not return this field. Use the aggregated metrics <strong>SumRowsUpdated</strong> and <strong>AvgRowsUpdated</strong> instead.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder updateRows(Long updateRows) {
                this.updateRows = updateRows;
                return this;
            }

            /**
             * <p>The database username that executed the SQL statement.</p>
             * <blockquote>
             * <p>When <strong>Type</strong> is set to <strong>FullRequestUser</strong>, this field serves as the aggregation dimension for the statistical entry.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * <p>The SQL Explorer data collection link version. The value <strong>1</strong> is returned when the instance collects logical read or lock wait data. Otherwise, the value <strong>0</strong> is returned. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: V0 basic collection link.</li>
             * <li><strong>1</strong>: V1 collection link, which additionally collects four metrics (<strong>LockWaitTime</strong>, <strong>LogicalRead</strong>, <strong>PhysicalSyncRead</strong>, and <strong>PhysicalAsyncRead</strong>) on top of V0.</li>
             * </ul>
             * <blockquote>
             * <p>When the value is <strong>0</strong>, the extended metrics contain no data.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The VPC ID of the instance to which the statistical data belongs.</p>
             * <blockquote>
             * <p>Whether this field is returned depends on the aggregation storage link of the instance. The value is null for certain links.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zentqj1sk4qmolci****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The total number of logical writes.</p>
             * <blockquote>
             * <p>This metric is exclusive to SQL Server instances. The value is null for other engines.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder writes(Long writes) {
                this.writes = writes;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSqlInsightStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlInsightStatisticResponseBody</p>
     */
    public static class DataData extends TeaModel {
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

        private DataData(Builder builder) {
            this.extra = builder.extra;
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
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

            private Builder(DataData model) {
                this.extra = model.extra;
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The extended information.</p>
             * <blockquote>
             * <p>This field is not returned by this operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extra(Object extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The list of SQL Explorer statistical results. Each element is a statistical entry under an aggregation dimension.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The current page number, corresponding to the request parameter <strong>PageNo</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page, corresponding to the request parameter <strong>PageSize</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of statistical entries that match the query conditions. You can use this value for pagination calculation.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSqlInsightStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlInsightStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private DataData data;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private Integer errorCode;

        @com.aliyun.core.annotation.NameInMap("IsFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RequestKey")
        private String requestKey;

        @com.aliyun.core.annotation.NameInMap("ResultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.data = builder.data;
            this.errorCode = builder.errorCode;
            this.isFinish = builder.isFinish;
            this.message = builder.message;
            this.requestKey = builder.requestKey;
            this.resultId = builder.resultId;
            this.state = builder.state;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public DataData getData() {
            return this.data;
        }

        /**
         * @return errorCode
         */
        public Integer getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return isFinish
         */
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return requestKey
         */
        public String getRequestKey() {
            return this.requestKey;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private DataData data; 
            private Integer errorCode; 
            private Boolean isFinish; 
            private String message; 
            private String requestKey; 
            private String resultId; 
            private String state; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.errorCode = model.errorCode;
                this.isFinish = model.isFinish;
                this.message = model.message;
                this.requestKey = model.requestKey;
                this.resultId = model.resultId;
                this.state = model.state;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The SQL Explorer statistical query results.</p>
             * <blockquote>
             * <p>Returned only when <strong>State</strong> is <strong>SUCCESS</strong>.</p>
             * </blockquote>
             */
            public Builder data(DataData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The error code of the asynchronous query failure.</p>
             * <blockquote>
             * <p>This field is returned only when the query fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>-10200020</p>
             */
            public Builder errorCode(Integer errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Indicates whether the asynchronous query has completed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: <strong>State</strong> is <strong>SUCCESS</strong> or <strong>FAIL</strong>.</li>
             * <li><strong>false</strong>: <strong>State</strong> is <strong>RUNNING</strong>.</li>
             * </ul>
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * <p>The error description of the asynchronous query failure.</p>
             * <blockquote>
             * <p>This field is returned only when the query fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>startTime must be in 30 days and the interval must be within 7 day</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The hash identifier of the request parameters.</p>
             * <blockquote>
             * <p>This operation does not return this field. Use <strong>ResultId</strong> to identify the asynchronous query.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>507044db6c4eadfa2dab9b084e80****</p>
             */
            public Builder requestKey(String requestKey) {
                this.requestKey = requestKey;
                return this;
            }

            /**
             * <p>The asynchronous query result ID, in the format of an async_ prefix followed by a hash value computed from all business parameters of the request.</p>
             * <blockquote>
             * <p>Repeated calls with the same parameters return the same query result. Therefore, when polling, you must use exactly the same request parameters as the initial call. Any change in parameters generates a different <strong>ResultId</strong> and triggers a new query.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>async__507044db6c4eadfa2dab9b084e80****</p>
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * <p>The current status of the asynchronous query. Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong>: The query is in progress. Continue polling.</li>
             * <li><strong>SUCCESS</strong>: The query succeeded. The <strong>Data</strong> field contains data only in this state.</li>
             * <li><strong>FAIL</strong>: The query failed.</li>
             * </ul>
             * <blockquote>
             * <p>When the query fails, the operation directly returns an error code and error message instead of a normal response body with <strong>State</strong> set to <strong>FAIL</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the asynchronous query was submitted. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * <blockquote>
             * <p>When the query fails, this value indicates the time when the failure occurred.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1718600000000</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
