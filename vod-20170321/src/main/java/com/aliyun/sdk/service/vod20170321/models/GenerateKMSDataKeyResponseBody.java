// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateKMSDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateKMSDataKeyResponseBody</p>
 */
public class GenerateKMSDataKeyResponseBody extends TeaModel {
    @NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @NameInMap("KeyId")
    private String keyId;

    @NameInMap("Plaintext")
    private String plaintext;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateKMSDataKeyResponseBody(Builder builder) {
        this.ciphertextBlob = builder.ciphertextBlob;
        this.keyId = builder.keyId;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateKMSDataKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return ciphertextBlob
     */
    public String getCiphertextBlob() {
        return this.ciphertextBlob;
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
        private String ciphertextBlob; 
        private String keyId; 
        private String plaintext; 
        private String requestId; 

        /**
         * The ciphertext of the encrypted data key. This is used as CipherText when you create a transcoding job.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * The ID of the customer master key (CMK). The ID must be globally unique.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The Base64-encoded plaintext of the data key.
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

        public GenerateKMSDataKeyResponseBody build() {
            return new GenerateKMSDataKeyResponseBody(this);
        } 

    } 

}
