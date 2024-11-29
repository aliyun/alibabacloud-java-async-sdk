// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagKeysResponseBody</p>
 */
public class DescribeTagKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagKeys")
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
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If the value of <strong>NextToken</strong> is not returned, it indicates that no next query is to be sent.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value is the token that is used for the subsequent query.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DE65F6B7-7566-4802-9007-96F2494AC512</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of tag keys.</p>
         */
        public Builder tagKeys(TagKeys tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        public DescribeTagKeysResponseBody build() {
            return new DescribeTagKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTagKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagKeysResponseBody</p>
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The type of the tag key. Valid values:</p>
             * <ul>
             * <li><strong>Custom</strong>: custom</li>
             * <li><strong>System</strong>: system</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
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
     * {@link DescribeTagKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagKeysResponseBody</p>
     */
    public static class TagKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
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
