// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageComponentsResponseBody</p>
 */
public class DescribeImageComponentsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("ImageComponent")
    private ImageComponent imageComponent;

    private DescribeImageComponentsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.maxResults = builder.maxResults;
        this.imageComponent = builder.imageComponent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageComponentsResponseBody create() {
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return imageComponent
     */
    public ImageComponent getImageComponent() {
        return this.imageComponent;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private Integer maxResults; 
        private ImageComponent imageComponent; 

        /**
         * The Token returned by this call. For more information, see API description.
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
         * The number of returned image components.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The list of image components.
         */
        public Builder imageComponent(ImageComponent imageComponent) {
            this.imageComponent = imageComponent;
            return this;
        }

        public DescribeImageComponentsResponseBody build() {
            return new DescribeImageComponentsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * The value of the tag.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
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
    public static class ImageComponentSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("SystemType")
        private String systemType;

        @NameInMap("ImageComponentId")
        private String imageComponentId;

        @NameInMap("ComponentType")
        private String componentType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Content")
        private String content;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Tags")
        private Tags tags;

        private ImageComponentSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.systemType = builder.systemType;
            this.imageComponentId = builder.imageComponentId;
            this.componentType = builder.componentType;
            this.resourceGroupId = builder.resourceGroupId;
            this.name = builder.name;
            this.content = builder.content;
            this.owner = builder.owner;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageComponentSet create() {
            return builder().build();
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
         * @return systemType
         */
        public String getSystemType() {
            return this.systemType;
        }

        /**
         * @return imageComponentId
         */
        public String getImageComponentId() {
            return this.imageComponentId;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String systemType; 
            private String imageComponentId; 
            private String componentType; 
            private String resourceGroupId; 
            private String name; 
            private String content; 
            private String owner; 
            private Tags tags; 

            /**
             * Component creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The operating system supported by the component.
             */
            public Builder systemType(String systemType) {
                this.systemType = systemType;
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
             * The type of the component.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The name of the component.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Component content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The type of the image component. Possible values:
             * <p>
             * 
             * -SELF: The custom image component you created.
             * -ALIYUN: The system component provided by Alibaba Cloud.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The list of key-value pairs.
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
        @NameInMap("ImageComponentSet")
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
