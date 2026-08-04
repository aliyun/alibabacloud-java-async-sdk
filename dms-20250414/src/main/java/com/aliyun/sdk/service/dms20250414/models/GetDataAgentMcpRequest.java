// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetDataAgentMcpRequest} extends {@link RequestModel}
 *
 * <p>GetDataAgentMcpRequest</p>
 */
public class GetDataAgentMcpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mcpServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetDataAgentMcpRequest(Builder builder) {
        super(builder);
        this.mcpServerId = builder.mcpServerId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentMcpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mcpServerId
     */
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetDataAgentMcpRequest, Builder> {
        private String mcpServerId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataAgentMcpRequest request) {
            super(request);
            this.mcpServerId = request.mcpServerId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>44lg***z65</p>
         */
        public Builder mcpServerId(String mcpServerId) {
            this.putQueryParameter("McpServerId", mcpServerId);
            this.mcpServerId = mcpServerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>atvx***xmz</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetDataAgentMcpRequest build() {
            return new GetDataAgentMcpRequest(this);
        } 

    } 

}
