// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEncryptionKeyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEncryptionKeyListResponseBody</p>
 */
public class DescribeEncryptionKeyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyIds")
    private KeyIds keyIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEncryptionKeyListResponseBody(Builder builder) {
        this.keyIds = builder.keyIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEncryptionKeyListResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyIds
     */
    public KeyIds getKeyIds() {
        return this.keyIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KeyIds keyIds; 
        private String requestId; 

        /**
         * <p>The custom keys that are available in the region.</p>
         */
        public Builder keyIds(KeyIds keyIds) {
            this.keyIds = keyIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10E2160B-959C-5C3E-BFE6-86EC5925****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEncryptionKeyListResponseBody build() {
            return new DescribeEncryptionKeyListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEncryptionKeyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEncryptionKeyListResponseBody</p>
     */
    public static class KeyIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyId")
        private java.util.List < String > keyId;

        private KeyIds(Builder builder) {
            this.keyId = builder.keyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyIds create() {
            return builder().build();
        }

        /**
         * @return keyId
         */
        public java.util.List < String > getKeyId() {
            return this.keyId;
        }

        public static final class Builder {
            private java.util.List < String > keyId; 

            /**
             * KeyId.
             */
            public Builder keyId(java.util.List < String > keyId) {
                this.keyId = keyId;
                return this;
            }

            public KeyIds build() {
                return new KeyIds(this);
            } 

        } 

    }
}
