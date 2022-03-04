// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedHostClustersResponseBody</p>
 */
public class DescribeDedicatedHostClustersResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("DedicatedHostClusters")
    private DedicatedHostClusters dedicatedHostClusters;

    private DescribeDedicatedHostClustersResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.dedicatedHostClusters = builder.dedicatedHostClusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostClustersResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return dedicatedHostClusters
     */
    public DedicatedHostClusters getDedicatedHostClusters() {
        return this.dedicatedHostClusters;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private DedicatedHostClusters dedicatedHostClusters; 

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The page number of the DDH cluster status list.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of dedicated hosts.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * An array of the statuses of one or more DDH clusters.
         */
        public Builder dedicatedHostClusters(DedicatedHostClusters dedicatedHostClusters) {
            this.dedicatedHostClusters = dedicatedHostClusters;
            return this;
        }

        public DescribeDedicatedHostClustersResponseBody build() {
            return new DescribeDedicatedHostClustersResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("TagKey")
        private String tagKey;

        private Tag(Builder builder) {
            this.tagValue = builder.tagValue;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private String tagValue; 
            private String tagKey; 

            /**
             * The tag value of the DDH cluster.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * The tag key of the DDH cluster.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

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
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DedicatedHostIds extends TeaModel {
        @NameInMap("DedicatedHostId")
        private java.util.List < String > dedicatedHostId;

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
        public java.util.List < String > getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public static final class Builder {
            private java.util.List < String > dedicatedHostId; 

            /**
             * DedicatedHostId.
             */
            public Builder dedicatedHostId(java.util.List < String > dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            public DedicatedHostIds build() {
                return new DedicatedHostIds(this);
            } 

        } 

    }
    public static class LocalStorageCapacity extends TeaModel {
        @NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @NameInMap("AvailableDisk")
        private Integer availableDisk;

        @NameInMap("TotalDisk")
        private Integer totalDisk;

        private LocalStorageCapacity(Builder builder) {
            this.dataDiskCategory = builder.dataDiskCategory;
            this.availableDisk = builder.availableDisk;
            this.totalDisk = builder.totalDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LocalStorageCapacity create() {
            return builder().build();
        }

        /**
         * @return dataDiskCategory
         */
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        /**
         * @return availableDisk
         */
        public Integer getAvailableDisk() {
            return this.availableDisk;
        }

        /**
         * @return totalDisk
         */
        public Integer getTotalDisk() {
            return this.totalDisk;
        }

        public static final class Builder {
            private String dataDiskCategory; 
            private Integer availableDisk; 
            private Integer totalDisk; 

            /**
             * The data disk type. Possible values:
             * <p>
             * -cloud: basic cloud disk
             * -cloud_efficiency: Ultra disk
             * -cloud_ssd:SSD cloud disk
             * -ephemeral_ssd: local SSD
             * -cloud_essd:ESSD
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * The size of the available local disk. Unit: GiB
             */
            public Builder availableDisk(Integer availableDisk) {
                this.availableDisk = availableDisk;
                return this;
            }

            /**
             * The total size of the local disk. Unit: GiB
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
    public static class LocalStorageCapacities extends TeaModel {
        @NameInMap("LocalStorageCapacity")
        private java.util.List < LocalStorageCapacity> localStorageCapacity;

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
        public java.util.List < LocalStorageCapacity> getLocalStorageCapacity() {
            return this.localStorageCapacity;
        }

        public static final class Builder {
            private java.util.List < LocalStorageCapacity> localStorageCapacity; 

            /**
             * LocalStorageCapacity.
             */
            public Builder localStorageCapacity(java.util.List < LocalStorageCapacity> localStorageCapacity) {
                this.localStorageCapacity = localStorageCapacity;
                return this;
            }

            public LocalStorageCapacities build() {
                return new LocalStorageCapacities(this);
            } 

        } 

    }
    public static class DedicatedHostClusterCapacity extends TeaModel {
        @NameInMap("AvailableVcpus")
        private Integer availableVcpus;

        @NameInMap("AvailableMemory")
        private Integer availableMemory;

        @NameInMap("TotalMemory")
        private Integer totalMemory;

        @NameInMap("TotalVcpus")
        private Integer totalVcpus;

        @NameInMap("LocalStorageCapacities")
        private LocalStorageCapacities localStorageCapacities;

        private DedicatedHostClusterCapacity(Builder builder) {
            this.availableVcpus = builder.availableVcpus;
            this.availableMemory = builder.availableMemory;
            this.totalMemory = builder.totalMemory;
            this.totalVcpus = builder.totalVcpus;
            this.localStorageCapacities = builder.localStorageCapacities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostClusterCapacity create() {
            return builder().build();
        }

        /**
         * @return availableVcpus
         */
        public Integer getAvailableVcpus() {
            return this.availableVcpus;
        }

        /**
         * @return availableMemory
         */
        public Integer getAvailableMemory() {
            return this.availableMemory;
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

        /**
         * @return localStorageCapacities
         */
        public LocalStorageCapacities getLocalStorageCapacities() {
            return this.localStorageCapacities;
        }

        public static final class Builder {
            private Integer availableVcpus; 
            private Integer availableMemory; 
            private Integer totalMemory; 
            private Integer totalVcpus; 
            private LocalStorageCapacities localStorageCapacities; 

            /**
             * The number of available vCPU.
             */
            public Builder availableVcpus(Integer availableVcpus) {
                this.availableVcpus = availableVcpus;
                return this;
            }

            /**
             * The amount of available memory. Unit: GiB
             */
            public Builder availableMemory(Integer availableMemory) {
                this.availableMemory = availableMemory;
                return this;
            }

            /**
             * The total memory size. Unit: GiB
             */
            public Builder totalMemory(Integer totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * The total number of VCPUs.
             */
            public Builder totalVcpus(Integer totalVcpus) {
                this.totalVcpus = totalVcpus;
                return this;
            }

            /**
             * The local storage capacity.
             */
            public Builder localStorageCapacities(LocalStorageCapacities localStorageCapacities) {
                this.localStorageCapacities = localStorageCapacities;
                return this;
            }

            public DedicatedHostClusterCapacity build() {
                return new DedicatedHostClusterCapacity(this);
            } 

        } 

    }
    public static class DedicatedHostCluster extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("DedicatedHostClusterName")
        private String dedicatedHostClusterName;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("DedicatedHostIds")
        private DedicatedHostIds dedicatedHostIds;

        @NameInMap("DedicatedHostClusterCapacity")
        private DedicatedHostClusterCapacity dedicatedHostClusterCapacity;

        private DedicatedHostCluster(Builder builder) {
            this.description = builder.description;
            this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
            this.resourceGroupId = builder.resourceGroupId;
            this.zoneId = builder.zoneId;
            this.regionId = builder.regionId;
            this.dedicatedHostClusterName = builder.dedicatedHostClusterName;
            this.tags = builder.tags;
            this.dedicatedHostIds = builder.dedicatedHostIds;
            this.dedicatedHostClusterCapacity = builder.dedicatedHostClusterCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedHostCluster create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dedicatedHostClusterId
         */
        public String getDedicatedHostClusterId() {
            return this.dedicatedHostClusterId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return dedicatedHostClusterName
         */
        public String getDedicatedHostClusterName() {
            return this.dedicatedHostClusterName;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return dedicatedHostIds
         */
        public DedicatedHostIds getDedicatedHostIds() {
            return this.dedicatedHostIds;
        }

        /**
         * @return dedicatedHostClusterCapacity
         */
        public DedicatedHostClusterCapacity getDedicatedHostClusterCapacity() {
            return this.dedicatedHostClusterCapacity;
        }

        public static final class Builder {
            private String description; 
            private String dedicatedHostClusterId; 
            private String resourceGroupId; 
            private String zoneId; 
            private String regionId; 
            private String dedicatedHostClusterName; 
            private Tags tags; 
            private DedicatedHostIds dedicatedHostIds; 
            private DedicatedHostClusterCapacity dedicatedHostClusterCapacity; 

            /**
             * The description of the DDH cluster.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the DDH cluster.
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * The ID of the Resource Group of the DDH cluster.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the zone where the dedicated host cluster is located.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The region ID of the DDH cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the DDH cluster.
             */
            public Builder dedicatedHostClusterName(String dedicatedHostClusterName) {
                this.dedicatedHostClusterName = dedicatedHostClusterName;
                return this;
            }

            /**
             * The tag of the DDH cluster.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * DedicatedHostIds.
             */
            public Builder dedicatedHostIds(DedicatedHostIds dedicatedHostIds) {
                this.dedicatedHostIds = dedicatedHostIds;
                return this;
            }

            /**
             * The capacity of the dedicated host cluster.
             */
            public Builder dedicatedHostClusterCapacity(DedicatedHostClusterCapacity dedicatedHostClusterCapacity) {
                this.dedicatedHostClusterCapacity = dedicatedHostClusterCapacity;
                return this;
            }

            public DedicatedHostCluster build() {
                return new DedicatedHostCluster(this);
            } 

        } 

    }
    public static class DedicatedHostClusters extends TeaModel {
        @NameInMap("DedicatedHostCluster")
        private java.util.List < DedicatedHostCluster> dedicatedHostCluster;

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
        public java.util.List < DedicatedHostCluster> getDedicatedHostCluster() {
            return this.dedicatedHostCluster;
        }

        public static final class Builder {
            private java.util.List < DedicatedHostCluster> dedicatedHostCluster; 

            /**
             * DedicatedHostCluster.
             */
            public Builder dedicatedHostCluster(java.util.List < DedicatedHostCluster> dedicatedHostCluster) {
                this.dedicatedHostCluster = dedicatedHostCluster;
                return this;
            }

            public DedicatedHostClusters build() {
                return new DedicatedHostClusters(this);
            } 

        } 

    }
}
