// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

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
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskCategory")
    private String rootDiskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer rootDiskSizeGib;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskCategory")
    private String userDiskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 65536)
    private Integer userDiskSizeGib;

    private DescribePriceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.bandwidth = builder.bandwidth;
        this.duration = builder.duration;
        this.groupDesktopCount = builder.groupDesktopCount;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.osType = builder.osType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.resourceType = builder.resourceType;
        this.rootDiskCategory = builder.rootDiskCategory;
        this.rootDiskSizeGib = builder.rootDiskSizeGib;
        this.userDiskCategory = builder.userDiskCategory;
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
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
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
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return rootDiskCategory
     */
    public String getRootDiskCategory() {
        return this.rootDiskCategory;
    }

    /**
     * @return rootDiskSizeGib
     */
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    /**
     * @return userDiskCategory
     */
    public String getUserDiskCategory() {
        return this.userDiskCategory;
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
        private Integer duration; 
        private Integer groupDesktopCount; 
        private String instanceType; 
        private String internetChargeType; 
        private String osType; 
        private Integer period; 
        private String periodUnit; 
        private String promotionId; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private String resourceType; 
        private String rootDiskCategory; 
        private Integer rootDiskSizeGib; 
        private String userDiskCategory; 
        private Integer userDiskSizeGib; 

        private Builder() {
            super();
        } 

        private Builder(DescribePriceRequest request) {
            super(request);
            this.amount = request.amount;
            this.bandwidth = request.bandwidth;
            this.duration = request.duration;
            this.groupDesktopCount = request.groupDesktopCount;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.osType = request.osType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.resourceType = request.resourceType;
            this.rootDiskCategory = request.rootDiskCategory;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
            this.userDiskCategory = request.userDiskCategory;
            this.userDiskSizeGib = request.userDiskSizeGib;
        } 

        /**
         * <p>The number of resources. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The maximum public bandwidth. Unit: Mbit/s.</p>
         * <ul>
         * <li>Valid values if you set InternetChargeType to PayByBandwidth: 10 to 1000.</li>
         * <li>Valid values if you set InternetChargeType to InternetChargeType: 10 to 200.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The type of hourly plan if you use the Monthly Subscription billing method. If you set <code>ResourceType</code> to <code>DesktopMonthPackage</code>, you must specify this parameter.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>120: the 120-hour computing plan.</li>
         * <li>250: the 250-hour computing plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The number of cloud computer shares. Default value: 1.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you set <code>ResourceType</code> to <code>DesktopGroup</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder groupDesktopCount(Integer groupDesktopCount) {
            this.putQueryParameter("GroupDesktopCount", groupDesktopCount);
            this.groupDesktopCount = groupDesktopCount;
            return this;
        }

        /**
         * <p>The specifications of the resource.</p>
         * <ul>
         * <li>This parameter is required if you set <code>ResourceType</code> to <code>Desktop</code>. You can call the <a href="~~DescribeDesktopTypes~~">DescribeDesktopTypes</a> to query the available cloud computer types that correspond to the value of <code>DesktopTypeId</code>.</li>
         * <li>If you set <code>ResourceType</code> to <code>DesktopGroup</code>, set the value of this parameter to <code>large</code>.</li>
         * <li>If you set <code>ResourceType</code> to <code>Bandwidth</code>, you can leave this parameter empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eds.general.2c2g</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The metering method for network traffic.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PayByTraffic: You are charged for the actually consumed traffic.</li>
         * <li>PayByBandwidth: You are charged by a fixed bandwidth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The OS type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Linux</li>
         * <li>Windows (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * <p>The subscription duration. The valid values of this parameter vary based on the value of <code>PeriodUnit</code>.</p>
         * <ul>
         * <li>If you set <code>PeriodUnit</code> to <code>Hour</code>, set the value of this parameter to 1.</li>
         * <li>If you set <code>PeriodUnit</code> to <code>Month</code>, set the value of this parameter to 1, 2, 3, or 6.</li>
         * <li>If you set <code>PeriodUnit</code> to <code>Year</code>, set the value of this parameter to 1, 2, or 3.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The billing cycle.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * <li>Hour (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by EDS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResellerOwnerUid.
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DesktopMonthPackage: monthly subscription cloud computers that use hourly limit plans.</li>
         * <li>Desktop (default): pay-as-you-go cloud computers/monthly subscription cloud computers that use unlimited plans.</li>
         * <li>Bandwidth: premium bandwidth plans.</li>
         * <li>DesktopGroup: cloud computer shares.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desktop</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The category of the system disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: the ultra disk</li>
         * <li>cloud_auto: the standard SSD.</li>
         * <li>cloud_essd: the Enterprise SSD (ESSD). Take note that only specific cloud computer types support ESSDs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder rootDiskCategory(String rootDiskCategory) {
            this.putQueryParameter("RootDiskCategory", rootDiskCategory);
            this.rootDiskCategory = rootDiskCategory;
            return this;
        }

        /**
         * <p>The size of the system disk. Unit: GiB. If you set <code>ResourceType</code> to <code>Desktop</code>, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            this.putQueryParameter("RootDiskSizeGib", rootDiskSizeGib);
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * <p>The category of the data disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cloud_efficiency: the ultra disk</li>
         * <li>cloud_auto: the standard SSD.</li>
         * <li>cloud_essd: the ESSD. Take note that only specific cloud computer types support ESSDs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder userDiskCategory(String userDiskCategory) {
            this.putQueryParameter("UserDiskCategory", userDiskCategory);
            this.userDiskCategory = userDiskCategory;
            return this;
        }

        /**
         * <p>The size of the data disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
