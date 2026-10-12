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

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private DatasetFileMetaConentUpdate(Builder builder) {
        this.comment = builder.comment;
        this.contentType = builder.contentType;
        this.dataSize = builder.dataSize;
        this.datasetFileMetaId = builder.datasetFileMetaId;
        this.fileCreateTime = builder.fileCreateTime;
        this.fileFingerPrint = builder.fileFingerPrint;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.fileUpdateTime = builder.fileUpdateTime;
        this.metaAttributes = builder.metaAttributes;
        this.semanticIndexJobId = builder.semanticIndexJobId;
        this.semanticIndexUpdateTime = builder.semanticIndexUpdateTime;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetFileMetaConentUpdate create() {
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
        private String fileFingerPrint; 
        private String fileName; 
        private String fileType; 
        private String fileUpdateTime; 
        private String metaAttributes; 
        private String semanticIndexJobId; 
        private String semanticIndexUpdateTime; 
        private String tags; 

        private Builder() {
        } 

        private Builder(DatasetFileMetaConentUpdate model) {
            this.comment = model.comment;
            this.contentType = model.contentType;
            this.dataSize = model.dataSize;
            this.datasetFileMetaId = model.datasetFileMetaId;
            this.fileCreateTime = model.fileCreateTime;
            this.fileFingerPrint = model.fileFingerPrint;
            this.fileName = model.fileName;
            this.fileType = model.fileType;
            this.fileUpdateTime = model.fileUpdateTime;
            this.metaAttributes = model.metaAttributes;
            this.semanticIndexJobId = model.semanticIndexJobId;
            this.semanticIndexUpdateTime = model.semanticIndexUpdateTime;
            this.tags = model.tags;
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
         * <p>The MIME type of the file. It includes a type and a subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>image/jpeg</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>07914c9534586e4e7aa6e9dbca5009082df******fd8a0d857b33296c59bf6</p>
         */
        public Builder datasetFileMetaId(String datasetFileMetaId) {
            this.datasetFileMetaId = datasetFileMetaId;
            return this;
        }

        /**
         * <p>The time when the file was created, in ISO 8601 format.</p>
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
         * <p>The file fingerprint information.</p>
         * 
         * <strong>example:</strong>
         * <p>124FB71******7BE45608CDEA4DE54B3</p>
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
         * <p>The file type. This is the primary type from the Multipurpose Internet Mail Extensions (MIME) type.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder fileType(String fileType) {
            this.fileType = fileType;
            return this;
        }

        /**
         * <p>The time when the file was last modified, in ISO 8601 format.</p>
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
         * <p>Specific file metadata, such as the width and height of an image, and the bitrate and resolution of a video. Retrieval based on this metadata is not yet supported. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Image&quot;:
         *     {
         *         &quot;Width&quot;: 1920,
         *         &quot;Height&quot;: 1080,
         *         &quot;Channel&quot;: 3
         *     }
         * }</p>
         */
        public Builder metaAttributes(String metaAttributes) {
            this.metaAttributes = metaAttributes;
            return this;
        }

        /**
         * <p>The ID of the job that builds the semantic index.</p>
         * 
         * <strong>example:</strong>
         * <p>dsjob-klfwt*****l0escvt3</p>
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
         * <p>The tag groups to update.</p>
         * <ul>
         * <li>Update tags using an algorithm. Set a valid TagJobId.</li>
         * </ul>
         * <pre><code>{
         *    &quot;ai&quot;:[&quot;lane line&quot;, &quot;water barrier&quot;, &quot;sunny day&quot;]
         * }
         * </code></pre>
         * <ul>
         * <li><p>Manual tagging: Use add or remove to add or delete tags within a tag group. The modifiable tag groups are:</p>
         * <ul>
         * <li><p>user: A list of tag names to add to or delete from a single metadata entry.</p>
         * </li>
         * <li><p>user-delete-ai-tags: A list of tag names to delete from the algorithm-generated tag group for a single metadata entry.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <pre><code>{
         *     &quot;user&quot;:{
         *         &quot;add&quot;:[&quot;lane line&quot;,&quot;sunny day&quot;],
         *         &quot;remove&quot;:[&quot;water barrier&quot;]
         *     },
         *     &quot;user-delete-ai-tags&quot;:{
         *         &quot;add&quot;: [&quot;ground shade&quot;],
         *         &quot;remove&quot;: []
         *     }
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ai&quot;:[&quot;cat&quot;], &quot;user&quot;:[&quot;black&quot;]}</p>
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
