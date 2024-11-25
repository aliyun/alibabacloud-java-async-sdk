// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
    private java.util.List < Clusters> clusters;

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

    /**
     * @return clusters
     */
    public java.util.List < Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static final class Builder {
        private java.util.List < Clusters> clusters; 
        private PageInfo pageInfo; 

        /**
         * clusters.
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * page_info.
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
        private java.util.List < Tag > tags;

        @com.aliyun.core.annotation.NameInMap("timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("updated")
        private String updated;

        @com.aliyun.core.annotation.NameInMap("vpc_id")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vswitch_ids")
        private java.util.List < String > vswitchIds;

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
        public java.util.List < Tag > getTags() {
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
        public java.util.List < String > getVswitchIds() {
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
            private java.util.List < Tag > tags; 
            private String timezone; 
            private String updated; 
            private String vpcId; 
            private java.util.List < String > vswitchIds; 

            /**
             * cluster_domain.
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * cluster_spec.
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * cluster_type.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * container_cidr.
             */
            public Builder containerCidr(String containerCidr) {
                this.containerCidr = containerCidr;
                return this;
            }

            /**
             * created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * current_version.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * deletion_protection.
             */
            public Builder deletionProtection(Boolean deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * init_version.
             */
            public Builder initVersion(String initVersion) {
                this.initVersion = initVersion;
                return this;
            }

            /**
             * ip_stack.
             */
            public Builder ipStack(String ipStack) {
                this.ipStack = ipStack;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * next_version.
             */
            public Builder nextVersion(String nextVersion) {
                this.nextVersion = nextVersion;
                return this;
            }

            /**
             * profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * proxy_mode.
             */
            public Builder proxyMode(String proxyMode) {
                this.proxyMode = proxyMode;
                return this;
            }

            /**
             * region_id.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * resource_group_id.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * security_group_id.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
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
             * size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * vpc_id.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vswitch_ids.
             */
            public Builder vswitchIds(java.util.List < String > vswitchIds) {
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

            /**
             * page_number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_count.
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
