// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeKmsKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKmsKeysResponseBody</p>
 */
public class DescribeKmsKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KmsKeys")
    private KmsKeys kmsKeys;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kmsKeys
     */
    public KmsKeys getKmsKeys() {
        return this.kmsKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KmsKeys kmsKeys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeKmsKeysResponseBody model) {
            this.kmsKeys = model.kmsKeys;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried KMS keys.</p>
         */
        public Builder kmsKeys(KmsKeys kmsKeys) {
            this.kmsKeys = kmsKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F91F25F-8BCF-59E3-AF67-3806DB41FD09</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeKmsKeysResponseBody build() {
            return new DescribeKmsKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKmsKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKmsKeysResponseBody</p>
     */
    public static class KmsKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyAlias")
        private String keyAlias;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        private KmsKey(Builder builder) {
            this.keyAlias = builder.keyAlias;
            this.keyId = builder.keyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsKey create() {
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

            private Builder() {
            } 

            private Builder(KmsKey model) {
                this.keyAlias = model.keyAlias;
                this.keyId = model.keyId;
            } 

            /**
             * <p>The alias of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>mykey</p>
             */
            public Builder keyAlias(String keyAlias) {
                this.keyAlias = keyAlias;
                return this;
            }

            /**
             * <p>The ID of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>2e81355b-f8e7-4090-8082-a8f8124a621c</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            public KmsKey build() {
                return new KmsKey(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKmsKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKmsKeysResponseBody</p>
     */
    public static class KmsKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KmsKey")
        private java.util.List<KmsKey> kmsKey;

        private KmsKeys(Builder builder) {
            this.kmsKey = builder.kmsKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsKeys create() {
            return builder().build();
        }

        /**
         * @return kmsKey
         */
        public java.util.List<KmsKey> getKmsKey() {
            return this.kmsKey;
        }

        public static final class Builder {
            private java.util.List<KmsKey> kmsKey; 

            private Builder() {
            } 

            private Builder(KmsKeys model) {
                this.kmsKey = model.kmsKey;
            } 

            /**
             * KmsKey.
             */
            public Builder kmsKey(java.util.List<KmsKey> kmsKey) {
                this.kmsKey = kmsKey;
                return this;
            }

            public KmsKeys build() {
                return new KmsKeys(this);
            } 

        } 

    }
}
