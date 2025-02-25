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
 * {@link SignRequest} extends {@link RequestModel}
 *
 * <p>SignRequest</p>
 */
public class SignRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SigningAlgorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signingAlgorithm;

    private SignRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.signingAlgorithm = builder.signingAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignRequest create() {
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
     * @return signingAlgorithm
     */
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    public static final class Builder extends Request.Builder<SignRequest, Builder> {
        private String certIdentifier; 
        private String message; 
        private String messageType; 
        private String signingAlgorithm; 

        private Builder() {
            super();
        } 

        private Builder(SignRequest request) {
            super(request);
            this.certIdentifier = request.certIdentifier;
            this.message = request.message;
            this.messageType = request.messageType;
            this.signingAlgorithm = request.signingAlgorithm;
        } 

        /**
         * <p>The unique identifier of the certificate. You can call the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation to obtain the identifier.</p>
         * <ul>
         * <li>If the certificate is an SSL certificate, the value of this parameter must be in the {Certificate ID}-cn-hangzhou format.</li>
         * <li>If the certificate is a private certificate, the value of this parameter must be the value of the Identifier field for the private certificate.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccaf0c629c2be1e2abb63bb76b</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The data to sign. The value must be encoded in Base64.<br>For example, if the hexadecimal data that you want to sign is [0x31, 0x32, 0x33, 0x34], set the parameter to the Base64-encoded value MTIzNA==. If you set MessageType to RAW, the size of the data must be less than 4 KB. If the size of the data is greater than 4 KB, you can set MessageType to DIGEST and set Message to the digest of the data. The digest is a hash value. You can compute the digest of the data on an on-premises machine. The certificate application repository uses the digest that you compute in your own certificate application system. The message digest algorithm that you use must match the specified signature algorithm. The following items describe the details:</p>
         * <ul>
         * <li>If the signature algorithm is SHA256withRSA, SHA256withRSA/PSS, or SHA256withECDSA, the message digest algorithm must be SHA-256.</li>
         * <li>If the signature algorithm is SM3withSM2, the message digest algorithm must be SM3.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * <p>The value type of the Message parameter. Valid values:</p>
         * <ul>
         * <li>RAW: the raw data. This is the default value.</li>
         * <li>DIGEST: the message digest (hash value) of the raw data.</li>
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
         * <p>The signature algorithm. Valid values:</p>
         * <ul>
         * <li>SHA256withRSA</li>
         * <li>SHA256withRSA/PSS</li>
         * <li>SHA256withECDSA</li>
         * <li>SM3withSM2</li>
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
        public SignRequest build() {
            return new SignRequest(this);
        } 

    } 

}
