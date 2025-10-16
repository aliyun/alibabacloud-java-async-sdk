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
 * {@link CreateAckClusterConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAckClusterConnectorResponseBody</p>
 */
public class CreateAckClusterConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AckClusterConnector")
    private AckClusterConnector ackClusterConnector;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAckClusterConnectorResponseBody(Builder builder) {
        this.ackClusterConnector = builder.ackClusterConnector;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAckClusterConnectorResponseBody create() {
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

        private Builder(CreateAckClusterConnectorResponseBody model) {
            this.ackClusterConnector = model.ackClusterConnector;
            this.requestId = model.requestId;
        } 

        /**
         * AckClusterConnector.
         */
        public Builder ackClusterConnector(AckClusterConnector ackClusterConnector) {
            this.ackClusterConnector = ackClusterConnector;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAckClusterConnectorResponseBody build() {
            return new CreateAckClusterConnectorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAckClusterConnectorResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAckClusterConnectorResponseBody</p>
     */
    public static class AckClusterConnector extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AckClientHostIp")
        private String ackClientHostIp;

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

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Integer ttl;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AckClusterConnector(Builder builder) {
            this.ackClientHostIp = builder.ackClientHostIp;
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
            this.taskId = builder.taskId;
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
         * @return ackClientHostIp
         */
        public String getAckClientHostIp() {
            return this.ackClientHostIp;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
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
            private String ackClientHostIp; 
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
            private String taskId; 
            private Integer ttl; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(AckClusterConnector model) {
                this.ackClientHostIp = model.ackClientHostIp;
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
                this.taskId = model.taskId;
                this.ttl = model.ttl;
                this.vpcId = model.vpcId;
            } 

            /**
             * AckClientHostIp.
             */
            public Builder ackClientHostIp(String ackClientHostIp) {
                this.ackClientHostIp = ackClientHostIp;
                return this;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
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
             * VpcId.
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
