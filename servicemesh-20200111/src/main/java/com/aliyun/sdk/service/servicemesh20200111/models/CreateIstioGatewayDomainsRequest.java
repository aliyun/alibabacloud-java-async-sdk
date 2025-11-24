// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link CreateIstioGatewayDomainsRequest} extends {@link RequestModel}
 *
 * <p>CreateIstioGatewayDomainsRequest</p>
 */
public class CreateIstioGatewayDomainsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Credential")
    private String credential;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceHttps")
    private Boolean forceHttps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hosts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hosts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioGatewayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String istioGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer number;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private CreateIstioGatewayDomainsRequest(Builder builder) {
        super(builder);
        this.credential = builder.credential;
        this.forceHttps = builder.forceHttps;
        this.hosts = builder.hosts;
        this.istioGatewayName = builder.istioGatewayName;
        this.limit = builder.limit;
        this.namespace = builder.namespace;
        this.number = builder.number;
        this.portName = builder.portName;
        this.protocol = builder.protocol;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIstioGatewayDomainsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credential
     */
    public String getCredential() {
        return this.credential;
    }

    /**
     * @return forceHttps
     */
    public Boolean getForceHttps() {
        return this.forceHttps;
    }

    /**
     * @return hosts
     */
    public String getHosts() {
        return this.hosts;
    }

    /**
     * @return istioGatewayName
     */
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return number
     */
    public Integer getNumber() {
        return this.number;
    }

    /**
     * @return portName
     */
    public String getPortName() {
        return this.portName;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<CreateIstioGatewayDomainsRequest, Builder> {
        private String credential; 
        private Boolean forceHttps; 
        private String hosts; 
        private String istioGatewayName; 
        private String limit; 
        private String namespace; 
        private Integer number; 
        private String portName; 
        private String protocol; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIstioGatewayDomainsRequest request) {
            super(request);
            this.credential = request.credential;
            this.forceHttps = request.forceHttps;
            this.hosts = request.hosts;
            this.istioGatewayName = request.istioGatewayName;
            this.limit = request.limit;
            this.namespace = request.namespace;
            this.number = request.number;
            this.portName = request.portName;
            this.protocol = request.protocol;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The name of the secret that contains the Transport Layer Security (TLS) certificate and certificate authority (CA) certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>bookinfo-secret</p>
         */
        public Builder credential(String credential) {
            this.putBodyParameter("Credential", credential);
            this.credential = credential;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly use TLS to protect connection security.</p>
         * <ul>
         * <li><code>true</code>: forcibly uses TLS to protect connection security.</li>
         * <li><code>false</code>: does not forcibly use TLS to protect connection security.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceHttps(Boolean forceHttps) {
            this.putBodyParameter("ForceHttps", forceHttps);
            this.forceHttps = forceHttps;
            return this;
        }

        /**
         * <p>The one or more domain names that are exposed by the ASM gateway. Separate multiple domain names with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,demo.com</p>
         */
        public Builder hosts(String hosts) {
            this.putBodyParameter("Hosts", hosts);
            this.hosts = hosts;
            return this;
        }

        /**
         * <p>The name of the ASM gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway</p>
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
            return this;
        }

        /**
         * <p>The maximum number of ASM gateways to query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(String limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The port that is provided by the ASM gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder number(Integer number) {
            this.putBodyParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * <p>The name of the port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http-demo</p>
         */
        public Builder portName(String portName) {
            this.putBodyParameter("PortName", portName);
            this.portName = portName;
            return this;
        }

        /**
         * <p>The type of the protocol. Valid values: <code>HTTP</code>, <code>HTTPS</code>, <code>GRPC</code>, <code>HTTP2</code>, <code>MONGO</code>, <code>TCP</code>, and <code>TLS</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public CreateIstioGatewayDomainsRequest build() {
            return new CreateIstioGatewayDomainsRequest(this);
        } 

    } 

}
