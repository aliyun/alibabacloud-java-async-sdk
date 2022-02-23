// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFullRequestOriginStatByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetFullRequestOriginStatByInstanceIdResponseBody</p>
 */
public class GetFullRequestOriginStatByInstanceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetFullRequestOriginStatByInstanceIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFullRequestOriginStatByInstanceIdResponseBody create() {
        return builder().build();
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

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFullRequestOriginStatByInstanceIdResponseBody build() {
            return new GetFullRequestOriginStatByInstanceIdResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AvgExaminedRows")
        private Double avgExaminedRows;

        @NameInMap("AvgFetchRows")
        private Long avgFetchRows;

        @NameInMap("AvgLockWaitTime")
        private Double avgLockWaitTime;

        @NameInMap("AvgLogicalRead")
        private Double avgLogicalRead;

        @NameInMap("AvgPhysicalAsyncRead")
        private Long avgPhysicalAsyncRead;

        @NameInMap("AvgPhysicalSyncRead")
        private Double avgPhysicalSyncRead;

        @NameInMap("AvgReturnedRows")
        private Double avgReturnedRows;

        @NameInMap("AvgRows")
        private Long avgRows;

        @NameInMap("AvgRt")
        private Double avgRt;

        @NameInMap("AvgSqlCount")
        private Long avgSqlCount;

        @NameInMap("AvgUpdatedRows")
        private Double avgUpdatedRows;

        @NameInMap("Count")
        private Long count;

        @NameInMap("CountRate")
        private Double countRate;

        @NameInMap("Database")
        private String database;

        @NameInMap("ErrorCount")
        private Long errorCount;

        @NameInMap("ExaminedRows")
        private Long examinedRows;

        @NameInMap("FetchRows")
        private Long fetchRows;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Key")
        private String key;

        @NameInMap("LockWaitTime")
        private Double lockWaitTime;

        @NameInMap("LogicalRead")
        private Long logicalRead;

        @NameInMap("OriginHost")
        private String originHost;

        @NameInMap("PhysicalAsyncRead")
        private Long physicalAsyncRead;

        @NameInMap("PhysicalSyncRead")
        private Long physicalSyncRead;

        @NameInMap("Port")
        private Long port;

        @NameInMap("Rows")
        private Long rows;

        @NameInMap("RtGreaterThanOneSecondCount")
        private Long rtGreaterThanOneSecondCount;

        @NameInMap("RtRate")
        private Double rtRate;

        @NameInMap("SqlCount")
        private Long sqlCount;

        @NameInMap("SumUpdatedRows")
        private Long sumUpdatedRows;

        @NameInMap("Version")
        private Long version;

        @NameInMap("VpcId")
        private String vpcId;

        private List(Builder builder) {
            this.avgExaminedRows = builder.avgExaminedRows;
            this.avgFetchRows = builder.avgFetchRows;
            this.avgLockWaitTime = builder.avgLockWaitTime;
            this.avgLogicalRead = builder.avgLogicalRead;
            this.avgPhysicalAsyncRead = builder.avgPhysicalAsyncRead;
            this.avgPhysicalSyncRead = builder.avgPhysicalSyncRead;
            this.avgReturnedRows = builder.avgReturnedRows;
            this.avgRows = builder.avgRows;
            this.avgRt = builder.avgRt;
            this.avgSqlCount = builder.avgSqlCount;
            this.avgUpdatedRows = builder.avgUpdatedRows;
            this.count = builder.count;
            this.countRate = builder.countRate;
            this.database = builder.database;
            this.errorCount = builder.errorCount;
            this.examinedRows = builder.examinedRows;
            this.fetchRows = builder.fetchRows;
            this.ip = builder.ip;
            this.key = builder.key;
            this.lockWaitTime = builder.lockWaitTime;
            this.logicalRead = builder.logicalRead;
            this.originHost = builder.originHost;
            this.physicalAsyncRead = builder.physicalAsyncRead;
            this.physicalSyncRead = builder.physicalSyncRead;
            this.port = builder.port;
            this.rows = builder.rows;
            this.rtGreaterThanOneSecondCount = builder.rtGreaterThanOneSecondCount;
            this.rtRate = builder.rtRate;
            this.sqlCount = builder.sqlCount;
            this.sumUpdatedRows = builder.sumUpdatedRows;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return avgExaminedRows
         */
        public Double getAvgExaminedRows() {
            return this.avgExaminedRows;
        }

        /**
         * @return avgFetchRows
         */
        public Long getAvgFetchRows() {
            return this.avgFetchRows;
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
        public Long getAvgPhysicalAsyncRead() {
            return this.avgPhysicalAsyncRead;
        }

        /**
         * @return avgPhysicalSyncRead
         */
        public Double getAvgPhysicalSyncRead() {
            return this.avgPhysicalSyncRead;
        }

        /**
         * @return avgReturnedRows
         */
        public Double getAvgReturnedRows() {
            return this.avgReturnedRows;
        }

        /**
         * @return avgRows
         */
        public Long getAvgRows() {
            return this.avgRows;
        }

        /**
         * @return avgRt
         */
        public Double getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return avgSqlCount
         */
        public Long getAvgSqlCount() {
            return this.avgSqlCount;
        }

        /**
         * @return avgUpdatedRows
         */
        public Double getAvgUpdatedRows() {
            return this.avgUpdatedRows;
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
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return examinedRows
         */
        public Long getExaminedRows() {
            return this.examinedRows;
        }

        /**
         * @return fetchRows
         */
        public Long getFetchRows() {
            return this.fetchRows;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
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
        public Long getLogicalRead() {
            return this.logicalRead;
        }

        /**
         * @return originHost
         */
        public String getOriginHost() {
            return this.originHost;
        }

        /**
         * @return physicalAsyncRead
         */
        public Long getPhysicalAsyncRead() {
            return this.physicalAsyncRead;
        }

        /**
         * @return physicalSyncRead
         */
        public Long getPhysicalSyncRead() {
            return this.physicalSyncRead;
        }

        /**
         * @return port
         */
        public Long getPort() {
            return this.port;
        }

        /**
         * @return rows
         */
        public Long getRows() {
            return this.rows;
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
         * @return sqlCount
         */
        public Long getSqlCount() {
            return this.sqlCount;
        }

        /**
         * @return sumUpdatedRows
         */
        public Long getSumUpdatedRows() {
            return this.sumUpdatedRows;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Double avgExaminedRows; 
            private Long avgFetchRows; 
            private Double avgLockWaitTime; 
            private Double avgLogicalRead; 
            private Long avgPhysicalAsyncRead; 
            private Double avgPhysicalSyncRead; 
            private Double avgReturnedRows; 
            private Long avgRows; 
            private Double avgRt; 
            private Long avgSqlCount; 
            private Double avgUpdatedRows; 
            private Long count; 
            private Double countRate; 
            private String database; 
            private Long errorCount; 
            private Long examinedRows; 
            private Long fetchRows; 
            private String ip; 
            private String key; 
            private Double lockWaitTime; 
            private Long logicalRead; 
            private String originHost; 
            private Long physicalAsyncRead; 
            private Long physicalSyncRead; 
            private Long port; 
            private Long rows; 
            private Long rtGreaterThanOneSecondCount; 
            private Double rtRate; 
            private Long sqlCount; 
            private Long sumUpdatedRows; 
            private Long version; 
            private String vpcId; 

            /**
             * AvgExaminedRows.
             */
            public Builder avgExaminedRows(Double avgExaminedRows) {
                this.avgExaminedRows = avgExaminedRows;
                return this;
            }

            /**
             * AvgFetchRows.
             */
            public Builder avgFetchRows(Long avgFetchRows) {
                this.avgFetchRows = avgFetchRows;
                return this;
            }

            /**
             * AvgLockWaitTime.
             */
            public Builder avgLockWaitTime(Double avgLockWaitTime) {
                this.avgLockWaitTime = avgLockWaitTime;
                return this;
            }

            /**
             * AvgLogicalRead.
             */
            public Builder avgLogicalRead(Double avgLogicalRead) {
                this.avgLogicalRead = avgLogicalRead;
                return this;
            }

            /**
             * AvgPhysicalAsyncRead.
             */
            public Builder avgPhysicalAsyncRead(Long avgPhysicalAsyncRead) {
                this.avgPhysicalAsyncRead = avgPhysicalAsyncRead;
                return this;
            }

            /**
             * AvgPhysicalSyncRead.
             */
            public Builder avgPhysicalSyncRead(Double avgPhysicalSyncRead) {
                this.avgPhysicalSyncRead = avgPhysicalSyncRead;
                return this;
            }

            /**
             * AvgReturnedRows.
             */
            public Builder avgReturnedRows(Double avgReturnedRows) {
                this.avgReturnedRows = avgReturnedRows;
                return this;
            }

            /**
             * AvgRows.
             */
            public Builder avgRows(Long avgRows) {
                this.avgRows = avgRows;
                return this;
            }

            /**
             * AvgRt.
             */
            public Builder avgRt(Double avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * AvgSqlCount.
             */
            public Builder avgSqlCount(Long avgSqlCount) {
                this.avgSqlCount = avgSqlCount;
                return this;
            }

            /**
             * AvgUpdatedRows.
             */
            public Builder avgUpdatedRows(Double avgUpdatedRows) {
                this.avgUpdatedRows = avgUpdatedRows;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * CountRate.
             */
            public Builder countRate(Double countRate) {
                this.countRate = countRate;
                return this;
            }

            /**
             * Database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * ErrorCount.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * ExaminedRows.
             */
            public Builder examinedRows(Long examinedRows) {
                this.examinedRows = examinedRows;
                return this;
            }

            /**
             * FetchRows.
             */
            public Builder fetchRows(Long fetchRows) {
                this.fetchRows = fetchRows;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * LockWaitTime.
             */
            public Builder lockWaitTime(Double lockWaitTime) {
                this.lockWaitTime = lockWaitTime;
                return this;
            }

            /**
             * LogicalRead.
             */
            public Builder logicalRead(Long logicalRead) {
                this.logicalRead = logicalRead;
                return this;
            }

            /**
             * OriginHost.
             */
            public Builder originHost(String originHost) {
                this.originHost = originHost;
                return this;
            }

            /**
             * PhysicalAsyncRead.
             */
            public Builder physicalAsyncRead(Long physicalAsyncRead) {
                this.physicalAsyncRead = physicalAsyncRead;
                return this;
            }

            /**
             * PhysicalSyncRead.
             */
            public Builder physicalSyncRead(Long physicalSyncRead) {
                this.physicalSyncRead = physicalSyncRead;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Long port) {
                this.port = port;
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
             * RtGreaterThanOneSecondCount.
             */
            public Builder rtGreaterThanOneSecondCount(Long rtGreaterThanOneSecondCount) {
                this.rtGreaterThanOneSecondCount = rtGreaterThanOneSecondCount;
                return this;
            }

            /**
             * RtRate.
             */
            public Builder rtRate(Double rtRate) {
                this.rtRate = rtRate;
                return this;
            }

            /**
             * SqlCount.
             */
            public Builder sqlCount(Long sqlCount) {
                this.sqlCount = sqlCount;
                return this;
            }

            /**
             * SumUpdatedRows.
             */
            public Builder sumUpdatedRows(Long sumUpdatedRows) {
                this.sumUpdatedRows = sumUpdatedRows;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long total; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Total.
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
