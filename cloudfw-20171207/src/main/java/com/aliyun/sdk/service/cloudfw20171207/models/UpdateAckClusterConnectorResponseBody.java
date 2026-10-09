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
 * {@link UpdateAckClusterConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAckClusterConnectorResponseBody</p>
 */
public class UpdateAckClusterConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AckClusterConnector")
    private AckClusterConnector ackClusterConnector;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAckClusterConnectorResponseBody(Builder builder) {
        this.ackClusterConnector = builder.ackClusterConnector;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAckClusterConnectorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ackClusterConnector
     */
    public AckClusterConnector getAckClusterConnector() {
        return this.ackClusterConnector;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AckClusterConnector ackClusterConnector; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateAckClusterConnectorResponseBody model) {
            this.ackClusterConnector = model.ackClusterConnector;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ACK cluster connector.</p>
         */
        public Builder ackClusterConnector(AckClusterConnector ackClusterConnector) {
            this.ackClusterConnector = ackClusterConnector;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5D16AADE-DA2E-5CAB-AA3B-AA197D97****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAckClusterConnectorResponseBody build() {
            return new UpdateAckClusterConnectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAckClusterConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAckClusterConnectorResponseBody</p>
     */
    public static class AckClusterConnector extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AckClusterConnector(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.connectorHealthCheckStatus = builder.connectorHealthCheckStatus;
            this.connectorId = builder.connectorId;
            this.connectorName = builder.connectorName;
            this.connectorStatus = builder.connectorStatus;
            this.createTime = builder.createTime;
            this.memberUid = builder.memberUid;
            this.primaryVswitchId = builder.primaryVswitchId;
            this.primaryVswitchIp = builder.primaryVswitchIp;
            this.primaryVswitchZoneId = builder.primaryVswitchZoneId;
            this.regionNo = builder.regionNo;
            this.standbyVswitchId = builder.standbyVswitchId;
            this.standbyVswitchIp = builder.standbyVswitchIp;
            this.standbyVswitchZoneId = builder.standbyVswitchZoneId;
            this.ttl = builder.ttl;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AckClusterConnector create() {
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
            private String memberUid; 
            private String primaryVswitchId; 
            private String primaryVswitchIp; 
            private String primaryVswitchZoneId; 
            private String regionNo; 
            private String standbyVswitchId; 
            private String standbyVswitchIp; 
            private String standbyVswitchZoneId; 
            private Integer ttl; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(AckClusterConnector model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.connectorHealthCheckStatus = model.connectorHealthCheckStatus;
                this.connectorId = model.connectorId;
                this.connectorName = model.connectorName;
                this.connectorStatus = model.connectorStatus;
                this.createTime = model.createTime;
                this.memberUid = model.memberUid;
                this.primaryVswitchId = model.primaryVswitchId;
                this.primaryVswitchIp = model.primaryVswitchIp;
                this.primaryVswitchZoneId = model.primaryVswitchZoneId;
                this.regionNo = model.regionNo;
                this.standbyVswitchId = model.standbyVswitchId;
                this.standbyVswitchIp = model.standbyVswitchIp;
                this.standbyVswitchZoneId = model.standbyVswitchZoneId;
                this.ttl = model.ttl;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the ACK cluster. You can call the <a href="~~DescribeAckClusters~~">DescribeAckClusters</a> operation to query the list of ACK clusters.</p>
             * <ul>
             * <li><a href="~~DescribeAckClusters~~">DescribeAckClusters</a>: Queries a list of ACK clusters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>c57ecf39ff32c415e8549a7df27a7e947</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-cluster-name</p>
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
             * <p>The ID of the ACK cluster connector. You can call the <a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a> operation to query the list of ACK cluster connectors.</p>
             * <ul>
             * <li><a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a>: Queries a list of ACK cluster connectors.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ac-7c1bad6c3cc84c33baab</p>
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * <p>The name of the ACK cluster connector. The name must be 1 to 64 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
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
             * <p>The UNIX timestamp when the ACK cluster connector was created. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1724982259</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID (UID) of the account to which the ACK cluster resources belong.</p>
             * 
             * <strong>example:</strong>
             * <p>135809047715****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The primary vSwitch of the ACK cluster connector. You can call the <a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a> operation to query the list of vSwitches for synchronization nodes.</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Queries a list of vSwitches for synchronization nodes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-2zerfbbje7dvnbii2****</p>
             */
            public Builder primaryVswitchId(String primaryVswitchId) {
                this.primaryVswitchId = primaryVswitchId;
                return this;
            }

            /**
             * <p>The IP address of the primary vSwitch for the ACK cluster connector.</p>
             * 
             * <strong>example:</strong>
             * <p>10.100.1.1</p>
             */
            public Builder primaryVswitchIp(String primaryVswitchIp) {
                this.primaryVswitchIp = primaryVswitchIp;
                return this;
            }

            /**
             * <p>The zone of the primary vSwitch for the ACK cluster connector. You can call the <a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a> operation to query the list of zones for synchronization nodes.</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a>: Queries in batches the list of zones for the vSwitches of sync nodes.</li>
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
             * <p>The region ID of the ACK cluster connector. You can call the <a href="~~DescribeAccessInstanceRegionList~~">DescribeAccessInstanceRegionList</a> operation to query the list of regions for synchronization nodes.</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceRegionList~~">DescribeAccessInstanceRegionList</a>: Queries the list of sync node regions.</li>
             * </ul>
             * <blockquote>
             * <p>For more information about the regions that Cloud Firewall supports for ACK cluster connectors, see <a href="https://help.aliyun.com/document_detail/2865120.html">ACK cluster synchronization nodes</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The standby vSwitch of the ACK cluster connector. You can call the <a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a> operation to query the list of vSwitches for synchronization nodes.</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceVSwitchList~~">DescribeAccessInstanceVSwitchList</a>: Batch queries the list of vSwitches for synchronization nodes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze2gtlfozrab01cfo****</p>
             */
            public Builder standbyVswitchId(String standbyVswitchId) {
                this.standbyVswitchId = standbyVswitchId;
                return this;
            }

            /**
             * <p>The IP address of the standby vSwitch for the ACK cluster connector.</p>
             * 
             * <strong>example:</strong>
             * <p>10.100.2.1</p>
             */
            public Builder standbyVswitchIp(String standbyVswitchIp) {
                this.standbyVswitchIp = standbyVswitchIp;
                return this;
            }

            /**
             * <p>The zone of the standby vSwitch for the ACK cluster connector. You can call the <a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a> operation to query the list of zones for synchronization nodes.</p>
             * <ul>
             * <li><a href="~~DescribeAccessInstanceZoneList~~">DescribeAccessInstanceZoneList</a>: Batch queries the list of zones for the vSwitches of synchronization nodes.</li>
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
             * <p>The synchronization interval for the ACK cluster connector. Valid values: 2 to 60. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the ACK cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-j6cvhdscntzuvr0x****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AckClusterConnector build() {
                return new AckClusterConnector(this);
            } 

        } 

    }
}
