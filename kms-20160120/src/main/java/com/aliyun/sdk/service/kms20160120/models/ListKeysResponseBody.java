// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * An array that consists of the CMKs of the current Alibaba Cloud account in the current region.
         */
        public Builder keys(Keys keys) {
            this.keys = keys;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of CMKs.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKeysResponseBody build() {
            return new ListKeysResponseBody(this);
        } 

    } 

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

            /**
             * The Alibaba Cloud Resource Name (ARN) of the CMK.
             */
            public Builder keyArn(String keyArn) {
                this.keyArn = keyArn;
                return this;
            }

            /**
             * The ID of the CMK. The ID must be globally unique.
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
    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private java.util.List < Key> key;

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
        public java.util.List < Key> getKey() {
            return this.key;
        }

        public static final class Builder {
            private java.util.List < Key> key; 

            /**
             * Key.
             */
            public Builder key(java.util.List < Key> key) {
                this.key = key;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
}
