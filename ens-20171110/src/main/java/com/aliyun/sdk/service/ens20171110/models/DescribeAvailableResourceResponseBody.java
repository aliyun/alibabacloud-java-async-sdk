// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Images")
    private Images images;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportResources")
    private SupportResources supportResources;

    private DescribeAvailableResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.images = builder.images;
        this.requestId = builder.requestId;
        this.supportResources = builder.supportResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    /**
     * @return supportResources
     */
    public SupportResources getSupportResources() {
        return this.supportResources;
    }

    public static final class Builder {
        private Integer code; 
        private Images images; 
        private String requestId; 
        private SupportResources supportResources; 

        /**
         * The returned service code. 0 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the images.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * The ID of the request. This is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The specifications of resources that you can purchase.
         */
        public Builder supportResources(SupportResources supportResources) {
            this.supportResources = supportResources;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        private Image(Builder builder) {
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
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

        public static final class Builder {
            private String imageId; 
            private String imageName; 

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

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class Images extends TeaModel {
        @NameInMap("Image")
        private java.util.List < Image> image;

        private Images(Builder builder) {
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public java.util.List < Image> getImage() {
            return this.image;
        }

        public static final class Builder {
            private java.util.List < Image> image; 

            /**
             * Image.
             */
            public Builder image(java.util.List < Image> image) {
                this.image = image;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    public static class SupportResource extends TeaModel {
        @NameInMap("DataDiskSize")
        private String dataDiskSize;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("SupportResourcesCount")
        private String supportResourcesCount;

        @NameInMap("SystemDiskSize")
        private String systemDiskSize;

        private SupportResource(Builder builder) {
            this.dataDiskSize = builder.dataDiskSize;
            this.ensRegionId = builder.ensRegionId;
            this.instanceSpec = builder.instanceSpec;
            this.supportResourcesCount = builder.supportResourcesCount;
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResource create() {
            return builder().build();
        }

        /**
         * @return dataDiskSize
         */
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return instanceSpec
         */
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

        /**
         * @return supportResourcesCount
         */
        public String getSupportResourcesCount() {
            return this.supportResourcesCount;
        }

        /**
         * @return systemDiskSize
         */
        public String getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private String dataDiskSize; 
            private String ensRegionId; 
            private String instanceSpec; 
            private String supportResourcesCount; 
            private String systemDiskSize; 

            /**
             * The size of the data disk. Unit: GB.
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * The ID of the edge node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The specifications of the resource plan.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * The number of resources that you can purchase.
             */
            public Builder supportResourcesCount(String supportResourcesCount) {
                this.supportResourcesCount = supportResourcesCount;
                return this;
            }

            /**
             * The size of the system disk. Unit: GiB.
             */
            public Builder systemDiskSize(String systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public SupportResource build() {
                return new SupportResource(this);
            } 

        } 

    }
    public static class SupportResources extends TeaModel {
        @NameInMap("SupportResource")
        private java.util.List < SupportResource> supportResource;

        private SupportResources(Builder builder) {
            this.supportResource = builder.supportResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResources create() {
            return builder().build();
        }

        /**
         * @return supportResource
         */
        public java.util.List < SupportResource> getSupportResource() {
            return this.supportResource;
        }

        public static final class Builder {
            private java.util.List < SupportResource> supportResource; 

            /**
             * SupportResource.
             */
            public Builder supportResource(java.util.List < SupportResource> supportResource) {
                this.supportResource = supportResource;
                return this;
            }

            public SupportResources build() {
                return new SupportResources(this);
            } 

        } 

    }
}
