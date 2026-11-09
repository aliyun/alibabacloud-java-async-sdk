// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link RebuildSandboxRequest} extends {@link RequestModel}
 *
 * <p>RebuildSandboxRequest</p>
 */
public class RebuildSandboxRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sandboxId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sandboxId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
    private String serviceEndpointId;

    private RebuildSandboxRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.sandboxId = builder.sandboxId;
        this.serviceEndpointId = builder.serviceEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebuildSandboxRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return sandboxId
     */
    public String getSandboxId() {
        return this.sandboxId;
    }

    /**
     * @return serviceEndpointId
     */
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

    public static final class Builder extends Request.Builder<RebuildSandboxRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String sandboxId; 
        private String serviceEndpointId; 

        private Builder() {
            super();
        } 

        private Builder(RebuildSandboxRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.sandboxId = request.sandboxId;
            this.serviceEndpointId = request.serviceEndpointId;
        } 

        /**
         * <p>The ID of the workspace. Pass the ID of the workspace to which the target agent belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-4fff1234448849b7****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the managed agent. The agent must belong to the specified workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-3677a577b6854f8aa4da1ed98caa****</p>
         */
        public Builder agentId(String agentId) {
            this.putPathParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The sandbox ID. Use the instance identity returned by ListSandboxes. The sandbox must belong to the runtime scope that corresponds to the specified agent and service registration endpoint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01a1b56a-b00f-7aa3-bacf-cc9d04b0****</p>
         */
        public Builder sandboxId(String sandboxId) {
            this.putPathParameter("sandboxId", sandboxId);
            this.sandboxId = sandboxId;
            return this;
        }

        /**
         * <p>The ID of the service registration endpoint. This parameter is optional. If you specify this parameter, the operation targets the runtime instance that corresponds to the service registration endpoint under the agent. If you omit this parameter, the default latest runtime identity is used. Pass the service registration endpoint ID instead of the service registration endpoint name. You must keep this parameter consistent when you query instances, commit rebuilds, and query nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>se-7f3a92c1</p>
         */
        public Builder serviceEndpointId(String serviceEndpointId) {
            this.putQueryParameter("serviceEndpointId", serviceEndpointId);
            this.serviceEndpointId = serviceEndpointId;
            return this;
        }

        @Override
        public RebuildSandboxRequest build() {
            return new RebuildSandboxRequest(this);
        } 

    } 

}
