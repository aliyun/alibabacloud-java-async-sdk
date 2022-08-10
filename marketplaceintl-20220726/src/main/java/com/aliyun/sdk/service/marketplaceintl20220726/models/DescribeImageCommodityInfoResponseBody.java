// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCommodityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageCommodityInfoResponseBody</p>
 */
public class DescribeImageCommodityInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Msg")
    private String msg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeImageCommodityInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageCommodityInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String errorCode; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageCommodityInfoResponseBody build() {
            return new DescribeImageCommodityInfoResponseBody(this);
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
    public static class AccessInfo extends TeaModel {
        @NameInMap("AccessDetail")
        private AccessDetail accessDetail;

        @NameInMap("AutoPublish")
        private Boolean autoPublish;

        @NameInMap("ImageConstraint")
        private ImageConstraint imageConstraint;

        @NameInMap("Name")
        private String name;

        @NameInMap("ReleaseRegion")
        private String releaseRegion;

        @NameInMap("ReleaseRegionOption")
        private String releaseRegionOption;

        @NameInMap("Type")
        private Integer type;

        private AccessInfo(Builder builder) {
            this.accessDetail = builder.accessDetail;
            this.autoPublish = builder.autoPublish;
            this.imageConstraint = builder.imageConstraint;
            this.name = builder.name;
            this.releaseRegion = builder.releaseRegion;
            this.releaseRegionOption = builder.releaseRegionOption;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessInfo create() {
            return builder().build();
        }

        /**
         * @return accessDetail
         */
        public AccessDetail getAccessDetail() {
            return this.accessDetail;
        }

        /**
         * @return autoPublish
         */
        public Boolean getAutoPublish() {
            return this.autoPublish;
        }

        /**
         * @return imageConstraint
         */
        public ImageConstraint getImageConstraint() {
            return this.imageConstraint;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return releaseRegion
         */
        public String getReleaseRegion() {
            return this.releaseRegion;
        }

        /**
         * @return releaseRegionOption
         */
        public String getReleaseRegionOption() {
            return this.releaseRegionOption;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private AccessDetail accessDetail; 
            private Boolean autoPublish; 
            private ImageConstraint imageConstraint; 
            private String name; 
            private String releaseRegion; 
            private String releaseRegionOption; 
            private Integer type; 

            /**
             * AccessDetail.
             */
            public Builder accessDetail(AccessDetail accessDetail) {
                this.accessDetail = accessDetail;
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
             * ImageConstraint.
             */
            public Builder imageConstraint(ImageConstraint imageConstraint) {
                this.imageConstraint = imageConstraint;
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
             * ReleaseRegion.
             */
            public Builder releaseRegion(String releaseRegion) {
                this.releaseRegion = releaseRegion;
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
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public AccessInfo build() {
                return new AccessInfo(this);
            } 

        } 

    }
    public static class BasicInfo extends TeaModel {
        @NameInMap("CommodityAfterSale")
        private String commodityAfterSale;

        @NameInMap("CommodityDetail")
        private String commodityDetail;

        @NameInMap("CommodityFeature")
        private String commodityFeature;

        @NameInMap("CommodityIntroduction")
        private String commodityIntroduction;

        @NameInMap("CommodityPicture")
        private String commodityPicture;

        @NameInMap("CommodityPictureName")
        private String commodityPictureName;

        @NameInMap("CommodityPictureStream")
        private String commodityPictureStream;

        @NameInMap("CommodityQualification")
        private java.util.List < String > commodityQualification;

        @NameInMap("CommodityRefundPolicy")
        private String commodityRefundPolicy;

        @NameInMap("CommodityUserGuide")
        private String commodityUserGuide;

        @NameInMap("CommodityVideoName")
        private String commodityVideoName;

        @NameInMap("CommodityVideoStream")
        private String commodityVideoStream;

        @NameInMap("CommodityVideoUrl")
        private String commodityVideoUrl;

        @NameInMap("VideoSelect")
        private String videoSelect;

        private BasicInfo(Builder builder) {
            this.commodityAfterSale = builder.commodityAfterSale;
            this.commodityDetail = builder.commodityDetail;
            this.commodityFeature = builder.commodityFeature;
            this.commodityIntroduction = builder.commodityIntroduction;
            this.commodityPicture = builder.commodityPicture;
            this.commodityPictureName = builder.commodityPictureName;
            this.commodityPictureStream = builder.commodityPictureStream;
            this.commodityQualification = builder.commodityQualification;
            this.commodityRefundPolicy = builder.commodityRefundPolicy;
            this.commodityUserGuide = builder.commodityUserGuide;
            this.commodityVideoName = builder.commodityVideoName;
            this.commodityVideoStream = builder.commodityVideoStream;
            this.commodityVideoUrl = builder.commodityVideoUrl;
            this.videoSelect = builder.videoSelect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicInfo create() {
            return builder().build();
        }

        /**
         * @return commodityAfterSale
         */
        public String getCommodityAfterSale() {
            return this.commodityAfterSale;
        }

        /**
         * @return commodityDetail
         */
        public String getCommodityDetail() {
            return this.commodityDetail;
        }

        /**
         * @return commodityFeature
         */
        public String getCommodityFeature() {
            return this.commodityFeature;
        }

        /**
         * @return commodityIntroduction
         */
        public String getCommodityIntroduction() {
            return this.commodityIntroduction;
        }

        /**
         * @return commodityPicture
         */
        public String getCommodityPicture() {
            return this.commodityPicture;
        }

        /**
         * @return commodityPictureName
         */
        public String getCommodityPictureName() {
            return this.commodityPictureName;
        }

        /**
         * @return commodityPictureStream
         */
        public String getCommodityPictureStream() {
            return this.commodityPictureStream;
        }

        /**
         * @return commodityQualification
         */
        public java.util.List < String > getCommodityQualification() {
            return this.commodityQualification;
        }

        /**
         * @return commodityRefundPolicy
         */
        public String getCommodityRefundPolicy() {
            return this.commodityRefundPolicy;
        }

        /**
         * @return commodityUserGuide
         */
        public String getCommodityUserGuide() {
            return this.commodityUserGuide;
        }

        /**
         * @return commodityVideoName
         */
        public String getCommodityVideoName() {
            return this.commodityVideoName;
        }

        /**
         * @return commodityVideoStream
         */
        public String getCommodityVideoStream() {
            return this.commodityVideoStream;
        }

        /**
         * @return commodityVideoUrl
         */
        public String getCommodityVideoUrl() {
            return this.commodityVideoUrl;
        }

        /**
         * @return videoSelect
         */
        public String getVideoSelect() {
            return this.videoSelect;
        }

        public static final class Builder {
            private String commodityAfterSale; 
            private String commodityDetail; 
            private String commodityFeature; 
            private String commodityIntroduction; 
            private String commodityPicture; 
            private String commodityPictureName; 
            private String commodityPictureStream; 
            private java.util.List < String > commodityQualification; 
            private String commodityRefundPolicy; 
            private String commodityUserGuide; 
            private String commodityVideoName; 
            private String commodityVideoStream; 
            private String commodityVideoUrl; 
            private String videoSelect; 

            /**
             * CommodityAfterSale.
             */
            public Builder commodityAfterSale(String commodityAfterSale) {
                this.commodityAfterSale = commodityAfterSale;
                return this;
            }

            /**
             * CommodityDetail.
             */
            public Builder commodityDetail(String commodityDetail) {
                this.commodityDetail = commodityDetail;
                return this;
            }

            /**
             * CommodityFeature.
             */
            public Builder commodityFeature(String commodityFeature) {
                this.commodityFeature = commodityFeature;
                return this;
            }

            /**
             * CommodityIntroduction.
             */
            public Builder commodityIntroduction(String commodityIntroduction) {
                this.commodityIntroduction = commodityIntroduction;
                return this;
            }

            /**
             * CommodityPicture.
             */
            public Builder commodityPicture(String commodityPicture) {
                this.commodityPicture = commodityPicture;
                return this;
            }

            /**
             * CommodityPictureName.
             */
            public Builder commodityPictureName(String commodityPictureName) {
                this.commodityPictureName = commodityPictureName;
                return this;
            }

            /**
             * CommodityPictureStream.
             */
            public Builder commodityPictureStream(String commodityPictureStream) {
                this.commodityPictureStream = commodityPictureStream;
                return this;
            }

            /**
             * CommodityQualification.
             */
            public Builder commodityQualification(java.util.List < String > commodityQualification) {
                this.commodityQualification = commodityQualification;
                return this;
            }

            /**
             * CommodityRefundPolicy.
             */
            public Builder commodityRefundPolicy(String commodityRefundPolicy) {
                this.commodityRefundPolicy = commodityRefundPolicy;
                return this;
            }

            /**
             * CommodityUserGuide.
             */
            public Builder commodityUserGuide(String commodityUserGuide) {
                this.commodityUserGuide = commodityUserGuide;
                return this;
            }

            /**
             * CommodityVideoName.
             */
            public Builder commodityVideoName(String commodityVideoName) {
                this.commodityVideoName = commodityVideoName;
                return this;
            }

            /**
             * CommodityVideoStream.
             */
            public Builder commodityVideoStream(String commodityVideoStream) {
                this.commodityVideoStream = commodityVideoStream;
                return this;
            }

            /**
             * CommodityVideoUrl.
             */
            public Builder commodityVideoUrl(String commodityVideoUrl) {
                this.commodityVideoUrl = commodityVideoUrl;
                return this;
            }

            /**
             * VideoSelect.
             */
            public Builder videoSelect(String videoSelect) {
                this.videoSelect = videoSelect;
                return this;
            }

            public BasicInfo build() {
                return new BasicInfo(this);
            } 

        } 

    }
    public static class BussinessInfo extends TeaModel {
        @NameInMap("CategoryId")
        private String categoryId;

        @NameInMap("PipCode")
        private String pipCode;

        @NameInMap("SeoDescription")
        private String seoDescription;

        @NameInMap("SeoKeywords")
        private String seoKeywords;

        private BussinessInfo(Builder builder) {
            this.categoryId = builder.categoryId;
            this.pipCode = builder.pipCode;
            this.seoDescription = builder.seoDescription;
            this.seoKeywords = builder.seoKeywords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BussinessInfo create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return pipCode
         */
        public String getPipCode() {
            return this.pipCode;
        }

        /**
         * @return seoDescription
         */
        public String getSeoDescription() {
            return this.seoDescription;
        }

        /**
         * @return seoKeywords
         */
        public String getSeoKeywords() {
            return this.seoKeywords;
        }

        public static final class Builder {
            private String categoryId; 
            private String pipCode; 
            private String seoDescription; 
            private String seoKeywords; 

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * PipCode.
             */
            public Builder pipCode(String pipCode) {
                this.pipCode = pipCode;
                return this;
            }

            /**
             * SeoDescription.
             */
            public Builder seoDescription(String seoDescription) {
                this.seoDescription = seoDescription;
                return this;
            }

            /**
             * SeoKeywords.
             */
            public Builder seoKeywords(String seoKeywords) {
                this.seoKeywords = seoKeywords;
                return this;
            }

            public BussinessInfo build() {
                return new BussinessInfo(this);
            } 

        } 

    }
    public static class ProtocolInfo extends TeaModel {
        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("CustomsTarifNumber")
        private String customsTarifNumber;

        @NameInMap("EarControlled")
        private String earControlled;

        @NameInMap("EccnCode")
        private String eccnCode;

        @NameInMap("FinalUserProtocol")
        private String finalUserProtocol;

        @NameInMap("IdentificationMethod")
        private String identificationMethod;

        @NameInMap("License")
        private String license;

        @NameInMap("LicenseException")
        private String licenseException;

        @NameInMap("LocalExportControlClassificationNumber")
        private String localExportControlClassificationNumber;

        @NameInMap("OfficialIdentificationNumber")
        private String officialIdentificationNumber;

        @NameInMap("ProductCryType")
        private String productCryType;

        @NameInMap("ProductType")
        private String productType;

        private ProtocolInfo(Builder builder) {
            this.agentName = builder.agentName;
            this.customsTarifNumber = builder.customsTarifNumber;
            this.earControlled = builder.earControlled;
            this.eccnCode = builder.eccnCode;
            this.finalUserProtocol = builder.finalUserProtocol;
            this.identificationMethod = builder.identificationMethod;
            this.license = builder.license;
            this.licenseException = builder.licenseException;
            this.localExportControlClassificationNumber = builder.localExportControlClassificationNumber;
            this.officialIdentificationNumber = builder.officialIdentificationNumber;
            this.productCryType = builder.productCryType;
            this.productType = builder.productType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolInfo create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return customsTarifNumber
         */
        public String getCustomsTarifNumber() {
            return this.customsTarifNumber;
        }

        /**
         * @return earControlled
         */
        public String getEarControlled() {
            return this.earControlled;
        }

        /**
         * @return eccnCode
         */
        public String getEccnCode() {
            return this.eccnCode;
        }

        /**
         * @return finalUserProtocol
         */
        public String getFinalUserProtocol() {
            return this.finalUserProtocol;
        }

        /**
         * @return identificationMethod
         */
        public String getIdentificationMethod() {
            return this.identificationMethod;
        }

        /**
         * @return license
         */
        public String getLicense() {
            return this.license;
        }

        /**
         * @return licenseException
         */
        public String getLicenseException() {
            return this.licenseException;
        }

        /**
         * @return localExportControlClassificationNumber
         */
        public String getLocalExportControlClassificationNumber() {
            return this.localExportControlClassificationNumber;
        }

        /**
         * @return officialIdentificationNumber
         */
        public String getOfficialIdentificationNumber() {
            return this.officialIdentificationNumber;
        }

        /**
         * @return productCryType
         */
        public String getProductCryType() {
            return this.productCryType;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        public static final class Builder {
            private String agentName; 
            private String customsTarifNumber; 
            private String earControlled; 
            private String eccnCode; 
            private String finalUserProtocol; 
            private String identificationMethod; 
            private String license; 
            private String licenseException; 
            private String localExportControlClassificationNumber; 
            private String officialIdentificationNumber; 
            private String productCryType; 
            private String productType; 

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * CustomsTarifNumber.
             */
            public Builder customsTarifNumber(String customsTarifNumber) {
                this.customsTarifNumber = customsTarifNumber;
                return this;
            }

            /**
             * EarControlled.
             */
            public Builder earControlled(String earControlled) {
                this.earControlled = earControlled;
                return this;
            }

            /**
             * EccnCode.
             */
            public Builder eccnCode(String eccnCode) {
                this.eccnCode = eccnCode;
                return this;
            }

            /**
             * FinalUserProtocol.
             */
            public Builder finalUserProtocol(String finalUserProtocol) {
                this.finalUserProtocol = finalUserProtocol;
                return this;
            }

            /**
             * IdentificationMethod.
             */
            public Builder identificationMethod(String identificationMethod) {
                this.identificationMethod = identificationMethod;
                return this;
            }

            /**
             * License.
             */
            public Builder license(String license) {
                this.license = license;
                return this;
            }

            /**
             * LicenseException.
             */
            public Builder licenseException(String licenseException) {
                this.licenseException = licenseException;
                return this;
            }

            /**
             * LocalExportControlClassificationNumber.
             */
            public Builder localExportControlClassificationNumber(String localExportControlClassificationNumber) {
                this.localExportControlClassificationNumber = localExportControlClassificationNumber;
                return this;
            }

            /**
             * OfficialIdentificationNumber.
             */
            public Builder officialIdentificationNumber(String officialIdentificationNumber) {
                this.officialIdentificationNumber = officialIdentificationNumber;
                return this;
            }

            /**
             * ProductCryType.
             */
            public Builder productCryType(String productCryType) {
                this.productCryType = productCryType;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            public ProtocolInfo build() {
                return new ProtocolInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AccessInfo")
        private AccessInfo accessInfo;

        @NameInMap("BasicInfo")
        private BasicInfo basicInfo;

        @NameInMap("BussinessInfo")
        private BussinessInfo bussinessInfo;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("ProtocolInfo")
        private ProtocolInfo protocolInfo;

        @NameInMap("TrackId")
        private String trackId;

        private Data(Builder builder) {
            this.accessInfo = builder.accessInfo;
            this.basicInfo = builder.basicInfo;
            this.bussinessInfo = builder.bussinessInfo;
            this.commodityCode = builder.commodityCode;
            this.protocolInfo = builder.protocolInfo;
            this.trackId = builder.trackId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessInfo
         */
        public AccessInfo getAccessInfo() {
            return this.accessInfo;
        }

        /**
         * @return basicInfo
         */
        public BasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        /**
         * @return bussinessInfo
         */
        public BussinessInfo getBussinessInfo() {
            return this.bussinessInfo;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return protocolInfo
         */
        public ProtocolInfo getProtocolInfo() {
            return this.protocolInfo;
        }

        /**
         * @return trackId
         */
        public String getTrackId() {
            return this.trackId;
        }

        public static final class Builder {
            private AccessInfo accessInfo; 
            private BasicInfo basicInfo; 
            private BussinessInfo bussinessInfo; 
            private String commodityCode; 
            private ProtocolInfo protocolInfo; 
            private String trackId; 

            /**
             * AccessInfo.
             */
            public Builder accessInfo(AccessInfo accessInfo) {
                this.accessInfo = accessInfo;
                return this;
            }

            /**
             * BasicInfo.
             */
            public Builder basicInfo(BasicInfo basicInfo) {
                this.basicInfo = basicInfo;
                return this;
            }

            /**
             * BussinessInfo.
             */
            public Builder bussinessInfo(BussinessInfo bussinessInfo) {
                this.bussinessInfo = bussinessInfo;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * ProtocolInfo.
             */
            public Builder protocolInfo(ProtocolInfo protocolInfo) {
                this.protocolInfo = protocolInfo;
                return this;
            }

            /**
             * TrackId.
             */
            public Builder trackId(String trackId) {
                this.trackId = trackId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
