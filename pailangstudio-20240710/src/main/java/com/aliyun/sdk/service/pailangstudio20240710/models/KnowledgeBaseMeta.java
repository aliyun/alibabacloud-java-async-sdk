// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link KnowledgeBaseMeta} extends {@link TeaModel}
 *
 * <p>KnowledgeBaseMeta</p>
 */
public class KnowledgeBaseMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkAttachment")
    private java.util.List<ChunkAttachment> chunkAttachment;

    @com.aliyun.core.annotation.NameInMap("ChunkContent")
    private String chunkContent;

    @com.aliyun.core.annotation.NameInMap("ChunkEnd")
    private Integer chunkEnd;

    @com.aliyun.core.annotation.NameInMap("ChunkId")
    private String chunkId;

    @com.aliyun.core.annotation.NameInMap("ChunkSequence")
    private Integer chunkSequence;

    @com.aliyun.core.annotation.NameInMap("ChunkSize")
    private Integer chunkSize;

    @com.aliyun.core.annotation.NameInMap("ChunkStart")
    private Integer chunkStart;

    @com.aliyun.core.annotation.NameInMap("ChunkStatus")
    private String chunkStatus;

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("FileContentType")
    private String fileContentType;

    @com.aliyun.core.annotation.NameInMap("FileCreateTime")
    private String fileCreateTime;

    @com.aliyun.core.annotation.NameInMap("FileMetaData")
    private String fileMetaData;

    @com.aliyun.core.annotation.NameInMap("FileMetaId")
    private String fileMetaId;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Integer fileSize;

    @com.aliyun.core.annotation.NameInMap("FileStatus")
    private String fileStatus;

    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    @com.aliyun.core.annotation.NameInMap("FileUpdateTime")
    private String fileUpdateTime;

    @com.aliyun.core.annotation.NameInMap("FileUri")
    private String fileUri;

    @com.aliyun.core.annotation.NameInMap("MetaData")
    private MetaData metaData;

    @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
    private String thumbnailUrl;

    private KnowledgeBaseMeta(Builder builder) {
        this.chunkAttachment = builder.chunkAttachment;
        this.chunkContent = builder.chunkContent;
        this.chunkEnd = builder.chunkEnd;
        this.chunkId = builder.chunkId;
        this.chunkSequence = builder.chunkSequence;
        this.chunkSize = builder.chunkSize;
        this.chunkStart = builder.chunkStart;
        this.chunkStatus = builder.chunkStatus;
        this.downloadUrl = builder.downloadUrl;
        this.fileContentType = builder.fileContentType;
        this.fileCreateTime = builder.fileCreateTime;
        this.fileMetaData = builder.fileMetaData;
        this.fileMetaId = builder.fileMetaId;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.fileStatus = builder.fileStatus;
        this.fileType = builder.fileType;
        this.fileUpdateTime = builder.fileUpdateTime;
        this.fileUri = builder.fileUri;
        this.metaData = builder.metaData;
        this.thumbnailUrl = builder.thumbnailUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KnowledgeBaseMeta create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chunkAttachment
     */
    public java.util.List<ChunkAttachment> getChunkAttachment() {
        return this.chunkAttachment;
    }

    /**
     * @return chunkContent
     */
    public String getChunkContent() {
        return this.chunkContent;
    }

    /**
     * @return chunkEnd
     */
    public Integer getChunkEnd() {
        return this.chunkEnd;
    }

    /**
     * @return chunkId
     */
    public String getChunkId() {
        return this.chunkId;
    }

    /**
     * @return chunkSequence
     */
    public Integer getChunkSequence() {
        return this.chunkSequence;
    }

    /**
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return this.chunkSize;
    }

    /**
     * @return chunkStart
     */
    public Integer getChunkStart() {
        return this.chunkStart;
    }

    /**
     * @return chunkStatus
     */
    public String getChunkStatus() {
        return this.chunkStatus;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return fileContentType
     */
    public String getFileContentType() {
        return this.fileContentType;
    }

    /**
     * @return fileCreateTime
     */
    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    /**
     * @return fileMetaData
     */
    public String getFileMetaData() {
        return this.fileMetaData;
    }

    /**
     * @return fileMetaId
     */
    public String getFileMetaId() {
        return this.fileMetaId;
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
    public Integer getFileSize() {
        return this.fileSize;
    }

    /**
     * @return fileStatus
     */
    public String getFileStatus() {
        return this.fileStatus;
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
     * @return fileUri
     */
    public String getFileUri() {
        return this.fileUri;
    }

    /**
     * @return metaData
     */
    public MetaData getMetaData() {
        return this.metaData;
    }

    /**
     * @return thumbnailUrl
     */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public static final class Builder {
        private java.util.List<ChunkAttachment> chunkAttachment; 
        private String chunkContent; 
        private Integer chunkEnd; 
        private String chunkId; 
        private Integer chunkSequence; 
        private Integer chunkSize; 
        private Integer chunkStart; 
        private String chunkStatus; 
        private String downloadUrl; 
        private String fileContentType; 
        private String fileCreateTime; 
        private String fileMetaData; 
        private String fileMetaId; 
        private String fileName; 
        private Integer fileSize; 
        private String fileStatus; 
        private String fileType; 
        private String fileUpdateTime; 
        private String fileUri; 
        private MetaData metaData; 
        private String thumbnailUrl; 

        private Builder() {
        } 

        private Builder(KnowledgeBaseMeta model) {
            this.chunkAttachment = model.chunkAttachment;
            this.chunkContent = model.chunkContent;
            this.chunkEnd = model.chunkEnd;
            this.chunkId = model.chunkId;
            this.chunkSequence = model.chunkSequence;
            this.chunkSize = model.chunkSize;
            this.chunkStart = model.chunkStart;
            this.chunkStatus = model.chunkStatus;
            this.downloadUrl = model.downloadUrl;
            this.fileContentType = model.fileContentType;
            this.fileCreateTime = model.fileCreateTime;
            this.fileMetaData = model.fileMetaData;
            this.fileMetaId = model.fileMetaId;
            this.fileName = model.fileName;
            this.fileSize = model.fileSize;
            this.fileStatus = model.fileStatus;
            this.fileType = model.fileType;
            this.fileUpdateTime = model.fileUpdateTime;
            this.fileUri = model.fileUri;
            this.metaData = model.metaData;
            this.thumbnailUrl = model.thumbnailUrl;
        } 

        /**
         * ChunkAttachment.
         */
        public Builder chunkAttachment(java.util.List<ChunkAttachment> chunkAttachment) {
            this.chunkAttachment = chunkAttachment;
            return this;
        }

        /**
         * ChunkContent.
         */
        public Builder chunkContent(String chunkContent) {
            this.chunkContent = chunkContent;
            return this;
        }

        /**
         * ChunkEnd.
         */
        public Builder chunkEnd(Integer chunkEnd) {
            this.chunkEnd = chunkEnd;
            return this;
        }

        /**
         * ChunkId.
         */
        public Builder chunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }

        /**
         * ChunkSequence.
         */
        public Builder chunkSequence(Integer chunkSequence) {
            this.chunkSequence = chunkSequence;
            return this;
        }

        /**
         * ChunkSize.
         */
        public Builder chunkSize(Integer chunkSize) {
            this.chunkSize = chunkSize;
            return this;
        }

        /**
         * ChunkStart.
         */
        public Builder chunkStart(Integer chunkStart) {
            this.chunkStart = chunkStart;
            return this;
        }

        /**
         * ChunkStatus.
         */
        public Builder chunkStatus(String chunkStatus) {
            this.chunkStatus = chunkStatus;
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
         * FileContentType.
         */
        public Builder fileContentType(String fileContentType) {
            this.fileContentType = fileContentType;
            return this;
        }

        /**
         * FileCreateTime.
         */
        public Builder fileCreateTime(String fileCreateTime) {
            this.fileCreateTime = fileCreateTime;
            return this;
        }

        /**
         * FileMetaData.
         */
        public Builder fileMetaData(String fileMetaData) {
            this.fileMetaData = fileMetaData;
            return this;
        }

        /**
         * FileMetaId.
         */
        public Builder fileMetaId(String fileMetaId) {
            this.fileMetaId = fileMetaId;
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
        public Builder fileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * FileStatus.
         */
        public Builder fileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
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
         * FileUpdateTime.
         */
        public Builder fileUpdateTime(String fileUpdateTime) {
            this.fileUpdateTime = fileUpdateTime;
            return this;
        }

        /**
         * FileUri.
         */
        public Builder fileUri(String fileUri) {
            this.fileUri = fileUri;
            return this;
        }

        /**
         * MetaData.
         */
        public Builder metaData(MetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * ThumbnailUrl.
         */
        public Builder thumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        public KnowledgeBaseMeta build() {
            return new KnowledgeBaseMeta(this);
        } 

    } 

    /**
     * 
     * {@link KnowledgeBaseMeta} extends {@link TeaModel}
     *
     * <p>KnowledgeBaseMeta</p>
     */
    public static class ChunkAttachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("PlaceholderId")
        private String placeholderId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private ChunkAttachment(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.placeholderId = builder.placeholderId;
            this.type = builder.type;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkAttachment create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return placeholderId
         */
        public String getPlaceholderId() {
            return this.placeholderId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String placeholderId; 
            private String type; 
            private String uri; 

            private Builder() {
            } 

            private Builder(ChunkAttachment model) {
                this.downloadUrl = model.downloadUrl;
                this.placeholderId = model.placeholderId;
                this.type = model.type;
                this.uri = model.uri;
            } 

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * PlaceholderId.
             */
            public Builder placeholderId(String placeholderId) {
                this.placeholderId = placeholderId;
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
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public ChunkAttachment build() {
                return new ChunkAttachment(this);
            } 

        } 

    }
    /**
     * 
     * {@link KnowledgeBaseMeta} extends {@link TeaModel}
     *
     * <p>KnowledgeBaseMeta</p>
     */
    public static class MetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileMetaId")
        private String fileMetaId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileUri")
        private String fileUri;

        private MetaData(Builder builder) {
            this.fileMetaId = builder.fileMetaId;
            this.fileName = builder.fileName;
            this.fileUri = builder.fileUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return fileMetaId
         */
        public String getFileMetaId() {
            return this.fileMetaId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileUri
         */
        public String getFileUri() {
            return this.fileUri;
        }

        public static final class Builder {
            private String fileMetaId; 
            private String fileName; 
            private String fileUri; 

            private Builder() {
            } 

            private Builder(MetaData model) {
                this.fileMetaId = model.fileMetaId;
                this.fileName = model.fileName;
                this.fileUri = model.fileUri;
            } 

            /**
             * FileMetaId.
             */
            public Builder fileMetaId(String fileMetaId) {
                this.fileMetaId = fileMetaId;
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
             * FileUri.
             */
            public Builder fileUri(String fileUri) {
                this.fileUri = fileUri;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
}
