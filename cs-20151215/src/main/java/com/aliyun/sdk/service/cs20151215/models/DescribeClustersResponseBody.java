// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersResponseBody</p>
 */
public class DescribeClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("clusters")
    private java.util.List < Clusters> clusters;

    private DescribeClustersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.clusters = builder.clusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return clusters
     */
    public java.util.List < Clusters> getClusters() {
        return this.clusters;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Clusters> clusters; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of cluster details.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        public DescribeClustersResponseBody build() {
            return new DescribeClustersResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The name of the cluster tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the cluster.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Clusters extends TeaModel {
        @NameInMap("created")
        private String created;

        @NameInMap("security_group_id")
        private String securityGroupId;

        @NameInMap("docker_version")
        private String dockerVersion;

        @NameInMap("master_url")
        private String masterUrl;

        @NameInMap("meta_data")
        private String metaData;

        @NameInMap("cluster_id")
        private String clusterId;

        @NameInMap("external_loadbalancer_id")
        private String externalLoadbalancerId;

        @NameInMap("network_mode")
        private String networkMode;

        @NameInMap("zone_id")
        private String zoneId;

        @NameInMap("deletion_protection")
        private Boolean deletionProtection;

        @NameInMap("current_version")
        private String currentVersion;

        @NameInMap("updated")
        private String updated;

        @NameInMap("resource_group_id")
        private String resourceGroupId;

        @NameInMap("cluster_type")
        private String clusterType;

        @NameInMap("region_id")
        private String regionId;

        @NameInMap("vpc_id")
        private String vpcId;

        @NameInMap("data_disk_size")
        private Integer dataDiskSize;

        @NameInMap("state")
        private String state;

        @NameInMap("size")
        private Integer size;

        @NameInMap("vswitch_id")
        private String vswitchId;

        @NameInMap("vswitch_cidr")
        private String vswitchCidr;

        @NameInMap("name")
        private String name;

        @NameInMap("data_disk_category")
        private String dataDiskCategory;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        private Clusters(Builder builder) {
            this.created = builder.created;
            this.securityGroupId = builder.securityGroupId;
            this.dockerVersion = builder.dockerVersion;
            this.masterUrl = builder.masterUrl;
            this.metaData = builder.metaData;
            this.clusterId = builder.clusterId;
            this.externalLoadbalancerId = builder.externalLoadbalancerId;
            this.networkMode = builder.networkMode;
            this.zoneId = builder.zoneId;
            this.deletionProtection = builder.deletionProtection;
            this.currentVersion = builder.currentVersion;
            this.updated = builder.updated;
            this.resourceGroupId = builder.resourceGroupId;
            this.clusterType = builder.clusterType;
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
            this.dataDiskSize = builder.dataDiskSize;
            this.state = builder.state;
            this.size = builder.size;
            this.vswitchId = builder.vswitchId;
            this.vswitchCidr = builder.vswitchCidr;
            this.name = builder.name;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return dockerVersion
         */
        public String getDockerVersion() {
            return this.dockerVersion;
        }

        /**
         * @return masterUrl
         */
        public String getMasterUrl() {
            return this.masterUrl;
        }

        /**
         * @return metaData
         */
        public String getMetaData() {
            return this.metaData;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return externalLoadbalancerId
         */
        public String getExternalLoadbalancerId() {
            return this.externalLoadbalancerId;
        }

        /**
         * @return networkMode
         */
        public String getNetworkMode() {
            return this.networkMode;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return dataDiskSize
         */
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return vswitchCidr
         */
        public String getVswitchCidr() {
            return this.vswitchCidr;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String created; 
            private String securityGroupId; 
            private String dockerVersion; 
            private String masterUrl; 
            private String metaData; 
            private String clusterId; 
            private String externalLoadbalancerId; 
            private String networkMode; 
            private String zoneId; 
            private Boolean deletionProtection; 
            private String currentVersion; 
            private String updated; 
            private String resourceGroupId; 
            private String clusterType; 
            private String regionId; 
            private String vpcId; 
            private Integer dataDiskSize; 
            private String state; 
            private Integer size; 
            private String vswitchId; 
            private String vswitchCidr; 
            private String name; 
            private String dataDiskCategory; 
            private java.util.List < Tags> tags; 

            /**
             * The time when the cluster was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * The ID of the cluster security group.
             * <p>
             * 
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The Docker version used by the cluster.
             */
            public Builder dockerVersion(String dockerVersion) {
                this.dockerVersion = dockerVersion;
                return this;
            }

            /**
             * The endpoint of the cluster. Valid values: api_server_endpoint, dashboard_endpoint, mirana_endpoint, reverse_tunnel_endpoint, and intranet_api_server_endpoint. For more information, see [SSH access Kubernetes cluster](~~ 86491 ~~).
             */
            public Builder masterUrl(String masterUrl) {
                this.masterUrl = masterUrl;
                return this;
            }

            /**
             * The metadata of the cluster.
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The ID of the SLB service.
             */
            public Builder externalLoadbalancerId(String externalLoadbalancerId) {
                this.externalLoadbalancerId = externalLoadbalancerId;
                return this;
            }

            /**
             * Cluster network mode (VPC: vpc).
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * The ID of the Zone in the region where the cluster is located.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * Specifies whether to enable cluster deletion protection to prevent accidental deletion of clusters through the console or api operations.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * The current version of the cluster.
             * <p>
             * 
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The last update time.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * The ID of the cluster resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the cluster.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The region ID of the cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The size of the data disk. Unit: GB.
             */
            public Builder dataDiskSize(Integer dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
                return this;
            }

            /**
             * The status of the cluster. running indicates running, and filed and stoped indicates abnormal.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The number of nodes.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The ID of the VSwitch (VSwitch).
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * The network prefix of the VSwitch (VSwitch).
             */
            public Builder vswitchCidr(String vswitchCidr) {
                this.vswitchCidr = vswitchCidr;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The data disk type.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * The tag of the cluster.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
