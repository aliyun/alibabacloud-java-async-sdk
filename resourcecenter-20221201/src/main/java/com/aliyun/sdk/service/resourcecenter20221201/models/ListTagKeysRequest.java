// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link ListTagKeysRequest} extends {@link RequestModel}
 *
 * <p>ListTagKeysRequest</p>
 */
public class ListTagKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private String tagKey;

    private ListTagKeysRequest(Builder builder) {
        super(builder);
        this.matchType = builder.matchType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.tagKey = builder.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagKeysRequest create() {
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
     * @return tagKey
     */
    public String getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<ListTagKeysRequest, Builder> {
        private String matchType; 
        private Integer maxResults; 
        private String nextToken; 
        private String tagKey; 

        private Builder() {
            super();
        } 

        private Builder(ListTagKeysRequest request) {
            super(request);
            this.matchType = request.matchType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.tagKey = request.tagKey;
        } 

        /**
         * <p>The matching mode. Valid values:</p>
         * <ul>
         * <li>Equals: equal match</li>
         * <li>Prefix: match by prefix</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equals</p>
         */
        public Builder matchType(String matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The maximum number of entries to return on each page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * <p>If the total number of entries returned for the current request exceeds the value of the <code>MaxResults</code> parameter, the entries are truncated. In this case, you can use the <code>token</code> to initiate another request and obtain the remaining entries.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUYb00R0gHZBE8FVDeoh2ME93VeeEPUHs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test_key</p>
         */
        public Builder tagKey(String tagKey) {
            this.putQueryParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public ListTagKeysRequest build() {
            return new ListTagKeysRequest(this);
        } 

    } 

}
