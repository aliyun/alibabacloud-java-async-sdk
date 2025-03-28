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
 * {@link ModelFilePreview} extends {@link TeaModel}
 *
 * <p>ModelFilePreview</p>
 */
public class ModelFilePreview extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("hash")
    private String hash;

    @com.aliyun.core.annotation.NameInMap("isCompressedImage")
    private Boolean isCompressedImage;

    @com.aliyun.core.annotation.NameInMap("isDir")
    private Boolean isDir;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("unpreviewable")
    private Boolean unpreviewable;

    private ModelFilePreview(Builder builder) {
        this.content = builder.content;
        this.hash = builder.hash;
        this.isCompressedImage = builder.isCompressedImage;
        this.isDir = builder.isDir;
        this.name = builder.name;
        this.path = builder.path;
        this.size = builder.size;
        this.unpreviewable = builder.unpreviewable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelFilePreview create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return hash
     */
    public String getHash() {
        return this.hash;
    }

    /**
     * @return isCompressedImage
     */
    public Boolean getIsCompressedImage() {
        return this.isCompressedImage;
    }

    /**
     * @return isDir
     */
    public Boolean getIsDir() {
        return this.isDir;
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

    /**
     * @return unpreviewable
     */
    public Boolean getUnpreviewable() {
        return this.unpreviewable;
    }

    public static final class Builder {
        private String content; 
        private String hash; 
        private Boolean isCompressedImage; 
        private Boolean isDir; 
        private String name; 
        private String path; 
        private Long size; 
        private Boolean unpreviewable; 

        private Builder() {
        } 

        private Builder(ModelFilePreview model) {
            this.content = model.content;
            this.hash = model.hash;
            this.isCompressedImage = model.isCompressedImage;
            this.isDir = model.isDir;
            this.name = model.name;
            this.path = model.path;
            this.size = model.size;
            this.unpreviewable = model.unpreviewable;
        } 

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * hash.
         */
        public Builder hash(String hash) {
            this.hash = hash;
            return this;
        }

        /**
         * isCompressedImage.
         */
        public Builder isCompressedImage(Boolean isCompressedImage) {
            this.isCompressedImage = isCompressedImage;
            return this;
        }

        /**
         * isDir.
         */
        public Builder isDir(Boolean isDir) {
            this.isDir = isDir;
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

        /**
         * unpreviewable.
         */
        public Builder unpreviewable(Boolean unpreviewable) {
            this.unpreviewable = unpreviewable;
            return this;
        }

        public ModelFilePreview build() {
            return new ModelFilePreview(this);
        } 

    } 

}
