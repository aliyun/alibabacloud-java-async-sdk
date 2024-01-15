// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(maximum = 1000, minimum = 1)
    private Integer amount;

    @Query
    @NameInMap("Bandwidth")
    @Validation(maximum = 2048, minimum = 1)
    private Integer bandwidth;

    @Query
    @NameInMap("BundleModels")
    private java.util.List < BundleModels> bundleModels;

    @Query
    @NameInMap("EduCdsEnable")
    private String eduCdsEnable;

    @Query
    @NameInMap("EduCdsSize")
    private Integer eduCdsSize;

    @Query
    @NameInMap("EduCommittedTime")
    private Integer eduCommittedTime;

    @Query
    @NameInMap("EduDesktopBundleId")
    private String eduDesktopBundleId;

    @Query
    @NameInMap("EduDesktopNum")
    private Integer eduDesktopNum;

    @Query
    @NameInMap("EduRoomClassify")
    private String eduRoomClassify;

    @Query
    @NameInMap("EduStudentBundleId")
    private String eduStudentBundleId;

    @Query
    @NameInMap("EduStudentNum")
    private Integer eduStudentNum;

    @Query
    @NameInMap("EduTeacherBundleId")
    private String eduTeacherBundleId;

    @Query
    @NameInMap("EduTeacherNum")
    private Integer eduTeacherNum;

    @Query
    @NameInMap("GroupDesktopCount")
    private Integer groupDesktopCount;

    @Query
    @NameInMap("HardwareVersion")
    private String hardwareVersion;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("OsType")
    private String osType;

    @Query
    @NameInMap("PackageSize")
    private Integer packageSize;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PromotionId")
    private String promotionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("RootDiskPerformanceLevel")
    private String rootDiskPerformanceLevel;

    @Query
    @NameInMap("RootDiskSizeGib")
    @Validation(maximum = 32768)
    private Integer rootDiskSizeGib;

    @Query
    @NameInMap("SpPeriodInfo")
    private String spPeriodInfo;

    @Query
    @NameInMap("SpPrice")
    private Boolean spPrice;

    @Query
    @NameInMap("SpType")
    private String spType;

    @Query
    @NameInMap("UserDiskPerformanceLevel")
    private String userDiskPerformanceLevel;

    @Query
    @NameInMap("UserDiskSizeGib")
    @Validation(maximum = 32768)
    private Integer userDiskSizeGib;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.bandwidth = builder.bandwidth;
        this.bundleModels = builder.bundleModels;
        this.eduCdsEnable = builder.eduCdsEnable;
        this.eduCdsSize = builder.eduCdsSize;
        this.eduCommittedTime = builder.eduCommittedTime;
        this.eduDesktopBundleId = builder.eduDesktopBundleId;
        this.eduDesktopNum = builder.eduDesktopNum;
        this.eduRoomClassify = builder.eduRoomClassify;
        this.eduStudentBundleId = builder.eduStudentBundleId;
        this.eduStudentNum = builder.eduStudentNum;
        this.eduTeacherBundleId = builder.eduTeacherBundleId;
        this.eduTeacherNum = builder.eduTeacherNum;
        this.groupDesktopCount = builder.groupDesktopCount;
        this.hardwareVersion = builder.hardwareVersion;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.networkType = builder.networkType;
        this.osType = builder.osType;
        this.packageSize = builder.packageSize;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.rootDiskPerformanceLevel = builder.rootDiskPerformanceLevel;
        this.rootDiskSizeGib = builder.rootDiskSizeGib;
        this.spPeriodInfo = builder.spPeriodInfo;
        this.spPrice = builder.spPrice;
        this.spType = builder.spType;
        this.userDiskPerformanceLevel = builder.userDiskPerformanceLevel;
        this.userDiskSizeGib = builder.userDiskSizeGib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bundleModels
     */
    public java.util.List < BundleModels> getBundleModels() {
        return this.bundleModels;
    }

    /**
     * @return eduCdsEnable
     */
    public String getEduCdsEnable() {
        return this.eduCdsEnable;
    }

    /**
     * @return eduCdsSize
     */
    public Integer getEduCdsSize() {
        return this.eduCdsSize;
    }

    /**
     * @return eduCommittedTime
     */
    public Integer getEduCommittedTime() {
        return this.eduCommittedTime;
    }

    /**
     * @return eduDesktopBundleId
     */
    public String getEduDesktopBundleId() {
        return this.eduDesktopBundleId;
    }

    /**
     * @return eduDesktopNum
     */
    public Integer getEduDesktopNum() {
        return this.eduDesktopNum;
    }

    /**
     * @return eduRoomClassify
     */
    public String getEduRoomClassify() {
        return this.eduRoomClassify;
    }

    /**
     * @return eduStudentBundleId
     */
    public String getEduStudentBundleId() {
        return this.eduStudentBundleId;
    }

    /**
     * @return eduStudentNum
     */
    public Integer getEduStudentNum() {
        return this.eduStudentNum;
    }

    /**
     * @return eduTeacherBundleId
     */
    public String getEduTeacherBundleId() {
        return this.eduTeacherBundleId;
    }

    /**
     * @return eduTeacherNum
     */
    public Integer getEduTeacherNum() {
        return this.eduTeacherNum;
    }

    /**
     * @return groupDesktopCount
     */
    public Integer getGroupDesktopCount() {
        return this.groupDesktopCount;
    }

    /**
     * @return hardwareVersion
     */
    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return packageSize
     */
    public Integer getPackageSize() {
        return this.packageSize;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return rootDiskPerformanceLevel
     */
    public String getRootDiskPerformanceLevel() {
        return this.rootDiskPerformanceLevel;
    }

    /**
     * @return rootDiskSizeGib
     */
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    /**
     * @return spPeriodInfo
     */
    public String getSpPeriodInfo() {
        return this.spPeriodInfo;
    }

    /**
     * @return spPrice
     */
    public Boolean getSpPrice() {
        return this.spPrice;
    }

    /**
     * @return spType
     */
    public String getSpType() {
        return this.spType;
    }

    /**
     * @return userDiskPerformanceLevel
     */
    public String getUserDiskPerformanceLevel() {
        return this.userDiskPerformanceLevel;
    }

    /**
     * @return userDiskSizeGib
     */
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

    public static final class Builder extends Request.Builder<DescribePriceRequest, Builder> {
        private Integer amount; 
        private Integer bandwidth; 
        private java.util.List < BundleModels> bundleModels; 
        private String eduCdsEnable; 
        private Integer eduCdsSize; 
        private Integer eduCommittedTime; 
        private String eduDesktopBundleId; 
        private Integer eduDesktopNum; 
        private String eduRoomClassify; 
        private String eduStudentBundleId; 
        private Integer eduStudentNum; 
        private String eduTeacherBundleId; 
        private Integer eduTeacherNum; 
        private Integer groupDesktopCount; 
        private String hardwareVersion; 
        private String instanceType; 
        private String internetChargeType; 
        private String networkType; 
        private String osType; 
        private Integer packageSize; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 
        private String resourceType; 
        private String rootDiskPerformanceLevel; 
        private Integer rootDiskSizeGib; 
        private String spPeriodInfo; 
        private Boolean spPrice; 
        private String spType; 
        private String userDiskPerformanceLevel; 
        private Integer userDiskSizeGib; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.bandwidth = request.bandwidth;
            this.bundleModels = request.bundleModels;
            this.eduCdsEnable = request.eduCdsEnable;
            this.eduCdsSize = request.eduCdsSize;
            this.eduCommittedTime = request.eduCommittedTime;
            this.eduDesktopBundleId = request.eduDesktopBundleId;
            this.eduDesktopNum = request.eduDesktopNum;
            this.eduRoomClassify = request.eduRoomClassify;
            this.eduStudentBundleId = request.eduStudentBundleId;
            this.eduStudentNum = request.eduStudentNum;
            this.eduTeacherBundleId = request.eduTeacherBundleId;
            this.eduTeacherNum = request.eduTeacherNum;
            this.groupDesktopCount = request.groupDesktopCount;
            this.hardwareVersion = request.hardwareVersion;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.networkType = request.networkType;
            this.osType = request.osType;
            this.packageSize = request.packageSize;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.rootDiskPerformanceLevel = request.rootDiskPerformanceLevel;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
            this.spPeriodInfo = request.spPeriodInfo;
            this.spPrice = request.spPrice;
            this.spType = request.spType;
            this.userDiskPerformanceLevel = request.userDiskPerformanceLevel;
            this.userDiskSizeGib = request.userDiskSizeGib;
        } 

        /**
         * The number of the resources. Default value: 1.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * The maximum public bandwidth. Unit: Mbit/s.
         * <p>
         * 
         * *   Valid values if the PayByTraffic parameter is set to PayByBandwidth: 10 to 1000
         * *   Valid values if the PayByTraffic parameter is set to PayByTraffic: 10 to 200
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * BundleModels.
         */
        public Builder bundleModels(java.util.List < BundleModels> bundleModels) {
            this.putQueryParameter("BundleModels", bundleModels);
            this.bundleModels = bundleModels;
            return this;
        }

        /**
         * EduCdsEnable.
         */
        public Builder eduCdsEnable(String eduCdsEnable) {
            this.putQueryParameter("EduCdsEnable", eduCdsEnable);
            this.eduCdsEnable = eduCdsEnable;
            return this;
        }

        /**
         * EduCdsSize.
         */
        public Builder eduCdsSize(Integer eduCdsSize) {
            this.putQueryParameter("EduCdsSize", eduCdsSize);
            this.eduCdsSize = eduCdsSize;
            return this;
        }

        /**
         * EduCommittedTime.
         */
        public Builder eduCommittedTime(Integer eduCommittedTime) {
            this.putQueryParameter("EduCommittedTime", eduCommittedTime);
            this.eduCommittedTime = eduCommittedTime;
            return this;
        }

        /**
         * EduDesktopBundleId.
         */
        public Builder eduDesktopBundleId(String eduDesktopBundleId) {
            this.putQueryParameter("EduDesktopBundleId", eduDesktopBundleId);
            this.eduDesktopBundleId = eduDesktopBundleId;
            return this;
        }

        /**
         * EduDesktopNum.
         */
        public Builder eduDesktopNum(Integer eduDesktopNum) {
            this.putQueryParameter("EduDesktopNum", eduDesktopNum);
            this.eduDesktopNum = eduDesktopNum;
            return this;
        }

        /**
         * EduRoomClassify.
         */
        public Builder eduRoomClassify(String eduRoomClassify) {
            this.putQueryParameter("EduRoomClassify", eduRoomClassify);
            this.eduRoomClassify = eduRoomClassify;
            return this;
        }

        /**
         * EduStudentBundleId.
         */
        public Builder eduStudentBundleId(String eduStudentBundleId) {
            this.putQueryParameter("EduStudentBundleId", eduStudentBundleId);
            this.eduStudentBundleId = eduStudentBundleId;
            return this;
        }

        /**
         * EduStudentNum.
         */
        public Builder eduStudentNum(Integer eduStudentNum) {
            this.putQueryParameter("EduStudentNum", eduStudentNum);
            this.eduStudentNum = eduStudentNum;
            return this;
        }

        /**
         * EduTeacherBundleId.
         */
        public Builder eduTeacherBundleId(String eduTeacherBundleId) {
            this.putQueryParameter("EduTeacherBundleId", eduTeacherBundleId);
            this.eduTeacherBundleId = eduTeacherBundleId;
            return this;
        }

        /**
         * EduTeacherNum.
         */
        public Builder eduTeacherNum(Integer eduTeacherNum) {
            this.putQueryParameter("EduTeacherNum", eduTeacherNum);
            this.eduTeacherNum = eduTeacherNum;
            return this;
        }

        /**
         * GroupDesktopCount.
         */
        public Builder groupDesktopCount(Integer groupDesktopCount) {
            this.putQueryParameter("GroupDesktopCount", groupDesktopCount);
            this.groupDesktopCount = groupDesktopCount;
            return this;
        }

        /**
         * The model of the WUYING hardware client.
         */
        public Builder hardwareVersion(String hardwareVersion) {
            this.putQueryParameter("HardwareVersion", hardwareVersion);
            this.hardwareVersion = hardwareVersion;
            return this;
        }

        /**
         * The resource specifications.
         * <p>
         * 
         * *   If you set ResourceType to Desktop, set this parameter to one of the following values:
         * 
         *     *   ecd.basic.small
         *     *   ecd.basic.large
         *     *   ecd.advanced.large
         *     *   ecd.advanced.xlarge
         *     *   ecd.performance.2xlarge
         *     *   ecd.graphics.xlarge
         *     *   ecd.graphics.2xlarge
         *     *   ecd.advanced.xlarge_s8d2
         *     *   ecd.advanced.xlarge_s8d7
         *     *   ecd.graphics.1g72c
         *     *   eds.general.2c2g
         *     *   eds.general.2c4g
         *     *   eds.general.2c8g
         *     *   eds.general.4c8g
         *     *   eds.general.4c16g
         *     *   eds.general.8c16g
         *     *   eds.general.8c32g
         *     *   eds.general.16c32g
         * 
         * *   If you set ResourceType to OfficeSite, set this parameter to large.
         * 
         * *   If you set ResourceType to Bandwidth, leave this parameter empty.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * The metering method of the Internet access package. Valid values:
         * <p>
         * 
         * *   PayByBandwidth: pay-by-bandwidth
         * *   PayByTraffic: pay-by-data-transfer
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * The OS. Valid values:
         * <p>
         * 
         * *   Windows
         * *   Linux
         * 
         * Default value: Windows.
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * PackageSize.
         */
        public Builder packageSize(Integer packageSize) {
            this.putQueryParameter("PackageSize", packageSize);
            this.packageSize = packageSize;
            return this;
        }

        /**
         * The subscription duration. Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the billing cycle. Valid values:
         * <p>
         * 
         * *   Hour
         * *   Month
         * *   Year
         * 
         * Default value: Hour.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The promotion ID.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource type. Valid values:
         * <p>
         * 
         * *   Desktop: cloud desktop
         * *   OfficeSite: workspace
         * *   Bandwidth: network bandwidth
         * 
         * Default value: Desktop.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The performance level (PL) of the system disk. Valid values:
         * <p>
         * 
         * *   PL0
         * *   PL1
         * *   PL2
         * *   PL3
         */
        public Builder rootDiskPerformanceLevel(String rootDiskPerformanceLevel) {
            this.putQueryParameter("RootDiskPerformanceLevel", rootDiskPerformanceLevel);
            this.rootDiskPerformanceLevel = rootDiskPerformanceLevel;
            return this;
        }

        /**
         * The system disk size. Unit: GiB.
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            this.putQueryParameter("RootDiskSizeGib", rootDiskSizeGib);
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * SpPeriodInfo.
         */
        public Builder spPeriodInfo(String spPeriodInfo) {
            this.putQueryParameter("SpPeriodInfo", spPeriodInfo);
            this.spPeriodInfo = spPeriodInfo;
            return this;
        }

        /**
         * SpPrice.
         */
        public Builder spPrice(Boolean spPrice) {
            this.putQueryParameter("SpPrice", spPrice);
            this.spPrice = spPrice;
            return this;
        }

        /**
         * SpType.
         */
        public Builder spType(String spType) {
            this.putQueryParameter("SpType", spType);
            this.spType = spType;
            return this;
        }

        /**
         * The PL of the data disk. Valid values:
         * <p>
         * 
         * *   PL0
         * *   PL1
         * *   PL2
         * *   PL3
         */
        public Builder userDiskPerformanceLevel(String userDiskPerformanceLevel) {
            this.putQueryParameter("UserDiskPerformanceLevel", userDiskPerformanceLevel);
            this.userDiskPerformanceLevel = userDiskPerformanceLevel;
            return this;
        }

        /**
         * The data disk size. Unit: GiB.
         */
        public Builder userDiskSizeGib(Integer userDiskSizeGib) {
            this.putQueryParameter("UserDiskSizeGib", userDiskSizeGib);
            this.userDiskSizeGib = userDiskSizeGib;
            return this;
        }

        @Override
        public DescribePriceRequest build() {
            return new DescribePriceRequest(this);
        } 

    } 

    public static class BundleModels extends TeaModel {
        @NameInMap("Amount")
        @Validation(maximum = 1000, minimum = 1)
        private Integer amount;

        @NameInMap("BundleId")
        private String bundleId;

        @NameInMap("Duration")
        private Integer duration;

        private BundleModels(Builder builder) {
            this.amount = builder.amount;
            this.bundleId = builder.bundleId;
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BundleModels create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private Integer amount; 
            private String bundleId; 
            private Integer duration; 

            /**
             * The number of the resources. Default value: 1.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * BundleId.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            public BundleModels build() {
                return new BundleModels(this);
            } 

        } 

    }
}
