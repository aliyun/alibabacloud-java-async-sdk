// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ModelFile} extends {@link TeaModel}
 *
 * <p>ModelFile</p>
 */
public class ModelFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("isDir")
    private Boolean isDir;

    @com.aliyun.core.annotation.NameInMap("modeTime")
    private Long modeTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private ModelFile(Builder builder) {
        this.isDir = builder.isDir;
        this.modeTime = builder.modeTime;
        this.name = builder.name;
        this.path = builder.path;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelFile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDir
     */
    public Boolean getIsDir() {
        return this.isDir;
    }

    /**
     * @return modeTime
     */
    public Long getModeTime() {
        return this.modeTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private Boolean isDir; 
        private Long modeTime; 
        private String name; 
        private String path; 
        private Long size; 

        private Builder() {
        } 

        private Builder(ModelFile model) {
            this.isDir = model.isDir;
            this.modeTime = model.modeTime;
            this.name = model.name;
            this.path = model.path;
            this.size = model.size;
        } 

        /**
         * isDir.
         */
        public Builder isDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }

        /**
         * modeTime.
         */
        public Builder modeTime(Long modeTime) {
            this.modeTime = modeTime;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public ModelFile build() {
            return new ModelFile(this);
        } 

    } 

}
