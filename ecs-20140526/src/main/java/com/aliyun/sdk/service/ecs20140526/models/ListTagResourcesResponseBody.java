// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagResourcesResponseBody</p>
 */
public class ListTagResourcesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagResources")
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
         * The start Token of the next query.
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
         * A collection of resources and their tags, including the resource ID, resource type, and tag key.
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
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("TagKey")
        private String tagKey;

        private TagResource(Builder builder) {
            this.tagValue = builder.tagValue;
            this.resourceType = builder.resourceType;
            this.resourceId = builder.resourceId;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagResource create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String resourceType; 
            private String resourceId; 
            private String tagKey; 

            /**
             * The value of the tag.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The type of the resource. Possible values:
             * <p>
             * 
             * -instance:ECS instance.
             * -disk: the disk.
             * -snapshot: snapshot.
             * -image: image.
             * -securitygroup: Security Group.
             * -volume: the storage volume.
             * -eni: eni.
             * -ddh: Dedicated host.
             * -ddhcluster: Dedicated host cluster.
             * -keypair:SSH key pair.
             * -launchtemplate: the launch template.
             * -reservedinstance: Reserved Instance.
             * -snapshotpolicy: automatic snapshot policy.
             * -elasticityassurance: elastic assurance.
             * -capacityreservation: capacity reservation.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public TagResource build() {
                return new TagResource(this);
            } 

        } 

    }
    public static class TagResources extends TeaModel {
        @NameInMap("TagResource")
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
