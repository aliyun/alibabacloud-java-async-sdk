// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeAtiAgentRegisterInfoMarketRequest} extends {@link RequestModel}
 *
 * <p>DescribeAtiAgentRegisterInfoMarketRequest</p>
 */
public class DescribeAtiAgentRegisterInfoMarketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentHost")
    private String agentHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustLevel")
    private String trustLevel;

    private DescribeAtiAgentRegisterInfoMarketRequest(Builder builder) {
        super(builder);
        this.agentHost = builder.agentHost;
        this.agentVersion = builder.agentVersion;
        this.clientToken = builder.clientToken;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.trustLevel = builder.trustLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAtiAgentRegisterInfoMarketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentHost
     */
    public String getAgentHost() {
        return this.agentHost;
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return trustLevel
     */
    public String getTrustLevel() {
        return this.trustLevel;
    }

    public static final class Builder extends Request.Builder<DescribeAtiAgentRegisterInfoMarketRequest, Builder> {
        private String agentHost; 
        private String agentVersion; 
        private String clientToken; 
        private Integer maxResults; 
        private String nextToken; 
        private String trustLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAtiAgentRegisterInfoMarketRequest request) {
            super(request);
            this.agentHost = request.agentHost;
            this.agentVersion = request.agentVersion;
            this.clientToken = request.clientToken;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.trustLevel = request.trustLevel;
        } 

        /**
         * AgentHost.
         */
        public Builder agentHost(String agentHost) {
            this.putQueryParameter("AgentHost", agentHost);
            this.agentHost = agentHost;
            return this;
        }

        /**
         * AgentVersion.
         */
        public Builder agentVersion(String agentVersion) {
            this.putQueryParameter("AgentVersion", agentVersion);
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
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

        /**
         * TrustLevel.
         */
        public Builder trustLevel(String trustLevel) {
            this.putQueryParameter("TrustLevel", trustLevel);
            this.trustLevel = trustLevel;
            return this;
        }

        @Override
        public DescribeAtiAgentRegisterInfoMarketRequest build() {
            return new DescribeAtiAgentRegisterInfoMarketRequest(this);
        } 

    } 

}
