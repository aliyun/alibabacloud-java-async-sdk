// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeCreditPackageAgentsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCreditPackageAgentsRequest</p>
 */
public class DescribeCreditPackageAgentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentIds")
    private java.util.List<String> agentIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private DescribeCreditPackageAgentsRequest(Builder builder) {
        super(builder);
        this.agentIds = builder.agentIds;
        this.agentType = builder.agentType;
        this.bizType = builder.bizType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreditPackageAgentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIds
     */
    public java.util.List<String> getAgentIds() {
        return this.agentIds;
    }

    /**
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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

    public static final class Builder extends Request.Builder<DescribeCreditPackageAgentsRequest, Builder> {
        private java.util.List<String> agentIds; 
        private String agentType; 
        private String bizType; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCreditPackageAgentsRequest request) {
            super(request);
            this.agentIds = request.agentIds;
            this.agentType = request.agentType;
            this.bizType = request.bizType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>A JSON string of the AgentId list. Example: <code>[&quot;agent-1&quot;,&quot;agent-2&quot;]</code>.</p>
         */
        public Builder agentIds(java.util.List<String> agentIds) {
            this.putQueryParameter("AgentIds", agentIds);
            this.agentIds = agentIds;
            return this;
        }

        /**
         * <p>The agent type. Valid values: <code>CREDIT_PACKAGE</code>, <code>JVS_CLAW</code>, <code>OPEN_CLAW</code>, and <code>JVS_COPILOT</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>JVS_COPILOT</p>
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>BUSINESS</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to an empty string for the first request. For subsequent requests, use the <code>nextToken</code> value from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public DescribeCreditPackageAgentsRequest build() {
            return new DescribeCreditPackageAgentsRequest(this);
        } 

    } 

}
