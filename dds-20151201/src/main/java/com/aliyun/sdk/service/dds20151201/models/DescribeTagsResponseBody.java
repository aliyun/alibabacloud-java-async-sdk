// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsResponseBody</p>
 */
public class DescribeTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private DescribeTagsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTagsResponseBody create() {
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<Tags> tags; 

        /**
         * <p>The token used to start the next query.</p>
         * <blockquote>
         * <p> If not all results are returned in the first query, this parameter is returned. You can pass in the value of this parameter in the next query.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>212db86****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EEDBE38F-5CF5-4316-AAC2-35817BA60D68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details about the tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public DescribeTagsResponseBody build() {
            return new DescribeTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTagsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValues")
        private java.util.List<String> tagValues;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String tagKey; 
            private java.util.List<String> tagValues; 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>newKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The values of the tags.</p>
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
