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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyConfigs")
    private java.util.List<PolicyConfigs> policyConfigs;

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
        this.policyConfigs = builder.policyConfigs;
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

    /**
     * @return policyConfigs
     */
    public java.util.List<PolicyConfigs> getPolicyConfigs() {
        return this.policyConfigs;
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
        private java.util.List<PolicyConfigs> policyConfigs; 

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
            this.policyConfigs = request.policyConfigs;
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

        /**
         * policyConfigs.
         */
        public Builder policyConfigs(java.util.List<PolicyConfigs> policyConfigs) {
            this.putBodyParameter("policyConfigs", policyConfigs);
            this.policyConfigs = policyConfigs;
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
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class EmbeddingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private EmbeddingConfig(Builder builder) {
            this.modelName = builder.modelName;
            this.serviceId = builder.serviceId;
            this.timeout = builder.timeout;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbeddingConfig create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String modelName; 
            private String serviceId; 
            private Integer timeout; 
            private String type; 

            private Builder() {
            } 

            private Builder(EmbeddingConfig model) {
                this.modelName = model.modelName;
                this.serviceId = model.serviceId;
                this.timeout = model.timeout;
                this.type = model.type;
            } 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
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
             * timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EmbeddingConfig build() {
                return new EmbeddingConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class PluginStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorLogs")
        private java.util.Map<String, String> errorLogs;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("serviceHealthy")
        private Boolean serviceHealthy;

        private PluginStatus(Builder builder) {
            this.errorLogs = builder.errorLogs;
            this.pluginId = builder.pluginId;
            this.serviceHealthy = builder.serviceHealthy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginStatus create() {
            return builder().build();
        }

        /**
         * @return errorLogs
         */
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return serviceHealthy
         */
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

        public static final class Builder {
            private java.util.Map<String, String> errorLogs; 
            private String pluginId; 
            private Boolean serviceHealthy; 

            private Builder() {
            } 

            private Builder(PluginStatus model) {
                this.errorLogs = model.errorLogs;
                this.pluginId = model.pluginId;
                this.serviceHealthy = model.serviceHealthy;
            } 

            /**
             * errorLogs.
             */
            public Builder errorLogs(java.util.Map<String, String> errorLogs) {
                this.errorLogs = errorLogs;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * serviceHealthy.
             */
            public Builder serviceHealthy(Boolean serviceHealthy) {
                this.serviceHealthy = serviceHealthy;
                return this;
            }

            public PluginStatus build() {
                return new PluginStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class RedisConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("databaseNumber")
        private Integer databaseNumber;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private RedisConfig(Builder builder) {
            this.databaseNumber = builder.databaseNumber;
            this.host = builder.host;
            this.password = builder.password;
            this.port = builder.port;
            this.timeout = builder.timeout;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedisConfig create() {
            return builder().build();
        }

        /**
         * @return databaseNumber
         */
        public Integer getDatabaseNumber() {
            return this.databaseNumber;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private Integer databaseNumber; 
            private String host; 
            private String password; 
            private Integer port; 
            private Integer timeout; 
            private String username; 

            private Builder() {
            } 

            private Builder(RedisConfig model) {
                this.databaseNumber = model.databaseNumber;
                this.host = model.host;
                this.password = model.password;
                this.port = model.port;
                this.timeout = model.timeout;
                this.username = model.username;
            } 

            /**
             * databaseNumber.
             */
            public Builder databaseNumber(Integer databaseNumber) {
                this.databaseNumber = databaseNumber;
                return this;
            }

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
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
             * timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public RedisConfig build() {
                return new RedisConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class VectorConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("collectionId")
        private String collectionId;

        @com.aliyun.core.annotation.NameInMap("serviceHost")
        private String serviceHost;

        @com.aliyun.core.annotation.NameInMap("threshold")
        private Float threshold;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private VectorConfig(Builder builder) {
            this.apiKey = builder.apiKey;
            this.collectionId = builder.collectionId;
            this.serviceHost = builder.serviceHost;
            this.threshold = builder.threshold;
            this.timeout = builder.timeout;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VectorConfig create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return collectionId
         */
        public String getCollectionId() {
            return this.collectionId;
        }

        /**
         * @return serviceHost
         */
        public String getServiceHost() {
            return this.serviceHost;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String apiKey; 
            private String collectionId; 
            private String serviceHost; 
            private Float threshold; 
            private Integer timeout; 
            private String type; 

            private Builder() {
            } 

            private Builder(VectorConfig model) {
                this.apiKey = model.apiKey;
                this.collectionId = model.collectionId;
                this.serviceHost = model.serviceHost;
                this.threshold = model.threshold;
                this.timeout = model.timeout;
                this.type = model.type;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * collectionId.
             */
            public Builder collectionId(String collectionId) {
                this.collectionId = collectionId;
                return this;
            }

            /**
             * serviceHost.
             */
            public Builder serviceHost(String serviceHost) {
                this.serviceHost = serviceHost;
                return this;
            }

            /**
             * threshold.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VectorConfig build() {
                return new VectorConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiCacheConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cacheKeyStrategy")
        private String cacheKeyStrategy;

        @com.aliyun.core.annotation.NameInMap("cacheMode")
        private String cacheMode;

        @com.aliyun.core.annotation.NameInMap("cacheTTL")
        private Integer cacheTTL;

        @com.aliyun.core.annotation.NameInMap("embeddingConfig")
        private EmbeddingConfig embeddingConfig;

        @com.aliyun.core.annotation.NameInMap("pluginStatus")
        private PluginStatus pluginStatus;

        @com.aliyun.core.annotation.NameInMap("redisConfig")
        private RedisConfig redisConfig;

        @com.aliyun.core.annotation.NameInMap("vectorConfig")
        private VectorConfig vectorConfig;

        private AiCacheConfig(Builder builder) {
            this.cacheKeyStrategy = builder.cacheKeyStrategy;
            this.cacheMode = builder.cacheMode;
            this.cacheTTL = builder.cacheTTL;
            this.embeddingConfig = builder.embeddingConfig;
            this.pluginStatus = builder.pluginStatus;
            this.redisConfig = builder.redisConfig;
            this.vectorConfig = builder.vectorConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiCacheConfig create() {
            return builder().build();
        }

        /**
         * @return cacheKeyStrategy
         */
        public String getCacheKeyStrategy() {
            return this.cacheKeyStrategy;
        }

        /**
         * @return cacheMode
         */
        public String getCacheMode() {
            return this.cacheMode;
        }

        /**
         * @return cacheTTL
         */
        public Integer getCacheTTL() {
            return this.cacheTTL;
        }

        /**
         * @return embeddingConfig
         */
        public EmbeddingConfig getEmbeddingConfig() {
            return this.embeddingConfig;
        }

        /**
         * @return pluginStatus
         */
        public PluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        /**
         * @return redisConfig
         */
        public RedisConfig getRedisConfig() {
            return this.redisConfig;
        }

        /**
         * @return vectorConfig
         */
        public VectorConfig getVectorConfig() {
            return this.vectorConfig;
        }

        public static final class Builder {
            private String cacheKeyStrategy; 
            private String cacheMode; 
            private Integer cacheTTL; 
            private EmbeddingConfig embeddingConfig; 
            private PluginStatus pluginStatus; 
            private RedisConfig redisConfig; 
            private VectorConfig vectorConfig; 

            private Builder() {
            } 

            private Builder(AiCacheConfig model) {
                this.cacheKeyStrategy = model.cacheKeyStrategy;
                this.cacheMode = model.cacheMode;
                this.cacheTTL = model.cacheTTL;
                this.embeddingConfig = model.embeddingConfig;
                this.pluginStatus = model.pluginStatus;
                this.redisConfig = model.redisConfig;
                this.vectorConfig = model.vectorConfig;
            } 

            /**
             * cacheKeyStrategy.
             */
            public Builder cacheKeyStrategy(String cacheKeyStrategy) {
                this.cacheKeyStrategy = cacheKeyStrategy;
                return this;
            }

            /**
             * cacheMode.
             */
            public Builder cacheMode(String cacheMode) {
                this.cacheMode = cacheMode;
                return this;
            }

            /**
             * cacheTTL.
             */
            public Builder cacheTTL(Integer cacheTTL) {
                this.cacheTTL = cacheTTL;
                return this;
            }

            /**
             * embeddingConfig.
             */
            public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
                this.embeddingConfig = embeddingConfig;
                return this;
            }

            /**
             * pluginStatus.
             */
            public Builder pluginStatus(PluginStatus pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            /**
             * redisConfig.
             */
            public Builder redisConfig(RedisConfig redisConfig) {
                this.redisConfig = redisConfig;
                return this;
            }

            /**
             * vectorConfig.
             */
            public Builder vectorConfig(VectorConfig vectorConfig) {
                this.vectorConfig = vectorConfig;
                return this;
            }

            public AiCacheConfig build() {
                return new AiCacheConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("passThroughModelName")
        private Boolean passThroughModelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("targetModelName")
        private String targetModelName;

        private ServiceConfigs(Builder builder) {
            this.name = builder.name;
            this.passThroughModelName = builder.passThroughModelName;
            this.serviceId = builder.serviceId;
            this.targetModelName = builder.targetModelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return passThroughModelName
         */
        public Boolean getPassThroughModelName() {
            return this.passThroughModelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return targetModelName
         */
        public String getTargetModelName() {
            return this.targetModelName;
        }

        public static final class Builder {
            private String name; 
            private Boolean passThroughModelName; 
            private String serviceId; 
            private String targetModelName; 

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.name = model.name;
                this.passThroughModelName = model.passThroughModelName;
                this.serviceId = model.serviceId;
                this.targetModelName = model.targetModelName;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * passThroughModelName.
             */
            public Builder passThroughModelName(Boolean passThroughModelName) {
                this.passThroughModelName = passThroughModelName;
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
             * targetModelName.
             */
            public Builder targetModelName(String targetModelName) {
                this.targetModelName = targetModelName;
                return this;
            }

            public ServiceConfigs build() {
                return new ServiceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiFallbackConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("onlyRedirectUpstreamCode")
        private Boolean onlyRedirectUpstreamCode;

        @com.aliyun.core.annotation.NameInMap("routeEmbedded")
        private Boolean routeEmbedded;

        @com.aliyun.core.annotation.NameInMap("serviceConfigs")
        private java.util.List<ServiceConfigs> serviceConfigs;

        private AiFallbackConfig(Builder builder) {
            this.onlyRedirectUpstreamCode = builder.onlyRedirectUpstreamCode;
            this.routeEmbedded = builder.routeEmbedded;
            this.serviceConfigs = builder.serviceConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiFallbackConfig create() {
            return builder().build();
        }

        /**
         * @return onlyRedirectUpstreamCode
         */
        public Boolean getOnlyRedirectUpstreamCode() {
            return this.onlyRedirectUpstreamCode;
        }

        /**
         * @return routeEmbedded
         */
        public Boolean getRouteEmbedded() {
            return this.routeEmbedded;
        }

        /**
         * @return serviceConfigs
         */
        public java.util.List<ServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        public static final class Builder {
            private Boolean onlyRedirectUpstreamCode; 
            private Boolean routeEmbedded; 
            private java.util.List<ServiceConfigs> serviceConfigs; 

            private Builder() {
            } 

            private Builder(AiFallbackConfig model) {
                this.onlyRedirectUpstreamCode = model.onlyRedirectUpstreamCode;
                this.routeEmbedded = model.routeEmbedded;
                this.serviceConfigs = model.serviceConfigs;
            } 

            /**
             * onlyRedirectUpstreamCode.
             */
            public Builder onlyRedirectUpstreamCode(Boolean onlyRedirectUpstreamCode) {
                this.onlyRedirectUpstreamCode = onlyRedirectUpstreamCode;
                return this;
            }

            /**
             * routeEmbedded.
             */
            public Builder routeEmbedded(Boolean routeEmbedded) {
                this.routeEmbedded = routeEmbedded;
                return this;
            }

            /**
             * serviceConfigs.
             */
            public Builder serviceConfigs(java.util.List<ServiceConfigs> serviceConfigs) {
                this.serviceConfigs = serviceConfigs;
                return this;
            }

            public AiFallbackConfig build() {
                return new AiFallbackConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiNetworkSearchConfigPluginStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorLogs")
        private java.util.Map<String, String> errorLogs;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("serviceHealthy")
        private Boolean serviceHealthy;

        private AiNetworkSearchConfigPluginStatus(Builder builder) {
            this.errorLogs = builder.errorLogs;
            this.pluginId = builder.pluginId;
            this.serviceHealthy = builder.serviceHealthy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiNetworkSearchConfigPluginStatus create() {
            return builder().build();
        }

        /**
         * @return errorLogs
         */
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return serviceHealthy
         */
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

        public static final class Builder {
            private java.util.Map<String, String> errorLogs; 
            private String pluginId; 
            private Boolean serviceHealthy; 

            private Builder() {
            } 

            private Builder(AiNetworkSearchConfigPluginStatus model) {
                this.errorLogs = model.errorLogs;
                this.pluginId = model.pluginId;
                this.serviceHealthy = model.serviceHealthy;
            } 

            /**
             * errorLogs.
             */
            public Builder errorLogs(java.util.Map<String, String> errorLogs) {
                this.errorLogs = errorLogs;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * serviceHealthy.
             */
            public Builder serviceHealthy(Boolean serviceHealthy) {
                this.serviceHealthy = serviceHealthy;
                return this;
            }

            public AiNetworkSearchConfigPluginStatus build() {
                return new AiNetworkSearchConfigPluginStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class SearchEngineConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("contentMode")
        private String contentMode;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("optionArgs")
        private java.util.Map<String, String> optionArgs;

        @com.aliyun.core.annotation.NameInMap("start")
        private Integer start;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private String timeRange;

        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SearchEngineConfig(Builder builder) {
            this.apiKey = builder.apiKey;
            this.contentMode = builder.contentMode;
            this.count = builder.count;
            this.endpoint = builder.endpoint;
            this.industry = builder.industry;
            this.optionArgs = builder.optionArgs;
            this.start = builder.start;
            this.timeRange = builder.timeRange;
            this.timeoutMillisecond = builder.timeoutMillisecond;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchEngineConfig create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return contentMode
         */
        public String getContentMode() {
            return this.contentMode;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return optionArgs
         */
        public java.util.Map<String, String> getOptionArgs() {
            return this.optionArgs;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        /**
         * @return timeRange
         */
        public String getTimeRange() {
            return this.timeRange;
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String apiKey; 
            private String contentMode; 
            private Integer count; 
            private String endpoint; 
            private String industry; 
            private java.util.Map<String, String> optionArgs; 
            private Integer start; 
            private String timeRange; 
            private Integer timeoutMillisecond; 
            private String type; 

            private Builder() {
            } 

            private Builder(SearchEngineConfig model) {
                this.apiKey = model.apiKey;
                this.contentMode = model.contentMode;
                this.count = model.count;
                this.endpoint = model.endpoint;
                this.industry = model.industry;
                this.optionArgs = model.optionArgs;
                this.start = model.start;
                this.timeRange = model.timeRange;
                this.timeoutMillisecond = model.timeoutMillisecond;
                this.type = model.type;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * contentMode.
             */
            public Builder contentMode(String contentMode) {
                this.contentMode = contentMode;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * optionArgs.
             */
            public Builder optionArgs(java.util.Map<String, String> optionArgs) {
                this.optionArgs = optionArgs;
                return this;
            }

            /**
             * start.
             */
            public Builder start(Integer start) {
                this.start = start;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(String timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            /**
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SearchEngineConfig build() {
                return new SearchEngineConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class SearchFrom extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("contentMode")
        private String contentMode;

        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("optionArgs")
        private java.util.Map<String, String> optionArgs;

        @com.aliyun.core.annotation.NameInMap("start")
        private Integer start;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private String timeRange;

        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SearchFrom(Builder builder) {
            this.apiKey = builder.apiKey;
            this.contentMode = builder.contentMode;
            this.count = builder.count;
            this.endpoint = builder.endpoint;
            this.industry = builder.industry;
            this.optionArgs = builder.optionArgs;
            this.start = builder.start;
            this.timeRange = builder.timeRange;
            this.timeoutMillisecond = builder.timeoutMillisecond;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchFrom create() {
            return builder().build();
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return contentMode
         */
        public String getContentMode() {
            return this.contentMode;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return optionArgs
         */
        public java.util.Map<String, String> getOptionArgs() {
            return this.optionArgs;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        /**
         * @return timeRange
         */
        public String getTimeRange() {
            return this.timeRange;
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String apiKey; 
            private String contentMode; 
            private Integer count; 
            private String endpoint; 
            private String industry; 
            private java.util.Map<String, String> optionArgs; 
            private Integer start; 
            private String timeRange; 
            private Integer timeoutMillisecond; 
            private String type; 

            private Builder() {
            } 

            private Builder(SearchFrom model) {
                this.apiKey = model.apiKey;
                this.contentMode = model.contentMode;
                this.count = model.count;
                this.endpoint = model.endpoint;
                this.industry = model.industry;
                this.optionArgs = model.optionArgs;
                this.start = model.start;
                this.timeRange = model.timeRange;
                this.timeoutMillisecond = model.timeoutMillisecond;
                this.type = model.type;
            } 

            /**
             * apiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * contentMode.
             */
            public Builder contentMode(String contentMode) {
                this.contentMode = contentMode;
                return this;
            }

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * optionArgs.
             */
            public Builder optionArgs(java.util.Map<String, String> optionArgs) {
                this.optionArgs = optionArgs;
                return this;
            }

            /**
             * start.
             */
            public Builder start(Integer start) {
                this.start = start;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(String timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            /**
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SearchFrom build() {
                return new SearchFrom(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class SearchRewrite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("maxCount")
        private Integer maxCount;

        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        private SearchRewrite(Builder builder) {
            this.enable = builder.enable;
            this.maxCount = builder.maxCount;
            this.modelName = builder.modelName;
            this.serviceId = builder.serviceId;
            this.timeoutMillisecond = builder.timeoutMillisecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchRewrite create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return maxCount
         */
        public Integer getMaxCount() {
            return this.maxCount;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public static final class Builder {
            private Boolean enable; 
            private Integer maxCount; 
            private String modelName; 
            private String serviceId; 
            private Integer timeoutMillisecond; 

            private Builder() {
            } 

            private Builder(SearchRewrite model) {
                this.enable = model.enable;
                this.maxCount = model.maxCount;
                this.modelName = model.modelName;
                this.serviceId = model.serviceId;
                this.timeoutMillisecond = model.timeoutMillisecond;
            } 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * maxCount.
             */
            public Builder maxCount(Integer maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
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
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            public SearchRewrite build() {
                return new SearchRewrite(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiNetworkSearchConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("defaultEnable")
        private Boolean defaultEnable;

        @com.aliyun.core.annotation.NameInMap("defaultLang")
        private String defaultLang;

        @com.aliyun.core.annotation.NameInMap("needReference")
        private Boolean needReference;

        @com.aliyun.core.annotation.NameInMap("pluginStatus")
        private AiNetworkSearchConfigPluginStatus pluginStatus;

        @com.aliyun.core.annotation.NameInMap("referenceFormat")
        private String referenceFormat;

        @com.aliyun.core.annotation.NameInMap("referenceLocation")
        private String referenceLocation;

        @com.aliyun.core.annotation.NameInMap("searchEngineConfig")
        private SearchEngineConfig searchEngineConfig;

        @com.aliyun.core.annotation.NameInMap("searchFrom")
        private java.util.List<SearchFrom> searchFrom;

        @com.aliyun.core.annotation.NameInMap("searchRewrite")
        private SearchRewrite searchRewrite;

        private AiNetworkSearchConfig(Builder builder) {
            this.defaultEnable = builder.defaultEnable;
            this.defaultLang = builder.defaultLang;
            this.needReference = builder.needReference;
            this.pluginStatus = builder.pluginStatus;
            this.referenceFormat = builder.referenceFormat;
            this.referenceLocation = builder.referenceLocation;
            this.searchEngineConfig = builder.searchEngineConfig;
            this.searchFrom = builder.searchFrom;
            this.searchRewrite = builder.searchRewrite;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiNetworkSearchConfig create() {
            return builder().build();
        }

        /**
         * @return defaultEnable
         */
        public Boolean getDefaultEnable() {
            return this.defaultEnable;
        }

        /**
         * @return defaultLang
         */
        public String getDefaultLang() {
            return this.defaultLang;
        }

        /**
         * @return needReference
         */
        public Boolean getNeedReference() {
            return this.needReference;
        }

        /**
         * @return pluginStatus
         */
        public AiNetworkSearchConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        /**
         * @return referenceFormat
         */
        public String getReferenceFormat() {
            return this.referenceFormat;
        }

        /**
         * @return referenceLocation
         */
        public String getReferenceLocation() {
            return this.referenceLocation;
        }

        /**
         * @return searchEngineConfig
         */
        public SearchEngineConfig getSearchEngineConfig() {
            return this.searchEngineConfig;
        }

        /**
         * @return searchFrom
         */
        public java.util.List<SearchFrom> getSearchFrom() {
            return this.searchFrom;
        }

        /**
         * @return searchRewrite
         */
        public SearchRewrite getSearchRewrite() {
            return this.searchRewrite;
        }

        public static final class Builder {
            private Boolean defaultEnable; 
            private String defaultLang; 
            private Boolean needReference; 
            private AiNetworkSearchConfigPluginStatus pluginStatus; 
            private String referenceFormat; 
            private String referenceLocation; 
            private SearchEngineConfig searchEngineConfig; 
            private java.util.List<SearchFrom> searchFrom; 
            private SearchRewrite searchRewrite; 

            private Builder() {
            } 

            private Builder(AiNetworkSearchConfig model) {
                this.defaultEnable = model.defaultEnable;
                this.defaultLang = model.defaultLang;
                this.needReference = model.needReference;
                this.pluginStatus = model.pluginStatus;
                this.referenceFormat = model.referenceFormat;
                this.referenceLocation = model.referenceLocation;
                this.searchEngineConfig = model.searchEngineConfig;
                this.searchFrom = model.searchFrom;
                this.searchRewrite = model.searchRewrite;
            } 

            /**
             * defaultEnable.
             */
            public Builder defaultEnable(Boolean defaultEnable) {
                this.defaultEnable = defaultEnable;
                return this;
            }

            /**
             * defaultLang.
             */
            public Builder defaultLang(String defaultLang) {
                this.defaultLang = defaultLang;
                return this;
            }

            /**
             * needReference.
             */
            public Builder needReference(Boolean needReference) {
                this.needReference = needReference;
                return this;
            }

            /**
             * pluginStatus.
             */
            public Builder pluginStatus(AiNetworkSearchConfigPluginStatus pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            /**
             * referenceFormat.
             */
            public Builder referenceFormat(String referenceFormat) {
                this.referenceFormat = referenceFormat;
                return this;
            }

            /**
             * referenceLocation.
             */
            public Builder referenceLocation(String referenceLocation) {
                this.referenceLocation = referenceLocation;
                return this;
            }

            /**
             * searchEngineConfig.
             */
            public Builder searchEngineConfig(SearchEngineConfig searchEngineConfig) {
                this.searchEngineConfig = searchEngineConfig;
                return this;
            }

            /**
             * searchFrom.
             */
            public Builder searchFrom(java.util.List<SearchFrom> searchFrom) {
                this.searchFrom = searchFrom;
                return this;
            }

            /**
             * searchRewrite.
             */
            public Builder searchRewrite(SearchRewrite searchRewrite) {
                this.searchRewrite = searchRewrite;
                return this;
            }

            public AiNetworkSearchConfig build() {
                return new AiNetworkSearchConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ConsumerRequestCheckService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("modalityType")
        private String modalityType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("requestCheckService")
        private String requestCheckService;

        @com.aliyun.core.annotation.NameInMap("requestImageCheckService")
        private String requestImageCheckService;

        private ConsumerRequestCheckService(Builder builder) {
            this.matchType = builder.matchType;
            this.modalityType = builder.modalityType;
            this.name = builder.name;
            this.requestCheckService = builder.requestCheckService;
            this.requestImageCheckService = builder.requestImageCheckService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRequestCheckService create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return modalityType
         */
        public String getModalityType() {
            return this.modalityType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return requestCheckService
         */
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        /**
         * @return requestImageCheckService
         */
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

        public static final class Builder {
            private String matchType; 
            private String modalityType; 
            private String name; 
            private String requestCheckService; 
            private String requestImageCheckService; 

            private Builder() {
            } 

            private Builder(ConsumerRequestCheckService model) {
                this.matchType = model.matchType;
                this.modalityType = model.modalityType;
                this.name = model.name;
                this.requestCheckService = model.requestCheckService;
                this.requestImageCheckService = model.requestImageCheckService;
            } 

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * modalityType.
             */
            public Builder modalityType(String modalityType) {
                this.modalityType = modalityType;
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
             * requestCheckService.
             */
            public Builder requestCheckService(String requestCheckService) {
                this.requestCheckService = requestCheckService;
                return this;
            }

            /**
             * requestImageCheckService.
             */
            public Builder requestImageCheckService(String requestImageCheckService) {
                this.requestImageCheckService = requestImageCheckService;
                return this;
            }

            public ConsumerRequestCheckService build() {
                return new ConsumerRequestCheckService(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ConsumerResponseCheckService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("modalityType")
        private String modalityType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("responseCheckService")
        private String responseCheckService;

        @com.aliyun.core.annotation.NameInMap("responseImageCheckService")
        private String responseImageCheckService;

        private ConsumerResponseCheckService(Builder builder) {
            this.matchType = builder.matchType;
            this.modalityType = builder.modalityType;
            this.name = builder.name;
            this.responseCheckService = builder.responseCheckService;
            this.responseImageCheckService = builder.responseImageCheckService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerResponseCheckService create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return modalityType
         */
        public String getModalityType() {
            return this.modalityType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return responseCheckService
         */
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        /**
         * @return responseImageCheckService
         */
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

        public static final class Builder {
            private String matchType; 
            private String modalityType; 
            private String name; 
            private String responseCheckService; 
            private String responseImageCheckService; 

            private Builder() {
            } 

            private Builder(ConsumerResponseCheckService model) {
                this.matchType = model.matchType;
                this.modalityType = model.modalityType;
                this.name = model.name;
                this.responseCheckService = model.responseCheckService;
                this.responseImageCheckService = model.responseImageCheckService;
            } 

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * modalityType.
             */
            public Builder modalityType(String modalityType) {
                this.modalityType = modalityType;
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
             * responseCheckService.
             */
            public Builder responseCheckService(String responseCheckService) {
                this.responseCheckService = responseCheckService;
                return this;
            }

            /**
             * responseImageCheckService.
             */
            public Builder responseImageCheckService(String responseImageCheckService) {
                this.responseImageCheckService = responseImageCheckService;
                return this;
            }

            public ConsumerResponseCheckService build() {
                return new ConsumerResponseCheckService(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ConsumerRiskLevel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ConsumerRiskLevel(Builder builder) {
            this.level = builder.level;
            this.matchType = builder.matchType;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRiskLevel create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level; 
            private String matchType; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(ConsumerRiskLevel model) {
                this.level = model.level;
                this.matchType = model.matchType;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ConsumerRiskLevel build() {
                return new ConsumerRiskLevel(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiSecurityGuardConfigPluginStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorLogs")
        private java.util.Map<String, String> errorLogs;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("serviceHealthy")
        private Boolean serviceHealthy;

        private AiSecurityGuardConfigPluginStatus(Builder builder) {
            this.errorLogs = builder.errorLogs;
            this.pluginId = builder.pluginId;
            this.serviceHealthy = builder.serviceHealthy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiSecurityGuardConfigPluginStatus create() {
            return builder().build();
        }

        /**
         * @return errorLogs
         */
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return serviceHealthy
         */
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

        public static final class Builder {
            private java.util.Map<String, String> errorLogs; 
            private String pluginId; 
            private Boolean serviceHealthy; 

            private Builder() {
            } 

            private Builder(AiSecurityGuardConfigPluginStatus model) {
                this.errorLogs = model.errorLogs;
                this.pluginId = model.pluginId;
                this.serviceHealthy = model.serviceHealthy;
            } 

            /**
             * errorLogs.
             */
            public Builder errorLogs(java.util.Map<String, String> errorLogs) {
                this.errorLogs = errorLogs;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * serviceHealthy.
             */
            public Builder serviceHealthy(Boolean serviceHealthy) {
                this.serviceHealthy = serviceHealthy;
                return this;
            }

            public AiSecurityGuardConfigPluginStatus build() {
                return new AiSecurityGuardConfigPluginStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ConsumerRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("pattern")
        private String pattern;

        private ConsumerRules(Builder builder) {
            this.matchType = builder.matchType;
            this.pattern = builder.pattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumerRules create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        public static final class Builder {
            private String matchType; 
            private String pattern; 

            private Builder() {
            } 

            private Builder(ConsumerRules model) {
                this.matchType = model.matchType;
                this.pattern = model.pattern;
            } 

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * pattern.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            public ConsumerRules build() {
                return new ConsumerRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class RiskConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerRules")
        private ConsumerRules consumerRules;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private RiskConfig(Builder builder) {
            this.consumerRules = builder.consumerRules;
            this.level = builder.level;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskConfig create() {
            return builder().build();
        }

        /**
         * @return consumerRules
         */
        public ConsumerRules getConsumerRules() {
            return this.consumerRules;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ConsumerRules consumerRules; 
            private String level; 
            private String type; 

            private Builder() {
            } 

            private Builder(RiskConfig model) {
                this.consumerRules = model.consumerRules;
                this.level = model.level;
                this.type = model.type;
            } 

            /**
             * consumerRules.
             */
            public Builder consumerRules(ConsumerRules consumerRules) {
                this.consumerRules = consumerRules;
                return this;
            }

            /**
             * level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RiskConfig build() {
                return new RiskConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiSecurityGuardConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bufferLimit")
        private Integer bufferLimit;

        @com.aliyun.core.annotation.NameInMap("checkRequest")
        private Boolean checkRequest;

        @com.aliyun.core.annotation.NameInMap("checkRequestImage")
        private Boolean checkRequestImage;

        @com.aliyun.core.annotation.NameInMap("checkResponse")
        private Boolean checkResponse;

        @com.aliyun.core.annotation.NameInMap("checkResponseImage")
        private Boolean checkResponseImage;

        @com.aliyun.core.annotation.NameInMap("consumerRequestCheckService")
        private java.util.List<ConsumerRequestCheckService> consumerRequestCheckService;

        @com.aliyun.core.annotation.NameInMap("consumerResponseCheckService")
        private java.util.List<ConsumerResponseCheckService> consumerResponseCheckService;

        @com.aliyun.core.annotation.NameInMap("consumerRiskLevel")
        private java.util.List<ConsumerRiskLevel> consumerRiskLevel;

        @com.aliyun.core.annotation.NameInMap("pluginStatus")
        private AiSecurityGuardConfigPluginStatus pluginStatus;

        @com.aliyun.core.annotation.NameInMap("requestCheckService")
        private String requestCheckService;

        @com.aliyun.core.annotation.NameInMap("requestImageCheckService")
        private String requestImageCheckService;

        @com.aliyun.core.annotation.NameInMap("responseCheckService")
        private String responseCheckService;

        @com.aliyun.core.annotation.NameInMap("responseImageCheckService")
        private String responseImageCheckService;

        @com.aliyun.core.annotation.NameInMap("riskAlertLevel")
        private String riskAlertLevel;

        @com.aliyun.core.annotation.NameInMap("riskConfig")
        private java.util.List<RiskConfig> riskConfig;

        @com.aliyun.core.annotation.NameInMap("serviceAddress")
        private String serviceAddress;

        private AiSecurityGuardConfig(Builder builder) {
            this.bufferLimit = builder.bufferLimit;
            this.checkRequest = builder.checkRequest;
            this.checkRequestImage = builder.checkRequestImage;
            this.checkResponse = builder.checkResponse;
            this.checkResponseImage = builder.checkResponseImage;
            this.consumerRequestCheckService = builder.consumerRequestCheckService;
            this.consumerResponseCheckService = builder.consumerResponseCheckService;
            this.consumerRiskLevel = builder.consumerRiskLevel;
            this.pluginStatus = builder.pluginStatus;
            this.requestCheckService = builder.requestCheckService;
            this.requestImageCheckService = builder.requestImageCheckService;
            this.responseCheckService = builder.responseCheckService;
            this.responseImageCheckService = builder.responseImageCheckService;
            this.riskAlertLevel = builder.riskAlertLevel;
            this.riskConfig = builder.riskConfig;
            this.serviceAddress = builder.serviceAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiSecurityGuardConfig create() {
            return builder().build();
        }

        /**
         * @return bufferLimit
         */
        public Integer getBufferLimit() {
            return this.bufferLimit;
        }

        /**
         * @return checkRequest
         */
        public Boolean getCheckRequest() {
            return this.checkRequest;
        }

        /**
         * @return checkRequestImage
         */
        public Boolean getCheckRequestImage() {
            return this.checkRequestImage;
        }

        /**
         * @return checkResponse
         */
        public Boolean getCheckResponse() {
            return this.checkResponse;
        }

        /**
         * @return checkResponseImage
         */
        public Boolean getCheckResponseImage() {
            return this.checkResponseImage;
        }

        /**
         * @return consumerRequestCheckService
         */
        public java.util.List<ConsumerRequestCheckService> getConsumerRequestCheckService() {
            return this.consumerRequestCheckService;
        }

        /**
         * @return consumerResponseCheckService
         */
        public java.util.List<ConsumerResponseCheckService> getConsumerResponseCheckService() {
            return this.consumerResponseCheckService;
        }

        /**
         * @return consumerRiskLevel
         */
        public java.util.List<ConsumerRiskLevel> getConsumerRiskLevel() {
            return this.consumerRiskLevel;
        }

        /**
         * @return pluginStatus
         */
        public AiSecurityGuardConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        /**
         * @return requestCheckService
         */
        public String getRequestCheckService() {
            return this.requestCheckService;
        }

        /**
         * @return requestImageCheckService
         */
        public String getRequestImageCheckService() {
            return this.requestImageCheckService;
        }

        /**
         * @return responseCheckService
         */
        public String getResponseCheckService() {
            return this.responseCheckService;
        }

        /**
         * @return responseImageCheckService
         */
        public String getResponseImageCheckService() {
            return this.responseImageCheckService;
        }

        /**
         * @return riskAlertLevel
         */
        public String getRiskAlertLevel() {
            return this.riskAlertLevel;
        }

        /**
         * @return riskConfig
         */
        public java.util.List<RiskConfig> getRiskConfig() {
            return this.riskConfig;
        }

        /**
         * @return serviceAddress
         */
        public String getServiceAddress() {
            return this.serviceAddress;
        }

        public static final class Builder {
            private Integer bufferLimit; 
            private Boolean checkRequest; 
            private Boolean checkRequestImage; 
            private Boolean checkResponse; 
            private Boolean checkResponseImage; 
            private java.util.List<ConsumerRequestCheckService> consumerRequestCheckService; 
            private java.util.List<ConsumerResponseCheckService> consumerResponseCheckService; 
            private java.util.List<ConsumerRiskLevel> consumerRiskLevel; 
            private AiSecurityGuardConfigPluginStatus pluginStatus; 
            private String requestCheckService; 
            private String requestImageCheckService; 
            private String responseCheckService; 
            private String responseImageCheckService; 
            private String riskAlertLevel; 
            private java.util.List<RiskConfig> riskConfig; 
            private String serviceAddress; 

            private Builder() {
            } 

            private Builder(AiSecurityGuardConfig model) {
                this.bufferLimit = model.bufferLimit;
                this.checkRequest = model.checkRequest;
                this.checkRequestImage = model.checkRequestImage;
                this.checkResponse = model.checkResponse;
                this.checkResponseImage = model.checkResponseImage;
                this.consumerRequestCheckService = model.consumerRequestCheckService;
                this.consumerResponseCheckService = model.consumerResponseCheckService;
                this.consumerRiskLevel = model.consumerRiskLevel;
                this.pluginStatus = model.pluginStatus;
                this.requestCheckService = model.requestCheckService;
                this.requestImageCheckService = model.requestImageCheckService;
                this.responseCheckService = model.responseCheckService;
                this.responseImageCheckService = model.responseImageCheckService;
                this.riskAlertLevel = model.riskAlertLevel;
                this.riskConfig = model.riskConfig;
                this.serviceAddress = model.serviceAddress;
            } 

            /**
             * bufferLimit.
             */
            public Builder bufferLimit(Integer bufferLimit) {
                this.bufferLimit = bufferLimit;
                return this;
            }

            /**
             * checkRequest.
             */
            public Builder checkRequest(Boolean checkRequest) {
                this.checkRequest = checkRequest;
                return this;
            }

            /**
             * checkRequestImage.
             */
            public Builder checkRequestImage(Boolean checkRequestImage) {
                this.checkRequestImage = checkRequestImage;
                return this;
            }

            /**
             * checkResponse.
             */
            public Builder checkResponse(Boolean checkResponse) {
                this.checkResponse = checkResponse;
                return this;
            }

            /**
             * checkResponseImage.
             */
            public Builder checkResponseImage(Boolean checkResponseImage) {
                this.checkResponseImage = checkResponseImage;
                return this;
            }

            /**
             * consumerRequestCheckService.
             */
            public Builder consumerRequestCheckService(java.util.List<ConsumerRequestCheckService> consumerRequestCheckService) {
                this.consumerRequestCheckService = consumerRequestCheckService;
                return this;
            }

            /**
             * consumerResponseCheckService.
             */
            public Builder consumerResponseCheckService(java.util.List<ConsumerResponseCheckService> consumerResponseCheckService) {
                this.consumerResponseCheckService = consumerResponseCheckService;
                return this;
            }

            /**
             * consumerRiskLevel.
             */
            public Builder consumerRiskLevel(java.util.List<ConsumerRiskLevel> consumerRiskLevel) {
                this.consumerRiskLevel = consumerRiskLevel;
                return this;
            }

            /**
             * pluginStatus.
             */
            public Builder pluginStatus(AiSecurityGuardConfigPluginStatus pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            /**
             * requestCheckService.
             */
            public Builder requestCheckService(String requestCheckService) {
                this.requestCheckService = requestCheckService;
                return this;
            }

            /**
             * requestImageCheckService.
             */
            public Builder requestImageCheckService(String requestImageCheckService) {
                this.requestImageCheckService = requestImageCheckService;
                return this;
            }

            /**
             * responseCheckService.
             */
            public Builder responseCheckService(String responseCheckService) {
                this.responseCheckService = responseCheckService;
                return this;
            }

            /**
             * responseImageCheckService.
             */
            public Builder responseImageCheckService(String responseImageCheckService) {
                this.responseImageCheckService = responseImageCheckService;
                return this;
            }

            /**
             * riskAlertLevel.
             */
            public Builder riskAlertLevel(String riskAlertLevel) {
                this.riskAlertLevel = riskAlertLevel;
                return this;
            }

            /**
             * riskConfig.
             */
            public Builder riskConfig(java.util.List<RiskConfig> riskConfig) {
                this.riskConfig = riskConfig;
                return this;
            }

            /**
             * serviceAddress.
             */
            public Builder serviceAddress(String serviceAddress) {
                this.serviceAddress = serviceAddress;
                return this;
            }

            public AiSecurityGuardConfig build() {
                return new AiSecurityGuardConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiStatisticsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logRequestContent")
        private Boolean logRequestContent;

        @com.aliyun.core.annotation.NameInMap("logResponseContent")
        private Boolean logResponseContent;

        private AiStatisticsConfig(Builder builder) {
            this.logRequestContent = builder.logRequestContent;
            this.logResponseContent = builder.logResponseContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiStatisticsConfig create() {
            return builder().build();
        }

        /**
         * @return logRequestContent
         */
        public Boolean getLogRequestContent() {
            return this.logRequestContent;
        }

        /**
         * @return logResponseContent
         */
        public Boolean getLogResponseContent() {
            return this.logResponseContent;
        }

        public static final class Builder {
            private Boolean logRequestContent; 
            private Boolean logResponseContent; 

            private Builder() {
            } 

            private Builder(AiStatisticsConfig model) {
                this.logRequestContent = model.logRequestContent;
                this.logResponseContent = model.logResponseContent;
            } 

            /**
             * logRequestContent.
             */
            public Builder logRequestContent(Boolean logRequestContent) {
                this.logRequestContent = logRequestContent;
                return this;
            }

            /**
             * logResponseContent.
             */
            public Builder logResponseContent(Boolean logResponseContent) {
                this.logResponseContent = logResponseContent;
                return this;
            }

            public AiStatisticsConfig build() {
                return new AiStatisticsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class GlobalRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limitMode")
        private String limitMode;

        @com.aliyun.core.annotation.NameInMap("limitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("limitValue")
        private Integer limitValue;

        @com.aliyun.core.annotation.NameInMap("matchKey")
        private String matchKey;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("matchValue")
        private String matchValue;

        private GlobalRules(Builder builder) {
            this.limitMode = builder.limitMode;
            this.limitType = builder.limitType;
            this.limitValue = builder.limitValue;
            this.matchKey = builder.matchKey;
            this.matchType = builder.matchType;
            this.matchValue = builder.matchValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalRules create() {
            return builder().build();
        }

        /**
         * @return limitMode
         */
        public String getLimitMode() {
            return this.limitMode;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return limitValue
         */
        public Integer getLimitValue() {
            return this.limitValue;
        }

        /**
         * @return matchKey
         */
        public String getMatchKey() {
            return this.matchKey;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return matchValue
         */
        public String getMatchValue() {
            return this.matchValue;
        }

        public static final class Builder {
            private String limitMode; 
            private String limitType; 
            private Integer limitValue; 
            private String matchKey; 
            private String matchType; 
            private String matchValue; 

            private Builder() {
            } 

            private Builder(GlobalRules model) {
                this.limitMode = model.limitMode;
                this.limitType = model.limitType;
                this.limitValue = model.limitValue;
                this.matchKey = model.matchKey;
                this.matchType = model.matchType;
                this.matchValue = model.matchValue;
            } 

            /**
             * limitMode.
             */
            public Builder limitMode(String limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * limitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * limitValue.
             */
            public Builder limitValue(Integer limitValue) {
                this.limitValue = limitValue;
                return this;
            }

            /**
             * matchKey.
             */
            public Builder matchKey(String matchKey) {
                this.matchKey = matchKey;
                return this;
            }

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * matchValue.
             */
            public Builder matchValue(String matchValue) {
                this.matchValue = matchValue;
                return this;
            }

            public GlobalRules build() {
                return new GlobalRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiTokenRateLimitConfigPluginStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorLogs")
        private java.util.Map<String, String> errorLogs;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("serviceHealthy")
        private Boolean serviceHealthy;

        private AiTokenRateLimitConfigPluginStatus(Builder builder) {
            this.errorLogs = builder.errorLogs;
            this.pluginId = builder.pluginId;
            this.serviceHealthy = builder.serviceHealthy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiTokenRateLimitConfigPluginStatus create() {
            return builder().build();
        }

        /**
         * @return errorLogs
         */
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return serviceHealthy
         */
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

        public static final class Builder {
            private java.util.Map<String, String> errorLogs; 
            private String pluginId; 
            private Boolean serviceHealthy; 

            private Builder() {
            } 

            private Builder(AiTokenRateLimitConfigPluginStatus model) {
                this.errorLogs = model.errorLogs;
                this.pluginId = model.pluginId;
                this.serviceHealthy = model.serviceHealthy;
            } 

            /**
             * errorLogs.
             */
            public Builder errorLogs(java.util.Map<String, String> errorLogs) {
                this.errorLogs = errorLogs;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * serviceHealthy.
             */
            public Builder serviceHealthy(Boolean serviceHealthy) {
                this.serviceHealthy = serviceHealthy;
                return this;
            }

            public AiTokenRateLimitConfigPluginStatus build() {
                return new AiTokenRateLimitConfigPluginStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiTokenRateLimitConfigRedisConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("databaseNumber")
        private Integer databaseNumber;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private AiTokenRateLimitConfigRedisConfig(Builder builder) {
            this.databaseNumber = builder.databaseNumber;
            this.host = builder.host;
            this.password = builder.password;
            this.port = builder.port;
            this.timeout = builder.timeout;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiTokenRateLimitConfigRedisConfig create() {
            return builder().build();
        }

        /**
         * @return databaseNumber
         */
        public Integer getDatabaseNumber() {
            return this.databaseNumber;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private Integer databaseNumber; 
            private String host; 
            private String password; 
            private Integer port; 
            private Integer timeout; 
            private String username; 

            private Builder() {
            } 

            private Builder(AiTokenRateLimitConfigRedisConfig model) {
                this.databaseNumber = model.databaseNumber;
                this.host = model.host;
                this.password = model.password;
                this.port = model.port;
                this.timeout = model.timeout;
                this.username = model.username;
            } 

            /**
             * databaseNumber.
             */
            public Builder databaseNumber(Integer databaseNumber) {
                this.databaseNumber = databaseNumber;
                return this;
            }

            /**
             * host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
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
             * timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public AiTokenRateLimitConfigRedisConfig build() {
                return new AiTokenRateLimitConfigRedisConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limitMode")
        private String limitMode;

        @com.aliyun.core.annotation.NameInMap("limitType")
        private String limitType;

        @com.aliyun.core.annotation.NameInMap("limitValue")
        private Integer limitValue;

        @com.aliyun.core.annotation.NameInMap("matchKey")
        private String matchKey;

        @com.aliyun.core.annotation.NameInMap("matchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("matchValue")
        private String matchValue;

        private Rules(Builder builder) {
            this.limitMode = builder.limitMode;
            this.limitType = builder.limitType;
            this.limitValue = builder.limitValue;
            this.matchKey = builder.matchKey;
            this.matchType = builder.matchType;
            this.matchValue = builder.matchValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return limitMode
         */
        public String getLimitMode() {
            return this.limitMode;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        /**
         * @return limitValue
         */
        public Integer getLimitValue() {
            return this.limitValue;
        }

        /**
         * @return matchKey
         */
        public String getMatchKey() {
            return this.matchKey;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return matchValue
         */
        public String getMatchValue() {
            return this.matchValue;
        }

        public static final class Builder {
            private String limitMode; 
            private String limitType; 
            private Integer limitValue; 
            private String matchKey; 
            private String matchType; 
            private String matchValue; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.limitMode = model.limitMode;
                this.limitType = model.limitType;
                this.limitValue = model.limitValue;
                this.matchKey = model.matchKey;
                this.matchType = model.matchType;
                this.matchValue = model.matchValue;
            } 

            /**
             * limitMode.
             */
            public Builder limitMode(String limitMode) {
                this.limitMode = limitMode;
                return this;
            }

            /**
             * limitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * limitValue.
             */
            public Builder limitValue(Integer limitValue) {
                this.limitValue = limitValue;
                return this;
            }

            /**
             * matchKey.
             */
            public Builder matchKey(String matchKey) {
                this.matchKey = matchKey;
                return this;
            }

            /**
             * matchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * matchValue.
             */
            public Builder matchValue(String matchValue) {
                this.matchValue = matchValue;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiTokenRateLimitConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableGlobalRules")
        private Boolean enableGlobalRules;

        @com.aliyun.core.annotation.NameInMap("globalRules")
        private java.util.List<GlobalRules> globalRules;

        @com.aliyun.core.annotation.NameInMap("pluginStatus")
        private AiTokenRateLimitConfigPluginStatus pluginStatus;

        @com.aliyun.core.annotation.NameInMap("redisConfig")
        private AiTokenRateLimitConfigRedisConfig redisConfig;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List<Rules> rules;

        private AiTokenRateLimitConfig(Builder builder) {
            this.enableGlobalRules = builder.enableGlobalRules;
            this.globalRules = builder.globalRules;
            this.pluginStatus = builder.pluginStatus;
            this.redisConfig = builder.redisConfig;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiTokenRateLimitConfig create() {
            return builder().build();
        }

        /**
         * @return enableGlobalRules
         */
        public Boolean getEnableGlobalRules() {
            return this.enableGlobalRules;
        }

        /**
         * @return globalRules
         */
        public java.util.List<GlobalRules> getGlobalRules() {
            return this.globalRules;
        }

        /**
         * @return pluginStatus
         */
        public AiTokenRateLimitConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        /**
         * @return redisConfig
         */
        public AiTokenRateLimitConfigRedisConfig getRedisConfig() {
            return this.redisConfig;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Boolean enableGlobalRules; 
            private java.util.List<GlobalRules> globalRules; 
            private AiTokenRateLimitConfigPluginStatus pluginStatus; 
            private AiTokenRateLimitConfigRedisConfig redisConfig; 
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(AiTokenRateLimitConfig model) {
                this.enableGlobalRules = model.enableGlobalRules;
                this.globalRules = model.globalRules;
                this.pluginStatus = model.pluginStatus;
                this.redisConfig = model.redisConfig;
                this.rules = model.rules;
            } 

            /**
             * enableGlobalRules.
             */
            public Builder enableGlobalRules(Boolean enableGlobalRules) {
                this.enableGlobalRules = enableGlobalRules;
                return this;
            }

            /**
             * globalRules.
             */
            public Builder globalRules(java.util.List<GlobalRules> globalRules) {
                this.globalRules = globalRules;
                return this;
            }

            /**
             * pluginStatus.
             */
            public Builder pluginStatus(AiTokenRateLimitConfigPluginStatus pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            /**
             * redisConfig.
             */
            public Builder redisConfig(AiTokenRateLimitConfigRedisConfig redisConfig) {
                this.redisConfig = redisConfig;
                return this;
            }

            /**
             * rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public AiTokenRateLimitConfig build() {
                return new AiTokenRateLimitConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class EnableConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("toolCountThreshold")
        private Integer toolCountThreshold;

        private EnableConditions(Builder builder) {
            this.toolCountThreshold = builder.toolCountThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnableConditions create() {
            return builder().build();
        }

        /**
         * @return toolCountThreshold
         */
        public Integer getToolCountThreshold() {
            return this.toolCountThreshold;
        }

        public static final class Builder {
            private Integer toolCountThreshold; 

            private Builder() {
            } 

            private Builder(EnableConditions model) {
                this.toolCountThreshold = model.toolCountThreshold;
            } 

            /**
             * toolCountThreshold.
             */
            public Builder toolCountThreshold(Integer toolCountThreshold) {
                this.toolCountThreshold = toolCountThreshold;
                return this;
            }

            public EnableConditions build() {
                return new EnableConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiToolSelectionConfigPluginStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("errorLogs")
        private java.util.Map<String, String> errorLogs;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("serviceHealthy")
        private Boolean serviceHealthy;

        private AiToolSelectionConfigPluginStatus(Builder builder) {
            this.errorLogs = builder.errorLogs;
            this.pluginId = builder.pluginId;
            this.serviceHealthy = builder.serviceHealthy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiToolSelectionConfigPluginStatus create() {
            return builder().build();
        }

        /**
         * @return errorLogs
         */
        public java.util.Map<String, String> getErrorLogs() {
            return this.errorLogs;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return serviceHealthy
         */
        public Boolean getServiceHealthy() {
            return this.serviceHealthy;
        }

        public static final class Builder {
            private java.util.Map<String, String> errorLogs; 
            private String pluginId; 
            private Boolean serviceHealthy; 

            private Builder() {
            } 

            private Builder(AiToolSelectionConfigPluginStatus model) {
                this.errorLogs = model.errorLogs;
                this.pluginId = model.pluginId;
                this.serviceHealthy = model.serviceHealthy;
            } 

            /**
             * errorLogs.
             */
            public Builder errorLogs(java.util.Map<String, String> errorLogs) {
                this.errorLogs = errorLogs;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * serviceHealthy.
             */
            public Builder serviceHealthy(Boolean serviceHealthy) {
                this.serviceHealthy = serviceHealthy;
                return this;
            }

            public AiToolSelectionConfigPluginStatus build() {
                return new AiToolSelectionConfigPluginStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ContextSelection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Integer value;

        private ContextSelection(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContextSelection create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(ContextSelection model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public ContextSelection build() {
                return new ContextSelection(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ModelService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        private ModelService(Builder builder) {
            this.modelName = builder.modelName;
            this.serviceId = builder.serviceId;
            this.timeoutMillisecond = builder.timeoutMillisecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelService create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public static final class Builder {
            private String modelName; 
            private String serviceId; 
            private Integer timeoutMillisecond; 

            private Builder() {
            } 

            private Builder(ModelService model) {
                this.modelName = model.modelName;
                this.serviceId = model.serviceId;
                this.timeoutMillisecond = model.timeoutMillisecond;
            } 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
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
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            public ModelService build() {
                return new ModelService(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class PromptConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("customPrompt")
        private String customPrompt;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PromptConfig(Builder builder) {
            this.customPrompt = builder.customPrompt;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptConfig create() {
            return builder().build();
        }

        /**
         * @return customPrompt
         */
        public String getCustomPrompt() {
            return this.customPrompt;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String customPrompt; 
            private String type; 

            private Builder() {
            } 

            private Builder(PromptConfig model) {
                this.customPrompt = model.customPrompt;
                this.type = model.type;
            } 

            /**
             * customPrompt.
             */
            public Builder customPrompt(String customPrompt) {
                this.customPrompt = customPrompt;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PromptConfig build() {
                return new PromptConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class TriggerConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("messageCountThreshold")
        private Integer messageCountThreshold;

        private TriggerConditions(Builder builder) {
            this.messageCountThreshold = builder.messageCountThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TriggerConditions create() {
            return builder().build();
        }

        /**
         * @return messageCountThreshold
         */
        public Integer getMessageCountThreshold() {
            return this.messageCountThreshold;
        }

        public static final class Builder {
            private Integer messageCountThreshold; 

            private Builder() {
            } 

            private Builder(TriggerConditions model) {
                this.messageCountThreshold = model.messageCountThreshold;
            } 

            /**
             * messageCountThreshold.
             */
            public Builder messageCountThreshold(Integer messageCountThreshold) {
                this.messageCountThreshold = messageCountThreshold;
                return this;
            }

            public TriggerConditions build() {
                return new TriggerConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class QueryRewriting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contextSelection")
        private ContextSelection contextSelection;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("fallbackStrategy")
        private String fallbackStrategy;

        @com.aliyun.core.annotation.NameInMap("maxOutputTokens")
        private Integer maxOutputTokens;

        @com.aliyun.core.annotation.NameInMap("modelService")
        private ModelService modelService;

        @com.aliyun.core.annotation.NameInMap("promptConfig")
        private PromptConfig promptConfig;

        @com.aliyun.core.annotation.NameInMap("triggerConditions")
        private TriggerConditions triggerConditions;

        private QueryRewriting(Builder builder) {
            this.contextSelection = builder.contextSelection;
            this.enabled = builder.enabled;
            this.fallbackStrategy = builder.fallbackStrategy;
            this.maxOutputTokens = builder.maxOutputTokens;
            this.modelService = builder.modelService;
            this.promptConfig = builder.promptConfig;
            this.triggerConditions = builder.triggerConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryRewriting create() {
            return builder().build();
        }

        /**
         * @return contextSelection
         */
        public ContextSelection getContextSelection() {
            return this.contextSelection;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return fallbackStrategy
         */
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        /**
         * @return maxOutputTokens
         */
        public Integer getMaxOutputTokens() {
            return this.maxOutputTokens;
        }

        /**
         * @return modelService
         */
        public ModelService getModelService() {
            return this.modelService;
        }

        /**
         * @return promptConfig
         */
        public PromptConfig getPromptConfig() {
            return this.promptConfig;
        }

        /**
         * @return triggerConditions
         */
        public TriggerConditions getTriggerConditions() {
            return this.triggerConditions;
        }

        public static final class Builder {
            private ContextSelection contextSelection; 
            private Boolean enabled; 
            private String fallbackStrategy; 
            private Integer maxOutputTokens; 
            private ModelService modelService; 
            private PromptConfig promptConfig; 
            private TriggerConditions triggerConditions; 

            private Builder() {
            } 

            private Builder(QueryRewriting model) {
                this.contextSelection = model.contextSelection;
                this.enabled = model.enabled;
                this.fallbackStrategy = model.fallbackStrategy;
                this.maxOutputTokens = model.maxOutputTokens;
                this.modelService = model.modelService;
                this.promptConfig = model.promptConfig;
                this.triggerConditions = model.triggerConditions;
            } 

            /**
             * contextSelection.
             */
            public Builder contextSelection(ContextSelection contextSelection) {
                this.contextSelection = contextSelection;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * fallbackStrategy.
             */
            public Builder fallbackStrategy(String fallbackStrategy) {
                this.fallbackStrategy = fallbackStrategy;
                return this;
            }

            /**
             * maxOutputTokens.
             */
            public Builder maxOutputTokens(Integer maxOutputTokens) {
                this.maxOutputTokens = maxOutputTokens;
                return this;
            }

            /**
             * modelService.
             */
            public Builder modelService(ModelService modelService) {
                this.modelService = modelService;
                return this;
            }

            /**
             * promptConfig.
             */
            public Builder promptConfig(PromptConfig promptConfig) {
                this.promptConfig = promptConfig;
                return this;
            }

            /**
             * triggerConditions.
             */
            public Builder triggerConditions(TriggerConditions triggerConditions) {
                this.triggerConditions = triggerConditions;
                return this;
            }

            public QueryRewriting build() {
                return new QueryRewriting(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ToolRerankingModelService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        private ToolRerankingModelService(Builder builder) {
            this.modelName = builder.modelName;
            this.serviceId = builder.serviceId;
            this.timeoutMillisecond = builder.timeoutMillisecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolRerankingModelService create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public static final class Builder {
            private String modelName; 
            private String serviceId; 
            private Integer timeoutMillisecond; 

            private Builder() {
            } 

            private Builder(ToolRerankingModelService model) {
                this.modelName = model.modelName;
                this.serviceId = model.serviceId;
                this.timeoutMillisecond = model.timeoutMillisecond;
            } 

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
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
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            public ToolRerankingModelService build() {
                return new ToolRerankingModelService(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class ToolReranking extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fallbackStrategy")
        private String fallbackStrategy;

        @com.aliyun.core.annotation.NameInMap("filteringMethod")
        private String filteringMethod;

        @com.aliyun.core.annotation.NameInMap("modelService")
        private ToolRerankingModelService modelService;

        @com.aliyun.core.annotation.NameInMap("scoreThreshold")
        private Float scoreThreshold;

        @com.aliyun.core.annotation.NameInMap("topKPercent")
        private Integer topKPercent;

        @com.aliyun.core.annotation.NameInMap("topNCount")
        private Integer topNCount;

        private ToolReranking(Builder builder) {
            this.fallbackStrategy = builder.fallbackStrategy;
            this.filteringMethod = builder.filteringMethod;
            this.modelService = builder.modelService;
            this.scoreThreshold = builder.scoreThreshold;
            this.topKPercent = builder.topKPercent;
            this.topNCount = builder.topNCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolReranking create() {
            return builder().build();
        }

        /**
         * @return fallbackStrategy
         */
        public String getFallbackStrategy() {
            return this.fallbackStrategy;
        }

        /**
         * @return filteringMethod
         */
        public String getFilteringMethod() {
            return this.filteringMethod;
        }

        /**
         * @return modelService
         */
        public ToolRerankingModelService getModelService() {
            return this.modelService;
        }

        /**
         * @return scoreThreshold
         */
        public Float getScoreThreshold() {
            return this.scoreThreshold;
        }

        /**
         * @return topKPercent
         */
        public Integer getTopKPercent() {
            return this.topKPercent;
        }

        /**
         * @return topNCount
         */
        public Integer getTopNCount() {
            return this.topNCount;
        }

        public static final class Builder {
            private String fallbackStrategy; 
            private String filteringMethod; 
            private ToolRerankingModelService modelService; 
            private Float scoreThreshold; 
            private Integer topKPercent; 
            private Integer topNCount; 

            private Builder() {
            } 

            private Builder(ToolReranking model) {
                this.fallbackStrategy = model.fallbackStrategy;
                this.filteringMethod = model.filteringMethod;
                this.modelService = model.modelService;
                this.scoreThreshold = model.scoreThreshold;
                this.topKPercent = model.topKPercent;
                this.topNCount = model.topNCount;
            } 

            /**
             * fallbackStrategy.
             */
            public Builder fallbackStrategy(String fallbackStrategy) {
                this.fallbackStrategy = fallbackStrategy;
                return this;
            }

            /**
             * filteringMethod.
             */
            public Builder filteringMethod(String filteringMethod) {
                this.filteringMethod = filteringMethod;
                return this;
            }

            /**
             * modelService.
             */
            public Builder modelService(ToolRerankingModelService modelService) {
                this.modelService = modelService;
                return this;
            }

            /**
             * scoreThreshold.
             */
            public Builder scoreThreshold(Float scoreThreshold) {
                this.scoreThreshold = scoreThreshold;
                return this;
            }

            /**
             * topKPercent.
             */
            public Builder topKPercent(Integer topKPercent) {
                this.topKPercent = topKPercent;
                return this;
            }

            /**
             * topNCount.
             */
            public Builder topNCount(Integer topNCount) {
                this.topNCount = topNCount;
                return this;
            }

            public ToolReranking build() {
                return new ToolReranking(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class AiToolSelectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableConditions")
        private EnableConditions enableConditions;

        @com.aliyun.core.annotation.NameInMap("pluginStatus")
        private AiToolSelectionConfigPluginStatus pluginStatus;

        @com.aliyun.core.annotation.NameInMap("queryRewriting")
        private QueryRewriting queryRewriting;

        @com.aliyun.core.annotation.NameInMap("toolReranking")
        private ToolReranking toolReranking;

        private AiToolSelectionConfig(Builder builder) {
            this.enableConditions = builder.enableConditions;
            this.pluginStatus = builder.pluginStatus;
            this.queryRewriting = builder.queryRewriting;
            this.toolReranking = builder.toolReranking;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiToolSelectionConfig create() {
            return builder().build();
        }

        /**
         * @return enableConditions
         */
        public EnableConditions getEnableConditions() {
            return this.enableConditions;
        }

        /**
         * @return pluginStatus
         */
        public AiToolSelectionConfigPluginStatus getPluginStatus() {
            return this.pluginStatus;
        }

        /**
         * @return queryRewriting
         */
        public QueryRewriting getQueryRewriting() {
            return this.queryRewriting;
        }

        /**
         * @return toolReranking
         */
        public ToolReranking getToolReranking() {
            return this.toolReranking;
        }

        public static final class Builder {
            private EnableConditions enableConditions; 
            private AiToolSelectionConfigPluginStatus pluginStatus; 
            private QueryRewriting queryRewriting; 
            private ToolReranking toolReranking; 

            private Builder() {
            } 

            private Builder(AiToolSelectionConfig model) {
                this.enableConditions = model.enableConditions;
                this.pluginStatus = model.pluginStatus;
                this.queryRewriting = model.queryRewriting;
                this.toolReranking = model.toolReranking;
            } 

            /**
             * enableConditions.
             */
            public Builder enableConditions(EnableConditions enableConditions) {
                this.enableConditions = enableConditions;
                return this;
            }

            /**
             * pluginStatus.
             */
            public Builder pluginStatus(AiToolSelectionConfigPluginStatus pluginStatus) {
                this.pluginStatus = pluginStatus;
                return this;
            }

            /**
             * queryRewriting.
             */
            public Builder queryRewriting(QueryRewriting queryRewriting) {
                this.queryRewriting = queryRewriting;
                return this;
            }

            /**
             * toolReranking.
             */
            public Builder toolReranking(ToolReranking toolReranking) {
                this.toolReranking = toolReranking;
                return this;
            }

            public AiToolSelectionConfig build() {
                return new AiToolSelectionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class SemanticRouterConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
        private Integer timeoutMillisecond;

        private SemanticRouterConfig(Builder builder) {
            this.timeoutMillisecond = builder.timeoutMillisecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SemanticRouterConfig create() {
            return builder().build();
        }

        /**
         * @return timeoutMillisecond
         */
        public Integer getTimeoutMillisecond() {
            return this.timeoutMillisecond;
        }

        public static final class Builder {
            private Integer timeoutMillisecond; 

            private Builder() {
            } 

            private Builder(SemanticRouterConfig model) {
                this.timeoutMillisecond = model.timeoutMillisecond;
            } 

            /**
             * timeoutMillisecond.
             */
            public Builder timeoutMillisecond(Integer timeoutMillisecond) {
                this.timeoutMillisecond = timeoutMillisecond;
                return this;
            }

            public SemanticRouterConfig build() {
                return new SemanticRouterConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateHttpApiRouteRequest} extends {@link TeaModel}
     *
     * <p>UpdateHttpApiRouteRequest</p>
     */
    public static class PolicyConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aiCacheConfig")
        private AiCacheConfig aiCacheConfig;

        @com.aliyun.core.annotation.NameInMap("aiFallbackConfig")
        private AiFallbackConfig aiFallbackConfig;

        @com.aliyun.core.annotation.NameInMap("aiNetworkSearchConfig")
        private AiNetworkSearchConfig aiNetworkSearchConfig;

        @com.aliyun.core.annotation.NameInMap("aiSecurityGuardConfig")
        private AiSecurityGuardConfig aiSecurityGuardConfig;

        @com.aliyun.core.annotation.NameInMap("aiStatisticsConfig")
        private AiStatisticsConfig aiStatisticsConfig;

        @com.aliyun.core.annotation.NameInMap("aiTokenRateLimitConfig")
        private AiTokenRateLimitConfig aiTokenRateLimitConfig;

        @com.aliyun.core.annotation.NameInMap("aiToolSelectionConfig")
        private AiToolSelectionConfig aiToolSelectionConfig;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("semanticRouterConfig")
        private SemanticRouterConfig semanticRouterConfig;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PolicyConfigs(Builder builder) {
            this.aiCacheConfig = builder.aiCacheConfig;
            this.aiFallbackConfig = builder.aiFallbackConfig;
            this.aiNetworkSearchConfig = builder.aiNetworkSearchConfig;
            this.aiSecurityGuardConfig = builder.aiSecurityGuardConfig;
            this.aiStatisticsConfig = builder.aiStatisticsConfig;
            this.aiTokenRateLimitConfig = builder.aiTokenRateLimitConfig;
            this.aiToolSelectionConfig = builder.aiToolSelectionConfig;
            this.enable = builder.enable;
            this.semanticRouterConfig = builder.semanticRouterConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyConfigs create() {
            return builder().build();
        }

        /**
         * @return aiCacheConfig
         */
        public AiCacheConfig getAiCacheConfig() {
            return this.aiCacheConfig;
        }

        /**
         * @return aiFallbackConfig
         */
        public AiFallbackConfig getAiFallbackConfig() {
            return this.aiFallbackConfig;
        }

        /**
         * @return aiNetworkSearchConfig
         */
        public AiNetworkSearchConfig getAiNetworkSearchConfig() {
            return this.aiNetworkSearchConfig;
        }

        /**
         * @return aiSecurityGuardConfig
         */
        public AiSecurityGuardConfig getAiSecurityGuardConfig() {
            return this.aiSecurityGuardConfig;
        }

        /**
         * @return aiStatisticsConfig
         */
        public AiStatisticsConfig getAiStatisticsConfig() {
            return this.aiStatisticsConfig;
        }

        /**
         * @return aiTokenRateLimitConfig
         */
        public AiTokenRateLimitConfig getAiTokenRateLimitConfig() {
            return this.aiTokenRateLimitConfig;
        }

        /**
         * @return aiToolSelectionConfig
         */
        public AiToolSelectionConfig getAiToolSelectionConfig() {
            return this.aiToolSelectionConfig;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return semanticRouterConfig
         */
        public SemanticRouterConfig getSemanticRouterConfig() {
            return this.semanticRouterConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private AiCacheConfig aiCacheConfig; 
            private AiFallbackConfig aiFallbackConfig; 
            private AiNetworkSearchConfig aiNetworkSearchConfig; 
            private AiSecurityGuardConfig aiSecurityGuardConfig; 
            private AiStatisticsConfig aiStatisticsConfig; 
            private AiTokenRateLimitConfig aiTokenRateLimitConfig; 
            private AiToolSelectionConfig aiToolSelectionConfig; 
            private Boolean enable; 
            private SemanticRouterConfig semanticRouterConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(PolicyConfigs model) {
                this.aiCacheConfig = model.aiCacheConfig;
                this.aiFallbackConfig = model.aiFallbackConfig;
                this.aiNetworkSearchConfig = model.aiNetworkSearchConfig;
                this.aiSecurityGuardConfig = model.aiSecurityGuardConfig;
                this.aiStatisticsConfig = model.aiStatisticsConfig;
                this.aiTokenRateLimitConfig = model.aiTokenRateLimitConfig;
                this.aiToolSelectionConfig = model.aiToolSelectionConfig;
                this.enable = model.enable;
                this.semanticRouterConfig = model.semanticRouterConfig;
                this.type = model.type;
            } 

            /**
             * aiCacheConfig.
             */
            public Builder aiCacheConfig(AiCacheConfig aiCacheConfig) {
                this.aiCacheConfig = aiCacheConfig;
                return this;
            }

            /**
             * aiFallbackConfig.
             */
            public Builder aiFallbackConfig(AiFallbackConfig aiFallbackConfig) {
                this.aiFallbackConfig = aiFallbackConfig;
                return this;
            }

            /**
             * aiNetworkSearchConfig.
             */
            public Builder aiNetworkSearchConfig(AiNetworkSearchConfig aiNetworkSearchConfig) {
                this.aiNetworkSearchConfig = aiNetworkSearchConfig;
                return this;
            }

            /**
             * aiSecurityGuardConfig.
             */
            public Builder aiSecurityGuardConfig(AiSecurityGuardConfig aiSecurityGuardConfig) {
                this.aiSecurityGuardConfig = aiSecurityGuardConfig;
                return this;
            }

            /**
             * aiStatisticsConfig.
             */
            public Builder aiStatisticsConfig(AiStatisticsConfig aiStatisticsConfig) {
                this.aiStatisticsConfig = aiStatisticsConfig;
                return this;
            }

            /**
             * aiTokenRateLimitConfig.
             */
            public Builder aiTokenRateLimitConfig(AiTokenRateLimitConfig aiTokenRateLimitConfig) {
                this.aiTokenRateLimitConfig = aiTokenRateLimitConfig;
                return this;
            }

            /**
             * aiToolSelectionConfig.
             */
            public Builder aiToolSelectionConfig(AiToolSelectionConfig aiToolSelectionConfig) {
                this.aiToolSelectionConfig = aiToolSelectionConfig;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * semanticRouterConfig.
             */
            public Builder semanticRouterConfig(SemanticRouterConfig semanticRouterConfig) {
                this.semanticRouterConfig = semanticRouterConfig;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PolicyConfigs build() {
                return new PolicyConfigs(this);
            } 

        } 

    }
}
