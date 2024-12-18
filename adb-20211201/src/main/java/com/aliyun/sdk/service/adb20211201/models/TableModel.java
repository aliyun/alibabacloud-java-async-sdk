// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link TableModel} extends {@link TeaModel}
 *
 * <p>TableModel</p>
 */
public class TableModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArchiveType")
    private String archiveType;

    @com.aliyun.core.annotation.NameInMap("BlockSize")
    private Long blockSize;

    @com.aliyun.core.annotation.NameInMap("Bucket")
    private Long bucket;

    @com.aliyun.core.annotation.NameInMap("BucketCount")
    private Long bucketCount;

    @com.aliyun.core.annotation.NameInMap("Cols")
    private java.util.List<FieldSchemaModel> cols;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("Compression")
    private String compression;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CurrentVersion")
    private Long currentVersion;

    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("DictEncode")
    private Boolean dictEncode;

    @com.aliyun.core.annotation.NameInMap("DistributeColumns")
    private java.util.List<FieldSchemaModel> distributeColumns;

    @com.aliyun.core.annotation.NameInMap("DistributeType")
    private String distributeType;

    @com.aliyun.core.annotation.NameInMap("EnableDfs")
    private Boolean enableDfs;

    @com.aliyun.core.annotation.NameInMap("HotPartitionCount")
    private Long hotPartitionCount;

    @com.aliyun.core.annotation.NameInMap("Indexes")
    private java.util.List<CstoreIndexModel> indexes;

    @com.aliyun.core.annotation.NameInMap("IsAllIndex")
    private Boolean isAllIndex;

    @com.aliyun.core.annotation.NameInMap("IsFulltextDict")
    private Boolean isFulltextDict;

    @com.aliyun.core.annotation.NameInMap("MaxColumnId")
    private Long maxColumnId;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.NameInMap("PartitionColumn")
    private String partitionColumn;

    @com.aliyun.core.annotation.NameInMap("PartitionCount")
    private Long partitionCount;

    @com.aliyun.core.annotation.NameInMap("PartitionKeys")
    private java.util.List<FieldSchemaModel> partitionKeys;

    @com.aliyun.core.annotation.NameInMap("PartitionType")
    private String partitionType;

    @com.aliyun.core.annotation.NameInMap("PhysicalDatabaseName")
    private String physicalDatabaseName;

    @com.aliyun.core.annotation.NameInMap("PhysicalTableName")
    private String physicalTableName;

    @com.aliyun.core.annotation.NameInMap("PreviousVersion")
    private Long previousVersion;

    @com.aliyun.core.annotation.NameInMap("RawTableName")
    private String rawTableName;

    @com.aliyun.core.annotation.NameInMap("RouteColumns")
    private java.util.List<FieldSchemaModel> routeColumns;

    @com.aliyun.core.annotation.NameInMap("RouteEffectiveColumn")
    private FieldSchemaModel routeEffectiveColumn;

    @com.aliyun.core.annotation.NameInMap("RouteType")
    private String routeType;

    @com.aliyun.core.annotation.NameInMap("RtEngineType")
    private String rtEngineType;

    @com.aliyun.core.annotation.NameInMap("RtIndexAll")
    private Boolean rtIndexAll;

    @com.aliyun.core.annotation.NameInMap("RtModeType")
    private String rtModeType;

    @com.aliyun.core.annotation.NameInMap("Sd")
    private StorageDescriptorModel sd;

    @com.aliyun.core.annotation.NameInMap("StoragePolicy")
    private String storagePolicy;

    @com.aliyun.core.annotation.NameInMap("SubpartitionColumn")
    private String subpartitionColumn;

    @com.aliyun.core.annotation.NameInMap("SubpartitionCount")
    private Long subpartitionCount;

    @com.aliyun.core.annotation.NameInMap("SubpartitionType")
    private String subpartitionType;

    @com.aliyun.core.annotation.NameInMap("TableEngineName")
    private String tableEngineName;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.NameInMap("TableType")
    private String tableType;

    @com.aliyun.core.annotation.NameInMap("TblId")
    private Long tblId;

    @com.aliyun.core.annotation.NameInMap("Temporary")
    private Boolean temporary;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("ViewExpandedText")
    private String viewExpandedText;

    @com.aliyun.core.annotation.NameInMap("ViewOriginalText")
    private String viewOriginalText;

    @com.aliyun.core.annotation.NameInMap("ViewSecurityMode")
    private String viewSecurityMode;

    private TableModel(Builder builder) {
        this.archiveType = builder.archiveType;
        this.blockSize = builder.blockSize;
        this.bucket = builder.bucket;
        this.bucketCount = builder.bucketCount;
        this.cols = builder.cols;
        this.comment = builder.comment;
        this.compression = builder.compression;
        this.createTime = builder.createTime;
        this.currentVersion = builder.currentVersion;
        this.dbName = builder.dbName;
        this.dictEncode = builder.dictEncode;
        this.distributeColumns = builder.distributeColumns;
        this.distributeType = builder.distributeType;
        this.enableDfs = builder.enableDfs;
        this.hotPartitionCount = builder.hotPartitionCount;
        this.indexes = builder.indexes;
        this.isAllIndex = builder.isAllIndex;
        this.isFulltextDict = builder.isFulltextDict;
        this.maxColumnId = builder.maxColumnId;
        this.parameters = builder.parameters;
        this.partitionColumn = builder.partitionColumn;
        this.partitionCount = builder.partitionCount;
        this.partitionKeys = builder.partitionKeys;
        this.partitionType = builder.partitionType;
        this.physicalDatabaseName = builder.physicalDatabaseName;
        this.physicalTableName = builder.physicalTableName;
        this.previousVersion = builder.previousVersion;
        this.rawTableName = builder.rawTableName;
        this.routeColumns = builder.routeColumns;
        this.routeEffectiveColumn = builder.routeEffectiveColumn;
        this.routeType = builder.routeType;
        this.rtEngineType = builder.rtEngineType;
        this.rtIndexAll = builder.rtIndexAll;
        this.rtModeType = builder.rtModeType;
        this.sd = builder.sd;
        this.storagePolicy = builder.storagePolicy;
        this.subpartitionColumn = builder.subpartitionColumn;
        this.subpartitionCount = builder.subpartitionCount;
        this.subpartitionType = builder.subpartitionType;
        this.tableEngineName = builder.tableEngineName;
        this.tableName = builder.tableName;
        this.tableType = builder.tableType;
        this.tblId = builder.tblId;
        this.temporary = builder.temporary;
        this.updateTime = builder.updateTime;
        this.viewExpandedText = builder.viewExpandedText;
        this.viewOriginalText = builder.viewOriginalText;
        this.viewSecurityMode = builder.viewSecurityMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableModel create() {
        return builder().build();
    }

    /**
     * @return archiveType
     */
    public String getArchiveType() {
        return this.archiveType;
    }

    /**
     * @return blockSize
     */
    public Long getBlockSize() {
        return this.blockSize;
    }

    /**
     * @return bucket
     */
    public Long getBucket() {
        return this.bucket;
    }

    /**
     * @return bucketCount
     */
    public Long getBucketCount() {
        return this.bucketCount;
    }

    /**
     * @return cols
     */
    public java.util.List<FieldSchemaModel> getCols() {
        return this.cols;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return compression
     */
    public String getCompression() {
        return this.compression;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return currentVersion
     */
    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dictEncode
     */
    public Boolean getDictEncode() {
        return this.dictEncode;
    }

    /**
     * @return distributeColumns
     */
    public java.util.List<FieldSchemaModel> getDistributeColumns() {
        return this.distributeColumns;
    }

    /**
     * @return distributeType
     */
    public String getDistributeType() {
        return this.distributeType;
    }

    /**
     * @return enableDfs
     */
    public Boolean getEnableDfs() {
        return this.enableDfs;
    }

    /**
     * @return hotPartitionCount
     */
    public Long getHotPartitionCount() {
        return this.hotPartitionCount;
    }

    /**
     * @return indexes
     */
    public java.util.List<CstoreIndexModel> getIndexes() {
        return this.indexes;
    }

    /**
     * @return isAllIndex
     */
    public Boolean getIsAllIndex() {
        return this.isAllIndex;
    }

    /**
     * @return isFulltextDict
     */
    public Boolean getIsFulltextDict() {
        return this.isFulltextDict;
    }

    /**
     * @return maxColumnId
     */
    public Long getMaxColumnId() {
        return this.maxColumnId;
    }

    /**
     * @return parameters
     */
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * @return partitionColumn
     */
    public String getPartitionColumn() {
        return this.partitionColumn;
    }

    /**
     * @return partitionCount
     */
    public Long getPartitionCount() {
        return this.partitionCount;
    }

    /**
     * @return partitionKeys
     */
    public java.util.List<FieldSchemaModel> getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return partitionType
     */
    public String getPartitionType() {
        return this.partitionType;
    }

    /**
     * @return physicalDatabaseName
     */
    public String getPhysicalDatabaseName() {
        return this.physicalDatabaseName;
    }

    /**
     * @return physicalTableName
     */
    public String getPhysicalTableName() {
        return this.physicalTableName;
    }

    /**
     * @return previousVersion
     */
    public Long getPreviousVersion() {
        return this.previousVersion;
    }

    /**
     * @return rawTableName
     */
    public String getRawTableName() {
        return this.rawTableName;
    }

    /**
     * @return routeColumns
     */
    public java.util.List<FieldSchemaModel> getRouteColumns() {
        return this.routeColumns;
    }

    /**
     * @return routeEffectiveColumn
     */
    public FieldSchemaModel getRouteEffectiveColumn() {
        return this.routeEffectiveColumn;
    }

    /**
     * @return routeType
     */
    public String getRouteType() {
        return this.routeType;
    }

    /**
     * @return rtEngineType
     */
    public String getRtEngineType() {
        return this.rtEngineType;
    }

    /**
     * @return rtIndexAll
     */
    public Boolean getRtIndexAll() {
        return this.rtIndexAll;
    }

    /**
     * @return rtModeType
     */
    public String getRtModeType() {
        return this.rtModeType;
    }

    /**
     * @return sd
     */
    public StorageDescriptorModel getSd() {
        return this.sd;
    }

    /**
     * @return storagePolicy
     */
    public String getStoragePolicy() {
        return this.storagePolicy;
    }

    /**
     * @return subpartitionColumn
     */
    public String getSubpartitionColumn() {
        return this.subpartitionColumn;
    }

    /**
     * @return subpartitionCount
     */
    public Long getSubpartitionCount() {
        return this.subpartitionCount;
    }

    /**
     * @return subpartitionType
     */
    public String getSubpartitionType() {
        return this.subpartitionType;
    }

    /**
     * @return tableEngineName
     */
    public String getTableEngineName() {
        return this.tableEngineName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tableType
     */
    public String getTableType() {
        return this.tableType;
    }

    /**
     * @return tblId
     */
    public Long getTblId() {
        return this.tblId;
    }

    /**
     * @return temporary
     */
    public Boolean getTemporary() {
        return this.temporary;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return viewExpandedText
     */
    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    /**
     * @return viewOriginalText
     */
    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    /**
     * @return viewSecurityMode
     */
    public String getViewSecurityMode() {
        return this.viewSecurityMode;
    }

    public static final class Builder {
        private String archiveType; 
        private Long blockSize; 
        private Long bucket; 
        private Long bucketCount; 
        private java.util.List<FieldSchemaModel> cols; 
        private String comment; 
        private String compression; 
        private String createTime; 
        private Long currentVersion; 
        private String dbName; 
        private Boolean dictEncode; 
        private java.util.List<FieldSchemaModel> distributeColumns; 
        private String distributeType; 
        private Boolean enableDfs; 
        private Long hotPartitionCount; 
        private java.util.List<CstoreIndexModel> indexes; 
        private Boolean isAllIndex; 
        private Boolean isFulltextDict; 
        private Long maxColumnId; 
        private java.util.Map<String, String> parameters; 
        private String partitionColumn; 
        private Long partitionCount; 
        private java.util.List<FieldSchemaModel> partitionKeys; 
        private String partitionType; 
        private String physicalDatabaseName; 
        private String physicalTableName; 
        private Long previousVersion; 
        private String rawTableName; 
        private java.util.List<FieldSchemaModel> routeColumns; 
        private FieldSchemaModel routeEffectiveColumn; 
        private String routeType; 
        private String rtEngineType; 
        private Boolean rtIndexAll; 
        private String rtModeType; 
        private StorageDescriptorModel sd; 
        private String storagePolicy; 
        private String subpartitionColumn; 
        private Long subpartitionCount; 
        private String subpartitionType; 
        private String tableEngineName; 
        private String tableName; 
        private String tableType; 
        private Long tblId; 
        private Boolean temporary; 
        private String updateTime; 
        private String viewExpandedText; 
        private String viewOriginalText; 
        private String viewSecurityMode; 

        /**
         * ArchiveType.
         */
        public Builder archiveType(String archiveType) {
            this.archiveType = archiveType;
            return this;
        }

        /**
         * BlockSize.
         */
        public Builder blockSize(Long blockSize) {
            this.blockSize = blockSize;
            return this;
        }

        /**
         * Bucket.
         */
        public Builder bucket(Long bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * BucketCount.
         */
        public Builder bucketCount(Long bucketCount) {
            this.bucketCount = bucketCount;
            return this;
        }

        /**
         * Cols.
         */
        public Builder cols(java.util.List<FieldSchemaModel> cols) {
            this.cols = cols;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Compression.
         */
        public Builder compression(String compression) {
            this.compression = compression;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CurrentVersion.
         */
        public Builder currentVersion(Long currentVersion) {
            this.currentVersion = currentVersion;
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
         * DictEncode.
         */
        public Builder dictEncode(Boolean dictEncode) {
            this.dictEncode = dictEncode;
            return this;
        }

        /**
         * DistributeColumns.
         */
        public Builder distributeColumns(java.util.List<FieldSchemaModel> distributeColumns) {
            this.distributeColumns = distributeColumns;
            return this;
        }

        /**
         * DistributeType.
         */
        public Builder distributeType(String distributeType) {
            this.distributeType = distributeType;
            return this;
        }

        /**
         * EnableDfs.
         */
        public Builder enableDfs(Boolean enableDfs) {
            this.enableDfs = enableDfs;
            return this;
        }

        /**
         * HotPartitionCount.
         */
        public Builder hotPartitionCount(Long hotPartitionCount) {
            this.hotPartitionCount = hotPartitionCount;
            return this;
        }

        /**
         * Indexes.
         */
        public Builder indexes(java.util.List<CstoreIndexModel> indexes) {
            this.indexes = indexes;
            return this;
        }

        /**
         * IsAllIndex.
         */
        public Builder isAllIndex(Boolean isAllIndex) {
            this.isAllIndex = isAllIndex;
            return this;
        }

        /**
         * IsFulltextDict.
         */
        public Builder isFulltextDict(Boolean isFulltextDict) {
            this.isFulltextDict = isFulltextDict;
            return this;
        }

        /**
         * MaxColumnId.
         */
        public Builder maxColumnId(Long maxColumnId) {
            this.maxColumnId = maxColumnId;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * PartitionColumn.
         */
        public Builder partitionColumn(String partitionColumn) {
            this.partitionColumn = partitionColumn;
            return this;
        }

        /**
         * PartitionCount.
         */
        public Builder partitionCount(Long partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        /**
         * PartitionKeys.
         */
        public Builder partitionKeys(java.util.List<FieldSchemaModel> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * PartitionType.
         */
        public Builder partitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }

        /**
         * PhysicalDatabaseName.
         */
        public Builder physicalDatabaseName(String physicalDatabaseName) {
            this.physicalDatabaseName = physicalDatabaseName;
            return this;
        }

        /**
         * PhysicalTableName.
         */
        public Builder physicalTableName(String physicalTableName) {
            this.physicalTableName = physicalTableName;
            return this;
        }

        /**
         * PreviousVersion.
         */
        public Builder previousVersion(Long previousVersion) {
            this.previousVersion = previousVersion;
            return this;
        }

        /**
         * RawTableName.
         */
        public Builder rawTableName(String rawTableName) {
            this.rawTableName = rawTableName;
            return this;
        }

        /**
         * RouteColumns.
         */
        public Builder routeColumns(java.util.List<FieldSchemaModel> routeColumns) {
            this.routeColumns = routeColumns;
            return this;
        }

        /**
         * RouteEffectiveColumn.
         */
        public Builder routeEffectiveColumn(FieldSchemaModel routeEffectiveColumn) {
            this.routeEffectiveColumn = routeEffectiveColumn;
            return this;
        }

        /**
         * RouteType.
         */
        public Builder routeType(String routeType) {
            this.routeType = routeType;
            return this;
        }

        /**
         * RtEngineType.
         */
        public Builder rtEngineType(String rtEngineType) {
            this.rtEngineType = rtEngineType;
            return this;
        }

        /**
         * RtIndexAll.
         */
        public Builder rtIndexAll(Boolean rtIndexAll) {
            this.rtIndexAll = rtIndexAll;
            return this;
        }

        /**
         * RtModeType.
         */
        public Builder rtModeType(String rtModeType) {
            this.rtModeType = rtModeType;
            return this;
        }

        /**
         * Sd.
         */
        public Builder sd(StorageDescriptorModel sd) {
            this.sd = sd;
            return this;
        }

        /**
         * StoragePolicy.
         */
        public Builder storagePolicy(String storagePolicy) {
            this.storagePolicy = storagePolicy;
            return this;
        }

        /**
         * SubpartitionColumn.
         */
        public Builder subpartitionColumn(String subpartitionColumn) {
            this.subpartitionColumn = subpartitionColumn;
            return this;
        }

        /**
         * SubpartitionCount.
         */
        public Builder subpartitionCount(Long subpartitionCount) {
            this.subpartitionCount = subpartitionCount;
            return this;
        }

        /**
         * SubpartitionType.
         */
        public Builder subpartitionType(String subpartitionType) {
            this.subpartitionType = subpartitionType;
            return this;
        }

        /**
         * TableEngineName.
         */
        public Builder tableEngineName(String tableEngineName) {
            this.tableEngineName = tableEngineName;
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
         * TableType.
         */
        public Builder tableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        /**
         * TblId.
         */
        public Builder tblId(Long tblId) {
            this.tblId = tblId;
            return this;
        }

        /**
         * Temporary.
         */
        public Builder temporary(Boolean temporary) {
            this.temporary = temporary;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * ViewExpandedText.
         */
        public Builder viewExpandedText(String viewExpandedText) {
            this.viewExpandedText = viewExpandedText;
            return this;
        }

        /**
         * ViewOriginalText.
         */
        public Builder viewOriginalText(String viewOriginalText) {
            this.viewOriginalText = viewOriginalText;
            return this;
        }

        /**
         * ViewSecurityMode.
         */
        public Builder viewSecurityMode(String viewSecurityMode) {
            this.viewSecurityMode = viewSecurityMode;
            return this;
        }

        public TableModel build() {
            return new TableModel(this);
        } 

    } 

}
