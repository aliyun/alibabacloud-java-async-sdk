// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeImagePipelinesResponseBody model) {
            this.imagePipeline = model.imagePipeline;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ImagePipeline.
         */
        public Builder imagePipeline(ImagePipeline imagePipeline) {
            this.imagePipeline = imagePipeline;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for paging queries.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned in this call. For more information about how to use it, refer to the operation description.</p>
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
        private java.util.List<String> addAccount;

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
        public java.util.List<String> getAddAccount() {
            return this.addAccount;
        }

        public static final class Builder {
            private java.util.List<String> addAccount; 

            private Builder() {
            } 

            private Builder(AddAccounts model) {
                this.addAccount = model.addAccount;
            } 

            /**
             * AddAccount.
             */
            public Builder addAccount(java.util.List<String> addAccount) {
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
    public static class AdvancedOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageNameSuffix")
        private String imageNameSuffix;

        @com.aliyun.core.annotation.NameInMap("RetainCloudAssistant")
        private Boolean retainCloudAssistant;

        private AdvancedOptions(Builder builder) {
            this.imageNameSuffix = builder.imageNameSuffix;
            this.retainCloudAssistant = builder.retainCloudAssistant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedOptions create() {
            return builder().build();
        }

        /**
         * @return imageNameSuffix
         */
        public String getImageNameSuffix() {
            return this.imageNameSuffix;
        }

        /**
         * @return retainCloudAssistant
         */
        public Boolean getRetainCloudAssistant() {
            return this.retainCloudAssistant;
        }

        public static final class Builder {
            private String imageNameSuffix; 
            private Boolean retainCloudAssistant; 

            private Builder() {
            } 

            private Builder(AdvancedOptions model) {
                this.imageNameSuffix = model.imageNameSuffix;
                this.retainCloudAssistant = model.retainCloudAssistant;
            } 

            /**
             * ImageNameSuffix.
             */
            public Builder imageNameSuffix(String imageNameSuffix) {
                this.imageNameSuffix = imageNameSuffix;
                return this;
            }

            /**
             * RetainCloudAssistant.
             */
            public Builder retainCloudAssistant(Boolean retainCloudAssistant) {
                this.retainCloudAssistant = retainCloudAssistant;
                return this;
            }

            public AdvancedOptions build() {
                return new AdvancedOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImageFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private ImageFeatures(Builder builder) {
            this.nvmeSupport = builder.nvmeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageFeatures create() {
            return builder().build();
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public static final class Builder {
            private String nvmeSupport; 

            private Builder() {
            } 

            private Builder(ImageFeatures model) {
                this.nvmeSupport = model.nvmeSupport;
            } 

            /**
             * NvmeSupport.
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            public ImageFeatures build() {
                return new ImageFeatures(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImageTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private ImageTag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTag create() {
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

            private Builder() {
            } 

            private Builder(ImageTag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public ImageTag build() {
                return new ImageTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImageTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageTag")
        private java.util.List<ImageTag> imageTag;

        private ImageTags(Builder builder) {
            this.imageTag = builder.imageTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageTags create() {
            return builder().build();
        }

        /**
         * @return imageTag
         */
        public java.util.List<ImageTag> getImageTag() {
            return this.imageTag;
        }

        public static final class Builder {
            private java.util.List<ImageTag> imageTag; 

            private Builder() {
            } 

            private Builder(ImageTags model) {
                this.imageTag = model.imageTag;
            } 

            /**
             * ImageTag.
             */
            public Builder imageTag(java.util.List<ImageTag> imageTag) {
                this.imageTag = imageTag;
                return this;
            }

            public ImageTags build() {
                return new ImageTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageFamily")
        private String imageFamily;

        @com.aliyun.core.annotation.NameInMap("ImageFeatures")
        private ImageFeatures imageFeatures;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageTags")
        private ImageTags imageTags;

        private ImageOptions(Builder builder) {
            this.description = builder.description;
            this.imageFamily = builder.imageFamily;
            this.imageFeatures = builder.imageFeatures;
            this.imageName = builder.imageName;
            this.imageTags = builder.imageTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageOptions create() {
            return builder().build();
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
         * @return imageFeatures
         */
        public ImageFeatures getImageFeatures() {
            return this.imageFeatures;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageTags
         */
        public ImageTags getImageTags() {
            return this.imageTags;
        }

        public static final class Builder {
            private String description; 
            private String imageFamily; 
            private ImageFeatures imageFeatures; 
            private String imageName; 
            private ImageTags imageTags; 

            private Builder() {
            } 

            private Builder(ImageOptions model) {
                this.description = model.description;
                this.imageFamily = model.imageFamily;
                this.imageFeatures = model.imageFeatures;
                this.imageName = model.imageName;
                this.imageTags = model.imageTags;
            } 

            /**
             * Description.
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
             * ImageFeatures.
             */
            public Builder imageFeatures(ImageFeatures imageFeatures) {
                this.imageFeatures = imageFeatures;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageTags.
             */
            public Builder imageTags(ImageTags imageTags) {
                this.imageTags = imageTags;
                return this;
            }

            public ImageOptions build() {
                return new ImageOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class DiskDeviceMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskImageSize")
        private Integer diskImageSize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OSSBucket")
        private String OSSBucket;

        @com.aliyun.core.annotation.NameInMap("OSSObject")
        private String OSSObject;

        private DiskDeviceMapping(Builder builder) {
            this.diskImageSize = builder.diskImageSize;
            this.format = builder.format;
            this.OSSBucket = builder.OSSBucket;
            this.OSSObject = builder.OSSObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMapping create() {
            return builder().build();
        }

        /**
         * @return diskImageSize
         */
        public Integer getDiskImageSize() {
            return this.diskImageSize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return OSSBucket
         */
        public String getOSSBucket() {
            return this.OSSBucket;
        }

        /**
         * @return OSSObject
         */
        public String getOSSObject() {
            return this.OSSObject;
        }

        public static final class Builder {
            private Integer diskImageSize; 
            private String format; 
            private String OSSBucket; 
            private String OSSObject; 

            private Builder() {
            } 

            private Builder(DiskDeviceMapping model) {
                this.diskImageSize = model.diskImageSize;
                this.format = model.format;
                this.OSSBucket = model.OSSBucket;
                this.OSSObject = model.OSSObject;
            } 

            /**
             * DiskImageSize.
             */
            public Builder diskImageSize(Integer diskImageSize) {
                this.diskImageSize = diskImageSize;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * OSSBucket.
             */
            public Builder OSSBucket(String OSSBucket) {
                this.OSSBucket = OSSBucket;
                return this;
            }

            /**
             * OSSObject.
             */
            public Builder OSSObject(String OSSObject) {
                this.OSSObject = OSSObject;
                return this;
            }

            public DiskDeviceMapping build() {
                return new DiskDeviceMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class DiskDeviceMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskDeviceMapping")
        private java.util.List<DiskDeviceMapping> diskDeviceMapping;

        private DiskDeviceMappings(Builder builder) {
            this.diskDeviceMapping = builder.diskDeviceMapping;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskDeviceMappings create() {
            return builder().build();
        }

        /**
         * @return diskDeviceMapping
         */
        public java.util.List<DiskDeviceMapping> getDiskDeviceMapping() {
            return this.diskDeviceMapping;
        }

        public static final class Builder {
            private java.util.List<DiskDeviceMapping> diskDeviceMapping; 

            private Builder() {
            } 

            private Builder(DiskDeviceMappings model) {
                this.diskDeviceMapping = model.diskDeviceMapping;
            } 

            /**
             * DiskDeviceMapping.
             */
            public Builder diskDeviceMapping(java.util.List<DiskDeviceMapping> diskDeviceMapping) {
                this.diskDeviceMapping = diskDeviceMapping;
                return this;
            }

            public DiskDeviceMappings build() {
                return new DiskDeviceMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class Features extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImdsSupport")
        private String imdsSupport;

        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private Features(Builder builder) {
            this.imdsSupport = builder.imdsSupport;
            this.nvmeSupport = builder.nvmeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
            return builder().build();
        }

        /**
         * @return imdsSupport
         */
        public String getImdsSupport() {
            return this.imdsSupport;
        }

        /**
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        public static final class Builder {
            private String imdsSupport; 
            private String nvmeSupport; 

            private Builder() {
            } 

            private Builder(Features model) {
                this.imdsSupport = model.imdsSupport;
                this.nvmeSupport = model.nvmeSupport;
            } 

            /**
             * ImdsSupport.
             */
            public Builder imdsSupport(String imdsSupport) {
                this.imdsSupport = imdsSupport;
                return this;
            }

            /**
             * NvmeSupport.
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            public Features build() {
                return new Features(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImportImageTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ImportImageTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportImageTag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ImportImageTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ImportImageTag build() {
                return new ImportImageTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImportImageTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImportImageTag")
        private java.util.List<ImportImageTag> importImageTag;

        private ImportImageTags(Builder builder) {
            this.importImageTag = builder.importImageTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportImageTags create() {
            return builder().build();
        }

        /**
         * @return importImageTag
         */
        public java.util.List<ImportImageTag> getImportImageTag() {
            return this.importImageTag;
        }

        public static final class Builder {
            private java.util.List<ImportImageTag> importImageTag; 

            private Builder() {
            } 

            private Builder(ImportImageTags model) {
                this.importImageTag = model.importImageTag;
            } 

            /**
             * ImportImageTag.
             */
            public Builder importImageTag(java.util.List<ImportImageTag> importImageTag) {
                this.importImageTag = importImageTag;
                return this;
            }

            public ImportImageTags build() {
                return new ImportImageTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class ImportImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BootMode")
        private String bootMode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("Features")
        private Features features;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImportImageTags")
        private ImportImageTags importImageTags;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RetainImportedImage")
        private Boolean retainImportedImage;

        @com.aliyun.core.annotation.NameInMap("RetentionStrategy")
        private String retentionStrategy;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private ImportImageOptions(Builder builder) {
            this.architecture = builder.architecture;
            this.bootMode = builder.bootMode;
            this.description = builder.description;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.features = builder.features;
            this.imageName = builder.imageName;
            this.importImageTags = builder.importImageTags;
            this.licenseType = builder.licenseType;
            this.OSType = builder.OSType;
            this.platform = builder.platform;
            this.retainImportedImage = builder.retainImportedImage;
            this.retentionStrategy = builder.retentionStrategy;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportImageOptions create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return bootMode
         */
        public String getBootMode() {
            return this.bootMode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diskDeviceMappings
         */
        public DiskDeviceMappings getDiskDeviceMappings() {
            return this.diskDeviceMappings;
        }

        /**
         * @return features
         */
        public Features getFeatures() {
            return this.features;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return importImageTags
         */
        public ImportImageTags getImportImageTags() {
            return this.importImageTags;
        }

        /**
         * @return licenseType
         */
        public String getLicenseType() {
            return this.licenseType;
        }

        /**
         * @return OSType
         */
        public String getOSType() {
            return this.OSType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return retainImportedImage
         */
        public Boolean getRetainImportedImage() {
            return this.retainImportedImage;
        }

        /**
         * @return retentionStrategy
         */
        public String getRetentionStrategy() {
            return this.retentionStrategy;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String architecture; 
            private String bootMode; 
            private String description; 
            private DiskDeviceMappings diskDeviceMappings; 
            private Features features; 
            private String imageName; 
            private ImportImageTags importImageTags; 
            private String licenseType; 
            private String OSType; 
            private String platform; 
            private Boolean retainImportedImage; 
            private String retentionStrategy; 
            private String roleName; 

            private Builder() {
            } 

            private Builder(ImportImageOptions model) {
                this.architecture = model.architecture;
                this.bootMode = model.bootMode;
                this.description = model.description;
                this.diskDeviceMappings = model.diskDeviceMappings;
                this.features = model.features;
                this.imageName = model.imageName;
                this.importImageTags = model.importImageTags;
                this.licenseType = model.licenseType;
                this.OSType = model.OSType;
                this.platform = model.platform;
                this.retainImportedImage = model.retainImportedImage;
                this.retentionStrategy = model.retentionStrategy;
                this.roleName = model.roleName;
            } 

            /**
             * Architecture.
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * BootMode.
             */
            public Builder bootMode(String bootMode) {
                this.bootMode = bootMode;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DiskDeviceMappings.
             */
            public Builder diskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(Features features) {
                this.features = features;
                return this;
            }

            /**
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImportImageTags.
             */
            public Builder importImageTags(ImportImageTags importImageTags) {
                this.importImageTags = importImageTags;
                return this;
            }

            /**
             * LicenseType.
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
                return this;
            }

            /**
             * OSType.
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * RetainImportedImage.
             */
            public Builder retainImportedImage(Boolean retainImportedImage) {
                this.retainImportedImage = retainImportedImage;
                return this;
            }

            /**
             * RetentionStrategy.
             */
            public Builder retentionStrategy(String retentionStrategy) {
                this.retentionStrategy = retentionStrategy;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public ImportImageOptions build() {
                return new ImportImageOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImagePipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImagePipelinesResponseBody</p>
     */
    public static class RepairItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RepairItem")
        private java.util.List<String> repairItem;

        private RepairItems(Builder builder) {
            this.repairItem = builder.repairItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairItems create() {
            return builder().build();
        }

        /**
         * @return repairItem
         */
        public java.util.List<String> getRepairItem() {
            return this.repairItem;
        }

        public static final class Builder {
            private java.util.List<String> repairItem; 

            private Builder() {
            } 

            private Builder(RepairItems model) {
                this.repairItem = model.repairItem;
            } 

            /**
             * RepairItem.
             */
            public Builder repairItem(java.util.List<String> repairItem) {
                this.repairItem = repairItem;
                return this;
            }

            public RepairItems build() {
                return new RepairItems(this);
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
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
        private java.util.List<String> toRegionId;

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
        public java.util.List<String> getToRegionId() {
            return this.toRegionId;
        }

        public static final class Builder {
            private java.util.List<String> toRegionId; 

            private Builder() {
            } 

            private Builder(ToRegionIds model) {
                this.toRegionId = model.toRegionId;
            } 

            /**
             * ToRegionId.
             */
            public Builder toRegionId(java.util.List<String> toRegionId) {
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

        @com.aliyun.core.annotation.NameInMap("AdvancedOptions")
        private AdvancedOptions advancedOptions;

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
        @Deprecated
        private String imageFamily;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        @Deprecated
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageOptions")
        private ImageOptions imageOptions;

        @com.aliyun.core.annotation.NameInMap("ImagePipelineId")
        private String imagePipelineId;

        @com.aliyun.core.annotation.NameInMap("ImportImageOptions")
        private ImportImageOptions importImageOptions;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        @Deprecated
        private String nvmeSupport;

        @com.aliyun.core.annotation.NameInMap("RepairItems")
        private RepairItems repairItems;

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
            this.advancedOptions = builder.advancedOptions;
            this.baseImage = builder.baseImage;
            this.baseImageType = builder.baseImageType;
            this.buildContent = builder.buildContent;
            this.creationTime = builder.creationTime;
            this.deleteInstanceOnFailure = builder.deleteInstanceOnFailure;
            this.description = builder.description;
            this.imageFamily = builder.imageFamily;
            this.imageName = builder.imageName;
            this.imageOptions = builder.imageOptions;
            this.imagePipelineId = builder.imagePipelineId;
            this.importImageOptions = builder.importImageOptions;
            this.instanceType = builder.instanceType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.name = builder.name;
            this.nvmeSupport = builder.nvmeSupport;
            this.repairItems = builder.repairItems;
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
         * @return advancedOptions
         */
        public AdvancedOptions getAdvancedOptions() {
            return this.advancedOptions;
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
         * @return imageOptions
         */
        public ImageOptions getImageOptions() {
            return this.imageOptions;
        }

        /**
         * @return imagePipelineId
         */
        public String getImagePipelineId() {
            return this.imagePipelineId;
        }

        /**
         * @return importImageOptions
         */
        public ImportImageOptions getImportImageOptions() {
            return this.importImageOptions;
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
         * @return nvmeSupport
         */
        public String getNvmeSupport() {
            return this.nvmeSupport;
        }

        /**
         * @return repairItems
         */
        public RepairItems getRepairItems() {
            return this.repairItems;
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
            private AdvancedOptions advancedOptions; 
            private String baseImage; 
            private String baseImageType; 
            private String buildContent; 
            private String creationTime; 
            private Boolean deleteInstanceOnFailure; 
            private String description; 
            private String imageFamily; 
            private String imageName; 
            private ImageOptions imageOptions; 
            private String imagePipelineId; 
            private ImportImageOptions importImageOptions; 
            private String instanceType; 
            private Integer internetMaxBandwidthOut; 
            private String name; 
            private String nvmeSupport; 
            private RepairItems repairItems; 
            private String repairMode; 
            private String resourceGroupId; 
            private Integer systemDiskSize; 
            private Tags tags; 
            private String testContent; 
            private ToRegionIds toRegionIds; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(ImagePipelineSet model) {
                this.addAccounts = model.addAccounts;
                this.advancedOptions = model.advancedOptions;
                this.baseImage = model.baseImage;
                this.baseImageType = model.baseImageType;
                this.buildContent = model.buildContent;
                this.creationTime = model.creationTime;
                this.deleteInstanceOnFailure = model.deleteInstanceOnFailure;
                this.description = model.description;
                this.imageFamily = model.imageFamily;
                this.imageName = model.imageName;
                this.imageOptions = model.imageOptions;
                this.imagePipelineId = model.imagePipelineId;
                this.importImageOptions = model.importImageOptions;
                this.instanceType = model.instanceType;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.name = model.name;
                this.nvmeSupport = model.nvmeSupport;
                this.repairItems = model.repairItems;
                this.repairMode = model.repairMode;
                this.resourceGroupId = model.resourceGroupId;
                this.systemDiskSize = model.systemDiskSize;
                this.tags = model.tags;
                this.testContent = model.testContent;
                this.toRegionIds = model.toRegionIds;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * AddAccounts.
             */
            public Builder addAccounts(AddAccounts addAccounts) {
                this.addAccounts = addAccounts;
                return this;
            }

            /**
             * AdvancedOptions.
             */
            public Builder advancedOptions(AdvancedOptions advancedOptions) {
                this.advancedOptions = advancedOptions;
                return this;
            }

            /**
             * BaseImage.
             */
            public Builder baseImage(String baseImage) {
                this.baseImage = baseImage;
                return this;
            }

            /**
             * BaseImageType.
             */
            public Builder baseImageType(String baseImageType) {
                this.baseImageType = baseImageType;
                return this;
            }

            /**
             * BuildContent.
             */
            public Builder buildContent(String buildContent) {
                this.buildContent = buildContent;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DeleteInstanceOnFailure.
             */
            public Builder deleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
                this.deleteInstanceOnFailure = deleteInstanceOnFailure;
                return this;
            }

            /**
             * Description.
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
             * ImageName.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * ImageOptions.
             */
            public Builder imageOptions(ImageOptions imageOptions) {
                this.imageOptions = imageOptions;
                return this;
            }

            /**
             * ImagePipelineId.
             */
            public Builder imagePipelineId(String imagePipelineId) {
                this.imagePipelineId = imagePipelineId;
                return this;
            }

            /**
             * ImportImageOptions.
             */
            public Builder importImageOptions(ImportImageOptions importImageOptions) {
                this.importImageOptions = importImageOptions;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InternetMaxBandwidthOut.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NvmeSupport.
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            /**
             * RepairItems.
             */
            public Builder repairItems(RepairItems repairItems) {
                this.repairItems = repairItems;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * Tags.
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
             * ToRegionIds.
             */
            public Builder toRegionIds(ToRegionIds toRegionIds) {
                this.toRegionIds = toRegionIds;
                return this;
            }

            /**
             * VSwitchId.
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
        private java.util.List<ImagePipelineSet> imagePipelineSet;

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
        public java.util.List<ImagePipelineSet> getImagePipelineSet() {
            return this.imagePipelineSet;
        }

        public static final class Builder {
            private java.util.List<ImagePipelineSet> imagePipelineSet; 

            private Builder() {
            } 

            private Builder(ImagePipeline model) {
                this.imagePipelineSet = model.imagePipelineSet;
            } 

            /**
             * ImagePipelineSet.
             */
            public Builder imagePipelineSet(java.util.List<ImagePipelineSet> imagePipelineSet) {
                this.imagePipelineSet = imagePipelineSet;
                return this;
            }

            public ImagePipeline build() {
                return new ImagePipeline(this);
            } 

        } 

    }
}
