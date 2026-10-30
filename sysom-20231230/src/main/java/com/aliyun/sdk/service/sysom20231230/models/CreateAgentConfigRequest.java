// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CreateAgentConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentConfigRequest</p>
 */
public class CreateAgentConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    private CreateAgentConfigRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.configName = builder.configName;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<CreateAgentConfigRequest, Builder> {
        private String agentId; 
        private String configName; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentConfigRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.configName = request.configName;
            this.content = request.content;
        } 

        /**
         * <p>The ID of the agent associated with the configuration. You can obtain the agent ID from ListAgents.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The name of the configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Configuration 1</p>
         */
        public Builder configName(String configName) {
            this.putBodyParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The content of the configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;oomkill&quot;:{&quot;enable&quot;:false}}</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        @Override
        public CreateAgentConfigRequest build() {
            return new CreateAgentConfigRequest(this);
        } 

    } 

}
