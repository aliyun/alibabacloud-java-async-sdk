// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListNormalizationCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNormalizationCategoriesResponseBody</p>
 */
public class ListNormalizationCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("NormalizationCategories")
    private java.util.List<NormalizationCategories> normalizationCategories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListNormalizationCategoriesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationCategories = builder.normalizationCategories;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationCategoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return normalizationCategories
     */
    public java.util.List<NormalizationCategories> getNormalizationCategories() {
        return this.normalizationCategories;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<NormalizationCategories> normalizationCategories; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListNormalizationCategoriesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.normalizationCategories = model.normalizationCategories;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries to return in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of standardized categories.</p>
         */
        public Builder normalizationCategories(java.util.List<NormalizationCategories> normalizationCategories) {
            this.normalizationCategories = normalizationCategories;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListNormalizationCategoriesResponseBody build() {
            return new ListNormalizationCategoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNormalizationCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNormalizationCategoriesResponseBody</p>
     */
    public static class NormalizationCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
        private String normalizationCategoryId;

        @com.aliyun.core.annotation.NameInMap("NormalizationCategoryName")
        private String normalizationCategoryName;

        private NormalizationCategories(Builder builder) {
            this.normalizationCategoryId = builder.normalizationCategoryId;
            this.normalizationCategoryName = builder.normalizationCategoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationCategories create() {
            return builder().build();
        }

        /**
         * @return normalizationCategoryId
         */
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        /**
         * @return normalizationCategoryName
         */
        public String getNormalizationCategoryName() {
            return this.normalizationCategoryName;
        }

        public static final class Builder {
            private String normalizationCategoryId; 
            private String normalizationCategoryName; 

            private Builder() {
            } 

            private Builder(NormalizationCategories model) {
                this.normalizationCategoryId = model.normalizationCategoryId;
                this.normalizationCategoryName = model.normalizationCategoryName;
            } 

            /**
             * <p>The ID of the standardized category.</p>
             * 
             * <strong>example:</strong>
             * <p>COMMON_CATEGORY</p>
             */
            public Builder normalizationCategoryId(String normalizationCategoryId) {
                this.normalizationCategoryId = normalizationCategoryId;
                return this;
            }

            /**
             * <p>The name of the standardized category.</p>
             * 
             * <strong>example:</strong>
             * <p>COMMON_CATEGORY</p>
             */
            public Builder normalizationCategoryName(String normalizationCategoryName) {
                this.normalizationCategoryName = normalizationCategoryName;
                return this;
            }

            public NormalizationCategories build() {
                return new NormalizationCategories(this);
            } 

        } 

    }
}
