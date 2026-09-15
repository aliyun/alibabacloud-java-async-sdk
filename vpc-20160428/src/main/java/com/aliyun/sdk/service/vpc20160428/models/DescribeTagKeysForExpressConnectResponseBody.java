// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeTagKeysForExpressConnectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagKeysForExpressConnectResponseBody</p>
 */
public class DescribeTagKeysForExpressConnectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagKeys")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeTagKeysForExpressConnectResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.tagKeys = model.tagKeys;
        } 

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
         * <li>If <strong>NextToken</strong> has a return value, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TagKeys.
         */
        public Builder tagKeys(TagKeys tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        public DescribeTagKeysForExpressConnectResponseBody build() {
            return new DescribeTagKeysForExpressConnectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTagKeysForExpressConnectResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagKeysForExpressConnectResponseBody</p>
     */
    public static class TagKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(TagKey model) {
                this.tagKey = model.tagKey;
                this.type = model.type;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * Type.
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
    /**
     * 
     * {@link DescribeTagKeysForExpressConnectResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagKeysForExpressConnectResponseBody</p>
     */
    public static class TagKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private java.util.List<TagKey> tagKey;

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
        public java.util.List<TagKey> getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private java.util.List<TagKey> tagKey; 

            private Builder() {
            } 

            private Builder(TagKeys model) {
                this.tagKey = model.tagKey;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(java.util.List<TagKey> tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public TagKeys build() {
                return new TagKeys(this);
            } 

        } 

    }
}
