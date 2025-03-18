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
 * {@link DescribeServerLoadBalancerMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServerLoadBalancerMonitorResponseBody</p>
 */
public class DescribeServerLoadBalancerMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerLoadBalancerMonitorData")
    private java.util.List<ServerLoadBalancerMonitorData> serverLoadBalancerMonitorData;

    private DescribeServerLoadBalancerMonitorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serverLoadBalancerMonitorData = builder.serverLoadBalancerMonitorData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServerLoadBalancerMonitorResponseBody create() {
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
     * @return serverLoadBalancerMonitorData
     */
    public java.util.List<ServerLoadBalancerMonitorData> getServerLoadBalancerMonitorData() {
        return this.serverLoadBalancerMonitorData;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ServerLoadBalancerMonitorData> serverLoadBalancerMonitorData; 

        private Builder() {
        } 

        private Builder(DescribeServerLoadBalancerMonitorResponseBody model) {
            this.requestId = model.requestId;
            this.serverLoadBalancerMonitorData = model.serverLoadBalancerMonitorData;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the monitoring data.</p>
         */
        public Builder serverLoadBalancerMonitorData(java.util.List<ServerLoadBalancerMonitorData> serverLoadBalancerMonitorData) {
            this.serverLoadBalancerMonitorData = serverLoadBalancerMonitorData;
            return this;
        }

        public DescribeServerLoadBalancerMonitorResponseBody build() {
            return new DescribeServerLoadBalancerMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServerLoadBalancerMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServerLoadBalancerMonitorResponseBody</p>
     */
    public static class ServerLoadBalancerMonitorData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acc")
        private Integer acc;

        @com.aliyun.core.annotation.NameInMap("BizTime")
        private String bizTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
        private String loadBalancerName;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerSpec")
        private String loadBalancerSpec;

        @com.aliyun.core.annotation.NameInMap("Reqs2xx")
        private Integer reqs2xx;

        @com.aliyun.core.annotation.NameInMap("Reqs3xx")
        private Integer reqs3xx;

        @com.aliyun.core.annotation.NameInMap("Reqs4xx")
        private Integer reqs4xx;

        @com.aliyun.core.annotation.NameInMap("Reqs5xx")
        private Integer reqs5xx;

        @com.aliyun.core.annotation.NameInMap("RtAvg")
        private Integer rtAvg;

        @com.aliyun.core.annotation.NameInMap("Vip")
        private String vip;

        @com.aliyun.core.annotation.NameInMap("Vni")
        private Integer vni;

        private ServerLoadBalancerMonitorData(Builder builder) {
            this.acc = builder.acc;
            this.bizTime = builder.bizTime;
            this.ensRegionId = builder.ensRegionId;
            this.loadBalancerId = builder.loadBalancerId;
            this.loadBalancerName = builder.loadBalancerName;
            this.loadBalancerSpec = builder.loadBalancerSpec;
            this.reqs2xx = builder.reqs2xx;
            this.reqs3xx = builder.reqs3xx;
            this.reqs4xx = builder.reqs4xx;
            this.reqs5xx = builder.reqs5xx;
            this.rtAvg = builder.rtAvg;
            this.vip = builder.vip;
            this.vni = builder.vni;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerLoadBalancerMonitorData create() {
            return builder().build();
        }

        /**
         * @return acc
         */
        public Integer getAcc() {
            return this.acc;
        }

        /**
         * @return bizTime
         */
        public String getBizTime() {
            return this.bizTime;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return loadBalancerName
         */
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        /**
         * @return loadBalancerSpec
         */
        public String getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        /**
         * @return reqs2xx
         */
        public Integer getReqs2xx() {
            return this.reqs2xx;
        }

        /**
         * @return reqs3xx
         */
        public Integer getReqs3xx() {
            return this.reqs3xx;
        }

        /**
         * @return reqs4xx
         */
        public Integer getReqs4xx() {
            return this.reqs4xx;
        }

        /**
         * @return reqs5xx
         */
        public Integer getReqs5xx() {
            return this.reqs5xx;
        }

        /**
         * @return rtAvg
         */
        public Integer getRtAvg() {
            return this.rtAvg;
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
        public Integer getVni() {
            return this.vni;
        }

        public static final class Builder {
            private Integer acc; 
            private String bizTime; 
            private String ensRegionId; 
            private String loadBalancerId; 
            private String loadBalancerName; 
            private String loadBalancerSpec; 
            private Integer reqs2xx; 
            private Integer reqs3xx; 
            private Integer reqs4xx; 
            private Integer reqs5xx; 
            private Integer rtAvg; 
            private String vip; 
            private Integer vni; 

            private Builder() {
            } 

            private Builder(ServerLoadBalancerMonitorData model) {
                this.acc = model.acc;
                this.bizTime = model.bizTime;
                this.ensRegionId = model.ensRegionId;
                this.loadBalancerId = model.loadBalancerId;
                this.loadBalancerName = model.loadBalancerName;
                this.loadBalancerSpec = model.loadBalancerSpec;
                this.reqs2xx = model.reqs2xx;
                this.reqs3xx = model.reqs3xx;
                this.reqs4xx = model.reqs4xx;
                this.reqs5xx = model.reqs5xx;
                this.rtAvg = model.rtAvg;
                this.vip = model.vip;
                this.vni = model.vni;
            } 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder acc(Integer acc) {
                this.acc = acc;
                return this;
            }

            /**
             * <p>The business time of the log. Logs are collected every minute.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-15 16:00:00</p>
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * <p>The ID of the node to which the ELB instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wuxi-10</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-5sc1s9zrui8lpb8u7cl4f****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The name of the ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>esk-edge-service-lb-a34****</p>
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * <p>The specification of the ELB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>elb.s2.medium</p>
             */
            public Builder loadBalancerSpec(String loadBalancerSpec) {
                this.loadBalancerSpec = loadBalancerSpec;
                return this;
            }

            /**
             * <p>The number of requests with HTTP 2xx status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder reqs2xx(Integer reqs2xx) {
                this.reqs2xx = reqs2xx;
                return this;
            }

            /**
             * <p>The number of requests with HTTP 3xx status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reqs3xx(Integer reqs3xx) {
                this.reqs3xx = reqs3xx;
                return this;
            }

            /**
             * <p>The number of requests with HTTP 4xx status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder reqs4xx(Integer reqs4xx) {
                this.reqs4xx = reqs4xx;
                return this;
            }

            /**
             * <p>The number of requests with HTTP 5xx status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reqs5xx(Integer reqs5xx) {
                this.reqs5xx = reqs5xx;
                return this;
            }

            /**
             * <p>The average response time. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1404</p>
             */
            public Builder rtAvg(Integer rtAvg) {
                this.rtAvg = rtAvg;
                return this;
            }

            /**
             * <p>The virtual IP address (VIP) of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0****</p>
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            /**
             * <p>The ID of the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>3018</p>
             */
            public Builder vni(Integer vni) {
                this.vni = vni;
                return this;
            }

            public ServerLoadBalancerMonitorData build() {
                return new ServerLoadBalancerMonitorData(this);
            } 

        } 

    }
}
