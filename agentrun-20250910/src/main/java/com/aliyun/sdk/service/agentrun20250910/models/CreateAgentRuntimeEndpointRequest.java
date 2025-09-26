// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateAgentRuntimeEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentRuntimeEndpointRequest</p>
 */
public class CreateAgentRuntimeEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRuntimeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateAgentRuntimeEndpointInput body;

    private CreateAgentRuntimeEndpointRequest(Builder builder) {
        super(builder);
        this.agentRuntimeId = builder.agentRuntimeId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentRuntimeEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeId
     */
    public String getAgentRuntimeId() {
        return this.agentRuntimeId;
    }

    /**
     * @return body
     */
    public CreateAgentRuntimeEndpointInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateAgentRuntimeEndpointRequest, Builder> {
        private String agentRuntimeId; 
        private CreateAgentRuntimeEndpointInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentRuntimeEndpointRequest request) {
            super(request);
            this.agentRuntimeId = request.agentRuntimeId;
            this.body = request.body;
        } 

        /**
         * <p>要创建端点的智能体运行时实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder agentRuntimeId(String agentRuntimeId) {
            this.putPathParameter("agentRuntimeId", agentRuntimeId);
            this.agentRuntimeId = agentRuntimeId;
            return this;
        }

        /**
         * <p>包含要创建的智能体运行时端点配置信息的请求体</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateAgentRuntimeEndpointInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateAgentRuntimeEndpointRequest build() {
            return new CreateAgentRuntimeEndpointRequest(this);
        } 

    } 

}
