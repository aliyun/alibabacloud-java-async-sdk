// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableResourceInfoResponseBody</p>
 */
public class DescribeAvailableResourceInfoResponseBody extends TeaModel {
    @NameInMap("Images")
    private Images images;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportResources")
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

        public DescribeAvailableResourceInfoResponseBody build() {
            return new DescribeAvailableResourceInfoResponseBody(this);
        } 

    } 

    public static class Image extends TeaModel {
        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageSize")
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

            /**
             * ImageSize.
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
    public static class BandwidthTypes extends TeaModel {
        @NameInMap("BandwidthType")
        private java.util.List < String > bandwidthType;

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
        public java.util.List < String > getBandwidthType() {
            return this.bandwidthType;
        }

        public static final class Builder {
            private java.util.List < String > bandwidthType; 

            /**
             * BandwidthType.
             */
            public Builder bandwidthType(java.util.List < String > bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            public BandwidthTypes build() {
                return new BandwidthTypes(this);
            } 

        } 

    }
    public static class EnsRegionIds extends TeaModel {
        @NameInMap("EnsRegionId")
        private java.util.List < String > ensRegionId;

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
        public java.util.List < String > getEnsRegionId() {
            return this.ensRegionId;
        }

        public static final class Builder {
            private java.util.List < String > ensRegionId; 

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(java.util.List < String > ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            public EnsRegionIds build() {
                return new EnsRegionIds(this);
            } 

        } 

    }
    public static class EnsRegionId extends TeaModel {
        @NameInMap("Area")
        private String area;

        @NameInMap("EnName")
        private String enName;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Province")
        private String province;

        private EnsRegionId(Builder builder) {
            this.area = builder.area;
            this.enName = builder.enName;
            this.ensRegionId = builder.ensRegionId;
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
            private String name; 
            private String province; 

            /**
             * Area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * EnName.
             */
            public Builder enName(String enName) {
                this.enName = enName;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Province.
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
    public static class EnsRegionIdsExtends extends TeaModel {
        @NameInMap("EnsRegionId")
        private java.util.List < EnsRegionId> ensRegionId;

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
        public java.util.List < EnsRegionId> getEnsRegionId() {
            return this.ensRegionId;
        }

        public static final class Builder {
            private java.util.List < EnsRegionId> ensRegionId; 

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(java.util.List < EnsRegionId> ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            public EnsRegionIdsExtends build() {
                return new EnsRegionIdsExtends(this);
            } 

        } 

    }
    public static class InstanceSpeces extends TeaModel {
        @NameInMap("InstanceSpec")
        private java.util.List < String > instanceSpec;

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
        public java.util.List < String > getInstanceSpec() {
            return this.instanceSpec;
        }

        public static final class Builder {
            private java.util.List < String > instanceSpec; 

            /**
             * InstanceSpec.
             */
            public Builder instanceSpec(java.util.List < String > instanceSpec) {
                this.instanceSpec = instanceSpec;
                return this;
            }

            public InstanceSpeces build() {
                return new InstanceSpeces(this);
            } 

        } 

    }
    public static class SupportResource extends TeaModel {
        @NameInMap("BandwidthTypes")
        private BandwidthTypes bandwidthTypes;

        @NameInMap("DataDiskMaxSize")
        private Integer dataDiskMaxSize;

        @NameInMap("DataDiskMinSize")
        private Integer dataDiskMinSize;

        @NameInMap("EnsRegionIds")
        private EnsRegionIds ensRegionIds;

        @NameInMap("EnsRegionIdsExtends")
        private EnsRegionIdsExtends ensRegionIdsExtends;

        @NameInMap("InstanceSpeces")
        private InstanceSpeces instanceSpeces;

        @NameInMap("SystemDiskMaxSize")
        private Integer systemDiskMaxSize;

        @NameInMap("SystemDiskMinSize")
        private Integer systemDiskMinSize;

        private SupportResource(Builder builder) {
            this.bandwidthTypes = builder.bandwidthTypes;
            this.dataDiskMaxSize = builder.dataDiskMaxSize;
            this.dataDiskMinSize = builder.dataDiskMinSize;
            this.ensRegionIds = builder.ensRegionIds;
            this.ensRegionIdsExtends = builder.ensRegionIdsExtends;
            this.instanceSpeces = builder.instanceSpeces;
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
            private Integer systemDiskMaxSize; 
            private Integer systemDiskMinSize; 

            /**
             * BandwidthTypes.
             */
            public Builder bandwidthTypes(BandwidthTypes bandwidthTypes) {
                this.bandwidthTypes = bandwidthTypes;
                return this;
            }

            /**
             * DataDiskMaxSize.
             */
            public Builder dataDiskMaxSize(Integer dataDiskMaxSize) {
                this.dataDiskMaxSize = dataDiskMaxSize;
                return this;
            }

            /**
             * DataDiskMinSize.
             */
            public Builder dataDiskMinSize(Integer dataDiskMinSize) {
                this.dataDiskMinSize = dataDiskMinSize;
                return this;
            }

            /**
             * EnsRegionIds.
             */
            public Builder ensRegionIds(EnsRegionIds ensRegionIds) {
                this.ensRegionIds = ensRegionIds;
                return this;
            }

            /**
             * EnsRegionIdsExtends.
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
             * SystemDiskMaxSize.
             */
            public Builder systemDiskMaxSize(Integer systemDiskMaxSize) {
                this.systemDiskMaxSize = systemDiskMaxSize;
                return this;
            }

            /**
             * SystemDiskMinSize.
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
