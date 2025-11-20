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
 * {@link UpdateMcpServerRequest} extends {@link RequestModel}
 *
 * <p>UpdateMcpServerRequest</p>
 */
public class UpdateMcpServerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("mcpServerId")
    private String mcpServerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assembledSources")
    private java.util.List<AssembledSources> assembledSources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("backendConfig")
    private BackendConfig backendConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("createFromType")
    private String createFromType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domainIds")
    private java.util.List<String> domainIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("exposedUriPath")
    private String exposedUriPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("match")
    private HttpRouteMatch match;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mcpStatisticsEnable")
    private Boolean mcpStatisticsEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UpdateMcpServerRequest(Builder builder) {
        super(builder);
        this.mcpServerId = builder.mcpServerId;
        this.assembledSources = builder.assembledSources;
        this.backendConfig = builder.backendConfig;
        this.createFromType = builder.createFromType;
        this.description = builder.description;
        this.domainIds = builder.domainIds;
        this.exposedUriPath = builder.exposedUriPath;
        this.match = builder.match;
        this.mcpStatisticsEnable = builder.mcpStatisticsEnable;
        this.protocol = builder.protocol;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMcpServerRequest create() {
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
     * @return assembledSources
     */
    public java.util.List<AssembledSources> getAssembledSources() {
        return this.assembledSources;
    }

    /**
     * @return backendConfig
     */
    public BackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    /**
     * @return createFromType
     */
    public String getCreateFromType() {
        return this.createFromType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainIds
     */
    public java.util.List<String> getDomainIds() {
        return this.domainIds;
    }

    /**
     * @return exposedUriPath
     */
    public String getExposedUriPath() {
        return this.exposedUriPath;
    }

    /**
     * @return match
     */
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    /**
     * @return mcpStatisticsEnable
     */
    public Boolean getMcpStatisticsEnable() {
        return this.mcpStatisticsEnable;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateMcpServerRequest, Builder> {
        private String mcpServerId; 
        private java.util.List<AssembledSources> assembledSources; 
        private BackendConfig backendConfig; 
        private String createFromType; 
        private String description; 
        private java.util.List<String> domainIds; 
        private String exposedUriPath; 
        private HttpRouteMatch match; 
        private Boolean mcpStatisticsEnable; 
        private String protocol; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMcpServerRequest request) {
            super(request);
            this.mcpServerId = request.mcpServerId;
            this.assembledSources = request.assembledSources;
            this.backendConfig = request.backendConfig;
            this.createFromType = request.createFromType;
            this.description = request.description;
            this.domainIds = request.domainIds;
            this.exposedUriPath = request.exposedUriPath;
            this.match = request.match;
            this.mcpStatisticsEnable = request.mcpStatisticsEnable;
            this.protocol = request.protocol;
            this.type = request.type;
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

        /**
         * <p>The list of assembly sources. This parameter is required when the type parameter is set to AssemblyMCP.</p>
         */
        public Builder assembledSources(java.util.List<AssembledSources> assembledSources) {
            this.putBodyParameter("assembledSources", assembledSources);
            this.assembledSources = assembledSources;
            return this;
        }

        /**
         * <p>The backend service configurations for the route.</p>
         */
        public Builder backendConfig(BackendConfig backendConfig) {
            this.putBodyParameter("backendConfig", backendConfig);
            this.backendConfig = backendConfig;
            return this;
        }

        /**
         * <p>Specifies the type of source for MCP server creation.</p>
         */
        public Builder createFromType(String createFromType) {
            this.putBodyParameter("createFromType", createFromType);
            this.createFromType = createFromType;
            return this;
        }

        /**
         * <p>The description.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The domain IDs.</p>
         */
        public Builder domainIds(java.util.List<String> domainIds) {
            this.putBodyParameter("domainIds", domainIds);
            this.domainIds = domainIds;
            return this;
        }

        /**
         * <p>The exposed URI path. This parameter is required when the protocol parameter is set to SSE or StreamableHTTP and the type parameter is set to RealMCP.</p>
         * 
         * <strong>example:</strong>
         * <p>/sse</p>
         */
        public Builder exposedUriPath(String exposedUriPath) {
            this.putBodyParameter("exposedUriPath", exposedUriPath);
            this.exposedUriPath = exposedUriPath;
            return this;
        }

        /**
         * <p>The route match rule.</p>
         */
        public Builder match(HttpRouteMatch match) {
            this.putBodyParameter("match", match);
            this.match = match;
            return this;
        }

        /**
         * <p>Specifies if MCP observability is enabled. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder mcpStatisticsEnable(Boolean mcpStatisticsEnable) {
            this.putBodyParameter("mcpStatisticsEnable", mcpStatisticsEnable);
            this.mcpStatisticsEnable = mcpStatisticsEnable;
            return this;
        }

        /**
         * <p>The service protocol. Valid values: HTTP, HTTPS, SSE, and StreamableHTTP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The MCP server type. Valid values: RealMCP and AssemblyMCP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RealMCP</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateMcpServerRequest build() {
            return new UpdateMcpServerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateMcpServerRequest</p>
     */
    public static class AssembledSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpServerId")
        private String mcpServerId;

        @com.aliyun.core.annotation.NameInMap("mcpServerName")
        private String mcpServerName;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<String> tools;

        private AssembledSources(Builder builder) {
            this.mcpServerId = builder.mcpServerId;
            this.mcpServerName = builder.mcpServerName;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssembledSources create() {
            return builder().build();
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
         * @return tools
         */
        public java.util.List<String> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private String mcpServerId; 
            private String mcpServerName; 
            private java.util.List<String> tools; 

            private Builder() {
            } 

            private Builder(AssembledSources model) {
                this.mcpServerId = model.mcpServerId;
                this.mcpServerName = model.mcpServerName;
                this.tools = model.tools;
            } 

            /**
             * <p>The MCP server ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-afaefaefaf</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>The name of the MCP server.</p>
             * 
             * <strong>example:</strong>
             * <p>test-mcp</p>
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * <p>The MCP tools.</p>
             */
            public Builder tools(java.util.List<String> tools) {
                this.tools = tools;
                return this;
            }

            public AssembledSources build() {
                return new AssembledSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateMcpServerRequest</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private Services(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.serviceId = builder.serviceId;
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 
            private String serviceId; 
            private String version; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.port = model.port;
                this.protocol = model.protocol;
                this.serviceId = model.serviceId;
                this.version = model.version;
                this.weight = model.weight;
            } 

            /**
             * <p>The service port (omit for dynamic ports).</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The service protocol. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>HTTP</li>
             * <li>DUBBO</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>svc-cr6pk4tlhtgm58e***</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The traffic weight percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>49</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>UpdateMcpServerRequest</p>
     */
    public static class BackendConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("services")
        private java.util.List<Services> services;

        private BackendConfig(Builder builder) {
            this.scene = builder.scene;
            this.services = builder.services;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendConfig create() {
            return builder().build();
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return services
         */
        public java.util.List<Services> getServices() {
            return this.services;
        }

        public static final class Builder {
            private String scene; 
            private java.util.List<Services> services; 

            private Builder() {
            } 

            private Builder(BackendConfig model) {
                this.scene = model.scene;
                this.services = model.services;
            } 

            /**
             * <p>The backend service scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>SingleService</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The backend services.</p>
             */
            public Builder services(java.util.List<Services> services) {
                this.services = services;
                return this;
            }

            public BackendConfig build() {
                return new BackendConfig(this);
            } 

        } 

    }
}
