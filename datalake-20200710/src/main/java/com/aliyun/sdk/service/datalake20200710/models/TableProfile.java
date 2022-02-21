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
    @NameInMap("FileCnt")
    private Long fileCnt;

    @NameInMap("FileSize")
    private Long fileSize;

    @NameInMap("IsPartitioned")
    private Boolean isPartitioned;

    @NameInMap("LastModifyTime")
    private String lastModifyTime;

    @NameInMap("PartitionCnt")
    private Long partitionCnt;

    @NameInMap("RecordCnt")
    private Long recordCnt;

    private TableProfile(Builder builder) {
        this.fileCnt = builder.fileCnt;
        this.fileSize = builder.fileSize;
        this.isPartitioned = builder.isPartitioned;
        this.lastModifyTime = builder.lastModifyTime;
        this.partitionCnt = builder.partitionCnt;
        this.recordCnt = builder.recordCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableProfile create() {
        return builder().build();
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

    public static final class Builder {
        private Long fileCnt; 
        private Long fileSize; 
        private Boolean isPartitioned; 
        private String lastModifyTime; 
        private Long partitionCnt; 
        private Long recordCnt; 

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

        public TableProfile build() {
            return new TableProfile(this);
        } 

    } 

}
