// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIstioGatewayDomainsRequest</p>
 */
public class DescribeIstioGatewayDomainsRequest extends Request {
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
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeIstioGatewayDomainsRequest(Builder builder) {
        super(builder);
        this.istioGatewayName = builder.istioGatewayName;
        this.limit = builder.limit;
        this.namespace = builder.namespace;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIstioGatewayDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeIstioGatewayDomainsRequest, Builder> {
        private String istioGatewayName; 
        private String limit; 
        private String namespace; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIstioGatewayDomainsRequest request) {
            super(request);
            this.istioGatewayName = request.istioGatewayName;
            this.limit = request.limit;
            this.namespace = request.namespace;
            this.serviceMeshId = request.serviceMeshId;
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
         * The ID of the ASM instance.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeIstioGatewayDomainsRequest build() {
            return new DescribeIstioGatewayDomainsRequest(this);
        } 

    } 

}
