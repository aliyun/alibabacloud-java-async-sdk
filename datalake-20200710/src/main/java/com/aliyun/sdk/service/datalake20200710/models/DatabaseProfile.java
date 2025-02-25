// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DatabaseProfile} extends {@link TeaModel}
 *
 * <p>DatabaseProfile</p>
 */
public class DatabaseProfile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("FileCnt")
    private Long fileCnt;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("LatestDate")
    private String latestDate;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ObjectCnt")
    private Long objectCnt;

    @com.aliyun.core.annotation.NameInMap("ObjectSize")
    private Long objectSize;

    private DatabaseProfile(Builder builder) {
        this.createTime = builder.createTime;
        this.fileCnt = builder.fileCnt;
        this.fileSize = builder.fileSize;
        this.latestDate = builder.latestDate;
        this.location = builder.location;
        this.name = builder.name;
        this.objectCnt = builder.objectCnt;
        this.objectSize = builder.objectSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatabaseProfile create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder {
        private String createTime; 
        private Long fileCnt; 
        private Long fileSize; 
        private String latestDate; 
        private String location; 
        private String name; 
        private Long objectCnt; 
        private Long objectSize; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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

        public DatabaseProfile build() {
            return new DatabaseProfile(this);
        } 

    } 

}
