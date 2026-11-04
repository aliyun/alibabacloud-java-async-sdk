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
 * {@link GenerateDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDataKeyResponseBody</p>
 */
public class GenerateDataKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
    private String ciphertextBlob;

    @com.aliyun.core.annotation.NameInMap("CiphertextForRecipient")
    private String ciphertextForRecipient;

    @com.aliyun.core.annotation.NameInMap("DataKeyName")
    private String dataKeyName;

    @com.aliyun.core.annotation.NameInMap("DataKeyVersionId")
    private String dataKeyVersionId;

    @com.aliyun.core.annotation.NameInMap("DataKeyVersionName")
    private String dataKeyVersionName;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    private String keyVersionId;

    @com.aliyun.core.annotation.NameInMap("Plaintext")
    private String plaintext;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateDataKeyResponseBody(Builder builder) {
        this.ciphertextBlob = builder.ciphertextBlob;
        this.ciphertextForRecipient = builder.ciphertextForRecipient;
        this.dataKeyName = builder.dataKeyName;
        this.dataKeyVersionId = builder.dataKeyVersionId;
        this.dataKeyVersionName = builder.dataKeyVersionName;
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
     * @return ciphertextForRecipient
     */
    public String getCiphertextForRecipient() {
        return this.ciphertextForRecipient;
    }

    /**
     * @return dataKeyName
     */
    public String getDataKeyName() {
        return this.dataKeyName;
    }

    /**
     * @return dataKeyVersionId
     */
    public String getDataKeyVersionId() {
        return this.dataKeyVersionId;
    }

    /**
     * @return dataKeyVersionName
     */
    public String getDataKeyVersionName() {
        return this.dataKeyVersionName;
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
        private String ciphertextForRecipient; 
        private String dataKeyName; 
        private String dataKeyVersionId; 
        private String dataKeyVersionName; 
        private String keyId; 
        private String keyVersionId; 
        private String plaintext; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateDataKeyResponseBody model) {
            this.ciphertextBlob = model.ciphertextBlob;
            this.ciphertextForRecipient = model.ciphertextForRecipient;
            this.dataKeyName = model.dataKeyName;
            this.dataKeyVersionId = model.dataKeyVersionId;
            this.dataKeyVersionName = model.dataKeyVersionName;
            this.keyId = model.keyId;
            this.keyVersionId = model.keyVersionId;
            this.plaintext = model.plaintext;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ciphertext of the data key (DK) encrypted by the primary version of the specified key.</p>
         * 
         * <strong>example:</strong>
         * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901qOjop4bTS****</p>
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            this.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * <p>When the Recipient parameter is passed, the public key encryption of the plaintext data key (DK) is performed by using the pubkey in the extendUserData field of the Recipient parameter, and Base64 encoding is applied.
         * The public key is the pubkey field in extendUserData.
         * This parameter takes effect only when you invoke the API operation through a KMS instance gateway.</p>
         * <blockquote>
         * <p>Notice: This parameter takes effect only when you invoke the API operation through a dedicated gateway.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NIahY6pgjK4ZMP2R0EmsmBqntrv0AI2rcDyU7Su6uOT9Le7EOvlCpjHJfr9z3M0vkfulQoyuETmKSpYDfixE3auE4MwxloT6D9Gfsk6hm5FV2iAxL//Ms2kLv6K4z6yGi7lKm2yjX4***==</p>
         */
        public Builder ciphertextForRecipient(String ciphertextForRecipient) {
            this.ciphertextForRecipient = ciphertextForRecipient;
            return this;
        }

        /**
         * <p>If the invoke is used to generate a managed data key (DK), this field is not empty and indicates the name of the generated managed data key (DK).</p>
         * 
         * <strong>example:</strong>
         * <p>example-data-key</p>
         */
        public Builder dataKeyName(String dataKeyName) {
            this.dataKeyName = dataKeyName;
            return this;
        }

        /**
         * <p>If the invoke is used to generate a managed data key (DK), this field is not empty and indicates the latest key version of the generated managed data key (DK).</p>
         * 
         * <strong>example:</strong>
         * <p>eyQEyD44</p>
         */
        public Builder dataKeyVersionId(String dataKeyVersionId) {
            this.dataKeyVersionId = dataKeyVersionId;
            return this;
        }

        /**
         * <p>If the invoke is used to generate a managed data key (DK), this field is not empty and indicates the name of the credential that stores the key material of the latest version of the generated managed data key (DK).</p>
         * 
         * <strong>example:</strong>
         * <p>kms-datakeyversion!example-data-key!eyQEyD44</p>
         */
        public Builder dataKeyVersionName(String dataKeyVersionName) {
            this.dataKeyVersionName = dataKeyVersionName;
            return this;
        }

        /**
         * <p>The key ID. If the KeyId parameter in the request is set to the alias or ARN of the key, the key ID is also returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>key-hzz630494463ejqjx****</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The key version ID, which is the globally unique identifier of the primary key version.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * <p>The value of the plaintext of the data key (DK) after Base64 encoding.</p>
         * 
         * <strong>example:</strong>
         * <p>QmFzZTY0IGVuY29kZWQgcGxhaW50****</p>
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        /**
         * <p>The ID of the request, which is a unique identifier generated by Alibaba Cloud for the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7021b6ec-4be7-4d3c-8a68-1e85d4d515a0</p>
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
