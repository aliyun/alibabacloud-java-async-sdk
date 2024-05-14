// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageAnalysisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageAnalysisResultResponseBody</p>
 */
public class GetStorageAnalysisResultResponseBody extends TeaModel {
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

    private GetStorageAnalysisResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageAnalysisResultResponseBody create() {
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
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request is successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStorageAnalysisResultResponseBody build() {
            return new GetStorageAnalysisResultResponseBody(this);
        } 

    } 

    public static class NeedOptimizeItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedData")
        private String associatedData;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("OptimizeAdvice")
        private String optimizeAdvice;

        @com.aliyun.core.annotation.NameInMap("OptimizeItemName")
        private String optimizeItemName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private NeedOptimizeItemList(Builder builder) {
            this.associatedData = builder.associatedData;
            this.dbName = builder.dbName;
            this.optimizeAdvice = builder.optimizeAdvice;
            this.optimizeItemName = builder.optimizeItemName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NeedOptimizeItemList create() {
            return builder().build();
        }

        /**
         * @return associatedData
         */
        public String getAssociatedData() {
            return this.associatedData;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return optimizeAdvice
         */
        public String getOptimizeAdvice() {
            return this.optimizeAdvice;
        }

        /**
         * @return optimizeItemName
         */
        public String getOptimizeItemName() {
            return this.optimizeItemName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String associatedData; 
            private String dbName; 
            private String optimizeAdvice; 
            private String optimizeItemName; 
            private String tableName; 

            /**
             * The data associated with items to be optimized.
             */
            public Builder associatedData(String associatedData) {
                this.associatedData = associatedData;
                return this;
            }

            /**
             * The database name.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The optimization suggestion. Valid values:
             * <p>
             * 
             * *   **NEED_ANALYZE_TABLE**: You can execute the ANALYZE TABLE statement on the related table during off-peak hours.
             * *   **NEED_OPTIMIZE_TABLE**: You can reclaim fragments during off-peak hours.
             */
            public Builder optimizeAdvice(String optimizeAdvice) {
                this.optimizeAdvice = optimizeAdvice;
                return this;
            }

            /**
             * The item to be optimized. Valid values:
             * <p>
             * 
             * *   **NEED_ANALYZE_TABLE**: The statistical data in information_schema.tables differs greatly from the physical file size.
             * *   **NEED_OPTIMIZE_TABLE**: The fragmentation degree of the table is high.
             */
            public Builder optimizeItemName(String optimizeItemName) {
                this.optimizeItemName = optimizeItemName;
                return this;
            }

            /**
             * The table name.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public NeedOptimizeItemList build() {
                return new NeedOptimizeItemList(this);
            } 

        } 

    }
    public static class TableStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgRowLength")
        private Long avgRowLength;

        @com.aliyun.core.annotation.NameInMap("DataFree")
        private Long dataFree;

        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("FragmentSize")
        private Long fragmentSize;

        @com.aliyun.core.annotation.NameInMap("IndexSize")
        private Long indexSize;

        @com.aliyun.core.annotation.NameInMap("PhyTotalSize")
        private Long phyTotalSize;

        @com.aliyun.core.annotation.NameInMap("PhysicalFileSize")
        private Long physicalFileSize;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableRows")
        private Long tableRows;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private TableStats(Builder builder) {
            this.avgRowLength = builder.avgRowLength;
            this.dataFree = builder.dataFree;
            this.dataSize = builder.dataSize;
            this.dbName = builder.dbName;
            this.engine = builder.engine;
            this.fragmentSize = builder.fragmentSize;
            this.indexSize = builder.indexSize;
            this.phyTotalSize = builder.phyTotalSize;
            this.physicalFileSize = builder.physicalFileSize;
            this.tableName = builder.tableName;
            this.tableRows = builder.tableRows;
            this.tableType = builder.tableType;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableStats create() {
            return builder().build();
        }

        /**
         * @return avgRowLength
         */
        public Long getAvgRowLength() {
            return this.avgRowLength;
        }

        /**
         * @return dataFree
         */
        public Long getDataFree() {
            return this.dataFree;
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return fragmentSize
         */
        public Long getFragmentSize() {
            return this.fragmentSize;
        }

        /**
         * @return indexSize
         */
        public Long getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return phyTotalSize
         */
        public Long getPhyTotalSize() {
            return this.phyTotalSize;
        }

        /**
         * @return physicalFileSize
         */
        public Long getPhysicalFileSize() {
            return this.physicalFileSize;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableRows
         */
        public Long getTableRows() {
            return this.tableRows;
        }

        /**
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Long avgRowLength; 
            private Long dataFree; 
            private Long dataSize; 
            private String dbName; 
            private String engine; 
            private Long fragmentSize; 
            private Long indexSize; 
            private Long phyTotalSize; 
            private Long physicalFileSize; 
            private String tableName; 
            private Long tableRows; 
            private String tableType; 
            private Long totalSize; 

            /**
             * The average row length.
             * <p>
             * 
             * >  Unit: bytes.
             */
            public Builder avgRowLength(Long avgRowLength) {
                this.avgRowLength = avgRowLength;
                return this;
            }

            /**
             * The size of storage occupied by fragments.
             * <p>
             * 
             * >  Unit: bytes.
             */
            public Builder dataFree(Long dataFree) {
                this.dataFree = dataFree;
                return this;
            }

            /**
             * The size of storage occupied by the table data.
             * <p>
             * 
             * >  Unit: bytes.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * The database name.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The type of the engine used by the table.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * FragmentSize.
             */
            public Builder fragmentSize(Long fragmentSize) {
                this.fragmentSize = fragmentSize;
                return this;
            }

            /**
             * The size of storage occupied by indexes.
             * <p>
             * 
             * >  Unit: bytes.
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * The size of the table storage.
             * <p>
             * 
             * >  Unit: byte. The value of the parameter is the sum of DataSize, IndexSize, and DataFree.
             */
            public Builder phyTotalSize(Long phyTotalSize) {
                this.phyTotalSize = phyTotalSize;
                return this;
            }

            /**
             * The physical file size of the table.
             * <p>
             * 
             * >  Unit: byte. You may fail to obtain the physical file size because of the deployment mode of the database instance.
             */
            public Builder physicalFileSize(Long physicalFileSize) {
                this.physicalFileSize = physicalFileSize;
                return this;
            }

            /**
             * The table name.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The number of rows in the table.
             */
            public Builder tableRows(Long tableRows) {
                this.tableRows = tableRows;
                return this;
            }

            /**
             * The table type.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            /**
             * The size of storage occupied by table data and indexes.
             * <p>
             * 
             * >  Unit: byte. The value of the parameter is the sum of DataSize and IndexSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public TableStats build() {
                return new TableStats(this);
            } 

        } 

    }
    public static class StorageAnalysisResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalysisErrorType")
        private String analysisErrorType;

        @com.aliyun.core.annotation.NameInMap("AnalysisSuccess")
        private Boolean analysisSuccess;

        @com.aliyun.core.annotation.NameInMap("DailyIncrement")
        private Long dailyIncrement;

        @com.aliyun.core.annotation.NameInMap("EstimateAvailableDays")
        private Long estimateAvailableDays;

        @com.aliyun.core.annotation.NameInMap("NeedOptimizeItemList")
        private java.util.List < NeedOptimizeItemList> needOptimizeItemList;

        @com.aliyun.core.annotation.NameInMap("TableStats")
        private java.util.List < TableStats> tableStats;

        @com.aliyun.core.annotation.NameInMap("TotalFreeStorageSize")
        private Long totalFreeStorageSize;

        @com.aliyun.core.annotation.NameInMap("TotalStorageSize")
        private Long totalStorageSize;

        @com.aliyun.core.annotation.NameInMap("TotalUsedStorageSize")
        private Long totalUsedStorageSize;

        private StorageAnalysisResult(Builder builder) {
            this.analysisErrorType = builder.analysisErrorType;
            this.analysisSuccess = builder.analysisSuccess;
            this.dailyIncrement = builder.dailyIncrement;
            this.estimateAvailableDays = builder.estimateAvailableDays;
            this.needOptimizeItemList = builder.needOptimizeItemList;
            this.tableStats = builder.tableStats;
            this.totalFreeStorageSize = builder.totalFreeStorageSize;
            this.totalStorageSize = builder.totalStorageSize;
            this.totalUsedStorageSize = builder.totalUsedStorageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageAnalysisResult create() {
            return builder().build();
        }

        /**
         * @return analysisErrorType
         */
        public String getAnalysisErrorType() {
            return this.analysisErrorType;
        }

        /**
         * @return analysisSuccess
         */
        public Boolean getAnalysisSuccess() {
            return this.analysisSuccess;
        }

        /**
         * @return dailyIncrement
         */
        public Long getDailyIncrement() {
            return this.dailyIncrement;
        }

        /**
         * @return estimateAvailableDays
         */
        public Long getEstimateAvailableDays() {
            return this.estimateAvailableDays;
        }

        /**
         * @return needOptimizeItemList
         */
        public java.util.List < NeedOptimizeItemList> getNeedOptimizeItemList() {
            return this.needOptimizeItemList;
        }

        /**
         * @return tableStats
         */
        public java.util.List < TableStats> getTableStats() {
            return this.tableStats;
        }

        /**
         * @return totalFreeStorageSize
         */
        public Long getTotalFreeStorageSize() {
            return this.totalFreeStorageSize;
        }

        /**
         * @return totalStorageSize
         */
        public Long getTotalStorageSize() {
            return this.totalStorageSize;
        }

        /**
         * @return totalUsedStorageSize
         */
        public Long getTotalUsedStorageSize() {
            return this.totalUsedStorageSize;
        }

        public static final class Builder {
            private String analysisErrorType; 
            private Boolean analysisSuccess; 
            private Long dailyIncrement; 
            private Long estimateAvailableDays; 
            private java.util.List < NeedOptimizeItemList> needOptimizeItemList; 
            private java.util.List < TableStats> tableStats; 
            private Long totalFreeStorageSize; 
            private Long totalStorageSize; 
            private Long totalUsedStorageSize; 

            /**
             * The reason why the analysis on the database and table fails.
             * <p>
             * 
             * *   **DB_OR_TABLE_NOT_EXIST**: The specified database or table does not exist.
             * *   **DB_NOT_EXIST**: The specified database does not exist.
             */
            public Builder analysisErrorType(String analysisErrorType) {
                this.analysisErrorType = analysisErrorType;
                return this;
            }

            /**
             * Indicates whether the analysis on the database and table is successful.
             */
            public Builder analysisSuccess(Boolean analysisSuccess) {
                this.analysisSuccess = analysisSuccess;
                return this;
            }

            /**
             * The estimated daily storage usage increment in the last seven days.
             * <p>
             * 
             * >  Unit: bytes.
             */
            public Builder dailyIncrement(Long dailyIncrement) {
                this.dailyIncrement = dailyIncrement;
                return this;
            }

            /**
             * The estimated number of days before the remaining storage runs out.
             */
            public Builder estimateAvailableDays(Long estimateAvailableDays) {
                this.estimateAvailableDays = estimateAvailableDays;
                return this;
            }

            /**
             * The list of items to be optimized.
             */
            public Builder needOptimizeItemList(java.util.List < NeedOptimizeItemList> needOptimizeItemList) {
                this.needOptimizeItemList = needOptimizeItemList;
                return this;
            }

            /**
             * The information about the table.
             */
            public Builder tableStats(java.util.List < TableStats> tableStats) {
                this.tableStats = tableStats;
                return this;
            }

            /**
             * The size of remaining storage.
             * <p>
             * 
             * >  Unit: bytes.
             */
            public Builder totalFreeStorageSize(Long totalFreeStorageSize) {
                this.totalFreeStorageSize = totalFreeStorageSize;
                return this;
            }

            /**
             * The total size of instance storage.
             * <p>
             * 
             * >  Unit: bytes.
             */
            public Builder totalStorageSize(Long totalStorageSize) {
                this.totalStorageSize = totalStorageSize;
                return this;
            }

            /**
             * The size of used storage.
             * <p>
             * 
             * >  Unit: bytes.
             */
            public Builder totalUsedStorageSize(Long totalUsedStorageSize) {
                this.totalUsedStorageSize = totalUsedStorageSize;
                return this;
            }

            public StorageAnalysisResult build() {
                return new StorageAnalysisResult(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalyzedDbCount")
        private Long analyzedDbCount;

        @com.aliyun.core.annotation.NameInMap("StorageAnalysisResult")
        private StorageAnalysisResult storageAnalysisResult;

        @com.aliyun.core.annotation.NameInMap("TaskFinish")
        private Boolean taskFinish;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskProgress")
        private Long taskProgress;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        @com.aliyun.core.annotation.NameInMap("TaskSuccess")
        private Boolean taskSuccess;

        @com.aliyun.core.annotation.NameInMap("TotalDbCount")
        private Long totalDbCount;

        private Data(Builder builder) {
            this.analyzedDbCount = builder.analyzedDbCount;
            this.storageAnalysisResult = builder.storageAnalysisResult;
            this.taskFinish = builder.taskFinish;
            this.taskId = builder.taskId;
            this.taskProgress = builder.taskProgress;
            this.taskState = builder.taskState;
            this.taskSuccess = builder.taskSuccess;
            this.totalDbCount = builder.totalDbCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analyzedDbCount
         */
        public Long getAnalyzedDbCount() {
            return this.analyzedDbCount;
        }

        /**
         * @return storageAnalysisResult
         */
        public StorageAnalysisResult getStorageAnalysisResult() {
            return this.storageAnalysisResult;
        }

        /**
         * @return taskFinish
         */
        public Boolean getTaskFinish() {
            return this.taskFinish;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskProgress
         */
        public Long getTaskProgress() {
            return this.taskProgress;
        }

        /**
         * @return taskState
         */
        public String getTaskState() {
            return this.taskState;
        }

        /**
         * @return taskSuccess
         */
        public Boolean getTaskSuccess() {
            return this.taskSuccess;
        }

        /**
         * @return totalDbCount
         */
        public Long getTotalDbCount() {
            return this.totalDbCount;
        }

        public static final class Builder {
            private Long analyzedDbCount; 
            private StorageAnalysisResult storageAnalysisResult; 
            private Boolean taskFinish; 
            private String taskId; 
            private Long taskProgress; 
            private String taskState; 
            private Boolean taskSuccess; 
            private Long totalDbCount; 

            /**
             * The number of databases that have been analyzed.
             */
            public Builder analyzedDbCount(Long analyzedDbCount) {
                this.analyzedDbCount = analyzedDbCount;
                return this;
            }

            /**
             * The details of storage analysis.
             */
            public Builder storageAnalysisResult(StorageAnalysisResult storageAnalysisResult) {
                this.storageAnalysisResult = storageAnalysisResult;
                return this;
            }

            /**
             * Indicates whether the task is complete.
             */
            public Builder taskFinish(Boolean taskFinish) {
                this.taskFinish = taskFinish;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The task progress.
             * <p>
             * 
             * >  Valid values are integers that range from 0 to 100.
             */
            public Builder taskProgress(Long taskProgress) {
                this.taskProgress = taskProgress;
                return this;
            }

            /**
             * The status of the storage analysis task. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is being initialized.
             * *   **PENDING**: The task is being queued for execution.
             * *   **RECEIVED**: The task is received for execution.
             * *   **RUNNING**: The task is being executed.
             * *   **RETRY**: The task is being retried.
             * *   **SUCCESS**: The task succeeds.
             * *   **FAILURE**: The task fails.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * Indicates whether the task is successful.
             */
            public Builder taskSuccess(Boolean taskSuccess) {
                this.taskSuccess = taskSuccess;
                return this;
            }

            /**
             * The number of databases that need to be analyzed in the storage analysis task.
             */
            public Builder totalDbCount(Long totalDbCount) {
                this.totalDbCount = totalDbCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
