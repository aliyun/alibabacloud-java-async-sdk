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
 * {@link DatasetFileMeta} extends {@link TeaModel}
 *
 * <p>DatasetFileMeta</p>
 */
public class DatasetFileMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.NameInMap("DatasetFileMetaId")
    private String datasetFileMetaId;

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("FileCreateTime")
    private String fileCreateTime;

    @com.aliyun.core.annotation.NameInMap("FileFingerPrint")
    private String fileFingerPrint;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.NameInMap("FileUpdateTime")
    private String fileUpdateTime;

    @com.aliyun.core.annotation.NameInMap("MetaAttributes")
    private String metaAttributes;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Float score;

    @com.aliyun.core.annotation.NameInMap("SemanticIndexJobId")
    private String semanticIndexJobId;

    @com.aliyun.core.annotation.NameInMap("SemanticIndexUpdateTime")
    private String semanticIndexUpdateTime;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
    private String thumbnailUrl;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private DatasetFileMeta(Builder builder) {
        this.contentType = builder.contentType;
        this.dataSize = builder.dataSize;
        this.datasetFileMetaId = builder.datasetFileMetaId;
        this.downloadUrl = builder.downloadUrl;
        this.fileCreateTime = builder.fileCreateTime;
        this.fileFingerPrint = builder.fileFingerPrint;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.fileUpdateTime = builder.fileUpdateTime;
        this.metaAttributes = builder.metaAttributes;
        this.score = builder.score;
        this.semanticIndexJobId = builder.semanticIndexJobId;
        this.semanticIndexUpdateTime = builder.semanticIndexUpdateTime;
        this.tags = builder.tags;
        this.thumbnailUrl = builder.thumbnailUrl;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetFileMeta create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return fileCreateTime
     */
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    /**
     * @return fileFingerPrint
     */
    public String getFileFingerPrint() {
        return this.fileFingerPrint;
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
     * @return score
     */
    public Float getScore() {
        return this.score;
    }

    /**
     * @return semanticIndexJobId
     */
    public String getSemanticIndexJobId() {
        return this.semanticIndexJobId;
    }

    /**
     * @return semanticIndexUpdateTime
     */
    public String getSemanticIndexUpdateTime() {
        return this.semanticIndexUpdateTime;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return thumbnailUrl
     */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String contentType; 
        private Long dataSize; 
        private String datasetFileMetaId; 
        private String downloadUrl; 
        private String fileCreateTime; 
        private String fileFingerPrint; 
        private String fileName; 
        private String fileType; 
        private String fileUpdateTime; 
        private String metaAttributes; 
        private Float score; 
        private String semanticIndexJobId; 
        private String semanticIndexUpdateTime; 
        private String tags; 
        private String thumbnailUrl; 
        private String uri; 

        private Builder() {
        } 

        private Builder(DatasetFileMeta model) {
            this.contentType = model.contentType;
            this.dataSize = model.dataSize;
            this.datasetFileMetaId = model.datasetFileMetaId;
            this.downloadUrl = model.downloadUrl;
            this.fileCreateTime = model.fileCreateTime;
            this.fileFingerPrint = model.fileFingerPrint;
            this.fileName = model.fileName;
            this.fileType = model.fileType;
            this.fileUpdateTime = model.fileUpdateTime;
            this.metaAttributes = model.metaAttributes;
            this.score = model.score;
            this.semanticIndexJobId = model.semanticIndexJobId;
            this.semanticIndexUpdateTime = model.semanticIndexUpdateTime;
            this.tags = model.tags;
            this.thumbnailUrl = model.thumbnailUrl;
            this.uri = model.uri;
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
         * DatasetFileMetaId.
         */
        public Builder datasetFileMetaId(String datasetFileMetaId) {
            this.datasetFileMetaId = datasetFileMetaId;
            return this;
        }

        /**
         * DownloadUrl.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01.000Z</p>
         */
        public Builder fileCreateTime(String fileCreateTime) {
            this.fileCreateTime = fileCreateTime;
            return this;
        }

        /**
         * FileFingerPrint.
         */
        public Builder fileFingerPrint(String fileFingerPrint) {
            this.fileFingerPrint = fileFingerPrint;
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
         * <p>2021-01-12T14:36:01.000Z</p>
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
         * Score.
         */
        public Builder score(Float score) {
            this.score = score;
            return this;
        }

        /**
         * SemanticIndexJobId.
         */
        public Builder semanticIndexJobId(String semanticIndexJobId) {
            this.semanticIndexJobId = semanticIndexJobId;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01.000Z</p>
         */
        public Builder semanticIndexUpdateTime(String semanticIndexUpdateTime) {
            this.semanticIndexUpdateTime = semanticIndexUpdateTime;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        /**
         * ThumbnailUrl.
         */
        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public DatasetFileMeta build() {
            return new DatasetFileMeta(this);
        } 

    } 

}
