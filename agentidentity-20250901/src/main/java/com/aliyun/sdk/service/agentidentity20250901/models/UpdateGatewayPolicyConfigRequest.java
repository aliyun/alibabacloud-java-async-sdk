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
 * {@link UpdateGatewayPolicyConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayPolicyConfigRequest</p>
 */
public class UpdateGatewayPolicyConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnforcementMode")
    private String enforcementMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayArn")
    private String gatewayArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayType")
    private String gatewayType;

    private UpdateGatewayPolicyConfigRequest(Builder builder) {
        super(builder);
        this.enforcementMode = builder.enforcementMode;
        this.gatewayArn = builder.gatewayArn;
        this.gatewayType = builder.gatewayType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayPolicyConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enforcementMode
     */
    public String getEnforcementMode() {
        return this.enforcementMode;
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

    public static final class Builder extends Request.Builder<UpdateGatewayPolicyConfigRequest, Builder> {
        private String enforcementMode; 
        private String gatewayArn; 
        private String gatewayType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayPolicyConfigRequest request) {
            super(request);
            this.enforcementMode = request.enforcementMode;
            this.gatewayArn = request.gatewayArn;
            this.gatewayType = request.gatewayType;
        } 

        /**
         * <p>The policy enforcement mode. Valid values:</p>
         * <ul>
         * <li>ENFORCE: Intercepts non-compliant requests and allows compliant requests.</li>
         * <li>LOG_ONLY: Only logs non-compliant requests without intercepting them.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENFORCE</p>
         */
        public Builder enforcementMode(String enforcementMode) {
            this.putBodyParameter("EnforcementMode", enforcementMode);
            this.enforcementMode = enforcementMode;
            return this;
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
         * <li>AgentRunMCP: AgentRun MCP tool.
         * If you do not specify this parameter, the default value is AIGateway.</li>
         * </ul>
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
        public UpdateGatewayPolicyConfigRequest build() {
            return new UpdateGatewayPolicyConfigRequest(this);
        } 

    } 

}
