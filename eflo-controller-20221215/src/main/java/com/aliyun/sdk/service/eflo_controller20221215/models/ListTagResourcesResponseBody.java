// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
     * @return tagResources
     */
    public TagResources getTagResources() {
        return this.tagResources;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private TagResources tagResources; 

        private Builder() {
        } 

        private Builder(ListTagResourcesResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.tagResources = model.tagResources;
        } 

        /**
         * <p>NextToken for the next page, include this returned value when requesting the next page</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdQ3Z+oPlg49gsr2y8jb6wY=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>8F208B6D-4C42-5FD3-B6BE-E826E92A44DD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Tagged resources.</p>
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

            private Builder() {
            } 

            private Builder(TagResource model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>Resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>i15azeddnvf7uhw2oij57o0</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Resource type</p>
             * 
             * <strong>example:</strong>
             * <p>Cluster</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>Tag key</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>Tag value</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
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

            private Builder() {
            } 

            private Builder(TagResources model) {
                this.tagResource = model.tagResource;
            } 

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
