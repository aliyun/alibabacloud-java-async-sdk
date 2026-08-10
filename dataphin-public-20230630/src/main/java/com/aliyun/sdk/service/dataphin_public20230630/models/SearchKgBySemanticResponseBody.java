// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link SearchKgBySemanticResponseBody} extends {@link TeaModel}
 *
 * <p>SearchKgBySemanticResponseBody</p>
 */
public class SearchKgBySemanticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SearchKgBySemanticResponseBody(Builder builder) {
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

    public static SearchKgBySemanticResponseBody create() {
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

        private Builder(SearchKgBySemanticResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SearchKgBySemanticResponseBody build() {
            return new SearchKgBySemanticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchKgBySemanticResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKgBySemanticResponseBody</p>
     */
    public static class SearchResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("ItemTypeCode")
        private String itemTypeCode;

        @com.aliyun.core.annotation.NameInMap("MatchedPropertyCode")
        private String matchedPropertyCode;

        @com.aliyun.core.annotation.NameInMap("MatchedPropertyValue")
        private String matchedPropertyValue;

        @com.aliyun.core.annotation.NameInMap("SimilarityScore")
        private Float similarityScore;

        private SearchResults(Builder builder) {
            this.itemId = builder.itemId;
            this.itemTypeCode = builder.itemTypeCode;
            this.matchedPropertyCode = builder.matchedPropertyCode;
            this.matchedPropertyValue = builder.matchedPropertyValue;
            this.similarityScore = builder.similarityScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchResults create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return itemTypeCode
         */
        public String getItemTypeCode() {
            return this.itemTypeCode;
        }

        /**
         * @return matchedPropertyCode
         */
        public String getMatchedPropertyCode() {
            return this.matchedPropertyCode;
        }

        /**
         * @return matchedPropertyValue
         */
        public String getMatchedPropertyValue() {
            return this.matchedPropertyValue;
        }

        /**
         * @return similarityScore
         */
        public Float getSimilarityScore() {
            return this.similarityScore;
        }

        public static final class Builder {
            private String itemId; 
            private String itemTypeCode; 
            private String matchedPropertyCode; 
            private String matchedPropertyValue; 
            private Float similarityScore; 

            private Builder() {
            } 

            private Builder(SearchResults model) {
                this.itemId = model.itemId;
                this.itemTypeCode = model.itemTypeCode;
                this.matchedPropertyCode = model.matchedPropertyCode;
                this.matchedPropertyValue = model.matchedPropertyValue;
                this.similarityScore = model.similarityScore;
            } 

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemTypeCode.
             */
            public Builder itemTypeCode(String itemTypeCode) {
                this.itemTypeCode = itemTypeCode;
                return this;
            }

            /**
             * MatchedPropertyCode.
             */
            public Builder matchedPropertyCode(String matchedPropertyCode) {
                this.matchedPropertyCode = matchedPropertyCode;
                return this;
            }

            /**
             * MatchedPropertyValue.
             */
            public Builder matchedPropertyValue(String matchedPropertyValue) {
                this.matchedPropertyValue = matchedPropertyValue;
                return this;
            }

            /**
             * SimilarityScore.
             */
            public Builder similarityScore(Float similarityScore) {
                this.similarityScore = similarityScore;
                return this;
            }

            public SearchResults build() {
                return new SearchResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchKgBySemanticResponseBody} extends {@link TeaModel}
     *
     * <p>SearchKgBySemanticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SearchResults")
        private java.util.List<SearchResults> searchResults;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.searchResults = builder.searchResults;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return searchResults
         */
        public java.util.List<SearchResults> getSearchResults() {
            return this.searchResults;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<SearchResults> searchResults; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.searchResults = model.searchResults;
                this.totalCount = model.totalCount;
            } 

            /**
             * SearchResults.
             */
            public Builder searchResults(java.util.List<SearchResults> searchResults) {
                this.searchResults = searchResults;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
