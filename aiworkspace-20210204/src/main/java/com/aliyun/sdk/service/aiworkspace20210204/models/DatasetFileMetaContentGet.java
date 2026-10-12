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
 * {@link DatasetFileMetaContentGet} extends {@link TeaModel}
 *
 * <p>DatasetFileMetaContentGet</p>
 */
public class DatasetFileMetaContentGet extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.NameInMap("DatasetFileMetaId")
    private String datasetFileMetaId;

    @com.aliyun.core.annotation.NameInMap("FileCreateTime")
    private String fileCreateTime;

    @com.aliyun.core.annotation.NameInMap("FileDir")
    private String fileDir;

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

    @com.aliyun.core.annotation.NameInMap("SemanticIndexJobId")
    private String semanticIndexJobId;

    @com.aliyun.core.annotation.NameInMap("SemanticIndexUpdateTime")
    private String semanticIndexUpdateTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TagUpdateTime")
    private String tagUpdateTime;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private DatasetFileMetaContentGet(Builder builder) {
        this.comment = builder.comment;
        this.contentType = builder.contentType;
        this.dataSize = builder.dataSize;
        this.datasetFileMetaId = builder.datasetFileMetaId;
        this.fileCreateTime = builder.fileCreateTime;
        this.fileDir = builder.fileDir;
        this.fileFingerPrint = builder.fileFingerPrint;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.fileUpdateTime = builder.fileUpdateTime;
        this.metaAttributes = builder.metaAttributes;
        this.semanticIndexJobId = builder.semanticIndexJobId;
        this.semanticIndexUpdateTime = builder.semanticIndexUpdateTime;
        this.status = builder.status;
        this.tagUpdateTime = builder.tagUpdateTime;
        this.tags = builder.tags;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetFileMetaContentGet create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return fileDir
     */
    public String getFileDir() {
        return this.fileDir;
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
     * @return tagUpdateTime
     */
    public String getTagUpdateTime() {
        return this.tagUpdateTime;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder {
        private String comment; 
        private String contentType; 
        private Long dataSize; 
        private String datasetFileMetaId; 
        private String fileCreateTime; 
        private String fileDir; 
        private String fileFingerPrint; 
        private String fileName; 
        private String fileType; 
        private String fileUpdateTime; 
        private String metaAttributes; 
        private String semanticIndexJobId; 
        private String semanticIndexUpdateTime; 
        private String status; 
        private String tagUpdateTime; 
        private String tags; 
        private String uri; 

        private Builder() {
        } 

        private Builder(DatasetFileMetaContentGet model) {
            this.comment = model.comment;
            this.contentType = model.contentType;
            this.dataSize = model.dataSize;
            this.datasetFileMetaId = model.datasetFileMetaId;
            this.fileCreateTime = model.fileCreateTime;
            this.fileDir = model.fileDir;
            this.fileFingerPrint = model.fileFingerPrint;
            this.fileName = model.fileName;
            this.fileType = model.fileType;
            this.fileUpdateTime = model.fileUpdateTime;
            this.metaAttributes = model.metaAttributes;
            this.semanticIndexJobId = model.semanticIndexJobId;
            this.semanticIndexUpdateTime = model.semanticIndexUpdateTime;
            this.status = model.status;
            this.tagUpdateTime = model.tagUpdateTime;
            this.tags = model.tags;
            this.uri = model.uri;
        } 

        /**
         * <p>The file comment.</p>
         * 
         * <strong>example:</strong>
         * <p>The first image file in the dataset.</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The MIME type of the file, which includes the type and subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The file size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>The ID of the dataset file metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
         */
        public Builder datasetFileMetaId(String datasetFileMetaId) {
            this.datasetFileMetaId = datasetFileMetaId;
            return this;
        }

        /**
         * <p>The creation time of the file in ISO 8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T14:36:01Z</p>
         */
        public Builder fileCreateTime(String fileCreateTime) {
            this.fileCreateTime = fileCreateTime;
            return this;
        }

        /**
         * <p>The directory path of the OSS, NAS, or CPFS file.</p>
         * 
         * <strong>example:</strong>
         * <p>icp_certificate_card/icp/1577179298694813/1716429710367</p>
         */
        public Builder fileDir(String fileDir) {
            this.fileDir = fileDir;
            return this;
        }

        /**
         * <p>The fingerprint of the file. This value is used to determine the uniqueness of the file content and changes when the file content is modified. The ETag is used for OSS files, and the MD5 value is used for NAS files.</p>
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
         * <p>00001.jpeg</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The file type. This is the same as the MIME type.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The last modification time of the file in ISO 8601 format.</p>
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
         * <p>The specific metadata of the file in JSON string format. This metadata does not support search capabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ImageHeight&quot;: 1080,
         *     &quot;ImageWidth&quot;: 1920
         * }</p>
         */
        public Builder metaAttributes(String metaAttributes) {
            this.metaAttributes = metaAttributes;
            return this;
        }

        /**
         * <p>The task ID for building the semantic index.</p>
         * 
         * <strong>example:</strong>
         * <p>dsjob-klfwtjtov*****scvt3</p>
         */
        public Builder semanticIndexJobId(String semanticIndexJobId) {
            this.semanticIndexJobId = semanticIndexJobId;
            return this;
        }

        /**
         * <p>The time when the semantic index was built.</p>
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
         * <p>The status of the file metadata. ACTIVE indicates that the metadata is valid, and DELETED indicates that the metadata is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The last modification time of the tags in ISO 8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01.000Z</p>
         */
        public Builder tagUpdateTime(String tagUpdateTime) {
            this.tagUpdateTime = tagUpdateTime;
            return this;
        }

        /**
         * <p>The collection of tags for this metadata, including:</p>
         * <ul>
         * <li>Algorithm tag groups:<ul>
         * <li>ai: A list of tag names summarized from all algorithm tagging tasks for a single metadata entry.</li>
         * </ul>
         * </li>
         * <li>User-defined tag groups:<ul>
         * <li>user: A list of tag names added by the user for a single metadata entry.</li>
         * <li>user-delete-ai-tags: A list of tag names to be deleted by the user from the algorithm tag group for a single metadata entry.</li>
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
         * <p>The unique URI of the file. This URI records the unique path of the file. File paths in OSS and NAS are supported.</p>
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
         * <p>oss://*****-test/dataset/1653421.jpg
         * nas://0e25d***dff/dataset/1653421.jpg</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public DatasetFileMetaContentGet build() {
            return new DatasetFileMetaContentGet(this);
        } 

    } 

}
