// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIstioGatewayDomainsRequest} extends {@link RequestModel}
 *
 * <p>DeleteIstioGatewayDomainsRequest</p>
 */
public class DeleteIstioGatewayDomainsRequest extends Request {
    @Body
    @NameInMap("Hosts")
    private String hosts;

    @Body
    @NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @Body
    @NameInMap("Limit")
    private String limit;

    @Body
    @NameInMap("Namespace")
    private String namespace;

    @Body
    @NameInMap("PortName")
    private String portName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DeleteIstioGatewayDomainsRequest(Builder builder) {
        super(builder);
        this.hosts = builder.hosts;
        this.istioGatewayName = builder.istioGatewayName;
        this.limit = builder.limit;
        this.namespace = builder.namespace;
        this.portName = builder.portName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIstioGatewayDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return portName
     */
    public String getPortName() {
        return this.portName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DeleteIstioGatewayDomainsRequest, Builder> {
        private String hosts; 
        private String istioGatewayName; 
        private String limit; 
        private String namespace; 
        private String portName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIstioGatewayDomainsRequest request) {
            super(request);
            this.hosts = request.hosts;
            this.istioGatewayName = request.istioGatewayName;
            this.limit = request.limit;
            this.namespace = request.namespace;
            this.portName = request.portName;
            this.serviceMeshId = request.serviceMeshId;
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
         * The namespace in which the ASM gateway resides.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
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
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DeleteIstioGatewayDomainsRequest build() {
            return new DeleteIstioGatewayDomainsRequest(this);
        } 

    } 

}
