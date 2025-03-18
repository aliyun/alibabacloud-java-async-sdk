// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeUserEncryptionKeyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserEncryptionKeyListResponseBody</p>
 */
public class DescribeUserEncryptionKeyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KmsKeys")
    private java.util.List<KmsKeys> kmsKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserEncryptionKeyListResponseBody(Builder builder) {
        this.kmsKeys = builder.kmsKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserEncryptionKeyListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kmsKeys
     */
    public java.util.List<KmsKeys> getKmsKeys() {
        return this.kmsKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<KmsKeys> kmsKeys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserEncryptionKeyListResponseBody model) {
            this.kmsKeys = model.kmsKeys;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the KMS keys.</p>
         */
        public Builder kmsKeys(java.util.List<KmsKeys> kmsKeys) {
            this.kmsKeys = kmsKeys;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserEncryptionKeyListResponseBody build() {
            return new DescribeUserEncryptionKeyListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserEncryptionKeyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserEncryptionKeyListResponseBody</p>
     */
    public static class KmsKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        private KmsKeys(Builder builder) {
            this.keyId = builder.keyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsKeys create() {
            return builder().build();
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        public static final class Builder {
            private String keyId; 

            private Builder() {
            } 

            private Builder(KmsKeys model) {
                this.keyId = model.keyId;
            } 

            /**
             * <p>The ID of the KMS key.</p>
             * 
             * <strong>example:</strong>
             * <p>0b8b1825-fd99-418f-875e-e4dec1dd8715</p>
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
