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

    @Query
    @NameInMap("RequestId")
    private String requestId;

    private ListFlowsRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder extends Request.Builder<ListFlowsRequest, Builder> {
        private Integer limit; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowsRequest request) {
            super(request);
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.requestId = request.requestId;
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

        /**
         * The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        @Override
        public ListFlowsRequest build() {
            return new ListFlowsRequest(this);
        } 

    } 

}
