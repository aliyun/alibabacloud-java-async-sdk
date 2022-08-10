// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIntlImageProductVersionRequest} extends {@link RequestModel}
 *
 * <p>AddIntlImageProductVersionRequest</p>
 */
public class AddIntlImageProductVersionRequest extends Request {
    @Body
    @NameInMap("AccessDetail")
    private AccessDetail accessDetail;

    @Body
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Body
    @NameInMap("ImageConstraint")
    private ImageConstraint imageConstraint;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("Uid")
    private String uid;

    private AddIntlImageProductVersionRequest(Builder builder) {
        super(builder);
        this.accessDetail = builder.accessDetail;
        this.commodityCode = builder.commodityCode;
        this.imageConstraint = builder.imageConstraint;
        this.requestId = builder.requestId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIntlImageProductVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDetail
     */
    public AccessDetail getAccessDetail() {
        return this.accessDetail;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return imageConstraint
     */
    public ImageConstraint getImageConstraint() {
        return this.imageConstraint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<AddIntlImageProductVersionRequest, Builder> {
        private AccessDetail accessDetail; 
        private String commodityCode; 
        private ImageConstraint imageConstraint; 
        private String requestId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(AddIntlImageProductVersionRequest request) {
            super(request);
            this.accessDetail = request.accessDetail;
            this.commodityCode = request.commodityCode;
            this.imageConstraint = request.imageConstraint;
            this.requestId = request.requestId;
            this.uid = request.uid;
        } 

        /**
         * AccessDetail.
         */
        public Builder accessDetail(AccessDetail accessDetail) {
            this.putBodyParameter("AccessDetail", accessDetail);
            this.accessDetail = accessDetail;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * ImageConstraint.
         */
        public Builder imageConstraint(ImageConstraint imageConstraint) {
            this.putBodyParameter("ImageConstraint", imageConstraint);
            this.imageConstraint = imageConstraint;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public AddIntlImageProductVersionRequest build() {
            return new AddIntlImageProductVersionRequest(this);
        } 

    } 

    public static class AccessDetail extends TeaModel {
        @NameInMap("Ak")
        private String ak;

        @NameInMap("AutoPublish")
        private Boolean autoPublish;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageName")
        private String imageName;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("Region")
        private String region;

        @NameInMap("ReleaseNote")
        private String releaseNote;

        @NameInMap("ReleaseRegionOption")
        private String releaseRegionOption;

        @NameInMap("Secret")
        private String secret;

        private AccessDetail(Builder builder) {
            this.ak = builder.ak;
            this.autoPublish = builder.autoPublish;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.imageVersion = builder.imageVersion;
            this.region = builder.region;
            this.releaseNote = builder.releaseNote;
            this.releaseRegionOption = builder.releaseRegionOption;
            this.secret = builder.secret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDetail create() {
            return builder().build();
        }

        /**
         * @return ak
         */
        public String getAk() {
            return this.ak;
        }

        /**
         * @return autoPublish
         */
        public Boolean getAutoPublish() {
            return this.autoPublish;
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
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return releaseNote
         */
        public String getReleaseNote() {
            return this.releaseNote;
        }

        /**
         * @return releaseRegionOption
         */
        public String getReleaseRegionOption() {
            return this.releaseRegionOption;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        public static final class Builder {
            private String ak; 
            private Boolean autoPublish; 
            private String imageId; 
            private String imageName; 
            private String imageVersion; 
            private String region; 
            private String releaseNote; 
            private String releaseRegionOption; 
            private String secret; 

            /**
             * Ak.
             */
            public Builder ak(String ak) {
                this.ak = ak;
                return this;
            }

            /**
             * AutoPublish.
             */
            public Builder autoPublish(Boolean autoPublish) {
                this.autoPublish = autoPublish;
                return this;
            }

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
             * ImageVersion.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ReleaseNote.
             */
            public Builder releaseNote(String releaseNote) {
                this.releaseNote = releaseNote;
                return this;
            }

            /**
             * ReleaseRegionOption.
             */
            public Builder releaseRegionOption(String releaseRegionOption) {
                this.releaseRegionOption = releaseRegionOption;
                return this;
            }

            /**
             * Secret.
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            public AccessDetail build() {
                return new AccessDetail(this);
            } 

        } 

    }
    public static class BaseConfig extends TeaModel {
        @NameInMap("MaxCpu")
        private Integer maxCpu;

        @NameInMap("MaxMemory")
        private Float maxMemory;

        @NameInMap("MinBandwidth")
        private Integer minBandwidth;

        @NameInMap("MinCpu")
        private Integer minCpu;

        @NameInMap("MinDataDiskSize")
        private Integer minDataDiskSize;

        @NameInMap("MinMemory")
        private Float minMemory;

        @NameInMap("MinSystemDiskSize")
        private Integer minSystemDiskSize;

        private BaseConfig(Builder builder) {
            this.maxCpu = builder.maxCpu;
            this.maxMemory = builder.maxMemory;
            this.minBandwidth = builder.minBandwidth;
            this.minCpu = builder.minCpu;
            this.minDataDiskSize = builder.minDataDiskSize;
            this.minMemory = builder.minMemory;
            this.minSystemDiskSize = builder.minSystemDiskSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseConfig create() {
            return builder().build();
        }

        /**
         * @return maxCpu
         */
        public Integer getMaxCpu() {
            return this.maxCpu;
        }

        /**
         * @return maxMemory
         */
        public Float getMaxMemory() {
            return this.maxMemory;
        }

        /**
         * @return minBandwidth
         */
        public Integer getMinBandwidth() {
            return this.minBandwidth;
        }

        /**
         * @return minCpu
         */
        public Integer getMinCpu() {
            return this.minCpu;
        }

        /**
         * @return minDataDiskSize
         */
        public Integer getMinDataDiskSize() {
            return this.minDataDiskSize;
        }

        /**
         * @return minMemory
         */
        public Float getMinMemory() {
            return this.minMemory;
        }

        /**
         * @return minSystemDiskSize
         */
        public Integer getMinSystemDiskSize() {
            return this.minSystemDiskSize;
        }

        public static final class Builder {
            private Integer maxCpu; 
            private Float maxMemory; 
            private Integer minBandwidth; 
            private Integer minCpu; 
            private Integer minDataDiskSize; 
            private Float minMemory; 
            private Integer minSystemDiskSize; 

            /**
             * MaxCpu.
             */
            public Builder maxCpu(Integer maxCpu) {
                this.maxCpu = maxCpu;
                return this;
            }

            /**
             * MaxMemory.
             */
            public Builder maxMemory(Float maxMemory) {
                this.maxMemory = maxMemory;
                return this;
            }

            /**
             * MinBandwidth.
             */
            public Builder minBandwidth(Integer minBandwidth) {
                this.minBandwidth = minBandwidth;
                return this;
            }

            /**
             * MinCpu.
             */
            public Builder minCpu(Integer minCpu) {
                this.minCpu = minCpu;
                return this;
            }

            /**
             * MinDataDiskSize.
             */
            public Builder minDataDiskSize(Integer minDataDiskSize) {
                this.minDataDiskSize = minDataDiskSize;
                return this;
            }

            /**
             * MinMemory.
             */
            public Builder minMemory(Float minMemory) {
                this.minMemory = minMemory;
                return this;
            }

            /**
             * MinSystemDiskSize.
             */
            public Builder minSystemDiskSize(Integer minSystemDiskSize) {
                this.minSystemDiskSize = minSystemDiskSize;
                return this;
            }

            public BaseConfig build() {
                return new BaseConfig(this);
            } 

        } 

    }
    public static class ImageConstraint extends TeaModel {
        @NameInMap("BaseConfig")
        private BaseConfig baseConfig;

        @NameInMap("CustomizeFamilyConstraints")
        private java.util.Map < String, ? > customizeFamilyConstraints;

        @NameInMap("SupportMoreNetworkCards")
        private Boolean supportMoreNetworkCards;

        @NameInMap("TcpPortRange")
        private java.util.List < String > tcpPortRange;

        @NameInMap("UdpPortRange")
        private java.util.List < String > udpPortRange;

        private ImageConstraint(Builder builder) {
            this.baseConfig = builder.baseConfig;
            this.customizeFamilyConstraints = builder.customizeFamilyConstraints;
            this.supportMoreNetworkCards = builder.supportMoreNetworkCards;
            this.tcpPortRange = builder.tcpPortRange;
            this.udpPortRange = builder.udpPortRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageConstraint create() {
            return builder().build();
        }

        /**
         * @return baseConfig
         */
        public BaseConfig getBaseConfig() {
            return this.baseConfig;
        }

        /**
         * @return customizeFamilyConstraints
         */
        public java.util.Map < String, ? > getCustomizeFamilyConstraints() {
            return this.customizeFamilyConstraints;
        }

        /**
         * @return supportMoreNetworkCards
         */
        public Boolean getSupportMoreNetworkCards() {
            return this.supportMoreNetworkCards;
        }

        /**
         * @return tcpPortRange
         */
        public java.util.List < String > getTcpPortRange() {
            return this.tcpPortRange;
        }

        /**
         * @return udpPortRange
         */
        public java.util.List < String > getUdpPortRange() {
            return this.udpPortRange;
        }

        public static final class Builder {
            private BaseConfig baseConfig; 
            private java.util.Map < String, ? > customizeFamilyConstraints; 
            private Boolean supportMoreNetworkCards; 
            private java.util.List < String > tcpPortRange; 
            private java.util.List < String > udpPortRange; 

            /**
             * BaseConfig.
             */
            public Builder baseConfig(BaseConfig baseConfig) {
                this.baseConfig = baseConfig;
                return this;
            }

            /**
             * CustomizeFamilyConstraints.
             */
            public Builder customizeFamilyConstraints(java.util.Map < String, ? > customizeFamilyConstraints) {
                this.customizeFamilyConstraints = customizeFamilyConstraints;
                return this;
            }

            /**
             * SupportMoreNetworkCards.
             */
            public Builder supportMoreNetworkCards(Boolean supportMoreNetworkCards) {
                this.supportMoreNetworkCards = supportMoreNetworkCards;
                return this;
            }

            /**
             * TcpPortRange.
             */
            public Builder tcpPortRange(java.util.List < String > tcpPortRange) {
                this.tcpPortRange = tcpPortRange;
                return this;
            }

            /**
             * UdpPortRange.
             */
            public Builder udpPortRange(java.util.List < String > udpPortRange) {
                this.udpPortRange = udpPortRange;
                return this;
            }

            public ImageConstraint build() {
                return new ImageConstraint(this);
            } 

        } 

    }
}
