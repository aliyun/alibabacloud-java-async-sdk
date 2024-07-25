// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceRequest} extends {@link RequestModel}
 *
 * <p>DescribePriceRequest</p>
 */
public class DescribePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 2048, minimum = 1)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupDesktopCount")
    private Integer groupDesktopCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer rootDiskSizeGib;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer userDiskSizeGib;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.bandwidth = builder.bandwidth;
        this.groupDesktopCount = builder.groupDesktopCount;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.osType = builder.osType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.rootDiskSizeGib = builder.rootDiskSizeGib;
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
     * @return groupDesktopCount
     */
    public Integer getGroupDesktopCount() {
        return this.groupDesktopCount;
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
     * @return osType
     */
    public String getOsType() {
        return this.osType;
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
     * @return rootDiskSizeGib
     */
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
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
        private Integer groupDesktopCount; 
        private String instanceType; 
        private String internetChargeType; 
        private String osType; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 
        private String resourceType; 
        private Integer rootDiskSizeGib; 
        private Integer userDiskSizeGib; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.bandwidth = request.bandwidth;
            this.groupDesktopCount = request.groupDesktopCount;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.osType = request.osType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
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
         * GroupDesktopCount.
         */
        public Builder groupDesktopCount(Integer groupDesktopCount) {
            this.putQueryParameter("GroupDesktopCount", groupDesktopCount);
            this.groupDesktopCount = groupDesktopCount;
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
         * The system disk size. Unit: GiB.
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            this.putQueryParameter("RootDiskSizeGib", rootDiskSizeGib);
            this.rootDiskSizeGib = rootDiskSizeGib;
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

}
