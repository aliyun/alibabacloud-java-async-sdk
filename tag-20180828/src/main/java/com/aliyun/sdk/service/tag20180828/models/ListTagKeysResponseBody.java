// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagKeysResponseBody</p>
 */
public class ListTagKeysResponseBody extends TeaModel {
    @NameInMap("Keys")
    private Keys keys;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
    public Keys getKeys() {
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
        private Keys keys; 
        private String nextToken; 
        private String requestId; 

        /**
         * The information of the tag keys.
         */
        public Builder keys(Keys keys) {
            this.keys = keys;
            return this;
        }

        /**
         * Indicates whether the next query is required. The value of this parameter may be empty.
         * <p>
         * 
         * *   If the value of this parameter is empty (`"NextToken": ""`), all results are returned, and the next query is not required.
         * *   If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTagKeysResponseBody build() {
            return new ListTagKeysResponseBody(this);
        } 

    } 

    public static class Key extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Description")
        private String description;

        @NameInMap("Key")
        private String key;

        private Key(Builder builder) {
            this.category = builder.category;
            this.description = builder.description;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Key create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String category; 
            private String description; 
            private String key; 

            /**
             * The type of the resource tag. Valid values:
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
             * The description of the tag key.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Key build() {
                return new Key(this);
            } 

        } 

    }
    public static class Keys extends TeaModel {
        @NameInMap("Key")
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
             * The tag key.
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
