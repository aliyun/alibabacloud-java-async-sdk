// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsStorageTrafficUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsStorageTrafficUsageDataResponseBody</p>
 */
public class DescribeVsStorageTrafficUsageDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrafficUsage")
    private TrafficUsage trafficUsage;

    private DescribeVsStorageTrafficUsageDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficUsage = builder.trafficUsage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsStorageTrafficUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficUsage
     */
    public TrafficUsage getTrafficUsage() {
        return this.trafficUsage;
    }

    public static final class Builder {
        private String requestId; 
        private TrafficUsage trafficUsage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrafficUsage.
         */
        public Builder trafficUsage(TrafficUsage trafficUsage) {
            this.trafficUsage = trafficUsage;
            return this;
        }

        public DescribeVsStorageTrafficUsageDataResponseBody build() {
            return new DescribeVsStorageTrafficUsageDataResponseBody(this);
        } 

    } 

    public static class TrafficUsageDataModule extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("LanBandwidthInDataValue")
        private Float lanBandwidthInDataValue;

        @NameInMap("LanBandwidthOutDataValue")
        private Float lanBandwidthOutDataValue;

        @NameInMap("LanTrafficInDataValue")
        private Long lanTrafficInDataValue;

        @NameInMap("LanTrafficOutDataValue")
        private Long lanTrafficOutDataValue;

        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("WanBandwidthInDataValue")
        private Float wanBandwidthInDataValue;

        @NameInMap("WanBandwidthOutDataValue")
        private Float wanBandwidthOutDataValue;

        @NameInMap("WanTrafficInDataValue")
        private Long wanTrafficInDataValue;

        @NameInMap("WanTrafficOutDataValue")
        private Long wanTrafficOutDataValue;

        private TrafficUsageDataModule(Builder builder) {
            this.bucket = builder.bucket;
            this.lanBandwidthInDataValue = builder.lanBandwidthInDataValue;
            this.lanBandwidthOutDataValue = builder.lanBandwidthOutDataValue;
            this.lanTrafficInDataValue = builder.lanTrafficInDataValue;
            this.lanTrafficOutDataValue = builder.lanTrafficOutDataValue;
            this.timeStamp = builder.timeStamp;
            this.wanBandwidthInDataValue = builder.wanBandwidthInDataValue;
            this.wanBandwidthOutDataValue = builder.wanBandwidthOutDataValue;
            this.wanTrafficInDataValue = builder.wanTrafficInDataValue;
            this.wanTrafficOutDataValue = builder.wanTrafficOutDataValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficUsageDataModule create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return lanBandwidthInDataValue
         */
        public Float getLanBandwidthInDataValue() {
            return this.lanBandwidthInDataValue;
        }

        /**
         * @return lanBandwidthOutDataValue
         */
        public Float getLanBandwidthOutDataValue() {
            return this.lanBandwidthOutDataValue;
        }

        /**
         * @return lanTrafficInDataValue
         */
        public Long getLanTrafficInDataValue() {
            return this.lanTrafficInDataValue;
        }

        /**
         * @return lanTrafficOutDataValue
         */
        public Long getLanTrafficOutDataValue() {
            return this.lanTrafficOutDataValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return wanBandwidthInDataValue
         */
        public Float getWanBandwidthInDataValue() {
            return this.wanBandwidthInDataValue;
        }

        /**
         * @return wanBandwidthOutDataValue
         */
        public Float getWanBandwidthOutDataValue() {
            return this.wanBandwidthOutDataValue;
        }

        /**
         * @return wanTrafficInDataValue
         */
        public Long getWanTrafficInDataValue() {
            return this.wanTrafficInDataValue;
        }

        /**
         * @return wanTrafficOutDataValue
         */
        public Long getWanTrafficOutDataValue() {
            return this.wanTrafficOutDataValue;
        }

        public static final class Builder {
            private String bucket; 
            private Float lanBandwidthInDataValue; 
            private Float lanBandwidthOutDataValue; 
            private Long lanTrafficInDataValue; 
            private Long lanTrafficOutDataValue; 
            private String timeStamp; 
            private Float wanBandwidthInDataValue; 
            private Float wanBandwidthOutDataValue; 
            private Long wanTrafficInDataValue; 
            private Long wanTrafficOutDataValue; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * LanBandwidthInDataValue.
             */
            public Builder lanBandwidthInDataValue(Float lanBandwidthInDataValue) {
                this.lanBandwidthInDataValue = lanBandwidthInDataValue;
                return this;
            }

            /**
             * LanBandwidthOutDataValue.
             */
            public Builder lanBandwidthOutDataValue(Float lanBandwidthOutDataValue) {
                this.lanBandwidthOutDataValue = lanBandwidthOutDataValue;
                return this;
            }

            /**
             * LanTrafficInDataValue.
             */
            public Builder lanTrafficInDataValue(Long lanTrafficInDataValue) {
                this.lanTrafficInDataValue = lanTrafficInDataValue;
                return this;
            }

            /**
             * LanTrafficOutDataValue.
             */
            public Builder lanTrafficOutDataValue(Long lanTrafficOutDataValue) {
                this.lanTrafficOutDataValue = lanTrafficOutDataValue;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * WanBandwidthInDataValue.
             */
            public Builder wanBandwidthInDataValue(Float wanBandwidthInDataValue) {
                this.wanBandwidthInDataValue = wanBandwidthInDataValue;
                return this;
            }

            /**
             * WanBandwidthOutDataValue.
             */
            public Builder wanBandwidthOutDataValue(Float wanBandwidthOutDataValue) {
                this.wanBandwidthOutDataValue = wanBandwidthOutDataValue;
                return this;
            }

            /**
             * WanTrafficInDataValue.
             */
            public Builder wanTrafficInDataValue(Long wanTrafficInDataValue) {
                this.wanTrafficInDataValue = wanTrafficInDataValue;
                return this;
            }

            /**
             * WanTrafficOutDataValue.
             */
            public Builder wanTrafficOutDataValue(Long wanTrafficOutDataValue) {
                this.wanTrafficOutDataValue = wanTrafficOutDataValue;
                return this;
            }

            public TrafficUsageDataModule build() {
                return new TrafficUsageDataModule(this);
            } 

        } 

    }
    public static class TrafficUsage extends TeaModel {
        @NameInMap("TrafficUsageDataModule")
        private java.util.List < TrafficUsageDataModule> trafficUsageDataModule;

        private TrafficUsage(Builder builder) {
            this.trafficUsageDataModule = builder.trafficUsageDataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficUsage create() {
            return builder().build();
        }

        /**
         * @return trafficUsageDataModule
         */
        public java.util.List < TrafficUsageDataModule> getTrafficUsageDataModule() {
            return this.trafficUsageDataModule;
        }

        public static final class Builder {
            private java.util.List < TrafficUsageDataModule> trafficUsageDataModule; 

            /**
             * TrafficUsageDataModule.
             */
            public Builder trafficUsageDataModule(java.util.List < TrafficUsageDataModule> trafficUsageDataModule) {
                this.trafficUsageDataModule = trafficUsageDataModule;
                return this;
            }

            public TrafficUsage build() {
                return new TrafficUsage(this);
            } 

        } 

    }
}
