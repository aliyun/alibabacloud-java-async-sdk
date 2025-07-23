// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetClusterResponseBody model) {
            this.cluster = model.cluster;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cluster details.</p>
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Instances model) {
                this.instanceId = model.instanceId;
                this.master = model.master;
                this.nodeId = model.nodeId;
            } 

            /**
             * <p>The ID of the HSM.</p>
             * 
             * <strong>example:</strong>
             * <p>hsm-cn-g6z3v0uf****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the HSM is a master HSM. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder master(Boolean master) {
                this.master = master;
                return this;
            }

            /**
             * <p>The ID of the HSM in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Zones model) {
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf61s651p69bdgmki****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
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
    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertManaged")
        private Boolean certManaged;

        @com.aliyun.core.annotation.NameInMap("ClusterCertificate")
        private String clusterCertificate;

        @com.aliyun.core.annotation.NameInMap("ClusterCsr")
        private String clusterCsr;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterMode")
        private Integer clusterMode;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterOwnerCertificate")
        private String clusterOwnerCertificate;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("EntityCertExpireTime")
        private String entityCertExpireTime;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private java.util.List<Instances> instances;

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
        private java.util.List<Zones> zones;

        private Cluster(Builder builder) {
            this.certManaged = builder.certManaged;
            this.clusterCertificate = builder.clusterCertificate;
            this.clusterCsr = builder.clusterCsr;
            this.clusterId = builder.clusterId;
            this.clusterMode = builder.clusterMode;
            this.clusterName = builder.clusterName;
            this.clusterOwnerCertificate = builder.clusterOwnerCertificate;
            this.createTime = builder.createTime;
            this.deviceType = builder.deviceType;
            this.entityCertExpireTime = builder.entityCertExpireTime;
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
         * @return certManaged
         */
        public Boolean getCertManaged() {
            return this.certManaged;
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
         * @return clusterMode
         */
        public Integer getClusterMode() {
            return this.clusterMode;
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
         * @return entityCertExpireTime
         */
        public String getEntityCertExpireTime() {
            return this.entityCertExpireTime;
        }

        /**
         * @return instances
         */
        public java.util.List<Instances> getInstances() {
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
        public java.util.List<Zones> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private Boolean certManaged; 
            private String clusterCertificate; 
            private String clusterCsr; 
            private String clusterId; 
            private Integer clusterMode; 
            private String clusterName; 
            private String clusterOwnerCertificate; 
            private Long createTime; 
            private String deviceType; 
            private String entityCertExpireTime; 
            private java.util.List<Instances> instances; 
            private String regionId; 
            private Integer size; 
            private String status; 
            private String vpcId; 
            private String whitelist; 
            private java.util.List<Zones> zones; 

            private Builder() {
            } 

            private Builder(Cluster model) {
                this.certManaged = model.certManaged;
                this.clusterCertificate = model.clusterCertificate;
                this.clusterCsr = model.clusterCsr;
                this.clusterId = model.clusterId;
                this.clusterMode = model.clusterMode;
                this.clusterName = model.clusterName;
                this.clusterOwnerCertificate = model.clusterOwnerCertificate;
                this.createTime = model.createTime;
                this.deviceType = model.deviceType;
                this.entityCertExpireTime = model.entityCertExpireTime;
                this.instances = model.instances;
                this.regionId = model.regionId;
                this.size = model.size;
                this.status = model.status;
                this.vpcId = model.vpcId;
                this.whitelist = model.whitelist;
                this.zones = model.zones;
            } 

            /**
             * CertManaged.
             */
            public Builder certManaged(Boolean certManaged) {
                this.certManaged = certManaged;
                return this;
            }

            /**
             * <p>The cluster certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----
             * MIIDfTCCAmWgAwIBAgIJAMRqQMr5if66MA0GCSqGSIb3DQEBCwUAMFUxCzAJBgNV
             * BAYTAmNuMQswCQYDVQQIDAJ6ajELMAkGA1UEBwwCaHoxFjAUBgNVBAoMDUFsaWJh
             * YmEgQ2xvdWQxFDA****
             * -----END CERTIFICATE-----</p>
             */
            public Builder clusterCertificate(String clusterCertificate) {
                this.clusterCertificate = clusterCertificate;
                return this;
            }

            /**
             * <p>The certificate signing request (CSR) file of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE REQUEST-----\nMIIC5TCCAc0CAQAwgZ8xWTAJBgNVBAYTAlVTMAkGA1UECAwCQ0EwDQYDVQQKDAZD\nYXZpdW0wDQYDVQQLDAZOM0ZJUFMwDgYDVQQHDAdTYW5Kb3NlMBMGA1UdEQwMMTk****
             * -----END CERTIFICATE REQUEST-----</p>
             */
            public Builder clusterCsr(String clusterCsr) {
                this.clusterCsr = clusterCsr;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster-p94y1dud9ts****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster mode.</p>
             * <p>2: automatically synchronizes the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder clusterMode(Integer clusterMode) {
                this.clusterMode = clusterMode;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster_polar_****</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The self-signed certificate of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>----BEGIN CERTIFICATE-----
             * MIIDaTCCAlECAQEwDQYJKoZIhvcNAQELBQAwVTELMAkGA1UEBhMCY24xCzAJBgNV
             * BAgMAnpqMQswCQYDVQQHDAJoejEWMBQGA1UECgwNQWxpYmFiYSBDbG91ZDEUMBIG
             * A1UECwwLU2VjQ2xvdWRIc20wHhcNMjQwNzAzM****
             * -----END CERTIFICATE-----</p>
             */
            public Builder clusterOwnerCertificate(String clusterOwnerCertificate) {
                this.clusterOwnerCertificate = clusterOwnerCertificate;
                return this;
            }

            /**
             * <p>The time when the cluster was created. Unit: milliseconds. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1641275680000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>jnta</p>
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * EntityCertExpireTime.
             */
            public Builder entityCertExpireTime(String entityCertExpireTime) {
                this.entityCertExpireTime = entityCertExpireTime;
                return this;
            }

            /**
             * <p>The HSMs in the cluster.</p>
             */
            public Builder instances(java.util.List<Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * <p>The ID of the region in which the cluster resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of hardware security modules (HSMs) in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>NEW: The cluster is not initialized.</li>
             * <li>INITIALIZED: The cluster is initialized.</li>
             * <li>DELETED: The cluster is deleted.</li>
             * <li>SYNCHRONIZING: The cluster is being synchronized.</li>
             * <li>TO_DELETE: The cluster is pending deletion.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NEW</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbt0fjdm29hofvbo****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The IP address whitelist of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>130.176.XX.XX</p>
             */
            public Builder whitelist(String whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * <p>The information about the zones in which the cluster is deployed.</p>
             */
            public Builder zones(java.util.List<Zones> zones) {
                this.zones = zones;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
}
