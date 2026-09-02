// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link GetGenerateAgentDataSemanticsProgressRequest} extends {@link RequestModel}
 *
 * <p>GetGenerateAgentDataSemanticsProgressRequest</p>
 */
public class GetGenerateAgentDataSemanticsProgressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 2)
    private String agentName;

    private GetGenerateAgentDataSemanticsProgressRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGenerateAgentDataSemanticsProgressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    public static final class Builder extends Request.Builder<GetGenerateAgentDataSemanticsProgressRequest, Builder> {
        private String agentName; 

        private Builder() {
            super();
        } 

        private Builder(GetGenerateAgentDataSemanticsProgressRequest request) {
            super(request);
            this.agentName = request.agentName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bakehouse_agent</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        @Override
        public GetGenerateAgentDataSemanticsProgressRequest build() {
            return new GetGenerateAgentDataSemanticsProgressRequest(this);
        } 

    } 

}
