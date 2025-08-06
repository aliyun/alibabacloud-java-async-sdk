// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodTagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodTagResourcesResponseBody</p>
 */
public class DescribeVodTagResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagResources")
    private java.util.List<TagResources> tagResources;

    private DescribeVodTagResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagResources = builder.tagResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodTagResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagResources
     */
    public java.util.List<TagResources> getTagResources() {
        return this.tagResources;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TagResources> tagResources; 

        private Builder() {
        } 

        private Builder(DescribeVodTagResourcesResponseBody model) {
            this.requestId = model.requestId;
            this.tagResources = model.tagResources;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TagResources.
         */
        public Builder tagResources(java.util.List<TagResources> tagResources) {
            this.tagResources = tagResources;
            return this;
        }

        public DescribeVodTagResourcesResponseBody build() {
            return new DescribeVodTagResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodTagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodTagResourcesResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVodTagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodTagResourcesResponseBody</p>
     */
    public static class TagResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private TagResources(Builder builder) {
            this.resourceId = builder.resourceId;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagResources create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String resourceId; 
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(TagResources model) {
                this.resourceId = model.resourceId;
                this.tag = model.tag;
            } 

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public TagResources build() {
                return new TagResources(this);
            } 

        } 

    }
}
