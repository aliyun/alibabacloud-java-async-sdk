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
         * <p>Details of the image templates.</p>
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

            /**
             * ImageNameSuffix.
             */
            public Builder imageNameSuffix(String imageNameSuffix) {
                this.imageNameSuffix = imageNameSuffix;
                return this;
            }

            /**
             * <p>Indicates whether to retain Cloud Assistant. During the image building process, the system automatically installs Cloud Assistant in the intermediate instance to run commands. You can choose whether to retain Cloud Assistant in the new image created based on the image template. Valid values:</p>
             * <ul>
             * <li>true: retains Cloud Assistant.</li>
             * <li>false: does not retain Cloud Assistant.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter does not affect Cloud Assistant that comes with your image.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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

            /**
             * <p>The size of disk N in the custom image after the image is imported.</p>
             * <p>You can use this parameter to specify the sizes of the system disk and data disks in the custom image. When you specify the size of the system disk, make sure that the specified size is greater than or equal to the size of the source image file. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>When N is set to 1, this parameter indicates the size of the system disk in the custom image. Valid values: 1 to 2048.</li>
             * <li>When N is set to an integer in the range of 2 to 17, this parameter indicates the size of a data disk in the custom image. Valid values: 1 to 2048.</li>
             * </ul>
             * <p>After the image file is uploaded to an OSS bucket, you can view the size of the image file in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder diskImageSize(Integer diskImageSize) {
                this.diskImageSize = diskImageSize;
                return this;
            }

            /**
             * <p>The format of the image. Valid values:</p>
             * <ul>
             * <li>RAW</li>
             * <li>VHD</li>
             * <li>QCOW2</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RAW</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) bucket where the image file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>ecsimageos</p>
             */
            public Builder OSSBucket(String OSSBucket) {
                this.OSSBucket = OSSBucket;
                return this;
            }

            /**
             * <p>The name (key) of the object that the image file is stored as in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_5.4_32.raw</p>
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
        @com.aliyun.core.annotation.NameInMap("NvmeSupport")
        private String nvmeSupport;

        private Features(Builder builder) {
            this.nvmeSupport = builder.nvmeSupport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Features create() {
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

            /**
             * <p>Indicates whether the image supports the NVMe protocol. Valid values:</p>
             * <ul>
             * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
             * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>supported</p>
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
    public static class ImportImageOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BootMode")
        private String bootMode;

        @com.aliyun.core.annotation.NameInMap("DiskDeviceMappings")
        private DiskDeviceMappings diskDeviceMappings;

        @com.aliyun.core.annotation.NameInMap("Features")
        private Features features;

        @com.aliyun.core.annotation.NameInMap("LicenseType")
        private String licenseType;

        @com.aliyun.core.annotation.NameInMap("OSType")
        private String OSType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("RetainImportedImage")
        private Boolean retainImportedImage;

        private ImportImageOptions(Builder builder) {
            this.architecture = builder.architecture;
            this.bootMode = builder.bootMode;
            this.diskDeviceMappings = builder.diskDeviceMappings;
            this.features = builder.features;
            this.licenseType = builder.licenseType;
            this.OSType = builder.OSType;
            this.platform = builder.platform;
            this.retainImportedImage = builder.retainImportedImage;
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

        public static final class Builder {
            private String architecture; 
            private String bootMode; 
            private DiskDeviceMappings diskDeviceMappings; 
            private Features features; 
            private String licenseType; 
            private String OSType; 
            private String platform; 
            private Boolean retainImportedImage; 

            /**
             * <p>The operating system architecture. Valid values:</p>
             * <ul>
             * <li>x86_64</li>
             * <li>arm64</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The boot mode of the image. Valid values:</p>
             * <ul>
             * <li>BIOS: BIOS mode</li>
             * <li>UEFI: Unified Extensible Firmware Interface (UEFI) mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BIOS</p>
             */
            public Builder bootMode(String bootMode) {
                this.bootMode = bootMode;
                return this;
            }

            /**
             * <p>The information of disk N from which a custom image is created.</p>
             * <ul>
             * <li>When N is set to 1, a custom image is created from the system disk.</li>
             * <li>When N is set to an integer in the range of 2 to 17, a custom image is created from a data disk.</li>
             * </ul>
             */
            public Builder diskDeviceMappings(DiskDeviceMappings diskDeviceMappings) {
                this.diskDeviceMappings = diskDeviceMappings;
                return this;
            }

            /**
             * <p>The attributes of the custom image.</p>
             */
            public Builder features(Features features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The type of the license to use to activate the operating system after the image is imported. Valid values:</p>
             * <ul>
             * <li>Auto: ECS detects the operating system of the image and allocates a license to the operating system In this mode, the system first checks whether a license allocated by an official Alibaba Cloud channel is specified in the <code>Platform</code>. If a license allocated by an official Alibaba Cloud channel is specified, the system allocates the license to the imported image. If no such license is specified, the Bring Your Own License (BYOL) mode is used.</li>
             * <li>Aliyun: The license allocated through an official Alibaba Cloud channel is used for the operating system distribution specified by <code>Platform</code>.</li>
             * <li>BYOL: The license that comes with the source operating system is used. When you use the BYOL license, make sure that your license key is supported by Alibaba Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Auto</p>
             */
            public Builder licenseType(String licenseType) {
                this.licenseType = licenseType;
                return this;
            }

            /**
             * <p>The operating system type. Valid values:</p>
             * <ul>
             * <li>windows: Windows operating systems</li>
             * <li>linux: Linux operating systems</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder OSType(String OSType) {
                this.OSType = OSType;
                return this;
            }

            /**
             * <p>The version of the operating system. Valid values:</p>
             * <ul>
             * <li>Aliyun</li>
             * <li>Anolis</li>
             * <li>CentOS</li>
             * <li>Ubuntu</li>
             * <li>CoreOS</li>
             * <li>SUSE</li>
             * <li>Debian</li>
             * <li>OpenSUSE</li>
             * <li>FreeBSD</li>
             * <li>RedHat</li>
             * <li>Kylin</li>
             * <li>UOS</li>
             * <li>Fedora</li>
             * <li>Fedora CoreOS</li>
             * <li>CentOS Stream</li>
             * <li>AlmaLinux</li>
             * <li>Rocky Linux</li>
             * <li>Gentoo</li>
             * <li>Customized Linux</li>
             * <li>Others Linux</li>
             * <li>Windows Server 2022</li>
             * <li>Windows Server 2019</li>
             * <li>Windows Server 2016</li>
             * <li>Windows Server 2012</li>
             * <li>Windows Server 2008</li>
             * <li>Windows Server 2003</li>
             * <li>Other Windows</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>Indicates whether to retain the imported image. After the image is imported, the system automatically deletes the source image to prevent unnecessary storage costs. You can also choose whether to retain it. Valid values:</p>
             * <ul>
             * <li>true: retains the image. After the image is imported, the source image is not deleted even if the image building task is canceled or fails.</li>
             * <li>false: does not retain the image.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder retainImportedImage(Boolean retainImportedImage) {
                this.retainImportedImage = retainImportedImage;
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
             * <p>The advanced settings.</p>
             */
            public Builder advancedOptions(AdvancedOptions advancedOptions) {
                this.advancedOptions = advancedOptions;
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
             * <p>The image family.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
             * ImageOptions.
             */
            public Builder imageOptions(ImageOptions imageOptions) {
                this.imageOptions = imageOptions;
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
             * <p>The properties and settings of the image template that you import.</p>
             */
            public Builder importImageOptions(ImportImageOptions importImageOptions) {
                this.importImageOptions = importImageOptions;
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
             * <p>Indicates whether the image created based on the image template supports Non-Volatile Memory Express (NVMe). Valid values:</p>
             * <ul>
             * <li>supported: The image supports the NVMe protocol. Instances created from the image also support the NVMe protocol.</li>
             * <li>unsupported: The image does not support the NVMe protocol. Instances created from the image do not support the NVMe protocol.</li>
             * <li>auto: The system automatically checks whether the image supports the NVMe protocol. The system automatically checks whether the NVMe driver is installed on your image before the image is built. If you install or uninstall the NVMe driver during the image building task, the check result may be incorrect. We recommend that you set the value to supported or unsupported based on the image building content.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder nvmeSupport(String nvmeSupport) {
                this.nvmeSupport = nvmeSupport;
                return this;
            }

            /**
             * <p>The repair mode of the image template.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Standard: the standard mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
             * <p>The content of the image test template.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
