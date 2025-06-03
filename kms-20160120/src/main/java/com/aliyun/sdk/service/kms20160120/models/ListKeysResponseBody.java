// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link ListKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListKeysResponseBody</p>
 */
public class ListKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keys")
    private Keys keys;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListKeysResponseBody(Builder builder) {
        this.keys = builder.keys;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keys
     */
    public Keys getKeys() {
        return this.keys;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Keys keys; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListKeysResponseBody model) {
            this.keys = model.keys;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>An array that consists of the CMKs of the current Alibaba Cloud account in the current region.</p>
         */
        public Builder keys(Keys keys) {
            this.keys = keys;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8252db58-2036-408c-a3d5-56e656dc2551</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of CMKs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKeysResponseBody build() {
            return new ListKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListKeysResponseBody</p>
     */
    public static class Key extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyArn")
        private String keyArn;

        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        private Key(Builder builder) {
            this.keyArn = builder.keyArn;
            this.keyId = builder.keyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Key create() {
            return builder().build();
        }

        /**
         * @return keyArn
         */
        public String getKeyArn() {
            return this.keyArn;
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        public static final class Builder {
            private String keyArn; 
            private String keyId; 

            private Builder() {
            } 

            private Builder(Key model) {
                this.keyArn = model.keyArn;
                this.keyId = model.keyId;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the CMK.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:kms:cn-hangzhou:123456:key/80e9409f-78fa-42ab-84bd-83f40c81****</p>
             */
            public Builder keyArn(String keyArn) {
                this.keyArn = keyArn;
                return this;
            }

            /**
             * <p>The ID of the CMK. The ID must be globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            public Key build() {
                return new Key(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListKeysResponseBody</p>
     */
    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private java.util.List<Key> key;

        private Keys(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keys create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public java.util.List<Key> getKey() {
            return this.key;
        }

        public static final class Builder {
            private java.util.List<Key> key; 

            private Builder() {
            } 

            private Builder(Keys model) {
                this.key = model.key;
            } 

            /**
             * Key.
             */
            public Builder key(java.util.List<Key> key) {
                this.key = key;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
}
