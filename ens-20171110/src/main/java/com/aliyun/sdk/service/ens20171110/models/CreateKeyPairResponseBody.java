// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeyPairResponseBody</p>
 */
public class CreateKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyPairFingerPrint")
    private String keyPairFingerPrint;

    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("PrivateKeyBody")
    private String privateKeyBody;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKeyPairResponseBody(Builder builder) {
        this.keyPairFingerPrint = builder.keyPairFingerPrint;
        this.keyPairId = builder.keyPairId;
        this.keyPairName = builder.keyPairName;
        this.privateKeyBody = builder.privateKeyBody;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyPairFingerPrint
     */
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return privateKeyBody
     */
    public String getPrivateKeyBody() {
        return this.privateKeyBody;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String keyPairFingerPrint; 
        private String keyPairId; 
        private String keyPairName; 
        private String privateKeyBody; 
        private String requestId; 

        /**
         * The fingerprint of the key pair. The message-digest algorithm 5 (MD5) is used based on the public key fingerprint format defined in RFC 4716. For more information, see [RFC 4716](https://tools.ietf.org/html/rfc4716).
         */
        public Builder keyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }

        /**
         * The ID of the SSH key pair.
         */
        public Builder keyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
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
         * The private key of the key pair. The private key is encoded with PEM in the PKCS#8 format.
         */
        public Builder privateKeyBody(String privateKeyBody) {
            this.privateKeyBody = privateKeyBody;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKeyPairResponseBody build() {
            return new CreateKeyPairResponseBody(this);
        } 

    } 

}
