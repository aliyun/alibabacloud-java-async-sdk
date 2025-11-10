// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link ListApiMcpServerSystemToolsRequest} extends {@link RequestModel}
 *
 * <p>ListApiMcpServerSystemToolsRequest</p>
 */
public class ListApiMcpServerSystemToolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("skip")
    private Integer skip;

    private ListApiMcpServerSystemToolsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.skip = builder.skip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiMcpServerSystemToolsRequest create() {
        return builder().build();
    }

@Override
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
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    public static final class Builder extends Request.Builder<ListApiMcpServerSystemToolsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private Integer skip; 

        private Builder() {
            super();
        } 

        private Builder(ListApiMcpServerSystemToolsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.skip = request.skip;
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
        public ListApiMcpServerSystemToolsRequest build() {
            return new ListApiMcpServerSystemToolsRequest(this);
        } 

    } 

}
