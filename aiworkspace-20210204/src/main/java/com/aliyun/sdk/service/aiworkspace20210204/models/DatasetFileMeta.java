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

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

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
        this.status = builder.status;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String status; 
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
            this.status = model.status;
            this.tags = model.tags;
            this.thumbnailUrl = model.thumbnailUrl;
            this.uri = model.uri;
        } 

        /**
         * <p>The MIME type of the file. The value contains the type and subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>image/jpeg</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The file size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>120000</p>
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>The dataset file metadata ID.</p>
         * 
         * <strong>example:</strong>
         * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
         */
        public Builder datasetFileMetaId(String datasetFileMetaId) {
            this.datasetFileMetaId = datasetFileMetaId;
            return this;
        }

        /**
         * <p>The download URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/dataset/cat.png?Expires=171280****&OSSAccessKeyId=LTAI************&Signature=****jZcXOn7FHMCT1DLE22NuNjs%3D">https://test-bucket.oss-cn-shanghai.aliyuncs.com/dataset/cat.png?Expires=171280****&amp;OSSAccessKeyId=LTAI************&amp;Signature=****jZcXOn7FHMCT1DLE22NuNjs%3D</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The file creation time. The value is a UTC timestamp in ISO 8601 format.</p>
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
         * <p>The file fingerprint value. This parameter is used to determine the uniqueness of the file content. The value changes when the file content is modified. The ETag is used for OSS files, and the MD5 value is used for NAS files.</p>
         * 
         * <strong>example:</strong>
         * <p>D41D8CD98F*****E9800998ECF8</p>
         */
        public Builder fileFingerPrint(String fileFingerPrint) {
            this.fileFingerPrint = fileFingerPrint;
            return this;
        }

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>cat.png</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The file type. The value is the same as the MIME type.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The last modification time of the file. The value is a UTC timestamp in ISO 8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T14:36:01Z</p>
         */
        public Builder fileUpdateTime(String fileUpdateTime) {
            this.fileUpdateTime = fileUpdateTime;
            return this;
        }

        /**
         * <p>The specific metadata of the file. For example, image width and height, or video bitrate and resolution. Search is not supported for this field. The value is in JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;ImageHeight&quot;: 400,     &quot;ImageWidth&quot;: 800 }</p>
         */
        public Builder metaAttributes(String metaAttributes) {
            this.metaAttributes = metaAttributes;
            return this;
        }

        /**
         * <p>The similarity score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        public Builder score(Float score) {
            this.score = score;
            return this;
        }

        /**
         * <p>The task ID of the last semantic index build.</p>
         * 
         * <strong>example:</strong>
         * <p>dsjob-klfwtjto****scvt3</p>
         */
        public Builder semanticIndexJobId(String semanticIndexJobId) {
            this.semanticIndexJobId = semanticIndexJobId;
            return this;
        }

        /**
         * <p>The last update time of the semantic index. The value is a UTC timestamp in ISO 8601 format.</p>
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
         * <p>The current status of the metadata. Valid values:</p>
         * <ul>
         * <li>ACTIVE: active.</li>
         * <li>DELETED: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The collection of labels for the metadata, in JSON string format. The following label groups are included:</p>
         * <ul>
         * <li>Algorithm label group:<ul>
         * <li>ai: the list of label names aggregated from all algorithm labeling tasks for a single metadata entry.</li>
         * </ul>
         * </li>
         * <li>User-defined label group:<ul>
         * <li>user: the list of label names manually added by the user for a single metadata entry.</li>
         * <li>user-delete-ai-tags: the list of label names in the algorithm label group that the user wants to delete for a single metadata entry.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ai&quot;:
         *     [
         *         &quot;Lane line&quot;,
         *         &quot;Water horse&quot;,
         *         &quot;Sunny day&quot;
         *     ],
         *     &quot;user&quot;:
         *     [
         *         &quot;Everett&quot;,
         *         &quot;Intelligent driving Dataset 1&quot;,
         *         &quot;Cloudy day&quot;
         *     ],
         *     &quot;user-delete-ai-tags&quot;:
         *     [
         *         &quot;Sunny day&quot;
         *     ]
         * }</p>
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The thumbnail URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/dataset/cat.png?Expires=171280****&OSSAccessKeyId=LTAI************&Signature=****jZcXOn7FHMCT1DLE22NuNjs%3D">https://test-bucket.oss-cn-shanghai.aliyuncs.com/dataset/cat.png?Expires=171280****&amp;OSSAccessKeyId=LTAI************&amp;Signature=****jZcXOn7FHMCT1DLE22NuNjs%3D</a></p>
         */
        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        /**
         * <p>The unique URI of the file. This parameter is used to record the unique path of the file. File paths in OSS and NAS are supported.</p>
         * <details>
         * <summary>OSS</summary>
         * oss://${bucket}/${path}
         * </details>
         * <details>
         * <summary>NAS</summary>
         * nas://${fileSystemId}/${path}
         * </details>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/dataset/cat.png</p>
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
