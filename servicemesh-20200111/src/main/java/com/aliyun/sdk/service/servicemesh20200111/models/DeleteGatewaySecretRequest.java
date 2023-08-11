// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewaySecretRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewaySecretRequest</p>
 */
public class DeleteGatewaySecretRequest extends Request {
    @Body
    @NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @Body
    @NameInMap("SecretName")
    private String secretName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DeleteGatewaySecretRequest(Builder builder) {
        super(builder);
        this.istioGatewayName = builder.istioGatewayName;
        this.secretName = builder.secretName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewaySecretRequest create() {
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
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DeleteGatewaySecretRequest, Builder> {
        private String istioGatewayName; 
        private String secretName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewaySecretRequest request) {
            super(request);
            this.istioGatewayName = request.istioGatewayName;
            this.secretName = request.secretName;
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
         * The name of the secret.
         */
        public Builder secretName(String secretName) {
            this.putBodyParameter("SecretName", secretName);
            this.secretName = secretName;
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
        public DeleteGatewaySecretRequest build() {
            return new DeleteGatewaySecretRequest(this);
        } 

    } 

}
