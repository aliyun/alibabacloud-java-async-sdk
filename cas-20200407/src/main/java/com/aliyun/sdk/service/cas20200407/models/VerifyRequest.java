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
 * {@link VerifyRequest} extends {@link RequestModel}
 *
 * <p>VerifyRequest</p>
 */
public class VerifyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signatureValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SigningAlgorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signingAlgorithm;

    private VerifyRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.signatureValue = builder.signatureValue;
        this.signingAlgorithm = builder.signingAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return signatureValue
     */
    public String getSignatureValue() {
        return this.signatureValue;
    }

    /**
     * @return signingAlgorithm
     */
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    public static final class Builder extends Request.Builder<VerifyRequest, Builder> {
        private String certIdentifier; 
        private String message; 
        private String messageType; 
        private String signatureValue; 
        private String signingAlgorithm; 

        private Builder() {
            super();
        } 

        private Builder(VerifyRequest request) {
            super(request);
            this.certIdentifier = request.certIdentifier;
            this.message = request.message;
            this.messageType = request.messageType;
            this.signatureValue = request.signatureValue;
            this.signingAlgorithm = request.signingAlgorithm;
        } 

        /**
         * <p>The unique identifier of the certificate. You can call the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation to obtain the unique identifier of a certificate.</p>
         * <ul>
         * <li>If the certificate is an SSL certificate, the value of this parameter must be in the {Certificate ID}-cn-hangzhou format.</li>
         * <li>If the certificate is a private certificate, the value of this parameter must be the value of the Identifier field for the private certificate.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5870821-cn-hangzhou</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The data for which you want to verify the signature. The value must be encoded in Base64.<br>For example, if the hexadecimal data that you want to verify is [0x31, 0x32, 0x33, 0x34], set the parameter to the Base64-encoded value MTIzNA==. If you set MessageType to RAW, the size of the data must be less than 4 KB. If the size of the data is greater than 4 KB, you can set MessageType to DIGEST and set Message to the digest of the data. The digest is also called hash value. You can compute the digest of the data on an on-premises machine. The certificate repository uses your certificate application system to compute the message digest. The message digest algorithm that is used must meet the requirements of the specified signature algorithm. The following signature algorithms require different message digest algorithms:</p>
         * <ul>
         * <li>If the signature algorithm is SHA256withRSA, SHA256withRSA/PSS, or SHA256withECDSA, the message digest algorithm must be SHA-256.</li>
         * <li>If the signature algorithm is SM3withSM2, the message digest algorithm must be SM3.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNA==</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>The value type of the Message parameter. Valid values:</p>
         * <ul>
         * <li><strong>RAW</strong>: the raw data. This is the default value.</li>
         * <li><strong>DIGEST</strong>: the message digest of the raw data.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RAW</p>
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * <p>The signature value. The value must be encoded in Base64.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyaC0w3ROK5b3QcHmUtAhMY/sQjKu2t3uBfnf6J/gn7JfZtyxwcCUjzXbw5jmqJQRbj1te670Bshg9kUdanKhtHFhJjU5jX+ZMMBr6pH0gqQDJxR0K0yHXRc0Q5OQoUZ6BfpbI4Wt4jJvJSdCstz1vSg12CfEHS8Kd5qfhItK7Y=</p>
         */
        public Builder signatureValue(String signatureValue) {
            this.putQueryParameter("SignatureValue", signatureValue);
            this.signatureValue = signatureValue;
            return this;
        }

        /**
         * <p>The signature algorithm. Valid values:</p>
         * <ul>
         * <li><strong>SHA256withRSA</strong></li>
         * <li><strong>SHA256withRSA/PSS</strong></li>
         * <li><strong>SHA256withECDSA</strong></li>
         * <li><strong>SM3withSM2</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256withRSA</p>
         */
        public Builder signingAlgorithm(String signingAlgorithm) {
            this.putQueryParameter("SigningAlgorithm", signingAlgorithm);
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }

        @Override
        public VerifyRequest build() {
            return new VerifyRequest(this);
        } 

    } 

}
