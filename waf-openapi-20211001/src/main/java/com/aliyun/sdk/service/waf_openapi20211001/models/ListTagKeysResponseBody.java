// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagKeysResponseBody</p>
 */
public class ListTagKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List < Keys> keys;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTagKeysResponseBody(Builder builder) {
        this.keys = builder.keys;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return keys
     */
    public java.util.List < Keys> getKeys() {
        return this.keys;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Keys> keys; 
        private String nextToken; 
        private String requestId; 

        /**
         * The keys and types of the tags.
         */
        public Builder keys(java.util.List < Keys> keys) {
            this.keys = keys;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTagKeysResponseBody build() {
            return new ListTagKeysResponseBody(this);
        } 

    } 

    public static class Keys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private Keys(Builder builder) {
            this.category = builder.category;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keys create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String category; 
            private String key; 

            /**
             * The type of the tag. Valid values:
             * <p>
             * 
             * *   custom
             * *   system
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Keys build() {
                return new Keys(this);
            } 

        } 

    }
}
