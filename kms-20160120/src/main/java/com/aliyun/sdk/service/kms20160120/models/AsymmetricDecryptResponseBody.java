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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AsymmetricDecryptResponseBody model) {
            this.keyId = model.keyId;
            this.keyVersionId = model.keyVersionId;
            this.plaintext = model.plaintext;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         * <blockquote>
         * <p> If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The version ID of the CMK that is used to encrypt the plaintext.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * <p>The Base64-encoded plaintext that is generated after decryption.</p>
         * 
         * <strong>example:</strong>
         * <p>SGVsbG8gd29ybGQ=</p>
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>475f1620-b9d3-4d35-b5c6-3fbdd941423d</p>
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
