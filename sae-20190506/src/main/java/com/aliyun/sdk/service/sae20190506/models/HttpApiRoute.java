// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link HttpApiRoute} extends {@link TeaModel}
 *
 * <p>HttpApiRoute</p>
 */
public class HttpApiRoute extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.NameInMap("DeployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<Domains> domains;

    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("HttpApiId")
    private String httpApiId;

    @com.aliyun.core.annotation.NameInMap("HttpApiName")
    private String httpApiName;

    @com.aliyun.core.annotation.NameInMap("HttpApiType")
    private String httpApiType;

    @com.aliyun.core.annotation.NameInMap("IngressId")
    private Long ingressId;

    @com.aliyun.core.annotation.NameInMap("NacosInstanceId")
    private String nacosInstanceId;

    @com.aliyun.core.annotation.NameInMap("NacosNamespaceId")
    private String nacosNamespaceId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.NameInMap("Policies")
    private Policies policies;

    @com.aliyun.core.annotation.NameInMap("Predicates")
    private Predicates predicates;

    @com.aliyun.core.annotation.NameInMap("RouteId")
    private String routeId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List<Services> services;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private HttpApiRoute(Builder builder) {
        this.addressType = builder.addressType;
        this.deployStatus = builder.deployStatus;
        this.destinationType = builder.destinationType;
        this.domains = builder.domains;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.httpApiId = builder.httpApiId;
        this.httpApiName = builder.httpApiName;
        this.httpApiType = builder.httpApiType;
        this.ingressId = builder.ingressId;
        this.nacosInstanceId = builder.nacosInstanceId;
        this.nacosNamespaceId = builder.nacosNamespaceId;
        this.name = builder.name;
        this.namespaceId = builder.namespaceId;
        this.policies = builder.policies;
        this.predicates = builder.predicates;
        this.routeId = builder.routeId;
        this.services = builder.services;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiRoute create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return domains
     */
    public java.util.List<Domains> getDomains() {
        return this.domains;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return httpApiName
     */
    public String getHttpApiName() {
        return this.httpApiName;
    }

    /**
     * @return httpApiType
     */
    public String getHttpApiType() {
        return this.httpApiType;
    }

    /**
     * @return ingressId
     */
    public Long getIngressId() {
        return this.ingressId;
    }

    /**
     * @return nacosInstanceId
     */
    public String getNacosInstanceId() {
        return this.nacosInstanceId;
    }

    /**
     * @return nacosNamespaceId
     */
    public String getNacosNamespaceId() {
        return this.nacosNamespaceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return policies
     */
    public Policies getPolicies() {
        return this.policies;
    }

    /**
     * @return predicates
     */
    public Predicates getPredicates() {
        return this.predicates;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    /**
     * @return services
     */
    public java.util.List<Services> getServices() {
        return this.services;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder {
        private String addressType; 
        private String deployStatus; 
        private String destinationType; 
        private java.util.List<Domains> domains; 
        private String environmentId; 
        private String gatewayId; 
        private String httpApiId; 
        private String httpApiName; 
        private String httpApiType; 
        private Long ingressId; 
        private String nacosInstanceId; 
        private String nacosNamespaceId; 
        private String name; 
        private String namespaceId; 
        private Policies policies; 
        private Predicates predicates; 
        private String routeId; 
        private java.util.List<Services> services; 
        private String sourceType; 

        private Builder() {
        } 

        private Builder(HttpApiRoute model) {
            this.addressType = model.addressType;
            this.deployStatus = model.deployStatus;
            this.destinationType = model.destinationType;
            this.domains = model.domains;
            this.environmentId = model.environmentId;
            this.gatewayId = model.gatewayId;
            this.httpApiId = model.httpApiId;
            this.httpApiName = model.httpApiName;
            this.httpApiType = model.httpApiType;
            this.ingressId = model.ingressId;
            this.nacosInstanceId = model.nacosInstanceId;
            this.nacosNamespaceId = model.nacosNamespaceId;
            this.name = model.name;
            this.namespaceId = model.namespaceId;
            this.policies = model.policies;
            this.predicates = model.predicates;
            this.routeId = model.routeId;
            this.services = model.services;
            this.sourceType = model.sourceType;
        } 

        /**
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
            return this;
        }

        /**
         * DeployStatus.
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * DestinationType.
         */
        public Builder destinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        /**
         * Domains.
         */
        public Builder domains(java.util.List<Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * EnvironmentId.
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * HttpApiId.
         */
        public Builder httpApiId(String httpApiId) {
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * HttpApiName.
         */
        public Builder httpApiName(String httpApiName) {
            this.httpApiName = httpApiName;
            return this;
        }

        /**
         * HttpApiType.
         */
        public Builder httpApiType(String httpApiType) {
            this.httpApiType = httpApiType;
            return this;
        }

        /**
         * IngressId.
         */
        public Builder ingressId(Long ingressId) {
            this.ingressId = ingressId;
            return this;
        }

        /**
         * NacosInstanceId.
         */
        public Builder nacosInstanceId(String nacosInstanceId) {
            this.nacosInstanceId = nacosInstanceId;
            return this;
        }

        /**
         * NacosNamespaceId.
         */
        public Builder nacosNamespaceId(String nacosNamespaceId) {
            this.nacosNamespaceId = nacosNamespaceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Policies.
         */
        public Builder policies(Policies policies) {
            this.policies = policies;
            return this;
        }

        /**
         * Predicates.
         */
        public Builder predicates(Predicates predicates) {
            this.predicates = predicates;
            return this;
        }

        /**
         * RouteId.
         */
        public Builder routeId(String routeId) {
            this.routeId = routeId;
            return this;
        }

        /**
         * Services.
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public HttpApiRoute build() {
            return new HttpApiRoute(this);
        } 

    } 

    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        private Domains(Builder builder) {
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String domainId; 
            private String domainName; 

            private Builder() {
            } 

            private Builder(Domains model) {
                this.domainId = model.domainId;
                this.domainName = model.domainName;
            } 

            /**
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class Destinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Long servicePort;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        private Destinations(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.servicePort = builder.servicePort;
            this.serviceProtocol = builder.serviceProtocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destinations create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePort
         */
        public Long getServicePort() {
            return this.servicePort;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String serviceId; 
            private String serviceName; 
            private Long servicePort; 
            private String serviceProtocol; 

            private Builder() {
            } 

            private Builder(Destinations model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.servicePort = model.servicePort;
                this.serviceProtocol = model.serviceProtocol;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServicePort.
             */
            public Builder servicePort(Long servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * ServiceProtocol.
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            public Destinations build() {
                return new Destinations(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class Fallback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Destinations")
        private java.util.List<Destinations> destinations;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private Fallback(Builder builder) {
            this.destinations = builder.destinations;
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fallback create() {
            return builder().build();
        }

        /**
         * @return destinations
         */
        public java.util.List<Destinations> getDestinations() {
            return this.destinations;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private java.util.List<Destinations> destinations; 
            private Boolean enable; 

            private Builder() {
            } 

            private Builder(Fallback model) {
                this.destinations = model.destinations;
                this.enable = model.enable;
            } 

            /**
             * Destinations.
             */
            public Builder destinations(java.util.List<Destinations> destinations) {
                this.destinations = destinations;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public Fallback build() {
                return new Fallback(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class Retry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attempts")
        private Long attempts;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("HttpCodes")
        private java.util.List<String> httpCodes;

        @com.aliyun.core.annotation.NameInMap("RetryOn")
        private java.util.List<String> retryOn;

        private Retry(Builder builder) {
            this.attempts = builder.attempts;
            this.enable = builder.enable;
            this.httpCodes = builder.httpCodes;
            this.retryOn = builder.retryOn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Retry create() {
            return builder().build();
        }

        /**
         * @return attempts
         */
        public Long getAttempts() {
            return this.attempts;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return httpCodes
         */
        public java.util.List<String> getHttpCodes() {
            return this.httpCodes;
        }

        /**
         * @return retryOn
         */
        public java.util.List<String> getRetryOn() {
            return this.retryOn;
        }

        public static final class Builder {
            private Long attempts; 
            private Boolean enable; 
            private java.util.List<String> httpCodes; 
            private java.util.List<String> retryOn; 

            private Builder() {
            } 

            private Builder(Retry model) {
                this.attempts = model.attempts;
                this.enable = model.enable;
                this.httpCodes = model.httpCodes;
                this.retryOn = model.retryOn;
            } 

            /**
             * Attempts.
             */
            public Builder attempts(Long attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * HttpCodes.
             */
            public Builder httpCodes(java.util.List<String> httpCodes) {
                this.httpCodes = httpCodes;
                return this;
            }

            /**
             * RetryOn.
             */
            public Builder retryOn(java.util.List<String> retryOn) {
                this.retryOn = retryOn;
                return this;
            }

            public Retry build() {
                return new Retry(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class Timeout extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
        private Long unitNum;

        private Timeout(Builder builder) {
            this.enable = builder.enable;
            this.timeUnit = builder.timeUnit;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timeout create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return unitNum
         */
        public Long getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private Boolean enable; 
            private String timeUnit; 
            private Long unitNum; 

            private Builder() {
            } 

            private Builder(Timeout model) {
                this.enable = model.enable;
                this.timeUnit = model.timeUnit;
                this.unitNum = model.unitNum;
            } 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * TimeUnit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * UnitNum.
             */
            public Builder unitNum(Long unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            public Timeout build() {
                return new Timeout(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fallback")
        private Fallback fallback;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Retry retry;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Timeout timeout;

        private Policies(Builder builder) {
            this.fallback = builder.fallback;
            this.retry = builder.retry;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return fallback
         */
        public Fallback getFallback() {
            return this.fallback;
        }

        /**
         * @return retry
         */
        public Retry getRetry() {
            return this.retry;
        }

        /**
         * @return timeout
         */
        public Timeout getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Fallback fallback; 
            private Retry retry; 
            private Timeout timeout; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.fallback = model.fallback;
                this.retry = model.retry;
                this.timeout = model.timeout;
            } 

            /**
             * Fallback.
             */
            public Builder fallback(Fallback fallback) {
                this.fallback = fallback;
                return this;
            }

            /**
             * Retry.
             */
            public Builder retry(Retry retry) {
                this.retry = retry;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Timeout timeout) {
                this.timeout = timeout;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class HeaderPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HeaderPredicates(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderPredicates create() {
            return builder().build();
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(HeaderPredicates model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderPredicates build() {
                return new HeaderPredicates(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class PathPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoreCase")
        private Boolean ignoreCase;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PathPredicates(Builder builder) {
            this.ignoreCase = builder.ignoreCase;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathPredicates create() {
            return builder().build();
        }

        /**
         * @return ignoreCase
         */
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean ignoreCase; 
            private String path; 
            private String type; 

            private Builder() {
            } 

            private Builder(PathPredicates model) {
                this.ignoreCase = model.ignoreCase;
                this.path = model.path;
                this.type = model.type;
            } 

            /**
             * IgnoreCase.
             */
            public Builder ignoreCase(Boolean ignoreCase) {
                this.ignoreCase = ignoreCase;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PathPredicates build() {
                return new PathPredicates(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class QueryPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryPredicates(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryPredicates create() {
            return builder().build();
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(QueryPredicates model) {
                this.name = model.name;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryPredicates build() {
                return new QueryPredicates(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class Predicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderPredicates")
        private java.util.List<HeaderPredicates> headerPredicates;

        @com.aliyun.core.annotation.NameInMap("MethodPredicates")
        private java.util.List<String> methodPredicates;

        @com.aliyun.core.annotation.NameInMap("PathPredicates")
        private PathPredicates pathPredicates;

        @com.aliyun.core.annotation.NameInMap("QueryPredicates")
        private java.util.List<QueryPredicates> queryPredicates;

        private Predicates(Builder builder) {
            this.headerPredicates = builder.headerPredicates;
            this.methodPredicates = builder.methodPredicates;
            this.pathPredicates = builder.pathPredicates;
            this.queryPredicates = builder.queryPredicates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Predicates create() {
            return builder().build();
        }

        /**
         * @return headerPredicates
         */
        public java.util.List<HeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        /**
         * @return methodPredicates
         */
        public java.util.List<String> getMethodPredicates() {
            return this.methodPredicates;
        }

        /**
         * @return pathPredicates
         */
        public PathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        /**
         * @return queryPredicates
         */
        public java.util.List<QueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

        public static final class Builder {
            private java.util.List<HeaderPredicates> headerPredicates; 
            private java.util.List<String> methodPredicates; 
            private PathPredicates pathPredicates; 
            private java.util.List<QueryPredicates> queryPredicates; 

            private Builder() {
            } 

            private Builder(Predicates model) {
                this.headerPredicates = model.headerPredicates;
                this.methodPredicates = model.methodPredicates;
                this.pathPredicates = model.pathPredicates;
                this.queryPredicates = model.queryPredicates;
            } 

            /**
             * HeaderPredicates.
             */
            public Builder headerPredicates(java.util.List<HeaderPredicates> headerPredicates) {
                this.headerPredicates = headerPredicates;
                return this;
            }

            /**
             * MethodPredicates.
             */
            public Builder methodPredicates(java.util.List<String> methodPredicates) {
                this.methodPredicates = methodPredicates;
                return this;
            }

            /**
             * PathPredicates.
             */
            public Builder pathPredicates(PathPredicates pathPredicates) {
                this.pathPredicates = pathPredicates;
                return this;
            }

            /**
             * QueryPredicates.
             */
            public Builder queryPredicates(java.util.List<QueryPredicates> queryPredicates) {
                this.queryPredicates = queryPredicates;
                return this;
            }

            public Predicates build() {
                return new Predicates(this);
            } 

        } 

    }
    /**
     * 
     * {@link HttpApiRoute} extends {@link TeaModel}
     *
     * <p>HttpApiRoute</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Long servicePort;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @com.aliyun.core.annotation.NameInMap("ServiceWeight")
        private Long serviceWeight;

        private Services(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.servicePort = builder.servicePort;
            this.serviceProtocol = builder.serviceProtocol;
            this.serviceWeight = builder.serviceWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return servicePort
         */
        public Long getServicePort() {
            return this.servicePort;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        /**
         * @return serviceWeight
         */
        public Long getServiceWeight() {
            return this.serviceWeight;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String serviceId; 
            private String serviceName; 
            private Long servicePort; 
            private String serviceProtocol; 
            private Long serviceWeight; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.servicePort = model.servicePort;
                this.serviceProtocol = model.serviceProtocol;
                this.serviceWeight = model.serviceWeight;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServicePort.
             */
            public Builder servicePort(Long servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * ServiceProtocol.
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * ServiceWeight.
             */
            public Builder serviceWeight(Long serviceWeight) {
                this.serviceWeight = serviceWeight;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
