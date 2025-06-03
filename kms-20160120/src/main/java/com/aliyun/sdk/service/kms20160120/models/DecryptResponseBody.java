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

        private Builder(DecryptResponseBody model) {
            this.keyId = model.keyId;
            this.keyVersionId = model.keyVersionId;
            this.plaintext = model.plaintext;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the customer master key (CMK) that is used to decrypt the ciphertext.</p>
         * <p>It is the GUID of the CMK.</p>
         * 
         * <strong>example:</strong>
         * <p>202b9877-5a25-46e3-a763-e20791b5****</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The ID of the CMK version that is used to decrypt the ciphertext.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * <p>The plaintext that is generated after decryption.</p>
         * 
         * <strong>example:</strong>
         * <p>tRYXuCwgja12xxO1N/gZERDDCLw9doZEQiPDk/Bv****</p>
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>207596a2-36d3-4840-b1bd-f87044699bd7</p>
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
