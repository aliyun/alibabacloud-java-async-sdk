// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EncryptRequest} extends {@link RequestModel}
 *
 * <p>EncryptRequest</p>
 */
public class EncryptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Plaintext")
    @com.aliyun.core.annotation.Validation(required = true)
    private String plaintext;

    private EncryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certIdentifier = builder.certIdentifier;
        this.messageType = builder.messageType;
        this.plaintext = builder.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptRequest create() {
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
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    public static final class Builder extends Request.Builder<EncryptRequest, Builder> {
        private String algorithm; 
        private String certIdentifier; 
        private String messageType; 
        private String plaintext; 

        private Builder() {
            super();
        } 

        private Builder(EncryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certIdentifier = request.certIdentifier;
            this.messageType = request.messageType;
            this.plaintext = request.plaintext;
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
         * The unique identifier of the certificate. You can call the [ListCert](~~455806~~) operation to obtain the identifier.
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
         * The value type of the Message parameter. Valid values:
         * <p>
         * 
         * *   RAW: The value of the Plaintext parameter is directly encrypted. This is the default value.
         * *   Base64: The value of the Plaintext parameter is Base64-encoded data. The data is decoded and then encrypted.
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * The data that you want to encrypt. The value of this parameter can be raw data or Base64-encoded data. For more information, see the description of the MessageType parameter. For example, if the hexadecimal data that you want to encrypt is `[0x31, 0x32, 0x33, 0x34]`, the Base64-encoded data is MTIzNA==. The size of data that can be encrypted varies based on the encryption algorithm that you use. The following list describes the relationship between the encryption algorithms and data sizes:
         * <p>
         * 
         * *   **RSAES_OAEP_SHA\_1**: 214 bytes
         * *   **RSAES_OAEP_SHA\_256**: 190 bytes
         * *   **SM2PKE**: 6,047 bytes
         */
        public Builder plaintext(String plaintext) {
            this.putQueryParameter("Plaintext", plaintext);
            this.plaintext = plaintext;
            return this;
        }

        @Override
        public EncryptRequest build() {
            return new EncryptRequest(this);
        } 

    } 

}
