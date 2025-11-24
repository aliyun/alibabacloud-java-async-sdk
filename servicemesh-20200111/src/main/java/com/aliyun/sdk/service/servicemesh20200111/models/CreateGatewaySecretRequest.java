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
 * {@link CreateGatewaySecretRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewaySecretRequest</p>
 */
public class CreateGatewaySecretRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cert")
    private String cert;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The content of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIC2DCCAcACA-----END CERTIF****-----</p>
         */
        public Builder cert(String cert) {
            this.putBodyParameter("Cert", cert);
            this.cert = cert;
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
         * <p>The private key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC2ag/Bzcgm****</p>
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>bookinfo-secret</p>
         */
        public Builder secretName(String secretName) {
            this.putBodyParameter("SecretName", secretName);
            this.secretName = secretName;
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
        public CreateGatewaySecretRequest build() {
            return new CreateGatewaySecretRequest(this);
        } 

    } 

}
