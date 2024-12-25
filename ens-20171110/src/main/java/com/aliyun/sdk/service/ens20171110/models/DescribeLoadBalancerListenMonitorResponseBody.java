// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeLoadBalancerListenMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerListenMonitorResponseBody</p>
 */
public class DescribeLoadBalancerListenMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoadBalancerMonitorListenData")
    private java.util.List<LoadBalancerMonitorListenData> loadBalancerMonitorListenData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLoadBalancerListenMonitorResponseBody(Builder builder) {
        this.loadBalancerMonitorListenData = builder.loadBalancerMonitorListenData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerListenMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return loadBalancerMonitorListenData
     */
    public java.util.List<LoadBalancerMonitorListenData> getLoadBalancerMonitorListenData() {
        return this.loadBalancerMonitorListenData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<LoadBalancerMonitorListenData> loadBalancerMonitorListenData; 
        private String requestId; 

        /**
         * <p>The TCP/UDP monitoring data of the ELB instance.</p>
         */
        public Builder loadBalancerMonitorListenData(java.util.List<LoadBalancerMonitorListenData> loadBalancerMonitorListenData) {
            this.loadBalancerMonitorListenData = loadBalancerMonitorListenData;
            return this;
        }

        /**
         * <p>Id of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLoadBalancerListenMonitorResponseBody build() {
            return new DescribeLoadBalancerListenMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancerListenMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerListenMonitorResponseBody</p>
     */
    public static class LoadBalancerMonitorListenData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActConns")
        private String actConns;

        @com.aliyun.core.annotation.NameInMap("BizTime")
        private String bizTime;

        @com.aliyun.core.annotation.NameInMap("Conns")
        private String conns;

        @com.aliyun.core.annotation.NameInMap("DropConns")
        private String dropConns;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InActConns")
        private String inActConns;

        @com.aliyun.core.annotation.NameInMap("InBytes")
        private String inBytes;

        @com.aliyun.core.annotation.NameInMap("InDropBytes")
        private String inDropBytes;

        @com.aliyun.core.annotation.NameInMap("InDropPkts")
        private String inDropPkts;

        @com.aliyun.core.annotation.NameInMap("InPkts")
        private String inPkts;

        @com.aliyun.core.annotation.NameInMap("InValidRsNum")
        private String inValidRsNum;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private String outBytes;

        @com.aliyun.core.annotation.NameInMap("OutDropBytes")
        private String outDropBytes;

        @com.aliyun.core.annotation.NameInMap("OutDropPkts")
        private String outDropPkts;

        @com.aliyun.core.annotation.NameInMap("OutPkts")
        private String outPkts;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("VPort")
        private String vPort;

        @com.aliyun.core.annotation.NameInMap("ValidRsNum")
        private String validRsNum;

        @com.aliyun.core.annotation.NameInMap("Vip")
        private String vip;

        @com.aliyun.core.annotation.NameInMap("Vni")
        private String vni;

        private LoadBalancerMonitorListenData(Builder builder) {
            this.actConns = builder.actConns;
            this.bizTime = builder.bizTime;
            this.conns = builder.conns;
            this.dropConns = builder.dropConns;
            this.ensRegionId = builder.ensRegionId;
            this.inActConns = builder.inActConns;
            this.inBytes = builder.inBytes;
            this.inDropBytes = builder.inDropBytes;
            this.inDropPkts = builder.inDropPkts;
            this.inPkts = builder.inPkts;
            this.inValidRsNum = builder.inValidRsNum;
            this.loadBalancerId = builder.loadBalancerId;
            this.outBytes = builder.outBytes;
            this.outDropBytes = builder.outDropBytes;
            this.outDropPkts = builder.outDropPkts;
            this.outPkts = builder.outPkts;
            this.proto = builder.proto;
            this.vPort = builder.vPort;
            this.validRsNum = builder.validRsNum;
            this.vip = builder.vip;
            this.vni = builder.vni;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerMonitorListenData create() {
            return builder().build();
        }

        /**
         * @return actConns
         */
        public String getActConns() {
            return this.actConns;
        }

        /**
         * @return bizTime
         */
        public String getBizTime() {
            return this.bizTime;
        }

        /**
         * @return conns
         */
        public String getConns() {
            return this.conns;
        }

        /**
         * @return dropConns
         */
        public String getDropConns() {
            return this.dropConns;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return inActConns
         */
        public String getInActConns() {
            return this.inActConns;
        }

        /**
         * @return inBytes
         */
        public String getInBytes() {
            return this.inBytes;
        }

        /**
         * @return inDropBytes
         */
        public String getInDropBytes() {
            return this.inDropBytes;
        }

        /**
         * @return inDropPkts
         */
        public String getInDropPkts() {
            return this.inDropPkts;
        }

        /**
         * @return inPkts
         */
        public String getInPkts() {
            return this.inPkts;
        }

        /**
         * @return inValidRsNum
         */
        public String getInValidRsNum() {
            return this.inValidRsNum;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return outBytes
         */
        public String getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return outDropBytes
         */
        public String getOutDropBytes() {
            return this.outDropBytes;
        }

        /**
         * @return outDropPkts
         */
        public String getOutDropPkts() {
            return this.outDropPkts;
        }

        /**
         * @return outPkts
         */
        public String getOutPkts() {
            return this.outPkts;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        /**
         * @return vPort
         */
        public String getVPort() {
            return this.vPort;
        }

        /**
         * @return validRsNum
         */
        public String getValidRsNum() {
            return this.validRsNum;
        }

        /**
         * @return vip
         */
        public String getVip() {
            return this.vip;
        }

        /**
         * @return vni
         */
        public String getVni() {
            return this.vni;
        }

        public static final class Builder {
            private String actConns; 
            private String bizTime; 
            private String conns; 
            private String dropConns; 
            private String ensRegionId; 
            private String inActConns; 
            private String inBytes; 
            private String inDropBytes; 
            private String inDropPkts; 
            private String inPkts; 
            private String inValidRsNum; 
            private String loadBalancerId; 
            private String outBytes; 
            private String outDropBytes; 
            private String outDropPkts; 
            private String outPkts; 
            private String proto; 
            private String vPort; 
            private String validRsNum; 
            private String vip; 
            private String vni; 

            /**
             * <p>The number of active connections.</p>
             * 
             * <strong>example:</strong>
             * <p>80285</p>
             */
            public Builder actConns(String actConns) {
                this.actConns = actConns;
                return this;
            }

            /**
             * <p>The business time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-15 16:03:00</p>
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * <p>The number of new connections.</p>
             * 
             * <strong>example:</strong>
             * <p>37150</p>
             */
            public Builder conns(String conns) {
                this.conns = conns;
                return this;
            }

            /**
             * <p>The number of dropped connections.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dropConns(String dropConns) {
                this.dropConns = dropConns;
                return this;
            }

            /**
             * <p>The ID of the node to which the ELB instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-dongguan-9</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The number of inactive connections.</p>
             * 
             * <strong>example:</strong>
             * <p>16322</p>
             */
            public Builder inActConns(String inActConns) {
                this.inActConns = inActConns;
                return this;
            }

            /**
             * <p>The inbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>67532</p>
             */
            public Builder inBytes(String inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The dropped inbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>324</p>
             */
            public Builder inDropBytes(String inDropBytes) {
                this.inDropBytes = inDropBytes;
                return this;
            }

            /**
             * <p>The number of dropped inbound packets.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder inDropPkts(String inDropPkts) {
                this.inDropPkts = inDropPkts;
                return this;
            }

            /**
             * <p>The number of inbound packets.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder inPkts(String inPkts) {
                this.inPkts = inPkts;
                return this;
            }

            /**
             * <p>The number of unavailable servers that are attached to the monitored ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inValidRsNum(String inValidRsNum) {
                this.inValidRsNum = inValidRsNum;
                return this;
            }

            /**
             * <p>The ID of the ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-5q73cv04zeyh43lh74lp4****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>5155487</p>
             */
            public Builder outBytes(String outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>The dropped outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder outDropBytes(String outDropBytes) {
                this.outDropBytes = outDropBytes;
                return this;
            }

            /**
             * <p>The number of dropped outbound packets.</p>
             * 
             * <strong>example:</strong>
             * <p>76</p>
             */
            public Builder outDropPkts(String outDropPkts) {
                this.outDropPkts = outDropPkts;
                return this;
            }

            /**
             * <p>The number of outbound packets.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder outPkts(String outPkts) {
                this.outPkts = outPkts;
                return this;
            }

            /**
             * <p>The network protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * <p>The VIP port of the ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder vPort(String vPort) {
                this.vPort = vPort;
                return this;
            }

            /**
             * <p>The number of available servers that are attached to the monitored ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder validRsNum(String validRsNum) {
                this.validRsNum = validRsNum;
                return this;
            }

            /**
             * <p>The VIP of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.8.<em>.</em></p>
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            /**
             * <p>The ID of the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>53284</p>
             */
            public Builder vni(String vni) {
                this.vni = vni;
                return this;
            }

            public LoadBalancerMonitorListenData build() {
                return new LoadBalancerMonitorListenData(this);
            } 

        } 

    }
}
