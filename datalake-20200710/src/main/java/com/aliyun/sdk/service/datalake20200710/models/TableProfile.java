// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableProfile} extends {@link TeaModel}
 *
 * <p>TableProfile</p>
 */
public class TableProfile extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("FileCnt")
    private Long fileCnt;

    @NameInMap("FileSize")
    private Long fileSize;

    @NameInMap("IsPartitioned")
    private Boolean isPartitioned;

    @NameInMap("LastModifyTime")
    private String lastModifyTime;

    @NameInMap("Location")
    private String location;

    @NameInMap("PartitionCnt")
    private Long partitionCnt;

    @NameInMap("RecordCnt")
    private Long recordCnt;

    @NameInMap("TableName")
    private String tableName;

    private TableProfile(Builder builder) {
        this.createTime = builder.createTime;
        this.databaseName = builder.databaseName;
        this.fileCnt = builder.fileCnt;
        this.fileSize = builder.fileSize;
        this.isPartitioned = builder.isPartitioned;
        this.lastModifyTime = builder.lastModifyTime;
        this.location = builder.location;
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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
        private String createTime; 
        private String databaseName; 
        private Long fileCnt; 
        private Long fileSize; 
        private Boolean isPartitioned; 
        private String lastModifyTime; 
        private String location; 
        private Long partitionCnt; 
        private Long recordCnt; 
        private String tableName; 

        /**
         * 创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 库名称
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * 文件数量
         */
        public Builder fileCnt(Long fileCnt) {
            this.fileCnt = fileCnt;
            return this;
        }

        /**
         * 文件大小
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * 是否分区表
         */
        public Builder isPartitioned(Boolean isPartitioned) {
            this.isPartitioned = isPartitioned;
            return this;
        }

        /**
         * 最后跟新时间
         */
        public Builder lastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * 存储位置
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * 分区数量
         */
        public Builder partitionCnt(Long partitionCnt) {
            this.partitionCnt = partitionCnt;
            return this;
        }

        /**
         * 记录数
         */
        public Builder recordCnt(Long recordCnt) {
            this.recordCnt = recordCnt;
            return this;
        }

        /**
         * 表名称
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
