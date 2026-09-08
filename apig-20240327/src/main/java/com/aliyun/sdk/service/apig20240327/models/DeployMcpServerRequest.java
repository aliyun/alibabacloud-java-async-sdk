// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DeployMcpServerRequest} extends {@link RequestModel}
 *
 * <p>DeployMcpServerRequest</p>
 */
public class DeployMcpServerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("mcpServerId")
    private String mcpServerId;

    private DeployMcpServerRequest(Builder builder) {
        super(builder);
        this.mcpServerId = builder.mcpServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployMcpServerRequest create() {
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

    public static final class Builder extends Request.Builder<DeployMcpServerRequest, Builder> {
        private String mcpServerId; 

        private Builder() {
            super();
        } 

        private Builder(DeployMcpServerRequest request) {
            super(request);
            this.mcpServerId = request.mcpServerId;
        } 

        /**
         * <p>MCP Server ID</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-adfefz24afg</p>
         */
        public Builder mcpServerId(String mcpServerId) {
            this.putPathParameter("mcpServerId", mcpServerId);
            this.mcpServerId = mcpServerId;
            return this;
        }

        @Override
        public DeployMcpServerRequest build() {
            return new DeployMcpServerRequest(this);
        } 

    } 

}
