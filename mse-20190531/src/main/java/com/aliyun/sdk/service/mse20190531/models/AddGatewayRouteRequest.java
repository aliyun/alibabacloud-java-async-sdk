// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link AddGatewayRouteRequest} extends {@link RequestModel}
 *
 * <p>AddGatewayRouteRequest</p>
 */
public class AddGatewayRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectResponseJSON")
    private DirectResponseJSON directResponseJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainId")
    private Long domainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainIdListJSON")
    private String domainIdListJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableWaf")
    @Deprecated
    private Boolean enableWaf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fallback")
    private Boolean fallback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallbackServices")
    private java.util.List<FallbackServices> fallbackServices;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policies")
    private String policies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Predicates")
    private Predicates predicates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedirectJSON")
    private RedirectJSON redirectJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteOrder")
    private Integer routeOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteType")
    private String routeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List<Services> services;

    private AddGatewayRouteRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.description = builder.description;
        this.destinationType = builder.destinationType;
        this.directResponseJSON = builder.directResponseJSON;
        this.domainId = builder.domainId;
        this.domainIdListJSON = builder.domainIdListJSON;
        this.enableWaf = builder.enableWaf;
        this.fallback = builder.fallback;
        this.fallbackServices = builder.fallbackServices;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.name = builder.name;
        this.policies = builder.policies;
        this.predicates = builder.predicates;
        this.redirectJSON = builder.redirectJSON;
        this.routeOrder = builder.routeOrder;
        this.routeType = builder.routeType;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewayRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return directResponseJSON
     */
    public DirectResponseJSON getDirectResponseJSON() {
        return this.directResponseJSON;
    }

    /**
     * @return domainId
     */
    public Long getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainIdListJSON
     */
    public String getDomainIdListJSON() {
        return this.domainIdListJSON;
    }

    /**
     * @return enableWaf
     */
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    /**
     * @return fallback
     */
    public Boolean getFallback() {
        return this.fallback;
    }

    /**
     * @return fallbackServices
     */
    public java.util.List<FallbackServices> getFallbackServices() {
        return this.fallbackServices;
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policies
     */
    public String getPolicies() {
        return this.policies;
    }

    /**
     * @return predicates
     */
    public Predicates getPredicates() {
        return this.predicates;
    }

    /**
     * @return redirectJSON
     */
    public RedirectJSON getRedirectJSON() {
        return this.redirectJSON;
    }

    /**
     * @return routeOrder
     */
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    /**
     * @return routeType
     */
    public String getRouteType() {
        return this.routeType;
    }

    /**
     * @return services
     */
    public java.util.List<Services> getServices() {
        return this.services;
    }

    public static final class Builder extends Request.Builder<AddGatewayRouteRequest, Builder> {
        private String acceptLanguage; 
        private String description; 
        private String destinationType; 
        private DirectResponseJSON directResponseJSON; 
        private Long domainId; 
        private String domainIdListJSON; 
        private Boolean enableWaf; 
        private Boolean fallback; 
        private java.util.List<FallbackServices> fallbackServices; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private String name; 
        private String policies; 
        private Predicates predicates; 
        private RedirectJSON redirectJSON; 
        private Integer routeOrder; 
        private String routeType; 
        private java.util.List<Services> services; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewayRouteRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.description = request.description;
            this.destinationType = request.destinationType;
            this.directResponseJSON = request.directResponseJSON;
            this.domainId = request.domainId;
            this.domainIdListJSON = request.domainIdListJSON;
            this.enableWaf = request.enableWaf;
            this.fallback = request.fallback;
            this.fallbackServices = request.fallbackServices;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.name = request.name;
            this.policies = request.policies;
            this.predicates = request.predicates;
            this.redirectJSON = request.redirectJSON;
            this.routeOrder = request.routeOrder;
            this.routeType = request.routeType;
            this.services = request.services;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The type of the destination service. Valid values:</p>
         * <ul>
         * <li>Single</li>
         * <li>Multiple</li>
         * <li>VersionOriented</li>
         * <li>Mock</li>
         * <li>Redirect</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Multiple</p>
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * <p>The mock response configuration.</p>
         */
        public Builder directResponseJSON(DirectResponseJSON directResponseJSON) {
            String directResponseJSONShrink = shrink(directResponseJSON, "DirectResponseJSON", "json");
            this.putQueryParameter("DirectResponseJSON", directResponseJSONShrink);
            this.directResponseJSON = directResponseJSON;
            return this;
        }

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder domainId(Long domainId) {
            this.putQueryParameter("DomainId", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The domain IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[0,94]</p>
         */
        public Builder domainIdListJSON(String domainIdListJSON) {
            this.putQueryParameter("DomainIdListJSON", domainIdListJSON);
            this.domainIdListJSON = domainIdListJSON;
            return this;
        }

        /**
         * <p>Specifies whether to activate Web Application Firewall (WAF).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableWaf(Boolean enableWaf) {
            this.putQueryParameter("EnableWaf", enableWaf);
            this.enableWaf = enableWaf;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Fallback service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fallback(Boolean fallback) {
            this.putQueryParameter("Fallback", fallback);
            this.fallback = fallback;
            return this;
        }

        /**
         * <p>The information about the Fallback service.</p>
         */
        public Builder fallbackServices(java.util.List<FallbackServices> fallbackServices) {
            String fallbackServicesShrink = shrink(fallbackServices, "FallbackServices", "json");
            this.putQueryParameter("FallbackServices", fallbackServicesShrink);
            this.fallbackServices = fallbackServices;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>526</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-492af9b04bb4474cae9d645be8*****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The name of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The routing policy in a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CORS&quot;:&quot;{&quot;allowMethods&quot;:&quot;GET,POST,PUT,DELETE,HEAD,OPTIONS,PATCH&quot;,&quot;allowHeaders&quot;:&quot;<em>&quot;,&quot;exposeHeaders&quot;:&quot;</em>&quot;,&quot;unitNum&quot;:12,&quot;allowCredentials&quot;:true,&quot;status&quot;:&quot;off&quot;,&quot;allowOrigins&quot;:&quot;*&quot;,&quot;timeUnit&quot;:&quot;h&quot;}&quot;,&quot;Timeout&quot;:&quot;{&quot;unitNum&quot;:10,&quot;timeUnit&quot;:&quot;s&quot;,&quot;status&quot;:&quot;off&quot;}&quot;,&quot;Retry&quot;:&quot;{&quot;attempts&quot;:2,&quot;retryOn&quot;:[&quot;5xx&quot;],&quot;status&quot;:&quot;off&quot;}&quot;,&quot;HTTPRewrite&quot;:&quot;{&quot;pathType&quot;:&quot;EQUAL&quot;,&quot;path&quot;:&quot;/o&quot;,&quot;status&quot;:&quot;off&quot;}&quot;,&quot;Waf&quot;:&quot;{&quot;enabled&quot;:false}&quot;,&quot;HeaderOp&quot;:&quot;{&quot;status&quot;:&quot;off&quot;,&quot;headerOpItems&quot;:[{&quot;directionType&quot;:&quot;Request&quot;,&quot;opType&quot;:&quot;Add&quot;,&quot;key&quot;:&quot;kkk&quot;,&quot;value&quot;:&quot;ll&quot;}]}&quot;}</p>
         */
        public Builder policies(String policies) {
            this.putQueryParameter("Policies", policies);
            this.policies = policies;
            return this;
        }

        /**
         * <p>The matching rule.</p>
         */
        public Builder predicates(Predicates predicates) {
            String predicatesShrink = shrink(predicates, "Predicates", "json");
            this.putQueryParameter("Predicates", predicatesShrink);
            this.predicates = predicates;
            return this;
        }

        /**
         * <p>The configuration of the redirection.</p>
         */
        public Builder redirectJSON(RedirectJSON redirectJSON) {
            String redirectJSONShrink = shrink(redirectJSON, "RedirectJSON", "json");
            this.putQueryParameter("RedirectJSON", redirectJSONShrink);
            this.redirectJSON = redirectJSON;
            return this;
        }

        /**
         * <p>The sequence number of the route. (A small value indicates a high priority.)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder routeOrder(Integer routeOrder) {
            this.putQueryParameter("RouteOrder", routeOrder);
            this.routeOrder = routeOrder;
            return this;
        }

        /**
         * <p>The route type. Valid values:</p>
         * <p>Op: Manage routes.</p>
         * 
         * <strong>example:</strong>
         * <p>Op</p>
         */
        public Builder routeType(String routeType) {
            this.putQueryParameter("RouteType", routeType);
            this.routeType = routeType;
            return this;
        }

        /**
         * <p>The list of services.</p>
         */
        public Builder services(java.util.List<Services> services) {
            String servicesShrink = shrink(services, "Services", "json");
            this.putQueryParameter("Services", servicesShrink);
            this.services = services;
            return this;
        }

        @Override
        public AddGatewayRouteRequest build() {
            return new AddGatewayRouteRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class DirectResponseJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("Code")
        private Long code;

        private DirectResponseJSON(Builder builder) {
            this.body = builder.body;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectResponseJSON create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        public static final class Builder {
            private String body; 
            private Long code; 

            private Builder() {
            } 

            private Builder(DirectResponseJSON model) {
                this.body = model.body;
                this.code = model.code;
            } 

            /**
             * <p>The mock return value.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The mock return code.</p>
             * 
             * <strong>example:</strong>
             * <p>403</p>
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            public DirectResponseJSON build() {
                return new DirectResponseJSON(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class FallbackServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgreementType")
        private String agreementType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private FallbackServices(Builder builder) {
            this.agreementType = builder.agreementType;
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.percent = builder.percent;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FallbackServices create() {
            return builder().build();
        }

        /**
         * @return agreementType
         */
        public String getAgreementType() {
            return this.agreementType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String agreementType; 
            private String groupName; 
            private String name; 
            private String namespace; 
            private Integer percent; 
            private Long serviceId; 
            private Integer servicePort; 
            private String sourceType; 
            private String version; 

            private Builder() {
            } 

            private Builder(FallbackServices model) {
                this.agreementType = model.agreementType;
                this.groupName = model.groupName;
                this.name = model.name;
                this.namespace = model.namespace;
                this.percent = model.percent;
                this.serviceId = model.serviceId;
                this.servicePort = model.servicePort;
                this.sourceType = model.sourceType;
                this.version = model.version;
            } 

            /**
             * <p>The type of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>DUBBO</p>
             */
            public Builder agreementType(String agreementType) {
                this.agreementType = agreementType;
                return this;
            }

            /**
             * <p>The name of the group to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The weight in the form of a percentage value.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>353</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service port number.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The version of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public FallbackServices build() {
                return new FallbackServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class HeaderPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HeaderPredicates(Builder builder) {
            this.key = builder.key;
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
         * @return key
         */
        public String getKey() {
            return this.key;
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
            private String key; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(HeaderPredicates model) {
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The key of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>debug</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The matching type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
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
             * <p>Specifies whether to ignore case sensitivity.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreCase(Boolean ignoreCase) {
                this.ignoreCase = ignoreCase;
                return this;
            }

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The route matching type. Valid values:</p>
             * <ul>
             * <li>PRE: prefix matching</li>
             * <li>EQUAL: exact matching</li>
             * <li>ERGULAR: regular expression matching</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
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
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class QueryPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryPredicates(Builder builder) {
            this.key = builder.key;
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
         * @return key
         */
        public String getKey() {
            return this.key;
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
            private String key; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(QueryPredicates model) {
                this.key = model.key;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>userid</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The matching type.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
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
             * <p>The information about header matching.</p>
             */
            public Builder headerPredicates(java.util.List<HeaderPredicates> headerPredicates) {
                this.headerPredicates = headerPredicates;
                return this;
            }

            /**
             * <p>The information about method matching.</p>
             */
            public Builder methodPredicates(java.util.List<String> methodPredicates) {
                this.methodPredicates = methodPredicates;
                return this;
            }

            /**
             * <p>The information about route matching.</p>
             */
            public Builder pathPredicates(PathPredicates pathPredicates) {
                this.pathPredicates = pathPredicates;
                return this;
            }

            /**
             * <p>The information about URL parameter matching.</p>
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
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class RedirectJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private RedirectJSON(Builder builder) {
            this.code = builder.code;
            this.host = builder.host;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedirectJSON create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private Integer code; 
            private String host; 
            private String path; 

            private Builder() {
            } 

            private Builder(RedirectJSON model) {
                this.code = model.code;
                this.host = model.host;
                this.path = model.path;
            } 

            /**
             * <p>The status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>302</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The hostname to be redirected to.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The path to be redirected to.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public RedirectJSON build() {
                return new RedirectJSON(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class ParamMapsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtractKey")
        private String extractKey;

        @com.aliyun.core.annotation.NameInMap("ExtractKeySpec")
        private String extractKeySpec;

        @com.aliyun.core.annotation.NameInMap("MappingType")
        private String mappingType;

        private ParamMapsList(Builder builder) {
            this.extractKey = builder.extractKey;
            this.extractKeySpec = builder.extractKeySpec;
            this.mappingType = builder.mappingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamMapsList create() {
            return builder().build();
        }

        /**
         * @return extractKey
         */
        public String getExtractKey() {
            return this.extractKey;
        }

        /**
         * @return extractKeySpec
         */
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        /**
         * @return mappingType
         */
        public String getMappingType() {
            return this.mappingType;
        }

        public static final class Builder {
            private String extractKey; 
            private String extractKeySpec; 
            private String mappingType; 

            private Builder() {
            } 

            private Builder(ParamMapsList model) {
                this.extractKey = model.extractKey;
                this.extractKeySpec = model.extractKeySpec;
                this.mappingType = model.mappingType;
            } 

            /**
             * <p>The key extracted from the input parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder extractKey(String extractKey) {
                this.extractKey = extractKey;
                return this;
            }

            /**
             * <p>The position of the input parameter.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * </blockquote>
             * <ul>
             * <li><p><code>ALL_QUERY_PARAMETER</code>: request parameter</p>
             * </li>
             * <li><p><code>ALL_HEADER</code>: request header</p>
             * </li>
             * <li><p><code>ALL_PATH</code>: request path</p>
             * </li>
             * <li><p><code>ALL_BODY</code>: request body</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL_QUERY_PARAMETER</p>
             */
            public Builder extractKeySpec(String extractKeySpec) {
                this.extractKeySpec = extractKeySpec;
                return this;
            }

            /**
             * <p>The type of the backend service parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.String</p>
             */
            public Builder mappingType(String mappingType) {
                this.mappingType = mappingType;
                return this;
            }

            public ParamMapsList build() {
                return new ParamMapsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class MothedMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboMothedName")
        private String dubboMothedName;

        @com.aliyun.core.annotation.NameInMap("HttpMothed")
        private String httpMothed;

        @com.aliyun.core.annotation.NameInMap("Mothedpath")
        private String mothedpath;

        @com.aliyun.core.annotation.NameInMap("ParamMapsList")
        private java.util.List<ParamMapsList> paramMapsList;

        @com.aliyun.core.annotation.NameInMap("PassThroughAllHeaders")
        private String passThroughAllHeaders;

        @com.aliyun.core.annotation.NameInMap("PassThroughList")
        private java.util.List<String> passThroughList;

        private MothedMapList(Builder builder) {
            this.dubboMothedName = builder.dubboMothedName;
            this.httpMothed = builder.httpMothed;
            this.mothedpath = builder.mothedpath;
            this.paramMapsList = builder.paramMapsList;
            this.passThroughAllHeaders = builder.passThroughAllHeaders;
            this.passThroughList = builder.passThroughList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MothedMapList create() {
            return builder().build();
        }

        /**
         * @return dubboMothedName
         */
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        /**
         * @return httpMothed
         */
        public String getHttpMothed() {
            return this.httpMothed;
        }

        /**
         * @return mothedpath
         */
        public String getMothedpath() {
            return this.mothedpath;
        }

        /**
         * @return paramMapsList
         */
        public java.util.List<ParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        /**
         * @return passThroughAllHeaders
         */
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        /**
         * @return passThroughList
         */
        public java.util.List<String> getPassThroughList() {
            return this.passThroughList;
        }

        public static final class Builder {
            private String dubboMothedName; 
            private String httpMothed; 
            private String mothedpath; 
            private java.util.List<ParamMapsList> paramMapsList; 
            private String passThroughAllHeaders; 
            private java.util.List<String> passThroughList; 

            private Builder() {
            } 

            private Builder(MothedMapList model) {
                this.dubboMothedName = model.dubboMothedName;
                this.httpMothed = model.httpMothed;
                this.mothedpath = model.mothedpath;
                this.paramMapsList = model.paramMapsList;
                this.passThroughAllHeaders = model.passThroughAllHeaders;
                this.passThroughList = model.passThroughList;
            } 

            /**
             * <p>The method name of the Dubbo service.</p>
             * 
             * <strong>example:</strong>
             * <p>sayHello</p>
             */
            public Builder dubboMothedName(String dubboMothedName) {
                this.dubboMothedName = dubboMothedName;
                return this;
            }

            /**
             * <p>The HTTP method.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * </blockquote>
             * <ul>
             * <li><p>ALL_GET</p>
             * </li>
             * <li><p>ALL_POST</p>
             * </li>
             * <li><p>ALL_PUT</p>
             * </li>
             * <li><p>ALL_DELETE</p>
             * </li>
             * <li><p>ALL_PATCH</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL_GET</p>
             */
            public Builder httpMothed(String httpMothed) {
                this.httpMothed = httpMothed;
                return this;
            }

            /**
             * <p>The path used for method matching.</p>
             * 
             * <strong>example:</strong>
             * <p>/mytestzbk/sayhello</p>
             */
            public Builder mothedpath(String mothedpath) {
                this.mothedpath = mothedpath;
                return this;
            }

            /**
             * <p>The information about parameter mappings.</p>
             */
            public Builder paramMapsList(java.util.List<ParamMapsList> paramMapsList) {
                this.paramMapsList = paramMapsList;
                return this;
            }

            /**
             * <p>The pass-through type of the header.</p>
             * <blockquote>
             * <p>Valid values:</p>
             * </blockquote>
             * <ul>
             * <li><p>PASS_ALL: All headers are passed through.</p>
             * </li>
             * <li><p>PASS_NOT: All headers are not passed through.</p>
             * </li>
             * <li><p>PASS_ASSIGN: Specified headers are passed through.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PASS_NOT</p>
             */
            public Builder passThroughAllHeaders(String passThroughAllHeaders) {
                this.passThroughAllHeaders = passThroughAllHeaders;
                return this;
            }

            /**
             * <p>The list of headers to be passed through.</p>
             */
            public Builder passThroughList(java.util.List<String> passThroughList) {
                this.passThroughList = passThroughList;
                return this;
            }

            public MothedMapList build() {
                return new MothedMapList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class HttpDubboTranscoder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboServiceGroup")
        private String dubboServiceGroup;

        @com.aliyun.core.annotation.NameInMap("DubboServiceName")
        private String dubboServiceName;

        @com.aliyun.core.annotation.NameInMap("DubboServiceVersion")
        private String dubboServiceVersion;

        @com.aliyun.core.annotation.NameInMap("MothedMapList")
        private java.util.List<MothedMapList> mothedMapList;

        private HttpDubboTranscoder(Builder builder) {
            this.dubboServiceGroup = builder.dubboServiceGroup;
            this.dubboServiceName = builder.dubboServiceName;
            this.dubboServiceVersion = builder.dubboServiceVersion;
            this.mothedMapList = builder.mothedMapList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpDubboTranscoder create() {
            return builder().build();
        }

        /**
         * @return dubboServiceGroup
         */
        public String getDubboServiceGroup() {
            return this.dubboServiceGroup;
        }

        /**
         * @return dubboServiceName
         */
        public String getDubboServiceName() {
            return this.dubboServiceName;
        }

        /**
         * @return dubboServiceVersion
         */
        public String getDubboServiceVersion() {
            return this.dubboServiceVersion;
        }

        /**
         * @return mothedMapList
         */
        public java.util.List<MothedMapList> getMothedMapList() {
            return this.mothedMapList;
        }

        public static final class Builder {
            private String dubboServiceGroup; 
            private String dubboServiceName; 
            private String dubboServiceVersion; 
            private java.util.List<MothedMapList> mothedMapList; 

            private Builder() {
            } 

            private Builder(HttpDubboTranscoder model) {
                this.dubboServiceGroup = model.dubboServiceGroup;
                this.dubboServiceName = model.dubboServiceName;
                this.dubboServiceVersion = model.dubboServiceVersion;
                this.mothedMapList = model.mothedMapList;
            } 

            /**
             * <p>The name of the service group.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder dubboServiceGroup(String dubboServiceGroup) {
                this.dubboServiceGroup = dubboServiceGroup;
                return this;
            }

            /**
             * <p>The name of the Dubbo service.</p>
             * 
             * <strong>example:</strong>
             * <p>org.apache.dubbo.samples.basic.api.DemoService</p>
             */
            public Builder dubboServiceName(String dubboServiceName) {
                this.dubboServiceName = dubboServiceName;
                return this;
            }

            /**
             * <p>The version of the Dubbo service.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0</p>
             */
            public Builder dubboServiceVersion(String dubboServiceVersion) {
                this.dubboServiceVersion = dubboServiceVersion;
                return this;
            }

            /**
             * <p>The forwarding rules of the Dubbo service.</p>
             */
            public Builder mothedMapList(java.util.List<MothedMapList> mothedMapList) {
                this.mothedMapList = mothedMapList;
                return this;
            }

            public HttpDubboTranscoder build() {
                return new HttpDubboTranscoder(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddGatewayRouteRequest} extends {@link TeaModel}
     *
     * <p>AddGatewayRouteRequest</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgreementType")
        private String agreementType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HttpDubboTranscoder")
        private HttpDubboTranscoder httpDubboTranscoder;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Services(Builder builder) {
            this.agreementType = builder.agreementType;
            this.groupName = builder.groupName;
            this.httpDubboTranscoder = builder.httpDubboTranscoder;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.percent = builder.percent;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return agreementType
         */
        public String getAgreementType() {
            return this.agreementType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return httpDubboTranscoder
         */
        public HttpDubboTranscoder getHttpDubboTranscoder() {
            return this.httpDubboTranscoder;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String agreementType; 
            private String groupName; 
            private HttpDubboTranscoder httpDubboTranscoder; 
            private String name; 
            private String namespace; 
            private Integer percent; 
            private Long serviceId; 
            private Integer servicePort; 
            private String sourceType; 
            private String version; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.agreementType = model.agreementType;
                this.groupName = model.groupName;
                this.httpDubboTranscoder = model.httpDubboTranscoder;
                this.name = model.name;
                this.namespace = model.namespace;
                this.percent = model.percent;
                this.serviceId = model.serviceId;
                this.servicePort = model.servicePort;
                this.sourceType = model.sourceType;
                this.version = model.version;
            } 

            /**
             * <p>The type of the protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>DUBBO</p>
             */
            public Builder agreementType(String agreementType) {
                this.agreementType = agreementType;
                return this;
            }

            /**
             * <p>The name of the group to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The transcoder of the Dubbo protocol.</p>
             */
            public Builder httpDubboTranscoder(HttpDubboTranscoder httpDubboTranscoder) {
                this.httpDubboTranscoder = httpDubboTranscoder;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace to which the service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The weight in the form of a percentage value.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>353</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service port number.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The source type.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The version of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
