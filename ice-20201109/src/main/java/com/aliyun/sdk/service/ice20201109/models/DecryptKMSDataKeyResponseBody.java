// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DecryptKMSDataKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DecryptKMSDataKeyResponseBody</p>
 */
public class DecryptKMSDataKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataKey")
    private DataKey dataKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DecryptKMSDataKeyResponseBody(Builder builder) {
        this.dataKey = builder.dataKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecryptKMSDataKeyResponseBody create() {
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
         * <p>The information about the decryption result.</p>
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

        public DecryptKMSDataKeyResponseBody build() {
            return new DecryptKMSDataKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DecryptKMSDataKeyResponseBody} extends {@link TeaModel}
     *
     * <p>DecryptKMSDataKeyResponseBody</p>
     */
    public static class DataKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("Plaintext")
        private String plaintext;

        private DataKey(Builder builder) {
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
            private String keyId; 
            private String plaintext; 

            /**
             * <p>The ID of the customer master key (CMK) that was used to decrypt the ciphertext.</p>
             * 
             * <strong>example:</strong>
             * <p>202b9877-5a25-46e3-a763-e20791b5****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
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

            public DataKey build() {
                return new DataKey(this);
            } 

        } 

    }
}
