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
    private String certIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomIdentifier")
    private String customIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Plaintext")
    @com.aliyun.core.annotation.Validation(required = true)
    private String plaintext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseId")
    private Long warehouseId;

    private EncryptRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certIdentifier = builder.certIdentifier;
        this.customIdentifier = builder.customIdentifier;
        this.messageType = builder.messageType;
        this.plaintext = builder.plaintext;
        this.warehouseId = builder.warehouseId;
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
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    /**
     * @return warehouseId
     */
    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public static final class Builder extends Request.Builder<EncryptRequest, Builder> {
        private String algorithm; 
        private String certIdentifier; 
        private String customIdentifier; 
        private String messageType; 
        private String plaintext; 
        private Long warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(EncryptRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certIdentifier = request.certIdentifier;
            this.customIdentifier = request.customIdentifier;
            this.messageType = request.messageType;
            this.plaintext = request.plaintext;
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
         * <p>The unique identifier of the certificate. To obtain this parameter, call the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation.</p>
         * <ul>
         * <li><p>The identifier of an SSL certificate is usually in the {Certificate ID}-cn-hangzhou format.</p>
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
         * <p>The custom identifier, which serves as a unique key.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>6bb538d538c70c01f81dg3</strong></strong></p>
         */
        public Builder customIdentifier(String customIdentifier) {
            this.putQueryParameter("CustomIdentifier", customIdentifier);
            this.customIdentifier = customIdentifier;
            return this;
        }

        /**
         * <p>The message type. Valid values:</p>
         * <ul>
         * <li><p>RAW (default): Directly encrypts the value of Plaintext.</p>
         * </li>
         * <li><p>Base64: Decodes the Base64-encoded value of Plaintext and then encrypts the decoded data.</p>
         * </li>
         * </ul>
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
         * <p>The data to encrypt. The data can be plaintext or Base64-encoded plaintext. For more information, see the MessageType parameter. If you use Base64 encoding, for example, if the hexadecimal content of the data to be encrypted is <code>[0x31, 0x32, 0x33, 0x34]</code>, the corresponding Base64-encoded string is MTIzNA==. The maximum size of Plaintext depends on the Algorithm:</p>
         * <ul>
         * <li><p><strong>RSAES_OAEP_SHA_1</strong>: 214 bytes.</p>
         * </li>
         * <li><p><strong>RSAES_OAEP_SHA_256</strong>: 190 bytes.</p>
         * </li>
         * <li><p><strong>SM2PKE</strong>: 6047 bytes.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234***</p>
         */
        public Builder plaintext(String plaintext) {
            this.putQueryParameter("Plaintext", plaintext);
            this.plaintext = plaintext;
            return this;
        }

        /**
         * <p>The repository ID.</p>
         * <blockquote>
         * <p>To obtain this ID, call the <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder warehouseId(Long warehouseId) {
            this.putQueryParameter("WarehouseId", warehouseId);
            this.warehouseId = warehouseId;
            return this;
        }

        @Override
        public EncryptRequest build() {
            return new EncryptRequest(this);
        } 

    } 

}
