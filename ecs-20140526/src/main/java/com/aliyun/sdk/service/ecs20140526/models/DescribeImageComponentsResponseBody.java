// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageComponentsResponseBody</p>
 */
public class DescribeImageComponentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageComponent")
    private ImageComponent imageComponent;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageComponentsResponseBody(Builder builder) {
        this.imageComponent = builder.imageComponent;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageComponentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageComponent
     */
    public ImageComponent getImageComponent() {
        return this.imageComponent;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ImageComponent imageComponent; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the image components.
         */
        public Builder imageComponent(ImageComponent imageComponent) {
            this.imageComponent = imageComponent;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. For information about how to use the returned value, see the "Usage notes" section of this topic.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of image components returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageComponentsResponseBody build() {
            return new DescribeImageComponentsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
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
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    public static class ImageComponentSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageComponentId")
        private String imageComponentId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SystemType")
        private String systemType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private ImageComponentSet(Builder builder) {
            this.componentType = builder.componentType;
            this.content = builder.content;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.imageComponentId = builder.imageComponentId;
            this.name = builder.name;
            this.owner = builder.owner;
            this.resourceGroupId = builder.resourceGroupId;
            this.systemType = builder.systemType;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageComponentSet create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageComponentId
         */
        public String getImageComponentId() {
            return this.imageComponentId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return systemType
         */
        public String getSystemType() {
            return this.systemType;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String componentType; 
            private String content; 
            private String creationTime; 
            private String description; 
            private String imageComponentId; 
            private String name; 
            private String owner; 
            private String resourceGroupId; 
            private String systemType; 
            private Tags tags; 

            /**
             * The type of the image component.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * The content of the image component.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The time when the image component was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the image component.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the image component.
             */
            public Builder imageComponentId(String imageComponentId) {
                this.imageComponentId = imageComponentId;
                return this;
            }

            /**
             * The name of the image component.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the image component. Valid values:
             * <p>
             * 
             * *   SELF: the custom component that you created.
             * *   ALIYUN: the system component provided by Alibaba Cloud.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the resource group to which the image component belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the operating system supported by the image component.
             */
            public Builder systemType(String systemType) {
                this.systemType = systemType;
                return this;
            }

            /**
             * The tags of the image component.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public ImageComponentSet build() {
                return new ImageComponentSet(this);
            } 

        } 

    }
    public static class ImageComponent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageComponentSet")
        private java.util.List < ImageComponentSet> imageComponentSet;

        private ImageComponent(Builder builder) {
            this.imageComponentSet = builder.imageComponentSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageComponent create() {
            return builder().build();
        }

        /**
         * @return imageComponentSet
         */
        public java.util.List < ImageComponentSet> getImageComponentSet() {
            return this.imageComponentSet;
        }

        public static final class Builder {
            private java.util.List < ImageComponentSet> imageComponentSet; 

            /**
             * ImageComponentSet.
             */
            public Builder imageComponentSet(java.util.List < ImageComponentSet> imageComponentSet) {
                this.imageComponentSet = imageComponentSet;
                return this;
            }

            public ImageComponent build() {
                return new ImageComponent(this);
            } 

        } 

    }
}
