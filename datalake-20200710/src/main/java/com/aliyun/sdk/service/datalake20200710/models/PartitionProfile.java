// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PartitionProfile} extends {@link TeaModel}
 *
 * <p>PartitionProfile</p>
 */
public class PartitionProfile extends TeaModel {
    @NameInMap("AccessNum")
    private Long accessNum;

    @NameInMap("AccessNumMonthly")
    private Long accessNumMonthly;

    @NameInMap("AccessNumWeekly")
    private Long accessNumWeekly;

    @NameInMap("ArchiveStatus")
    private String archiveStatus;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DataSourceType")
    private String dataSourceType;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("FileCnt")
    private Long fileCnt;

    @NameInMap("FileSize")
    private Long fileSize;

    @NameInMap("LastAccessNumTime")
    private String lastAccessNumTime;

    @NameInMap("LastAccessTime")
    private String lastAccessTime;

    @NameInMap("LastModifyTime")
    private String lastModifyTime;

    @NameInMap("Location")
    private String location;

    @NameInMap("ObjectAccessNum")
    private Long objectAccessNum;

    @NameInMap("ObjectAccessNumMonthly")
    private Long objectAccessNumMonthly;

    @NameInMap("ObjectAccessNumWeekly")
    private Long objectAccessNumWeekly;

    @NameInMap("ObjectCnt")
    private Long objectCnt;

    @NameInMap("ObjectSize")
    private Long objectSize;

    @NameInMap("PartitionName")
    private String partitionName;

    @NameInMap("TableName")
    private String tableName;

    private PartitionProfile(Builder builder) {
        this.accessNum = builder.accessNum;
        this.accessNumMonthly = builder.accessNumMonthly;
        this.accessNumWeekly = builder.accessNumWeekly;
        this.archiveStatus = builder.archiveStatus;
        this.createTime = builder.createTime;
        this.dataSourceType = builder.dataSourceType;
        this.databaseName = builder.databaseName;
        this.fileCnt = builder.fileCnt;
        this.fileSize = builder.fileSize;
        this.lastAccessNumTime = builder.lastAccessNumTime;
        this.lastAccessTime = builder.lastAccessTime;
        this.lastModifyTime = builder.lastModifyTime;
        this.location = builder.location;
        this.objectAccessNum = builder.objectAccessNum;
        this.objectAccessNumMonthly = builder.objectAccessNumMonthly;
        this.objectAccessNumWeekly = builder.objectAccessNumWeekly;
        this.objectCnt = builder.objectCnt;
        this.objectSize = builder.objectSize;
        this.partitionName = builder.partitionName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PartitionProfile create() {
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
     * @return archiveStatus
     */
    public String getArchiveStatus() {
        return this.archiveStatus;
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
     * @return lastModifyTime
     */
    public String getLastModifyTime() {
        return this.lastModifyTime;
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
     * @return partitionName
     */
    public String getPartitionName() {
        return this.partitionName;
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
        private String archiveStatus; 
        private String createTime; 
        private String dataSourceType; 
        private String databaseName; 
        private Long fileCnt; 
        private Long fileSize; 
        private String lastAccessNumTime; 
        private String lastAccessTime; 
        private String lastModifyTime; 
        private String location; 
        private Long objectAccessNum; 
        private Long objectAccessNumMonthly; 
        private Long objectAccessNumWeekly; 
        private Long objectCnt; 
        private Long objectSize; 
        private String partitionName; 
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
         * ArchiveStatus.
         */
        public Builder archiveStatus(String archiveStatus) {
            this.archiveStatus = archiveStatus;
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
         * LastModifyTime.
         */
        public Builder lastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
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
         * PartitionName.
         */
        public Builder partitionName(String partitionName) {
            this.partitionName = partitionName;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public PartitionProfile build() {
            return new PartitionProfile(this);
        } 

    } 

}
