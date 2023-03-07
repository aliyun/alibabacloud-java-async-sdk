// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiAccountTagValuesRequest} extends {@link RequestModel}
 *
 * <p>ListMultiAccountTagValuesRequest</p>
 */
public class ListMultiAccountTagValuesRequest extends Request {
    @Query
    @NameInMap("MatchType")
    private String matchType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("TagKey")
    @Validation(required = true)
    private String tagKey;

    @Query
    @NameInMap("TagValue")
    private String tagValue;

    private ListMultiAccountTagValuesRequest(Builder builder) {
        super(builder);
        this.matchType = builder.matchType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.scope = builder.scope;
        this.tagKey = builder.tagKey;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountTagValuesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder extends Request.Builder<ListMultiAccountTagValuesRequest, Builder> {
        private String matchType; 
        private Integer maxResults; 
        private String nextToken; 
        private String scope; 
        private String tagKey; 
        private String tagValue; 

        private Builder() {
            super();
        } 

        private Builder(ListMultiAccountTagValuesRequest request) {
            super(request);
            this.matchType = request.matchType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.scope = request.scope;
            this.tagKey = request.tagKey;
            this.tagValue = request.tagValue;
        } 

        /**
         * EQUALS: 匹配 (match), TERMS: 术语匹配 (term/terms), PREFIX: 前缀匹配, NOT_EQUALS: 不等于, CONTAINS: 包含, RANGE: 范围匹配, GREATER_THAN: 大于, GREATER_THAN_OR_EQUAL_TO: 大于等于, LESS_THAN: 小于, LESS_THAN_OR_EQUAL_TO: 小于等于, EXISTS: 存在, NOT_EXISTS: 不存在, INVALID: 无效类型, NOT_CONTAINS: 不包含
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * TagKey.
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * TagValue.
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("TagValue", tagValue);
            this.tagValue = tagValue;
            return this;
        }

        @Override
        public ListMultiAccountTagValuesRequest build() {
            return new ListMultiAccountTagValuesRequest(this);
        } 

    } 

}
