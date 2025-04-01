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
 * {@link CreateIngressRequest} extends {@link RequestModel}
 *
 * <p>CreateIngressRequest</p>
 */
public class CreateIngressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIds")
    private String certIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorsConfig")
    private String corsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableXForwardedFor")
    private Boolean enableXForwardedFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableXForwardedForClientSrcPort")
    private Boolean enableXForwardedForClientSrcPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableXForwardedForProto")
    private Boolean enableXForwardedForProto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableXForwardedForSlbId")
    private Boolean enableXForwardedForSlbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableXForwardedForSlbPort")
    private Boolean enableXForwardedForSlbPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalanceType")
    private String loadBalanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerEdition")
    private String loadBalancerEdition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlbId")
    private String slbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    private String zoneMappings;

    private CreateIngressRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.certId = builder.certId;
        this.certIds = builder.certIds;
        this.corsConfig = builder.corsConfig;
        this.defaultRule = builder.defaultRule;
        this.description = builder.description;
        this.enableXForwardedFor = builder.enableXForwardedFor;
        this.enableXForwardedForClientSrcPort = builder.enableXForwardedForClientSrcPort;
        this.enableXForwardedForProto = builder.enableXForwardedForProto;
        this.enableXForwardedForSlbId = builder.enableXForwardedForSlbId;
        this.enableXForwardedForSlbPort = builder.enableXForwardedForSlbPort;
        this.idleTimeout = builder.idleTimeout;
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalanceType = builder.loadBalanceType;
        this.loadBalancerEdition = builder.loadBalancerEdition;
        this.namespaceId = builder.namespaceId;
        this.requestTimeout = builder.requestTimeout;
        this.rules = builder.rules;
        this.securityPolicyId = builder.securityPolicyId;
        this.slbId = builder.slbId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIngressRequest create() {
        return builder().build();
    }

