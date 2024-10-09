// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSpotAdviceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSpotAdviceResponseBody</p>
 */
public class DescribeSpotAdviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableSpotZones")
    private AvailableSpotZones availableSpotZones;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Details about preemptible instances in the zones of the specified region.</p>
         * <blockquote>
         * <p> The return values are sorted based on the historical percentages of average preemptible instance prices relative to pay-as-you-go instance prices for instance types.</p>
         * </blockquote>
         */
        public Builder availableSpotZones(AvailableSpotZones availableSpotZones) {
            this.availableSpotZones = availableSpotZones;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSpotAdviceResponseBody build() {
            return new DescribeSpotAdviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSpotAdviceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSpotAdviceResponseBody</p>
     */
    public static class AvailableSpotResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageSpotDiscount")
        private Integer averageSpotDiscount;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InterruptRateDesc")
        private String interruptRateDesc;

        @com.aliyun.core.annotation.NameInMap("InterruptionRate")
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
             * <p>The percentage of the average preemptible instance price relative to the pay-as-you-go instance price in the previous 30 days. Unit: %. Valid values: 1 to 100.</p>
             * <p>You can calculate the average preemptible instance price based on the return value. For example, if the pay-as-you-go instance price is 1 and the return value of this parameter is 20, the average preemptible instance price in the previous 30 days is 0.2.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder averageSpotDiscount(Integer averageSpotDiscount) {
                this.averageSpotDiscount = averageSpotDiscount;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The release rate range of preemptible instances in the previous 30 days, which corresponds to the <code>InterruptionRate</code> value. Valid values:</p>
             * <ul>
             * <li>0-3%</li>
             * <li>3-5%</li>
             * <li>5-10%</li>
             * <li>10-100%</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0-3%</p>
             */
            public Builder interruptRateDesc(String interruptRateDesc) {
                this.interruptRateDesc = interruptRateDesc;
                return this;
            }

            /**
             * <p>The average release rate of preemptible instances in the previous 30 days. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeSpotAdviceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSpotAdviceResponseBody</p>
     */
    public static class AvailableSpotResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableSpotResource")
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
    /**
     * 
     * {@link DescribeSpotAdviceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSpotAdviceResponseBody</p>
     */
    public static class AvailableSpotZone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableSpotResources")
        private AvailableSpotResources availableSpotResources;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>Details about preemptible instances in the previous 30 days, including the release rate of preemptible instances and percentages of average preemptible instance prices relative to pay-as-you-go instance prices.</p>
             */
            public Builder availableSpotResources(AvailableSpotResources availableSpotResources) {
                this.availableSpotResources = availableSpotResources;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
    /**
     * 
     * {@link DescribeSpotAdviceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSpotAdviceResponseBody</p>
     */
    public static class AvailableSpotZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableSpotZone")
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
