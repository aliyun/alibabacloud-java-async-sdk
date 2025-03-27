// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIpDdosThresholdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpDdosThresholdResponseBody</p>
 */
public class DescribeIpDdosThresholdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Threshold threshold;

    private DescribeIpDdosThresholdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpDdosThresholdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return threshold
     */
    public Threshold getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private String requestId; 
        private Threshold threshold; 

        private Builder() {
        } 

        private Builder(DescribeIpDdosThresholdResponseBody model) {
            this.requestId = model.requestId;
            this.threshold = model.threshold;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>025F1688-680B-551A-9A8E-1A0D796315CF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the details of the threshold.</p>
         */
        public Builder threshold(Threshold threshold) {
            this.threshold = threshold;
            return this;
        }

        public DescribeIpDdosThresholdResponseBody build() {
            return new DescribeIpDdosThresholdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpDdosThresholdResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpDdosThresholdResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Threshold model) {
                this.bps = model.bps;
                this.ddosType = model.ddosType;
                this.elasticBps = model.elasticBps;
                this.instanceId = model.instanceId;
                this.internetIp = model.internetIp;
                this.isAuto = model.isAuto;
                this.maxBps = model.maxBps;
                this.maxPps = model.maxPps;
                this.pps = model.pps;
            } 

            /**
             * <p>If the value of the <strong>DdosType</strong> parameter is <strong>defense</strong>, the Bps parameter indicates the current traffic scrubbing threshold. Unit: Mbit/s.</p>
             * <p>If the value of the <strong>DdosType</strong> parameter is <strong>blackhole</strong>, the Bps parameter indicates the basic protection threshold. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>7500</p>
             */
            public Builder bps(Integer bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The type of the threshold. Valid values:</p>
             * <ul>
             * <li><strong>defense</strong>: traffic scrubbing threshold</li>
             * <li><strong>blackhole</strong>: DDoS mitigation threshold</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>defense</p>
             */
            public Builder ddosType(String ddosType) {
                this.ddosType = ddosType;
                return this;
            }

            /**
             * <p>The burstable protection threshold (the maximum DDoS mitigation threshold). Unit: Mbit/s.</p>
             * <blockquote>
             * <p>This parameter is returned only when the value of the <strong>DdosType</strong> parameter is <strong>blackhole</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12310</p>
             */
            public Builder elasticBps(Integer elasticBps) {
                this.elasticBps = elasticBps;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1i88rqjza51s****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>Indicates whether the threshold is automatically adjusted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The scrubbing thresholds are automatically adjusted based on the traffic load on the asset.</li>
             * <li><strong>false</strong>: The scrubbing thresholds are not automatically adjusted. You must manually specify the scrubbing thresholds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isAuto(Boolean isAuto) {
                this.isAuto = isAuto;
                return this;
            }

            /**
             * <p>The maximum traffic scrubbing threshold. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>7500</p>
             */
            public Builder maxBps(Integer maxBps) {
                this.maxBps = maxBps;
                return this;
            }

            /**
             * <p>The maximum packet scrubbing threshold. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>5000000</p>
             */
            public Builder maxPps(Integer maxPps) {
                this.maxPps = maxPps;
                return this;
            }

            /**
             * <p>The packet scrubbing threshold. Unit: packets per second (pps).</p>
             * <blockquote>
             * <p>This parameter is returned only when the value of the <strong>DdosType</strong> parameter is <strong>defense</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5000000</p>
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
}
