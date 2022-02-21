// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDataKeyResponseBody</p>
 */
public class GenerateDataKeyResponseBody extends TeaModel {
    @NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @NameInMap("KeyId")
    private String keyId;

    @NameInMap("KeyVersionId")
    private String keyVersionId;

    @NameInMap("Plaintext")
    private String plaintext;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateDataKeyResponseBody(Builder builder) {
        this.ciphertextBlob = builder.ciphertextBlob;
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.plaintext = builder.plaintext;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDataKeyResponseBody create() {
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
        private String keyVersionId; 
        private String plaintext; 
        private String requestId; 

        /**
         * CiphertextBlob.
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * KeyVersionId.
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * Plaintext.
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

        public GenerateDataKeyResponseBody build() {
            return new GenerateDataKeyResponseBody(this);
        } 

    } 

}
