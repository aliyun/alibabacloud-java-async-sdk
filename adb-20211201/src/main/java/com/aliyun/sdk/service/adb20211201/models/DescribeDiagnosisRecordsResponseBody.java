// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisRecordsResponseBody</p>
 */
public class DescribeDiagnosisRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Querys")
    private java.util.List < Querys> querys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The page number. Pages start from page 1. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   **30** (default)
         * *   **50**
         * *   **100**
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

    public static class QueryProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryProperties(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryProperties create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryProperties build() {
                return new QueryProperties(this);
            } 

        } 

    }
    public static class Querys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("Cost")
        private Long cost;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("EtlWriteRows")
        private Long etlWriteRows;

        @com.aliyun.core.annotation.NameInMap("ExecutionTime")
        private Long executionTime;

        @com.aliyun.core.annotation.NameInMap("OutputDataSize")
        private Long outputDataSize;

        @com.aliyun.core.annotation.NameInMap("OutputRows")
        private Long outputRows;

        @com.aliyun.core.annotation.NameInMap("PeakMemory")
        private Long peakMemory;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("QueryProperties")
        private java.util.List < QueryProperties> queryProperties;

        @com.aliyun.core.annotation.NameInMap("QueueTime")
        private Long queueTime;

        @com.aliyun.core.annotation.NameInMap("RcHost")
        private String rcHost;

        @com.aliyun.core.annotation.NameInMap("ResourceCostRank")
        private Integer resourceCostRank;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("SQL")
        private String SQL;

        @com.aliyun.core.annotation.NameInMap("SQLTruncated")
        private Boolean SQLTruncated;

        @com.aliyun.core.annotation.NameInMap("SQLTruncatedThreshold")
        private Long SQLTruncatedThreshold;

        @com.aliyun.core.annotation.NameInMap("ScanRows")
        private Long scanRows;

        @com.aliyun.core.annotation.NameInMap("ScanSize")
        private Long scanSize;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalPlanningTime")
        private Long totalPlanningTime;

        @com.aliyun.core.annotation.NameInMap("TotalStages")
        private Integer totalStages;

        @com.aliyun.core.annotation.NameInMap("UserName")
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
            this.queryProperties = builder.queryProperties;
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
         * @return queryProperties
         */
        public java.util.List < QueryProperties> getQueryProperties() {
            return this.queryProperties;
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
            private java.util.List < QueryProperties> queryProperties; 
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
             * The number of rows written to the table by an extract-transform-load (ETL) job.
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
             * QueryProperties.
             */
            public Builder queryProperties(java.util.List < QueryProperties> queryProperties) {
                this.queryProperties = queryProperties;
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
             * >  This parameter is returned only for SQL statements whose `Status` parameter is `running`.
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
             * The queried SQL statement.
             * <p>
             * 
             * >  For performance considerations, an SQL statement cannot exceed 5,120 characters in length. Otherwise, the SQL statement is truncated. You can call the [DownloadDiagnosisRecords](~~308212~~) operation to download the information about SQL statements that meet a query condition for an AnalyticDB for MySQL cluster, including the complete SQL statements.
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
             * The maximum length of the SQL statement. 5120 is returned. Unit: characters. SQL statements that exceed this limit are truncated.
             */
            public Builder SQLTruncatedThreshold(Long SQLTruncatedThreshold) {
                this.SQLTruncatedThreshold = SQLTruncatedThreshold;
                return this;
            }

            /**
             * The number of rows scanned.
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
             * The execution start time of the SQL statement. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
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
             * The username that is used to execute the SQL statements.
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
