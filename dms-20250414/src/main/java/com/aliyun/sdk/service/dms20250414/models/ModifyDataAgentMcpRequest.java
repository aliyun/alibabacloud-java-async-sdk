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
 * {@link ModifyDataAgentMcpRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataAgentMcpRequest</p>
 */
public class ModifyDataAgentMcpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Headers")
    private String headers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpServerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mcpServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedUidInHeader")
    private Boolean needUidInHeader;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransportType")
    private String transportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ModifyDataAgentMcpRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.enable = builder.enable;
        this.endpoint = builder.endpoint;
        this.headers = builder.headers;
        this.mcpServerId = builder.mcpServerId;
        this.name = builder.name;
        this.needUidInHeader = builder.needUidInHeader;
        this.transportType = builder.transportType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataAgentMcpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return headers
     */
    public String getHeaders() {
        return this.headers;
    }

    /**
     * @return mcpServerId
     */
    public String getMcpServerId() {
        return this.mcpServerId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return needUidInHeader
     */
    public Boolean getNeedUidInHeader() {
        return this.needUidInHeader;
    }

    /**
     * @return transportType
     */
    public String getTransportType() {
        return this.transportType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ModifyDataAgentMcpRequest, Builder> {
        private String description; 
        private Boolean enable; 
        private String endpoint; 
        private String headers; 
        private String mcpServerId; 
        private String name; 
        private Boolean needUidInHeader; 
        private String transportType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataAgentMcpRequest request) {
            super(request);
            this.description = request.description;
            this.enable = request.enable;
            this.endpoint = request.endpoint;
            this.headers = request.headers;
            this.mcpServerId = request.mcpServerId;
            this.name = request.name;
            this.needUidInHeader = request.needUidInHeader;
            this.transportType = request.transportType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Headers.
         */
        public Builder headers(String headers) {
            this.putQueryParameter("Headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6126jk***h2</p>
         */
        public Builder mcpServerId(String mcpServerId) {
            this.putQueryParameter("McpServerId", mcpServerId);
            this.mcpServerId = mcpServerId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NeedUidInHeader.
         */
        public Builder needUidInHeader(Boolean needUidInHeader) {
            this.putQueryParameter("NeedUidInHeader", needUidInHeader);
            this.needUidInHeader = needUidInHeader;
            return this;
        }

        /**
         * TransportType.
         */
        public Builder transportType(String transportType) {
            this.putQueryParameter("TransportType", transportType);
            this.transportType = transportType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e3p***v4</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ModifyDataAgentMcpRequest build() {
            return new ModifyDataAgentMcpRequest(this);
        } 

    } 

}
