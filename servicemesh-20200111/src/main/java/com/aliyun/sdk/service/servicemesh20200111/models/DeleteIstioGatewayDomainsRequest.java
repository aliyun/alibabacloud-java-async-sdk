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
 * {@link DeleteIstioGatewayDomainsRequest} extends {@link RequestModel}
 *
 * <p>DeleteIstioGatewayDomainsRequest</p>
 */
public class DeleteIstioGatewayDomainsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hosts")
    private String hosts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortName")
    private String portName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The domain names of the one or more hosts that are exposed by the ASM gateway. Separate multiple domain names with commas (,).</p>
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
         * <p>The maximum number of Istio gateways to query.</p>
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
         * <p>The port name.</p>
         * 
         * <strong>example:</strong>
         * <p>https</p>
         */
        public Builder portName(String portName) {
            this.putBodyParameter("PortName", portName);
            this.portName = portName;
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
        public DeleteIstioGatewayDomainsRequest build() {
            return new DeleteIstioGatewayDomainsRequest(this);
        } 

    } 

}
