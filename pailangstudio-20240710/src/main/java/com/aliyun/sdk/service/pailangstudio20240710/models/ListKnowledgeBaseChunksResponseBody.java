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
 * {@link ListKnowledgeBaseChunksResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeBaseChunksResponseBody</p>
 */
public class ListKnowledgeBaseChunksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseChunks")
    private java.util.List<KnowledgeBaseChunks> knowledgeBaseChunks;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListKnowledgeBaseChunksResponseBody(Builder builder) {
        this.knowledgeBaseChunks = builder.knowledgeBaseChunks;
        this.maxResults = builder.maxResults;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeBaseChunksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseChunks
     */
    public java.util.List<KnowledgeBaseChunks> getKnowledgeBaseChunks() {
        return this.knowledgeBaseChunks;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<KnowledgeBaseChunks> knowledgeBaseChunks; 
        private Integer maxResults; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListKnowledgeBaseChunksResponseBody model) {
            this.knowledgeBaseChunks = model.knowledgeBaseChunks;
            this.maxResults = model.maxResults;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>切片列表</p>
         */
        public Builder knowledgeBaseChunks(java.util.List<KnowledgeBaseChunks> knowledgeBaseChunks) {
            this.knowledgeBaseChunks = knowledgeBaseChunks;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKnowledgeBaseChunksResponseBody build() {
            return new ListKnowledgeBaseChunksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeBaseChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseChunksResponseBody</p>
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
             * <p>下载地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://mybucket.oss-cn-shanghai.aliyuncs.com/">https://mybucket.oss-cn-shanghai.aliyuncs.com/</a>...</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>占位符ID</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_PLACEHOLDER_0</p>
             */
            public Builder placeholderId(String placeholderId) {
                this.placeholderId = placeholderId;
                return this;
            }

            /**
             * <p>类型</p>
             * 
             * <strong>example:</strong>
             * <p>image</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>路径</p>
             * 
             * <strong>example:</strong>
             * <p>oss://mybucket/path/file.txt</p>
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
     * {@link ListKnowledgeBaseChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseChunksResponseBody</p>
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
             * <p>文件元数据ID</p>
             * 
             * <strong>example:</strong>
             * <p>xd8e****79du</p>
             */
            public Builder fileMetaId(String fileMetaId) {
                this.fileMetaId = fileMetaId;
                return this;
            }

            /**
             * <p>文件名</p>
             * 
             * <strong>example:</strong>
             * <p>file1.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>文件地址</p>
             * 
             * <strong>example:</strong>
             * <p>oss://mybucketpath/file1.txt</p>
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
    /**
     * 
     * {@link ListKnowledgeBaseChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeBaseChunksResponseBody</p>
     */
    public static class KnowledgeBaseChunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChunkAttachment")
        private java.util.List<ChunkAttachment> chunkAttachment;

        @com.aliyun.core.annotation.NameInMap("ChunkContent")
        private String chunkContent;

        @com.aliyun.core.annotation.NameInMap("ChunkEnd")
        private Integer chunkEnd;

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

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseChunkId")
        private String knowledgeBaseChunkId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("MetaData")
        private MetaData metaData;

        @com.aliyun.core.annotation.NameInMap("ThumbnailUrl")
        private String thumbnailUrl;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private KnowledgeBaseChunks(Builder builder) {
            this.chunkAttachment = builder.chunkAttachment;
            this.chunkContent = builder.chunkContent;
            this.chunkEnd = builder.chunkEnd;
            this.chunkSequence = builder.chunkSequence;
            this.chunkSize = builder.chunkSize;
            this.chunkStart = builder.chunkStart;
            this.chunkStatus = builder.chunkStatus;
            this.downloadUrl = builder.downloadUrl;
            this.knowledgeBaseChunkId = builder.knowledgeBaseChunkId;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.metaData = builder.metaData;
            this.thumbnailUrl = builder.thumbnailUrl;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeBaseChunks create() {
            return builder().build();
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
         * @return knowledgeBaseChunkId
         */
        public String getKnowledgeBaseChunkId() {
            return this.knowledgeBaseChunkId;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
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

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private java.util.List<ChunkAttachment> chunkAttachment; 
            private String chunkContent; 
            private Integer chunkEnd; 
            private Integer chunkSequence; 
            private Integer chunkSize; 
            private Integer chunkStart; 
            private String chunkStatus; 
            private String downloadUrl; 
            private String knowledgeBaseChunkId; 
            private String knowledgeBaseId; 
            private MetaData metaData; 
            private String thumbnailUrl; 
            private String versionName; 

            private Builder() {
            } 

            private Builder(KnowledgeBaseChunks model) {
                this.chunkAttachment = model.chunkAttachment;
                this.chunkContent = model.chunkContent;
                this.chunkEnd = model.chunkEnd;
                this.chunkSequence = model.chunkSequence;
                this.chunkSize = model.chunkSize;
                this.chunkStart = model.chunkStart;
                this.chunkStatus = model.chunkStatus;
                this.downloadUrl = model.downloadUrl;
                this.knowledgeBaseChunkId = model.knowledgeBaseChunkId;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.metaData = model.metaData;
                this.thumbnailUrl = model.thumbnailUrl;
                this.versionName = model.versionName;
            } 

            /**
             * <p>切片附属信息</p>
             */
            public Builder chunkAttachment(java.util.List<ChunkAttachment> chunkAttachment) {
                this.chunkAttachment = chunkAttachment;
                return this;
            }

            /**
             * <p>切片内容</p>
             * 
             * <strong>example:</strong>
             * <p>content</p>
             */
            public Builder chunkContent(String chunkContent) {
                this.chunkContent = chunkContent;
                return this;
            }

            /**
             * <p>切片结束位置</p>
             * 
             * <strong>example:</strong>
             * <p>30000</p>
             */
            public Builder chunkEnd(Integer chunkEnd) {
                this.chunkEnd = chunkEnd;
                return this;
            }

            /**
             * <p>切片顺序</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkSequence(Integer chunkSequence) {
                this.chunkSequence = chunkSequence;
                return this;
            }

            /**
             * <p>切片大小</p>
             * 
             * <strong>example:</strong>
             * <p>1873</p>
             */
            public Builder chunkSize(Integer chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * <p>切片起始位置</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder chunkStart(Integer chunkStart) {
                this.chunkStart = chunkStart;
                return this;
            }

            /**
             * <p>切片状态</p>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder chunkStatus(String chunkStatus) {
                this.chunkStatus = chunkStatus;
                return this;
            }

            /**
             * <p>切片下载地址</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://mybucket.oss-cn-shanghai.aliyuncs.com/">https://mybucket.oss-cn-shanghai.aliyuncs.com/</a>...</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>切片ID</p>
             * 
             * <strong>example:</strong>
             * <p>123e4567-e89b-12d3-a456-426655440000</p>
             */
            public Builder knowledgeBaseChunkId(String knowledgeBaseChunkId) {
                this.knowledgeBaseChunkId = knowledgeBaseChunkId;
                return this;
            }

            /**
             * <p>知识库ID</p>
             * 
             * <strong>example:</strong>
             * <p>d-ix****o9</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>原始文件信息</p>
             */
            public Builder metaData(MetaData metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>切片缩略图</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://mybucket.oss-cn-shanghai.aliyuncs.com/">https://mybucket.oss-cn-shanghai.aliyuncs.com/</a>...</p>
             */
            public Builder thumbnailUrl(String thumbnailUrl) {
                this.thumbnailUrl = thumbnailUrl;
                return this;
            }

            /**
             * <p>知识库版本</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public KnowledgeBaseChunks build() {
                return new KnowledgeBaseChunks(this);
            } 

        } 

    }
}
