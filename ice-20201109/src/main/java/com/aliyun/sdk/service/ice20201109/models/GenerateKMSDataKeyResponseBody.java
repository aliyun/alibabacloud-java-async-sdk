// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * DataKey.
         */
        public Builder dataKey(DataKey dataKey) {
            this.dataKey = dataKey;
            return this;
        }

        /**
         * RequestId.
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
             * Plaintext.
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
