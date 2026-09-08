// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link RetrieveKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>RetrieveKnowledgeBaseResponseBody</p>
 */
public class RetrieveKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RetrieveKnowledgeBaseResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(RetrieveKnowledgeBaseResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response payload.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code for a failed request.</p>
         * 
         * <strong>example:</strong>
         * <p>KnowledgeBaseNotFound</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message for a failed request.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource not found kb-***</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The unique request ID. Use this ID to troubleshoot errors.</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RetrieveKnowledgeBaseResponseBody build() {
            return new RetrieveKnowledgeBaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RetrieveKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgeBaseResponseBody</p>
     */
    public static class Matches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LoaderMetadata")
        private String loaderMetadata;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        private Matches(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.loaderMetadata = builder.loaderMetadata;
            this.metadata = builder.metadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Matches create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return loaderMetadata
         */
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 
            private String id; 
            private String loaderMetadata; 
            private java.util.Map<String, ?> metadata; 

            private Builder() {
            } 

            private Builder(Matches model) {
                this.content = model.content;
                this.fileName = model.fileName;
                this.id = model.id;
                this.loaderMetadata = model.loaderMetadata;
                this.metadata = model.metadata;
            } 

            /**
             * <p>The text content.</p>
             * 
             * <strong>example:</strong>
             * <p>GraphRAG (Graph Retrieval-Augmented Generation) is an advanced AI framework that combines Knowledge Graphs with Large Language Models (LLMs) to improve the accuracy, context, and reasoning capabilities of information retrieval and generation.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The name of the source document.</p>
             * 
             * <strong>example:</strong>
             * <p>1.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The unique ID of the vector.</p>
             * 
             * <strong>example:</strong>
             * <p>3b35c95-57f3-442f-9220-xxxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The metadata generated by the document loader.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;page_pos&quot;: 1}</p>
             */
            public Builder loaderMetadata(String loaderMetadata) {
                this.loaderMetadata = loaderMetadata;
                return this;
            }

            /**
             * <p>A key-value map of the metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;title&quot;:&quot;test&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            public Matches build() {
                return new Matches(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgeBaseResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LoaderMetadata")
        private String loaderMetadata;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("RerankScore")
        private Double rerankScore;

        @com.aliyun.core.annotation.NameInMap("RetrievalSource")
        private Integer retrievalSource;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Vector")
        private java.util.List<Double> vector;

        private Results(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.loaderMetadata = builder.loaderMetadata;
            this.metadata = builder.metadata;
            this.rerankScore = builder.rerankScore;
            this.retrievalSource = builder.retrievalSource;
            this.score = builder.score;
            this.vector = builder.vector;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return loaderMetadata
         */
        public String getLoaderMetadata() {
            return this.loaderMetadata;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return rerankScore
         */
        public Double getRerankScore() {
            return this.rerankScore;
        }

        /**
         * @return retrievalSource
         */
        public Integer getRetrievalSource() {
            return this.retrievalSource;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return vector
         */
        public java.util.List<Double> getVector() {
            return this.vector;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 
            private String id; 
            private String loaderMetadata; 
            private java.util.Map<String, ?> metadata; 
            private Double rerankScore; 
            private Integer retrievalSource; 
            private Double score; 
            private java.util.List<Double> vector; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.content = model.content;
                this.fileName = model.fileName;
                this.id = model.id;
                this.loaderMetadata = model.loaderMetadata;
                this.metadata = model.metadata;
                this.rerankScore = model.rerankScore;
                this.retrievalSource = model.retrievalSource;
                this.score = model.score;
                this.vector = model.vector;
            } 

            /**
             * <p>The content of the retrieved text chunk.</p>
             * 
             * <strong>example:</strong>
             * <p>GraphRAG (Graph Retrieval-Augmented Generation) is an advanced AI framework that combines Knowledge Graphs with Large Language Models (LLMs) to improve the accuracy, context, and reasoning capabilities of information retrieval and generation.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The name of the source document.</p>
             * 
             * <strong>example:</strong>
             * <p>1.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The unique ID of the vector.</p>
             * 
             * <strong>example:</strong>
             * <p>3b35c95-57f3-442f-9220-xxxxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The metadata generated by the document loader.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;page_pos&quot;: 1}</p>
             */
            public Builder loaderMetadata(String loaderMetadata) {
                this.loaderMetadata = loaderMetadata;
                return this;
            }

            /**
             * <p>A key-value map of the metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;title&quot;:&quot;test&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The rerank score.</p>
             * 
             * <strong>example:</strong>
             * <p>6.2345</p>
             */
            public Builder rerankScore(Double rerankScore) {
                this.rerankScore = rerankScore;
                return this;
            }

            /**
             * <p>The method used for retrieval. Valid values: <code>1</code> (vector retrieval), <code>2</code> (full-text search), and <code>3</code> (hybrid search).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retrievalSource(Integer retrievalSource) {
                this.retrievalSource = retrievalSource;
                return this;
            }

            /**
             * <p>The similarity score of the result. This score depends on the distance metric (<code>l2</code>, <code>ip</code>, or <code>cosine</code>) specified when the index was created.</p>
             * 
             * <strong>example:</strong>
             * <p>0.81</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The vector data as an array of floating-point numbers.</p>
             */
            public Builder vector(java.util.List<Double> vector) {
                this.vector = vector;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link RetrieveKnowledgeBaseResponseBody} extends {@link TeaModel}
     *
     * <p>RetrieveKnowledgeBaseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Matches")
        private java.util.List<Matches> matches;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        private Data(Builder builder) {
            this.matches = builder.matches;
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return matches
         */
        public java.util.List<Matches> getMatches() {
            return this.matches;
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        public static final class Builder {
            private java.util.List<Matches> matches; 
            private java.util.List<Results> results; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.matches = model.matches;
                this.results = model.results;
            } 

            /**
             * <p>Matched items from the windowing process.</p>
             */
            public Builder matches(java.util.List<Matches> matches) {
                this.matches = matches;
                return this;
            }

            /**
             * <p>The retrieved results.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
