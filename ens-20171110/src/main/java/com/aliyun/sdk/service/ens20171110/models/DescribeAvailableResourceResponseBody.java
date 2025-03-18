// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceResponseBody</p>
 */
public class DescribeAvailableResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Images")
    private Images images;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportResources")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAvailableResourceResponseBody model) {
            this.code = model.code;
            this.images = model.images;
            this.requestId = model.requestId;
            this.supportResources = model.supportResources;
        } 

        /**
         * <p>The returned service code. 0 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the images.</p>
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The ID of the request. This is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The specifications of resources that you can purchase.</p>
         */
        public Builder supportResources(SupportResources supportResources) {
            this.supportResources = supportResources;
            return this;
        }

        public DescribeAvailableResourceResponseBody build() {
            return new DescribeAvailableResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
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

            private Builder() {
            } 

            private Builder(Image model) {
                this.imageId = model.imageId;
                this.imageName = model.imageName;
            } 

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_alibase_20171208</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_alibase_****</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class Images extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Image")
        private java.util.List<Image> image;

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
        public java.util.List<Image> getImage() {
            return this.image;
        }

        public static final class Builder {
            private java.util.List<Image> image; 

            private Builder() {
            } 

            private Builder(Images model) {
                this.image = model.image;
            } 

            /**
             * Image.
             */
            public Builder image(java.util.List<Image> image) {
                this.image = image;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private String dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("SupportResourcesCount")
        private String supportResourcesCount;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
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

            private Builder() {
            } 

            private Builder(SupportResource model) {
                this.dataDiskSize = model.dataDiskSize;
                this.ensRegionId = model.ensRegionId;
                this.instanceSpec = model.instanceSpec;
                this.supportResourcesCount = model.supportResourcesCount;
                this.systemDiskSize = model.systemDiskSize;
            } 

            /**
             * <p>The size of the data disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder dataDiskSize(String dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-cmcc</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The specifications of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>ens.sn1.stiny</p>
             */
            public Builder instanceSpec(String instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            /**
             * <p>The number of resources that you can purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder supportResourcesCount(String supportResourcesCount) {
                this.supportResourcesCount = supportResourcesCount;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link DescribeAvailableResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceResponseBody</p>
     */
    public static class SupportResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportResource")
        private java.util.List<SupportResource> supportResource;

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
        public java.util.List<SupportResource> getSupportResource() {
            return this.supportResource;
        }

        public static final class Builder {
            private java.util.List<SupportResource> supportResource; 

            private Builder() {
            } 

            private Builder(SupportResources model) {
                this.supportResource = model.supportResource;
            } 

            /**
             * SupportResource.
             */
            public Builder supportResource(java.util.List<SupportResource> supportResource) {
                this.supportResource = supportResource;
                return this;
            }

            public SupportResources build() {
                return new SupportResources(this);
            } 

        } 

    }
}
