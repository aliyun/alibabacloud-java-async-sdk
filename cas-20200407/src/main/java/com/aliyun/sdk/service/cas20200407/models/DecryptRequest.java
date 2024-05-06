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
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * CiphertextBlob.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.putQueryParameter("CiphertextBlob", ciphertextBlob);
            this.ciphertextBlob = ciphertextBlob;
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
        public DecryptRequest build() {
            return new DecryptRequest(this);
        } 

    } 

}
