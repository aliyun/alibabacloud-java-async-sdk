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
 * {@link HttpRoute} extends {@link TeaModel}
 *
 * <p>HttpRoute</p>
 */
public class HttpRoute extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("backend")
    private Backend backend;

    @com.aliyun.core.annotation.NameInMap("builtin")
    private String builtin;

    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("deployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domainInfos")
    private java.util.List<DomainInfos> domainInfos;

    @com.aliyun.core.annotation.NameInMap("environmentInfo")
    private EnvironmentInfo environmentInfo;

    @com.aliyun.core.annotation.NameInMap("gatewayStatus")
    private java.util.Map<String, String> gatewayStatus;

    @com.aliyun.core.annotation.NameInMap("match")
    private HttpRouteMatch match;

    @com.aliyun.core.annotation.NameInMap("mcpServerInfo")
    private McpServerInfo mcpServerInfo;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    @com.aliyun.core.annotation.NameInMap("updateTimestamp")
    private Long updateTimestamp;

    private HttpRoute(Builder builder) {
        this.backend = builder.backend;
        this.builtin = builder.builtin;
        this.createTimestamp = builder.createTimestamp;
        this.deployStatus = builder.deployStatus;
        this.description = builder.description;
        this.domainInfos = builder.domainInfos;
        this.environmentInfo = builder.environmentInfo;
        this.gatewayStatus = builder.gatewayStatus;
        this.match = builder.match;
        this.mcpServerInfo = builder.mcpServerInfo;
        this.name = builder.name;
        this.routeId = builder.routeId;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpRoute create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backend
     */
    public Backend getBackend() {
        return this.backend;
    }

    /**
     * @return builtin
     */
    public String getBuiltin() {
        return this.builtin;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainInfos
     */
    public java.util.List<DomainInfos> getDomainInfos() {
        return this.domainInfos;
    }

    /**
     * @return environmentInfo
     */
    public EnvironmentInfo getEnvironmentInfo() {
        return this.environmentInfo;
    }

    /**
     * @return gatewayStatus
     */
    public java.util.Map<String, String> getGatewayStatus() {
        return this.gatewayStatus;
    }

    /**
     * @return match
     */
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    /**
     * @return mcpServerInfo
     */
    public McpServerInfo getMcpServerInfo() {
        return this.mcpServerInfo;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private Backend backend; 
        private String builtin; 
        private Long createTimestamp; 
        private String deployStatus; 
        private String description; 
        private java.util.List<DomainInfos> domainInfos; 
        private EnvironmentInfo environmentInfo; 
        private java.util.Map<String, String> gatewayStatus; 
        private HttpRouteMatch match; 
        private McpServerInfo mcpServerInfo; 
        private String name; 
        private String routeId; 
        private Long updateTimestamp; 

        private Builder() {
        } 

        private Builder(HttpRoute model) {
            this.backend = model.backend;
            this.builtin = model.builtin;
            this.createTimestamp = model.createTimestamp;
            this.deployStatus = model.deployStatus;
            this.description = model.description;
            this.domainInfos = model.domainInfos;
            this.environmentInfo = model.environmentInfo;
            this.gatewayStatus = model.gatewayStatus;
            this.match = model.match;
            this.mcpServerInfo = model.mcpServerInfo;
            this.name = model.name;
            this.routeId = model.routeId;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>The backend service.</p>
         */
        public Builder backend(Backend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * <p>Indicates whether the route is a system built-in route.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder builtin(String builtin) {
            this.builtin = builtin;
            return this;
        }

        /**
         * <p>The creation time, in ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1726649310593</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The deployment status.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * <p>The route description.</p>
         * 
         * <strong>example:</strong>
         * <p>Product center staging route</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The list of domain name information.</p>
         */
        public Builder domainInfos(java.util.List<DomainInfos> domainInfos) {
            this.domainInfos = domainInfos;
            return this;
        }

        /**
         * <p>The environment context of the routing.</p>
         */
        public Builder environmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }

        /**
         * <p>The route publish status.</p>
         */
        public Builder gatewayStatus(java.util.Map<String, String> gatewayStatus) {
            this.gatewayStatus = gatewayStatus;
            return this;
        }

        /**
         * <p>The route matching rule.</p>
         */
        public Builder match(HttpRouteMatch match) {
            this.match = match;
            return this;
        }

        /**
         * <p>The MCP server information.</p>
         */
        public Builder mcpServerInfo(McpServerInfo mcpServerInfo) {
            this.mcpServerInfo = mcpServerInfo;
            return this;
        }

        /**
         * <p>The route name.</p>
         * 
         * <strong>example:</strong>
         * <p>itemcenter-pre-route</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The HttpApi route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-crf5l7tlhtgp91t***</p>
         */
        public Builder routeId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * <p>The update time, in ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1726819895636</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public HttpRoute build() {
            return new HttpRoute(this);
        } 

    } 

    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class DomainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private DomainInfos(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfos create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
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

        public static final class Builder {
            private String domainId; 
            private String name; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(DomainInfos model) {
                this.domainId = model.domainId;
                this.name = model.name;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The domain name ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-cr3v7dllhtgi9s***</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>itemcenter.dev</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The domain name protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public DomainInfos build() {
                return new DomainInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class GatewayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayEdition")
        private String gatewayEdition;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private GatewayInfo(Builder builder) {
            this.gatewayEdition = builder.gatewayEdition;
            this.gatewayId = builder.gatewayId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayInfo create() {
            return builder().build();
        }

        /**
         * @return gatewayEdition
         */
        public String getGatewayEdition() {
            return this.gatewayEdition;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String gatewayEdition; 
            private String gatewayId; 
            private String name; 

            private Builder() {
            } 

            private Builder(GatewayInfo model) {
                this.gatewayEdition = model.gatewayEdition;
                this.gatewayId = model.gatewayId;
                this.name = model.name;
            } 

            /**
             * <p>The gateway instance edition. Valid values: Professional, Serverless, MultiTenantServerless, and Unknown.</p>
             * 
             * <strong>example:</strong>
             * <p>MultiTenantServerless</p>
             */
            public Builder gatewayEdition(String gatewayEdition) {
                this.gatewayEdition = gatewayEdition;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-cqoohqtlh***</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The gateway name.</p>
             * 
             * <strong>example:</strong>
             * <p>itemcenter-gateway</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public GatewayInfo build() {
                return new GatewayInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class SubDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("networkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private SubDomains(Builder builder) {
            this.domainId = builder.domainId;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDomains create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String domainId; 
            private String name; 
            private String networkType; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(SubDomains model) {
                this.domainId = model.domainId;
                this.name = model.name;
                this.networkType = model.networkType;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The domain name ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-cqu19hdlhtgjuv4***</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>env-crmic3llht***-cn-hangzhou-vpc.alicloudapi.com</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The domain name access type.</p>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The domain name protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public SubDomains build() {
                return new SubDomains(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class EnvironmentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("gatewayInfo")
        private GatewayInfo gatewayInfo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("subDomains")
        private java.util.List<SubDomains> subDomains;

        private EnvironmentInfo(Builder builder) {
            this.alias = builder.alias;
            this.environmentId = builder.environmentId;
            this.gatewayInfo = builder.gatewayInfo;
            this.name = builder.name;
            this.subDomains = builder.subDomains;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvironmentInfo create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return gatewayInfo
         */
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subDomains
         */
        public java.util.List<SubDomains> getSubDomains() {
            return this.subDomains;
        }

        public static final class Builder {
            private String alias; 
            private String environmentId; 
            private GatewayInfo gatewayInfo; 
            private String name; 
            private java.util.List<SubDomains> subDomains; 

            private Builder() {
            } 

            private Builder(EnvironmentInfo model) {
                this.alias = model.alias;
                this.environmentId = model.environmentId;
                this.gatewayInfo = model.gatewayInfo;
                this.name = model.name;
                this.subDomains = model.subDomains;
            } 

            /**
             * <p>The environment name alias.</p>
             * 
             * <strong>example:</strong>
             * <p>Product center staging environment</p>
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-crhq1u5lhtgju***</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The gateway information.</p>
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * <p>The environment name.</p>
             * 
             * <strong>example:</strong>
             * <p>itemcenter-pre</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of default second-level domain names of the environment.</p>
             */
            public Builder subDomains(java.util.List<SubDomains> subDomains) {
                this.subDomains = subDomains;
                return this;
            }

            public EnvironmentInfo build() {
                return new EnvironmentInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class McpRouteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exposedUriPath")
        private String exposedUriPath;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private McpRouteConfig(Builder builder) {
            this.exposedUriPath = builder.exposedUriPath;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpRouteConfig create() {
            return builder().build();
        }

        /**
         * @return exposedUriPath
         */
        public String getExposedUriPath() {
            return this.exposedUriPath;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String exposedUriPath; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(McpRouteConfig model) {
                this.exposedUriPath = model.exposedUriPath;
                this.protocol = model.protocol;
            } 

            /**
             * <p>mcp route path</p>
             * 
             * <strong>example:</strong>
             * <p>/mcp</p>
             */
            public Builder exposedUriPath(String exposedUriPath) {
                this.exposedUriPath = exposedUriPath;
                return this;
            }

            /**
             * <p>The MCP protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>SSE</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public McpRouteConfig build() {
                return new McpRouteConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpRoute} extends {@link TeaModel}
     *
     * <p>HttpRoute</p>
     */
    public static class McpServerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createFromType")
        private String createFromType;

        @com.aliyun.core.annotation.NameInMap("importInstanceId")
        private String importInstanceId;

        @com.aliyun.core.annotation.NameInMap("importMcpServerId")
        private String importMcpServerId;

        @com.aliyun.core.annotation.NameInMap("importNamespace")
        private String importNamespace;

        @com.aliyun.core.annotation.NameInMap("mcpRouteConfig")
        private McpRouteConfig mcpRouteConfig;

        @com.aliyun.core.annotation.NameInMap("mcpServerConfig")
        private String mcpServerConfig;

        private McpServerInfo(Builder builder) {
            this.createFromType = builder.createFromType;
            this.importInstanceId = builder.importInstanceId;
            this.importMcpServerId = builder.importMcpServerId;
            this.importNamespace = builder.importNamespace;
            this.mcpRouteConfig = builder.mcpRouteConfig;
            this.mcpServerConfig = builder.mcpServerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpServerInfo create() {
            return builder().build();
        }

        /**
         * @return createFromType
         */
        public String getCreateFromType() {
            return this.createFromType;
        }

        /**
         * @return importInstanceId
         */
        public String getImportInstanceId() {
            return this.importInstanceId;
        }

        /**
         * @return importMcpServerId
         */
        public String getImportMcpServerId() {
            return this.importMcpServerId;
        }

        /**
         * @return importNamespace
         */
        public String getImportNamespace() {
            return this.importNamespace;
        }

        /**
         * @return mcpRouteConfig
         */
        public McpRouteConfig getMcpRouteConfig() {
            return this.mcpRouteConfig;
        }

        /**
         * @return mcpServerConfig
         */
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public static final class Builder {
            private String createFromType; 
            private String importInstanceId; 
            private String importMcpServerId; 
            private String importNamespace; 
            private McpRouteConfig mcpRouteConfig; 
            private String mcpServerConfig; 

            private Builder() {
            } 

            private Builder(McpServerInfo model) {
                this.createFromType = model.createFromType;
                this.importInstanceId = model.importInstanceId;
                this.importMcpServerId = model.importMcpServerId;
                this.importNamespace = model.importNamespace;
                this.mcpRouteConfig = model.mcpRouteConfig;
                this.mcpServerConfig = model.mcpServerConfig;
            } 

            /**
             * <p>The creation type.</p>
             * 
             * <strong>example:</strong>
             * <p>Nacos</p>
             */
            public Builder createFromType(String createFromType) {
                this.createFromType = createFromType;
                return this;
            }

            /**
             * <p>The Nacos instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>import-001</p>
             */
            public Builder importInstanceId(String importInstanceId) {
                this.importInstanceId = importInstanceId;
                return this;
            }

            /**
             * <p>The Nacos MCP server identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp-002</p>
             */
            public Builder importMcpServerId(String importMcpServerId) {
                this.importMcpServerId = importMcpServerId;
                return this;
            }

            /**
             * <p>The Nacos namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder importNamespace(String importNamespace) {
                this.importNamespace = importNamespace;
                return this;
            }

            /**
             * <p>The MCP route information.</p>
             */
            public Builder mcpRouteConfig(McpRouteConfig mcpRouteConfig) {
                this.mcpRouteConfig = mcpRouteConfig;
                return this;
            }

            /**
             * <p>The MCP server metadata configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;config\&quot;:{}}</p>
             */
            public Builder mcpServerConfig(String mcpServerConfig) {
                this.mcpServerConfig = mcpServerConfig;
                return this;
            }

            public McpServerInfo build() {
                return new McpServerInfo(this);
            } 

        } 

    }
}
