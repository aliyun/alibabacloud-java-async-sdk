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
         * <p>The list of ACK cluster connectors.</p>
         */
        public Builder ackClusterConnectors(java.util.List<AckClusterConnectors> ackClusterConnectors) {
            this.ackClusterConnectors = ackClusterConnectors;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7F333E0-7B70-54DA-A307-4B2B49DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
             * <p>The ACK cluster ID. You can call the following operation to obtain the value:</p>
             * <ul>
             * <li><a href="~~DescribeAckClusters~~">DescribeAckClusters</a>: Queries a list of ACK clusters in batches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>f9b9815a5280****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>TestClusterA</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The health check status of the ACK cluster connector.</p>
             * 
             * <strong>example:</strong>
             * <p>healthy</p>
             */
            public Builder connectorHealthCheckStatus(String connectorHealthCheckStatus) {
                this.connectorHealthCheckStatus = connectorHealthCheckStatus;
                return this;
            }

            /**
             * <p>The ID of the ACK cluster connector.</p>
             * 
             * <strong>example:</strong>
             * <p>ac-7c1bad6c3cc84c33baab</p>
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * <p>The name of the ACK cluster connector. The name must be 1 to 64 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>ack-cluster-connector-name</p>
             */
            public Builder connectorName(String connectorName) {
                this.connectorName = connectorName;
                return this;
            }

            /**
             * <p>The instance status of the ACK cluster connector.</p>
             * 
             * <strong>example:</strong>
             * <p>ready</p>
             */
            public Builder connectorStatus(String connectorStatus) {
                this.connectorStatus = connectorStatus;
                return this;
            }

            /**
             * <p>The timestamp when the ACK cluster connector was created. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1760493347</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The list of address book UUIDs created on the ACK cluster connector.</p>
             */
            public Builder groupUuids(java.util.List<String> groupUuids) {
                this.groupUuids = groupUuids;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the account to which the ACK cluster resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>159663371500****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The primary vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Queries the list of synchronization node vSwitches in batches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze2gtlfozrab01cfo****</p>
             */
            public Builder primaryVswitchId(String primaryVswitchId) {
                this.primaryVswitchId = primaryVswitchId;
                return this;
            }

            /**
             * <p>The IP address of the primary vSwitch of the ACK cluster connector.</p>
             * 
             * <strong>example:</strong>
             * <p>10.100.2.XXX</p>
             */
            public Builder primaryVswitchIp(String primaryVswitchIp) {
                this.primaryVswitchIp = primaryVswitchIp;
                return this;
            }

            /**
             * <p>The zone of the primary vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a>: Queries the list of synchronization node vSwitch zones in batches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-g</p>
             */
            public Builder primaryVswitchZoneId(String primaryVswitchZoneId) {
                this.primaryVswitchZoneId = primaryVswitchZoneId;
                return this;
            }

            /**
             * <p>The region ID of the ACK cluster connector. You can call the following operation to obtain the value:</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceRegionList~~">DescribeAccessInstanceRegionList</a>: Queries the list of synchronization node regions.</li>
             * </ul>
             * <blockquote>
             * <p>For more information about the regions supported by ACK cluster connectors in Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/2865120.html">ACK cluster synchronization nodes</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The standby vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Queries the list of synchronization node vSwitches in batches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zerfbbje7dvnbii2****</p>
             */
            public Builder standbyVswitchId(String standbyVswitchId) {
                this.standbyVswitchId = standbyVswitchId;
                return this;
            }

            /**
             * <p>The IP address of the standby vSwitch of the ACK cluster connector.</p>
             * 
             * <strong>example:</strong>
             * <p>10.100.1.XXX</p>
             */
            public Builder standbyVswitchIp(String standbyVswitchIp) {
                this.standbyVswitchIp = standbyVswitchIp;
                return this;
            }

            /**
             * <p>The zone of the standby vSwitch of the ACK cluster connector. You can call the following operation to obtain the value:</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a>: Queries the list of synchronization node vSwitch zones in batches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-h</p>
             */
            public Builder standbyVswitchZoneId(String standbyVswitchZoneId) {
                this.standbyVswitchZoneId = standbyVswitchZoneId;
                return this;
            }

            /**
             * <p>The container synchronization cycle of the ACK cluster connector.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The reason why the ACK cluster connector is unhealthy.</p>
             * 
             * <strong>example:</strong>
             * <p>The ACK cluster status is unavailable.</p>
             */
            public Builder unhealthyReason(String unhealthyReason) {
                this.unhealthyReason = unhealthyReason;
                return this;
            }

            /**
             * <p>The instance ID of the VPC-connected instance to which the ACK cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-j6cvhdscntzuvr0x****</p>
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
