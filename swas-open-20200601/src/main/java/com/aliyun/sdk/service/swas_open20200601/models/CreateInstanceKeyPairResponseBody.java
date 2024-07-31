// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceKeyPairResponseBody</p>
 */
public class CreateInstanceKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateInstanceKeyPairResponseBody(Builder builder) {
        this.fingerprint = builder.fingerprint;
        this.keyPairName = builder.keyPairName;
        this.privateKey = builder.privateKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fingerprint; 
        private String keyPairName; 
        private String privateKey; 
        private String requestId; 

        /**
         * The fingerprint of the key pair.
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * The name of the key pair.
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The private key.
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInstanceKeyPairResponseBody build() {
            return new CreateInstanceKeyPairResponseBody(this);
        } 

    } 

}
