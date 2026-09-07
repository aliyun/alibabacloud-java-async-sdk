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
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ciphertextBlob;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomIdentifier")
    private String customIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseId")
    private Long warehouseId;

    private DecryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certIdentifier = builder.certIdentifier;
        this.ciphertextBlob = builder.ciphertextBlob;
        this.customIdentifier = builder.customIdentifier;
        this.messageType = builder.messageType;
        this.warehouseId = builder.warehouseId;
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
     * @return customIdentifier
     */
    public String getCustomIdentifier() {
        return this.customIdentifier;
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return warehouseId
     */
    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public static final class Builder extends Request.Builder<DecryptRequest, Builder> {
        private String algorithm; 
        private String certIdentifier; 
        private String ciphertextBlob; 
        private String customIdentifier; 
        private String messageType; 
        private Long warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(DecryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certIdentifier = request.certIdentifier;
            this.ciphertextBlob = request.ciphertextBlob;
            this.customIdentifier = request.customIdentifier;
            this.messageType = request.messageType;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li><p><strong>RSAES_OAEP_SHA_1</strong></p>
         * </li>
         * <li><p><strong>RSAES_OAEP_SHA_256</strong></p>
         * </li>
         * <li><p><strong>SM2PKE</strong></p>
         * </li>
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
         * <p>The unique identifier of the certificate. Call <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> to obtain this parameter.</p>
         * <ul>
         * <li><p>The identifier of an SSL certificate is typically in the format {Certificate ID}-cn-hangzhou.</p>
         * </li>
         * <li><p>For a private certificate authority (PCA) certificate, this is the value of the Identifier field of the private certificate.</p>
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
         * <p>The Base64-encoded data to decrypt.</p>
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
         * <p>A custom identifier that serves as a unique key.</p>
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
         * <p>The message type. Valid values:</p>
         * <ul>
         * <li><p>RAW: The response returns the plaintext in UTF-8 encoding.</p>
         * </li>
         * <li><p>Base64 (default): The response returns the Base64-encoded plaintext.</p>
         * </li>
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

        /**
         * <p>The ID of the repository.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> to obtain this ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder warehouseId(Long warehouseId) {
            this.putQueryParameter("WarehouseId", warehouseId);
            this.warehouseId = warehouseId;
            return this;
        }

        @Override
        public DecryptRequest build() {
            return new DecryptRequest(this);
        } 

    } 

}
