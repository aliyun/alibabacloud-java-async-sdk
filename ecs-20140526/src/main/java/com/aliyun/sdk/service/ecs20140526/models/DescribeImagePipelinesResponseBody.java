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
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("ImagePipeline")
    private ImagePipeline imagePipeline;

    private DescribeImagePipelinesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.maxResults = builder.maxResults;
        this.imagePipeline = builder.imagePipeline;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImagePipelinesResponseBody create() {
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
     * @return imagePipeline
     */
    public ImagePipeline getImagePipeline() {
        return this.imagePipeline;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private Integer maxResults; 
        private ImagePipeline imagePipeline; 

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
         * The number of returned image templates.
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
         * The list of image template details.
         */
        public Builder imagePipeline(ImagePipeline imagePipeline) {
            this.imagePipeline = imagePipeline;
            return this;
        }

        public DescribeImagePipelinesResponseBody build() {
            return new DescribeImagePipelinesResponseBody(this);
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
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DeleteInstanceOnFailure")
        private Boolean deleteInstanceOnFailure;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("ImagePipelineId")
        private String imagePipelineId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @NameInMap("Description")
        private String description;

        @NameInMap("BaseImage")
        private String baseImage;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("BaseImageType")
        private String baseImageType;

        @NameInMap("Name")
        private String name;

        @NameInMap("BuildContent")
        private String buildContent;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("AddAccounts")
        private AddAccounts addAccounts;

        @NameInMap("ToRegionIds")
        private ToRegionIds toRegionIds;

        private ImagePipelineSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.deleteInstanceOnFailure = builder.deleteInstanceOnFailure;
            this.instanceType = builder.instanceType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.imagePipelineId = builder.imagePipelineId;
            this.vSwitchId = builder.vSwitchId;
            this.systemDiskSize = builder.systemDiskSize;
            this.description = builder.description;
            this.baseImage = builder.baseImage;
            this.resourceGroupId = builder.resourceGroupId;
            this.imageName = builder.imageName;
            this.baseImageType = builder.baseImageType;
            this.name = builder.name;
            this.buildContent = builder.buildContent;
            this.tags = builder.tags;
            this.addAccounts = builder.addAccounts;
            this.toRegionIds = builder.toRegionIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImagePipelineSet create() {
            return builder().build();
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
         * @return imagePipelineId
         */
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return baseImage
         */
        public String getBaseImage() {
            return this.baseImage;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return baseImageType
         */
        public String getBaseImageType() {
            return this.baseImageType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return buildContent
         */
        public String getBuildContent() {
            return this.buildContent;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return addAccounts
         */
        public AddAccounts getAddAccounts() {
            return this.addAccounts;
        }

        /**
         * @return toRegionIds
         */
        public ToRegionIds getToRegionIds() {
            return this.toRegionIds;
        }

        public static final class Builder {
            private String creationTime; 
            private Boolean deleteInstanceOnFailure; 
            private String instanceType; 
            private Integer internetMaxBandwidthOut; 
            private String imagePipelineId; 
            private String vSwitchId; 
            private Integer systemDiskSize; 
            private String description; 
            private String baseImage; 
            private String resourceGroupId; 
            private String imageName; 
            private String baseImageType; 
            private String name; 
            private String buildContent; 
            private Tags tags; 
            private AddAccounts addAccounts; 
            private ToRegionIds toRegionIds; 

            /**
             * The time when the template was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Specifies whether to release the intermediate instance after the image fails to be built.
             */
            public Builder deleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
                this.deleteInstanceOnFailure = deleteInstanceOnFailure;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The Internet outbound bandwidth of the intermediate instance. Unit: Mbit/s
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
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
             * The vSwitch ID of the VPC.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The system disk size of the intermediate instance. Unit: GiB
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
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
             * The source image.
             * <p>
             * -When "BaseImageType = IMAGE", the value of this parameter is the ID of the custom image.
             * -When "BaseImageType = IMAGE_FAMILY ", the value of this parameter is the name of the Image family.
             */
            public Builder baseImage(String baseImage) {
                this.baseImage = baseImage;
                return this;
            }

            /**
             * The ID of the enterprise resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The prefix of the target image name.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The type of the source image. Possible values:
             * <p>
             * 
             * -IMAGE: custom IMAGE.
             * -IMAGE_FAMILY: The Image family is.
             */
            public Builder baseImageType(String baseImageType) {
                this.baseImageType = baseImageType;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder name(String name) {
                this.name = name;
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
             * The list of key-value pairs.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * AddAccounts.
             */
            public Builder addAccounts(AddAccounts addAccounts) {
                this.addAccounts = addAccounts;
                return this;
            }

            /**
             * ToRegionIds.
             */
            public Builder toRegionIds(ToRegionIds toRegionIds) {
                this.toRegionIds = toRegionIds;
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
