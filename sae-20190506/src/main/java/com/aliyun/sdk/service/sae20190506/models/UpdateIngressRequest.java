// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateIngressRequest} extends {@link RequestModel}
 *
 * <p>UpdateIngressRequest</p>
 */
public class UpdateIngressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    private String certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIds")
    private String certIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRule")
    private String defaultRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ingressId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private String listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalanceType")
    private String loadBalanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    private String rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    private UpdateIngressRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.certIds = builder.certIds;
        this.defaultRule = builder.defaultRule;
        this.description = builder.description;
        this.idleTimeout = builder.idleTimeout;
        this.ingressId = builder.ingressId;
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalanceType = builder.loadBalanceType;
        this.requestTimeout = builder.requestTimeout;
        this.rules = builder.rules;
        this.securityPolicyId = builder.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIngressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return ingressId
     */
    public Long getIngressId() {
        return this.ingressId;
    }

    /**
     * @return listenerPort
     */
    public String getListenerPort() {
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

    public static final class Builder extends Request.Builder<UpdateIngressRequest, Builder> {
        private String certId; 
        private String certIds; 
        private String defaultRule; 
        private String description; 
        private Integer idleTimeout; 
        private Long ingressId; 
        private String listenerPort; 
        private String listenerProtocol; 
        private String loadBalanceType; 
        private Integer requestTimeout; 
        private String rules; 
        private String securityPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIngressRequest request) {
            super(request);
            this.certId = request.certId;
            this.certIds = request.certIds;
            this.defaultRule = request.defaultRule;
            this.description = request.description;
            this.idleTimeout = request.idleTimeout;
            this.ingressId = request.ingressId;
            this.listenerPort = request.listenerPort;
            this.listenerProtocol = request.listenerProtocol;
            this.loadBalanceType = request.loadBalanceType;
            this.requestTimeout = request.requestTimeout;
            this.rules = request.rules;
            this.securityPolicyId = request.securityPolicyId;
        } 

        /**
         * <p>The ID of the certificate that is associated with the Classic Load Balancer (<strong>CLB</strong>) instance.</p>
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
         * <p>The IDs of the certificates that are associated with the Application Load Balancer (<strong>ALB</strong>) instance.</p>
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
         * <p>The default forwarding rule. You can specify a port and an application in the default forwarding rule to forward traffic based on the IP address. The following list describes the involved parameters:</p>
         * <ul>
         * <li><strong>appId</strong>: the ID of the application.</li>
         * <li><strong>containerPort</strong>: the container port of the application.</li>
         * </ul>
         * <blockquote>
         * <p> All requests that do not match the forwarding rules specified for Rules are forwarded over the port to the application.</p>
         * </blockquote>
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
         * <p>The name of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress-sae-test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IdleTimeout.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The ID of the routing rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        public Builder ingressId(Long ingressId) {
            this.putQueryParameter("IngressId", ingressId);
            this.ingressId = ingressId;
            return this;
        }

        /**
         * <p>The port specified for the Server Load Balancer (SLB) listener. You must specify a vacant port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder listenerPort(String listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The protocol that is used to forward requests. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: HTTP is suitable for applications that need to identify the transmitted data.</li>
         * <li><strong>HTTPS</strong>: HTTPS is suitable for applications that require encrypted data transmission.</li>
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
         * <p>This parameter is discontinued.</p>
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
         * RequestTimeout.
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
         * </ul>
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
         * SecurityPolicyId.
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putQueryParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        @Override
        public UpdateIngressRequest build() {
            return new UpdateIngressRequest(this);
        } 

    } 

}
