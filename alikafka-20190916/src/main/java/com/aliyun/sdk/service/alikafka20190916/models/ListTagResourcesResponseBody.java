// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The token that determines the start point of the next query.
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
         * Details of the resource and tags, such as the resource ID, the resource type, tag keys, and tag values.
         */
        public Builder tagResources(TagResources tagResources) {
            this.tagResources = tagResources;
            return this;
        }

        public ListTagResourcesResponseBody build() {
            return new ListTagResourcesResponseBody(this);
        } 

    } 

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
             * The ID of the resource. A resource ID complies with the following rules:
             * <p>
             * 
             * *   The resource ID of an instance is the value of the instanceId parameter.
             * *   The resource ID of a topic is the value of the Kafka_alikafka_instanceId_topic parameter.
             * *   The resource ID of a consumer group is the value of the Kafka_alikafka_instanceId_consumerGroup parameter.
             * 
             * For example, the resources whose tags you want to query include the alikafka_post-cn-v0h1fgs2xxxx instance, the test-topic topic, and the test-consumer-group consumer group. In this case, their resource IDs are alikafka_post-cn-v0h1fgs2xxxx, Kafka_alikafka_post-cn-v0h1fgs2xxxx_test-topic, and Kafka_alikafka_post-cn-v0h1fgs2xxxx_test-consumer-group.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource. The value is an enumerated value. Valid values:
             * <p>
             * 
             * *   **Instance**
             * *   **Topic**
             * *   **Consumergroup**
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class TagResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagResource")
        private java.util.List < TagResource> tagResource;

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
        public java.util.List < TagResource> getTagResource() {
            return this.tagResource;
        }

        public static final class Builder {
            private java.util.List < TagResource> tagResource; 

            /**
             * TagResource.
             */
            public Builder tagResource(java.util.List < TagResource> tagResource) {
                this.tagResource = tagResource;
                return this;
            }

            public TagResources build() {
                return new TagResources(this);
            } 

        } 

    }
}
