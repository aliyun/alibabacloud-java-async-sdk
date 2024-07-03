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
         * The data returned.
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
             * The data associated with the items to be optimized, which is in the JSON format.
             */
            public Builder associatedData(String associatedData) {
                this.associatedData = associatedData;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The optimization suggestion. Valid values:
             * <p>
             * 
             * *   **NEED_ANALYZE_TABLE**: You can execute the `ANALYZE TABLE` statement on the table during off-peak hours. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * *   **NEED_OPTIMIZE_TABLE**: You can reclaim fragments during off-peak hours.
             * *   **CHANGE_TABLE_ENGINE_IF_NECESSARY**: Change the storage engine type of a table after risk assessment. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * *   **AUTO_INCREMENT_ID_BE_TO_RUN_OUT**: Pay attention to the usage of auto-increment IDs. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * *   **DUPLICATE_INDEX**: Optimize indexes of tables. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * *   **TABLE_SIZE**: Pay attention to the table size. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * *   **TABLE_ROWS_AND_AVG_ROW_LENGTH**: Pay attention to the number of rows in a table and the average row length. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * *   **STORAGE_USED_PERCENT**: Pay attention to the space usage to prevent the instance from being locked if the instance is full.
             */
            public Builder optimizeAdvice(String optimizeAdvice) {
                this.optimizeAdvice = optimizeAdvice;
                return this;
            }

            /**
             * The item to be optimized. Valid values:
             * <p>
             * 
             * *   **NEED_ANALYZE_TABLE**: tables whose storage statistics obtained from `information_schema.tables` are 50 GB larger or smaller than the physical file sizes. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * 
             * *   **NEED_OPTIMIZE_TABLE**: tables whose space fragments are larger than 6 GB and whose fragmentation rates are greater than 30%. The fragmentation rate of a table is generally calculated based on the following formulas:
             * 
             *     *   ApsaraDB RDS for MySQL and PolarDB for MySQL: `Fragmentation rate = DataFree/(DataSize + IndexSize + DataFree)`. In this topic, PhyTotalSize = DataSize + IndexSize + DataFree. Thus, the fragmentation rate can be calculated based on the following formula: `Fragmentation rate = DataFree/PhyTotalSize`.
             *     *   ApsaraDB for MongoDB: `Fragmentation rate = FragmentSize/PhyTotalSize`.
             * 
             * *   **TABLE_ENGINE**: tables whose storage engines are not InnoDB or XEngine. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * 
             * *   **AUTO_INCREMENT_ID_BE_TO_RUN_OUT**: tables whose usages of auto-increment IDs exceed 80%. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * 
             * *   **DUPLICATE_INDEX**: tables whose indexes are redundant or duplicate. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * 
             * *   **TABLE_SIZE**: single tables whose sizes are larger than 50 GB. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * 
             * *   **TABLE_ROWS_AND_AVG_ROW_LENGTH**: single tables that contain more than 5 million rows and whose average row lengths exceed 10 KB. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             * 
             * *   **TOTAL_DATA_FREE**: instances whose reclaimable space is larger than 60 GB and whose total fragmentation rate is larger than 5%.
             * 
             * *   **STORAGE_USED_PERCENT**: instances whose space usage is larger than 90%.
             */
            public Builder optimizeItemName(String optimizeItemName) {
                this.optimizeItemName = optimizeItemName;
                return this;
            }

            /**
             * The name of the table.
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
             * The average length of rows. Unit: bytes.
             */
            public Builder avgRowLength(Long avgRowLength) {
                this.avgRowLength = avgRowLength;
                return this;
            }

            /**
             * The size of space fragments. Unit: bytes.
             * <p>
             * 
             * >  This parameter is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters. The fragmentation rate of a table is generally calculated based on the following formula: `Fragmentation rate = DataFree/(DataSize + IndexSize + DataFree)`. In this topic, `Fragmentation rate = DataFree/PhyTotalSize`.
             */
            public Builder dataFree(Long dataFree) {
                this.dataFree = dataFree;
                return this;
            }

            /**
             * *   For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this parameter indicates the amount of space occupied by data. Unit: bytes.
             * <p>
             * *   For ApsaraDB for MongoDB instances, this parameter indicates the size of uncompressed data, that is, the amount of data. Unit: bytes.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The type of the storage engine used by the table.
             * <p>
             * 
             * >  This parameter is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The size of space that can be reclaimed. Unit: bytes.
             * <p>
             * 
             * >  This parameter is applicable only to ApsaraDB for MongoDB instances. `Fragmentation rate = FragmentSize/PhyTotalSize`.
             */
            public Builder fragmentSize(Long fragmentSize) {
                this.fragmentSize = fragmentSize;
                return this;
            }

            /**
             * The storage space occupied by indexes. Unit: bytes.
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * The storage space of the table. Unit: bytes.
             * <p>
             * 
             * >  For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, the value of the parameter is the sum of **DataSize**, **IndexSize**, and **DataFree**. For ApsaraDB for MongoDB instances, the value of this parameter is the sum of **DataSize** and **IndexSize**.
             */
            public Builder phyTotalSize(Long phyTotalSize) {
                this.phyTotalSize = phyTotalSize;
                return this;
            }

            /**
             * The physical file size of the table. Unit: bytes.
             * <p>
             * 
             * >  This parameter is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters. Data of specific database instances cannot be obtained due to deployment mode.
             */
            public Builder physicalFileSize(Long physicalFileSize) {
                this.physicalFileSize = physicalFileSize;
                return this;
            }

            /**
             * The name of the table.
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
             * The type of the table.
             * <p>
             * 
             * >  This parameter is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            /**
             * *   For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this parameter indicates the amount of space occupied by table data and indexes. Unit: bytes. The value is the sum of **DataSize** and **IndexSize**.
             * <p>
             * *   For ApsaraDB for MongoDB instances, this parameter indicates the actual size of space allocated by Block Manager. Unit: Bytes. The compression ratio of an ApsaraDB for MongoDB instance is calculated based on the following formula: `Compression ratio = TotalSize/DataSize`.
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
             * The estimated average daily growth of the used storage space in the previous seven days. Unit: bytes.
             */
            public Builder dailyIncrement(Long dailyIncrement) {
                this.dailyIncrement = dailyIncrement;
                return this;
            }

            /**
             * The estimated number of days for which the remaining storage space is available.
             */
            public Builder estimateAvailableDays(Long estimateAvailableDays) {
                this.estimateAvailableDays = estimateAvailableDays;
                return this;
            }

            /**
             * The items to be optimized, which are generated based on DAS default rules. You can ignore these items based on your business requirements, and create custom rules to generate items to be optimized based on other basic data that is returned.
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
