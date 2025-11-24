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
 * {@link CreateASMGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateASMGatewayRequest</p>
 */
public class CreateASMGatewayRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Body")
    private String body;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private CreateASMGatewayRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.istioGatewayName = builder.istioGatewayName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateASMGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return istioGatewayName
     */
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<CreateASMGatewayRequest, Builder> {
        private String body; 
        private String istioGatewayName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(CreateASMGatewayRequest request) {
            super(request);
            this.body = request.body;
            this.istioGatewayName = request.istioGatewayName;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The YAML content that is used to create the ASM gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;apiVersion&quot;:&quot;istio.alibabacloud.com/v1beta1&quot;,&quot;kind&quot;:&quot;IstioGateway&quot;,&quot;metadata&quot;:{&quot;name&quot;:&quot;ingressgateway&quot;,&quot;namespace&quot;:&quot;istio-system&quot;},&quot;spec&quot;:{&quot;gatewayType&quot;:&quot;ingress&quot;,&quot;clusterIds&quot;:[&quot;xxxxx&quot;],&quot;ports&quot;:[{&quot;name&quot;:&quot;http-0&quot;,&quot;port&quot;:80,&quot;targetPort&quot;:80,&quot;protocol&quot;:&quot;TCP&quot;},{&quot;name&quot;:&quot;https-1&quot;,&quot;port&quot;:443,&quot;targetPort&quot;:443,&quot;protocol&quot;:&quot;TCP&quot;}],&quot;serviceAnnotations&quot;:{&quot;service.beta.kubernetes.io/alicloud-loadbalancer-address-type&quot;:&quot;internet&quot;,&quot;service.beta.kubernetes.io/alibaba-cloud-loadbalancer-spec&quot;:&quot;slb.s1.small&quot;},&quot;replicaCount&quot;:2,&quot;resources&quot;:{&quot;limits&quot;:{&quot;cpu&quot;:&quot;2&quot;,&quot;memory&quot;:&quot;4G&quot;},&quot;requests&quot;:{&quot;cpu&quot;:&quot;200m&quot;,&quot;memory&quot;:&quot;256Mi&quot;}},&quot;serviceType&quot;:&quot;LoadBalancer&quot;,&quot;maxReplicas&quot;:2,&quot;minReplicas&quot;:2}}</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
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
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public CreateASMGatewayRequest build() {
            return new CreateASMGatewayRequest(this);
        } 

    } 

}
