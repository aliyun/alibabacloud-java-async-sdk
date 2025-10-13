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
 * {@link UpdateHttpApiRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateHttpApiRouteRequest</p>
 */
public class UpdateHttpApiRouteRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("backendConfig")
    private BackendConfig backendConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deployConfigs")
    private java.util.List<HttpApiDeployConfig> deployConfigs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domainIds")
    private java.util.List<String> domainIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("match")
    private HttpRouteMatch match;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mcpRouteConfig")
    private McpRouteConfig mcpRouteConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private UpdateHttpApiRouteRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.routeId = builder.routeId;
        this.backendConfig = builder.backendConfig;
        this.deployConfigs = builder.deployConfigs;
        this.description = builder.description;
        this.domainIds = builder.domainIds;
        this.environmentId = builder.environmentId;
        this.match = builder.match;
        this.mcpRouteConfig = builder.mcpRouteConfig;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHttpApiRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    /**
     * @return backendConfig
     */
    public BackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    /**
     * @return deployConfigs
     */
    public java.util.List<HttpApiDeployConfig> getDeployConfigs() {
        return this.deployConfigs;
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
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return match
     */
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    /**
     * @return mcpRouteConfig
     */
    public McpRouteConfig getMcpRouteConfig() {
        return this.mcpRouteConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateHttpApiRouteRequest, Builder> {
        private String httpApiId; 
        private String routeId; 
        private BackendConfig backendConfig; 
        private java.util.List<HttpApiDeployConfig> deployConfigs; 
        private String description; 
        private java.util.List<String> domainIds; 
        private String environmentId; 
        private HttpRouteMatch match; 
        private McpRouteConfig mcpRouteConfig; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHttpApiRouteRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.routeId = request.routeId;
            this.backendConfig = request.backendConfig;
            this.deployConfigs = request.deployConfigs;
            this.description = request.description;
            this.domainIds = request.domainIds;
            this.environmentId = request.environmentId;
            this.match = request.match;
            this.mcpRouteConfig = request.mcpRouteConfig;
            this.name = request.name;
        } 

        /**
         * <p>The ID of the HTTP API for which you want to update the route.</p>
         * 
         * <strong>example:</strong>
         * <p>api-cqoub6tlhtgvof7***</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cr82undlhtgrl***</p>
         */
        public Builder routeId(String routeId) {
            this.putPathParameter("routeId", routeId);
            this.routeId = routeId;
            return this;
        }

        /**
         * <p>The backend service configurations of the route.</p>
         */
        public Builder backendConfig(BackendConfig backendConfig) {
            this.putBodyParameter("backendConfig", backendConfig);
            this.backendConfig = backendConfig;
            return this;
        }

        /**
         * deployConfigs.
         */
        public Builder deployConfigs(java.util.List<HttpApiDeployConfig> deployConfigs) {
            this.putBodyParameter("deployConfigs", deployConfigs);
            this.deployConfigs = deployConfigs;
            return this;
        }

        /**
         * <p>The route description.</p>
         * 
         * <strong>example:</strong>
         * <p>test route</p>
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
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cquqsollhtgid***</p>
         */
        public Builder environmentId(String environmentId) {
            this.putBodyParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The rules for matching the route.</p>
         */
        public Builder match(HttpRouteMatch match) {
            this.putBodyParameter("match", match);
            this.match = match;
            return this;
        }

        /**
         * mcpRouteConfig.
         */
        public Builder mcpRouteConfig(McpRouteConfig mcpRouteConfig) {
            this.putBodyParameter("mcpRouteConfig", mcpRouteConfig);
            this.mcpRouteConfig = mcpRouteConfig;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateHttpApiRouteRequest build() {
            return new UpdateHttpApiRouteRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
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
             * <p>The service port. If you want to use a dynamic port, do not pass this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
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
             * <p>The percentage value of traffic.</p>
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
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
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
             * <p>Valid values:</p>
             * <ul>
             * <li>SingleService</li>
             * <li>MultiServiceByRatio</li>
             * <li>Redirect</li>
             * <li>Mock</li>
             * </ul>
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
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class McpRouteConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exposedUriPath")
        private String exposedUriPath;

        @com.aliyun.core.annotation.NameInMap("mcpStatisticsEnable")
        private Boolean mcpStatisticsEnable;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private McpRouteConfig(Builder builder) {
            this.exposedUriPath = builder.exposedUriPath;
            this.mcpStatisticsEnable = builder.mcpStatisticsEnable;
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

        public static final class Builder {
            private String exposedUriPath; 
            private Boolean mcpStatisticsEnable; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(McpRouteConfig model) {
                this.exposedUriPath = model.exposedUriPath;
                this.mcpStatisticsEnable = model.mcpStatisticsEnable;
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
             * mcpStatisticsEnable.
             */
            public Builder mcpStatisticsEnable(Boolean mcpStatisticsEnable) {
                this.mcpStatisticsEnable = mcpStatisticsEnable;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li>HTTP</li>
             * <li>HTTPS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
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
}
