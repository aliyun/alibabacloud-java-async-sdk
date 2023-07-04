// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagKeysResponseBody</p>
 */
public class DescribeTagKeysResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagKeys")
    private TagKeys tagKeys;

    private DescribeTagKeysResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagKeysResponseBody create() {
        return builder().build();
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

    /**
     * @return tagKeys
     */
    public TagKeys getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private TagKeys tagKeys; 

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If the value of **NextToken** is not returned, it indicates that no next query is to be sent.
         * *   If a value of **NextToken** is returned, the value is the token that is used for the subsequent query.
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

        /**
         * The list of tag keys.
         */
        public Builder tagKeys(TagKeys tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        public DescribeTagKeysResponseBody build() {
            return new DescribeTagKeysResponseBody(this);
        } 

    } 

    public static class TagKey extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("Type")
        private String type;

        private TagKey(Builder builder) {
            this.tagKey = builder.tagKey;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagKey create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String tagKey; 
            private String type; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The type of the tag key. Valid values:
             * <p>
             * 
             * *   **Custom**: custom
             * *   **System**: system
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TagKey build() {
                return new TagKey(this);
            } 

        } 

    }
    public static class TagKeys extends TeaModel {
        @NameInMap("TagKey")
        private java.util.List < TagKey> tagKey;

        private TagKeys(Builder builder) {
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagKeys create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public java.util.List < TagKey> getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private java.util.List < TagKey> tagKey; 

            /**
             * The tag key.
             */
            public Builder tagKey(java.util.List < TagKey> tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public TagKeys build() {
                return new TagKeys(this);
            } 

        } 

    }
}
