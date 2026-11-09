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
 * {@link GetSandboxRebuildOperationRequest} extends {@link RequestModel}
 *
 * <p>GetSandboxRebuildOperationRequest</p>
 */
public class GetSandboxRebuildOperationRequest extends Request {
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

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("operationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceEndpointId")
    private String serviceEndpointId;

    private GetSandboxRebuildOperationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.agentId = builder.agentId;
        this.sandboxId = builder.sandboxId;
        this.operationId = builder.operationId;
        this.serviceEndpointId = builder.serviceEndpointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSandboxRebuildOperationRequest create() {
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
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return serviceEndpointId
     */
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

    public static final class Builder extends Request.Builder<GetSandboxRebuildOperationRequest, Builder> {
        private String workspaceId; 
        private String agentId; 
        private String sandboxId; 
        private String operationId; 
        private String serviceEndpointId; 

        private Builder() {
            super();
        } 

        private Builder(GetSandboxRebuildOperationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.agentId = request.agentId;
            this.sandboxId = request.sandboxId;
            this.operationId = request.operationId;
            this.serviceEndpointId = request.serviceEndpointId;
        } 

        /**
         * <p>The workspace ID. Pass the ID of the workspace to which the target agent belongs.</p>
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
         * <p>The managed agent ID. The agent must belong to the specified workspace.</p>
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
         * <p>The sandbox ID. Use the instance identity returned by ListSandboxes. The sandbox must belong to the runtime scope corresponding to the specified agent and service registration endpoint.</p>
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
         * <p>The initial rebuild task ID. Use the operationId returned by RebuildSandbox. Always use this ID to query the overall result. You do not need to switch to the ID of a subsequent creation task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01a1be92-7fa4-76b2-a871-b376d6d0****</p>
         */
        public Builder operationId(String operationId) {
            this.putPathParameter("operationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The service registration endpoint ID. This parameter is optional. If specified, the operation targets the runtime instance corresponding to the endpoint under the agent. If omitted, the default latest runtime identity is used. Pass the endpoint ID instead of the endpoint name. Keep this parameter consistent when querying instances, committing rebuilds, and querying tasks.</p>
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
        public GetSandboxRebuildOperationRequest build() {
            return new GetSandboxRebuildOperationRequest(this);
        } 

    } 

}
