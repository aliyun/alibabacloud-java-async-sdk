// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterResponseBody</p>
 */
public class GetClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cluster")
    private Cluster cluster;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClusterResponseBody(Builder builder) {
        this.cluster = builder.cluster;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return cluster
     */
    public Cluster getCluster() {
        return this.cluster;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Cluster cluster; 
        private String requestId; 

        /**
         * The information about the cluster.
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Master")
        private Boolean master;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Integer nodeId;

        private Instances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.master = builder.master;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return master
         */
        public Boolean getMaster() {
            return this.master;
        }

        /**
         * @return nodeId
         */
        public Integer getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String instanceId; 
            private Boolean master; 
            private Integer nodeId; 

            /**
             * The HSM ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the HSM is the master HSM.
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder master(Boolean master) {
                this.master = master;
                return this;
            }

            /**
             * The sequence number of the HSM in the cluster.
             */
            public Builder nodeId(Integer nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Zones(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zoneId; 

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterCertificate")
        private String clusterCertificate;

        @com.aliyun.core.annotation.NameInMap("ClusterCsr")
        private String clusterCsr;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterOwnerCertificate")
        private String clusterOwnerCertificate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List < Instances> instances;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private String whitelist;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List < Zones> zones;

        private Cluster(Builder builder) {
            this.clusterCertificate = builder.clusterCertificate;
            this.clusterCsr = builder.clusterCsr;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterOwnerCertificate = builder.clusterOwnerCertificate;
            this.createTime = builder.createTime;
            this.deviceType = builder.deviceType;
            this.instances = builder.instances;
            this.regionId = builder.regionId;
            this.size = builder.size;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.whitelist = builder.whitelist;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return clusterCertificate
         */
        public String getClusterCertificate() {
            return this.clusterCertificate;
        }

        /**
         * @return clusterCsr
         */
        public String getClusterCsr() {
            return this.clusterCsr;
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
         * @return clusterOwnerCertificate
         */
        public String getClusterOwnerCertificate() {
            return this.clusterOwnerCertificate;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return instances
         */
        public java.util.List < Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return whitelist
         */
        public String getWhitelist() {
            return this.whitelist;
        }

        /**
         * @return zones
         */
        public java.util.List < Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String clusterCertificate; 
            private String clusterCsr; 
            private String clusterId; 
            private String clusterName; 
            private String clusterOwnerCertificate; 
            private Long createTime; 
            private String deviceType; 
            private java.util.List < Instances> instances; 
            private String regionId; 
            private Integer size; 
            private String status; 
            private String vpcId; 
            private String whitelist; 
            private java.util.List < Zones> zones; 

            /**
             * The cluster certificate.
             */
            public Builder clusterCertificate(String clusterCertificate) {
                this.clusterCertificate = clusterCertificate;
                return this;
            }

            /**
             * The certificate signing request (CSR) file of the cluster.
             */
            public Builder clusterCsr(String clusterCsr) {
                this.clusterCsr = clusterCsr;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The cluster name.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The self-signed certificate of the cluster.
             */
            public Builder clusterOwnerCertificate(String clusterOwnerCertificate) {
                this.clusterOwnerCertificate = clusterOwnerCertificate;
                return this;
            }

            /**
             * The time when the cluster was created. Unit: milliseconds. The value is a UNIX timestamp.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The device type.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * The HSMs in the cluster.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The ID of the region in which the cluster resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of hardware security modules (HSMs) in the cluster.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The cluster status.
             * <p>
             * 
             * *   NEW: The cluster is not initialized.
             * *   INITIALIZED: The cluster is initialized.
             * *   DELETED: The cluster is deleted.
             * *   SYNCHRONIZING: The cluster is being synchronized.
             * *   TO_DELETE: The cluster is to be deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) to which the cluster belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The IP address whitelist of the cluster.
             */
            public Builder whitelist(String whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * The information about the zone in which the cluster is deployed.
             */
            public Builder zones(java.util.List < Zones> zones) {
                this.zones = zones;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
}
