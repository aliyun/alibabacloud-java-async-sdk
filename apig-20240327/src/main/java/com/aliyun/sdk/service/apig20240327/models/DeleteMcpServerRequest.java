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
 * {@link DeleteMcpServerRequest} extends {@link RequestModel}
 *
 * <p>DeleteMcpServerRequest</p>
 */
public class DeleteMcpServerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("mcpServerId")
    private String mcpServerId;

    private DeleteMcpServerRequest(Builder builder) {
        super(builder);
        this.mcpServerId = builder.mcpServerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMcpServerRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMcpServerRequest, Builder> {
        private String mcpServerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMcpServerRequest request) {
            super(request);
            this.mcpServerId = request.mcpServerId;
        } 

        /**
         * <p>The MCP server ID.</p>
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
        public DeleteMcpServerRequest build() {
            return new DeleteMcpServerRequest(this);
        } 

    } 

}
