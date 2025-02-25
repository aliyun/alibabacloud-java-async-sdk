// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ListTagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagResourcesResponseBody</p>
 */
public class ListTagResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagResources")
    private TagResources tagResources;

    private ListTagResourcesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tagResources = builder.tagResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesResponseBody create() {
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
     * @return tagResources
     */
    public TagResources getTagResources() {
        return this.tagResources;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private TagResources tagResources; 

        /**
         * <p>The token that determines the start point of the next query.</p>
         * <p>A NextToken value of -1 indicates that a next query does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86sca4384811e0b5e8707e68181f</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2D69A58F-345C-4FDE-88E4-BF5189484043</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource list.</p>
         */
        public Builder tagResources(TagResources tagResources) {
            this.tagResources = tagResources;
            return this;
        }

        public ListTagResourcesResponseBody build() {
            return new ListTagResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagResourcesResponseBody</p>
     */
    public static class TagResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private TagResource(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagResource create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>285bb759342649a1b70c2093a772e087</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>apiGroup</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public TagResource build() {
                return new TagResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTagResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagResourcesResponseBody</p>
     */
    public static class TagResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagResource")
        private java.util.List<TagResource> tagResource;

        private TagResources(Builder builder) {
            this.tagResource = builder.tagResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagResources create() {
            return builder().build();
        }

        /**
         * @return tagResource
         */
        public java.util.List<TagResource> getTagResource() {
            return this.tagResource;
        }

        public static final class Builder {
            private java.util.List<TagResource> tagResource; 

            /**
             * TagResource.
             */
            public Builder tagResource(java.util.List<TagResource> tagResource) {
                this.tagResource = tagResource;
                return this;
            }

            public TagResources build() {
                return new TagResources(this);
            } 

        } 

    }
}
