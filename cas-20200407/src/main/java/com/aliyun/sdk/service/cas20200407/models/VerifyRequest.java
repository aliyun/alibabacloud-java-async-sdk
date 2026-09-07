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
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomIdentifier")
    private String customIdentifier;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseId")
    private String warehouseId;

    private VerifyRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
        this.customIdentifier = builder.customIdentifier;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.signatureValue = builder.signatureValue;
        this.signingAlgorithm = builder.signingAlgorithm;
        this.warehouseId = builder.warehouseId;
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
     * @return customIdentifier
     */
    public String getCustomIdentifier() {
        return this.customIdentifier;
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

    /**
     * @return warehouseId
     */
    public String getWarehouseId() {
        return this.warehouseId;
    }

    public static final class Builder extends Request.Builder<VerifyRequest, Builder> {
        private String certIdentifier; 
        private String customIdentifier; 
        private String message; 
        private String messageType; 
        private String signatureValue; 
        private String signingAlgorithm; 
        private String warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(VerifyRequest request) {
            super(request);
            this.certIdentifier = request.certIdentifier;
            this.customIdentifier = request.customIdentifier;
            this.message = request.message;
            this.messageType = request.messageType;
            this.signatureValue = request.signatureValue;
            this.signingAlgorithm = request.signingAlgorithm;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * <p>The unique identifier of the certificate. To get this parameter, call the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation.</p>
         * <ul>
         * <li><p>The identifier for an SSL certificate is typically in the format \<code>{Certificate ID}-cn-hangzhou\\</code>.</p>
         * </li>
         * <li><p>For a PCA certificate, this is the value of the \<code>Identifier\\</code> field.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1ef1da5f-38ed-69b3-****-037781890265</p>
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * <p>The custom identifier. This key must be unique.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>6bb538d538c70c01f81jh2</strong></strong></p>
         */
        public Builder customIdentifier(String customIdentifier) {
            this.putQueryParameter("CustomIdentifier", customIdentifier);
            this.customIdentifier = customIdentifier;
            return this;
        }

        /**
         * <p>The data to verify. The data must be Base64-encoded. For example, if the hexadecimal content of the data to sign is \<code>[0x31, 0x32, 0x33, 0x34]\\</code>, the Base64-encoded value is \<code>MTIzNA==\\</code>. If you set \<code>MessageType\\</code> to \<code>RAW\\</code>, the data size must be less than 4 KB. If the data to sign is larger than 4 KB, set \<code>MessageType\\</code> to \<code>DIGEST\\</code>. Then, set \<code>Message\\</code> to the message digest, or hash, that you calculate locally. The hashing algorithm for the digest must be compatible with the signature algorithm:<br></p>
         * <ul>
         * <li><p>The hashing algorithm for \<code>SHA256withRSA\\</code>, \<code>SHA256withRSA/PSS\\</code>, and \<code>SHA256withECDSA\\</code> is SHA-256.</p>
         * </li>
         * <li><p>The hashing algorithm for \<code>SM3withSM2\\</code> is SM3.</p>
         * </li>
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
         * <p>The message type. Valid values:</p>
         * <ul>
         * <li><p><strong>RAW</strong> (default): The raw data.</p>
         * </li>
         * <li><p><strong>DIGEST</strong>: The message digest of the raw data.</p>
         * </li>
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
         * <p>The signature value. The value must be Base64-encoded.</p>
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
         * <li><p><strong>SHA256withRSA</strong></p>
         * </li>
         * <li><p><strong>SHA256withRSA/PSS</strong></p>
         * </li>
         * <li><p><strong>SHA256withECDSA</strong></p>
         * </li>
         * <li><p><strong>SM3withSM2</strong></p>
         * </li>
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

        /**
         * <p>The ID of the repository. To get this parameter, call the <a href="https://help.aliyun.com/document_detail/453246.html">ListCertWarehouse</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder warehouseId(String warehouseId) {
            this.putQueryParameter("WarehouseId", warehouseId);
            this.warehouseId = warehouseId;
            return this;
        }

        @Override
        public VerifyRequest build() {
            return new VerifyRequest(this);
        } 

    } 

}
