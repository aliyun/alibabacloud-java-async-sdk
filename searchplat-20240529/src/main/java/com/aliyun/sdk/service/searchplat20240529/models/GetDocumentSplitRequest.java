// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetDocumentSplitRequest} extends {@link RequestModel}
 *
 * <p>GetDocumentSplitRequest</p>
 */
public class GetDocumentSplitRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("document")
    @com.aliyun.core.annotation.Validation(required = true)
    private Document document;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("strategy")
    private Strategy strategy;

    private GetDocumentSplitRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.document = builder.document;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocumentSplitRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return document
     */
    public Document getDocument() {
        return this.document;
    }

    /**
     * @return strategy
     */
    public Strategy getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<GetDocumentSplitRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private Document document; 
        private Strategy strategy; 

        private Builder() {
            super();
        } 

        private Builder(GetDocumentSplitRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.document = request.document;
            this.strategy = request.strategy;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder document(Document document) {
            this.putBodyParameter("document", document);
            this.document = document;
            return this;
        }

        /**
         * strategy.
         */
        public Builder strategy(Strategy strategy) {
            this.putBodyParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public GetDocumentSplitRequest build() {
            return new GetDocumentSplitRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDocumentSplitRequest} extends {@link TeaModel}
     *
     * <p>GetDocumentSplitRequest</p>
     */
    public static class Document extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("content_encoding")
        private String contentEncoding;

        @com.aliyun.core.annotation.NameInMap("content_type")
        private String contentType;

        private Document(Builder builder) {
            this.content = builder.content;
            this.contentEncoding = builder.contentEncoding;
            this.contentType = builder.contentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Document create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentEncoding
         */
        public String getContentEncoding() {
            return this.contentEncoding;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        public static final class Builder {
            private String content; 
            private String contentEncoding; 
            private String contentType; 

            private Builder() {
            } 

            private Builder(Document model) {
                this.content = model.content;
                this.contentEncoding = model.contentEncoding;
                this.contentType = model.contentType;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * content_encoding.
             */
            public Builder contentEncoding(String contentEncoding) {
                this.contentEncoding = contentEncoding;
                return this;
            }

            /**
             * content_type.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            public Document build() {
                return new Document(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDocumentSplitRequest} extends {@link TeaModel}
     *
     * <p>GetDocumentSplitRequest</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("compute_type")
        private String computeType;

        @com.aliyun.core.annotation.NameInMap("max_chunk_size")
        private Long maxChunkSize;

        @com.aliyun.core.annotation.NameInMap("need_sentence")
        private Boolean needSentence;

        private Strategy(Builder builder) {
            this.computeType = builder.computeType;
            this.maxChunkSize = builder.maxChunkSize;
            this.needSentence = builder.needSentence;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return computeType
         */
        public String getComputeType() {
            return this.computeType;
        }

        /**
         * @return maxChunkSize
         */
        public Long getMaxChunkSize() {
            return this.maxChunkSize;
        }

        /**
         * @return needSentence
         */
        public Boolean getNeedSentence() {
            return this.needSentence;
        }

        public static final class Builder {
            private String computeType; 
            private Long maxChunkSize; 
            private Boolean needSentence; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.computeType = model.computeType;
                this.maxChunkSize = model.maxChunkSize;
                this.needSentence = model.needSentence;
            } 

            /**
             * compute_type.
             */
            public Builder computeType(String computeType) {
                this.computeType = computeType;
                return this;
            }

            /**
             * max_chunk_size.
             */
            public Builder maxChunkSize(Long maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * need_sentence.
             */
            public Builder needSentence(Boolean needSentence) {
                this.needSentence = needSentence;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
}
