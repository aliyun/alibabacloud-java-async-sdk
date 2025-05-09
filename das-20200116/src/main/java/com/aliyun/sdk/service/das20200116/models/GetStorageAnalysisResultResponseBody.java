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

        private Builder(GetStorageAnalysisResultResponseBody model) {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request is successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
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
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
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

        public GetStorageAnalysisResultResponseBody build() {
            return new GetStorageAnalysisResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageAnalysisResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NeedOptimizeItemList model) {
                this.associatedData = model.associatedData;
                this.dbName = model.dbName;
                this.optimizeAdvice = model.optimizeAdvice;
                this.optimizeItemName = model.optimizeItemName;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The data associated with the items to be optimized, which is in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;autoIncrementCurrentValue&quot;: 2147483647,
             *     &quot;autoIncrementRatio&quot;: 1,
             *     &quot;dbName&quot;: &quot;testdb01&quot;,
             *     &quot;maximumValue&quot;: 2147483647,
             *     &quot;columnName&quot;: &quot;id&quot;,
             *     &quot;tableName&quot;: &quot;test_table&quot;
             * }</p>
             */
            public Builder associatedData(String associatedData) {
                this.associatedData = associatedData;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb01</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The optimization suggestion. Valid values:</p>
             * <ul>
             * <li><strong>NEED_ANALYZE_TABLE</strong>: You can execute the <code>ANALYZE TABLE</code> statement on the table during off-peak hours. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
             * <li><strong>NEED_OPTIMIZE_TABLE</strong>: You can reclaim fragments during off-peak hours.</li>
             * <li><strong>CHANGE_TABLE_ENGINE_IF_NECESSARY</strong>: Change the storage engine type of a table after risk assessment. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
             * <li><strong>AUTO_INCREMENT_ID_BE_TO_RUN_OUT</strong>: Pay attention to the usage of auto-increment IDs. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
             * <li><strong>DUPLICATE_INDEX</strong>: Optimize indexes of tables. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
             * <li><strong>TABLE_SIZE</strong>: Pay attention to the table size. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
             * <li><strong>TABLE_ROWS_AND_AVG_ROW_LENGTH</strong>: Pay attention to the number of rows in a table and the average row length. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</li>
             * <li><strong>STORAGE_USED_PERCENT</strong>: Pay attention to the space usage to prevent the instance from being locked if the instance is full.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NEED_OPTIMIZE_TABLE</p>
             */
            public Builder optimizeAdvice(String optimizeAdvice) {
                this.optimizeAdvice = optimizeAdvice;
                return this;
            }

            /**
             * <p>The item to be optimized. Valid values:</p>
             * <ul>
             * <li><p><strong>NEED_ANALYZE_TABLE</strong>: tables whose storage statistics obtained from <code>information_schema.tables</code> are 50 GB larger or smaller than the physical file sizes. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
             * </li>
             * <li><p><strong>NEED_OPTIMIZE_TABLE</strong>: tables whose space fragments are larger than 6 GB and whose fragmentation rates are greater than 30%. The fragmentation rate of a table is generally calculated based on the following formulas:</p>
             * <ul>
             * <li>ApsaraDB RDS for MySQL and PolarDB for MySQL: <code>Fragmentation rate = DataFree/(DataSize + IndexSize + DataFree)</code>. In this topic, PhyTotalSize = DataSize + IndexSize + DataFree. Thus, the fragmentation rate can be calculated based on the following formula: <code>Fragmentation rate = DataFree/PhyTotalSize</code>.</li>
             * <li>ApsaraDB for MongoDB: <code>Fragmentation rate = FragmentSize/PhyTotalSize</code>.</li>
             * </ul>
             * </li>
             * <li><p><strong>TABLE_ENGINE</strong>: tables whose storage engines are not InnoDB or XEngine. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
             * </li>
             * <li><p><strong>AUTO_INCREMENT_ID_BE_TO_RUN_OUT</strong>: tables whose usages of auto-increment IDs exceed 80%. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
             * </li>
             * <li><p><strong>DUPLICATE_INDEX</strong>: tables whose indexes are redundant or duplicate. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
             * </li>
             * <li><p><strong>TABLE_SIZE</strong>: single tables whose sizes are larger than 50 GB. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
             * </li>
             * <li><p><strong>TABLE_ROWS_AND_AVG_ROW_LENGTH</strong>: single tables that contain more than 5 million rows and whose average row lengths exceed 10 KB. This is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
             * </li>
             * <li><p><strong>TOTAL_DATA_FREE</strong>: instances whose reclaimable space is larger than 60 GB and whose total fragmentation rate is larger than 5%.</p>
             * </li>
             * <li><p><strong>STORAGE_USED_PERCENT</strong>: instances whose space usage is larger than 90%.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NEED_OPTIMIZE_TABLE</p>
             */
            public Builder optimizeItemName(String optimizeItemName) {
                this.optimizeItemName = optimizeItemName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
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
    /**
     * 
     * {@link GetStorageAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageAnalysisResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TableStats model) {
                this.avgRowLength = model.avgRowLength;
                this.dataFree = model.dataFree;
                this.dataSize = model.dataSize;
                this.dbName = model.dbName;
                this.engine = model.engine;
                this.fragmentSize = model.fragmentSize;
                this.indexSize = model.indexSize;
                this.phyTotalSize = model.phyTotalSize;
                this.physicalFileSize = model.physicalFileSize;
                this.tableName = model.tableName;
                this.tableRows = model.tableRows;
                this.tableType = model.tableType;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The average length of rows. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>154</p>
             */
            public Builder avgRowLength(Long avgRowLength) {
                this.avgRowLength = avgRowLength;
                return this;
            }

            /**
             * <p>The size of space fragments. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters. The fragmentation rate of a table is generally calculated based on the following formula: <code>Fragmentation rate = DataFree/(DataSize + IndexSize + DataFree)</code>. In this topic, <code>Fragmentation rate = DataFree/PhyTotalSize</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>7340032</p>
             */
            public Builder dataFree(Long dataFree) {
                this.dataFree = dataFree;
                return this;
            }

            /**
             * <ul>
             * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this parameter indicates the amount of space occupied by data. Unit: bytes.</li>
             * <li>For ApsaraDB for MongoDB instances, this parameter indicates the size of uncompressed data, that is, the amount of data. Unit: bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1982857216</p>
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb01</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The type of the storage engine used by the table.</p>
             * <blockquote>
             * <p> This parameter is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>InnoDB</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The size of space that can be reclaimed. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is applicable only to ApsaraDB for MongoDB instances. <code>Fragmentation rate = FragmentSize/PhyTotalSize</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>362221568</p>
             */
            public Builder fragmentSize(Long fragmentSize) {
                this.fragmentSize = fragmentSize;
                return this;
            }

            /**
             * <p>The storage space occupied by indexes. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1022296064</p>
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * <p>The storage space of the table. Unit: bytes.</p>
             * <blockquote>
             * <p> For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, the value of the parameter is the sum of <strong>DataSize</strong>, <strong>IndexSize</strong>, and <strong>DataFree</strong>. For ApsaraDB for MongoDB instances, the value of this parameter is the sum of <strong>DataSize</strong> and <strong>IndexSize</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3012493312</p>
             */
            public Builder phyTotalSize(Long phyTotalSize) {
                this.phyTotalSize = phyTotalSize;
                return this;
            }

            /**
             * <p>The physical file size of the table. Unit: bytes.</p>
             * <blockquote>
             * <p> This parameter is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters. Data of specific database instances cannot be obtained due to deployment mode.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3057655808</p>
             */
            public Builder physicalFileSize(Long physicalFileSize) {
                this.physicalFileSize = physicalFileSize;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The number of rows in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>12794732</p>
             */
            public Builder tableRows(Long tableRows) {
                this.tableRows = tableRows;
                return this;
            }

            /**
             * <p>The type of the table.</p>
             * <blockquote>
             * <p> This parameter is applicable only to ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>BASE TABLE</p>
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            /**
             * <ul>
             * <li>For ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters, this parameter indicates the amount of space occupied by table data and indexes. Unit: bytes. The value is the sum of <strong>DataSize</strong> and <strong>IndexSize</strong>.</li>
             * <li>For ApsaraDB for MongoDB instances, this parameter indicates the actual size of space allocated by Block Manager. Unit: Bytes. The compression ratio of an ApsaraDB for MongoDB instance is calculated based on the following formula: <code>Compression ratio = TotalSize/DataSize</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3005153280</p>
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
    /**
     * 
     * {@link GetStorageAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageAnalysisResultResponseBody</p>
     */
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
        private java.util.List<NeedOptimizeItemList> needOptimizeItemList;

        @com.aliyun.core.annotation.NameInMap("TableStats")
        private java.util.List<TableStats> tableStats;

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
        public java.util.List<NeedOptimizeItemList> getNeedOptimizeItemList() {
            return this.needOptimizeItemList;
        }

        /**
         * @return tableStats
         */
        public java.util.List<TableStats> getTableStats() {
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
            private java.util.List<NeedOptimizeItemList> needOptimizeItemList; 
            private java.util.List<TableStats> tableStats; 
            private Long totalFreeStorageSize; 
            private Long totalStorageSize; 
            private Long totalUsedStorageSize; 

            private Builder() {
            } 

            private Builder(StorageAnalysisResult model) {
                this.analysisErrorType = model.analysisErrorType;
                this.analysisSuccess = model.analysisSuccess;
                this.dailyIncrement = model.dailyIncrement;
                this.estimateAvailableDays = model.estimateAvailableDays;
                this.needOptimizeItemList = model.needOptimizeItemList;
                this.tableStats = model.tableStats;
                this.totalFreeStorageSize = model.totalFreeStorageSize;
                this.totalStorageSize = model.totalStorageSize;
                this.totalUsedStorageSize = model.totalUsedStorageSize;
            } 

            /**
             * <p>The reason why the analysis on the database and table fails.</p>
             * <ul>
             * <li><strong>DB_OR_TABLE_NOT_EXIST</strong>: The specified database or table does not exist.</li>
             * <li><strong>DB_NOT_EXIST</strong>: The specified database does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DB_NOT_EXIST</p>
             */
            public Builder analysisErrorType(String analysisErrorType) {
                this.analysisErrorType = analysisErrorType;
                return this;
            }

            /**
             * <p>Indicates whether the analysis on the database and table is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder analysisSuccess(Boolean analysisSuccess) {
                this.analysisSuccess = analysisSuccess;
                return this;
            }

            /**
             * <p>The estimated average daily growth of the used storage space in the previous seven days. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dailyIncrement(Long dailyIncrement) {
                this.dailyIncrement = dailyIncrement;
                return this;
            }

            /**
             * <p>The estimated number of days for which the remaining storage space is available.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder estimateAvailableDays(Long estimateAvailableDays) {
                this.estimateAvailableDays = estimateAvailableDays;
                return this;
            }

            /**
             * <p>The items to be optimized, which are generated based on DAS default rules. You can ignore these items based on your business requirements, and create custom rules to generate items to be optimized based on other basic data that is returned.</p>
             */
            public Builder needOptimizeItemList(java.util.List<NeedOptimizeItemList> needOptimizeItemList) {
                this.needOptimizeItemList = needOptimizeItemList;
                return this;
            }

            /**
             * <p>The information about the table.</p>
             */
            public Builder tableStats(java.util.List<TableStats> tableStats) {
                this.tableStats = tableStats;
                return this;
            }

            /**
             * <p>The size of remaining storage.</p>
             * <blockquote>
             * <p> Unit: bytes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>146403229696</p>
             */
            public Builder totalFreeStorageSize(Long totalFreeStorageSize) {
                this.totalFreeStorageSize = totalFreeStorageSize;
                return this;
            }

            /**
             * <p>The total size of instance storage.</p>
             * <blockquote>
             * <p> Unit: bytes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>214748364800</p>
             */
            public Builder totalStorageSize(Long totalStorageSize) {
                this.totalStorageSize = totalStorageSize;
                return this;
            }

            /**
             * <p>The size of used storage.</p>
             * <blockquote>
             * <p> Unit: bytes.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>68345135104</p>
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
    /**
     * 
     * {@link GetStorageAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageAnalysisResultResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.analyzedDbCount = model.analyzedDbCount;
                this.storageAnalysisResult = model.storageAnalysisResult;
                this.taskFinish = model.taskFinish;
                this.taskId = model.taskId;
                this.taskProgress = model.taskProgress;
                this.taskState = model.taskState;
                this.taskSuccess = model.taskSuccess;
                this.totalDbCount = model.totalDbCount;
            } 

            /**
             * <p>The number of databases that have been analyzed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder analyzedDbCount(Long analyzedDbCount) {
                this.analyzedDbCount = analyzedDbCount;
                return this;
            }

            /**
             * <p>The details of storage analysis.</p>
             */
            public Builder storageAnalysisResult(StorageAnalysisResult storageAnalysisResult) {
                this.storageAnalysisResult = storageAnalysisResult;
                return this;
            }

            /**
             * <p>Indicates whether the task is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder taskFinish(Boolean taskFinish) {
                this.taskFinish = taskFinish;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>910f83f4b96df0524ddc5749f615****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task progress.</p>
             * <blockquote>
             * <p> Valid values are integers that range from 0 to 100.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder taskProgress(Long taskProgress) {
                this.taskProgress = taskProgress;
                return this;
            }

            /**
             * <p>The status of the storage analysis task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is being initialized.</li>
             * <li><strong>PENDING</strong>: The task is being queued for execution.</li>
             * <li><strong>RECEIVED</strong>: The task is received for execution.</li>
             * <li><strong>RUNNING</strong>: The task is being executed.</li>
             * <li><strong>RETRY</strong>: The task is being retried.</li>
             * <li><strong>SUCCESS</strong>: The task succeeds.</li>
             * <li><strong>FAILURE</strong>: The task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * <p>Indicates whether the task is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder taskSuccess(Boolean taskSuccess) {
                this.taskSuccess = taskSuccess;
                return this;
            }

            /**
             * <p>The number of databases that need to be analyzed in the storage analysis task.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
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
