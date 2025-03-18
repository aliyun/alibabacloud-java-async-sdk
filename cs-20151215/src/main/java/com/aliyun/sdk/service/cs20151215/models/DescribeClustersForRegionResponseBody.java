// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeClustersForRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersForRegionResponseBody</p>
 */
public class DescribeClustersForRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusters")
    private java.util.List<Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("page_info")
    private PageInfo pageInfo;

    private DescribeClustersForRegionResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.pageInfo = builder.pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersForRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public java.util.List<Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static final class Builder {
        private java.util.List<Clusters> clusters; 
        private PageInfo pageInfo; 

        private Builder() {
        } 

        private Builder(DescribeClustersForRegionResponseBody model) {
            this.clusters = model.clusters;
            this.pageInfo = model.pageInfo;
        } 

        /**
         * <p>The information about the clusters returned.</p>
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The pagination details.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeClustersForRegionResponseBody build() {
            return new DescribeClustersForRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClustersForRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersForRegionResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_domain")
        private String clusterDomain;

        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("cluster_spec")
        private String clusterSpec;

        @com.aliyun.core.annotation.NameInMap("cluster_type")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("container_cidr")
        private String containerCidr;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("current_version")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("deletion_protection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("init_version")
        private String initVersion;

        @com.aliyun.core.annotation.NameInMap("ip_stack")
        private String ipStack;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("next_version")
        private String nextVersion;

        @com.aliyun.core.annotation.NameInMap("profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("proxy_mode")
        private String proxyMode;

        @com.aliyun.core.annotation.NameInMap("region_id")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resource_group_id")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("security_group_id")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("service_cidr")
        @com.aliyun.core.annotation.Validation(required = true)
        private String serviceCidr;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tag> tags;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("updated")
        private String updated;

        @com.aliyun.core.annotation.NameInMap("vpc_id")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vswitch_ids")
        private java.util.List<String> vswitchIds;

        private Clusters(Builder builder) {
            this.clusterDomain = builder.clusterDomain;
            this.clusterId = builder.clusterId;
            this.clusterSpec = builder.clusterSpec;
            this.clusterType = builder.clusterType;
            this.containerCidr = builder.containerCidr;
            this.created = builder.created;
            this.currentVersion = builder.currentVersion;
            this.deletionProtection = builder.deletionProtection;
            this.initVersion = builder.initVersion;
            this.ipStack = builder.ipStack;
            this.name = builder.name;
            this.nextVersion = builder.nextVersion;
            this.profile = builder.profile;
            this.proxyMode = builder.proxyMode;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupId = builder.securityGroupId;
            this.serviceCidr = builder.serviceCidr;
            this.size = builder.size;
            this.state = builder.state;
            this.tags = builder.tags;
            this.timezone = builder.timezone;
            this.updated = builder.updated;
            this.vpcId = builder.vpcId;
            this.vswitchIds = builder.vswitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterDomain
         */
        public String getClusterDomain() {
            return this.clusterDomain;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterSpec
         */
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return containerCidr
         */
        public String getContainerCidr() {
            return this.containerCidr;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return initVersion
         */
        public String getInitVersion() {
            return this.initVersion;
        }

        /**
         * @return ipStack
         */
        public String getIpStack() {
            return this.ipStack;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextVersion
         */
        public String getNextVersion() {
            return this.nextVersion;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return proxyMode
         */
        public String getProxyMode() {
            return this.proxyMode;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return serviceCidr
         */
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tags
         */
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchIds
         */
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public static final class Builder {
            private String clusterDomain; 
            private String clusterId; 
            private String clusterSpec; 
            private String clusterType; 
            private String containerCidr; 
            private String created; 
            private String currentVersion; 
            private Boolean deletionProtection; 
            private String initVersion; 
            private String ipStack; 
            private String name; 
            private String nextVersion; 
            private String profile; 
            private String proxyMode; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityGroupId; 
            private String serviceCidr; 
            private Long size; 
            private String state; 
            private java.util.List<Tag> tags; 
            private String timezone; 
            private String updated; 
            private String vpcId; 
            private java.util.List<String> vswitchIds; 

            private Builder() {
            } 

            private Builder(Clusters model) {
                this.clusterDomain = model.clusterDomain;
                this.clusterId = model.clusterId;
                this.clusterSpec = model.clusterSpec;
                this.clusterType = model.clusterType;
                this.containerCidr = model.containerCidr;
                this.created = model.created;
                this.currentVersion = model.currentVersion;
                this.deletionProtection = model.deletionProtection;
                this.initVersion = model.initVersion;
                this.ipStack = model.ipStack;
                this.name = model.name;
                this.nextVersion = model.nextVersion;
                this.profile = model.profile;
                this.proxyMode = model.proxyMode;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.securityGroupId = model.securityGroupId;
                this.serviceCidr = model.serviceCidr;
                this.size = model.size;
                this.state = model.state;
                this.tags = model.tags;
                this.timezone = model.timezone;
                this.updated = model.updated;
                this.vpcId = model.vpcId;
                this.vswitchIds = model.vswitchIds;
            } 

            /**
             * <p>The domain name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster.local</p>
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c905d1364c2dd4b6284a3f41790c4****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The types of ACK managed clusters:</p>
             * <ul>
             * <li>ack.pro.small: ACK Pro cluster</li>
             * <li>ack.standard: ACK Basic cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ack.standard</p>
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li>Kubernetes: ACK dedicated cluster</li>
             * <li>ManagedKubernetes: ACK managed clusters. ACK managed clusters include ACK Basic clusters, ACK Pro clusters, ACK Serverless Basic clusters, ACK Serverless Pro clusters, ACK Edge Basic clusters, ACK Edge Pro clusters, and ACK Lingjun Pro clusters.</li>
             * <li>ExternalKubernetes: registered cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManagedKubernetes</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The CIDR block of pods in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>172.20.0.0/16</p>
             */
            public Builder containerCidr(String containerCidr) {
                this.containerCidr = containerCidr;
                return this;
            }

            /**
             * <p>The time at which the instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-01T20:40:40+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The current Kubernetes version of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1.16.6-aliyun.1</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>Specifies whether to enable cluster deletion protection. If you enable this option, the cluster cannot be deleted in the console or by calling API operations. You can obtain the terminal ID by calling one of the following operations:</p>
             * <ul>
             * <li>true: enables deletion protection for the cluster. This way, the cluster cannot be deleted in the ACK console or by calling API operations.</li>
             * <li>false: disables deletion protection for the cluster. This way, the cluster can be deleted in the ACK console or by calling API operations.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * <p>The initial Kubernetes version of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1.16.6-aliyun.1</p>
             */
            public Builder initVersion(String initVersion) {
                this.initVersion = initVersion;
                return this;
            }

            /**
             * <p>The IP protocol stack of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder ipStack(String ipStack) {
                this.ipStack = ipStack;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test-cluster</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Kubernetes version to which the cluster can be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1.18.8-aliyun.1</p>
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            /**
             * <p>The subtype of the clusters. Valid values:</p>
             * <ul>
             * <li>Default: ACK managed clusters. ACK managed clusters include ACK Basic clusters and ACK Pro clusters.</li>
             * <li>Edge: ACK Edge clusters. ACK Edge clusters include ACK Edge Basic clusters and ACK Edge Pro clusters.</li>
             * <li>Serverless: ACK Serverless clusters. ACK Serverless clusters include ACK Serverless Basic clusters and ACK Serverless Pro clusters.</li>
             * <li>Lingjun: ACK Lingjun Pro clusters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The kube-proxy mode of the cluster.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>iptables: iptables.</li>
             * <li>ipvs: ipvs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ipvs</p>
             */
            public Builder proxyMode(String proxyMode) {
                this.proxyMode = proxyMode;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-a</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the cluster resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmyvw3wjm****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the security group of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2zeihch86ooz9io4****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The CIDR block of the service network.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>172.21.0.0/20</p>
             */
            public Builder serviceCidr(String serviceCidr) {
                this.serviceCidr = serviceCidr;
                return this;
            }

            /**
             * <p>The number of nodes in the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>initial: The cluster is being created.</li>
             * <li>failed: The cluster failed to be created.</li>
             * <li>running: The cluster is running.</li>
             * <li>Upgrading: The cluster is being updated.</li>
             * <li>scaling: The cluster is being scaled.</li>
             * <li>waiting: The cluster is waiting for connection requests.</li>
             * <li>disconnected: The cluster is disconnected.</li>
             * <li>inactive: The cluster is inactive.</li>
             * <li>unavailable: The cluster is unavailable.</li>
             * <li>deleting: The cluster is being deleted.</li>
             * <li>deleted: The ACK cluster is deleted.</li>
             * <li>delete_failed: The cluster failed to be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The list of cluster tags.</p>
             */
            public Builder tags(java.util.List<Tag> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The time when the cluster was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-08T15:37:00+08:00</p>
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zeg8nf1ukc0fcmvq****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The list of vSwitches on the control plane of the cluster.</p>
             */
            public Builder vswitchIds(java.util.List<String> vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeClustersForRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClustersForRegionResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page_number")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of records on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
