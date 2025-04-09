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
 * {@link GetAgentProfileTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetAgentProfileTemplateRequest</p>
 */
public class GetAgentProfileTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProfileTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProfileTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppIp")
    private String appIp;

    private GetAgentProfileTemplateRequest(Builder builder) {
        super(builder);
        this.agentProfileTemplateId = builder.agentProfileTemplateId;
        this.appIp = builder.appIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentProfileTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentProfileTemplateId
     */
    public String getAgentProfileTemplateId() {
        return this.agentProfileTemplateId;
    }

    /**
     * @return appIp
     */
    public String getAppIp() {
        return this.appIp;
    }

    public static final class Builder extends Request.Builder<GetAgentProfileTemplateRequest, Builder> {
        private String agentProfileTemplateId; 
        private String appIp; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentProfileTemplateRequest request) {
            super(request);
            this.agentProfileTemplateId = request.agentProfileTemplateId;
            this.appIp = request.appIp;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-survey</p>
         */
        public Builder agentProfileTemplateId(String agentProfileTemplateId) {
            this.putBodyParameter("AgentProfileTemplateId", agentProfileTemplateId);
            this.agentProfileTemplateId = agentProfileTemplateId;
            return this;
        }

        /**
         * AppIp.
         */
        public Builder appIp(String appIp) {
            this.putBodyParameter("AppIp", appIp);
            this.appIp = appIp;
            return this;
        }

        @Override
        public GetAgentProfileTemplateRequest build() {
            return new GetAgentProfileTemplateRequest(this);
        } 

    } 

}
