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
         * DataCount.
         */
        public Builder dataCount(Integer dataCount) {
            this.dataCount = dataCount;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
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
         * TrafficTime.
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
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * InBps.
             */
            public Builder inBps(Long inBps) {
                this.inBps = inBps;
                return this;
            }

            /**
             * InPps.
             */
            public Builder inPps(Long inPps) {
                this.inPps = inPps;
                return this;
            }

            /**
             * NatGatewayId.
             */
            public Builder natGatewayId(String natGatewayId) {
                this.natGatewayId = natGatewayId;
                return this;
            }

            /**
             * NatGatewayName.
             */
            public Builder natGatewayName(String natGatewayName) {
                this.natGatewayName = natGatewayName;
                return this;
            }

            /**
             * NatIP.
             */
            public Builder natIP(String natIP) {
                this.natIP = natIP;
                return this;
            }

            /**
             * NewConn.
             */
            public Builder newConn(Long newConn) {
                this.newConn = newConn;
                return this;
            }

            /**
             * OutBps.
             */
            public Builder outBps(Long outBps) {
                this.outBps = outBps;
                return this;
            }

            /**
             * OutPps.
             */
            public Builder outPps(Long outPps) {
                this.outPps = outPps;
                return this;
            }

            /**
             * PrivateIP.
             */
            public Builder privateIP(String privateIP) {
                this.privateIP = privateIP;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * ResourceInstanceId.
             */
            public Builder resourceInstanceId(String resourceInstanceId) {
                this.resourceInstanceId = resourceInstanceId;
                return this;
            }

            /**
             * ResourceInstanceName.
             */
            public Builder resourceInstanceName(String resourceInstanceName) {
                this.resourceInstanceName = resourceInstanceName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * SessionCount.
             */
            public Builder sessionCount(Long sessionCount) {
                this.sessionCount = sessionCount;
                return this;
            }

            /**
             * TotalBps.
             */
            public Builder totalBps(Long totalBps) {
                this.totalBps = totalBps;
                return this;
            }

            /**
             * TotalPps.
             */
            public Builder totalPps(Long totalPps) {
                this.totalPps = totalPps;
                return this;
            }

            /**
             * VpcId.
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
