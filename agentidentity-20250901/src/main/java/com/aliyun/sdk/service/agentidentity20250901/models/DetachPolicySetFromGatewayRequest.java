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
 * {@link DetachPolicySetFromGatewayRequest} extends {@link RequestModel}
 *
 * <p>DetachPolicySetFromGatewayRequest</p>
 */
public class DetachPolicySetFromGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayArn")
    private String gatewayArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicySetName")
    private String policySetName;

    private DetachPolicySetFromGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayArn = builder.gatewayArn;
        this.gatewayType = builder.gatewayType;
        this.policySetName = builder.policySetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachPolicySetFromGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayArn
     */
    public String getGatewayArn() {
        return this.gatewayArn;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return policySetName
     */
    public String getPolicySetName() {
        return this.policySetName;
    }

    public static final class Builder extends Request.Builder<DetachPolicySetFromGatewayRequest, Builder> {
        private String gatewayArn; 
        private String gatewayType; 
        private String policySetName; 

        private Builder() {
            super();
        } 

        private Builder(DetachPolicySetFromGatewayRequest request) {
            super(request);
            this.gatewayArn = request.gatewayArn;
            this.gatewayType = request.gatewayType;
            this.policySetName = request.policySetName;
        } 

        /**
         * <p>The ARN of the target gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:gateway/my-gateway</p>
         */
        public Builder gatewayArn(String gatewayArn) {
            this.putBodyParameter("GatewayArn", gatewayArn);
            this.gatewayArn = gatewayArn;
            return this;
        }

        /**
         * <p>The gateway type. Valid values:</p>
         * <ul>
         * <li>AIGateway: Alibaba Cloud AI Gateway.</li>
         * <li>AgentRunMCP: AgentRun MCP tool.</li>
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
        public DetachPolicySetFromGatewayRequest build() {
            return new DetachPolicySetFromGatewayRequest(this);
        } 

    } 

}
