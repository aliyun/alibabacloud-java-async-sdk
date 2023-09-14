// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetListenerHealthStatusRequest} extends {@link RequestModel}
 *
 * <p>GetListenerHealthStatusRequest</p>
 */
public class GetListenerHealthStatusRequest extends Request {
    @Query
    @NameInMap("IncludeRule")
    private Boolean includeRule;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("MaxResults")
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private GetListenerHealthStatusRequest(Builder builder) {
        super(builder);
        this.includeRule = builder.includeRule;
        this.listenerId = builder.listenerId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListenerHealthStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeRule
     */
    public Boolean getIncludeRule() {
        return this.includeRule;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<GetListenerHealthStatusRequest, Builder> {
        private Boolean includeRule; 
        private String listenerId; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(GetListenerHealthStatusRequest request) {
            super(request);
            this.includeRule = request.includeRule;
            this.listenerId = request.listenerId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * Specifies whether to return the health check results of forwarding rules. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder includeRule(Boolean includeRule) {
            this.putQueryParameter("IncludeRule", includeRule);
            this.includeRule = includeRule;
            return this;
        }

        /**
         * The listener ID.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: **1** to **30**. Default value: **20**.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * *   If this is your first query or no next queries are to be sent, ignore this parameter.
         * *   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public GetListenerHealthStatusRequest build() {
            return new GetListenerHealthStatusRequest(this);
        } 

    } 

}
