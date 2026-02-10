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
 * {@link CreateMcpServerRequest} extends {@link RequestModel}
 *
 * <p>CreateMcpServerRequest</p>
 */
public class CreateMcpServerRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("grayMcpServerConfigs")
    private java.util.List<GrayMcpServerConfigs> grayMcpServerConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("match")
    private HttpRouteMatch match;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mcpServerConfig")
    private McpServerConfig mcpServerConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mcpStatisticsEnable")
    private Boolean mcpStatisticsEnable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateMcpServerRequest(Builder builder) {
        super(builder);
        this.assembledSources = builder.assembledSources;
        this.backendConfig = builder.backendConfig;
        this.createFromType = builder.createFromType;
        this.description = builder.description;
        this.domainIds = builder.domainIds;
        this.exposedUriPath = builder.exposedUriPath;
        this.gatewayId = builder.gatewayId;
        this.grayMcpServerConfigs = builder.grayMcpServerConfigs;
        this.match = builder.match;
        this.mcpServerConfig = builder.mcpServerConfig;
        this.mcpStatisticsEnable = builder.mcpStatisticsEnable;
        this.name = builder.name;
        this.protocol = builder.protocol;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcpServerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return grayMcpServerConfigs
     */
    public java.util.List<GrayMcpServerConfigs> getGrayMcpServerConfigs() {
        return this.grayMcpServerConfigs;
    }

    /**
     * @return match
     */
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    /**
     * @return mcpServerConfig
     */
    public McpServerConfig getMcpServerConfig() {
        return this.mcpServerConfig;
    }

    /**
     * @return mcpStatisticsEnable
     */
    public Boolean getMcpStatisticsEnable() {
        return this.mcpStatisticsEnable;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<CreateMcpServerRequest, Builder> {
        private java.util.List<AssembledSources> assembledSources; 
        private BackendConfig backendConfig; 
        private String createFromType; 
        private String description; 
        private java.util.List<String> domainIds; 
        private String exposedUriPath; 
        private String gatewayId; 
        private java.util.List<GrayMcpServerConfigs> grayMcpServerConfigs; 
        private HttpRouteMatch match; 
        private McpServerConfig mcpServerConfig; 
        private Boolean mcpStatisticsEnable; 
        private String name; 
        private String protocol; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMcpServerRequest request) {
            super(request);
            this.assembledSources = request.assembledSources;
            this.backendConfig = request.backendConfig;
            this.createFromType = request.createFromType;
            this.description = request.description;
            this.domainIds = request.domainIds;
            this.exposedUriPath = request.exposedUriPath;
            this.gatewayId = request.gatewayId;
            this.grayMcpServerConfigs = request.grayMcpServerConfigs;
            this.match = request.match;
            this.mcpServerConfig = request.mcpServerConfig;
            this.mcpStatisticsEnable = request.mcpStatisticsEnable;
            this.name = request.name;
            this.protocol = request.protocol;
            this.type = request.type;
        } 

        /**
         * <p>Assembled MCP server sources</p>
         */
        public Builder assembledSources(java.util.List<AssembledSources> assembledSources) {
            this.putBodyParameter("assembledSources", assembledSources);
            this.assembledSources = assembledSources;
            return this;
        }

        /**
         * <p>Backend configuration</p>
         */
        public Builder backendConfig(BackendConfig backendConfig) {
            this.putBodyParameter("backendConfig", backendConfig);
            this.backendConfig = backendConfig;
            return this;
        }

        /**
         * <p>Creation source type</p>
         * 
         * <strong>example:</strong>
         * <p>ApiGatewayMcpHosting</p>
         */
        public Builder createFromType(String createFromType) {
            this.putBodyParameter("createFromType", createFromType);
            this.createFromType = createFromType;
            return this;
        }

        /**
         * <p>MCP server description</p>
         * 
         * <strong>example:</strong>
         * <p>mcp tool fetch time</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>List of domain IDs for the MCP server</p>
         */
        public Builder domainIds(java.util.List<String> domainIds) {
            this.putBodyParameter("domainIds", domainIds);
            this.domainIds = domainIds;
            return this;
        }

        /**
         * <p>Exposed URI path for SSE/StreamableHTTP protocols</p>
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
         * <p>Gateway ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq7l5s5lhtgi6qac0</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putBodyParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>Gray route configurations</p>
         */
        public Builder grayMcpServerConfigs(java.util.List<GrayMcpServerConfigs> grayMcpServerConfigs) {
            this.putBodyParameter("grayMcpServerConfigs", grayMcpServerConfigs);
            this.grayMcpServerConfigs = grayMcpServerConfigs;
            return this;
        }

        /**
         * <p>Route matching conditions</p>
         */
        public Builder match(HttpRouteMatch match) {
            this.putBodyParameter("match", match);
            this.match = match;
            return this;
        }

        /**
         * <p>MCP server specification</p>
         */
        public Builder mcpServerConfig(McpServerConfig mcpServerConfig) {
            this.putBodyParameter("mcpServerConfig", mcpServerConfig);
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }

        /**
         * <p>Enable MCP statistics</p>
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
         * <p>MCP server name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fetch-time</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>MCP protocol</p>
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
         * <p>MCP server type</p>
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
        public CreateMcpServerRequest build() {
            return new CreateMcpServerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServerRequest</p>
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
             * <p>MCP Server ID</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-sdfa3qgavz</p>
             */
            public Builder mcpServerId(String mcpServerId) {
                this.mcpServerId = mcpServerId;
                return this;
            }

            /**
             * <p>Source MCP server name</p>
             * 
             * <strong>example:</strong>
             * <p>test-mcp</p>
             */
            public Builder mcpServerName(String mcpServerName) {
                this.mcpServerName = mcpServerName;
                return this;
            }

            /**
             * <p>List of tool names to include</p>
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
     * {@link CreateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServerRequest</p>
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
             * <p>Service port</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Service protocol</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Service ID</p>
             * 
             * <strong>example:</strong>
             * <p>svc-crbgq0dlhtgr***</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Service version</p>
             * 
             * <strong>example:</strong>
             * <p>2.1.6</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Service weight</p>
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
     * {@link CreateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServerRequest</p>
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
             * <p>Backend scene type</p>
             * 
             * <strong>example:</strong>
             * <p>SingleService</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>List of backend services</p>
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
    /**
     * 
     * {@link CreateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServerRequest</p>
     */
    public static class BackendConfigServices extends TeaModel {
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

        private BackendConfigServices(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.serviceId = builder.serviceId;
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackendConfigServices create() {
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

            private Builder(BackendConfigServices model) {
                this.port = model.port;
                this.protocol = model.protocol;
                this.serviceId = model.serviceId;
                this.version = model.version;
                this.weight = model.weight;
            } 

            /**
             * <p>Service port number</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Service protocol type</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Service ID</p>
             * 
             * <strong>example:</strong>
             * <p>svc-gray</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>Service version</p>
             * 
             * <strong>example:</strong>
             * <p>v2.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>Service weight for load balancing</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public BackendConfigServices build() {
                return new BackendConfigServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServerRequest</p>
     */
    public static class GrayMcpServerConfigsBackendConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("services")
        private java.util.List<BackendConfigServices> services;

        private GrayMcpServerConfigsBackendConfig(Builder builder) {
            this.scene = builder.scene;
            this.services = builder.services;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrayMcpServerConfigsBackendConfig create() {
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
        public java.util.List<BackendConfigServices> getServices() {
            return this.services;
        }

        public static final class Builder {
            private String scene; 
            private java.util.List<BackendConfigServices> services; 

            private Builder() {
            } 

            private Builder(GrayMcpServerConfigsBackendConfig model) {
                this.scene = model.scene;
                this.services = model.services;
            } 

            /**
             * <p>Must be SingleService</p>
             * 
             * <strong>example:</strong>
             * <p>SingleService</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>Exactly one service</p>
             */
            public Builder services(java.util.List<BackendConfigServices> services) {
                this.services = services;
                return this;
            }

            public GrayMcpServerConfigsBackendConfig build() {
                return new GrayMcpServerConfigsBackendConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServerRequest</p>
     */
    public static class GrayMcpServerConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backendConfig")
        private GrayMcpServerConfigsBackendConfig backendConfig;

        @com.aliyun.core.annotation.NameInMap("match")
        private HttpRouteMatch match;

        @com.aliyun.core.annotation.NameInMap("routeId")
        private String routeId;

        private GrayMcpServerConfigs(Builder builder) {
            this.backendConfig = builder.backendConfig;
            this.match = builder.match;
            this.routeId = builder.routeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrayMcpServerConfigs create() {
            return builder().build();
        }

        /**
         * @return backendConfig
         */
        public GrayMcpServerConfigsBackendConfig getBackendConfig() {
            return this.backendConfig;
        }

        /**
         * @return match
         */
        public HttpRouteMatch getMatch() {
            return this.match;
        }

        /**
         * @return routeId
         */
        public String getRouteId() {
            return this.routeId;
        }

        public static final class Builder {
            private GrayMcpServerConfigsBackendConfig backendConfig; 
            private HttpRouteMatch match; 
            private String routeId; 

            private Builder() {
            } 

            private Builder(GrayMcpServerConfigs model) {
                this.backendConfig = model.backendConfig;
                this.match = model.match;
                this.routeId = model.routeId;
            } 

            /**
             * <p>Backend configuration for gray route</p>
             */
            public Builder backendConfig(GrayMcpServerConfigsBackendConfig backendConfig) {
                this.backendConfig = backendConfig;
                return this;
            }

            /**
             * <p>Route matching rules</p>
             */
            public Builder match(HttpRouteMatch match) {
                this.match = match;
                return this;
            }

            /**
             * <p>Route ID for update operations</p>
             * 
             * <strong>example:</strong>
             * <p>gray-route-123</p>
             */
            public Builder routeId(String routeId) {
                this.routeId = routeId;
                return this;
            }

            public GrayMcpServerConfigs build() {
                return new GrayMcpServerConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateMcpServerRequest} extends {@link TeaModel}
     *
     * <p>CreateMcpServerRequest</p>
     */
    public static class McpServerConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcpServerSpec")
        private String mcpServerSpec;

        @com.aliyun.core.annotation.NameInMap("swaggerConfig")
        private String swaggerConfig;

        private McpServerConfig(Builder builder) {
            this.mcpServerSpec = builder.mcpServerSpec;
            this.swaggerConfig = builder.swaggerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServerConfig create() {
            return builder().build();
        }

        /**
         * @return mcpServerSpec
         */
        public String getMcpServerSpec() {
            return this.mcpServerSpec;
        }

        /**
         * @return swaggerConfig
         */
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public static final class Builder {
            private String mcpServerSpec; 
            private String swaggerConfig; 

            private Builder() {
            } 

            private Builder(McpServerConfig model) {
                this.mcpServerSpec = model.mcpServerSpec;
                this.swaggerConfig = model.swaggerConfig;
            } 

            /**
             * <p>Converted MCP server spec YAML</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-spec.yaml</p>
             */
            public Builder mcpServerSpec(String mcpServerSpec) {
                this.mcpServerSpec = mcpServerSpec;
                return this;
            }

            /**
             * <p>Raw Swagger/OpenAPI document</p>
             * 
             * <strong>example:</strong>
             * <p>swagger.yaml</p>
             */
            public Builder swaggerConfig(String swaggerConfig) {
                this.swaggerConfig = swaggerConfig;
                return this;
            }

            public McpServerConfig build() {
                return new McpServerConfig(this);
            } 

        } 

    }
}
