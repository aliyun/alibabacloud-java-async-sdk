// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DatabaseProfile} extends {@link TeaModel}
 *
 * <p>DatabaseProfile</p>
 */
public class DatabaseProfile extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("FileCnt")
    private Long fileCnt;

    @NameInMap("FileSize")
    private Long fileSize;

    @NameInMap("Location")
    private String location;

    @NameInMap("Name")
    private String name;

    private DatabaseProfile(Builder builder) {
        this.createTime = builder.createTime;
        this.fileCnt = builder.fileCnt;
        this.fileSize = builder.fileSize;
        this.location = builder.location;
        this.name = builder.name;
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

    public static final class Builder {
        private String createTime; 
        private Long fileCnt; 
        private Long fileSize; 
        private String location; 
        private String name; 

        /**
         * 创建时间
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * 存储位置
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * 库名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public DatabaseProfile build() {
            return new DatabaseProfile(this);
        } 

    } 

}
