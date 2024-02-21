// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsResponseBody</p>
 */
public class DescribeTagsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tags")
    private Tags tags;

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
    public Tags getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Tags tags; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        public DescribeTagsResponseBody build() {
            return new DescribeTagsResponseBody(this);
        } 

    } 

    public static class TagValues extends TeaModel {
        @NameInMap("TagValue")
        private java.util.List < String > tagValue;

        private TagValues(Builder builder) {
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagValues create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public java.util.List < String > getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private java.util.List < String > tagValue; 

            /**
             * TagValue.
             */
            public Builder tagValue(java.util.List < String > tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagValues build() {
                return new TagValues(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValues")
        private TagValues tagValues;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
        public TagValues getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String tagKey; 
            private TagValues tagValues; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValues.
             */
            public Builder tagValues(TagValues tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
