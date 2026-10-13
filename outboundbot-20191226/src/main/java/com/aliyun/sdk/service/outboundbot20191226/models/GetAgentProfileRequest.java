// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetAgentProfileRequest} extends {@link RequestModel}
 *
 * <p>GetAgentProfileRequest</p>
 */
public class GetAgentProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProfileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppIp")
    private String appIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetAgentProfileRequest(Builder builder) {
        super(builder);
        this.agentProfileId = builder.agentProfileId;
        this.appIp = builder.appIp;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentProfileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentProfileId
     */
    public String getAgentProfileId() {
        return this.agentProfileId;
    }

    /**
     * @return appIp
     */
    public String getAppIp() {
        return this.appIp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetAgentProfileRequest, Builder> {
        private String agentProfileId; 
        private String appIp; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentProfileRequest request) {
            super(request);
            this.agentProfileId = request.agentProfileId;
            this.appIp = request.appIp;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The agent profile ID.</p>
         * <blockquote>
         * <p>You can obtain the agent profile ID of a created scenario from the ChatbotId response parameter of DescribeScript.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d31794e2a51f47d2901b4094d88311d7</p>
         */
        public Builder agentProfileId(String agentProfileId) {
            this.putBodyParameter("AgentProfileId", agentProfileId);
            this.agentProfileId = agentProfileId;
            return this;
        }

        /**
         * <p>The app IP address. This is a system field and is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder appIp(String appIp) {
            this.putBodyParameter("AppIp", appIp);
            this.appIp = appIp;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0ec0c897-b92c-40e4-9ad7-e6e4f5ce13bb</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetAgentProfileRequest build() {
            return new GetAgentProfileRequest(this);
        } 

    } 

}
