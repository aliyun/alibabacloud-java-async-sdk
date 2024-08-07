// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKmsKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKmsKeysResponseBody</p>
 */
public class DescribeKmsKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KmsKeys")
    private java.util.List < KmsKeys> kmsKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeKmsKeysResponseBody(Builder builder) {
        this.kmsKeys = builder.kmsKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKmsKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return kmsKeys
     */
    public java.util.List < KmsKeys> getKmsKeys() {
        return this.kmsKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < KmsKeys> kmsKeys; 
        private String requestId; 

        /**
         * The KMS keys.
         */
        public Builder kmsKeys(java.util.List < KmsKeys> kmsKeys) {
            this.kmsKeys = kmsKeys;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKmsKeysResponseBody build() {
            return new DescribeKmsKeysResponseBody(this);
        } 

    } 

    public static class KmsKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyAlias")
        private String keyAlias;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        private KmsKeys(Builder builder) {
            this.keyAlias = builder.keyAlias;
            this.keyId = builder.keyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsKeys create() {
            return builder().build();
        }

        /**
         * @return keyAlias
         */
        public String getKeyAlias() {
            return this.keyAlias;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        public static final class Builder {
            private String keyAlias; 
            private String keyId; 

            /**
             * The alias of the key.
             */
            public Builder keyAlias(String keyAlias) {
                this.keyAlias = keyAlias;
                return this;
            }

            /**
             * The key ID.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            public KmsKeys build() {
                return new KmsKeys(this);
            } 

        } 

    }
}
