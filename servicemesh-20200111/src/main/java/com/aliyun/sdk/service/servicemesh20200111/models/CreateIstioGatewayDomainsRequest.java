// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIstioGatewayDomainsRequest} extends {@link RequestModel}
 *
 * <p>CreateIstioGatewayDomainsRequest</p>
 */
public class CreateIstioGatewayDomainsRequest extends Request {
    @Body
    @NameInMap("Credential")
    private String credential;

    @Body
    @NameInMap("ForceHttps")
    private Boolean forceHttps;

    @Body
    @NameInMap("Hosts")
    @Validation(required = true)
    private String hosts;

    @Body
    @NameInMap("IstioGatewayName")
    @Validation(required = true)
    private String istioGatewayName;

    @Body
    @NameInMap("Limit")
    private String limit;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("Number")
    @Validation(required = true)
    private Integer number;

    @Body
    @NameInMap("PortName")
    @Validation(required = true)
    private String portName;

    @Body
    @NameInMap("Protocol")
    @Validation(required = true)
    private String protocol;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
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
         * The name of the secret that contains the Transport Layer Security (TLS) certificate and certificate authority (CA) certificate.
         */
        public Builder credential(String credential) {
            this.putBodyParameter("Credential", credential);
            this.credential = credential;
            return this;
        }

        /**
         * Specifies whether to forcibly use TLS to protect connection security.
         * <p>
         * 
         * *   `true`: forcibly uses TLS to protect connection security.
         * *   `false`: does not forcibly use TLS to protect connection security.
         */
        public Builder forceHttps(Boolean forceHttps) {
            this.putBodyParameter("ForceHttps", forceHttps);
            this.forceHttps = forceHttps;
            return this;
        }

        /**
         * The domain names of the one or more hosts that are exposed by the ASM gateway. Separate multiple domain names with commas (,).
         */
        public Builder hosts(String hosts) {
            this.putBodyParameter("Hosts", hosts);
            this.hosts = hosts;
            return this;
        }

        /**
         * The name of the ASM gateway.
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
            return this;
        }

        /**
         * The maximum number of ASM gateways to query.
         */
        public Builder limit(String limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The name of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The port that is provided by the ASM gateway.
         */
        public Builder number(Integer number) {
            this.putBodyParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * The name of the port.
         */
        public Builder portName(String portName) {
            this.putBodyParameter("PortName", portName);
            this.portName = portName;
            return this;
        }

        /**
         * The type of the protocol. Valid values: `HTTP`, `HTTPS`, `GRPC`, `HTTP2`, `MONGO`, `TCP`, and `TLS`.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * The ID of the ASM instance.
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
