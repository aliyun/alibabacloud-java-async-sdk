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
 * {@link ListMediaLiveChannelsRequest} extends {@link RequestModel}
 *
 * <p>ListMediaLiveChannelsRequest</p>
 */
public class ListMediaLiveChannelsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("States")
    private String states;

    private ListMediaLiveChannelsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.skip = builder.skip;
        this.sortOrder = builder.sortOrder;
        this.states = builder.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaLiveChannelsRequest create() {
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
     * @return states
     */
    public String getStates() {
        return this.states;
    }

    public static final class Builder extends Request.Builder<ListMediaLiveChannelsRequest, Builder> {
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer skip; 
        private String sortOrder; 
        private String states; 

        private Builder() {
            super();
        } 

        private Builder(ListMediaLiveChannelsRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.skip = request.skip;
            this.sortOrder = request.sortOrder;
            this.states = request.states;
        } 

        /**
         * <p>The keyword of the query. You can perform a fuzzy search on channel ID or name.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value:</p>
         * <ul>
         * <li>If you do not specify this parameter or if you set a value smaller than 10, the default value is 10.</li>
         * <li>If you set a value greater than 100, the default value is 100.</li>
         * </ul>
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
         * <p>The sorting order of the channels by creation time. Default value: asc. Valid values: desc and asc. asc indicates the ascending order, and desc indicates the descending order.</p>
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
         * <p>The state of channels you want to query. You can separate multiple states with commas (,) in a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;IDLE&quot;,&quot;RUNNING&quot;]</p>
         */
        public Builder states(String states) {
            this.putBodyParameter("States", states);
            this.states = states;
            return this;
        }

        @Override
        public ListMediaLiveChannelsRequest build() {
            return new ListMediaLiveChannelsRequest(this);
        } 

    } 

}
