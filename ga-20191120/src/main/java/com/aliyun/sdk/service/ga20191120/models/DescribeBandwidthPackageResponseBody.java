// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackageResponseBody</p>
 */
public class DescribeBandwidthPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accelerators")
    private java.util.List < String > accelerators;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.NameInMap("BandwidthType")
    private String bandwidthType;

    @com.aliyun.core.annotation.NameInMap("BillingType")
    private String billingType;

    @com.aliyun.core.annotation.NameInMap("CbnGeographicRegionIdA")
    private String cbnGeographicRegionIdA;

    @com.aliyun.core.annotation.NameInMap("CbnGeographicRegionIdB")
    private String cbnGeographicRegionIdB;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Ratio")
    private Integer ratio;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeBandwidthPackageResponseBody(Builder builder) {
        this.accelerators = builder.accelerators;
        this.bandwidth = builder.bandwidth;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.bandwidthType = builder.bandwidthType;
        this.billingType = builder.billingType;
        this.cbnGeographicRegionIdA = builder.cbnGeographicRegionIdA;
        this.cbnGeographicRegionIdB = builder.cbnGeographicRegionIdB;
        this.chargeType = builder.chargeType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.name = builder.name;
        this.ratio = builder.ratio;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.state = builder.state;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwidthPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerators
     */
    public java.util.List < String > getAccelerators() {
        return this.accelerators;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    /**
     * @return billingType
     */
    public String getBillingType() {
        return this.billingType;
    }

    /**
     * @return cbnGeographicRegionIdA
     */
    public String getCbnGeographicRegionIdA() {
        return this.cbnGeographicRegionIdA;
    }

    /**
     * @return cbnGeographicRegionIdB
     */
    public String getCbnGeographicRegionIdB() {
        return this.cbnGeographicRegionIdB;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ratio
     */
    public Integer getRatio() {
        return this.ratio;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < String > accelerators; 
        private Integer bandwidth; 
        private String bandwidthPackageId; 
        private String bandwidthType; 
        private String billingType; 
        private String cbnGeographicRegionIdA; 
        private String cbnGeographicRegionIdB; 
        private String chargeType; 
        private String createTime; 
        private String description; 
        private String expiredTime; 
        private String name; 
        private Integer ratio; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String state; 
        private java.util.List < Tags> tags; 
        private String type; 

        /**
         * The ID of the GA instance that is associated with the bandwidth plan.
         */
        public Builder accelerators(java.util.List < String > accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        /**
         * The bandwidth value of the bandwidth plan. Unit: Mbit/s.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The ID of the bandwidth plan.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * The type of the bandwidth. Valid values:
         * <p>
         * 
         * *   **Basic**: basic bandwidth
         * *   **Enhanced**: enhanced bandwidth
         * *   **Advanced**: premium bandwidth
         */
        public Builder bandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * The metering method that is used when you use the pay-as-you-go billing method. Valid values:
         * <p>
         * 
         * *   **PayByTraffic**: pay-by-data-transfer
         * *   **PayBY95**: pay-by-95th-percentile
         */
        public Builder billingType(String billingType) {
            this.billingType = billingType;
            return this;
        }

        /**
         * Area A specified in the cross-region acceleration bandwidth plan. Only **China-mainland** (the Chinese mainland) is returned.
         * <p>
         * 
         * This parameter is returned only if you call this operation on the International site (alibabacloud.com).
         */
        public Builder cbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
            this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
            return this;
        }

        /**
         * Area B specified in the cross-region acceleration bandwidth plan. Only **Global** (global) is returned.
         * <p>
         * 
         * This parameter is returned only if you call this operation on the International site (alibabacloud.com).
         */
        public Builder cbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
            this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
            return this;
        }

        /**
         * The billing method of the bandwidth plan.
         * <p>
         * 
         * *   **PREPAY**: subscription. This is the default value.
         * *   **POSTPAY**: pay-as-you-go.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The timestamp that indicates when the bandwidth plan was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The description of the bandwidth plan.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The timestamp that indicates when the bandwidth plan expires.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The name of the bandwidth plan.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The percentage of the minimum bandwidth guaranteed if the pay-by-95th-percentile-bandwidth metering method is used. Valid values: **30** to **100**.
         */
        public Builder ratio(Integer ratio) {
            this.ratio = ratio;
            return this;
        }

        /**
         * The ID of the region where GA instance is deployed. **cn-hangzhou** is returned.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The state of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **init**: The bandwidth plan is being initialized.
         * *   **active**: The bandwidth plan is available.
         * *   **binded**: The bandwidth plan is associated with a GA instance.
         * *   **binding**: The bandwidth plan is being associated.
         * *   **unbinding**: The bandwidth plan is being disassociated.
         * *   **updating**: The bandwidth plan is being updated.
         * *   **finacialLocked**: The bandwidth plan is locked due to overdue payments.
         * *   **Locked**: The bandwidth plan is locked.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Tag objects.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The type of the bandwidth plan. Valid values:
         * <p>
         * 
         * *   **Basic**: a basic bandwidth plan
         * *   **CrossDomain**: a cross-region acceleration bandwidth plan
         * 
         * If you call this operation on the Alibaba Cloud China Site (aliyun.com), only **Basic** is returned.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeBandwidthPackageResponseBody build() {
            return new DescribeBandwidthPackageResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N that is added to the bandwidth plan.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N that is added to the bandwidth plan.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
