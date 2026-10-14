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
 * {@link UpdateAgentConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateAgentConfigRequest</p>
 */
public class UpdateAgentConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("configId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    private UpdateAgentConfigRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.configId = builder.configId;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentConfigRequest create() {
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
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<UpdateAgentConfigRequest, Builder> {
        private String agentId; 
        private String configId; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAgentConfigRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.configId = request.configId;
            this.content = request.content;
        } 

        /**
         * <p>The ID of the component whose configuration you want to update.</p>
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
         * <p>The ID of the component configuration to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f0078fbb-4213-11f0-a19b-00163e4ae208</p>
         */
        public Builder configId(String configId) {
            this.putBodyParameter("configId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The new content of the component configuration.</p>
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
        public UpdateAgentConfigRequest build() {
            return new UpdateAgentConfigRequest(this);
        } 

    } 

}
