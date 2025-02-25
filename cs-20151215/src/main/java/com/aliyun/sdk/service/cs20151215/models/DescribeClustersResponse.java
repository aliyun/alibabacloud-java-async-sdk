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
 * {@link DescribeClustersResponse} extends {@link TeaModel}
 *
 * <p>DescribeClustersResponse</p>
 */
public class DescribeClustersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<DescribeClustersResponseBody> body;

    private DescribeClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeClustersResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<DescribeClustersResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClustersResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<DescribeClustersResponseBody> body);

        @Override
        DescribeClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClustersResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<DescribeClustersResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClustersResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<DescribeClustersResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClustersResponse build() {
            return new DescribeClustersResponse(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClustersResponse} extends {@link TeaModel}
     *
     * <p>DescribeClustersResponse</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
    /**
     * 
     * {@link DescribeClustersResponse} extends {@link TeaModel}
     *
     * <p>DescribeClustersResponse</p>
     */
    public static class DescribeClustersResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster_id")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("cluster_type")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("current_version")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("data_disk_category")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("data_disk_size")
        private Long dataDiskSize;

        @com.aliyun.core.annotation.NameInMap("deletion_protection")
        private Boolean deletionProtection;

        @com.aliyun.core.annotation.NameInMap("docker_version")
        private String dockerVersion;

        @com.aliyun.core.annotation.NameInMap("external_loadbalancer_id")
        private String externalLoadbalancerId;

        @com.aliyun.core.annotation.NameInMap("init_version")
        private String initVersion;

        @com.aliyun.core.annotation.NameInMap("master_url")
        private String masterUrl;

        @com.aliyun.core.annotation.NameInMap("meta_data")
        private String metaData;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("network_mode")
        private String networkMode;

        @com.aliyun.core.annotation.NameInMap("private_zone")
        private Boolean privateZone;

        @com.aliyun.core.annotation.NameInMap("profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("region_id")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("resource_group_id")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("security_group_id")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("subnet_cidr")
        private String subnetCidr;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("updated")
        private String updated;

        @com.aliyun.core.annotation.NameInMap("vpc_id")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vswitch_cidr")
        private String vswitchCidr;

        @com.aliyun.core.annotation.NameInMap("vswitch_id")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("worker_ram_role_name")
        private String workerRamRoleName;

        @com.aliyun.core.annotation.NameInMap("zone_id")
        private String zoneId;

        private DescribeClustersResponseBody(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.created = builder.created;
            this.currentVersion = builder.currentVersion;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.dataDiskSize = builder.dataDiskSize;
            this.deletionProtection = builder.deletionProtection;
            this.dockerVersion = builder.dockerVersion;
            this.externalLoadbalancerId = builder.externalLoadbalancerId;
            this.initVersion = builder.initVersion;
            this.masterUrl = builder.masterUrl;
            this.metaData = builder.metaData;
            this.name = builder.name;
            this.networkMode = builder.networkMode;
            this.privateZone = builder.privateZone;
            this.profile = builder.profile;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityGroupId = builder.securityGroupId;
            this.size = builder.size;
            this.state = builder.state;
            this.subnetCidr = builder.subnetCidr;
            this.tags = builder.tags;
            this.updated = builder.updated;
            this.vpcId = builder.vpcId;
            this.vswitchCidr = builder.vswitchCidr;
            this.vswitchId = builder.vswitchId;
            this.workerRamRoleName = builder.workerRamRoleName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeClustersResponseBody create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
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
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return dataDiskSize
         */
        public Long getDataDiskSize() {
            return this.dataDiskSize;
        }

        /**
         * @return deletionProtection
         */
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return dockerVersion
         */
        public String getDockerVersion() {
            return this.dockerVersion;
        }

        /**
         * @return externalLoadbalancerId
         */
        public String getExternalLoadbalancerId() {
            return this.externalLoadbalancerId;
        }

        /**
         * @return initVersion
         */
        public String getInitVersion() {
            return this.initVersion;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkMode
         */
        public String getNetworkMode() {
            return this.networkMode;
        }

        /**
         * @return privateZone
         */
        public Boolean getPrivateZone() {
            return this.privateZone;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
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
         * @return subnetCidr
         */
        public String getSubnetCidr() {
            return this.subnetCidr;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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
         * @return vswitchCidr
         */
        public String getVswitchCidr() {
            return this.vswitchCidr;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return workerRamRoleName
         */
        public String getWorkerRamRoleName() {
            return this.workerRamRoleName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterType; 
            private String created; 
            private String currentVersion; 
            private String dataDiskCategory; 
            private Long dataDiskSize; 
            private Boolean deletionProtection; 
            private String dockerVersion; 
            private String externalLoadbalancerId; 
            private String initVersion; 
            private String masterUrl; 
            private String metaData; 
            private String name; 
            private String networkMode; 
            private Boolean privateZone; 
            private String profile; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityGroupId; 
            private Long size; 
            private String state; 
            private String subnetCidr; 
            private java.util.List<Tags> tags; 
            private String updated; 
            private String vpcId; 
            private String vswitchCidr; 
            private String vswitchId; 
            private String workerRamRoleName; 
            private String zoneId; 

            /**
             * cluster_id.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
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
             * data_disk_category.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * data_disk_size.
             */
            public Builder dataDiskSize(Long dataDiskSize) {
                this.dataDiskSize = dataDiskSize;
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
             * docker_version.
             */
            public Builder dockerVersion(String dockerVersion) {
                this.dockerVersion = dockerVersion;
                return this;
            }

            /**
             * external_loadbalancer_id.
             */
            public Builder externalLoadbalancerId(String externalLoadbalancerId) {
                this.externalLoadbalancerId = externalLoadbalancerId;
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
             * master_url.
             */
            public Builder masterUrl(String masterUrl) {
                this.masterUrl = masterUrl;
                return this;
            }

            /**
             * meta_data.
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
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
             * network_mode.
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * private_zone.
             */
            public Builder privateZone(Boolean privateZone) {
                this.privateZone = privateZone;
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
             * subnet_cidr.
             */
            public Builder subnetCidr(String subnetCidr) {
                this.subnetCidr = subnetCidr;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
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
             * vswitch_cidr.
             */
            public Builder vswitchCidr(String vswitchCidr) {
                this.vswitchCidr = vswitchCidr;
                return this;
            }

            /**
             * vswitch_id.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * worker_ram_role_name.
             */
            public Builder workerRamRoleName(String workerRamRoleName) {
                this.workerRamRoleName = workerRamRoleName;
                return this;
            }

            /**
             * zone_id.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DescribeClustersResponseBody build() {
                return new DescribeClustersResponseBody(this);
            } 

        } 

    }
}
