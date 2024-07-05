// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptKMSDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DecryptKMSDataKeyResponseBody</p>
 */
public class DecryptKMSDataKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("Plaintext")
    private String plaintext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DecryptKMSDataKeyResponseBody(Builder builder) {
        this.keyId = builder.keyId;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptKMSDataKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return plaintext
     */
    public String getPlaintext() {
        return this.plaintext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String keyId; 
        private String plaintext; 
        private String requestId; 

        /**
         * The ID of the customer master key (CMK) that was used to decrypt the ciphertext.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The plaintext that is generated after decryption.
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DecryptKMSDataKeyResponseBody build() {
            return new DecryptKMSDataKeyResponseBody(this);
        } 

    } 

}
