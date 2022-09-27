// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DictInfo} extends {@link TeaModel}
 *
 * <p>DictInfo</p>
 */
public class DictInfo extends TeaModel {
    @NameInMap("fileSize")
    private Long fileSize;

    @NameInMap("name")
    private String name;

    @NameInMap("sourceType")
    private String sourceType;

    @NameInMap("type")
    private String type;

    private DictInfo(Builder builder) {
        this.fileSize = builder.fileSize;
        this.name = builder.name;
        this.sourceType = builder.sourceType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DictInfo create() {
        return builder().build();
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long fileSize; 
        private String name; 
        private String sourceType; 
        private String type; 

        /**
         * 词典文件大小
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * 词典文件名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 词典来源
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * 词典类型
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DictInfo build() {
            return new DictInfo(this);
        } 

    } 

}
