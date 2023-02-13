// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpotAdviceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpotAdviceResponseBody</p>
 */
public class DescribeSpotAdviceResponseBody extends TeaModel {
    @NameInMap("AvailableSpotZones")
    private AvailableSpotZones availableSpotZones;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSpotAdviceResponseBody(Builder builder) {
        this.availableSpotZones = builder.availableSpotZones;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotAdviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return availableSpotZones
     */
    public AvailableSpotZones getAvailableSpotZones() {
        return this.availableSpotZones;
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

    public static final class Builder {
        private AvailableSpotZones availableSpotZones; 
        private String regionId; 
        private String requestId; 

        /**
         * Details about preemptible instances in the zones of the specified region.
         * <p>
         * 
         * >  The return values are sorted based on the historical percentages of average preemptible instance prices relative to pay-as-you-go instance prices for instance types.
         */
        public Builder availableSpotZones(AvailableSpotZones availableSpotZones) {
            this.availableSpotZones = availableSpotZones;
            return this;
        }

        /**
         * The ID of the region.
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

        public DescribeSpotAdviceResponseBody build() {
            return new DescribeSpotAdviceResponseBody(this);
        } 

    } 

    public static class AvailableSpotResource extends TeaModel {
        @NameInMap("AverageSpotDiscount")
        private Integer averageSpotDiscount;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InterruptRateDesc")
        private String interruptRateDesc;

        @NameInMap("InterruptionRate")
        private Float interruptionRate;

        private AvailableSpotResource(Builder builder) {
            this.averageSpotDiscount = builder.averageSpotDiscount;
            this.instanceType = builder.instanceType;
            this.interruptRateDesc = builder.interruptRateDesc;
            this.interruptionRate = builder.interruptionRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpotResource create() {
            return builder().build();
        }

        /**
         * @return averageSpotDiscount
         */
        public Integer getAverageSpotDiscount() {
            return this.averageSpotDiscount;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return interruptRateDesc
         */
        public String getInterruptRateDesc() {
            return this.interruptRateDesc;
        }

        /**
         * @return interruptionRate
         */
        public Float getInterruptionRate() {
            return this.interruptionRate;
        }

        public static final class Builder {
            private Integer averageSpotDiscount; 
            private String instanceType; 
            private String interruptRateDesc; 
            private Float interruptionRate; 

            /**
             * The percentage of the average preemptible instance relative to the pay-as-you-go instance price in the last 30 days. Unit: percent (%). Valid values: 1 to 100.
             * <p>
             * 
             * You can calculate the average preemptible instance price based on the return value. For example, if the pay-as-you-go instance price is 1 and the return value of this parameter is 20, the average preemptible instance price in the last 30 days is 0.2.
             */
            public Builder averageSpotDiscount(Integer averageSpotDiscount) {
                this.averageSpotDiscount = averageSpotDiscount;
                return this;
            }

            /**
             * The instance type.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The release rate range of preemptible instances in the last 30 days, which corresponds to the `InterruptionRate` value. Valid values:
             * <p>
             * 
             * *   0-3%
             * *   3-5%
             * *   5-10%
             * *   10-100%
             */
            public Builder interruptRateDesc(String interruptRateDesc) {
                this.interruptRateDesc = interruptRateDesc;
                return this;
            }

            /**
             * The average release rate of preemptible instances in the last 30 days. Unit: percent (%).
             */
            public Builder interruptionRate(Float interruptionRate) {
                this.interruptionRate = interruptionRate;
                return this;
            }

            public AvailableSpotResource build() {
                return new AvailableSpotResource(this);
            } 

        } 

    }
    public static class AvailableSpotResources extends TeaModel {
        @NameInMap("AvailableSpotResource")
        private java.util.List < AvailableSpotResource> availableSpotResource;

        private AvailableSpotResources(Builder builder) {
            this.availableSpotResource = builder.availableSpotResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpotResources create() {
            return builder().build();
        }

        /**
         * @return availableSpotResource
         */
        public java.util.List < AvailableSpotResource> getAvailableSpotResource() {
            return this.availableSpotResource;
        }

        public static final class Builder {
            private java.util.List < AvailableSpotResource> availableSpotResource; 

            /**
             * AvailableSpotResource.
             */
            public Builder availableSpotResource(java.util.List < AvailableSpotResource> availableSpotResource) {
                this.availableSpotResource = availableSpotResource;
                return this;
            }

            public AvailableSpotResources build() {
                return new AvailableSpotResources(this);
            } 

        } 

    }
    public static class AvailableSpotZone extends TeaModel {
        @NameInMap("AvailableSpotResources")
        private AvailableSpotResources availableSpotResources;

        @NameInMap("ZoneId")
        private String zoneId;

        private AvailableSpotZone(Builder builder) {
            this.availableSpotResources = builder.availableSpotResources;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpotZone create() {
            return builder().build();
        }

        /**
         * @return availableSpotResources
         */
        public AvailableSpotResources getAvailableSpotResources() {
            return this.availableSpotResources;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private AvailableSpotResources availableSpotResources; 
            private String zoneId; 

            /**
             * Details about preemptible instances in the last 30 days, including release rates and percentages of average preemptible instance prices relative to pay-as-you-go instance prices.
             */
            public Builder availableSpotResources(AvailableSpotResources availableSpotResources) {
                this.availableSpotResources = availableSpotResources;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AvailableSpotZone build() {
                return new AvailableSpotZone(this);
            } 

        } 

    }
    public static class AvailableSpotZones extends TeaModel {
        @NameInMap("AvailableSpotZone")
        private java.util.List < AvailableSpotZone> availableSpotZone;

        private AvailableSpotZones(Builder builder) {
            this.availableSpotZone = builder.availableSpotZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpotZones create() {
            return builder().build();
        }

        /**
         * @return availableSpotZone
         */
        public java.util.List < AvailableSpotZone> getAvailableSpotZone() {
            return this.availableSpotZone;
        }

        public static final class Builder {
            private java.util.List < AvailableSpotZone> availableSpotZone; 

            /**
             * AvailableSpotZone.
             */
            public Builder availableSpotZone(java.util.List < AvailableSpotZone> availableSpotZone) {
                this.availableSpotZone = availableSpotZone;
                return this;
            }

            public AvailableSpotZones build() {
                return new AvailableSpotZones(this);
            } 

        } 

    }
}
