// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageAnalysisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageAnalysisResultResponseBody</p>
 */
public class GetStorageAnalysisResultResponseBody extends TeaModel {
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

        public GetStorageAnalysisResultResponseBody build() {
            return new GetStorageAnalysisResultResponseBody(this);
        } 

    } 

    public static class NeedOptimizeItemList extends TeaModel {
        @NameInMap("AssociatedData")
        private String associatedData;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("OptimizeAdvice")
        private String optimizeAdvice;

        @NameInMap("OptimizeItemName")
        private String optimizeItemName;

        @NameInMap("TableName")
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
             * AssociatedData.
             */
            public Builder associatedData(String associatedData) {
                this.associatedData = associatedData;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * OptimizeAdvice.
             */
            public Builder optimizeAdvice(String optimizeAdvice) {
                this.optimizeAdvice = optimizeAdvice;
                return this;
            }

            /**
             * OptimizeItemName.
             */
            public Builder optimizeItemName(String optimizeItemName) {
                this.optimizeItemName = optimizeItemName;
                return this;
            }

            /**
             * TableName.
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
        @NameInMap("AvgRowLength")
        private Long avgRowLength;

        @NameInMap("DataFree")
        private Long dataFree;

        @NameInMap("DataSize")
        private Long dataSize;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("IndexSize")
        private Long indexSize;

        @NameInMap("PhyTotalSize")
        private Long phyTotalSize;

        @NameInMap("PhysicalFileSize")
        private Long physicalFileSize;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TableRows")
        private Long tableRows;

        @NameInMap("TableType")
        private String tableType;

        @NameInMap("TotalSize")
        private Long totalSize;

        private TableStats(Builder builder) {
            this.avgRowLength = builder.avgRowLength;
            this.dataFree = builder.dataFree;
            this.dataSize = builder.dataSize;
            this.dbName = builder.dbName;
            this.engine = builder.engine;
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
            private Long indexSize; 
            private Long phyTotalSize; 
            private Long physicalFileSize; 
            private String tableName; 
            private Long tableRows; 
            private String tableType; 
            private Long totalSize; 

            /**
             * AvgRowLength.
             */
            public Builder avgRowLength(Long avgRowLength) {
                this.avgRowLength = avgRowLength;
                return this;
            }

            /**
             * DataFree.
             */
            public Builder dataFree(Long dataFree) {
                this.dataFree = dataFree;
                return this;
            }

            /**
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * IndexSize.
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * PhyTotalSize.
             */
            public Builder phyTotalSize(Long phyTotalSize) {
                this.phyTotalSize = phyTotalSize;
                return this;
            }

            /**
             * PhysicalFileSize.
             */
            public Builder physicalFileSize(Long physicalFileSize) {
                this.physicalFileSize = physicalFileSize;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TableRows.
             */
            public Builder tableRows(Long tableRows) {
                this.tableRows = tableRows;
                return this;
            }

            /**
             * TableType.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            /**
             * TotalSize.
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
        @NameInMap("AnalysisErrorType")
        private String analysisErrorType;

        @NameInMap("AnalysisSuccess")
        private Boolean analysisSuccess;

        @NameInMap("DailyIncrement")
        private Long dailyIncrement;

        @NameInMap("EstimateAvailableDays")
        private Long estimateAvailableDays;

        @NameInMap("NeedOptimizeItemList")
        private java.util.List < NeedOptimizeItemList> needOptimizeItemList;

        @NameInMap("TableStats")
        private java.util.List < TableStats> tableStats;

        @NameInMap("TotalFreeStorageSize")
        private Long totalFreeStorageSize;

        @NameInMap("TotalStorageSize")
        private Long totalStorageSize;

        @NameInMap("TotalUsedStorageSize")
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
             * AnalysisErrorType.
             */
            public Builder analysisErrorType(String analysisErrorType) {
                this.analysisErrorType = analysisErrorType;
                return this;
            }

            /**
             * AnalysisSuccess.
             */
            public Builder analysisSuccess(Boolean analysisSuccess) {
                this.analysisSuccess = analysisSuccess;
                return this;
            }

            /**
             * DailyIncrement.
             */
            public Builder dailyIncrement(Long dailyIncrement) {
                this.dailyIncrement = dailyIncrement;
                return this;
            }

            /**
             * EstimateAvailableDays.
             */
            public Builder estimateAvailableDays(Long estimateAvailableDays) {
                this.estimateAvailableDays = estimateAvailableDays;
                return this;
            }

            /**
             * NeedOptimizeItemList.
             */
            public Builder needOptimizeItemList(java.util.List < NeedOptimizeItemList> needOptimizeItemList) {
                this.needOptimizeItemList = needOptimizeItemList;
                return this;
            }

            /**
             * TableStats.
             */
            public Builder tableStats(java.util.List < TableStats> tableStats) {
                this.tableStats = tableStats;
                return this;
            }

            /**
             * TotalFreeStorageSize.
             */
            public Builder totalFreeStorageSize(Long totalFreeStorageSize) {
                this.totalFreeStorageSize = totalFreeStorageSize;
                return this;
            }

            /**
             * TotalStorageSize.
             */
            public Builder totalStorageSize(Long totalStorageSize) {
                this.totalStorageSize = totalStorageSize;
                return this;
            }

            /**
             * TotalUsedStorageSize.
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
        @NameInMap("AnalyzedDbCount")
        private Long analyzedDbCount;

        @NameInMap("StorageAnalysisResult")
        private StorageAnalysisResult storageAnalysisResult;

        @NameInMap("TaskFinish")
        private Boolean taskFinish;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskProgress")
        private Long taskProgress;

        @NameInMap("TaskState")
        private String taskState;

        @NameInMap("TaskSuccess")
        private Boolean taskSuccess;

        @NameInMap("TotalDbCount")
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
             * AnalyzedDbCount.
             */
            public Builder analyzedDbCount(Long analyzedDbCount) {
                this.analyzedDbCount = analyzedDbCount;
                return this;
            }

            /**
             * StorageAnalysisResult.
             */
            public Builder storageAnalysisResult(StorageAnalysisResult storageAnalysisResult) {
                this.storageAnalysisResult = storageAnalysisResult;
                return this;
            }

            /**
             * TaskFinish.
             */
            public Builder taskFinish(Boolean taskFinish) {
                this.taskFinish = taskFinish;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskProgress.
             */
            public Builder taskProgress(Long taskProgress) {
                this.taskProgress = taskProgress;
                return this;
            }

            /**
             * TaskState.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * TaskSuccess.
             */
            public Builder taskSuccess(Boolean taskSuccess) {
                this.taskSuccess = taskSuccess;
                return this;
            }

            /**
             * TotalDbCount.
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
