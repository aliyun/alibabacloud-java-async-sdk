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
    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("AvailableSpotZones")
    private AvailableSpotZones availableSpotZones;

    private DescribeSpotAdviceResponseBody(Builder builder) {
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.availableSpotZones = builder.availableSpotZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotAdviceResponseBody create() {
        return builder().build();
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
     * @return availableSpotZones
     */
    public AvailableSpotZones getAvailableSpotZones() {
        return this.availableSpotZones;
    }

    public static final class Builder {
        private String regionId; 
        private String requestId; 
        private AvailableSpotZones availableSpotZones; 

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

        /**
         * An array of zones and their corresponding preemptible instances.
         * <p>
         * 
         * > The Order of returned values is sorted by the historical average discount rate of the instance type.
         */
        public Builder availableSpotZones(AvailableSpotZones availableSpotZones) {
            this.availableSpotZones = availableSpotZones;
            return this;
        }

        public DescribeSpotAdviceResponseBody build() {
            return new DescribeSpotAdviceResponseBody(this);
        } 

    } 

    public static class AvailableSpotResource extends TeaModel {
        @NameInMap("InterruptRateDesc")
        private String interruptRateDesc;

        @NameInMap("AverageSpotDiscount")
        private Integer averageSpotDiscount;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InterruptionRate")
        private Float interruptionRate;

        private AvailableSpotResource(Builder builder) {
            this.interruptRateDesc = builder.interruptRateDesc;
            this.averageSpotDiscount = builder.averageSpotDiscount;
            this.instanceType = builder.instanceType;
            this.interruptionRate = builder.interruptionRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpotResource create() {
            return builder().build();
        }

        /**
         * @return interruptRateDesc
         */
        public String getInterruptRateDesc() {
            return this.interruptRateDesc;
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
         * @return interruptionRate
         */
        public Float getInterruptionRate() {
            return this.interruptionRate;
        }

        public static final class Builder {
            private String interruptRateDesc; 
            private Integer averageSpotDiscount; 
            private String instanceType; 
            private Float interruptionRate; 

            /**
             * The release rate range of preemptible instances in the last 30 days, corresponding to the "InterruptionRate" return value. Possible values:
             * <p>
             * 
             * -0-3%
             * -3-5%
             * -5-10%
             * -10-100%
             */
            public Builder interruptRateDesc(String interruptRateDesc) {
                this.interruptRateDesc = interruptRateDesc;
                return this;
            }

            /**
             * The discount rate of the average price of preemptible instances in the last 30 days compared to the price of pay-as-you-go instances. Unit:%. Valid values: 1 to 100.
             * <p>
             * 
             * You can calculate the average price of preemptible instances based on the returned value. For example, if the price of a pay-as-you-go instance is 1 and the return value is 20 (20%), the average price of a preemptible instance in the last 30 days is 0.2.
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
             * The average release rate of preemptible instances in the last 30 days. Unit:%
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
        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("AvailableSpotResources")
        private AvailableSpotResources availableSpotResources;

        private AvailableSpotZone(Builder builder) {
            this.zoneId = builder.zoneId;
            this.availableSpotResources = builder.availableSpotResources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableSpotZone create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return availableSpotResources
         */
        public AvailableSpotResources getAvailableSpotResources() {
            return this.availableSpotResources;
        }

        public static final class Builder {
            private String zoneId; 
            private AvailableSpotResources availableSpotResources; 

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * An array of the release rate and discount rate of preemptible instances in the last 30 days.
             */
            public Builder availableSpotResources(AvailableSpotResources availableSpotResources) {
                this.availableSpotResources = availableSpotResources;
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
