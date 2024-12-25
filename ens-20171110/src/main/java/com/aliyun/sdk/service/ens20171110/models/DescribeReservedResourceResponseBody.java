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
 * {@link DescribeReservedResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReservedResourceResponseBody</p>
 */
public class DescribeReservedResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Images")
    private Images images;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportResources")
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
         * <p>The information about the image.</p>
         */
        public Builder images(Images images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6666C5A5-75ED-422E-A022-7121FA18C968</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
         */
        public Builder supportResources(SupportResources supportResources) {
            this.supportResources = supportResources;
            return this;
        }

        public DescribeReservedResourceResponseBody build() {
            return new DescribeReservedResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReservedResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedResourceResponseBody</p>
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

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_alibase_****</p>
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
     * {@link DescribeReservedResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedResourceResponseBody</p>
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
     * {@link DescribeReservedResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedResourceResponseBody</p>
     */
    public static class DataDiskSizes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskSize")
        private java.util.List<String> dataDiskSize;

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
        public java.util.List<String> getDataDiskSize() {
            return this.dataDiskSize;
        }

        public static final class Builder {
            private java.util.List<String> dataDiskSize; 

            /**
             * DataDiskSize.
             */
            public Builder dataDiskSize(java.util.List<String> dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            public DataDiskSizes build() {
                return new DataDiskSizes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReservedResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedResourceResponseBody</p>
     */
    public static class SystemDiskSizes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private java.util.List<String> systemDiskSize;

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
        public java.util.List<String> getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public static final class Builder {
            private java.util.List<String> systemDiskSize; 

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(java.util.List<String> systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            public SystemDiskSizes build() {
                return new SystemDiskSizes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeReservedResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedResourceResponseBody</p>
     */
    public static class SupportResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDiskSizes")
        private DataDiskSizes dataDiskSizes;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private String instanceSpec;

        @com.aliyun.core.annotation.NameInMap("SupportResourcesCount")
        private String supportResourcesCount;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSizes")
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
             * <p>The sizes of data disks.</p>
             */
            public Builder dataDiskSizes(DataDiskSizes dataDiskSizes) {
                this.dataDiskSizes = dataDiskSizes;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-cmcc</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The specifications of instances.</p>
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
             * <p>The sizes of system disks.</p>
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
    /**
     * 
     * {@link DescribeReservedResourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeReservedResourceResponseBody</p>
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
