// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicAcceleratorResponseBody</p>
 */
public class GetBasicAcceleratorResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("BasicBandwidthPackage")
    private BasicBandwidthPackage basicBandwidthPackage;

    @NameInMap("BasicEndpointGroupId")
    private String basicEndpointGroupId;

    @NameInMap("BasicIpSetId")
    private String basicIpSetId;

    @NameInMap("CenId")
    private String cenId;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("CrossDomainBandwidthPackage")
    private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

    @NameInMap("Description")
    private String description;

    @NameInMap("ExpiredTime")
    private Long expiredTime;

    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @NameInMap("Name")
    private String name;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    private GetBasicAcceleratorResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.basicBandwidthPackage = builder.basicBandwidthPackage;
        this.basicEndpointGroupId = builder.basicEndpointGroupId;
        this.basicIpSetId = builder.basicIpSetId;
        this.cenId = builder.cenId;
        this.createTime = builder.createTime;
        this.crossDomainBandwidthPackage = builder.crossDomainBandwidthPackage;
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.instanceChargeType = builder.instanceChargeType;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicAcceleratorResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return basicBandwidthPackage
     */
    public BasicBandwidthPackage getBasicBandwidthPackage() {
        return this.basicBandwidthPackage;
    }

    /**
     * @return basicEndpointGroupId
     */
    public String getBasicEndpointGroupId() {
        return this.basicEndpointGroupId;
    }

    /**
     * @return basicIpSetId
     */
    public String getBasicIpSetId() {
        return this.basicIpSetId;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return crossDomainBandwidthPackage
     */
    public CrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
        return this.crossDomainBandwidthPackage;
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
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder {
        private String acceleratorId; 
        private BasicBandwidthPackage basicBandwidthPackage; 
        private String basicEndpointGroupId; 
        private String basicIpSetId; 
        private String cenId; 
        private Long createTime; 
        private CrossDomainBandwidthPackage crossDomainBandwidthPackage; 
        private String description; 
        private Long expiredTime; 
        private String instanceChargeType; 
        private String name; 
        private String regionId; 
        private String requestId; 
        private String state; 

        /**
         * ??????????????????Id
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder basicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
            this.basicBandwidthPackage = basicBandwidthPackage;
            return this;
        }

        /**
         * ???????????????????????????Id
         */
        public Builder basicEndpointGroupId(String basicEndpointGroupId) {
            this.basicEndpointGroupId = basicEndpointGroupId;
            return this;
        }

        /**
         * ???????????????????????????Id
         */
        public Builder basicIpSetId(String basicIpSetId) {
            this.basicIpSetId = basicIpSetId;
            return this;
        }

        /**
         * ?????????????????????Id
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder crossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
            this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ????????????
         */
        public Builder expiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * ??????Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetBasicAcceleratorResponseBody build() {
            return new GetBasicAcceleratorResponseBody(this);
        } 

    } 

    public static class BasicBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BandwidthType")
        private String bandwidthType;

        @NameInMap("InstanceId")
        private String instanceId;

        private BasicBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthType = builder.bandwidthType;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String bandwidthType; 
            private String instanceId; 

            /**
             * ?????????????????????
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * ?????????????????????
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * ???????????????Id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public BasicBandwidthPackage build() {
                return new BasicBandwidthPackage(this);
            } 

        } 

    }
    public static class CrossDomainBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("InstanceId")
        private String instanceId;

        private CrossDomainBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossDomainBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String instanceId; 

            /**
             * ?????????????????????
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * ???????????????Id
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public CrossDomainBandwidthPackage build() {
                return new CrossDomainBandwidthPackage(this);
            } 

        } 

    }
}
