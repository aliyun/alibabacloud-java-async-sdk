// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEncryptionKeyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEncryptionKeyListResponseBody</p>
 */
public class DescribeEncryptionKeyListResponseBody extends TeaModel {
    @NameInMap("KeyIds")
    private KeyIds keyIds;

    @NameInMap("RequestId")
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
         * KeyIds.
         */
        public Builder keyIds(KeyIds keyIds) {
            this.keyIds = keyIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEncryptionKeyListResponseBody build() {
            return new DescribeEncryptionKeyListResponseBody(this);
        } 

    } 

    public static class KeyIds extends TeaModel {
        @NameInMap("KeyId")
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
