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
 * {@link SyncMCPServersRequest} extends {@link RequestModel}
 *
 * <p>SyncMCPServersRequest</p>
 */
public class SyncMCPServersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domainIds")
    private java.util.List<String> domainIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("nacosMcpServers")
    private java.util.List<NacosMcpServers> nacosMcpServers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    private SyncMCPServersRequest(Builder builder) {
        super(builder);
        this.domainIds = builder.domainIds;
        this.gatewayId = builder.gatewayId;
        this.nacosMcpServers = builder.nacosMcpServers;
        this.namespace = builder.namespace;
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncMCPServersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainIds
     */
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return nacosMcpServers
     */
    public java.util.List<NacosMcpServers> getNacosMcpServers() {
        return this.nacosMcpServers;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    public static final class Builder extends Request.Builder<SyncMCPServersRequest, Builder> {
        private java.util.List<String> domainIds; 
        private String gatewayId; 
        private java.util.List<NacosMcpServers> nacosMcpServers; 
        private String namespace; 
        private String sourceId; 

        private Builder() {
            super();
        } 

        private Builder(SyncMCPServersRequest request) {
            super(request);
            this.domainIds = request.domainIds;
            this.gatewayId = request.gatewayId;
            this.nacosMcpServers = request.nacosMcpServers;
            this.namespace = request.namespace;
            this.sourceId = request.sourceId;
        } 

        /**
         * <p>The domain ID.</p>
         */
        public Builder domainIds(java.util.List<String> domainIds) {
            this.putBodyParameter("domainIds", domainIds);
            this.domainIds = domainIds;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq7l5s5lhtg***</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The synchronized Nacos MCP server list. If the synchronized MCP server is included, add the mcpServerId parameter.</p>
         */
        public Builder nacosMcpServers(java.util.List<NacosMcpServers> nacosMcpServers) {
            this.putBodyParameter("nacosMcpServers", nacosMcpServers);
            this.nacosMcpServers = nacosMcpServers;
            return this;
        }

        /**
         * <p>The Nacos namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>src-d40mff6m1hkpt84vep60</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        @Override
        public SyncMCPServersRequest build() {
            return new SyncMCPServersRequest(this);
        } 

    } 

    /**
     * 
     * {@link SyncMCPServersRequest} extends {@link TeaModel}
     *
     * <p>SyncMCPServersRequest</p>
     */
    public static class NacosMcpServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exposedUriPath")
        private String exposedUriPath;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("mcpServerName")
        private String mcpServerName;

        @com.aliyun.core.annotation.NameInMap("protocols")
        private java.util.List<String> protocols;

        private NacosMcpServers(Builder builder) {
            this.exposedUriPath = builder.exposedUriPath;
            this.instanceId = builder.instanceId;
            this.mcpServerId = builder.mcpServerId;
            this.mcpServerName = builder.mcpServerName;
            this.protocols = builder.protocols;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NacosMcpServers create() {
            return builder().build();
        }

        /**
         * @return exposedUriPath
         */
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mcpServerId
         */
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        /**
         * @return mcpServerName
         */
        public String getMcpServerName() {
            return this.mcpServerName;
        }

        /**
         * @return protocols
         */
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public static final class Builder {
            private String exposedUriPath; 
            private String instanceId; 
            private String mcpServerId; 
            private String mcpServerName; 
            private java.util.List<String> protocols; 

            private Builder() {
            } 

            private Builder(NacosMcpServers model) {
                this.exposedUriPath = model.exposedUriPath;
                this.instanceId = model.instanceId;
                this.mcpServerId = model.mcpServerId;
                this.mcpServerName = model.mcpServerName;
                this.protocols = model.protocols;
            } 

            /**
             * <p>The exposed URI path. This parameter is required when the protocol parameter is set to SSE or StreamableHTTP and the type parameter is set to RealMCP.</p>
             * 
             * <strong>example:</strong>
             * <p>/sse</p>
             */
            public Builder exposedUriPath(String exposedUriPath) {
                this.exposedUriPath = exposedUriPath;
                return this;
            }

            /**
             * <p>The Nacos instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-24afmoioxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The MCP server ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-d3s8qo6m1hknegofa3bg</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>The name of the MCP server.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * <p>The protocol.</p>
             */
            public Builder protocols(java.util.List<String> protocols) {
                this.protocols = protocols;
                return this;
            }

            public NacosMcpServers build() {
                return new NacosMcpServers(this);
            } 

        } 

    }
}
