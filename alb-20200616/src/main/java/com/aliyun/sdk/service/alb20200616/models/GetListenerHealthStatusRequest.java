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

        private Builder(GetListenerHealthStatusRequest response) {
            super(response);
            this.includeRule = response.includeRule;
            this.listenerId = response.listenerId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
        } 

        /**
         * 是否包含转发规则健康检查结果
         */
        public Builder includeRule(Boolean includeRule) {
            this.putQueryParameter("IncludeRule", includeRule);
            this.includeRule = includeRule;
            return this;
        }

        /**
         * 监听Id
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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
        public GetListenerHealthStatusRequest build() {
            return new GetListenerHealthStatusRequest(this);
        } 

    } 

}
