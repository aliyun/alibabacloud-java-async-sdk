// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDataKeyWithoutPlaintextResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDataKeyWithoutPlaintextResponseBody</p>
 */
public class GenerateDataKeyWithoutPlaintextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    private String keyVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateDataKeyWithoutPlaintextResponseBody(Builder builder) {
        this.ciphertextBlob = builder.ciphertextBlob;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDataKeyWithoutPlaintextResponseBody create() {
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
     * @return keyVersionId
     */
    public String getKeyVersionId() {
        return this.keyVersionId;
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
        private String keyVersionId; 
        private String requestId; 

        /**
         * The ciphertext of the data that is encrypted by using the primary CMK version.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * The globally unique ID of the CMK.
         * <p>
         * 
         * >  If you set the KeyId parameter to an alias, the ID of the CMK to which the alias is bound is returned.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * The ID of the key version that is used to encrypt the plaintext. It is the primary version of the CMK.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateDataKeyWithoutPlaintextResponseBody build() {
            return new GenerateDataKeyWithoutPlaintextResponseBody(this);
        } 

    } 

}
