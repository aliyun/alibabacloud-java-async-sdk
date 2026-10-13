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
 * {@link DeleteCustomScriptTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomScriptTemplateRequest</p>
 */
public class DeleteCustomScriptTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProfileId")
    private String agentProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DeleteCustomScriptTemplateRequest(Builder builder) {
        super(builder);
        this.agentProfileId = builder.agentProfileId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomScriptTemplateRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomScriptTemplateRequest, Builder> {
        private String agentProfileId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomScriptTemplateRequest request) {
            super(request);
            this.agentProfileId = request.agentProfileId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the custom scenario template.</p>
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
         * <p>The instance ID.</p>
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
        public DeleteCustomScriptTemplateRequest build() {
            return new DeleteCustomScriptTemplateRequest(this);
        } 

    } 

}
