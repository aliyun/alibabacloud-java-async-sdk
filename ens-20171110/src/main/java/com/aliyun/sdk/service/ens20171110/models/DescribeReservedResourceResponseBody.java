// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedResourceResponseBody</p>
 */
public class DescribeReservedResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Images")
    private Images images;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportResources")
    private SupportResources supportResources;

    private DescribeReservedResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.images = builder.images;
        this.requestId = builder.requestId;
        this.supportResources = builder.supportResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedResourceResponseBody create() {
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Images.
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SupportResources.
         */
        public Builder supportResources(SupportResources supportResources) {
            this.supportResources = supportResources;
            return this;
        }

        public DescribeReservedResourceResponseBody build() {
            return new DescribeReservedResourceResponseBody(this);
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
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageName.
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
    public static class DataDiskSizes extends TeaModel {
        @NameInMap("DataDiskSize")
        private java.util.List < String > dataDiskSize;

        private DataDiskSizes(Builder builder) {
            this.dataDiskSize = builder.dataDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDiskSizes create() {
            return builder().build();
        }

        /**
         * @return dataDiskSize
         */
        public java.util.List < String > getDataDiskSize() {
            return this.dataDiskSize;
        }

        public static final class Builder {
            private java.util.List < String > dataDiskSize; 

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(java.util.List < String > dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            public DataDiskSizes build() {
                return new DataDiskSizes(this);
            } 

        } 

    }
    public static class SystemDiskSizes extends TeaModel {
        @NameInMap("SystemDiskSize")
        private java.util.List < String > systemDiskSize;

        private SystemDiskSizes(Builder builder) {
            this.systemDiskSize = builder.systemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDiskSizes create() {
            return builder().build();
        }

        /**
         * @return systemDiskSize
         */
        public java.util.List < String > getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private java.util.List < String > systemDiskSize; 

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(java.util.List < String > systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public SystemDiskSizes build() {
                return new SystemDiskSizes(this);
            } 

        } 

    }
    public static class SupportResource extends TeaModel {
        @NameInMap("DataDiskSizes")
        private DataDiskSizes dataDiskSizes;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("InstanceSpec")
        private String instanceSpec;

        @NameInMap("SupportResourcesCount")
        private String supportResourcesCount;

        @NameInMap("SystemDiskSizes")
        private SystemDiskSizes systemDiskSizes;

        private SupportResource(Builder builder) {
            this.dataDiskSizes = builder.dataDiskSizes;
            this.ensRegionId = builder.ensRegionId;
            this.instanceSpec = builder.instanceSpec;
            this.supportResourcesCount = builder.supportResourcesCount;
            this.systemDiskSizes = builder.systemDiskSizes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResource create() {
            return builder().build();
        }

        /**
         * @return dataDiskSizes
         */
        public DataDiskSizes getDataDiskSizes() {
            return this.dataDiskSizes;
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
         * @return systemDiskSizes
         */
        public SystemDiskSizes getSystemDiskSizes() {
            return this.systemDiskSizes;
        }

        public static final class Builder {
            private DataDiskSizes dataDiskSizes; 
            private String ensRegionId; 
            private String instanceSpec; 
            private String supportResourcesCount; 
            private SystemDiskSizes systemDiskSizes; 

            /**
             * DataDiskSizes.
             */
            public Builder dataDiskSizes(DataDiskSizes dataDiskSizes) {
                this.dataDiskSizes = dataDiskSizes;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * SupportResourcesCount.
             */
            public Builder supportResourcesCount(String supportResourcesCount) {
                this.supportResourcesCount = supportResourcesCount;
                return this;
            }

            /**
             * SystemDiskSizes.
             */
            public Builder systemDiskSizes(SystemDiskSizes systemDiskSizes) {
                this.systemDiskSizes = systemDiskSizes;
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
