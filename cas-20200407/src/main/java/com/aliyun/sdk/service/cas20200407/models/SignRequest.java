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
    @com.aliyun.core.annotation.NameInMap("SigningAlgorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signingAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseId")
    private Long warehouseId;

    private SignRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
        this.customIdentifier = builder.customIdentifier;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.signingAlgorithm = builder.signingAlgorithm;
        this.warehouseId = builder.warehouseId;
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
     * @return signingAlgorithm
     */
    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * @return warehouseId
     */
    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public static final class Builder extends Request.Builder<SignRequest, Builder> {
        private String certIdentifier; 
        private String customIdentifier; 
        private String message; 
        private String messageType; 
        private String signingAlgorithm; 
        private Long warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(SignRequest request) {
            super(request);
            this.certIdentifier = request.certIdentifier;
            this.customIdentifier = request.customIdentifier;
            this.message = request.message;
            this.messageType = request.messageType;
            this.signingAlgorithm = request.signingAlgorithm;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * <p>The unique identifier of the certificate. You can get this value by calling the <a href="https://help.aliyun.com/document_detail/455806.html">ListCert</a> operation.</p>
         * <ul>
         * <li><p>The identifier of an SSL certificate is typically in the format \&quot;{Certificate ID}-cn-hangzhou\&quot;.</p>
         * </li>
         * <li><p>For a PCA certificate, this is the Identifier from the corresponding private certificate.</p>
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
         * <p>A unique, user-defined identifier.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong>e6bb538d538c70c01f81fg3</strong></em>*</p>
         */
        public Builder customIdentifier(String customIdentifier) {
            this.putQueryParameter("CustomIdentifier", customIdentifier);
            this.customIdentifier = customIdentifier;
            return this;
        }

        /**
         * <p>The data to sign. The MessageType parameter determines the format of this data. If MessageType is set to RAW, Message is the raw data. If MessageType is set to BASE64, Message is the Base64-encoded raw data. If MessageType is set to DIGEST, Message is the message digest (hash value). If MessageType is set to BLIND, Message is the Base64-encoded blinded message.</p>
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
         * <li><p><code>RAW</code> (default): The raw data.</p>
         * </li>
         * <li><p><code>DIGEST</code>: The message digest (hash value) of the raw data.</p>
         * </li>
         * <li><p><code>BASE64</code>: The Base64-encoded raw data.</p>
         * </li>
         * <li><p><code>BLIND</code>: Enables blind signing. This is supported only for certificates that use an RSA algorithm.</p>
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
         * <p>The signature algorithm. Valid values:</p>
         * <ul>
         * <li><p><code>SHA256withRSA</code></p>
         * </li>
         * <li><p><code>SHA256withRSA/PSS</code></p>
         * </li>
         * <li><p><code>SHA256withECDSA</code></p>
         * </li>
         * <li><p><code>SM3withSM2</code></p>
         * </li>
         * <li><p><code>SHA256withRSA/P7</code></p>
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
         * <p>The repository ID.</p>
         * <blockquote>
         * <p>You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> operation.</p>
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
        public SignRequest build() {
            return new SignRequest(this);
        } 

    } 

}
