// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagKeysResponseBody</p>
 */
public class ListTagKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keys")
    private Keys keys;

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
         * <p>The information of the tag keys.</p>
         */
        public Builder keys(Keys keys) {
            this.keys = keys;
            return this;
        }

        /**
         * <p>Indicates whether the next query is required. The value of this parameter may be empty.</p>
         * <ul>
         * <li>If the value of this parameter is empty (<code>&quot;NextToken&quot;: &quot;&quot;</code>), all results are returned, and the next query is not required.</li>
         * <li>If the value of this parameter is not empty, the next query is required, and the value is the token used to start the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC09A6AA-2713-4E10-A2E9-E6C5C43A8842</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTagKeysResponseBody build() {
            return new ListTagKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagKeysResponseBody</p>
     */
    public static class Key extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
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
             * <p>The type of the resource tag. Valid values:</p>
             * <ul>
             * <li>custom</li>
             * <li>system</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The description of the tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Business team</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>team</p>
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
    /**
     * 
     * {@link ListTagKeysResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagKeysResponseBody</p>
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>team</p>
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
