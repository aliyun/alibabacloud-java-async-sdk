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
 * {@link DatasetFileMetaContentCreate} extends {@link TeaModel}
 *
 * <p>DatasetFileMetaContentCreate</p>
 */
public class DatasetFileMetaContentCreate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("ContentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.NameInMap("FileCreateTime")
    private String fileCreateTime;

    @com.aliyun.core.annotation.NameInMap("FileFingerPrint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileFingerPrint;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileType;

    @com.aliyun.core.annotation.NameInMap("FileUpdateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileUpdateTime;

    @com.aliyun.core.annotation.NameInMap("MetaAttributes")
    private String metaAttributes;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.NameInMap("Uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    private DatasetFileMetaContentCreate(Builder builder) {
        this.comment = builder.comment;
        this.contentType = builder.contentType;
        this.dataSize = builder.dataSize;
        this.fileCreateTime = builder.fileCreateTime;
        this.fileFingerPrint = builder.fileFingerPrint;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.fileUpdateTime = builder.fileUpdateTime;
        this.metaAttributes = builder.metaAttributes;
        this.tags = builder.tags;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasetFileMetaContentCreate create() {
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
        private String fileCreateTime; 
        private String fileFingerPrint; 
        private String fileName; 
        private String fileType; 
        private String fileUpdateTime; 
        private String metaAttributes; 
        private String tags; 
        private String uri; 

        private Builder() {
        } 

        private Builder(DatasetFileMetaContentCreate model) {
            this.comment = model.comment;
            this.contentType = model.contentType;
            this.dataSize = model.dataSize;
            this.fileCreateTime = model.fileCreateTime;
            this.fileFingerPrint = model.fileFingerPrint;
            this.fileName = model.fileName;
            this.fileType = model.fileType;
            this.fileUpdateTime = model.fileUpdateTime;
            this.metaAttributes = model.metaAttributes;
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
         * <p>The MIME type of the file. Contains Type and SubType.</p>
         * <p>This parameter is required.</p>
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
         * <p>The file creation time in ISO 8601 format.</p>
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
         * <p>The file fingerprint value. Used to determine the uniqueness of file content. This value changes when the file content is modified. OSS files use ETag, and NAS files use MD5 values.</p>
         * <p>This parameter is required.</p>
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
         * <p>The file type. Same as MIME Type.</p>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The specific metadata of the file, not searchable. In JSON string format.</p>
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
         * <p>User manual tagging: (add indicates adding tags to the tag group). In JSON string format.
         * The operable tag groups are:</p>
         * <ul>
         * <li>user: The list of tag names manually added by the user for a single metadata entry.</li>
         * </ul>
         * <pre><code>{
         *     &quot;user&quot;:{
         *         &quot;add&quot;:[&quot;lane_line&quot;,&quot;sunny&quot;]
         *     }
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;user&quot;:{
         *         &quot;add&quot;:[&quot;Lane line&quot;,&quot;Sunny day&quot;]
         *     }
         * }</p>
         */
        public Builder tags(String tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The unique URI of the file. Used to record the unique file path. Supports file paths in OSS and NAS.</p>
         * <details>
         * <summary>OSS</summary>
         * oss://${bucket}/${path}
         * </details>
         * <details>
         * <summary>NAS</summary>
         * nas://${fileSystemId}/${path}
         * </details>
         * 
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://*****-test/dataset/1653421.jpg
         * nas://0e25d***dff/dataset/1653421.jpg</p>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        public DatasetFileMetaContentCreate build() {
            return new DatasetFileMetaContentCreate(this);
        } 

    } 

}
