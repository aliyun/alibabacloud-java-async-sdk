// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GenerateKMSDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateKMSDataKeyResponseBody</p>
 */
public class GenerateKMSDataKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataKey")
    private DataKey dataKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateKMSDataKeyResponseBody(Builder builder) {
        this.dataKey = builder.dataKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateKMSDataKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataKey
     */
    public DataKey getDataKey() {
        return this.dataKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataKey dataKey; 
        private String requestId; 

        /**
         * <p>The information about the data key.</p>
         */
        public Builder dataKey(DataKey dataKey) {
            this.dataKey = dataKey;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateKMSDataKeyResponseBody build() {
            return new GenerateKMSDataKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateKMSDataKeyResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateKMSDataKeyResponseBody</p>
     */
    public static class DataKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CiphertextBlob")
        private String ciphertextBlob;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("Plaintext")
        private String plaintext;

        private DataKey(Builder builder) {
            this.ciphertextBlob = builder.ciphertextBlob;
            this.keyId = builder.keyId;
            this.plaintext = builder.plaintext;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataKey create() {
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

        public static final class Builder {
            private String ciphertextBlob; 
            private String keyId; 
            private String plaintext; 

            /**
             * <p>The ciphertext of the encrypted data key. This parameter is used as CipherText when you create a transcoding job.</p>
             * 
             * <strong>example:</strong>
             * <p>ODZhOWVmZDktM2QxNi00ODk0LWJkNGYtMWZjNDNmM2YyYWJmS7FmDBBQ0BkKsQrtRnidtPwirmDcS0ZuJCU41xxAAWk4Z8qsADfbV0b+i6kQmlvj79dJdGOvtX69Uycs901qOjop4bTS****</p>
             */
            public Builder ciphertextBlob(String ciphertextBlob) {
                this.ciphertextBlob = ciphertextBlob;
                return this;
            }

            /**
             * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>7906979c-8e06-46a2-be2d-68e3ccbc****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The Base64-encoded plaintext of the data key.</p>
             * 
             * <strong>example:</strong>
             * <p>QmFzZTY0IGVuY29kZWQgcGxhaW50****</p>
             */
            public Builder plaintext(String plaintext) {
                this.plaintext = plaintext;
                return this;
            }

            public DataKey build() {
                return new DataKey(this);
            } 

        } 

    }
}
