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
 * {@link DeleteDataAgentMcpRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataAgentMcpRequest</p>
 */
public class DeleteDataAgentMcpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpServerIds")
    private java.util.List<String> mcpServerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private DeleteDataAgentMcpRequest(Builder builder) {
        super(builder);
        this.mcpServerIds = builder.mcpServerIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataAgentMcpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mcpServerIds
     */
    public java.util.List<String> getMcpServerIds() {
        return this.mcpServerIds;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DeleteDataAgentMcpRequest, Builder> {
        private java.util.List<String> mcpServerIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataAgentMcpRequest request) {
            super(request);
            this.mcpServerIds = request.mcpServerIds;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * McpServerIds.
         */
        public Builder mcpServerIds(java.util.List<String> mcpServerIds) {
            String mcpServerIdsShrink = shrink(mcpServerIds, "McpServerIds", "json");
            this.putQueryParameter("McpServerIds", mcpServerIdsShrink);
            this.mcpServerIds = mcpServerIds;
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
        public DeleteDataAgentMcpRequest build() {
            return new DeleteDataAgentMcpRequest(this);
        } 

    } 

}
