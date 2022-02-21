// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackageResponseBody</p>
 */
public class DescribeBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("Accelerators")
    private java.util.List < String > accelerators;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @NameInMap("BandwidthType")
    private String bandwidthType;

    @NameInMap("BillingType")
    private String billingType;

    @NameInMap("CbnGeographicRegionIdA")
    private String cbnGeographicRegionIdA;

    @NameInMap("CbnGeographicRegionIdB")
    private String cbnGeographicRegionIdB;

    @NameInMap("ChargeType")
    private String chargeType;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("Ratio")
    private Integer ratio;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    @NameInMap("Type")
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
        this.state = builder.state;
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
     * @return state
     */
    public String getState() {
        return this.state;
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
        private String state; 
        private String type; 

        /**
         * Accelerators.
         */
        public Builder accelerators(java.util.List < String > accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * BandwidthPackageId.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * BandwidthType.
         */
        public Builder bandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * BillingType.
         */
        public Builder billingType(String billingType) {
            this.billingType = billingType;
            return this;
        }

        /**
         * CbnGeographicRegionIdA.
         */
        public Builder cbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
            this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
            return this;
        }

        /**
         * CbnGeographicRegionIdB.
         */
        public Builder cbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
            this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
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
         * Ratio.
         */
        public Builder ratio(Integer ratio) {
            this.ratio = ratio;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeBandwidthPackageResponseBody build() {
            return new DescribeBandwidthPackageResponseBody(this);
        } 

    } 

}
