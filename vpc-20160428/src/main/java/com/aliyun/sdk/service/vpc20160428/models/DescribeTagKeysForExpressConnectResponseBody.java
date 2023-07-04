// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagKeysForExpressConnectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagKeysForExpressConnectResponseBody</p>
 */
public class DescribeTagKeysForExpressConnectResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagKeys")
    private TagKeys tagKeys;

    private DescribeTagKeysForExpressConnectResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagKeysForExpressConnectResponseBody create() {
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
         * *   If no value is returned for **NextToken**, no next queries are sent.
         * *   If a value is returned for **NextToken**, the value is the token that is used for the next query.
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

        public DescribeTagKeysForExpressConnectResponseBody build() {
            return new DescribeTagKeysForExpressConnectResponseBody(this);
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
             * The type of the resource. The value is set to **PHYSICALCONNECTION**, which indicates an Express Connect circuit.
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
