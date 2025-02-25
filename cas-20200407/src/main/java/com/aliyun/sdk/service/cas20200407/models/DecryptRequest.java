// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li><strong>RSAES_OAEP_SHA_1</strong></li>
         * <li><strong>RSAES_OAEP_SHA_256</strong></li>
         * <li><strong>SM2PKE</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSAESOAEPSHA_1</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The unique identifier of the certificate. You can call the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation to query the identifier.</p>
         * <ul>
         * <li>If the certificate is an SSL certificate, the value of this parameter must be in the {Certificate ID}-cn-hangzhou format.</li>
         * <li>If the certificate is a private certificate, the value of this parameter must be the value of the Identifier field for the private certificate.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-12345678****</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The data that you want to decrypt. The value is encoded in Base64.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</p>
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * <p>The value type of the Message parameter. Valid values:</p>
         * <ul>
         * <li>RAW: The returned result is raw data encoded in UTF-8.</li>
         * <li>Base64: The returned result is Base64-encoded data. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Base64</p>
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
