// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link ListPolicySetAttachedGatewaysRequest} extends {@link RequestModel}
 *
 * <p>ListPolicySetAttachedGatewaysRequest</p>
 */
public class ListPolicySetAttachedGatewaysRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicySetName")
    private String policySetName;

    private ListPolicySetAttachedGatewaysRequest(Builder builder) {
        super(builder);
        this.gatewayType = builder.gatewayType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policySetName = builder.policySetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicySetAttachedGatewaysRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
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
     * @return policySetName
     */
    public String getPolicySetName() {
        return this.policySetName;
    }

    public static final class Builder extends Request.Builder<ListPolicySetAttachedGatewaysRequest, Builder> {
        private String gatewayType; 
        private Integer maxResults; 
        private String nextToken; 
        private String policySetName; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicySetAttachedGatewaysRequest request) {
            super(request);
            this.gatewayType = request.gatewayType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policySetName = request.policySetName;
        } 

        /**
         * <p>The gateway type. Valid values:</p>
         * <ul>
         * <li>AIGateway: Alibaba Cloud AI Gateway</li>
         * <li>AgentRunMCP: AgentRun MCP tool</li>
         * </ul>
         * <p>Default value: AIGateway.</p>
         * 
         * <strong>example:</strong>
         * <p>AIGateway</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("GatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>The maximum number of results to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used for pagination. You do not need to specify this parameter for the first call. For subsequent calls, pass the NextToken value returned from the previous call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>default-policy-set</p>
         */
        public Builder policySetName(String policySetName) {
            this.putBodyParameter("PolicySetName", policySetName);
            this.policySetName = policySetName;
            return this;
        }

        @Override
        public ListPolicySetAttachedGatewaysRequest build() {
            return new ListPolicySetAttachedGatewaysRequest(this);
        } 

    } 

}
