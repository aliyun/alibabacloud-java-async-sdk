// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DatasetFileMetaConentUpdate} extends {@link TeaModel}
 *
 * <p>DatasetFileMetaConentUpdate</p>
 */
public class DatasetFileMetaConentUpdate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.NameInMap("DatasetFileMetaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetFileMetaId;

    @com.aliyun.core.annotation.NameInMap("FileCreateTime")
    private String fileCreateTime;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.NameInMap("FileUpdateTime")
    private String fileUpdateTime;

    @com.aliyun.core.annotation.NameInMap("MetaAttributes")
    private String metaAttributes;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private DatasetFileMetaConentUpdate(Builder builder) {
        this.comment = builder.comment;
        this.contentType = builder.contentType;
        this.dataSize = builder.dataSize;
        this.datasetFileMetaId = builder.datasetFileMetaId;
        this.fileCreateTime = builder.fileCreateTime;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.fileUpdateTime = builder.fileUpdateTime;
        this.metaAttributes = builder.metaAttributes;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetFileMetaConentUpdate create() {
        return builder().build();
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return dataSize
     */
    public Long getDataSize() {
        return this.dataSize;
    }

    /**
     * @return datasetFileMetaId
     */
    public String getDatasetFileMetaId() {
        return this.datasetFileMetaId;
    }

    /**
     * @return fileCreateTime
     */
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return fileUpdateTime
     */
    public String getFileUpdateTime() {
        return this.fileUpdateTime;
    }

    /**
     * @return metaAttributes
     */
    public String getMetaAttributes() {
        return this.metaAttributes;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String comment; 
        private String contentType; 
        private Long dataSize; 
        private String datasetFileMetaId; 
        private String fileCreateTime; 
        private String fileName; 
        private String fileType; 
        private String fileUpdateTime; 
        private String metaAttributes; 
        private String tags; 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
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
         * DataSize.
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder datasetFileMetaId(String datasetFileMetaId) {
            this.datasetFileMetaId = datasetFileMetaId;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder fileCreateTime(String fileCreateTime) {
            this.fileCreateTime = fileCreateTime;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder fileUpdateTime(String fileUpdateTime) {
            this.fileUpdateTime = fileUpdateTime;
            return this;
        }

        /**
         * MetaAttributes.
         */
        public Builder metaAttributes(String metaAttributes) {
            this.metaAttributes = metaAttributes;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        public DatasetFileMetaConentUpdate build() {
            return new DatasetFileMetaConentUpdate(this);
        } 

    } 

}
