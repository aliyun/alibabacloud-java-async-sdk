// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientKeyResponseBody</p>
 */
public class CreateClientKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientKeyId")
    private String clientKeyId;

    @com.aliyun.core.annotation.NameInMap("KeyAlgorithm")
    private String keyAlgorithm;

    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private String notAfter;

    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private String notBefore;

    @com.aliyun.core.annotation.NameInMap("PrivateKeyData")
    private String privateKeyData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateClientKeyResponseBody(Builder builder) {
        this.clientKeyId = builder.clientKeyId;
        this.keyAlgorithm = builder.keyAlgorithm;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.privateKeyData = builder.privateKeyData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientKeyId
     */
    public String getClientKeyId() {
        return this.clientKeyId;
    }

    /**
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * @return notAfter
     */
    public String getNotAfter() {
        return this.notAfter;
    }

    /**
     * @return notBefore
     */
    public String getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return privateKeyData
     */
    public String getPrivateKeyData() {
        return this.privateKeyData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientKeyId; 
        private String keyAlgorithm; 
        private String notAfter; 
        private String notBefore; 
        private String privateKeyData; 
        private String requestId; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder clientKeyId(String clientKeyId) {
            this.clientKeyId = clientKeyId;
            return this;
        }

        /**
         * The ID of the client key.
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * The beginning of the validity period of the client key.
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * The private key of the client key.
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * The algorithm that is used to encrypt the private key of the client key. Currently, only RSA\_2048 is supported.
         */
        public Builder privateKeyData(String privateKeyData) {
            this.privateKeyData = privateKeyData;
            return this;
        }

        /**
         * The beginning of the validity period of the client key.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard. The time must be in UTC. The time must be in the yyyy-MM-ddTHH:mm:ssZ format.
         * 
         * > 
         * 
         * *   If you do not configure NotBefore, the default value is the time when the client key was created.
         * *   If you configure NotBefore, you must configure NotAfter.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClientKeyResponseBody build() {
            return new CreateClientKeyResponseBody(this);
        } 

    } 

}
