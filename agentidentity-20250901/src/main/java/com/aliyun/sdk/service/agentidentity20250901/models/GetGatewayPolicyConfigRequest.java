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
 * {@link GetGatewayPolicyConfigRequest} extends {@link RequestModel}
 *
 * <p>GetGatewayPolicyConfigRequest</p>
 */
public class GetGatewayPolicyConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayArn")
    private String gatewayArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayType")
    private String gatewayType;

    private GetGatewayPolicyConfigRequest(Builder builder) {
        super(builder);
        this.gatewayArn = builder.gatewayArn;
        this.gatewayType = builder.gatewayType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayPolicyConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetGatewayPolicyConfigRequest, Builder> {
        private String gatewayArn; 
        private String gatewayType; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayPolicyConfigRequest request) {
            super(request);
            this.gatewayArn = request.gatewayArn;
            this.gatewayType = request.gatewayType;
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
         * <li>AIGateway: Alibaba Cloud AI gateway.</li>
         * <li>AgentRunMCP: AgentRun MCP tool.</li>
         * </ul>
         * <p>If this parameter is not specified, the default value is AIGateway.</p>
         * 
         * <strong>example:</strong>
         * <p>AIGateway</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putBodyParameter("GatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        @Override
        public GetGatewayPolicyConfigRequest build() {
            return new GetGatewayPolicyConfigRequest(this);
        } 

    } 

}
