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
 * {@link DescribeInternetTimeTopResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetTimeTopResponseBody</p>
 */
public class DescribeInternetTimeTopResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCount")
    private Integer dataCount;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficTime")
    private Integer trafficTime;

    private DescribeInternetTimeTopResponseBody(Builder builder) {
        this.dataCount = builder.dataCount;
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.trafficTime = builder.trafficTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetTimeTopResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataCount
     */
    public Integer getDataCount() {
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
    public Integer getTrafficTime() {
        return this.trafficTime;
    }

    public static final class Builder {
        private Integer dataCount; 
        private java.util.List<DataList> dataList; 
        private String requestId; 
        private Integer trafficTime; 

        private Builder() {
        } 

        private Builder(DescribeInternetTimeTopResponseBody model) {
            this.dataCount = model.dataCount;
            this.dataList = model.dataList;
            this.requestId = model.requestId;
            this.trafficTime = model.trafficTime;
        } 

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder dataCount(Integer dataCount) {
            this.dataCount = dataCount;
            return this;
        }

        /**
         * <p>The list of data entries.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F2D5C04-731F-50B0-ADE1-01637B3C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp of the traffic data. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1734399660</p>
         */
        public Builder trafficTime(Integer trafficTime) {
            this.trafficTime = trafficTime;
            return this;
        }

        public DescribeInternetTimeTopResponseBody build() {
            return new DescribeInternetTimeTopResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInternetTimeTopResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetTimeTopResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IP")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("InBps")
        private Long inBps;

        @com.aliyun.core.annotation.NameInMap("InPps")
        private Long inPps;

        @com.aliyun.core.annotation.NameInMap("NatGatewayId")
        private String natGatewayId;

        @com.aliyun.core.annotation.NameInMap("NatGatewayName")
        private String natGatewayName;

        @com.aliyun.core.annotation.NameInMap("NatIP")
        private String natIP;

        @com.aliyun.core.annotation.NameInMap("NewConn")
        private Long newConn;

        @com.aliyun.core.annotation.NameInMap("OutBps")
        private Long outBps;

        @com.aliyun.core.annotation.NameInMap("OutPps")
        private Long outPps;

        @com.aliyun.core.annotation.NameInMap("PrivateIP")
        private String privateIP;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
        private String resourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
        private String resourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SessionCount")
        private Long sessionCount;

        @com.aliyun.core.annotation.NameInMap("TotalBps")
        private Long totalBps;

        @com.aliyun.core.annotation.NameInMap("TotalPps")
        private Long totalPps;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private DataList(Builder builder) {
            this.ip = builder.ip;
            this.inBps = builder.inBps;
            this.inPps = builder.inPps;
            this.natGatewayId = builder.natGatewayId;
            this.natGatewayName = builder.natGatewayName;
            this.natIP = builder.natIP;
            this.newConn = builder.newConn;
            this.outBps = builder.outBps;
            this.outPps = builder.outPps;
            this.privateIP = builder.privateIP;
            this.regionNo = builder.regionNo;
            this.resourceInstanceId = builder.resourceInstanceId;
            this.resourceInstanceName = builder.resourceInstanceName;
            this.resourceType = builder.resourceType;
            this.sessionCount = builder.sessionCount;
            this.totalBps = builder.totalBps;
            this.totalPps = builder.totalPps;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
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
         * @return natIP
         */
        public String getNatIP() {
            return this.natIP;
        }

        /**
         * @return newConn
         */
        public Long getNewConn() {
            return this.newConn;
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
         * @return privateIP
         */
        public String getPrivateIP() {
            return this.privateIP;
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
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return sessionCount
         */
        public Long getSessionCount() {
            return this.sessionCount;
        }

        /**
         * @return totalBps
         */
        public Long getTotalBps() {
            return this.totalBps;
        }

        /**
         * @return totalPps
         */
        public Long getTotalPps() {
            return this.totalPps;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String ip; 
            private Long inBps; 
            private Long inPps; 
            private String natGatewayId; 
            private String natGatewayName; 
            private String natIP; 
            private Long newConn; 
            private Long outBps; 
            private Long outPps; 
            private String privateIP; 
            private String regionNo; 
            private String resourceInstanceId; 
            private String resourceInstanceName; 
            private String resourceType; 
            private Long sessionCount; 
            private Long totalBps; 
            private Long totalPps; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.ip = model.ip;
                this.inBps = model.inBps;
                this.inPps = model.inPps;
                this.natGatewayId = model.natGatewayId;
                this.natGatewayName = model.natGatewayName;
                this.natIP = model.natIP;
                this.newConn = model.newConn;
                this.outBps = model.outBps;
                this.outPps = model.outPps;
                this.privateIP = model.privateIP;
                this.regionNo = model.regionNo;
                this.resourceInstanceId = model.resourceInstanceId;
                this.resourceInstanceName = model.resourceInstanceName;
                this.resourceType = model.resourceType;
                this.sessionCount = model.sessionCount;
                this.totalBps = model.totalBps;
                this.totalPps = model.totalPps;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>183.60.164.XXX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The inbound bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>187</p>
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * <p>The inbound packet forwarding rate. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder inPps(Long inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * <p>The ID of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-wz98eedr5l5hkb8****e7</p>
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * <p>The name of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>ngw-test</p>
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * <p>The public IP address of the NAT gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>47.97.66.XXX</p>
             */
            public Builder natIP(String natIP) {
                this.natIP = natIP;
                return this;
            }

            /**
             * <p>The number of new connections.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder newConn(Long newConn) {
                this.newConn = newConn;
                return this;
            }

            /**
             * <p>The outbound traffic. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * <p>The outbound packet forwarding rate. Unit: pps.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder outPps(Long outPps) {
                this.outPps = outPps;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.21.186.XXX</p>
             */
            public Builder privateIP(String privateIP) {
                this.privateIP = privateIP;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The ID of the asset instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp14ue2rgktunncq****</p>
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * <p>The type of the public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsPublicIP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * <p>The total bandwidth. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>232</p>
             */
            public Builder totalBps(Long totalBps) {
                this.totalBps = totalBps;
                return this;
            }

            /**
             * <p>The total number of packets.</p>
             * 
             * <strong>example:</strong>
             * <p>88</p>
             */
            public Builder totalPps(Long totalPps) {
                this.totalPps = totalPps;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9o0uzfjuj81fx7m****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
