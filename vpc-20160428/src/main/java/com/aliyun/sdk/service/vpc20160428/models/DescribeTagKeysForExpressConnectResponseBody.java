// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
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
         * <p>The tag keys.</p>
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

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The type of the resource. The value is set to <strong>PHYSICALCONNECTION</strong>, which indicates an Express Connect circuit.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICALCONNECTION</p>
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
             * <p>The key of the tag.</p>
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
