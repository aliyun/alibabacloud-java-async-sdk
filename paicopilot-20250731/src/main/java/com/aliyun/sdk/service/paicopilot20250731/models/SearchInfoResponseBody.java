// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
 * {@link SearchInfoResponseBody} extends {@link TeaModel}
 *
 * <p>SearchInfoResponseBody</p>
 */
public class SearchInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseSearchResults")
    private java.util.List<KnowledgeBaseSearchResults> knowledgeBaseSearchResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebSearchResults")
    private java.util.List<WebSearchResults> webSearchResults;

    private SearchInfoResponseBody(Builder builder) {
        this.knowledgeBaseSearchResults = builder.knowledgeBaseSearchResults;
        this.requestId = builder.requestId;
        this.webSearchResults = builder.webSearchResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseSearchResults
     */
    public java.util.List<KnowledgeBaseSearchResults> getKnowledgeBaseSearchResults() {
        return this.knowledgeBaseSearchResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webSearchResults
     */
    public java.util.List<WebSearchResults> getWebSearchResults() {
        return this.webSearchResults;
    }

    public static final class Builder {
        private java.util.List<KnowledgeBaseSearchResults> knowledgeBaseSearchResults; 
        private String requestId; 
        private java.util.List<WebSearchResults> webSearchResults; 

        private Builder() {
        } 

        private Builder(SearchInfoResponseBody model) {
            this.knowledgeBaseSearchResults = model.knowledgeBaseSearchResults;
            this.requestId = model.requestId;
            this.webSearchResults = model.webSearchResults;
        } 

        /**
         * KnowledgeBaseSearchResults.
         */
        public Builder knowledgeBaseSearchResults(java.util.List<KnowledgeBaseSearchResults> knowledgeBaseSearchResults) {
            this.knowledgeBaseSearchResults = knowledgeBaseSearchResults;
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
         * WebSearchResults.
         */
        public Builder webSearchResults(java.util.List<WebSearchResults> webSearchResults) {
            this.webSearchResults = webSearchResults;
            return this;
        }

        public SearchInfoResponseBody build() {
            return new SearchInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchInfoResponseBody} extends {@link TeaModel}
     *
     * <p>SearchInfoResponseBody</p>
     */
    public static class KnowledgeBaseSearchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("ResultContent")
        private String resultContent;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        private KnowledgeBaseSearchResults(Builder builder) {
            this.index = builder.index;
            this.resultContent = builder.resultContent;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeBaseSearchResults create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return resultContent
         */
        public String getResultContent() {
            return this.resultContent;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        public static final class Builder {
            private String index; 
            private String resultContent; 
            private Double score; 

            private Builder() {
            } 

            private Builder(KnowledgeBaseSearchResults model) {
                this.index = model.index;
                this.resultContent = model.resultContent;
                this.score = model.score;
            } 

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * ResultContent.
             */
            public Builder resultContent(String resultContent) {
                this.resultContent = resultContent;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            public KnowledgeBaseSearchResults build() {
                return new KnowledgeBaseSearchResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchInfoResponseBody} extends {@link TeaModel}
     *
     * <p>SearchInfoResponseBody</p>
     */
    public static class WebSearchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("ResultContent")
        private String resultContent;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("SourceLink")
        private String sourceLink;

        private WebSearchResults(Builder builder) {
            this.index = builder.index;
            this.resultContent = builder.resultContent;
            this.score = builder.score;
            this.sourceLink = builder.sourceLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebSearchResults create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return resultContent
         */
        public String getResultContent() {
            return this.resultContent;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return sourceLink
         */
        public String getSourceLink() {
            return this.sourceLink;
        }

        public static final class Builder {
            private String index; 
            private String resultContent; 
            private Double score; 
            private String sourceLink; 

            private Builder() {
            } 

            private Builder(WebSearchResults model) {
                this.index = model.index;
                this.resultContent = model.resultContent;
                this.score = model.score;
                this.sourceLink = model.sourceLink;
            } 

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * ResultContent.
             */
            public Builder resultContent(String resultContent) {
                this.resultContent = resultContent;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * SourceLink.
             */
            public Builder sourceLink(String sourceLink) {
                this.sourceLink = sourceLink;
                return this;
            }

            public WebSearchResults build() {
                return new WebSearchResults(this);
            } 

        } 

    }
}
