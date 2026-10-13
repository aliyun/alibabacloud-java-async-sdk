// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListMetaProfilingResultTablePageResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaProfilingResultTablePageResponseBody</p>
 */
public class ListMetaProfilingResultTablePageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListMetaProfilingResultTablePageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaProfilingResultTablePageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMetaProfilingResultTablePageResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of table profiling results. For the element structure, see the descriptions of the sub-fields.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. This parameter is an empty string if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. This parameter is an empty string if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter is invalid or missing.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The current page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of records to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues of this call.</p>
         * 
         * <strong>example:</strong>
         * <p>3F45B8C1-2A6E-4C9B-9E1F-7D2A1B0C5E66</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure. If the call fails, troubleshoot the issue based on errCode and errMessage.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records that meet the conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMetaProfilingResultTablePageResponseBody build() {
            return new ListMetaProfilingResultTablePageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaProfilingResultTablePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaProfilingResultTablePageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("averageFileSize")
        private String averageFileSize;

        @com.aliyun.core.annotation.NameInMap("averagePartitionSize")
        private String averagePartitionSize;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("dbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("ds")
        private String ds;

        @com.aliyun.core.annotation.NameInMap("engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("fileNum")
        private Integer fileNum;

        @com.aliyun.core.annotation.NameInMap("isExternal")
        private Integer isExternal;

        @com.aliyun.core.annotation.NameInMap("isPtTable")
        private Integer isPtTable;

        @com.aliyun.core.annotation.NameInMap("isTransactional")
        private Integer isTransactional;

        @com.aliyun.core.annotation.NameInMap("lastAccessed")
        private String lastAccessed;

        @com.aliyun.core.annotation.NameInMap("lastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("maxPtCrtTime")
        private String maxPtCrtTime;

        @com.aliyun.core.annotation.NameInMap("maximumPartitionList")
        private java.util.List<String> maximumPartitionList;

        @com.aliyun.core.annotation.NameInMap("migrationProcess")
        private Double migrationProcess;

        @com.aliyun.core.annotation.NameInMap("migrationStatus")
        private String migrationStatus;

        @com.aliyun.core.annotation.NameInMap("minPtCrtTime")
        private String minPtCrtTime;

        @com.aliyun.core.annotation.NameInMap("minimumPartitionList")
        private java.util.List<String> minimumPartitionList;

        @com.aliyun.core.annotation.NameInMap("newAdded")
        private Integer newAdded;

        @com.aliyun.core.annotation.NameInMap("partitionFieldNameList")
        private java.util.List<String> partitionFieldNameList;

        @com.aliyun.core.annotation.NameInMap("partitionNum")
        private Integer partitionNum;

        @com.aliyun.core.annotation.NameInMap("recordCount")
        private Long recordCount;

        @com.aliyun.core.annotation.NameInMap("storageSize")
        private String storageSize;

        @com.aliyun.core.annotation.NameInMap("tableComment")
        private String tableComment;

        @com.aliyun.core.annotation.NameInMap("tableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("tableModTime")
        private String tableModTime;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("tableType")
        private String tableType;

        private Data(Builder builder) {
            this.averageFileSize = builder.averageFileSize;
            this.averagePartitionSize = builder.averagePartitionSize;
            this.created = builder.created;
            this.dbName = builder.dbName;
            this.ds = builder.ds;
            this.engine = builder.engine;
            this.fileNum = builder.fileNum;
            this.isExternal = builder.isExternal;
            this.isPtTable = builder.isPtTable;
            this.isTransactional = builder.isTransactional;
            this.lastAccessed = builder.lastAccessed;
            this.lastModified = builder.lastModified;
            this.maxPtCrtTime = builder.maxPtCrtTime;
            this.maximumPartitionList = builder.maximumPartitionList;
            this.migrationProcess = builder.migrationProcess;
            this.migrationStatus = builder.migrationStatus;
            this.minPtCrtTime = builder.minPtCrtTime;
            this.minimumPartitionList = builder.minimumPartitionList;
            this.newAdded = builder.newAdded;
            this.partitionFieldNameList = builder.partitionFieldNameList;
            this.partitionNum = builder.partitionNum;
            this.recordCount = builder.recordCount;
            this.storageSize = builder.storageSize;
            this.tableComment = builder.tableComment;
            this.tableId = builder.tableId;
            this.tableModTime = builder.tableModTime;
            this.tableName = builder.tableName;
            this.tableType = builder.tableType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return averageFileSize
         */
        public String getAverageFileSize() {
            return this.averageFileSize;
        }

        /**
         * @return averagePartitionSize
         */
        public String getAveragePartitionSize() {
            return this.averagePartitionSize;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return ds
         */
        public String getDs() {
            return this.ds;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return fileNum
         */
        public Integer getFileNum() {
            return this.fileNum;
        }

        /**
         * @return isExternal
         */
        public Integer getIsExternal() {
            return this.isExternal;
        }

        /**
         * @return isPtTable
         */
        public Integer getIsPtTable() {
            return this.isPtTable;
        }

        /**
         * @return isTransactional
         */
        public Integer getIsTransactional() {
            return this.isTransactional;
        }

        /**
         * @return lastAccessed
         */
        public String getLastAccessed() {
            return this.lastAccessed;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return maxPtCrtTime
         */
        public String getMaxPtCrtTime() {
            return this.maxPtCrtTime;
        }

        /**
         * @return maximumPartitionList
         */
        public java.util.List<String> getMaximumPartitionList() {
            return this.maximumPartitionList;
        }

        /**
         * @return migrationProcess
         */
        public Double getMigrationProcess() {
            return this.migrationProcess;
        }

        /**
         * @return migrationStatus
         */
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        /**
         * @return minPtCrtTime
         */
        public String getMinPtCrtTime() {
            return this.minPtCrtTime;
        }

        /**
         * @return minimumPartitionList
         */
        public java.util.List<String> getMinimumPartitionList() {
            return this.minimumPartitionList;
        }

        /**
         * @return newAdded
         */
        public Integer getNewAdded() {
            return this.newAdded;
        }

        /**
         * @return partitionFieldNameList
         */
        public java.util.List<String> getPartitionFieldNameList() {
            return this.partitionFieldNameList;
        }

        /**
         * @return partitionNum
         */
        public Integer getPartitionNum() {
            return this.partitionNum;
        }

        /**
         * @return recordCount
         */
        public Long getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return storageSize
         */
        public String getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return tableComment
         */
        public String getTableComment() {
            return this.tableComment;
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableModTime
         */
        public String getTableModTime() {
            return this.tableModTime;
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

        public static final class Builder {
            private String averageFileSize; 
            private String averagePartitionSize; 
            private String created; 
            private String dbName; 
            private String ds; 
            private String engine; 
            private Integer fileNum; 
            private Integer isExternal; 
            private Integer isPtTable; 
            private Integer isTransactional; 
            private String lastAccessed; 
            private String lastModified; 
            private String maxPtCrtTime; 
            private java.util.List<String> maximumPartitionList; 
            private Double migrationProcess; 
            private String migrationStatus; 
            private String minPtCrtTime; 
            private java.util.List<String> minimumPartitionList; 
            private Integer newAdded; 
            private java.util.List<String> partitionFieldNameList; 
            private Integer partitionNum; 
            private Long recordCount; 
            private String storageSize; 
            private String tableComment; 
            private String tableId; 
            private String tableModTime; 
            private String tableName; 
            private String tableType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.averageFileSize = model.averageFileSize;
                this.averagePartitionSize = model.averagePartitionSize;
                this.created = model.created;
                this.dbName = model.dbName;
                this.ds = model.ds;
                this.engine = model.engine;
                this.fileNum = model.fileNum;
                this.isExternal = model.isExternal;
                this.isPtTable = model.isPtTable;
                this.isTransactional = model.isTransactional;
                this.lastAccessed = model.lastAccessed;
                this.lastModified = model.lastModified;
                this.maxPtCrtTime = model.maxPtCrtTime;
                this.maximumPartitionList = model.maximumPartitionList;
                this.migrationProcess = model.migrationProcess;
                this.migrationStatus = model.migrationStatus;
                this.minPtCrtTime = model.minPtCrtTime;
                this.minimumPartitionList = model.minimumPartitionList;
                this.newAdded = model.newAdded;
                this.partitionFieldNameList = model.partitionFieldNameList;
                this.partitionNum = model.partitionNum;
                this.recordCount = model.recordCount;
                this.storageSize = model.storageSize;
                this.tableComment = model.tableComment;
                this.tableId = model.tableId;
                this.tableModTime = model.tableModTime;
                this.tableName = model.tableName;
                this.tableType = model.tableType;
            } 

            /**
             * <p>The average file size.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder averageFileSize(String averageFileSize) {
                this.averageFileSize = averageFileSize;
                return this;
            }

            /**
             * <p>The average partition size.</p>
             * 
             * <strong>example:</strong>
             * <p>1048576</p>
             */
            public Builder averagePartitionSize(String averagePartitionSize) {
                this.averagePartitionSize = averagePartitionSize;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-19 22:00:02</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The name of the database, which is used to filter results by database.</p>
             * 
             * <strong>example:</strong>
             * <p>ods</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The value of the data partition to which the table belongs, which identifies the partition to which this row of data belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>20240719</p>
             */
            public Builder ds(String ds) {
                this.ds = ds;
                return this;
            }

            /**
             * <p>The type of storage engine used by the table.</p>
             * 
             * <strong>example:</strong>
             * <p>PARQUET</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder fileNum(Integer fileNum) {
                this.fileNum = fileNum;
                return this;
            }

            /**
             * <p>Indicates whether the table is an external table.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isExternal(Integer isExternal) {
                this.isExternal = isExternal;
                return this;
            }

            /**
             * <p>Indicates whether the table is a partitioned table.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isPtTable(Integer isPtTable) {
                this.isPtTable = isPtTable;
                return this;
            }

            /**
             * <p>Indicates whether the table is a transactional table.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isTransactional(Integer isTransactional) {
                this.isTransactional = isTransactional;
                return this;
            }

            /**
             * <p>The last access time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-19 22:00:02</p>
             */
            public Builder lastAccessed(String lastAccessed) {
                this.lastAccessed = lastAccessed;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-19 22:00:02</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The creation time of the largest partition.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-19 22:00:02</p>
             */
            public Builder maxPtCrtTime(String maxPtCrtTime) {
                this.maxPtCrtTime = maxPtCrtTime;
                return this;
            }

            /**
             * <p>The list of largest partitions.</p>
             */
            public Builder maximumPartitionList(java.util.List<String> maximumPartitionList) {
                this.maximumPartitionList = maximumPartitionList;
                return this;
            }

            /**
             * <p>The migration progress percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder migrationProcess(Double migrationProcess) {
                this.migrationProcess = migrationProcess;
                return this;
            }

            /**
             * <p>The migration status, which is used to filter by migration progress or indicate the migration status of an object.</p>
             * 
             * <strong>example:</strong>
             * <p>DONE</p>
             */
            public Builder migrationStatus(String migrationStatus) {
                this.migrationStatus = migrationStatus;
                return this;
            }

            /**
             * <p>The creation time of the smallest partition.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01 08:00:00</p>
             */
            public Builder minPtCrtTime(String minPtCrtTime) {
                this.minPtCrtTime = minPtCrtTime;
                return this;
            }

            /**
             * <p>The list of smallest partitions.</p>
             */
            public Builder minimumPartitionList(java.util.List<String> minimumPartitionList) {
                this.minimumPartitionList = minimumPartitionList;
                return this;
            }

            /**
             * <p>Indicates whether the object is newly added.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder newAdded(Integer newAdded) {
                this.newAdded = newAdded;
                return this;
            }

            /**
             * <p>The list of partition field names.</p>
             */
            public Builder partitionFieldNameList(java.util.List<String> partitionFieldNameList) {
                this.partitionFieldNameList = partitionFieldNameList;
                return this;
            }

            /**
             * <p>The number of partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder partitionNum(Integer partitionNum) {
                this.partitionNum = partitionNum;
                return this;
            }

            /**
             * <p>The number of data rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * <p>The data storage size.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5</p>
             */
            public Builder storageSize(String storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The table comment or remark.</p>
             * 
             * <strong>example:</strong>
             * <p>Order details table</p>
             */
            public Builder tableComment(String tableComment) {
                this.tableComment = tableComment;
                return this;
            }

            /**
             * <p>The table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>5001</p>
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The last modification time of the table schema.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-19 22:00:02</p>
             */
            public Builder tableModTime(String tableModTime) {
                this.tableModTime = tableModTime;
                return this;
            }

            /**
             * <p>The name of the table, which is used to filter results by table name.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_order_detail</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The identifier of the table type, such as managed table (MANAGED_TABLE) or external table (EXTERNAL_TABLE).</p>
             * 
             * <strong>example:</strong>
             * <p>MANAGED_TABLE</p>
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
