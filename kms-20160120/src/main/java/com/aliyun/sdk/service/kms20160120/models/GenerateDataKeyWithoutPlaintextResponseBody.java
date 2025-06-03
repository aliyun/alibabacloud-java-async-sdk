// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GenerateDataKeyWithoutPlaintextResponseBody model) {
            this.ciphertextBlob = model.ciphertextBlob;
            this.keyId = model.keyId;
            this.keyVersionId = model.keyVersionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ciphertext of the data that is encrypted by using the primary CMK version.</p>
         * 
         * <strong>example:</strong>
         * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901qOjop4bTS****</p>
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * <p>The globally unique ID of the CMK.</p>
         * <blockquote>
         * <p> If you set the KeyId parameter to an alias, the ID of the CMK to which the alias is bound is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>599fa825-17de-417e-9554-bb032cc6****</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The ID of the key version that is used to encrypt the plaintext. It is the primary version of the CMK.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7021b6ec-4be7-4d3c-8a68-1e85d4d515a0</p>
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