@Override
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
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return certIds
     */
    public String getCertIds() {
        return this.certIds;
    }

    /**
     * @return corsConfig
     */
    public String getCorsConfig() {
        return this.corsConfig;
    }

    /**
     * @return defaultRule
     */
    public String getDefaultRule() {
        return this.defaultRule;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableXForwardedFor
     */
    public Boolean getEnableXForwardedFor() {
        return this.enableXForwardedFor;
    }

    /**
     * @return enableXForwardedForClientSrcPort
     */
    public Boolean getEnableXForwardedForClientSrcPort() {
        return this.enableXForwardedForClientSrcPort;
    }

    /**
     * @return enableXForwardedForProto
     */
    public Boolean getEnableXForwardedForProto() {
        return this.enableXForwardedForProto;
    }

    /**
     * @return enableXForwardedForSlbId
     */
    public Boolean getEnableXForwardedForSlbId() {
        return this.enableXForwardedForSlbId;
    }

    /**
     * @return enableXForwardedForSlbPort
     */
    public Boolean getEnableXForwardedForSlbPort() {
        return this.enableXForwardedForSlbPort;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    /**
     * @return loadBalanceType
     */
    public String getLoadBalanceType() {
        return this.loadBalanceType;
    }

    /**
     * @return loadBalancerEdition
     */
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    /**
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return zoneMappings
     */
    public String getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<CreateIngressRequest, Builder> {
        private String addressType; 
        private String certId; 
        private String certIds; 
        private String corsConfig; 
        private String defaultRule; 
        private String description; 
        private Boolean enableXForwardedFor; 
        private Boolean enableXForwardedForClientSrcPort; 
        private Boolean enableXForwardedForProto; 
        private Boolean enableXForwardedForSlbId; 
        private Boolean enableXForwardedForSlbPort; 
        private Integer idleTimeout; 
        private Integer listenerPort; 
        private String listenerProtocol; 
        private String loadBalanceType; 
        private String loadBalancerEdition; 
        private String namespaceId; 
        private Integer requestTimeout; 
        private String rules; 
        private String securityPolicyId; 
        private String slbId; 
        private String zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(CreateIngressRequest request) {
            super(request);
            this.addressType = request.addressType;
            this.certId = request.certId;
            this.certIds = request.certIds;
            this.corsConfig = request.corsConfig;
            this.defaultRule = request.defaultRule;
            this.description = request.description;
            this.enableXForwardedFor = request.enableXForwardedFor;
            this.enableXForwardedForClientSrcPort = request.enableXForwardedForClientSrcPort;
            this.enableXForwardedForProto = request.enableXForwardedForProto;
            this.enableXForwardedForSlbId = request.enableXForwardedForSlbId;
            this.enableXForwardedForSlbPort = request.enableXForwardedForSlbPort;
            this.idleTimeout = request.idleTimeout;
            this.listenerPort = request.listenerPort;
            this.listenerProtocol = request.listenerProtocol;
            this.loadBalanceType = request.loadBalanceType;
            this.loadBalancerEdition = request.loadBalancerEdition;
            this.namespaceId = request.namespaceId;
            this.requestTimeout = request.requestTimeout;
            this.rules = request.rules;
            this.securityPolicyId = request.securityPolicyId;
            this.slbId = request.slbId;
            this.zoneMappings = request.zoneMappings;
        } 

        /**
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The ID of the certificate that is associated with the <strong>CLB</strong> instance.</p>
         * <ul>
         * <li>If you set <strong>LoadBalanceType</strong> to <strong>clb</strong>, you can use CertId to configure a certificate for the HTTPS listener.</li>
         * </ul>
         * <p>For more information about how to manage the SSL certificate IDs that are used by CLB instances, see <a href="https://help.aliyun.com/document_detail/90792.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>188077086902****_176993d****_181437****_108724****</p>
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * <p>The IDs of the certificates that are associated with the <strong>ALB</strong> instance.</p>
         * <ul>
         * <li>If you set <strong>LoadBalanceType</strong> to <strong>alb</strong>, you can use CertIds to configure multiple certificates for the HTTPS listener. Separate multiple certificate IDs with commas (,).</li>
         * <li>The ID of the SSL certificate that is used by an ALB instance can be obtained from Certificate Management Service. For example, if you specify <code>756***-cn-hangzhou</code>, <code>756***</code> is the certificate ID that is obtained from the service page, and <code>-cn-hangzhou</code> is the fixed suffix. For more information, see <a href="https://help.aliyun.com/document_detail/209076.html">Manage certificates</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
         */
        public Builder certIds(String certIds) {
            this.putQueryParameter("CertIds", certIds);
            this.certIds = certIds;
            return this;
        }

        /**
         * CorsConfig.
         */
        public Builder corsConfig(String corsConfig) {
            this.putQueryParameter("CorsConfig", corsConfig);
            this.corsConfig = corsConfig;
            return this;
        }

        /**
         * <p>Default forwarding rule. Traffic is forwarded to the specified application through a designated port based on the IP address. Parameter descriptions are as follows:</p>
         * <ul>
         * <li><strong>appId</strong>: Application ID. - <strong>containerPort</strong>: Application instance port.<blockquote>
         * <p>All requests that do not match or do not meet the <strong>Rules</strong> for forwarding will be directed to this specified application.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appId&quot;:&quot;395b60e4-0550-458d-9c54-a265d036****&quot;,&quot;containerPort&quot;:8080}</p>
         */
        public Builder defaultRule(String defaultRule) {
            this.putQueryParameter("DefaultRule", defaultRule);
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * <p>Route rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress-for-sae-test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableXForwardedFor.
         */
        public Builder enableXForwardedFor(Boolean enableXForwardedFor) {
            this.putQueryParameter("EnableXForwardedFor", enableXForwardedFor);
            this.enableXForwardedFor = enableXForwardedFor;
            return this;
        }

        /**
         * EnableXForwardedForClientSrcPort.
         */
        public Builder enableXForwardedForClientSrcPort(Boolean enableXForwardedForClientSrcPort) {
            this.putQueryParameter("EnableXForwardedForClientSrcPort", enableXForwardedForClientSrcPort);
            this.enableXForwardedForClientSrcPort = enableXForwardedForClientSrcPort;
            return this;
        }

        /**
         * EnableXForwardedForProto.
         */
        public Builder enableXForwardedForProto(Boolean enableXForwardedForProto) {
            this.putQueryParameter("EnableXForwardedForProto", enableXForwardedForProto);
            this.enableXForwardedForProto = enableXForwardedForProto;
            return this;
        }

        /**
         * EnableXForwardedForSlbId.
         */
        public Builder enableXForwardedForSlbId(Boolean enableXForwardedForSlbId) {
            this.putQueryParameter("EnableXForwardedForSlbId", enableXForwardedForSlbId);
            this.enableXForwardedForSlbId = enableXForwardedForSlbId;
            return this;
        }

        /**
         * EnableXForwardedForSlbPort.
         */
        public Builder enableXForwardedForSlbPort(Boolean enableXForwardedForSlbPort) {
            this.putQueryParameter("EnableXForwardedForSlbPort", enableXForwardedForSlbPort);
            this.enableXForwardedForSlbPort = enableXForwardedForSlbPort;
            return this;
        }

        /**
         * <p>The timeout period of an idle connection. Unit: seconds Valid values: 1 to 60. If no requests are received within the specified timeout period, ALB closes the current connection. When a new request is received, ALB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>SThe frontend port that is used by the ALB instance.
         * Valid values: 1 to 65535.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>Request forwarding protocol. The value description is as follows:</p>
         * <ul>
         * <li><strong>HTTP</strong>: Suitable for applications that need to identify data content. - <strong>HTTPS</strong>: Suitable for applications that require encrypted transmission.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putQueryParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * <p>The type of the SLB instance. The instance type can be specified only when you create a routing rule. You cannot change the instance type when you update the routing rule. Valid values:</p>
         * <ul>
         * <li><strong>clb</strong></li>
         * <li><strong>alb</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clb</p>
         */
        public Builder loadBalanceType(String loadBalanceType) {
            this.putQueryParameter("LoadBalanceType", loadBalanceType);
            this.loadBalanceType = loadBalanceType;
            return this;
        }

        /**
         * LoadBalancerEdition.
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            this.putQueryParameter("LoadBalancerEdition", loadBalancerEdition);
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * <p>The ID of the namespace where the application is located. Currently, cross-namespace applications are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:sae-test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The timeout period of a request. Unit: seconds. Valid values: 1 to 180. If no response is received from the backend server within the specified timeout period, ALB stops waiting for the response and returns an HTTP 504 error code to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.putQueryParameter("RequestTimeout", requestTimeout);
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>The forwarding rules. You can specify a port and an application in a forwarding rule to forward traffic based on the specified domain name and request path. The following list describes the involved parameters:</p>
         * <ul>
         * <li><strong>appId</strong>: the ID of the application.</li>
         * <li><strong>containerPort</strong>: the container port of the application.</li>
         * <li><strong>domain</strong>: the domain name.</li>
         * <li><strong>path</strong>: the request path.</li>
         * <li><strong>backendProtocol</strong>: the backend service protocol. Valid values: http, https, and grpc. Default value: http.</li>
         * <li><strong>rewritePath</strong>: the rewrite path.</li>
         * </ul>
         * <blockquote>
         * <p> The path rewrite feature is supported only by ALB instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;appId&quot;:&quot;395b60e4-0550-458d-9c54-a265d036****&quot;,&quot;containerPort&quot;:8080,&quot;domain&quot;:&quot;<a href="http://www.sae.site%22,%22path%22:%22/path1%22%7D,%7B%22appId%22:%22666403ce-d25b-47cf-87fe-497565d2****%22,%22containerPort%22:8080,%22domain%22:%22sae.site%22,%22path%22:%22/path2%22%7D%5D">www.sae.site&quot;,&quot;path&quot;:&quot;/path1&quot;},{&quot;appId&quot;:&quot;666403ce-d25b-47cf-87fe-497565d2****&quot;,&quot;containerPort&quot;:8080,&quot;domain&quot;:&quot;sae.site&quot;,&quot;path&quot;:&quot;/path2&quot;}]</a></p>
         */
        public Builder rules(String rules) {
            this.putBodyParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The ID of a security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-bp1bpn0kn9****</p>
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putQueryParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * <p>The Server Load Balancer (SLB) instance that is used by the routing rule.</p>
         * <blockquote>
         * <p> The SLB instance can be a Classic Load Balancer (CLB) instance or an Application Load Balancer (ALB) instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6hucc7inlqrtcq5****</p>
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * ZoneMappings.
         */
        public Builder zoneMappings(String zoneMappings) {
            this.putQueryParameter("ZoneMappings", zoneMappings);
            this.zoneMappings = zoneMappings;
            return this;
        }

        @Override
        public CreateIngressRequest build() {
            return new CreateIngressRequest(this);
        } 

    } 

}
