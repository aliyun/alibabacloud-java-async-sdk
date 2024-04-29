// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopSpecRequest</p>
 */
public class ModifyDesktopSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer rootDiskSizeGib;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskPerformanceLevel")
    private String userDiskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDiskSizeGib")
    @com.aliyun.core.annotation.Validation(maximum = 32768)
    private Integer userDiskSizeGib;

    private ModifyDesktopSpecRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.desktopId = builder.desktopId;
        this.desktopType = builder.desktopType;
        this.promotionId = builder.promotionId;
        this.regionId = builder.regionId;
        this.rootDiskSizeGib = builder.rootDiskSizeGib;
        this.userDiskPerformanceLevel = builder.userDiskPerformanceLevel;
        this.userDiskSizeGib = builder.userDiskSizeGib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return desktopType
     */
    public String getDesktopType() {
        return this.desktopType;
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
     * @return rootDiskSizeGib
     */
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
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

    public static final class Builder extends Request.Builder<ModifyDesktopSpecRequest, Builder> {
        private Boolean autoPay; 
        private String desktopId; 
        private String desktopType; 
        private String promotionId; 
        private String regionId; 
        private Integer rootDiskSizeGib; 
        private String userDiskPerformanceLevel; 
        private Integer userDiskSizeGib; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopSpecRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.desktopId = request.desktopId;
            this.desktopType = request.desktopType;
            this.promotionId = request.promotionId;
            this.regionId = request.regionId;
            this.rootDiskSizeGib = request.rootDiskSizeGib;
            this.userDiskPerformanceLevel = request.userDiskPerformanceLevel;
            this.userDiskSizeGib = request.userDiskSizeGib;
        } 

        /**
         * Specifies whether to enable the auto-payment feature.
         * <p>
         * 
         * Default value: true. Valid values:
         * 
         * *   true: enables the auto-payment feature.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     Make sure that you have sufficient balance in your Alibaba Cloud account. Otherwise, an exception occurs on your order.
         * 
         *     <!-- -->
         * 
         * *   false: disables the auto-payment feature. In this case, an order is generated, and no payment is automatically made.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     You can log on to the WUYING Workspace console and complete the payment based on the order ID on the Orders page.
         * 
         *     <!-- -->
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The ID of a cloud computer.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The destination instance type. You can call the [DescribeDesktopTypes](~~188882~~) operation to query the instance types supported by cloud computers.
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * The ID of the promotional activity.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The size of the new system disk. Unit: GiB. Valid values: 80 to 500 GiB. The value must be a multiple of 10.
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            this.putQueryParameter("RootDiskSizeGib", rootDiskSizeGib);
            this.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * The performance level (PL) of the data disk. Default value: PL0.
         * <p>
         * 
         * Valid values:
         * 
         * *   PL1
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL0
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL3
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   PL2
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder userDiskPerformanceLevel(String userDiskPerformanceLevel) {
            this.putQueryParameter("UserDiskPerformanceLevel", userDiskPerformanceLevel);
            this.userDiskPerformanceLevel = userDiskPerformanceLevel;
            return this;
        }

        /**
         * The destination data disk size. Unit: GiB.
         * <p>
         * 
         * *   The data disk size of a non-graphical cloud computer ranges from 20 to 1020 GiB and must be a multiple of 10.
         * *   The data disk size of a graphical cloud computer ranges from 40 to 1020 GiB and must be a multiple of 10.
         */
        public Builder userDiskSizeGib(Integer userDiskSizeGib) {
            this.putQueryParameter("UserDiskSizeGib", userDiskSizeGib);
            this.userDiskSizeGib = userDiskSizeGib;
            return this;
        }

        @Override
        public ModifyDesktopSpecRequest build() {
            return new ModifyDesktopSpecRequest(this);
        } 

    } 

}
