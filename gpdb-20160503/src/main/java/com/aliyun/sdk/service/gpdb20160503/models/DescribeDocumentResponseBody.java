// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocumentResponseBody</p>
 */
public class DescribeDocumentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkFileUrl")
    private String chunkFileUrl;

    @com.aliyun.core.annotation.NameInMap("DocsCount")
    private Integer docsCount;

    @com.aliyun.core.annotation.NameInMap("DocumentLoader")
    private String documentLoader;

    @com.aliyun.core.annotation.NameInMap("FileExt")
    private String fileExt;

    @com.aliyun.core.annotation.NameInMap("FileMd5")
    private String fileMd5;

    @com.aliyun.core.annotation.NameInMap("FileMtime")
    private String fileMtime;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.NameInMap("FileVersion")
    private Integer fileVersion;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PlainChunkFileUrl")
    private String plainChunkFileUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TextSplitter")
    private String textSplitter;

    private DescribeDocumentResponseBody(Builder builder) {
        this.chunkFileUrl = builder.chunkFileUrl;
        this.docsCount = builder.docsCount;
        this.documentLoader = builder.documentLoader;
        this.fileExt = builder.fileExt;
        this.fileMd5 = builder.fileMd5;
        this.fileMtime = builder.fileMtime;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.fileUrl = builder.fileUrl;
        this.fileVersion = builder.fileVersion;
        this.message = builder.message;
        this.plainChunkFileUrl = builder.plainChunkFileUrl;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.status = builder.status;
        this.textSplitter = builder.textSplitter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocumentResponseBody create() {
        return builder().build();
    }

    /**
     * @return chunkFileUrl
     */
    public String getChunkFileUrl() {
        return this.chunkFileUrl;
    }

    /**
     * @return docsCount
     */
    public Integer getDocsCount() {
        return this.docsCount;
    }

    /**
     * @return documentLoader
     */
    public String getDocumentLoader() {
        return this.documentLoader;
    }

    /**
     * @return fileExt
     */
    public String getFileExt() {
        return this.fileExt;
    }

    /**
     * @return fileMd5
     */
    public String getFileMd5() {
        return this.fileMd5;
    }

    /**
     * @return fileMtime
     */
    public String getFileMtime() {
        return this.fileMtime;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return fileVersion
     */
    public Integer getFileVersion() {
        return this.fileVersion;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return plainChunkFileUrl
     */
    public String getPlainChunkFileUrl() {
        return this.plainChunkFileUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return textSplitter
     */
    public String getTextSplitter() {
        return this.textSplitter;
    }

    public static final class Builder {
        private String chunkFileUrl; 
        private Integer docsCount; 
        private String documentLoader; 
        private String fileExt; 
        private String fileMd5; 
        private String fileMtime; 
        private String fileName; 
        private Long fileSize; 
        private String fileUrl; 
        private Integer fileVersion; 
        private String message; 
        private String plainChunkFileUrl; 
        private String requestId; 
        private String source; 
        private String status; 
        private String textSplitter; 

        /**
         * ChunkFileUrl.
         */
        public Builder chunkFileUrl(String chunkFileUrl) {
            this.chunkFileUrl = chunkFileUrl;
            return this;
        }

        /**
         * DocsCount.
         */
        public Builder docsCount(Integer docsCount) {
            this.docsCount = docsCount;
            return this;
        }

        /**
         * DocumentLoader.
         */
        public Builder documentLoader(String documentLoader) {
            this.documentLoader = documentLoader;
            return this;
        }

        /**
         * FileExt.
         */
        public Builder fileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }

        /**
         * FileMd5.
         */
        public Builder fileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }

        /**
         * FileMtime.
         */
        public Builder fileMtime(String fileMtime) {
            this.fileMtime = fileMtime;
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
         * FileSize.
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
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
         * FileVersion.
         */
        public Builder fileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PlainChunkFileUrl.
         */
        public Builder plainChunkFileUrl(String plainChunkFileUrl) {
            this.plainChunkFileUrl = plainChunkFileUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
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
         * TextSplitter.
         */
        public Builder textSplitter(String textSplitter) {
            this.textSplitter = textSplitter;
            return this;
        }

        public DescribeDocumentResponseBody build() {
            return new DescribeDocumentResponseBody(this);
        } 

    } 

}
