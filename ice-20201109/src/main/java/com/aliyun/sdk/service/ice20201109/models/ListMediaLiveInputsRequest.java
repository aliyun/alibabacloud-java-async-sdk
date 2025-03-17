// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListMediaLiveInputsRequest} extends {@link RequestModel}
 *
 * <p>ListMediaLiveInputsRequest</p>
 */
public class ListMediaLiveInputsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Types")
    private String types;

    private ListMediaLiveInputsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.skip = builder.skip;
        this.sortOrder = builder.sortOrder;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaLiveInputsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListMediaLiveInputsRequest, Builder> {
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer skip; 
        private String sortOrder; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(ListMediaLiveInputsRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.skip = request.skip;
            this.sortOrder = request.sortOrder;
            this.types = request.types;
        } 

        /**
         * <p>The keyword of the query. You can perform a fuzzy search on input ID or name.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: If you do not specify this parameter or if you set a value smaller than 10, the default value is 10. If you set a value greater than 100, the default value is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries to be skipped in the query. If the number of entries you attempt to skip exceeds the number of entries that meet the condition, an empty list is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder skip(Integer skip) {
            this.putBodyParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * <p>The sorting order of the inputs by creation time. Default value: asc. Valid values: desc and asc. asc indicates the ascending order, and desc indicates the descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The type of inputs you want to query. You can separate multiple input types with commas (,) in a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;RTMP_PUSH&quot;,&quot;SRT_PULL&quot;]</p>
         */
        public Builder types(String types) {
            this.putBodyParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public ListMediaLiveInputsRequest build() {
            return new ListMediaLiveInputsRequest(this);
        } 

    } 

}
