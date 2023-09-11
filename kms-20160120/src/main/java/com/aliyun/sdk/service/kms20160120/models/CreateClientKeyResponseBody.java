// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClientKeyResponseBody</p>
 */
public class CreateClientKeyResponseBody extends TeaModel {
    @NameInMap("ClientKeyId")
    private String clientKeyId;

    @NameInMap("KeyAlgorithm")
    private String keyAlgorithm;

    @NameInMap("NotAfter")
    private String notAfter;

    @NameInMap("NotBefore")
    private String notBefore;

    @NameInMap("PrivateKeyData")
    private String privateKeyData;

    @NameInMap("RequestId")
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
         * ClientKeyId.
         */
        public Builder clientKeyId(String clientKeyId) {
            this.clientKeyId = clientKeyId;
            return this;
        }

        /**
         * KeyAlgorithm.
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * NotAfter.
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * NotBefore.
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * PrivateKeyData.
         */
        public Builder privateKeyData(String privateKeyData) {
            this.privateKeyData = privateKeyData;
            return this;
        }

        /**
         * RequestId.
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
