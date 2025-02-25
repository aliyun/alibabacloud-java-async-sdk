// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
    @com.aliyun.core.annotation.NameInMap("next_token")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("tag_resources")
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>c374bf4864448****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E368C761-F8F6-4A36-9B58-BD53D5CD0CEB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the queried labels and resources.</p>
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
        @com.aliyun.core.annotation.NameInMap("resource_id")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resource_type")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("tag_key")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("tag_value")
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
             * <p>i-xxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource. For more information, see <a href="https://help.aliyun.com/document_detail/110425.html">Labels</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CLUSTER</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The key of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>ack.aliyun.com</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>c71cf3d796c374bf48644482cb0c3****</p>
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
        @com.aliyun.core.annotation.NameInMap("tag_resource")
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
             * <p>The resource and label.</p>
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
