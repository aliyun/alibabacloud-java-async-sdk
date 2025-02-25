// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableProfile} extends {@link TeaModel}
 *
 * <p>TableProfile</p>
 */
public class TableProfile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessNum")
    private Long accessNum;

    @com.aliyun.core.annotation.NameInMap("AccessNumMonthly")
    private Long accessNumMonthly;

    @com.aliyun.core.annotation.NameInMap("AccessNumWeekly")
    private Long accessNumWeekly;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("FileCnt")
    private Long fileCnt;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("IsPartitioned")
    private Boolean isPartitioned;

    @com.aliyun.core.annotation.NameInMap("LastAccessNumTime")
    private String lastAccessNumTime;

    @com.aliyun.core.annotation.NameInMap("LastAccessTime")
    private String lastAccessTime;

    @com.aliyun.core.annotation.NameInMap("LastDdlTime")
    private String lastDdlTime;

    @com.aliyun.core.annotation.NameInMap("LastModifyTime")
    private String lastModifyTime;

    @com.aliyun.core.annotation.NameInMap("LatestAccessNumDate")
    private String latestAccessNumDate;

    @com.aliyun.core.annotation.NameInMap("LatestDate")
    private String latestDate;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("ObjectAccessNum")
    private Long objectAccessNum;

    @com.aliyun.core.annotation.NameInMap("ObjectAccessNumMonthly")
    private Long objectAccessNumMonthly;

    @com.aliyun.core.annotation.NameInMap("ObjectAccessNumWeekly")
    private Long objectAccessNumWeekly;

    @com.aliyun.core.annotation.NameInMap("ObjectCnt")
    private Long objectCnt;

    @com.aliyun.core.annotation.NameInMap("ObjectSize")
    private Long objectSize;

    @com.aliyun.core.annotation.NameInMap("PartitionCnt")
    private Long partitionCnt;

    @com.aliyun.core.annotation.NameInMap("RecordCnt")
    private Long recordCnt;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private TableProfile(Builder builder) {
        this.accessNum = builder.accessNum;
        this.accessNumMonthly = builder.accessNumMonthly;
        this.accessNumWeekly = builder.accessNumWeekly;
        this.createTime = builder.createTime;
        this.dataSourceType = builder.dataSourceType;
        this.databaseName = builder.databaseName;
        this.fileCnt = builder.fileCnt;
        this.fileSize = builder.fileSize;
        this.isPartitioned = builder.isPartitioned;
        this.lastAccessNumTime = builder.lastAccessNumTime;
        this.lastAccessTime = builder.lastAccessTime;
        this.lastDdlTime = builder.lastDdlTime;
        this.lastModifyTime = builder.lastModifyTime;
        this.latestAccessNumDate = builder.latestAccessNumDate;
        this.latestDate = builder.latestDate;
        this.location = builder.location;
        this.objectAccessNum = builder.objectAccessNum;
        this.objectAccessNumMonthly = builder.objectAccessNumMonthly;
        this.objectAccessNumWeekly = builder.objectAccessNumWeekly;
        this.objectCnt = builder.objectCnt;
        this.objectSize = builder.objectSize;
        this.partitionCnt = builder.partitionCnt;
        this.recordCnt = builder.recordCnt;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableProfile create() {
        return builder().build();
    }

    /**
     * @return accessNum
     */
    public Long getAccessNum() {
        return this.accessNum;
    }

    /**
     * @return accessNumMonthly
     */
    public Long getAccessNumMonthly() {
        return this.accessNumMonthly;
    }

    /**
     * @return accessNumWeekly
     */
    public Long getAccessNumWeekly() {
        return this.accessNumWeekly;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return fileCnt
     */
    public Long getFileCnt() {
        return this.fileCnt;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return isPartitioned
     */
    public Boolean getIsPartitioned() {
        return this.isPartitioned;
    }

    /**
     * @return lastAccessNumTime
     */
    public String getLastAccessNumTime() {
        return this.lastAccessNumTime;
    }

    /**
     * @return lastAccessTime
     */
    public String getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * @return lastDdlTime
     */
    public String getLastDdlTime() {
        return this.lastDdlTime;
    }

    /**
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return latestAccessNumDate
     */
    public String getLatestAccessNumDate() {
        return this.latestAccessNumDate;
    }

    /**
     * @return latestDate
     */
    public String getLatestDate() {
        return this.latestDate;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return objectAccessNum
     */
    public Long getObjectAccessNum() {
        return this.objectAccessNum;
    }

    /**
     * @return objectAccessNumMonthly
     */
    public Long getObjectAccessNumMonthly() {
        return this.objectAccessNumMonthly;
    }

    /**
     * @return objectAccessNumWeekly
     */
    public Long getObjectAccessNumWeekly() {
        return this.objectAccessNumWeekly;
    }

    /**
     * @return objectCnt
     */
    public Long getObjectCnt() {
        return this.objectCnt;
    }

    /**
     * @return objectSize
     */
    public Long getObjectSize() {
        return this.objectSize;
    }

    /**
     * @return partitionCnt
     */
    public Long getPartitionCnt() {
        return this.partitionCnt;
    }

    /**
     * @return recordCnt
     */
    public Long getRecordCnt() {
        return this.recordCnt;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private Long accessNum; 
        private Long accessNumMonthly; 
        private Long accessNumWeekly; 
        private String createTime; 
        private String dataSourceType; 
        private String databaseName; 
        private Long fileCnt; 
        private Long fileSize; 
        private Boolean isPartitioned; 
        private String lastAccessNumTime; 
        private String lastAccessTime; 
        private String lastDdlTime; 
        private String lastModifyTime; 
        private String latestAccessNumDate; 
        private String latestDate; 
        private String location; 
        private Long objectAccessNum; 
        private Long objectAccessNumMonthly; 
        private Long objectAccessNumWeekly; 
        private Long objectCnt; 
        private Long objectSize; 
        private Long partitionCnt; 
        private Long recordCnt; 
        private String tableName; 

        /**
         * AccessNum.
         */
        public Builder accessNum(Long accessNum) {
            this.accessNum = accessNum;
            return this;
        }

        /**
         * AccessNumMonthly.
         */
        public Builder accessNumMonthly(Long accessNumMonthly) {
            this.accessNumMonthly = accessNumMonthly;
            return this;
        }

        /**
         * AccessNumWeekly.
         */
        public Builder accessNumWeekly(Long accessNumWeekly) {
            this.accessNumWeekly = accessNumWeekly;
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
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * FileCnt.
         */
        public Builder fileCnt(Long fileCnt) {
            this.fileCnt = fileCnt;
            return this;
        }

        /**
         * FileSize.
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * IsPartitioned.
         */
        public Builder isPartitioned(Boolean isPartitioned) {
            this.isPartitioned = isPartitioned;
            return this;
        }

        /**
         * LastAccessNumTime.
         */
        public Builder lastAccessNumTime(String lastAccessNumTime) {
            this.lastAccessNumTime = lastAccessNumTime;
            return this;
        }

        /**
         * LastAccessTime.
         */
        public Builder lastAccessTime(String lastAccessTime) {
            this.lastAccessTime = lastAccessTime;
            return this;
        }

        /**
         * LastDdlTime.
         */
        public Builder lastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }

        /**
         * LastModifyTime.
         */
        public Builder lastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * LatestAccessNumDate.
         */
        public Builder latestAccessNumDate(String latestAccessNumDate) {
            this.latestAccessNumDate = latestAccessNumDate;
            return this;
        }

        /**
         * LatestDate.
         */
        public Builder latestDate(String latestDate) {
            this.latestDate = latestDate;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * ObjectAccessNum.
         */
        public Builder objectAccessNum(Long objectAccessNum) {
            this.objectAccessNum = objectAccessNum;
            return this;
        }

        /**
         * ObjectAccessNumMonthly.
         */
        public Builder objectAccessNumMonthly(Long objectAccessNumMonthly) {
            this.objectAccessNumMonthly = objectAccessNumMonthly;
            return this;
        }

        /**
         * ObjectAccessNumWeekly.
         */
        public Builder objectAccessNumWeekly(Long objectAccessNumWeekly) {
            this.objectAccessNumWeekly = objectAccessNumWeekly;
            return this;
        }

        /**
         * ObjectCnt.
         */
        public Builder objectCnt(Long objectCnt) {
            this.objectCnt = objectCnt;
            return this;
        }

        /**
         * ObjectSize.
         */
        public Builder objectSize(Long objectSize) {
            this.objectSize = objectSize;
            return this;
        }

        /**
         * PartitionCnt.
         */
        public Builder partitionCnt(Long partitionCnt) {
            this.partitionCnt = partitionCnt;
            return this;
        }

        /**
         * RecordCnt.
         */
        public Builder recordCnt(Long recordCnt) {
            this.recordCnt = recordCnt;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableProfile build() {
            return new TableProfile(this);
        } 

    } 

}
