// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSavedQueriesRequest} extends {@link RequestModel}
 *
 * <p>ListSavedQueriesRequest</p>
 */
public class ListSavedQueriesRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private String maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListSavedQueriesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSavedQueriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListSavedQueriesRequest, Builder> {
        private String maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListSavedQueriesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * The maximum number of entries per page.
         * <p>
         * 
         * Valid values: 1 to 50.
         * 
         * Default value: 50.
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListSavedQueriesRequest build() {
            return new ListSavedQueriesRequest(this);
        } 

    } 

}
