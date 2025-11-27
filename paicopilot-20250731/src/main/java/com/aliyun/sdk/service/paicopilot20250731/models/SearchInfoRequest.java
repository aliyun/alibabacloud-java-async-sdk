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
 * {@link SearchInfoRequest} extends {@link RequestModel}
 *
 * <p>SearchInfoRequest</p>
 */
public class SearchInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseFilters")
    private java.util.List<KnowledgeBaseFilters> knowledgeBaseFilters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebFilters")
    private java.util.List<WebFilters> webFilters;

    private SearchInfoRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseFilters = builder.knowledgeBaseFilters;
        this.webFilters = builder.webFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseFilters
     */
    public java.util.List<KnowledgeBaseFilters> getKnowledgeBaseFilters() {
        return this.knowledgeBaseFilters;
    }

    /**
     * @return webFilters
     */
    public java.util.List<WebFilters> getWebFilters() {
        return this.webFilters;
    }

    public static final class Builder extends Request.Builder<SearchInfoRequest, Builder> {
        private java.util.List<KnowledgeBaseFilters> knowledgeBaseFilters; 
        private java.util.List<WebFilters> webFilters; 

        private Builder() {
            super();
        } 

        private Builder(SearchInfoRequest request) {
            super(request);
            this.knowledgeBaseFilters = request.knowledgeBaseFilters;
            this.webFilters = request.webFilters;
        } 

        /**
         * KnowledgeBaseFilters.
         */
        public Builder knowledgeBaseFilters(java.util.List<KnowledgeBaseFilters> knowledgeBaseFilters) {
            this.putBodyParameter("KnowledgeBaseFilters", knowledgeBaseFilters);
            this.knowledgeBaseFilters = knowledgeBaseFilters;
            return this;
        }

        /**
         * WebFilters.
         */
        public Builder webFilters(java.util.List<WebFilters> webFilters) {
            this.putBodyParameter("WebFilters", webFilters);
            this.webFilters = webFilters;
            return this;
        }

        @Override
        public SearchInfoRequest build() {
            return new SearchInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchInfoRequest} extends {@link TeaModel}
     *
     * <p>SearchInfoRequest</p>
     */
    public static class KnowledgeBaseFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CollectionName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String collectionName;

        @com.aliyun.core.annotation.NameInMap("Query")
        @com.aliyun.core.annotation.Validation(required = true)
        private String query;

        @com.aliyun.core.annotation.NameInMap("ResultLimit")
        private Integer resultLimit;

        @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
        private Double scoreThreshold;

        private KnowledgeBaseFilters(Builder builder) {
            this.collectionName = builder.collectionName;
            this.query = builder.query;
            this.resultLimit = builder.resultLimit;
            this.scoreThreshold = builder.scoreThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KnowledgeBaseFilters create() {
            return builder().build();
        }

        /**
         * @return collectionName
         */
        public String getCollectionName() {
            return this.collectionName;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return resultLimit
         */
        public Integer getResultLimit() {
            return this.resultLimit;
        }

        /**
         * @return scoreThreshold
         */
        public Double getScoreThreshold() {
            return this.scoreThreshold;
        }

        public static final class Builder {
            private String collectionName; 
            private String query; 
            private Integer resultLimit; 
            private Double scoreThreshold; 

            private Builder() {
            } 

            private Builder(KnowledgeBaseFilters model) {
                this.collectionName = model.collectionName;
                this.query = model.query;
                this.resultLimit = model.resultLimit;
                this.scoreThreshold = model.scoreThreshold;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>pai_qa</p>
             */
            public Builder collectionName(String collectionName) {
                this.collectionName = collectionName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>what is pai</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * ResultLimit.
             */
            public Builder resultLimit(Integer resultLimit) {
                this.resultLimit = resultLimit;
                return this;
            }

            /**
             * ScoreThreshold.
             */
            public Builder scoreThreshold(Double scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            public KnowledgeBaseFilters build() {
                return new KnowledgeBaseFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchInfoRequest} extends {@link TeaModel}
     *
     * <p>SearchInfoRequest</p>
     */
    public static class WebFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IncludeSites")
        private java.util.List<String> includeSites;

        @com.aliyun.core.annotation.NameInMap("Query")
        @com.aliyun.core.annotation.Validation(required = true)
        private String query;

        @com.aliyun.core.annotation.NameInMap("ResultLimit")
        private Integer resultLimit;

        @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
        private Double scoreThreshold;

        private WebFilters(Builder builder) {
            this.includeSites = builder.includeSites;
            this.query = builder.query;
            this.resultLimit = builder.resultLimit;
            this.scoreThreshold = builder.scoreThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebFilters create() {
            return builder().build();
        }

        /**
         * @return includeSites
         */
        public java.util.List<String> getIncludeSites() {
            return this.includeSites;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return resultLimit
         */
        public Integer getResultLimit() {
            return this.resultLimit;
        }

        /**
         * @return scoreThreshold
         */
        public Double getScoreThreshold() {
            return this.scoreThreshold;
        }

        public static final class Builder {
            private java.util.List<String> includeSites; 
            private String query; 
            private Integer resultLimit; 
            private Double scoreThreshold; 

            private Builder() {
            } 

            private Builder(WebFilters model) {
                this.includeSites = model.includeSites;
                this.query = model.query;
                this.resultLimit = model.resultLimit;
                this.scoreThreshold = model.scoreThreshold;
            } 

            /**
             * IncludeSites.
             */
            public Builder includeSites(java.util.List<String> includeSites) {
                this.includeSites = includeSites;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>what is dsw</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * ResultLimit.
             */
            public Builder resultLimit(Integer resultLimit) {
                this.resultLimit = resultLimit;
                return this;
            }

            /**
             * ScoreThreshold.
             */
            public Builder scoreThreshold(Double scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            public WebFilters build() {
                return new WebFilters(this);
            } 

        } 

    }
}
