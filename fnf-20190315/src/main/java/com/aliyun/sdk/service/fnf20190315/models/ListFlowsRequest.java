// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowsRequest} extends {@link RequestModel}
 *
 * <p>ListFlowsRequest</p>
 */
public class ListFlowsRequest extends Request {
    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListFlowsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListFlowsRequest, Builder> {
        private Integer limit; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowsRequest request) {
            super(request);
            this.limit = request.limit;
            this.nextToken = request.nextToken;
        } 

        /**
         * The number of flows to be queried. Valid values: 1 to 1000.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The token to start the query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListFlowsRequest build() {
            return new ListFlowsRequest(this);
        } 

    } 

}
