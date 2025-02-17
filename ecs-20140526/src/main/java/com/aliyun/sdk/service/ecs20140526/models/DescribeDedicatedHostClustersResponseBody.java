// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostClustersResponseBody</p>
 */
public class DescribeDedicatedHostClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DedicatedHostClusters")
    private DedicatedHostClusters dedicatedHostClusters;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDedicatedHostClustersResponseBody(Builder builder) {
        this.dedicatedHostClusters = builder.dedicatedHostClusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedHostClusters
     */
    public DedicatedHostClusters getDedicatedHostClusters() {
        return this.dedicatedHostClusters;
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
        private DedicatedHostClusters dedicatedHostClusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>An array consisting of host group information.</p>
         */
        public Builder dedicatedHostClusters(DedicatedHostClusters dedicatedHostClusters) {
            this.dedicatedHostClusters = dedicatedHostClusters;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>214A2187-B06F-4E49-A081-4D053466A8C7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of dedicated host clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDedicatedHostClustersResponseBody build() {
            return new DescribeDedicatedHostClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class AvailableInstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceCapacity")
        private Integer availableInstanceCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private AvailableInstanceType(Builder builder) {
            this.availableInstanceCapacity = builder.availableInstanceCapacity;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableInstanceType create() {
            return builder().build();
        }

        /**
         * @return availableInstanceCapacity
         */
        public Integer getAvailableInstanceCapacity() {
            return this.availableInstanceCapacity;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Integer availableInstanceCapacity; 
            private String instanceType; 

            /**
             * <p>The available capacity of the ECS instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder availableInstanceCapacity(Integer availableInstanceCapacity) {
                this.availableInstanceCapacity = availableInstanceCapacity;
                return this;
            }

            /**
             * <p>The ECS instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.26xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public AvailableInstanceType build() {
                return new AvailableInstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class AvailableInstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceType")
        private java.util.List<AvailableInstanceType> availableInstanceType;

        private AvailableInstanceTypes(Builder builder) {
            this.availableInstanceType = builder.availableInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableInstanceTypes create() {
            return builder().build();
        }

        /**
         * @return availableInstanceType
         */
        public java.util.List<AvailableInstanceType> getAvailableInstanceType() {
            return this.availableInstanceType;
        }

        public static final class Builder {
            private java.util.List<AvailableInstanceType> availableInstanceType; 

            /**
             * AvailableInstanceType.
             */
            public Builder availableInstanceType(java.util.List<AvailableInstanceType> availableInstanceType) {
                this.availableInstanceType = availableInstanceType;
                return this;
            }

            public AvailableInstanceTypes build() {
                return new AvailableInstanceTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class LocalStorageCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableDisk")
        private Integer availableDisk;

        @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @com.aliyun.core.annotation.NameInMap("TotalDisk")
        private Integer totalDisk;

        private LocalStorageCapacity(Builder builder) {
            this.availableDisk = builder.availableDisk;
            this.dataDiskCategory = builder.dataDiskCategory;
            this.totalDisk = builder.totalDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalStorageCapacity create() {
            return builder().build();
        }

        /**
         * @return availableDisk
         */
        public Integer getAvailableDisk() {
            return this.availableDisk;
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return totalDisk
         */
        public Integer getTotalDisk() {
            return this.totalDisk;
        }

        public static final class Builder {
            private Integer availableDisk; 
            private String dataDiskCategory; 
            private Integer totalDisk; 

            /**
             * <p>The available capacity of the local disk. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder availableDisk(Integer availableDisk) {
                this.availableDisk = availableDisk;
                return this;
            }

            /**
             * <p>The category of data disks. Valid values:</p>
             * <ul>
             * <li>cloud: basic disk</li>
             * <li>cloud_efficiency: ultra disk</li>
             * <li>cloud_ssd: standard SSD</li>
             * <li>ephemeral_ssd: local SSD</li>
             * <li>cloud_essd: Enterprise SSD (ESSD)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud</p>
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * <p>The total capacity of the local disk. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder totalDisk(Integer totalDisk) {
                this.totalDisk = totalDisk;
                return this;
            }

            public LocalStorageCapacity build() {
                return new LocalStorageCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class LocalStorageCapacities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalStorageCapacity")
        private java.util.List<LocalStorageCapacity> localStorageCapacity;

        private LocalStorageCapacities(Builder builder) {
            this.localStorageCapacity = builder.localStorageCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalStorageCapacities create() {
            return builder().build();
        }

        /**
         * @return localStorageCapacity
         */
        public java.util.List<LocalStorageCapacity> getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public static final class Builder {
            private java.util.List<LocalStorageCapacity> localStorageCapacity; 

            /**
             * LocalStorageCapacity.
             */
            public Builder localStorageCapacity(java.util.List<LocalStorageCapacity> localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            public LocalStorageCapacities build() {
                return new LocalStorageCapacities(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class DedicatedHostClusterCapacity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableInstanceTypes")
        private AvailableInstanceTypes availableInstanceTypes;

        @com.aliyun.core.annotation.NameInMap("AvailableMemory")
        private Integer availableMemory;

        @com.aliyun.core.annotation.NameInMap("AvailableVcpus")
        private Integer availableVcpus;

        @com.aliyun.core.annotation.NameInMap("LocalStorageCapacities")
        private LocalStorageCapacities localStorageCapacities;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Integer totalMemory;

        @com.aliyun.core.annotation.NameInMap("TotalVcpus")
        private Integer totalVcpus;

        private DedicatedHostClusterCapacity(Builder builder) {
            this.availableInstanceTypes = builder.availableInstanceTypes;
            this.availableMemory = builder.availableMemory;
            this.availableVcpus = builder.availableVcpus;
            this.localStorageCapacities = builder.localStorageCapacities;
            this.totalMemory = builder.totalMemory;
            this.totalVcpus = builder.totalVcpus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostClusterCapacity create() {
            return builder().build();
        }

        /**
         * @return availableInstanceTypes
         */
        public AvailableInstanceTypes getAvailableInstanceTypes() {
            return this.availableInstanceTypes;
        }

        /**
         * @return availableMemory
         */
        public Integer getAvailableMemory() {
            return this.availableMemory;
        }

        /**
         * @return availableVcpus
         */
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        /**
         * @return localStorageCapacities
         */
        public LocalStorageCapacities getLocalStorageCapacities() {
            return this.localStorageCapacities;
        }

        /**
         * @return totalMemory
         */
        public Integer getTotalMemory() {
            return this.totalMemory;
        }

        /**
         * @return totalVcpus
         */
        public Integer getTotalVcpus() {
            return this.totalVcpus;
        }

        public static final class Builder {
            private AvailableInstanceTypes availableInstanceTypes; 
            private Integer availableMemory; 
            private Integer availableVcpus; 
            private LocalStorageCapacities localStorageCapacities; 
            private Integer totalMemory; 
            private Integer totalVcpus; 

            /**
             * <p>The available capacity of ECS instances in the host group.</p>
             */
            public Builder availableInstanceTypes(AvailableInstanceTypes availableInstanceTypes) {
                this.availableInstanceTypes = availableInstanceTypes;
                return this;
            }

            /**
             * <p>The size of available memory. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder availableMemory(Integer availableMemory) {
                this.availableMemory = availableMemory;
                return this;
            }

            /**
             * <p>The number of available vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder availableVcpus(Integer availableVcpus) {
                this.availableVcpus = availableVcpus;
                return this;
            }

            /**
             * <p>The local storage capacity.</p>
             */
            public Builder localStorageCapacities(LocalStorageCapacities localStorageCapacities) {
                this.localStorageCapacities = localStorageCapacities;
                return this;
            }

            /**
             * <p>The total memory size. Unit: GiB</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalMemory(Integer totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * <p>The total number of vCPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalVcpus(Integer totalVcpus) {
                this.totalVcpus = totalVcpus;
                return this;
            }

            public DedicatedHostClusterCapacity build() {
                return new DedicatedHostClusterCapacity(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class DedicatedHostIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private java.util.List<String> dedicatedHostId;

        private DedicatedHostIds(Builder builder) {
            this.dedicatedHostId = builder.dedicatedHostId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostIds create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostId
         */
        public java.util.List<String> getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public static final class Builder {
            private java.util.List<String> dedicatedHostId; 

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(java.util.List<String> dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            public DedicatedHostIds build() {
                return new DedicatedHostIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class DedicatedHostCluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterCapacity")
        private DedicatedHostClusterCapacity dedicatedHostClusterCapacity;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterName")
        private String dedicatedHostClusterName;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostIds")
        private DedicatedHostIds dedicatedHostIds;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DedicatedHostCluster(Builder builder) {
            this.dedicatedHostClusterCapacity = builder.dedicatedHostClusterCapacity;
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
            this.dedicatedHostClusterName = builder.dedicatedHostClusterName;
            this.dedicatedHostIds = builder.dedicatedHostIds;
            this.description = builder.description;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostCluster create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostClusterCapacity
         */
        public DedicatedHostClusterCapacity getDedicatedHostClusterCapacity() {
            return this.dedicatedHostClusterCapacity;
        }

        /**
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        /**
         * @return dedicatedHostClusterName
         */
        public String getDedicatedHostClusterName() {
            return this.dedicatedHostClusterName;
        }

        /**
         * @return dedicatedHostIds
         */
        public DedicatedHostIds getDedicatedHostIds() {
            return this.dedicatedHostIds;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private DedicatedHostClusterCapacity dedicatedHostClusterCapacity; 
            private String dedicatedHostClusterId; 
            private String dedicatedHostClusterName; 
            private DedicatedHostIds dedicatedHostIds; 
            private String description; 
            private String regionId; 
            private String resourceGroupId; 
            private Tags tags; 
            private String zoneId; 

            /**
             * <p>The capacity of the host group.</p>
             */
            public Builder dedicatedHostClusterCapacity(DedicatedHostClusterCapacity dedicatedHostClusterCapacity) {
                this.dedicatedHostClusterCapacity = dedicatedHostClusterCapacity;
                return this;
            }

            /**
             * <p>The ID of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>dc-bp12wlf6am0vz9v2****</p>
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * <p>The name of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>myDDHCluster</p>
             */
            public Builder dedicatedHostClusterName(String dedicatedHostClusterName) {
                this.dedicatedHostClusterName = dedicatedHostClusterName;
                return this;
            }

            /**
             * <p>The IDs of dedicated hosts in the host group.</p>
             */
            public Builder dedicatedHostIds(DedicatedHostIds dedicatedHostIds) {
                this.dedicatedHostIds = dedicatedHostIds;
                return this;
            }

            /**
             * <p>The description of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>This-is-my-DDHCluster</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The region ID of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags of the host group.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The zone ID of the host group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-f</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DedicatedHostCluster build() {
                return new DedicatedHostCluster(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDedicatedHostClustersResponseBody</p>
     */
    public static class DedicatedHostClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DedicatedHostCluster")
        private java.util.List<DedicatedHostCluster> dedicatedHostCluster;

        private DedicatedHostClusters(Builder builder) {
            this.dedicatedHostCluster = builder.dedicatedHostCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostClusters create() {
            return builder().build();
        }

        /**
         * @return dedicatedHostCluster
         */
        public java.util.List<DedicatedHostCluster> getDedicatedHostCluster() {
            return this.dedicatedHostCluster;
        }

        public static final class Builder {
            private java.util.List<DedicatedHostCluster> dedicatedHostCluster; 

            /**
             * DedicatedHostCluster.
             */
            public Builder dedicatedHostCluster(java.util.List<DedicatedHostCluster> dedicatedHostCluster) {
                this.dedicatedHostCluster = dedicatedHostCluster;
                return this;
            }

            public DedicatedHostClusters build() {
                return new DedicatedHostClusters(this);
            } 

        } 

    }
}
