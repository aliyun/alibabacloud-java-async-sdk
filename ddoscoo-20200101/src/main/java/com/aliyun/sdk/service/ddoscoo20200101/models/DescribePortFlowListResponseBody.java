// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortFlowListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortFlowListResponseBody</p>
 */
public class DescribePortFlowListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortFlowList")
    private java.util.List < PortFlowList> portFlowList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePortFlowListResponseBody(Builder builder) {
        this.portFlowList = builder.portFlowList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortFlowListResponseBody create() {
        return builder().build();
    }

    /**
     * @return portFlowList
     */
    public java.util.List < PortFlowList> getPortFlowList() {
        return this.portFlowList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PortFlowList> portFlowList; 
        private String requestId; 

        /**
         * The returned traffic data.
         */
        public Builder portFlowList(java.util.List < PortFlowList> portFlowList) {
            this.portFlowList = portFlowList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortFlowListResponseBody build() {
            return new DescribePortFlowListResponseBody(this);
        } 

    } 

    public static class PortFlowList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackBps")
        private Long attackBps;

        @com.aliyun.core.annotation.NameInMap("AttackPps")
        private Long attackPps;

        @com.aliyun.core.annotation.NameInMap("InBps")
        private Long inBps;

        @com.aliyun.core.annotation.NameInMap("InPps")
        private Long inPps;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("OutBps")
        private Long outBps;

        @com.aliyun.core.annotation.NameInMap("OutPps")
        private Long outPps;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SlaBpsDropBps")
        private Long slaBpsDropBps;

        @com.aliyun.core.annotation.NameInMap("SlaBpsDropPps")
        private Long slaBpsDropPps;

        @com.aliyun.core.annotation.NameInMap("SlaConnDropBps")
        private Long slaConnDropBps;

        @com.aliyun.core.annotation.NameInMap("SlaConnDropPps")
        private Long slaConnDropPps;

        @com.aliyun.core.annotation.NameInMap("SlaCpsDropBps")
        private Long slaCpsDropBps;

        @com.aliyun.core.annotation.NameInMap("SlaCpsDropPps")
        private Long slaCpsDropPps;

        @com.aliyun.core.annotation.NameInMap("SlaPpsDropBps")
        private Long slaPpsDropBps;

        @com.aliyun.core.annotation.NameInMap("SlaPpsDropPps")
        private Long slaPpsDropPps;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private PortFlowList(Builder builder) {
            this.attackBps = builder.attackBps;
            this.attackPps = builder.attackPps;
            this.inBps = builder.inBps;
            this.inPps = builder.inPps;
            this.index = builder.index;
            this.outBps = builder.outBps;
            this.outPps = builder.outPps;
            this.region = builder.region;
            this.slaBpsDropBps = builder.slaBpsDropBps;
            this.slaBpsDropPps = builder.slaBpsDropPps;
            this.slaConnDropBps = builder.slaConnDropBps;
            this.slaConnDropPps = builder.slaConnDropPps;
            this.slaCpsDropBps = builder.slaCpsDropBps;
            this.slaCpsDropPps = builder.slaCpsDropPps;
            this.slaPpsDropBps = builder.slaPpsDropBps;
            this.slaPpsDropPps = builder.slaPpsDropPps;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortFlowList create() {
            return builder().build();
        }

        /**
         * @return attackBps
         */
        public Long getAttackBps() {
            return this.attackBps;
        }

        /**
         * @return attackPps
         */
        public Long getAttackPps() {
            return this.attackPps;
        }

        /**
         * @return inBps
         */
        public Long getInBps() {
            return this.inBps;
        }

        /**
         * @return inPps
         */
        public Long getInPps() {
            return this.inPps;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return outBps
         */
        public Long getOutBps() {
            return this.outBps;
        }

        /**
         * @return outPps
         */
        public Long getOutPps() {
            return this.outPps;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return slaBpsDropBps
         */
        public Long getSlaBpsDropBps() {
            return this.slaBpsDropBps;
        }

        /**
         * @return slaBpsDropPps
         */
        public Long getSlaBpsDropPps() {
            return this.slaBpsDropPps;
        }

        /**
         * @return slaConnDropBps
         */
        public Long getSlaConnDropBps() {
            return this.slaConnDropBps;
        }

        /**
         * @return slaConnDropPps
         */
        public Long getSlaConnDropPps() {
            return this.slaConnDropPps;
        }

        /**
         * @return slaCpsDropBps
         */
        public Long getSlaCpsDropBps() {
            return this.slaCpsDropBps;
        }

        /**
         * @return slaCpsDropPps
         */
        public Long getSlaCpsDropPps() {
            return this.slaCpsDropPps;
        }

        /**
         * @return slaPpsDropBps
         */
        public Long getSlaPpsDropBps() {
            return this.slaPpsDropBps;
        }

        /**
         * @return slaPpsDropPps
         */
        public Long getSlaPpsDropPps() {
            return this.slaPpsDropPps;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long attackBps; 
            private Long attackPps; 
            private Long inBps; 
            private Long inPps; 
            private Long index; 
            private Long outBps; 
            private Long outPps; 
            private String region; 
            private Long slaBpsDropBps; 
            private Long slaBpsDropPps; 
            private Long slaConnDropBps; 
            private Long slaConnDropPps; 
            private Long slaCpsDropBps; 
            private Long slaCpsDropPps; 
            private Long slaPpsDropBps; 
            private Long slaPpsDropPps; 
            private Long time; 

            /**
             * The bandwidth of attack traffic. Unit: bit/s.
             */
            public Builder attackBps(Long attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * The packet forwarding rate of attack traffic. Unit: pps.
             */
            public Builder attackPps(Long attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * The inbound bandwidth. Unit: bit/s.
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * The packet forwarding rate of inbound traffic. Unit: packets per second.
             */
            public Builder inPps(Long inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * The index number of the returned data.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * The outbound bandwidth. Unit: bit/s.
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * The packet forwarding rate of outbound traffic. Unit: packets per second (pps).
             */
            public Builder outPps(Long outPps) {
                this.outPps = outPps;
                return this;
            }

            /**
             * The source region of the traffic. Valid values:
             * <p>
             * 
             * *   **cn**: mainland China
             * *   **alb-ap-northeast-1-gf-x**: Japan (Tokyo)
             * *   **alb-ap-southeast-gf-x**: Singapore
             * *   **alb-cn-hongkong-gf-x**: Hong Kong (China)
             * *   **alb-eu-central-1-gf-x**: Germany (Frankfurt)
             * *   **alb-us-west-1-gf-x**: US (Silicon Valley)
             * 
             * > The values except **cn** are returned only when **RegionId** is set to **ap-southeast-1**.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SlaBpsDropBps.
             */
            public Builder slaBpsDropBps(Long slaBpsDropBps) {
                this.slaBpsDropBps = slaBpsDropBps;
                return this;
            }

            /**
             * SlaBpsDropPps.
             */
            public Builder slaBpsDropPps(Long slaBpsDropPps) {
                this.slaBpsDropPps = slaBpsDropPps;
                return this;
            }

            /**
             * SlaConnDropBps.
             */
            public Builder slaConnDropBps(Long slaConnDropBps) {
                this.slaConnDropBps = slaConnDropBps;
                return this;
            }

            /**
             * SlaConnDropPps.
             */
            public Builder slaConnDropPps(Long slaConnDropPps) {
                this.slaConnDropPps = slaConnDropPps;
                return this;
            }

            /**
             * SlaCpsDropBps.
             */
            public Builder slaCpsDropBps(Long slaCpsDropBps) {
                this.slaCpsDropBps = slaCpsDropBps;
                return this;
            }

            /**
             * SlaCpsDropPps.
             */
            public Builder slaCpsDropPps(Long slaCpsDropPps) {
                this.slaCpsDropPps = slaCpsDropPps;
                return this;
            }

            /**
             * SlaPpsDropBps.
             */
            public Builder slaPpsDropBps(Long slaPpsDropBps) {
                this.slaPpsDropBps = slaPpsDropBps;
                return this;
            }

            /**
             * SlaPpsDropPps.
             */
            public Builder slaPpsDropPps(Long slaPpsDropPps) {
                this.slaPpsDropPps = slaPpsDropPps;
                return this;
            }

            /**
             * The time when the data was collected. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public PortFlowList build() {
                return new PortFlowList(this);
            } 

        } 

    }
}
