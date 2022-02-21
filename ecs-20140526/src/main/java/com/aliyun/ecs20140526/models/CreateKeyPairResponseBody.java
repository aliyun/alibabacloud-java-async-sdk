// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeyPairResponseBody</p>
 */
public class CreateKeyPairResponseBody extends TeaModel {
    @NameInMap("PrivateKeyBody")
    private String privateKeyBody;

    @NameInMap("KeyPairName")
    private String keyPairName;

    @NameInMap("KeyPairId")
    private String keyPairId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("KeyPairFingerPrint")
    private String keyPairFingerPrint;

    private CreateKeyPairResponseBody(Builder builder) {
        this.privateKeyBody = builder.privateKeyBody;
        this.keyPairName = builder.keyPairName;
        this.keyPairId = builder.keyPairId;
        this.requestId = builder.requestId;
        this.keyPairFingerPrint = builder.keyPairFingerPrint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return privateKeyBody
     */
    public String getPrivateKeyBody() {
        return this.privateKeyBody;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return keyPairFingerPrint
     */
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    public static final class Builder {
        private String privateKeyBody; 
        private String keyPairName; 
        private String keyPairId; 
        private String requestId; 
        private String keyPairFingerPrint; 

        /**
         * The private key of the key pair. The private key in the PKCS#8 format encoded by PEM.
         */
        public Builder privateKeyBody(String privateKeyBody) {
            this.privateKeyBody = privateKeyBody;
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
         * The ID of the SSH key pair.
         */
        public Builder keyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The fingerprint of the key pair. According to the public key fingerprint format defined in RFC4716, MD5 Information Digest Algorithm is adopted. For more information, see [RFC4716](https://tools.ietf.org/html/rfc4716).
         */
        public Builder keyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }

        public CreateKeyPairResponseBody build() {
            return new CreateKeyPairResponseBody(this);
        } 

    } 

}
