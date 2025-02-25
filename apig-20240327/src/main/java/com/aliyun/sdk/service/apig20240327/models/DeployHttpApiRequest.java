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
 * {@link DeployHttpApiRequest} extends {@link RequestModel}
 *
 * <p>DeployHttpApiRequest</p>
 */
public class DeployHttpApiRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("restApiConfig")
    private RestApiConfig restApiConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    private DeployHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.restApiConfig = builder.restApiConfig;
        this.routeId = builder.routeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployHttpApiRequest create() {
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
     * @return restApiConfig
     */
    public RestApiConfig getRestApiConfig() {
        return this.restApiConfig;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    public static final class Builder extends Request.Builder<DeployHttpApiRequest, Builder> {
        private String httpApiId; 
        private RestApiConfig restApiConfig; 
        private String routeId; 

        private Builder() {
            super();
        } 

        private Builder(DeployHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.restApiConfig = request.restApiConfig;
            this.routeId = request.routeId;
        } 

        /**
         * <p>HTTP API ID。</p>
         * 
         * <strong>example:</strong>
         * <p>api-cr68g1dlhtgm31fb***</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * restApiConfig.
         */
        public Builder restApiConfig(RestApiConfig restApiConfig) {
            this.putBodyParameter("restApiConfig", restApiConfig);
            this.restApiConfig = restApiConfig;
            return this;
        }

        /**
         * routeId.
         */
        public Builder routeId(String routeId) {
            this.putBodyParameter("routeId", routeId);
            this.routeId = routeId;
            return this;
        }

        @Override
        public DeployHttpApiRequest build() {
            return new DeployHttpApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeployHttpApiRequest} extends {@link TeaModel}
     *
     * <p>DeployHttpApiRequest</p>
     */
    public static class ServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("match")
        private HttpApiBackendMatchConditions match;

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

        private ServiceConfigs(Builder builder) {
            this.match = builder.match;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.serviceId = builder.serviceId;
            this.version = builder.version;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public HttpApiBackendMatchConditions getMatch() {
            return this.match;
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
            private HttpApiBackendMatchConditions match; 
            private Integer port; 
            private String protocol; 
            private String serviceId; 
            private String version; 
            private Integer weight; 

            /**
             * match.
             */
            public Builder match(HttpApiBackendMatchConditions match) {
                this.match = match;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ServiceConfigs build() {
                return new ServiceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHttpApiRequest} extends {@link TeaModel}
     *
     * <p>DeployHttpApiRequest</p>
     */
    public static class Environment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("backendScene")
        private String backendScene;

        @com.aliyun.core.annotation.NameInMap("customDomainIds")
        private java.util.List<String> customDomainIds;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("serviceConfigs")
        private java.util.List<ServiceConfigs> serviceConfigs;

        private Environment(Builder builder) {
            this.backendScene = builder.backendScene;
            this.customDomainIds = builder.customDomainIds;
            this.environmentId = builder.environmentId;
            this.serviceConfigs = builder.serviceConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Environment create() {
            return builder().build();
        }

        /**
         * @return backendScene
         */
        public String getBackendScene() {
            return this.backendScene;
        }

        /**
         * @return customDomainIds
         */
        public java.util.List<String> getCustomDomainIds() {
            return this.customDomainIds;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return serviceConfigs
         */
        public java.util.List<ServiceConfigs> getServiceConfigs() {
            return this.serviceConfigs;
        }

        public static final class Builder {
            private String backendScene; 
            private java.util.List<String> customDomainIds; 
            private String environmentId; 
            private java.util.List<ServiceConfigs> serviceConfigs; 

            /**
             * backendScene.
             */
            public Builder backendScene(String backendScene) {
                this.backendScene = backendScene;
                return this;
            }

            /**
             * customDomainIds.
             */
            public Builder customDomainIds(java.util.List<String> customDomainIds) {
                this.customDomainIds = customDomainIds;
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
             * serviceConfigs.
             */
            public Builder serviceConfigs(java.util.List<ServiceConfigs> serviceConfigs) {
                this.serviceConfigs = serviceConfigs;
                return this;
            }

            public Environment build() {
                return new Environment(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeployHttpApiRequest} extends {@link TeaModel}
     *
     * <p>DeployHttpApiRequest</p>
     */
    public static class RestApiConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environment")
        private Environment environment;

        @com.aliyun.core.annotation.NameInMap("revisionId")
        private String revisionId;

        private RestApiConfig(Builder builder) {
            this.description = builder.description;
            this.environment = builder.environment;
            this.revisionId = builder.revisionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestApiConfig create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environment
         */
        public Environment getEnvironment() {
            return this.environment;
        }

        /**
         * @return revisionId
         */
        public String getRevisionId() {
            return this.revisionId;
        }

        public static final class Builder {
            private String description; 
            private Environment environment; 
            private String revisionId; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * environment.
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * revisionId.
             */
            public Builder revisionId(String revisionId) {
                this.revisionId = revisionId;
                return this;
            }

            public RestApiConfig build() {
                return new RestApiConfig(this);
            } 

        } 

    }
}
