// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AsymmetricDecryptResponseBody} extends {@link TeaModel}
 *
 * <p>AsymmetricDecryptResponseBody</p>
 */
public class AsymmetricDecryptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    private String keyVersionId;

    @com.aliyun.core.annotation.NameInMap("Plaintext")
    private String plaintext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AsymmetricDecryptResponseBody(Builder builder) {
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricDecryptResponseBody create() {
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
         * The ID of the CMK. The ID must be globally unique.
         * <p>
         * 
         * >  If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The version ID of the CMK that is used to encrypt the plaintext.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * The Base64-encoded plaintext that is generated after decryption.
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AsymmetricDecryptResponseBody build() {
            return new AsymmetricDecryptResponseBody(this);
        } 

    } 

}
