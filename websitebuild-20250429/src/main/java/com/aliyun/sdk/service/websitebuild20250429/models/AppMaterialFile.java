// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppMaterialFile} extends {@link TeaModel}
 *
 * <p>AppMaterialFile</p>
 */
public class AppMaterialFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DeletedTime")
    private String deletedTime;

    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("FileId")
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.NameInMap("Height")
    private Integer height;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private String storageSize;

    @com.aliyun.core.annotation.NameInMap("Suffix")
    private String suffix;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Width")
    private Integer width;

    private AppMaterialFile(Builder builder) {
        this.bizId = builder.bizId;
        this.contentType = builder.contentType;
        this.createTime = builder.createTime;
        this.deletedTime = builder.deletedTime;
        this.directoryId = builder.directoryId;
        this.fileId = builder.fileId;
        this.fileUrl = builder.fileUrl;
        this.height = builder.height;
        this.name = builder.name;
        this.status = builder.status;
        this.storageSize = builder.storageSize;
        this.suffix = builder.suffix;
        this.type = builder.type;
        this.width = builder.width;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppMaterialFile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return deletedTime
     */
    public String getDeletedTime() {
        return this.deletedTime;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return this.height;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storageSize
     */
    public String getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return suffix
     */
    public String getSuffix() {
        return this.suffix;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return this.width;
    }

    public static final class Builder {
        private String bizId; 
        private String contentType; 
        private String createTime; 
        private String deletedTime; 
        private String directoryId; 
        private String fileId; 
        private String fileUrl; 
        private Integer height; 
        private String name; 
        private String status; 
        private String storageSize; 
        private String suffix; 
        private String type; 
        private Integer width; 

        private Builder() {
        } 

        private Builder(AppMaterialFile model) {
            this.bizId = model.bizId;
            this.contentType = model.contentType;
            this.createTime = model.createTime;
            this.deletedTime = model.deletedTime;
            this.directoryId = model.directoryId;
            this.fileId = model.fileId;
            this.fileUrl = model.fileUrl;
            this.height = model.height;
            this.name = model.name;
            this.status = model.status;
            this.storageSize = model.storageSize;
            this.suffix = model.suffix;
            this.type = model.type;
            this.width = model.width;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
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
         * DeletedTime.
         */
        public Builder deletedTime(String deletedTime) {
            this.deletedTime = deletedTime;
            return this;
        }

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Integer height) {
            this.height = height;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * Suffix.
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Width.
         */
        public Builder width(Integer width) {
            this.width = width;
            return this;
        }

        public AppMaterialFile build() {
            return new AppMaterialFile(this);
        } 

    } 

}
