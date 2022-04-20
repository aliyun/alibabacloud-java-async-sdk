// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewaySecretRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewaySecretRequest</p>
 */
public class CreateGatewaySecretRequest extends Request {
    @Body
    @NameInMap("Cert")
    private String cert;

    @Body
    @NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @Body
    @NameInMap("Key")
    private String key;

    @Body
    @NameInMap("SecretName")
    private String secretName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private CreateGatewaySecretRequest(Builder builder) {
        super(builder);
        this.cert = builder.cert;
        this.istioGatewayName = builder.istioGatewayName;
        this.key = builder.key;
        this.secretName = builder.secretName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewaySecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return istioGatewayName
     */
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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

    public static final class Builder extends Request.Builder<CreateGatewaySecretRequest, Builder> {
        private String cert; 
        private String istioGatewayName; 
        private String key; 
        private String secretName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewaySecretRequest request) {
            super(request);
            this.cert = request.cert;
            this.istioGatewayName = request.istioGatewayName;
            this.key = request.key;
            this.secretName = request.secretName;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * Cert.
         */
        public Builder cert(String cert) {
            this.putBodyParameter("Cert", cert);
            this.cert = cert;
            return this;
        }

        /**
         * IstioGatewayName.
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putBodyParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public CreateGatewaySecretRequest build() {
            return new CreateGatewaySecretRequest(this);
        } 

    } 

}
