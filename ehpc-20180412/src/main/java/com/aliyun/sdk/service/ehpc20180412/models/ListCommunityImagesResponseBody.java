// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommunityImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommunityImagesResponseBody</p>
 */
public class ListCommunityImagesResponseBody extends TeaModel {
    @NameInMap("Images")
    private Images images;

    @NameInMap("RequestId")
    private String requestId;

    private ListCommunityImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommunityImagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return images
     */
    public Images getImages() {
        return this.images;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Images images; 
        private String requestId; 

        /**
         * The list of community images, including custom images and shared images.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCommunityImagesResponseBody build() {
            return new ListCommunityImagesResponseBody(this);
        } 

    } 

    public static class BaseOsTag extends TeaModel {
        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Version")
        private String version;

        private BaseOsTag(Builder builder) {
            this.architecture = builder.architecture;
            this.osTag = builder.osTag;
            this.platform = builder.platform;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseOsTag create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String architecture; 
            private String osTag; 
            private String platform; 
            private String version; 

            /**
             * The architecture of the operating system. Valid values:
             * <p>
             * 
             * *   i386
             * *   x86\_64
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The tag of the OS image.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * The distribution of the operating system. Valid values:
             * <p>
             * 
             * *   CentOS
             * *   Ubuntu
             * *   SUSE
             * *   OpenSUSE
             * *   Debian
             * *   CoreOS
             * *   Aliyun
             * *   Windows Server 2003
             * *   Windows Server 2008
             * *   Windows Server 2012
             * *   Others Linux
             * *   Customized Linux
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The version of the operating system.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BaseOsTag build() {
                return new BaseOsTag(this);
            } 

        } 

    }
    public static class OsTag extends TeaModel {
        @NameInMap("Architecture")
        private String architecture;

        @NameInMap("BaseOsTag")
        private String baseOsTag;

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Version")
        private String version;

        private OsTag(Builder builder) {
            this.architecture = builder.architecture;
            this.baseOsTag = builder.baseOsTag;
            this.osTag = builder.osTag;
            this.platform = builder.platform;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsTag create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return baseOsTag
         */
        public String getBaseOsTag() {
            return this.baseOsTag;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String architecture; 
            private String baseOsTag; 
            private String osTag; 
            private String platform; 
            private String version; 

            /**
             * The architecture of the operating system. Valid values:
             * <p>
             * 
             * *   i386
             * *   x86\_64
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The tag of the BOS image.
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * The tag of the OS image.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * The operating system.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The version of the operating system.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public OsTag build() {
                return new OsTag(this);
            } 

        } 

    }
    public static class ImageInfo extends TeaModel {
        @NameInMap("BaseOsTag")
        private BaseOsTag baseOsTag;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @NameInMap("OsTag")
        private OsTag osTag;

        @NameInMap("PostInstallScript")
        private String postInstallScript;

        @NameInMap("PricingCycle")
        private String pricingCycle;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SkuCode")
        private String skuCode;

        @NameInMap("Status")
        private String status;

        @NameInMap("Uid")
        private String uid;

        private ImageInfo(Builder builder) {
            this.baseOsTag = builder.baseOsTag;
            this.description = builder.description;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageOwnerAlias = builder.imageOwnerAlias;
            this.osTag = builder.osTag;
            this.postInstallScript = builder.postInstallScript;
            this.pricingCycle = builder.pricingCycle;
            this.productCode = builder.productCode;
            this.size = builder.size;
            this.skuCode = builder.skuCode;
            this.status = builder.status;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfo create() {
            return builder().build();
        }

        /**
         * @return baseOsTag
         */
        public BaseOsTag getBaseOsTag() {
            return this.baseOsTag;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageName
         */
        public String getImageName() {
            return this.imageName;
        }

        /**
         * @return imageOwnerAlias
         */
        public String getImageOwnerAlias() {
            return this.imageOwnerAlias;
        }

        /**
         * @return osTag
         */
        public OsTag getOsTag() {
            return this.osTag;
        }

        /**
         * @return postInstallScript
         */
        public String getPostInstallScript() {
            return this.postInstallScript;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return skuCode
         */
        public String getSkuCode() {
            return this.skuCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private BaseOsTag baseOsTag; 
            private String description; 
            private String imageId; 
            private String imageName; 
            private String imageOwnerAlias; 
            private OsTag osTag; 
            private String postInstallScript; 
            private String pricingCycle; 
            private String productCode; 
            private Integer size; 
            private String skuCode; 
            private String status; 
            private String uid; 

            /**
             * The tag of the BOS image.
             */
            public Builder baseOsTag(BaseOsTag baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * The description of the image.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The name of the image.
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * The type of the image. Valid values:
             * <p>
             * 
             * *   self: custom image
             * *   others: shared image
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * An array of OS images that are supported by E-HPC.
             */
            public Builder osTag(OsTag osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * The script that is run after the image is installed.
             */
            public Builder postInstallScript(String postInstallScript) {
                this.postInstallScript = postInstallScript;
                return this;
            }

            /**
             * The billing unit of the image. Valid values:
             * <p>
             * 
             * *   Hour
             * *   Month
             * *   Year
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * The Alibaba Cloud Marketplace product code of the image.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The size of the image. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The stock keeping unit (SKU) of the image. Valid values:
             * <p>
             * 
             * *   ECS: pay-as-you-go
             * *   package: subscription
             */
            public Builder skuCode(String skuCode) {
                this.skuCode = skuCode;
                return this;
            }

            /**
             * The status of the image. Valid values:
             * <p>
             * 
             * *   UnAvailable: The image is unavailable.
             * *   Available: The image is available.
             * *   Creating: The image is being created.
             * *   CreateFailed: The image failed to be created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The owner of the image.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public ImageInfo build() {
                return new ImageInfo(this);
            } 

        } 

    }
    public static class Images extends TeaModel {
        @NameInMap("ImageInfo")
        private java.util.List < ImageInfo> imageInfo;

        private Images(Builder builder) {
            this.imageInfo = builder.imageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return imageInfo
         */
        public java.util.List < ImageInfo> getImageInfo() {
            return this.imageInfo;
        }

        public static final class Builder {
            private java.util.List < ImageInfo> imageInfo; 

            /**
             * ImageInfo.
             */
            public Builder imageInfo(java.util.List < ImageInfo> imageInfo) {
                this.imageInfo = imageInfo;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
