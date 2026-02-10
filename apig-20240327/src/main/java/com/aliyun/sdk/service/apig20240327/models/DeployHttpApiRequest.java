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
    @com.aliyun.core.annotation.NameInMap("httpApiConfig")
    @Deprecated
    private HttpApiConfig httpApiConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("restApiConfig")
    private RestApiConfig restApiConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("routeId")
    private String routeId;

    private DeployHttpApiRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.httpApiConfig = builder.httpApiConfig;
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
     * @return httpApiConfig
     */
    public HttpApiConfig getHttpApiConfig() {
        return this.httpApiConfig;
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
        private HttpApiConfig httpApiConfig; 
        private RestApiConfig restApiConfig; 
        private String routeId; 

        private Builder() {
            super();
        } 

        private Builder(DeployHttpApiRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.httpApiConfig = request.httpApiConfig;
            this.restApiConfig = request.restApiConfig;
            this.routeId = request.routeId;
        } 

        /**
         * <p>HTTP API ID.</p>
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
         * <p>httpApiConfig</p>
         */
        public Builder httpApiConfig(HttpApiConfig httpApiConfig) {
            this.putBodyParameter("httpApiConfig", httpApiConfig);
            this.httpApiConfig = httpApiConfig;
            return this;
        }

        /**
         * <p>The REST API deployment configuration. This parameter is required when you publish a REST API.</p>
         */
        public Builder restApiConfig(RestApiConfig restApiConfig) {
            this.putBodyParameter("restApiConfig", restApiConfig);
            this.restApiConfig = restApiConfig;
            return this;
        }

        /**
         * <p>The route ID. You must specify this parameter when you publish an HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cr82undlhtgrl***</p>
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
    public static class HttpApiConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("routeIds")
        private java.util.List<String> routeIds;

        private HttpApiConfig(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.routeIds = builder.routeIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpApiConfig create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return routeIds
         */
        public java.util.List<String> getRouteIds() {
            return this.routeIds;
        }

        public static final class Builder {
            private String gatewayId; 
            private java.util.List<String> routeIds; 

            private Builder() {
            } 

            private Builder(HttpApiConfig model) {
                this.gatewayId = model.gatewayId;
                this.routeIds = model.routeIds;
            } 

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-csrhgfmm1hknf0hu6o3g</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>routeIds</p>
             */
            public Builder routeIds(java.util.List<String> routeIds) {
                this.routeIds = routeIds;
                return this;
            }

            public HttpApiConfig build() {
                return new HttpApiConfig(this);
            } 

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

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.match = model.match;
                this.port = model.port;
                this.protocol = model.protocol;
                this.serviceId = model.serviceId;
                this.version = model.version;
                this.weight = model.weight;
            } 

            /**
             * <p>The matching condition configurations related to API publishing.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;change_order_revision&quot;:&quot;3.657.33_fc-hz-yunqi.1662568293908382_faas-eerouter&quot;}</p>
             */
            public Builder match(HttpApiBackendMatchConditions match) {
                this.match = match;
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
             * <p>The service protocol. Valid values:</p>
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
             * <p>The version of the microservice.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The weight. Valid values: [1,100]. This parameter is valid only in proportional routing.</p>
             * 
             * <strong>example:</strong>
             * <p>49</p>
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
        @Deprecated
        private String backendScene;

        @com.aliyun.core.annotation.NameInMap("customDomainIds")
        private java.util.List<String> customDomainIds;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        @Deprecated
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("serviceConfigs")
        @Deprecated
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

            private Builder() {
            } 

            private Builder(Environment model) {
                this.backendScene = model.backendScene;
                this.customDomainIds = model.customDomainIds;
                this.environmentId = model.environmentId;
                this.serviceConfigs = model.serviceConfigs;
            } 

            /**
             * <p>The publishing scenario.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SingleService</li>
             * <li>MultiServiceByRatio</li>
             * <li>MultiServiceByContent</li>
             * <li>Mock</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SingleService</p>
             */
            public Builder backendScene(String backendScene) {
                this.backendScene = backendScene;
                return this;
            }

            /**
             * <p>The custom domain names.</p>
             */
            public Builder customDomainIds(java.util.List<String> customDomainIds) {
                this.customDomainIds = customDomainIds;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-cpqnr6tlhtgubc***</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The configurations of existing services. For single-service publishing, only one entry is allowed. For other scenarios, multiple entries are allowed.</p>
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
    public static class OperationDeployments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("operationId")
        private String operationId;

        private OperationDeployments(Builder builder) {
            this.action = builder.action;
            this.operationId = builder.operationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationDeployments create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        public static final class Builder {
            private String action; 
            private String operationId; 

            private Builder() {
            } 

            private Builder(OperationDeployments model) {
                this.action = model.action;
                this.operationId = model.operationId;
            } 

            /**
             * action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * operationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            public OperationDeployments build() {
                return new OperationDeployments(this);
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

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("operationDeployments")
        private java.util.List<OperationDeployments> operationDeployments;

        @com.aliyun.core.annotation.NameInMap("operationIds")
        @Deprecated
        private java.util.List<String> operationIds;

        @com.aliyun.core.annotation.NameInMap("revisionId")
        private String revisionId;

        private RestApiConfig(Builder builder) {
            this.description = builder.description;
            this.environment = builder.environment;
            this.gatewayId = builder.gatewayId;
            this.operationDeployments = builder.operationDeployments;
            this.operationIds = builder.operationIds;
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
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return operationDeployments
         */
        public java.util.List<OperationDeployments> getOperationDeployments() {
            return this.operationDeployments;
        }

        /**
         * @return operationIds
         */
        public java.util.List<String> getOperationIds() {
            return this.operationIds;
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
            private String gatewayId; 
            private java.util.List<OperationDeployments> operationDeployments; 
            private java.util.List<String> operationIds; 
            private String revisionId; 

            private Builder() {
            } 

            private Builder(RestApiConfig model) {
                this.description = model.description;
                this.environment = model.environment;
                this.gatewayId = model.gatewayId;
                this.operationDeployments = model.operationDeployments;
                this.operationIds = model.operationIds;
                this.revisionId = model.revisionId;
            } 

            /**
             * <p>The publish description.</p>
             * 
             * <strong>example:</strong>
             * <p>The user service API</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment configurations.</p>
             */
            public Builder environment(Environment environment) {
                this.environment = environment;
                return this;
            }

            /**
             * <p>The gateway ID.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-cvn2u46m1hkun04oll8g</p>
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * operationDeployments.
             */
            public Builder operationDeployments(java.util.List<OperationDeployments> operationDeployments) {
                this.operationDeployments = operationDeployments;
                return this;
            }

            /**
             * <p>operationIds</p>
             */
            public Builder operationIds(java.util.List<String> operationIds) {
                this.operationIds = operationIds;
                return this;
            }

            /**
             * <p>The historical version of the API. If you specify this parameter, the corresponding version of the API is published.</p>
             * 
             * <strong>example:</strong>
             * <p>apr-xxx</p>
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
