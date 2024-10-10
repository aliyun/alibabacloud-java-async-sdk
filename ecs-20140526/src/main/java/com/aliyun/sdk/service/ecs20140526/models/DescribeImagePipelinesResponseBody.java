// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImagePipelinesResponseBody</p>
 */
public class DescribeImagePipelinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImagePipeline")
    private ImagePipeline imagePipeline;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Details about the image templates.</p>
         */
        public Builder imagePipeline(ImagePipeline imagePipeline) {
            this.imagePipeline = imagePipeline;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. For information about how to use the return value, see the &quot;Usage notes&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of image templates returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImagePipelinesResponseBody build() {
            return new DescribeImagePipelinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class AddAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddAccount")
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
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ToRegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ToRegionId")
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
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImagePipelineSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddAccounts")
        private AddAccounts addAccounts;

        @com.aliyun.core.annotation.NameInMap("BaseImage")
        private String baseImage;

        @com.aliyun.core.annotation.NameInMap("BaseImageType")
        private String baseImageType;

        @com.aliyun.core.annotation.NameInMap("BuildContent")
        private String buildContent;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeleteInstanceOnFailure")
        private Boolean deleteInstanceOnFailure;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageFamily")
        private String imageFamily;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImagePipelineId")
        private String imagePipelineId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RepairMode")
        private String repairMode;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TestContent")
        private String testContent;

        @com.aliyun.core.annotation.NameInMap("ToRegionIds")
        private ToRegionIds toRegionIds;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private ImagePipelineSet(Builder builder) {
            this.addAccounts = builder.addAccounts;
            this.baseImage = builder.baseImage;
            this.baseImageType = builder.baseImageType;
            this.buildContent = builder.buildContent;
            this.creationTime = builder.creationTime;
            this.deleteInstanceOnFailure = builder.deleteInstanceOnFailure;
            this.description = builder.description;
            this.imageFamily = builder.imageFamily;
            this.imageName = builder.imageName;
            this.imagePipelineId = builder.imagePipelineId;
            this.instanceType = builder.instanceType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.name = builder.name;
            this.repairMode = builder.repairMode;
            this.resourceGroupId = builder.resourceGroupId;
            this.systemDiskSize = builder.systemDiskSize;
            this.tags = builder.tags;
            this.testContent = builder.testContent;
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
         * @return imageFamily
         */
        public String getImageFamily() {
            return this.imageFamily;
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
         * @return repairMode
         */
        public String getRepairMode() {
            return this.repairMode;
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
         * @return testContent
         */
        public String getTestContent() {
            return this.testContent;
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
            private String imageFamily; 
            private String imageName; 
            private String imagePipelineId; 
            private String instanceType; 
            private Integer internetMaxBandwidthOut; 
            private String name; 
            private String repairMode; 
            private String resourceGroupId; 
            private Integer systemDiskSize; 
            private Tags tags; 
            private String testContent; 
            private ToRegionIds toRegionIds; 
            private String vSwitchId; 

            /**
             * <p>The IDs of Alibaba Cloud accounts to which to share the image that will be created based on the image template.</p>
             */
            public Builder addAccounts(AddAccounts addAccounts) {
                this.addAccounts = addAccounts;
                return this;
            }

            /**
             * <p>The source image.</p>
             * <ul>
             * <li>When <code>BaseImageType</code> is set to IMAGE, the value of this parameter is the ID of a custom image.</li>
             * <li>When <code>BaseImageType</code> is set to IMAGE_FAMILY, the value of this parameter is the name of an image family.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>m-bp67acfmxazb4p****</p>
             */
            public Builder baseImage(String baseImage) {
                this.baseImage = baseImage;
                return this;
            }

            /**
             * <p>The type of the source image. Valid values:</p>
             * <ul>
             * <li>IMAGE: custom image</li>
             * <li>IMAGE_FAMILY: image family</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder baseImageType(String baseImageType) {
                this.baseImageType = baseImageType;
                return this;
            }

            /**
             * <p>The content of the image template.</p>
             * 
             * <strong>example:</strong>
             * <p>FROM IMAGE:m-bp67acfmxazb4p****</p>
             */
            public Builder buildContent(String buildContent) {
                this.buildContent = buildContent;
                return this;
            }

            /**
             * <p>The time when the image template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-24T06:00:00Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether to release the intermediate instance when the image fails to be created.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
                this.deleteInstanceOnFailure = deleteInstanceOnFailure;
                return this;
            }

            /**
             * <p>The description of the image template.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ImageFamily.
             */
            public Builder imageFamily(String imageFamily) {
                this.imageFamily = imageFamily;
                return this;
            }

            /**
             * <p>The name prefix of the image to be created based on the image template.</p>
             * 
             * <strong>example:</strong>
             * <p>testImageName</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The ID of the image template.</p>
             * 
             * <strong>example:</strong>
             * <p>ip-2ze5tsl5bp6nf2b3****</p>
             */
            public Builder imagePipelineId(String imagePipelineId) {
                this.imagePipelineId = imagePipelineId;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The size of the outbound public bandwidth for the intermediate instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>The name of the image template.</p>
             * 
             * <strong>example:</strong>
             * <p>testImagePipeline</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RepairMode.
             */
            public Builder repairMode(String repairMode) {
                this.repairMode = repairMode;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The system disk size of the intermediate instance. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The tags of the image template.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TestContent.
             */
            public Builder testContent(String testContent) {
                this.testContent = testContent;
                return this;
            }

            /**
             * <p>The IDs of regions to which to distribute the image that will be created based on the image template.</p>
             */
            public Builder toRegionIds(ToRegionIds toRegionIds) {
                this.toRegionIds = toRegionIds;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp67acfmxazb4p****</p>
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
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImagePipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImagePipelineSet")
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
