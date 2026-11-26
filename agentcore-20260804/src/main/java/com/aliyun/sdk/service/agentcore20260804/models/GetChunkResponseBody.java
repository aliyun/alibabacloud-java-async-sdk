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
 * {@link GetChunkResponseBody} extends {@link TeaModel}
 *
 * <p>GetChunkResponseBody</p>
 */
public class GetChunkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetChunkResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChunkResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetChunkResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>The details of the chunk with the specified sequence number in the currently published generation of the asset.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetChunkResponseBody build() {
            return new GetChunkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChunkResponseBody} extends {@link TeaModel}
     *
     * <p>GetChunkResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder(Data model) {
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
             * <p>The 1-based logical sequence number within the published asset. Re-chunking may change the sequence number. You must pass back the chunkToken of this item when editing.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chunkSeq(Integer chunkSeq) {
                this.chunkSeq = chunkSeq;
                return this;
            }

            /**
             * <p>The number of UTF-16 code units in the chunk content, using the same ChunkSize metric as EB.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder chunkSize(Integer chunkSize) {
                this.chunkSize = chunkSize;
                return this;
            }

            /**
             * <p>An opaque token that must be passed back as-is during updates. It is verified against the current published result at the beginning of the request, and an error is reported if it has expired. After a pure enable or disable operation starts, it does not follow new results from concurrent publishing. Do not parse or generate it manually.</p>
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
             * <p>The time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>Disabled chunks do not participate in retrieval. Administrative permissions are still required for chunk O&amp;M queries.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The name of the original file corresponding to the published chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>Uses the EB location format, such as p.3 for PDF, s.2 for PPT, or the worksheet name for spreadsheets. The old location is not returned when manual editing invalidates the mapping.</p>
             * 
             * <strong>example:</strong>
             * <p>p.3</p>
             */
            public Builder sourceLocation(String sourceLocation) {
                this.sourceLocation = sourceLocation;
                return this;
            }

            /**
             * <p>The hierarchical title path where the chunk is located. This field is not returned if the location cannot be determined.</p>
             * 
             * <strong>example:</strong>
             * <p>Product Guide &gt; Configuration</p>
             */
            public Builder titlePath(String titlePath) {
                this.titlePath = titlePath;
                return this;
            }

            /**
             * <p>The time in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-27T02:05:00Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
