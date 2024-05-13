// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosThresholdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosThresholdResponseBody</p>
 */
public class DescribeDdosThresholdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Thresholds")
    private Thresholds thresholds;

    private DescribeDdosThresholdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.thresholds = builder.thresholds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosThresholdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return thresholds
     */
    public Thresholds getThresholds() {
        return this.thresholds;
    }

    public static final class Builder {
        private String requestId; 
        private Thresholds thresholds; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the details of the threshold.
         */
        public Builder thresholds(Thresholds thresholds) {
            this.thresholds = thresholds;
            return this;
        }

        public DescribeDdosThresholdResponseBody build() {
            return new DescribeDdosThresholdResponseBody(this);
        } 

    } 

    public static class Threshold extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Integer bps;

        @com.aliyun.core.annotation.NameInMap("DdosType")
        private String ddosType;

        @com.aliyun.core.annotation.NameInMap("ElasticBps")
        private Integer elasticBps;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IsAuto")
        private Boolean isAuto;

        @com.aliyun.core.annotation.NameInMap("MaxBps")
        private Integer maxBps;

        @com.aliyun.core.annotation.NameInMap("MaxPps")
        private Integer maxPps;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Integer pps;

        private Threshold(Builder builder) {
            this.bps = builder.bps;
            this.ddosType = builder.ddosType;
            this.elasticBps = builder.elasticBps;
            this.instanceId = builder.instanceId;
            this.internetIp = builder.internetIp;
            this.isAuto = builder.isAuto;
            this.maxBps = builder.maxBps;
            this.maxPps = builder.maxPps;
            this.pps = builder.pps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Threshold create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Integer getBps() {
            return this.bps;
        }

        /**
         * @return ddosType
         */
        public String getDdosType() {
            return this.ddosType;
        }

        /**
         * @return elasticBps
         */
        public Integer getElasticBps() {
            return this.elasticBps;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return isAuto
         */
        public Boolean getIsAuto() {
            return this.isAuto;
        }

        /**
         * @return maxBps
         */
        public Integer getMaxBps() {
            return this.maxBps;
        }

        /**
         * @return maxPps
         */
        public Integer getMaxPps() {
            return this.maxPps;
        }

        /**
         * @return pps
         */
        public Integer getPps() {
            return this.pps;
        }

        public static final class Builder {
            private Integer bps; 
            private String ddosType; 
            private Integer elasticBps; 
            private String instanceId; 
            private String internetIp; 
            private Boolean isAuto; 
            private Integer maxBps; 
            private Integer maxPps; 
            private Integer pps; 

            /**
             * If the value of the **DdosType** parameter is **defense**, the Bps parameter indicates the current traffic scrubbing threshold. Unit: Mbit/s.
             * <p>
             * 
             * If the value of the **DdosType** parameter is **blackhole**, the Bps parameter indicates the basic protection threshold. Unit: Mbit/s.
             */
            public Builder bps(Integer bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The type of the threshold. Valid values:
             * <p>
             * 
             * *   **defense**: traffic scrubbing threshold
             * *   **blackhole**: DDoS mitigation threshold
             */
            public Builder ddosType(String ddosType) {
                this.ddosType = ddosType;
                return this;
            }

            /**
             * The burstable protection threshold (the maximum DDoS mitigation threshold). Unit: Mbit/s.
             * <p>
             * 
             * > This parameter is returned only when the value of the **DdosType** parameter is **blackhole**.
             */
            public Builder elasticBps(Integer elasticBps) {
                this.elasticBps = elasticBps;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The IP address of the asset.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * Indicates whether the threshold is automatically adjusted. Valid values:
             * <p>
             * 
             * *   **true**: The scrubbing thresholds are automatically adjusted based on the traffic load on the asset.
             * *   **false**: The scrubbing thresholds are not automatically adjusted. You must manually specify the scrubbing thresholds.
             */
            public Builder isAuto(Boolean isAuto) {
                this.isAuto = isAuto;
                return this;
            }

            /**
             * The maximum traffic scrubbing threshold. Unit: Mbit/s.
             */
            public Builder maxBps(Integer maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * The maximum packet scrubbing threshold. Unit: pps.
             */
            public Builder maxPps(Integer maxPps) {
                this.maxPps = maxPps;
                return this;
            }

            /**
             * The packet scrubbing threshold. Unit: pps.
             * <p>
             * 
             * > This parameter is returned only when the value of the **DdosType** parameter is **defense**.
             */
            public Builder pps(Integer pps) {
                this.pps = pps;
                return this;
            }

            public Threshold build() {
                return new Threshold(this);
            } 

        } 

    }
    public static class Thresholds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Threshold")
        private java.util.List < Threshold> threshold;

        private Thresholds(Builder builder) {
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thresholds create() {
            return builder().build();
        }

        /**
         * @return threshold
         */
        public java.util.List < Threshold> getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private java.util.List < Threshold> threshold; 

            /**
             * Threshold.
             */
            public Builder threshold(java.util.List < Threshold> threshold) {
                this.threshold = threshold;
                return this;
            }

            public Thresholds build() {
                return new Thresholds(this);
            } 

        } 

    }
}
