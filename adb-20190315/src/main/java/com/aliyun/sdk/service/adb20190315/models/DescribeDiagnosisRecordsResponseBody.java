// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisRecordsResponseBody</p>
 */
public class DescribeDiagnosisRecordsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Querys")
    private java.util.List < Querys> querys;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDiagnosisRecordsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.querys = builder.querys;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return querys
     */
    public java.util.List < Querys> getQuerys() {
        return this.querys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < Querys> querys; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The queried SQL statements.
         */
        public Builder querys(java.util.List < Querys> querys) {
            this.querys = querys;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiagnosisRecordsResponseBody build() {
            return new DescribeDiagnosisRecordsResponseBody(this);
        } 

    } 

    public static class Querys extends TeaModel {
        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("Cost")
        private Long cost;

        @NameInMap("Database")
        private String database;

        @NameInMap("EtlWriteRows")
        private Long etlWriteRows;

        @NameInMap("ExecutionTime")
        private Long executionTime;

        @NameInMap("OutputDataSize")
        private Long outputDataSize;

        @NameInMap("OutputRows")
        private Long outputRows;

        @NameInMap("PeakMemory")
        private Long peakMemory;

        @NameInMap("ProcessId")
        private String processId;

        @NameInMap("QueueTime")
        private Long queueTime;

        @NameInMap("RcHost")
        private String rcHost;

        @NameInMap("ResourceCostRank")
        private Integer resourceCostRank;

        @NameInMap("ResourceGroup")
        private String resourceGroup;

        @NameInMap("SQL")
        private String SQL;

        @NameInMap("SQLTruncated")
        private Boolean SQLTruncated;

        @NameInMap("SQLTruncatedThreshold")
        private Long SQLTruncatedThreshold;

        @NameInMap("ScanRows")
        private Long scanRows;

        @NameInMap("ScanSize")
        private Long scanSize;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalPlanningTime")
        private Long totalPlanningTime;

        @NameInMap("TotalStages")
        private Integer totalStages;

        @NameInMap("UserName")
        private String userName;

        private Querys(Builder builder) {
            this.clientIp = builder.clientIp;
            this.cost = builder.cost;
            this.database = builder.database;
            this.etlWriteRows = builder.etlWriteRows;
            this.executionTime = builder.executionTime;
            this.outputDataSize = builder.outputDataSize;
            this.outputRows = builder.outputRows;
            this.peakMemory = builder.peakMemory;
            this.processId = builder.processId;
            this.queueTime = builder.queueTime;
            this.rcHost = builder.rcHost;
            this.resourceCostRank = builder.resourceCostRank;
            this.resourceGroup = builder.resourceGroup;
            this.SQL = builder.SQL;
            this.SQLTruncated = builder.SQLTruncated;
            this.SQLTruncatedThreshold = builder.SQLTruncatedThreshold;
            this.scanRows = builder.scanRows;
            this.scanSize = builder.scanSize;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalPlanningTime = builder.totalPlanningTime;
            this.totalStages = builder.totalStages;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Querys create() {
            return builder().build();
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return cost
         */
        public Long getCost() {
            return this.cost;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return etlWriteRows
         */
        public Long getEtlWriteRows() {
            return this.etlWriteRows;
        }

        /**
         * @return executionTime
         */
        public Long getExecutionTime() {
            return this.executionTime;
        }

        /**
         * @return outputDataSize
         */
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return queueTime
         */
        public Long getQueueTime() {
            return this.queueTime;
        }

        /**
         * @return rcHost
         */
        public String getRcHost() {
            return this.rcHost;
        }

        /**
         * @return resourceCostRank
         */
        public Integer getResourceCostRank() {
            return this.resourceCostRank;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return SQL
         */
        public String getSQL() {
            return this.SQL;
        }

        /**
         * @return SQLTruncated
         */
        public Boolean getSQLTruncated() {
            return this.SQLTruncated;
        }

        /**
         * @return SQLTruncatedThreshold
         */
        public Long getSQLTruncatedThreshold() {
            return this.SQLTruncatedThreshold;
        }

        /**
         * @return scanRows
         */
        public Long getScanRows() {
            return this.scanRows;
        }

        /**
         * @return scanSize
         */
        public Long getScanSize() {
            return this.scanSize;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalPlanningTime
         */
        public Long getTotalPlanningTime() {
            return this.totalPlanningTime;
        }

        /**
         * @return totalStages
         */
        public Integer getTotalStages() {
            return this.totalStages;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String clientIp; 
            private Long cost; 
            private String database; 
            private Long etlWriteRows; 
            private Long executionTime; 
            private Long outputDataSize; 
            private Long outputRows; 
            private Long peakMemory; 
            private String processId; 
            private Long queueTime; 
            private String rcHost; 
            private Integer resourceCostRank; 
            private String resourceGroup; 
            private String SQL; 
            private Boolean SQLTruncated; 
            private Long SQLTruncatedThreshold; 
            private Long scanRows; 
            private Long scanSize; 
            private Long startTime; 
            private String status; 
            private Long totalPlanningTime; 
            private Integer totalStages; 
            private String userName; 

            /**
             * The source IP address.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * The total execution duration. Unit: milliseconds.
             * <p>
             * 
             * >  This value is the cumulative value of the `QueuedTime`, `TotalPlanningTime`, and `ExecutionTime` parameters.
             */
            public Builder cost(Long cost) {
                this.cost = cost;
                return this;
            }

            /**
             * The name of the database on which the SQL statement is executed.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The number of rows written to the table by an extract, transform, and load (ETL) task.
             */
            public Builder etlWriteRows(Long etlWriteRows) {
                this.etlWriteRows = etlWriteRows;
                return this;
            }

            /**
             * The execution duration. Unit: milliseconds.
             */
            public Builder executionTime(Long executionTime) {
                this.executionTime = executionTime;
                return this;
            }

            /**
             * The amount of returned data. Unit: bytes.
             */
            public Builder outputDataSize(Long outputDataSize) {
                this.outputDataSize = outputDataSize;
                return this;
            }

            /**
             * The number of rows returned.
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * The peak memory. Unit: bytes.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * The query ID.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * The amount of time that is consumed for queuing. Unit: milliseconds.
             */
            public Builder queueTime(Long queueTime) {
                this.queueTime = queueTime;
                return this;
            }

            /**
             * The IP address and port number of the AnalyticDB for MySQL frontend node on which the SQL statement is executed.
             */
            public Builder rcHost(String rcHost) {
                this.rcHost = rcHost;
                return this;
            }

            /**
             * The execution duration rank of operators that are used in the SQL statement.
             * <p>
             * 
             * > This field is returned only for SQL statements that have the `Status` parameter set to `running`.
             */
            public Builder resourceCostRank(Integer resourceCostRank) {
                this.resourceCostRank = resourceCostRank;
                return this;
            }

            /**
             * The resource group to which the SQL statement belongs.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * The SQL statement.
             * <p>
             * 
             * > For performance considerations, an SQL statement cannot exceed 5,120 characters in length. Otherwise, the SQL statement is truncated. You can call the [DownloadDiagnosisRecords](~~308212~~) operation to download the diagnostic information about SQL statements that meet a condition in an AnalyticDB for MySQL cluster, including the complete SQL statements.
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * Indicates whether the SQL statement is truncated. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder SQLTruncated(Boolean SQLTruncated) {
                this.SQLTruncated = SQLTruncated;
                return this;
            }

            /**
             * The maximum length of the SQL statement. 5120 is returned. Unit: character. SQL statements that exceed this limit are truncated.
             */
            public Builder SQLTruncatedThreshold(Long SQLTruncatedThreshold) {
                this.SQLTruncatedThreshold = SQLTruncatedThreshold;
                return this;
            }

            /**
             * The number of entries scanned.
             */
            public Builder scanRows(Long scanRows) {
                this.scanRows = scanRows;
                return this;
            }

            /**
             * The amount of scanned data. Unit: bytes.
             */
            public Builder scanSize(Long scanSize) {
                this.scanSize = scanSize;
                return this;
            }

            /**
             * The beginning of the time range in which the SQL statement is executed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the SQL statement. Valid values:
             * <p>
             * 
             * *   **running**
             * *   **finished**
             * *   **failed**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The amount of time that is consumed to generate an execution plan. Unit: milliseconds.
             */
            public Builder totalPlanningTime(Long totalPlanningTime) {
                this.totalPlanningTime = totalPlanningTime;
                return this;
            }

            /**
             * The total number of stages generated.
             */
            public Builder totalStages(Integer totalStages) {
                this.totalStages = totalStages;
                return this;
            }

            /**
             * The username that is used to execute the SQL statement.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Querys build() {
                return new Querys(this);
            } 

        } 

    }
}
