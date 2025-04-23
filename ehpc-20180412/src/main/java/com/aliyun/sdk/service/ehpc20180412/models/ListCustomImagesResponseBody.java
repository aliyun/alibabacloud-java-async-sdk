// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomImagesResponseBody</p>
 */
public class ListCustomImagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Images")
    private Images images;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCustomImagesResponseBody(Builder builder) {
        this.images = builder.images;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomImagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListCustomImagesResponseBody model) {
            this.images = model.images;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of community images, including custom images and shared images.</p>
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCustomImagesResponseBody build() {
            return new ListCustomImagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomImagesResponseBody</p>
     */
    public static class BaseOsTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(BaseOsTag model) {
                this.architecture = model.architecture;
                this.osTag = model.osTag;
                this.platform = model.platform;
                this.version = model.version;
            } 

            /**
             * <p>The architecture of the operating system. Valid values:</p>
             * <ul>
             * <li>i386</li>
             * <li>x86_64</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>i386</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The tags of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * <p>The OS. Valid values:</p>
             * <ul>
             * <li>CentOS</li>
             * <li>windows</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CentOS</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The version of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>7.2</p>
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
    /**
     * 
     * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomImagesResponseBody</p>
     */
    public static class OsTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("BaseOsTag")
        private String baseOsTag;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(OsTag model) {
                this.architecture = model.architecture;
                this.baseOsTag = model.baseOsTag;
                this.osTag = model.osTag;
                this.platform = model.platform;
                this.version = model.version;
            } 

            /**
             * <p>The architecture of the operating system. Valid values:</p>
             * <ul>
             * <li>i386</li>
             * <li>x86_64</li>
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
             * <p>The image tag of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder baseOsTag(String baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * <p>The OS.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The version of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>7.2</p>
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
    /**
     * 
     * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomImagesResponseBody</p>
     */
    public static class ImageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseOsTag")
        private BaseOsTag baseOsTag;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
        private String imageOwnerAlias;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private OsTag osTag;

        @com.aliyun.core.annotation.NameInMap("PostInstallScript")
        private String postInstallScript;

        @com.aliyun.core.annotation.NameInMap("PricingCycle")
        private String pricingCycle;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SkuCode")
        private String skuCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uid")
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

            private Builder() {
            } 

            private Builder(ImageInfo model) {
                this.baseOsTag = model.baseOsTag;
                this.description = model.description;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageOwnerAlias = model.imageOwnerAlias;
                this.osTag = model.osTag;
                this.postInstallScript = model.postInstallScript;
                this.pricingCycle = model.pricingCycle;
                this.productCode = model.productCode;
                this.size = model.size;
                this.skuCode = model.skuCode;
                this.status = model.status;
                this.uid = model.uid;
            } 

            /**
             * <p>The image tag of the operating system.</p>
             */
            public Builder baseOsTag(BaseOsTag baseOsTag) {
                this.baseOsTag = baseOsTag;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>m-bp181x855551ww5yq****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>CHESS5V5.0.27</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The type of the image. Valid values:</p>
             * <ul>
             * <li>self: custom image</li>
             * <li>others: shared image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>self</p>
             */
            public Builder imageOwnerAlias(String imageOwnerAlias) {
                this.imageOwnerAlias = imageOwnerAlias;
                return this;
            }

            /**
             * <p>An array of system images that are supported by E-HPC.</p>
             */
            public Builder osTag(OsTag osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>example.sh</p>
             */
            public Builder postInstallScript(String postInstallScript) {
                this.postInstallScript = postInstallScript;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cmjj028279</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The size of the image. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder skuCode(String skuCode) {
                this.skuCode = skuCode;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>127****</p>
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
    /**
     * 
     * {@link ListCustomImagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomImagesResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageInfo")
        private java.util.List<ImageInfo> imageInfo;

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
        public java.util.List<ImageInfo> getImageInfo() {
            return this.imageInfo;
        }

        public static final class Builder {
            private java.util.List<ImageInfo> imageInfo; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.imageInfo = model.imageInfo;
            } 

            /**
             * ImageInfo.
             */
            public Builder imageInfo(java.util.List<ImageInfo> imageInfo) {
                this.imageInfo = imageInfo;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
}
