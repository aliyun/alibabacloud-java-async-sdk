// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListChunksResponseBody} extends {@link TeaModel}
 *
 * <p>ListChunksResponseBody</p>
 */
public class ListChunksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListChunksResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChunksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListChunksResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The stable result code.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The actual HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The currently published chunks. Chunks within a single asset are sorted by chunkSeq. Chunks across assets are sorted by assetId and chunkSeq.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page size used for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The description of the data masking result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token for the next page. Pass this value as is in the nextToken parameter of the subsequent request to continue pagination. If this value is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>opaque-next-token</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of chunks that match the filter conditions in the current published generation of the asset. This parameter is returned only when assetId is specified. It is not returned for cross-asset queries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListChunksResponseBody build() {
            return new ListChunksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListChunksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("chunkSeq")
        private Integer chunkSeq;

        @com.aliyun.core.annotation.NameInMap("chunkSize")
        private Integer chunkSize;

        @com.aliyun.core.annotation.NameInMap("chunkToken")
        private String chunkToken;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("sourceLocation")
        private String sourceLocation;

        @com.aliyun.core.annotation.NameInMap("titlePath")
        private String titlePath;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Items(Builder builder) {
            this.assetId = builder.assetId;
            this.chunkSeq = builder.chunkSeq;
            this.chunkSize = builder.chunkSize;
            this.chunkToken = builder.chunkToken;
            this.content = builder.content;
            this.createdAt = builder.createdAt;
            this.enabled = builder.enabled;
            this.fileName = builder.fileName;
            this.sourceLocation = builder.sourceLocation;
            this.titlePath = builder.titlePath;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return chunkSeq
         */
        public Integer getChunkSeq() {
            return this.chunkSeq;
        }

        /**
         * @return chunkSize
         */
        public Integer getChunkSize() {
            return this.chunkSize;
        }

        /**
         * @return chunkToken
         */
        public String getChunkToken() {
            return this.chunkToken;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return sourceLocation
         */
        public String getSourceLocation() {
            return this.sourceLocation;
        }

        /**
         * @return titlePath
         */
        public String getTitlePath() {
            return this.titlePath;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String assetId; 
            private Integer chunkSeq; 
            private Integer chunkSize; 
            private String chunkToken; 
            private String content; 
            private String createdAt; 
            private Boolean enabled; 
            private String fileName; 
            private String sourceLocation; 
            private String titlePath; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.assetId = model.assetId;
                this.chunkSeq = model.chunkSeq;
                this.chunkSize = model.chunkSize;
                this.chunkToken = model.chunkToken;
                this.content = model.content;
                this.createdAt = model.createdAt;
                this.enabled = model.enabled;
                this.fileName = model.fileName;
                this.sourceLocation = model.sourceLocation;
                this.titlePath = model.titlePath;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * <p>The asset to which the chunk belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>asset-001</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>The logical sequence number that starts from 1 within the published asset. Resplitting may change the sequence number. You must pass back the chunkToken of this chunk when you edit it.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkSeq(Integer chunkSeq) {
                this.chunkSeq = chunkSeq;
                return this;
            }

            /**
             * <p>The number of UTF-16 code units in the chunk content. This metric follows the EB ChunkSize calculation standard.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder chunkSize(Integer chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * <p>The opaque token that must be passed back as is during updates. The token is validated against the current publish result at the beginning of the request. An error is returned if the token has expired. After a pure enable or disable operation starts, the token does not follow new concurrent publish results. Do not parse or generate this token.</p>
             * 
             * <strong>example:</strong>
             * <p>ct-0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
             */
            public Builder chunkToken(String chunkToken) {
                this.chunkToken = chunkToken;
                return this;
            }

            /**
             * <p>The content of the currently published chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>Welcome to the product</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time in ISO 8601 format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Indicates whether the chunk is enabled. Disabled chunks are not included in searches. Administrative permissions are still required for chunk O&amp;M queries.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the source file that corresponds to the published chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The location in the source file. The format follows the EB positioning convention, such as p.3 for PDF files, s.2 for PPT files, or the worksheet name for spreadsheets. The previous location is not returned if manual editing invalidates the mapping.</p>
             * 
             * <strong>example:</strong>
             * <p>p.3</p>
             */
            public Builder sourceLocation(String sourceLocation) {
                this.sourceLocation = sourceLocation;
                return this;
            }

            /**
             * <p>The hierarchical heading path where the chunk is located. This parameter is not returned if the location cannot be determined.</p>
             * 
             * <strong>example:</strong>
             * <p>Product Guide &gt; Configuration</p>
             */
            public Builder titlePath(String titlePath) {
                this.titlePath = titlePath;
                return this;
            }

            /**
             * <p>The update time in ISO 8601 format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
