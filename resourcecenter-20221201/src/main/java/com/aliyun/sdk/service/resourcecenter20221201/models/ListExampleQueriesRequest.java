// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExampleQueriesRequest} extends {@link RequestModel}
 *
 * <p>ListExampleQueriesRequest</p>
 */
public class ListExampleQueriesRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    private String maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListExampleQueriesRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExampleQueriesRequest create() {
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

    public static final class Builder extends Request.Builder<ListExampleQueriesRequest, Builder> {
        private String maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListExampleQueriesRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(String maxResults) {
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

        @Override
        public ListExampleQueriesRequest build() {
            return new ListExampleQueriesRequest(this);
        } 

    } 

}
