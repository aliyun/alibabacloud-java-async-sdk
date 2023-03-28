// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagePipelinesResponseBody</p>
 */
public class DescribeImagePipelinesResponseBody extends TeaModel {
    @NameInMap("ImagePipeline")
    private ImagePipeline imagePipeline;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImagePipelinesResponseBody(Builder builder) {
        this.imagePipeline = builder.imagePipeline;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagePipelinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return imagePipeline
     */
    public ImagePipeline getImagePipeline() {
        return this.imagePipeline;
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
        private ImagePipeline imagePipeline; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details of the image templates.
         */
        public Builder imagePipeline(ImagePipeline imagePipeline) {
            this.imagePipeline = imagePipeline;
            return this;
        }

        /**
         * The maximum number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The query token returned in this call. For information about how to use this return value, see the "Description" section in this topic.
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
         * The total number of image templates returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImagePipelinesResponseBody build() {
            return new DescribeImagePipelinesResponseBody(this);
        } 

    } 

    public static class AddAccounts extends TeaModel {
        @NameInMap("AddAccount")
        private java.util.List < String > addAccount;

        private AddAccounts(Builder builder) {
            this.addAccount = builder.addAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddAccounts create() {
            return builder().build();
        }

        /**
         * @return addAccount
         */
        public java.util.List < String > getAddAccount() {
            return this.addAccount;
        }

        public static final class Builder {
            private java.util.List < String > addAccount; 

            /**
             * AddAccount.
             */
            public Builder addAccount(java.util.List < String > addAccount) {
                this.addAccount = addAccount;
                return this;
            }

            public AddAccounts build() {
                return new AddAccounts(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * The tag key of the image template.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the image template.
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
    public static class ToRegionIds extends TeaModel {
        @NameInMap("ToRegionId")
        private java.util.List < String > toRegionId;

        private ToRegionIds(Builder builder) {
            this.toRegionId = builder.toRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToRegionIds create() {
            return builder().build();
        }

        /**
         * @return toRegionId
         */
        public java.util.List < String > getToRegionId() {
            return this.toRegionId;
        }

        public static final class Builder {
            private java.util.List < String > toRegionId; 

            /**
             * ToRegionId.
             */
            public Builder toRegionId(java.util.List < String > toRegionId) {
                this.toRegionId = toRegionId;
                return this;
            }

            public ToRegionIds build() {
                return new ToRegionIds(this);
            } 

        } 

    }
    public static class ImagePipelineSet extends TeaModel {
        @NameInMap("AddAccounts")
        private AddAccounts addAccounts;

        @NameInMap("BaseImage")
        private String baseImage;

        @NameInMap("BaseImageType")
        private String baseImageType;

        @NameInMap("BuildContent")
        private String buildContent;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeleteInstanceOnFailure")
        private Boolean deleteInstanceOnFailure;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImagePipelineId")
        private String imagePipelineId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("ToRegionIds")
        private ToRegionIds toRegionIds;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private ImagePipelineSet(Builder builder) {
            this.addAccounts = builder.addAccounts;
            this.baseImage = builder.baseImage;
            this.baseImageType = builder.baseImageType;
            this.buildContent = builder.buildContent;
            this.creationTime = builder.creationTime;
            this.deleteInstanceOnFailure = builder.deleteInstanceOnFailure;
            this.description = builder.description;
            this.imageName = builder.imageName;
            this.imagePipelineId = builder.imagePipelineId;
            this.instanceType = builder.instanceType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
            this.toRegionIds = builder.toRegionIds;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImagePipelineSet create() {
            return builder().build();
        }

        /**
         * @return addAccounts
         */
        public AddAccounts getAddAccounts() {
            return this.addAccounts;
        }

        /**
         * @return baseImage
         */
        public String getBaseImage() {
            return this.baseImage;
        }

        /**
         * @return baseImageType
         */
        public String getBaseImageType() {
            return this.baseImageType;
        }

        /**
         * @return buildContent
         */
        public String getBuildContent() {
            return this.buildContent;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deleteInstanceOnFailure
         */
        public Boolean getDeleteInstanceOnFailure() {
            return this.deleteInstanceOnFailure;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imagePipelineId
         */
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return toRegionIds
         */
        public ToRegionIds getToRegionIds() {
            return this.toRegionIds;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private AddAccounts addAccounts; 
            private String baseImage; 
            private String baseImageType; 
            private String buildContent; 
            private String creationTime; 
            private Boolean deleteInstanceOnFailure; 
            private String description; 
            private String imageName; 
            private String imagePipelineId; 
            private String instanceType; 
            private Integer internetMaxBandwidthOut; 
            private String name; 
            private String resourceGroupId; 
            private Integer systemDiskSize; 
            private Tags tags; 
            private ToRegionIds toRegionIds; 
            private String vSwitchId; 

            /**
             * The IDs of Alibaba Cloud accounts to which to share the created image.
             */
            public Builder addAccounts(AddAccounts addAccounts) {
                this.addAccounts = addAccounts;
                return this;
            }

            /**
             * The source image.
             * <p>
             * 
             * *   When `BaseImageType` is set to IMAGE, the value of this parameter is the ID of a custom image.
             * *   When `BaseImageType` is set to IMAGE_FAMILY, the value of this parameter is the name of an image family.
             */
            public Builder baseImage(String baseImage) {
                this.baseImage = baseImage;
                return this;
            }

            /**
             * The type of the source image. Valid values:
             * <p>
             * 
             * *   IMAGE: custom image
             * *   IMAGE_FAMILY: image family
             */
            public Builder baseImageType(String baseImageType) {
                this.baseImageType = baseImageType;
                return this;
            }

            /**
             * The content of the image template.
             */
            public Builder buildContent(String buildContent) {
                this.buildContent = buildContent;
                return this;
            }

            /**
             * The time when the image template was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Indicates whether to release the intermediate instance when the image fails to be created.
             */
            public Builder deleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
                this.deleteInstanceOnFailure = deleteInstanceOnFailure;
                return this;
            }

            /**
             * The description of the image template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name prefix of the created image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The ID of the image template.
             */
            public Builder imagePipelineId(String imagePipelineId) {
                this.imagePipelineId = imagePipelineId;
                return this;
            }

            /**
             * The instance type of the intermediate instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The size of the outbound public bandwidth for the intermediate instance. Unit: Mbit/s.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * The name of the image template.
             */
            public Builder name(String name) {
                this.name = name;
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
             * The system disk size of the intermediate instance. Unit: GiB.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * The tags of the image template.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The IDs of regions to which to distribute the created image.
             */
            public Builder toRegionIds(ToRegionIds toRegionIds) {
                this.toRegionIds = toRegionIds;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public ImagePipelineSet build() {
                return new ImagePipelineSet(this);
            } 

        } 

    }
    public static class ImagePipeline extends TeaModel {
        @NameInMap("ImagePipelineSet")
        private java.util.List < ImagePipelineSet> imagePipelineSet;

        private ImagePipeline(Builder builder) {
            this.imagePipelineSet = builder.imagePipelineSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImagePipeline create() {
            return builder().build();
        }

        /**
         * @return imagePipelineSet
         */
        public java.util.List < ImagePipelineSet> getImagePipelineSet() {
            return this.imagePipelineSet;
        }

        public static final class Builder {
            private java.util.List < ImagePipelineSet> imagePipelineSet; 

            /**
             * ImagePipelineSet.
             */
            public Builder imagePipelineSet(java.util.List < ImagePipelineSet> imagePipelineSet) {
                this.imagePipelineSet = imagePipelineSet;
                return this;
            }

            public ImagePipeline build() {
                return new ImagePipeline(this);
            } 

        } 

    }
}
