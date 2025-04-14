// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribePortFlowListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortFlowListResponseBody</p>
 */
public class DescribePortFlowListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortFlowList")
    private java.util.List<PortFlowList> portFlowList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portFlowList
     */
    public java.util.List<PortFlowList> getPortFlowList() {
        return this.portFlowList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PortFlowList> portFlowList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePortFlowListResponseBody model) {
            this.portFlowList = model.portFlowList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned traffic data.</p>
         */
        public Builder portFlowList(java.util.List<PortFlowList> portFlowList) {
            this.portFlowList = portFlowList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FFC77501-BDF8-4BC8-9BF5-B295FBC3189B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortFlowListResponseBody build() {
            return new DescribePortFlowListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortFlowListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortFlowListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PortFlowList model) {
                this.attackBps = model.attackBps;
                this.attackPps = model.attackPps;
                this.inBps = model.inBps;
                this.inPps = model.inPps;
                this.index = model.index;
                this.outBps = model.outBps;
                this.outPps = model.outPps;
                this.region = model.region;
                this.slaBpsDropBps = model.slaBpsDropBps;
                this.slaBpsDropPps = model.slaBpsDropPps;
                this.slaConnDropBps = model.slaConnDropBps;
                this.slaConnDropPps = model.slaConnDropPps;
                this.slaCpsDropBps = model.slaCpsDropBps;
                this.slaCpsDropPps = model.slaCpsDropPps;
                this.slaPpsDropBps = model.slaPpsDropBps;
                this.slaPpsDropPps = model.slaPpsDropPps;
                this.time = model.time;
            } 

            /**
             * <p>The bandwidth of attack traffic. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attackBps(Long attackBps) {
                this.attackBps = attackBps;
                return this;
            }

            /**
             * <p>The packet forwarding rate of attack traffic. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attackPps(Long attackPps) {
                this.attackPps = attackPps;
                return this;
            }

            /**
             * <p>The inbound bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2176000</p>
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * <p>The packet forwarding rate of inbound traffic. Unit: packets per second.</p>
             * 
             * <strong>example:</strong>
             * <p>2934</p>
             */
            public Builder inPps(Long inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * <p>The index number of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The outbound bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>4389</p>
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * <p>The packet forwarding rate of outbound traffic. Unit: packets per second (pps).</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder outPps(Long outPps) {
                this.outPps = outPps;
                return this;
            }

            /**
             * <p>The source region of the traffic. Valid values:</p>
             * <ul>
             * <li><strong>cn</strong>: mainland China</li>
             * <li><strong>alb-ap-northeast-1-gf-x</strong>: Japan (Tokyo)</li>
             * <li><strong>alb-ap-southeast-gf-x</strong>: Singapore</li>
             * <li><strong>alb-cn-hongkong-gf-x</strong>: Hong Kong (China)</li>
             * <li><strong>alb-eu-central-1-gf-x</strong>: Germany (Frankfurt)</li>
             * <li><strong>alb-us-west-1-gf-x</strong>: US (Silicon Valley)</li>
             * </ul>
             * <blockquote>
             * <p>The values except <strong>cn</strong> are returned only when <strong>RegionId</strong> is set to <strong>ap-southeast-1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
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
             * <p>The time when the data was collected. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1582992000</p>
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
