// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentexplorer20260317.models;

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
 * {@link SearchSkillsRequest} extends {@link RequestModel}
 *
 * <p>SearchSkillsRequest</p>
 */
public class SearchSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("categoryCode")
    private String categoryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("skip")
    private Integer skip;

    private SearchSkillsRequest(Builder builder) {
        super(builder);
        this.categoryCode = builder.categoryCode;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.skip = builder.skip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryCode
     */
    public String getCategoryCode() {
        return this.categoryCode;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    public static final class Builder extends Request.Builder<SearchSkillsRequest, Builder> {
        private String categoryCode; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer skip; 

        private Builder() {
            super();
        } 

        private Builder(SearchSkillsRequest request) {
            super(request);
            this.categoryCode = request.categoryCode;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.skip = request.skip;
        } 

        /**
         * categoryCode.
         */
        public Builder categoryCode(String categoryCode) {
            this.putQueryParameter("categoryCode", categoryCode);
            this.categoryCode = categoryCode;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * skip.
         */
        public Builder skip(Integer skip) {
            this.putQueryParameter("skip", skip);
            this.skip = skip;
            return this;
        }

        @Override
        public SearchSkillsRequest build() {
            return new SearchSkillsRequest(this);
        } 

    } 

}
