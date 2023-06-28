// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePackPaidTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackPaidTrafficResponseBody</p>
 */
public class DescribePackPaidTrafficResponseBody extends TeaModel {
    @NameInMap("PackPaidTraffics")
    private java.util.List < PackPaidTraffics> packPaidTraffics;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePackPaidTrafficResponseBody(Builder builder) {
        this.packPaidTraffics = builder.packPaidTraffics;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackPaidTrafficResponseBody create() {
        return builder().build();
    }

    /**
     * @return packPaidTraffics
     */
    public java.util.List < PackPaidTraffics> getPackPaidTraffics() {
        return this.packPaidTraffics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < PackPaidTraffics> packPaidTraffics; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * PackPaidTraffics.
         */
        public Builder packPaidTraffics(java.util.List < PackPaidTraffics> packPaidTraffics) {
            this.packPaidTraffics = packPaidTraffics;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePackPaidTrafficResponseBody build() {
            return new DescribePackPaidTrafficResponseBody(this);
        } 

    } 

    public static class PackPaidTraffics extends TeaModel {
        @NameInMap("BaseBandwidth")
        private Integer baseBandwidth;

        @NameInMap("ElasticBandwidth")
        private Integer elasticBandwidth;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaxAttack")
        private Float maxAttack;

        @NameInMap("PaidCapacity")
        private Float paidCapacity;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("TotalCapacity")
        private Float totalCapacity;

        private PackPaidTraffics(Builder builder) {
            this.baseBandwidth = builder.baseBandwidth;
            this.elasticBandwidth = builder.elasticBandwidth;
            this.instanceId = builder.instanceId;
            this.maxAttack = builder.maxAttack;
            this.paidCapacity = builder.paidCapacity;
            this.startTime = builder.startTime;
            this.totalCapacity = builder.totalCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackPaidTraffics create() {
            return builder().build();
        }

        /**
         * @return baseBandwidth
         */
        public Integer getBaseBandwidth() {
            return this.baseBandwidth;
        }

        /**
         * @return elasticBandwidth
         */
        public Integer getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxAttack
         */
        public Float getMaxAttack() {
            return this.maxAttack;
        }

        /**
         * @return paidCapacity
         */
        public Float getPaidCapacity() {
            return this.paidCapacity;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalCapacity
         */
        public Float getTotalCapacity() {
            return this.totalCapacity;
        }

        public static final class Builder {
            private Integer baseBandwidth; 
            private Integer elasticBandwidth; 
            private String instanceId; 
            private Float maxAttack; 
            private Float paidCapacity; 
            private Long startTime; 
            private Float totalCapacity; 

            /**
             * BaseBandwidth.
             */
            public Builder baseBandwidth(Integer baseBandwidth) {
                this.baseBandwidth = baseBandwidth;
                return this;
            }

            /**
             * ElasticBandwidth.
             */
            public Builder elasticBandwidth(Integer elasticBandwidth) {
                this.elasticBandwidth = elasticBandwidth;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MaxAttack.
             */
            public Builder maxAttack(Float maxAttack) {
                this.maxAttack = maxAttack;
                return this;
            }

            /**
             * PaidCapacity.
             */
            public Builder paidCapacity(Float paidCapacity) {
                this.paidCapacity = paidCapacity;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalCapacity.
             */
            public Builder totalCapacity(Float totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            public PackPaidTraffics build() {
                return new PackPaidTraffics(this);
            } 

        } 

    }
}
