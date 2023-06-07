// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceKeyPairResponseBody</p>
 */
public class CreateInstanceKeyPairResponseBody extends TeaModel {
    @NameInMap("Fingerprint")
    private String fingerprint;

    @NameInMap("KeyPairName")
    private String keyPairName;

    @NameInMap("PrivateKey")
    private String privateKey;

    @NameInMap("RequestId")
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
         * Fingerprint.
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * RequestId.
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
