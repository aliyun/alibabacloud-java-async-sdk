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
         * backend.
         */
        public Builder backend(Backend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * deployStatus.
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domainInfos.
         */
        public Builder domainInfos(java.util.List<DomainInfos> domainInfos) {
            this.domainInfos = domainInfos;
            return this;
        }

        /**
         * environmentInfo.
         */
        public Builder environmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }

        /**
         * gatewayStatus.
         */
        public Builder gatewayStatus(java.util.Map<String, String> gatewayStatus) {
            this.gatewayStatus = gatewayStatus;
            return this;
        }

        /**
         * match.
         */
        public Builder match(HttpRouteMatch match) {
            this.match = match;
            return this;
        }

        /**
         * mcpServerInfo.
         */
        public Builder mcpServerInfo(McpServerInfo mcpServerInfo) {
            this.mcpServerInfo = mcpServerInfo;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * routeId.
         */
        public Builder routeId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * updateTimestamp.
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
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * protocol.
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
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private GatewayInfo(Builder builder) {
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
            private String gatewayId; 
            private String name; 

            private Builder() {
            } 

            private Builder(GatewayInfo model) {
                this.gatewayId = model.gatewayId;
                this.name = model.name;
            } 

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * name.
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
             * domainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * networkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * protocol.
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
             * alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * environmentId.
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * gatewayInfo.
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * subDomains.
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
             * exposedUriPath.
             */
            public Builder exposedUriPath(String exposedUriPath) {
                this.exposedUriPath = exposedUriPath;
                return this;
            }

            /**
             * protocol.
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
             * createFromType.
             */
            public Builder createFromType(String createFromType) {
                this.createFromType = createFromType;
                return this;
            }

            /**
             * importInstanceId.
             */
            public Builder importInstanceId(String importInstanceId) {
                this.importInstanceId = importInstanceId;
                return this;
            }

            /**
             * importMcpServerId.
             */
            public Builder importMcpServerId(String importMcpServerId) {
                this.importMcpServerId = importMcpServerId;
                return this;
            }

            /**
             * importNamespace.
             */
            public Builder importNamespace(String importNamespace) {
                this.importNamespace = importNamespace;
                return this;
            }

            /**
             * mcpRouteConfig.
             */
            public Builder mcpRouteConfig(McpRouteConfig mcpRouteConfig) {
                this.mcpRouteConfig = mcpRouteConfig;
                return this;
            }

            /**
             * mcpServerConfig.
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
