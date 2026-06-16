// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link WebSearchResponseBody} extends {@link TeaModel}
 *
 * <p>WebSearchResponseBody</p>
 */
public class WebSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchResult")
    private java.util.List<SearchResult> searchResult;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalResults")
    private Integer totalResults;

    private WebSearchResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.query = builder.query;
        this.requestId = builder.requestId;
        this.searchResult = builder.searchResult;
        this.success = builder.success;
        this.totalResults = builder.totalResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebSearchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchResult
     */
    public java.util.List<SearchResult> getSearchResult() {
        return this.searchResult;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalResults
     */
    public Integer getTotalResults() {
        return this.totalResults;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String query; 
        private String requestId; 
        private java.util.List<SearchResult> searchResult; 
        private Boolean success; 
        private Integer totalResults; 

        private Builder() {
        } 

        private Builder(WebSearchResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.query = model.query;
            this.requestId = model.requestId;
            this.searchResult = model.searchResult;
            this.success = model.success;
            this.totalResults = model.totalResults;
        } 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.query = query;
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
         * SearchResult.
         */
        public Builder searchResult(java.util.List<SearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalResults.
         */
        public Builder totalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }

        public WebSearchResponseBody build() {
            return new WebSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link WebSearchResponseBody} extends {@link TeaModel}
     *
     * <p>WebSearchResponseBody</p>
     */
    public static class SearchResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Snippet")
        private String snippet;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private SearchResult(Builder builder) {
            this.snippet = builder.snippet;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResult create() {
            return builder().build();
        }

        /**
         * @return snippet
         */
        public String getSnippet() {
            return this.snippet;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String snippet; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(SearchResult model) {
                this.snippet = model.snippet;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * Snippet.
             */
            public Builder snippet(String snippet) {
                this.snippet = snippet;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public SearchResult build() {
                return new SearchResult(this);
            } 

        } 

    }
}
