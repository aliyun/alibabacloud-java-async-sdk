// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

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
    @NameInMap("DedicatedHostClusters")
    private DedicatedHostClusters dedicatedHostClusters;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * DedicatedHostClusters.
         */
        public Builder dedicatedHostClusters(DedicatedHostClusters dedicatedHostClusters) {
            this.dedicatedHostClusters = dedicatedHostClusters;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDedicatedHostClustersResponseBody build() {
            return new DescribeDedicatedHostClustersResponseBody(this);
        } 

    } 

    public static class AvailableInstanceType extends TeaModel {
        @NameInMap("AvailableInstanceCapacity")
        private Integer availableInstanceCapacity;

        @NameInMap("InstanceType")
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
             * AvailableInstanceCapacity.
             */
            public Builder availableInstanceCapacity(Integer availableInstanceCapacity) {
                this.availableInstanceCapacity = availableInstanceCapacity;
                return this;
            }

            /**
             * InstanceType.
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
    public static class AvailableInstanceTypes extends TeaModel {
        @NameInMap("AvailableInstanceType")
        private java.util.List < AvailableInstanceType> availableInstanceType;

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
        public java.util.List < AvailableInstanceType> getAvailableInstanceType() {
            return this.availableInstanceType;
        }

        public static final class Builder {
            private java.util.List < AvailableInstanceType> availableInstanceType; 

            /**
             * AvailableInstanceType.
             */
            public Builder availableInstanceType(java.util.List < AvailableInstanceType> availableInstanceType) {
                this.availableInstanceType = availableInstanceType;
                return this;
            }

            public AvailableInstanceTypes build() {
                return new AvailableInstanceTypes(this);
            } 

        } 

    }
    public static class LocalStorageCapacity extends TeaModel {
        @NameInMap("AvailableDisk")
        private Integer availableDisk;

        @NameInMap("DataDiskCategory")
        private String dataDiskCategory;

        @NameInMap("TotalDisk")
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
             * AvailableDisk.
             */
            public Builder availableDisk(Integer availableDisk) {
                this.availableDisk = availableDisk;
                return this;
            }

            /**
             * DataDiskCategory.
             */
            public Builder dataDiskCategory(String dataDiskCategory) {
                this.dataDiskCategory = dataDiskCategory;
                return this;
            }

            /**
             * TotalDisk.
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
        @NameInMap("AvailableInstanceTypes")
        private AvailableInstanceTypes availableInstanceTypes;

        @NameInMap("AvailableMemory")
        private Integer availableMemory;

        @NameInMap("AvailableVcpus")
        private Integer availableVcpus;

        @NameInMap("LocalStorageCapacities")
        private LocalStorageCapacities localStorageCapacities;

        @NameInMap("TotalMemory")
        private Integer totalMemory;

        @NameInMap("TotalVcpus")
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
             * AvailableInstanceTypes.
             */
            public Builder availableInstanceTypes(AvailableInstanceTypes availableInstanceTypes) {
                this.availableInstanceTypes = availableInstanceTypes;
                return this;
            }

            /**
             * AvailableMemory.
             */
            public Builder availableMemory(Integer availableMemory) {
                this.availableMemory = availableMemory;
                return this;
            }

            /**
             * AvailableVcpus.
             */
            public Builder availableVcpus(Integer availableVcpus) {
                this.availableVcpus = availableVcpus;
                return this;
            }

            /**
             * LocalStorageCapacities.
             */
            public Builder localStorageCapacities(LocalStorageCapacities localStorageCapacities) {
                this.localStorageCapacities = localStorageCapacities;
                return this;
            }

            /**
             * TotalMemory.
             */
            public Builder totalMemory(Integer totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            /**
             * TotalVcpus.
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
    public static class DedicatedHostCluster extends TeaModel {
        @NameInMap("DedicatedHostClusterCapacity")
        private DedicatedHostClusterCapacity dedicatedHostClusterCapacity;

        @NameInMap("DedicatedHostClusterId")
        private String dedicatedHostClusterId;

        @NameInMap("DedicatedHostClusterName")
        private String dedicatedHostClusterName;

        @NameInMap("DedicatedHostIds")
        private DedicatedHostIds dedicatedHostIds;

        @NameInMap("Description")
        private String description;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("ZoneId")
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
             * DedicatedHostClusterCapacity.
             */
            public Builder dedicatedHostClusterCapacity(DedicatedHostClusterCapacity dedicatedHostClusterCapacity) {
                this.dedicatedHostClusterCapacity = dedicatedHostClusterCapacity;
                return this;
            }

            /**
             * DedicatedHostClusterId.
             */
            public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
                this.dedicatedHostClusterId = dedicatedHostClusterId;
                return this;
            }

            /**
             * DedicatedHostClusterName.
             */
            public Builder dedicatedHostClusterName(String dedicatedHostClusterName) {
                this.dedicatedHostClusterName = dedicatedHostClusterName;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * ZoneId.
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
