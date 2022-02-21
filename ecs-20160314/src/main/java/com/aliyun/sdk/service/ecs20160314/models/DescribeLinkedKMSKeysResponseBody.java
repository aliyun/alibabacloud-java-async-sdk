// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLinkedKMSKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLinkedKMSKeysResponseBody</p>
 */
public class DescribeLinkedKMSKeysResponseBody extends TeaModel {
    @NameInMap("KMSKeys")
    private KMSKeys KMSKeys;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLinkedKMSKeysResponseBody(Builder builder) {
        this.KMSKeys = builder.KMSKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLinkedKMSKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return KMSKeys
     */
    public KMSKeys getKMSKeys() {
        return this.KMSKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KMSKeys KMSKeys; 
        private String requestId; 

        /**
         * KMSKeys.
         */
        public Builder KMSKeys(KMSKeys KMSKeys) {
            this.KMSKeys = KMSKeys;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLinkedKMSKeysResponseBody build() {
            return new DescribeLinkedKMSKeysResponseBody(this);
        } 

    } 

    public static class KMSKey extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("KMSKeyId")
        private String KMSKeyId;

        private KMSKey(Builder builder) {
            this.alias = builder.alias;
            this.KMSKeyId = builder.KMSKeyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KMSKey create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return KMSKeyId
         */
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public static final class Builder {
            private String alias; 
            private String KMSKeyId; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * KMSKeyId.
             */
            public Builder KMSKeyId(String KMSKeyId) {
                this.KMSKeyId = KMSKeyId;
                return this;
            }

            public KMSKey build() {
                return new KMSKey(this);
            } 

        } 

    }
    public static class KMSKeys extends TeaModel {
        @NameInMap("KMSKey")
        private java.util.List < KMSKey> KMSKey;

        private KMSKeys(Builder builder) {
            this.KMSKey = builder.KMSKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KMSKeys create() {
            return builder().build();
        }

        /**
         * @return KMSKey
         */
        public java.util.List < KMSKey> getKMSKey() {
            return this.KMSKey;
        }

        public static final class Builder {
            private java.util.List < KMSKey> KMSKey; 

            /**
             * KMSKey.
             */
            public Builder KMSKey(java.util.List < KMSKey> KMSKey) {
                this.KMSKey = KMSKey;
                return this;
            }

            public KMSKeys build() {
                return new KMSKeys(this);
            } 

        } 

    }
}
