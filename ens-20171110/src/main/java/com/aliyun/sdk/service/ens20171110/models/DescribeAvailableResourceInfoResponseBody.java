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
 * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceInfoResponseBody</p>
 */
public class DescribeAvailableResourceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Images")
    private Images images;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportResources")
    private SupportResources supportResources;

    private DescribeAvailableResourceInfoResponseBody(Builder builder) {
        this.images = builder.images;
        this.requestId = builder.requestId;
        this.supportResources = builder.supportResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableResourceInfoResponseBody create() {
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

    /**
     * @return supportResources
     */
    public SupportResources getSupportResources() {
        return this.supportResources;
    }

    public static final class Builder {
        private Images images; 
        private String requestId; 
        private SupportResources supportResources; 

        private Builder() {
        } 

        private Builder(DescribeAvailableResourceInfoResponseBody model) {
            this.images = model.images;
            this.requestId = model.requestId;
            this.supportResources = model.supportResources;
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
         * <p>8629F679-B51D-4194-A1CC-5D8F504C362B</p>
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

        public DescribeAvailableResourceInfoResponseBody build() {
            return new DescribeAvailableResourceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
     */
    public static class Image extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("ImageSize")
        private Integer imageSize;

        private Image(Builder builder) {
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageSize = builder.imageSize;
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

        /**
         * @return imageSize
         */
        public Integer getImageSize() {
            return this.imageSize;
        }

        public static final class Builder {
            private String imageId; 
            private String imageName; 
            private Integer imageSize; 

            private Builder() {
            } 

            private Builder(Image model) {
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.imageSize = model.imageSize;
            } 

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_a****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_6_08_64_20G_a****</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The size of the image. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder imageSize(Integer imageSize) {
                this.imageSize = imageSize;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
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
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
     */
    public static class BandwidthTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthType")
        private java.util.List<String> bandwidthType;

        private BandwidthTypes(Builder builder) {
            this.bandwidthType = builder.bandwidthType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthTypes create() {
            return builder().build();
        }

        /**
         * @return bandwidthType
         */
        public java.util.List<String> getBandwidthType() {
            return this.bandwidthType;
        }

        public static final class Builder {
            private java.util.List<String> bandwidthType; 

            private Builder() {
            } 

            private Builder(BandwidthTypes model) {
                this.bandwidthType = model.bandwidthType;
            } 

            /**
             * BandwidthType.
             */
            public Builder bandwidthType(java.util.List<String> bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            public BandwidthTypes build() {
                return new BandwidthTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
     */
    public static class EnsRegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private java.util.List<String> ensRegionId;

        private EnsRegionIds(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsRegionIds create() {
            return builder().build();
        }

        /**
         * @return ensRegionId
         */
        public java.util.List<String> getEnsRegionId() {
            return this.ensRegionId;
        }

        public static final class Builder {
            private java.util.List<String> ensRegionId; 

            private Builder() {
            } 

            private Builder(EnsRegionIds model) {
                this.ensRegionId = model.ensRegionId;
            } 

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(java.util.List<String> ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            public EnsRegionIds build() {
                return new EnsRegionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
     */
    public static class EnsRegionId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("EnName")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private EnsRegionId(Builder builder) {
            this.area = builder.area;
            this.enName = builder.enName;
            this.ensRegionId = builder.ensRegionId;
            this.isp = builder.isp;
            this.name = builder.name;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsRegionId create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String area; 
            private String enName; 
            private String ensRegionId; 
            private String isp; 
            private String name; 
            private String province; 

            private Builder() {
            } 

            private Builder(EnsRegionId model) {
                this.area = model.area;
                this.enName = model.enName;
                this.ensRegionId = model.ensRegionId;
                this.isp = model.isp;
                this.name = model.name;
                this.province = model.province;
            } 

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>EastChina</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>The name. This parameter is empty by default.</p>
             * 
             * <strong>example:</strong>
             * <p>EnName</p>
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-telecom-4</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The information about the Internet service provider (ISP).</p>
             * 
             * <strong>example:</strong>
             * <p>unicom</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The name of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>Taizhou Telecom, China Unicom, and China Mobile</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The province.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhejiang Province</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public EnsRegionId build() {
                return new EnsRegionId(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
     */
    public static class EnsRegionIdsExtends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private java.util.List<EnsRegionId> ensRegionId;

        private EnsRegionIdsExtends(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnsRegionIdsExtends create() {
            return builder().build();
        }

        /**
         * @return ensRegionId
         */
        public java.util.List<EnsRegionId> getEnsRegionId() {
            return this.ensRegionId;
        }

        public static final class Builder {
            private java.util.List<EnsRegionId> ensRegionId; 

            private Builder() {
            } 

            private Builder(EnsRegionIdsExtends model) {
                this.ensRegionId = model.ensRegionId;
            } 

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-telecom-4</p>
             */
            public Builder ensRegionId(java.util.List<EnsRegionId> ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            public EnsRegionIdsExtends build() {
                return new EnsRegionIdsExtends(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
     */
    public static class InstanceSpeces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceSpec")
        private java.util.List<String> instanceSpec;

        private InstanceSpeces(Builder builder) {
            this.instanceSpec = builder.instanceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpeces create() {
            return builder().build();
        }

        /**
         * @return instanceSpec
         */
        public java.util.List<String> getInstanceSpec() {
            return this.instanceSpec;
        }

        public static final class Builder {
            private java.util.List<String> instanceSpec; 

            private Builder() {
            } 

            private Builder(InstanceSpeces model) {
                this.instanceSpec = model.instanceSpec;
            } 

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(java.util.List<String> instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            public InstanceSpeces build() {
                return new InstanceSpeces(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
     */
    public static class Isp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Isp")
        private java.util.List<String> isp;

        private Isp(Builder builder) {
            this.isp = builder.isp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Isp create() {
            return builder().build();
        }

        /**
         * @return isp
         */
        public java.util.List<String> getIsp() {
            return this.isp;
        }

        public static final class Builder {
            private java.util.List<String> isp; 

            private Builder() {
            } 

            private Builder(Isp model) {
                this.isp = model.isp;
            } 

            /**
             * <p>The information about the Internet service provider (ISP).</p>
             * 
             * <strong>example:</strong>
             * <p>unicom</p>
             */
            public Builder isp(java.util.List<String> isp) {
                this.isp = isp;
                return this;
            }

            public Isp build() {
                return new Isp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
     */
    public static class SupportResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthTypes")
        private BandwidthTypes bandwidthTypes;

        @com.aliyun.core.annotation.NameInMap("DataDiskMaxSize")
        private Integer dataDiskMaxSize;

        @com.aliyun.core.annotation.NameInMap("DataDiskMinSize")
        private Integer dataDiskMinSize;

        @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
        private EnsRegionIds ensRegionIds;

        @com.aliyun.core.annotation.NameInMap("EnsRegionIdsExtends")
        private EnsRegionIdsExtends ensRegionIdsExtends;

        @com.aliyun.core.annotation.NameInMap("InstanceSpeces")
        private InstanceSpeces instanceSpeces;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private Isp isp;

        @com.aliyun.core.annotation.NameInMap("SystemDiskMaxSize")
        private Integer systemDiskMaxSize;

        @com.aliyun.core.annotation.NameInMap("SystemDiskMinSize")
        private Integer systemDiskMinSize;

        private SupportResource(Builder builder) {
            this.bandwidthTypes = builder.bandwidthTypes;
            this.dataDiskMaxSize = builder.dataDiskMaxSize;
            this.dataDiskMinSize = builder.dataDiskMinSize;
            this.ensRegionIds = builder.ensRegionIds;
            this.ensRegionIdsExtends = builder.ensRegionIdsExtends;
            this.instanceSpeces = builder.instanceSpeces;
            this.isp = builder.isp;
            this.systemDiskMaxSize = builder.systemDiskMaxSize;
            this.systemDiskMinSize = builder.systemDiskMinSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResource create() {
            return builder().build();
        }

        /**
         * @return bandwidthTypes
         */
        public BandwidthTypes getBandwidthTypes() {
            return this.bandwidthTypes;
        }

        /**
         * @return dataDiskMaxSize
         */
        public Integer getDataDiskMaxSize() {
            return this.dataDiskMaxSize;
        }

        /**
         * @return dataDiskMinSize
         */
        public Integer getDataDiskMinSize() {
            return this.dataDiskMinSize;
        }

        /**
         * @return ensRegionIds
         */
        public EnsRegionIds getEnsRegionIds() {
            return this.ensRegionIds;
        }

        /**
         * @return ensRegionIdsExtends
         */
        public EnsRegionIdsExtends getEnsRegionIdsExtends() {
            return this.ensRegionIdsExtends;
        }

        /**
         * @return instanceSpeces
         */
        public InstanceSpeces getInstanceSpeces() {
            return this.instanceSpeces;
        }

        /**
         * @return isp
         */
        public Isp getIsp() {
            return this.isp;
        }

        /**
         * @return systemDiskMaxSize
         */
        public Integer getSystemDiskMaxSize() {
            return this.systemDiskMaxSize;
        }

        /**
         * @return systemDiskMinSize
         */
        public Integer getSystemDiskMinSize() {
            return this.systemDiskMinSize;
        }

        public static final class Builder {
            private BandwidthTypes bandwidthTypes; 
            private Integer dataDiskMaxSize; 
            private Integer dataDiskMinSize; 
            private EnsRegionIds ensRegionIds; 
            private EnsRegionIdsExtends ensRegionIdsExtends; 
            private InstanceSpeces instanceSpeces; 
            private Isp isp; 
            private Integer systemDiskMaxSize; 
            private Integer systemDiskMinSize; 

            private Builder() {
            } 

            private Builder(SupportResource model) {
                this.bandwidthTypes = model.bandwidthTypes;
                this.dataDiskMaxSize = model.dataDiskMaxSize;
                this.dataDiskMinSize = model.dataDiskMinSize;
                this.ensRegionIds = model.ensRegionIds;
                this.ensRegionIdsExtends = model.ensRegionIdsExtends;
                this.instanceSpeces = model.instanceSpeces;
                this.isp = model.isp;
                this.systemDiskMaxSize = model.systemDiskMaxSize;
                this.systemDiskMinSize = model.systemDiskMinSize;
            } 

            /**
             * <p>Bandwidth billing method.</p>
             */
            public Builder bandwidthTypes(BandwidthTypes bandwidthTypes) {
                this.bandwidthTypes = bandwidthTypes;
                return this;
            }

            /**
             * <p>The maximum capacity of a data disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder dataDiskMaxSize(Integer dataDiskMaxSize) {
                this.dataDiskMaxSize = dataDiskMaxSize;
                return this;
            }

            /**
             * <p>The minimum data disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dataDiskMinSize(Integer dataDiskMinSize) {
                this.dataDiskMinSize = dataDiskMinSize;
                return this;
            }

            /**
             * <p>node ID</p>
             */
            public Builder ensRegionIds(EnsRegionIds ensRegionIds) {
                this.ensRegionIds = ensRegionIds;
                return this;
            }

            /**
             * <p>The supplementary information about the edge nodes.</p>
             */
            public Builder ensRegionIdsExtends(EnsRegionIdsExtends ensRegionIdsExtends) {
                this.ensRegionIdsExtends = ensRegionIdsExtends;
                return this;
            }

            /**
             * InstanceSpeces.
             */
            public Builder instanceSpeces(InstanceSpeces instanceSpeces) {
                this.instanceSpeces = instanceSpeces;
                return this;
            }

            /**
             * <p>Operator</p>
             */
            public Builder isp(Isp isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The maximum size of the system disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder systemDiskMaxSize(Integer systemDiskMaxSize) {
                this.systemDiskMaxSize = systemDiskMaxSize;
                return this;
            }

            /**
             * <p>The minimum capacity of a system disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder systemDiskMinSize(Integer systemDiskMinSize) {
                this.systemDiskMinSize = systemDiskMinSize;
                return this;
            }

            public SupportResource build() {
                return new SupportResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableResourceInfoResponseBody</p>
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
