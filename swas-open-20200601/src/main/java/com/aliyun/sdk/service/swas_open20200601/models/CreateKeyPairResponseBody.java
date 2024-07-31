// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeyPairResponseBody</p>
 */
public class CreateKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("PrivateKeyBody")
    private String privateKeyBody;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKeyPairResponseBody(Builder builder) {
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
        private String keyPairName; 
        private String privateKeyBody; 
        private String requestId; 

        /**
         * The name of the key pair. The name must be 2 to 64 characters in length and can contain letters, digits, colons (.), underscores (\_), and hyphens (-). It must start with a letter but cannot start with http:// or https://.
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * The private key of the key pair. The PEM-encoded private key is in PKCS#8 format.
         */
        public Builder privateKeyBody(String privateKeyBody) {
            this.privateKeyBody = privateKeyBody;
            return this;
        }

        /**
         * The request ID.
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
