// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CertificatePrivateKeySignRequest} extends {@link RequestModel}
 *
 * <p>CertificatePrivateKeySignRequest</p>
 */
public class CertificatePrivateKeySignRequest extends Request {
    @Query
    @NameInMap("Algorithm")
    @Validation(required = true)
    private String algorithm;

    @Query
    @NameInMap("CertificateId")
    @Validation(required = true)
    private String certificateId;

    @Query
    @NameInMap("Message")
    @Validation(required = true)
    private String message;

    @Query
    @NameInMap("MessageType")
    @Validation(required = true)
    private String messageType;

    private CertificatePrivateKeySignRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.certificateId = builder.certificateId;
        this.message = builder.message;
        this.messageType = builder.messageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertificatePrivateKeySignRequest create() {
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
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
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

    public static final class Builder extends Request.Builder<CertificatePrivateKeySignRequest, Builder> {
        private String algorithm; 
        private String certificateId; 
        private String message; 
        private String messageType; 

        private Builder() {
            super();
        } 

        private Builder(CertificatePrivateKeySignRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.certificateId = request.certificateId;
            this.message = request.message;
            this.messageType = request.messageType;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CertificateId.
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        /**
         * MessageType.
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        @Override
        public CertificatePrivateKeySignRequest build() {
            return new CertificatePrivateKeySignRequest(this);
        } 

    } 

}
