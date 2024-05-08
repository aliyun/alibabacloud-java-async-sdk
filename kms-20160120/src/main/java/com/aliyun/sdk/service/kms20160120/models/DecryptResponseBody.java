// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecryptResponseBody} extends {@link TeaModel}
 *
 * <p>DecryptResponseBody</p>
 */
public class DecryptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    private String keyVersionId;

    @com.aliyun.core.annotation.NameInMap("Plaintext")
    private String plaintext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DecryptResponseBody(Builder builder) {
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyVersionId
     */
    public String getKeyVersionId() {
        return this.keyVersionId;
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
        private String keyVersionId; 
        private String plaintext; 
        private String requestId; 

        /**
         * The ID of the customer master key (CMK) that is used to decrypt the ciphertext.
         * <p>
         * 
         * It is the GUID of the CMK.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The ID of the CMK version that is used to decrypt the ciphertext.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DecryptResponseBody build() {
            return new DecryptResponseBody(this);
        } 

    } 

}
