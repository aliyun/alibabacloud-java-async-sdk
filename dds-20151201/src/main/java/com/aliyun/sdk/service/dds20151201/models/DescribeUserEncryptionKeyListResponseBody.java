// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserEncryptionKeyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserEncryptionKeyListResponseBody</p>
 */
public class DescribeUserEncryptionKeyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyIds")
    private KeyIds keyIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserEncryptionKeyListResponseBody(Builder builder) {
        this.keyIds = builder.keyIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserEncryptionKeyListResponseBody create() {
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
         * The list of custom keys.
         */
        public Builder keyIds(KeyIds keyIds) {
            this.keyIds = keyIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserEncryptionKeyListResponseBody build() {
            return new DescribeUserEncryptionKeyListResponseBody(this);
        } 

    } 

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
