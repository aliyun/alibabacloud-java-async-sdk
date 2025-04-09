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
 * {@link GetWebSearchResponseBody} extends {@link TeaModel}
 *
 * <p>GetWebSearchResponseBody</p>
 */
public class GetWebSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetWebSearchResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebSearchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(GetWebSearchResponseBody model) {
            this.latency = model.latency;
            this.requestId = model.requestId;
            this.result = model.result;
            this.usage = model.usage;
        } 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetWebSearchResponseBody build() {
            return new GetWebSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWebSearchResponseBody} extends {@link TeaModel}
     *
     * <p>GetWebSearchResponseBody</p>
     */
    public static class SearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("link")
        private String link;

        @com.aliyun.core.annotation.NameInMap("position")
        private Long position;

        @com.aliyun.core.annotation.NameInMap("snippet")
        private String snippet;

        @com.aliyun.core.annotation.NameInMap("tilte")
        private String tilte;

        private SearchResult(Builder builder) {
            this.content = builder.content;
            this.link = builder.link;
            this.position = builder.position;
            this.snippet = builder.snippet;
            this.tilte = builder.tilte;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResult create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return position
         */
        public Long getPosition() {
            return this.position;
        }

        /**
         * @return snippet
         */
        public String getSnippet() {
            return this.snippet;
        }

        /**
         * @return tilte
         */
        public String getTilte() {
            return this.tilte;
        }

        public static final class Builder {
            private String content; 
            private String link; 
            private Long position; 
            private String snippet; 
            private String tilte; 

            private Builder() {
            } 

            private Builder(SearchResult model) {
                this.content = model.content;
                this.link = model.link;
                this.position = model.position;
                this.snippet = model.snippet;
                this.tilte = model.tilte;
            } 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * position.
             */
            public Builder position(Long position) {
                this.position = position;
                return this;
            }

            /**
             * snippet.
             */
            public Builder snippet(String snippet) {
                this.snippet = snippet;
                return this;
            }

            /**
             * tilte.
             */
            public Builder tilte(String tilte) {
                this.tilte = tilte;
                return this;
            }

            public SearchResult build() {
                return new SearchResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWebSearchResponseBody} extends {@link TeaModel}
     *
     * <p>GetWebSearchResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("search_result")
        private java.util.List<SearchResult> searchResult;

        private Result(Builder builder) {
            this.searchResult = builder.searchResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return searchResult
         */
        public java.util.List<SearchResult> getSearchResult() {
            return this.searchResult;
        }

        public static final class Builder {
            private java.util.List<SearchResult> searchResult; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.searchResult = model.searchResult;
            } 

            /**
             * search_result.
             */
            public Builder searchResult(java.util.List<SearchResult> searchResult) {
                this.searchResult = searchResult;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWebSearchResponseBody} extends {@link TeaModel}
     *
     * <p>GetWebSearchResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filter_model.input_tokens")
        private Long filter_model_input_tokens;

        @com.aliyun.core.annotation.NameInMap("filter_model.output_tokens")
        private Long filter_model_output_tokens;

        @com.aliyun.core.annotation.NameInMap("filter_model.total_tokens")
        private Long filter_model_total_tokens;

        @com.aliyun.core.annotation.NameInMap("rewrite_model.input_tokens")
        private Long rewrite_model_input_tokens;

        @com.aliyun.core.annotation.NameInMap("rewrite_model.output_tokens")
        private Long rewrite_model_output_tokens;

        @com.aliyun.core.annotation.NameInMap("rewrite_model.total_tokens")
        private Long rewrite_model_total_tokens;

        @com.aliyun.core.annotation.NameInMap("search_count")
        private Long searchCount;

        private Usage(Builder builder) {
            this.filter_model_input_tokens = builder.filter_model_input_tokens;
            this.filter_model_output_tokens = builder.filter_model_output_tokens;
            this.filter_model_total_tokens = builder.filter_model_total_tokens;
            this.rewrite_model_input_tokens = builder.rewrite_model_input_tokens;
            this.rewrite_model_output_tokens = builder.rewrite_model_output_tokens;
            this.rewrite_model_total_tokens = builder.rewrite_model_total_tokens;
            this.searchCount = builder.searchCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return filter_model_input_tokens
         */
        public Long getFilter_model_input_tokens() {
            return this.filter_model_input_tokens;
        }

        /**
         * @return filter_model_output_tokens
         */
        public Long getFilter_model_output_tokens() {
            return this.filter_model_output_tokens;
        }

        /**
         * @return filter_model_total_tokens
         */
        public Long getFilter_model_total_tokens() {
            return this.filter_model_total_tokens;
        }

        /**
         * @return rewrite_model_input_tokens
         */
        public Long getRewrite_model_input_tokens() {
            return this.rewrite_model_input_tokens;
        }

        /**
         * @return rewrite_model_output_tokens
         */
        public Long getRewrite_model_output_tokens() {
            return this.rewrite_model_output_tokens;
        }

        /**
         * @return rewrite_model_total_tokens
         */
        public Long getRewrite_model_total_tokens() {
            return this.rewrite_model_total_tokens;
        }

        /**
         * @return searchCount
         */
        public Long getSearchCount() {
            return this.searchCount;
        }

        public static final class Builder {
            private Long filter_model_input_tokens; 
            private Long filter_model_output_tokens; 
            private Long filter_model_total_tokens; 
            private Long rewrite_model_input_tokens; 
            private Long rewrite_model_output_tokens; 
            private Long rewrite_model_total_tokens; 
            private Long searchCount; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.filter_model_input_tokens = model.filter_model_input_tokens;
                this.filter_model_output_tokens = model.filter_model_output_tokens;
                this.filter_model_total_tokens = model.filter_model_total_tokens;
                this.rewrite_model_input_tokens = model.rewrite_model_input_tokens;
                this.rewrite_model_output_tokens = model.rewrite_model_output_tokens;
                this.rewrite_model_total_tokens = model.rewrite_model_total_tokens;
                this.searchCount = model.searchCount;
            } 

            /**
             * filter_model.input_tokens.
             */
            public Builder filter_model_input_tokens(Long filter_model_input_tokens) {
                this.filter_model_input_tokens = filter_model_input_tokens;
                return this;
            }

            /**
             * filter_model.output_tokens.
             */
            public Builder filter_model_output_tokens(Long filter_model_output_tokens) {
                this.filter_model_output_tokens = filter_model_output_tokens;
                return this;
            }

            /**
             * filter_model.total_tokens.
             */
            public Builder filter_model_total_tokens(Long filter_model_total_tokens) {
                this.filter_model_total_tokens = filter_model_total_tokens;
                return this;
            }

            /**
             * rewrite_model.input_tokens.
             */
            public Builder rewrite_model_input_tokens(Long rewrite_model_input_tokens) {
                this.rewrite_model_input_tokens = rewrite_model_input_tokens;
                return this;
            }

            /**
             * rewrite_model.output_tokens.
             */
            public Builder rewrite_model_output_tokens(Long rewrite_model_output_tokens) {
                this.rewrite_model_output_tokens = rewrite_model_output_tokens;
                return this;
            }

            /**
             * rewrite_model.total_tokens.
             */
            public Builder rewrite_model_total_tokens(Long rewrite_model_total_tokens) {
                this.rewrite_model_total_tokens = rewrite_model_total_tokens;
                return this;
            }

            /**
             * search_count.
             */
            public Builder searchCount(Long searchCount) {
                this.searchCount = searchCount;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
