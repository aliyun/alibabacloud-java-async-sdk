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
 * {@link DescribeAckClusterConnectorsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAckClusterConnectorsResponseBody</p>
 */
public class DescribeAckClusterConnectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AckClusterConnectors")
    private java.util.List<AckClusterConnectors> ackClusterConnectors;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAckClusterConnectorsResponseBody(Builder builder) {
        this.ackClusterConnectors = builder.ackClusterConnectors;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAckClusterConnectorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ackClusterConnectors
     */
    public java.util.List<AckClusterConnectors> getAckClusterConnectors() {
        return this.ackClusterConnectors;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AckClusterConnectors> ackClusterConnectors; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAckClusterConnectorsResponseBody model) {
            this.ackClusterConnectors = model.ackClusterConnectors;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AckClusterConnectors.
         */
        public Builder ackClusterConnectors(java.util.List<AckClusterConnectors> ackClusterConnectors) {
            this.ackClusterConnectors = ackClusterConnectors;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAckClusterConnectorsResponseBody build() {
            return new DescribeAckClusterConnectorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAckClusterConnectorsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAckClusterConnectorsResponseBody</p>
     */
    public static class AckClusterConnectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ConnectorHealthCheckStatus")
        private String connectorHealthCheckStatus;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("ConnectorName")
        private String connectorName;

        @com.aliyun.core.annotation.NameInMap("ConnectorStatus")
        private String connectorStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("GroupUuids")
        private java.util.List<String> groupUuids;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("PrimaryVswitchId")
        private String primaryVswitchId;

        @com.aliyun.core.annotation.NameInMap("PrimaryVswitchIp")
        private String primaryVswitchIp;

        @com.aliyun.core.annotation.NameInMap("PrimaryVswitchZoneId")
        private String primaryVswitchZoneId;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("StandbyVswitchId")
        private String standbyVswitchId;

        @com.aliyun.core.annotation.NameInMap("StandbyVswitchIp")
        private String standbyVswitchIp;

        @com.aliyun.core.annotation.NameInMap("StandbyVswitchZoneId")
        private String standbyVswitchZoneId;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("UnhealthyReason")
        private String unhealthyReason;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AckClusterConnectors(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.connectorHealthCheckStatus = builder.connectorHealthCheckStatus;
            this.connectorId = builder.connectorId;
            this.connectorName = builder.connectorName;
            this.connectorStatus = builder.connectorStatus;
            this.createTime = builder.createTime;
            this.groupUuids = builder.groupUuids;
            this.memberUid = builder.memberUid;
            this.primaryVswitchId = builder.primaryVswitchId;
            this.primaryVswitchIp = builder.primaryVswitchIp;
            this.primaryVswitchZoneId = builder.primaryVswitchZoneId;
            this.regionNo = builder.regionNo;
            this.standbyVswitchId = builder.standbyVswitchId;
            this.standbyVswitchIp = builder.standbyVswitchIp;
            this.standbyVswitchZoneId = builder.standbyVswitchZoneId;
            this.ttl = builder.ttl;
            this.unhealthyReason = builder.unhealthyReason;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AckClusterConnectors create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return connectorHealthCheckStatus
         */
        public String getConnectorHealthCheckStatus() {
            return this.connectorHealthCheckStatus;
        }

        /**
         * @return connectorId
         */
        public String getConnectorId() {
            return this.connectorId;
        }

        /**
         * @return connectorName
         */
        public String getConnectorName() {
            return this.connectorName;
        }

        /**
         * @return connectorStatus
         */
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupUuids
         */
        public java.util.List<String> getGroupUuids() {
            return this.groupUuids;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return primaryVswitchId
         */
        public String getPrimaryVswitchId() {
            return this.primaryVswitchId;
        }

        /**
         * @return primaryVswitchIp
         */
        public String getPrimaryVswitchIp() {
            return this.primaryVswitchIp;
        }

        /**
         * @return primaryVswitchZoneId
         */
        public String getPrimaryVswitchZoneId() {
            return this.primaryVswitchZoneId;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return standbyVswitchId
         */
        public String getStandbyVswitchId() {
            return this.standbyVswitchId;
        }

        /**
         * @return standbyVswitchIp
         */
        public String getStandbyVswitchIp() {
            return this.standbyVswitchIp;
        }

        /**
         * @return standbyVswitchZoneId
         */
        public String getStandbyVswitchZoneId() {
            return this.standbyVswitchZoneId;
        }

        /**
         * @return ttl
         */
        public Integer getTtl() {
            return this.ttl;
        }

        /**
         * @return unhealthyReason
         */
        public String getUnhealthyReason() {
            return this.unhealthyReason;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String connectorHealthCheckStatus; 
            private String connectorId; 
            private String connectorName; 
            private String connectorStatus; 
            private String createTime; 
            private java.util.List<String> groupUuids; 
            private String memberUid; 
            private String primaryVswitchId; 
            private String primaryVswitchIp; 
            private String primaryVswitchZoneId; 
            private String regionNo; 
            private String standbyVswitchId; 
            private String standbyVswitchIp; 
            private String standbyVswitchZoneId; 
            private Integer ttl; 
            private String unhealthyReason; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(AckClusterConnectors model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.connectorHealthCheckStatus = model.connectorHealthCheckStatus;
                this.connectorId = model.connectorId;
                this.connectorName = model.connectorName;
                this.connectorStatus = model.connectorStatus;
                this.createTime = model.createTime;
                this.groupUuids = model.groupUuids;
                this.memberUid = model.memberUid;
                this.primaryVswitchId = model.primaryVswitchId;
                this.primaryVswitchIp = model.primaryVswitchIp;
                this.primaryVswitchZoneId = model.primaryVswitchZoneId;
                this.regionNo = model.regionNo;
                this.standbyVswitchId = model.standbyVswitchId;
                this.standbyVswitchIp = model.standbyVswitchIp;
                this.standbyVswitchZoneId = model.standbyVswitchZoneId;
                this.ttl = model.ttl;
                this.unhealthyReason = model.unhealthyReason;
                this.vpcId = model.vpcId;
            } 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ConnectorHealthCheckStatus.
             */
            public Builder connectorHealthCheckStatus(String connectorHealthCheckStatus) {
                this.connectorHealthCheckStatus = connectorHealthCheckStatus;
                return this;
            }

            /**
             * ConnectorId.
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * ConnectorName.
             */
            public Builder connectorName(String connectorName) {
                this.connectorName = connectorName;
                return this;
            }

            /**
             * ConnectorStatus.
             */
            public Builder connectorStatus(String connectorStatus) {
                this.connectorStatus = connectorStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * GroupUuids.
             */
            public Builder groupUuids(java.util.List<String> groupUuids) {
                this.groupUuids = groupUuids;
                return this;
            }

            /**
             * MemberUid.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * PrimaryVswitchId.
             */
            public Builder primaryVswitchId(String primaryVswitchId) {
                this.primaryVswitchId = primaryVswitchId;
                return this;
            }

            /**
             * PrimaryVswitchIp.
             */
            public Builder primaryVswitchIp(String primaryVswitchIp) {
                this.primaryVswitchIp = primaryVswitchIp;
                return this;
            }

            /**
             * PrimaryVswitchZoneId.
             */
            public Builder primaryVswitchZoneId(String primaryVswitchZoneId) {
                this.primaryVswitchZoneId = primaryVswitchZoneId;
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
             * StandbyVswitchId.
             */
            public Builder standbyVswitchId(String standbyVswitchId) {
                this.standbyVswitchId = standbyVswitchId;
                return this;
            }

            /**
             * StandbyVswitchIp.
             */
            public Builder standbyVswitchIp(String standbyVswitchIp) {
                this.standbyVswitchIp = standbyVswitchIp;
                return this;
            }

            /**
             * StandbyVswitchZoneId.
             */
            public Builder standbyVswitchZoneId(String standbyVswitchZoneId) {
                this.standbyVswitchZoneId = standbyVswitchZoneId;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * UnhealthyReason.
             */
            public Builder unhealthyReason(String unhealthyReason) {
                this.unhealthyReason = unhealthyReason;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AckClusterConnectors build() {
                return new AckClusterConnectors(this);
            } 

        } 

    }
}
