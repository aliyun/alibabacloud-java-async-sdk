// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNatFirewallTimeTopResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallTimeTopResponseBody</p>
 */
public class DescribeNatFirewallTimeTopResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCount")
    private Long dataCount;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficTime")
    private String trafficTime;

    private DescribeNatFirewallTimeTopResponseBody(Builder builder) {
        this.dataCount = builder.dataCount;
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.trafficTime = builder.trafficTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallTimeTopResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataCount
     */
    public Long getDataCount() {
        return this.dataCount;
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficTime
     */
    public String getTrafficTime() {
        return this.trafficTime;
    }

    public static final class Builder {
        private Long dataCount; 
        private java.util.List<DataList> dataList; 
        private String requestId; 
        private String trafficTime; 

        private Builder() {
        } 

        private Builder(DescribeNatFirewallTimeTopResponseBody model) {
            this.dataCount = model.dataCount;
            this.dataList = model.dataList;
            this.requestId = model.requestId;
            this.trafficTime = model.trafficTime;
        } 

        /**
         * <p>The number of results.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder dataCount(Long dataCount) {
            this.dataCount = dataCount;
            return this;
        }

        /**
         * <p>The list of data.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C5DDD596-1191-5F36-A504-8733045A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The point in time when the traffic data was collected. This is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1656923760</p>
         */
        public Builder trafficTime(String trafficTime) {
            this.trafficTime = trafficTime;
            return this;
        }

        public DescribeNatFirewallTimeTopResponseBody build() {
            return new DescribeNatFirewallTimeTopResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatFirewallTimeTopResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatFirewallTimeTopResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InBps")
        private Long inBps;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("NatFirewallId")
        private String natFirewallId;

        @com.aliyun.core.annotation.NameInMap("NatFirewallName")
        private String natFirewallName;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        @com.aliyun.core.annotation.NameInMap("NewConn")
        private String newConn;

        @com.aliyun.core.annotation.NameInMap("OutBps")
        private Long outBps;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private String sessionCount;

        @com.aliyun.core.annotation.NameInMap("TotalBps")
        private Long totalBps;

        private DataList(Builder builder) {
            this.inBps = builder.inBps;
            this.ip = builder.ip;
            this.natFirewallId = builder.natFirewallId;
            this.natFirewallName = builder.natFirewallName;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
            this.newConn = builder.newConn;
            this.outBps = builder.outBps;
            this.regionNo = builder.regionNo;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceInstanceName = builder.resourceInstanceName;
            this.sessionCount = builder.sessionCount;
            this.totalBps = builder.totalBps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return inBps
         */
        public Long getInBps() {
            return this.inBps;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return natFirewallId
         */
        public String getNatFirewallId() {
            return this.natFirewallId;
        }

        /**
         * @return natFirewallName
         */
        public String getNatFirewallName() {
            return this.natFirewallName;
        }

        /**
         * @return natGatewayId
         */
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        /**
         * @return natGatewayName
         */
        public String getNatGatewayName() {
            return this.natGatewayName;
        }

        /**
         * @return newConn
         */
        public String getNewConn() {
            return this.newConn;
        }

        /**
         * @return outBps
         */
        public Long getOutBps() {
            return this.outBps;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return resourceInstanceId
         */
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        /**
         * @return resourceInstanceName
         */
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        /**
         * @return sessionCount
         */
        public String getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return totalBps
         */
        public Long getTotalBps() {
            return this.totalBps;
        }

        public static final class Builder {
            private Long inBps; 
            private String ip; 
            private String natFirewallId; 
            private String natFirewallName; 
            private String natGatewayId; 
            private String natGatewayName; 
            private String newConn; 
            private Long outBps; 
            private String regionNo; 
            private String resourceInstanceId; 
            private String resourceInstanceName; 
            private String sessionCount; 
            private Long totalBps; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.inBps = model.inBps;
                this.ip = model.ip;
                this.natFirewallId = model.natFirewallId;
                this.natFirewallName = model.natFirewallName;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayName = model.natGatewayName;
                this.newConn = model.newConn;
                this.outBps = model.outBps;
                this.regionNo = model.regionNo;
                this.resourceInstanceId = model.resourceInstanceId;
                this.resourceInstanceName = model.resourceInstanceName;
                this.sessionCount = model.sessionCount;
                this.totalBps = model.totalBps;
            } 

            /**
             * <p>The inbound bandwidth. Unit: bps.</p>
             * 
             * <strong>example:</strong>
             * <p>187</p>
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.66.231.XXX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the NAT firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>vfw-tr-7a9c8901ed394****</p>
             */
            public Builder natFirewallId(String natFirewallId) {
                this.natFirewallId = natFirewallId;
                return this;
            }

            /**
             * <p>The name of the NAT firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>vfw-test</p>
             */
            public Builder natFirewallName(String natFirewallName) {
                this.natFirewallName = natFirewallName;
                return this;
            }

            /**
             * <p>The ID of the NAT Gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-uf6pnry5vpawb****</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The name of the NAT Gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-test</p>
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * <p>The number of new connections.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder newConn(String newConn) {
                this.newConn = newConn;
                return this;
            }

            /**
             * <p>The outbound bandwidth. Unit: bps.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * <p>The region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The ID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp130nn8h6157dir****</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * <p>The total number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder sessionCount(String sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The total bandwidth. Unit: bps.</p>
             * 
             * <strong>example:</strong>
             * <p>232</p>
             */
            public Builder totalBps(Long totalBps) {
                this.totalBps = totalBps;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
