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
 * {@link GetAgentRuntimeEndpointRequest} extends {@link RequestModel}
 *
 * <p>GetAgentRuntimeEndpointRequest</p>
 */
public class GetAgentRuntimeEndpointRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentRuntimeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRuntimeId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentRuntimeEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRuntimeEndpointId;

    private GetAgentRuntimeEndpointRequest(Builder builder) {
        super(builder);
        this.agentRuntimeId = builder.agentRuntimeId;
        this.agentRuntimeEndpointId = builder.agentRuntimeEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentRuntimeEndpointRequest create() {
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
     * @return agentRuntimeEndpointId
     */
    public String getAgentRuntimeEndpointId() {
        return this.agentRuntimeEndpointId;
    }

    public static final class Builder extends Request.Builder<GetAgentRuntimeEndpointRequest, Builder> {
        private String agentRuntimeId; 
        private String agentRuntimeEndpointId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentRuntimeEndpointRequest request) {
            super(request);
            this.agentRuntimeId = request.agentRuntimeId;
            this.agentRuntimeEndpointId = request.agentRuntimeEndpointId;
        } 

        /**
         * <p>智能体运行时实例的唯一标识符</p>
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
         * <p>要获取的智能体运行时端点的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>87654321-4321-4321-4321-210987654321</p>
         */
        public Builder agentRuntimeEndpointId(String agentRuntimeEndpointId) {
            this.putPathParameter("agentRuntimeEndpointId", agentRuntimeEndpointId);
            this.agentRuntimeEndpointId = agentRuntimeEndpointId;
            return this;
        }

        @Override
        public GetAgentRuntimeEndpointRequest build() {
            return new GetAgentRuntimeEndpointRequest(this);
        } 

    } 

}
