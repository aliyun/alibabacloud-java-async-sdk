// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptRequest} extends {@link RequestModel}
 *
 * <p>DecryptRequest</p>
 */
public class DecryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ciphertextBlob;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

    private DecryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certIdentifier = builder.certIdentifier;
        this.ciphertextBlob = builder.ciphertextBlob;
        this.messageType = builder.messageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    public static final class Builder extends Request.Builder<DecryptRequest, Builder> {
        private String algorithm; 
        private String certIdentifier; 
        private String ciphertextBlob; 
        private String messageType; 

        private Builder() {
            super();
        } 

        private Builder(DecryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certIdentifier = request.certIdentifier;
            this.ciphertextBlob = request.ciphertextBlob;
            this.messageType = request.messageType;
        } 

        /**
         * The encryption algorithm. Valid values:
         * <p>
         * 
         * *   **RSAES_OAEP_SHA\_1**
         * *   **RSAES_OAEP_SHA\_256**
         * *   **SM2PKE**
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The unique identifier of the certificate. You can call the [ListCert](~~455806~~) operation to query the identifier.
         * <p>
         * 
         * *   If the certificate is an SSL certificate, the value of this parameter must be in the {Certificate ID}-cn-hangzhou format.
         * *   If the certificate is a private certificate, the value of this parameter must be the value of the Identifier field for the private certificate.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * The data that you want to decrypt. The value is encoded in Base64.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * The value type of the Message parameter. Valid values:
         * <p>
         * 
         * *   RAW: The returned result is raw data encoded in UTF-8.
         * *   Base64: The returned result is Base64-encoded data. This is the default value.
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        @Override
        public DecryptRequest build() {
            return new DecryptRequest(this);
        } 

    } 

}
