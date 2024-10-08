// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaGroupsResponseBody</p>
 */
public class DescribeDiskReplicaGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ReplicaGroups")
    private java.util.List < ReplicaGroups> replicaGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDiskReplicaGroupsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.replicaGroups = builder.replicaGroups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return replicaGroups
     */
    public java.util.List < ReplicaGroups> getReplicaGroups() {
        return this.replicaGroups;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < ReplicaGroups> replicaGroups; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The query token returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Details about the replication pair-consistent groups.
         */
        public Builder replicaGroups(java.util.List < ReplicaGroups> replicaGroups) {
            this.replicaGroups = replicaGroups;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskReplicaGroupsResponseBody build() {
            return new DescribeDiskReplicaGroupsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The tag key of the replication group.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the replication group.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class ReplicaGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
        private String destinationRegionId;

        @com.aliyun.core.annotation.NameInMap("DestinationZoneId")
        private String destinationZoneId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("LastRecoverPoint")
        private Long lastRecoverPoint;

        @com.aliyun.core.annotation.NameInMap("PairIds")
        private java.util.List < byte[] > pairIds;

        @com.aliyun.core.annotation.NameInMap("PairNumber")
        private Long pairNumber;

        @com.aliyun.core.annotation.NameInMap("PrimaryRegion")
        private String primaryRegion;

        @com.aliyun.core.annotation.NameInMap("PrimaryZone")
        private String primaryZone;

        @com.aliyun.core.annotation.NameInMap("RPO")
        private Long RPO;

        @com.aliyun.core.annotation.NameInMap("ReplicaGroupId")
        private String replicaGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        @com.aliyun.core.annotation.NameInMap("SourceRegionId")
        private String sourceRegionId;

        @com.aliyun.core.annotation.NameInMap("SourceZoneId")
        private String sourceZoneId;

        @com.aliyun.core.annotation.NameInMap("StandbyRegion")
        private String standbyRegion;

        @com.aliyun.core.annotation.NameInMap("StandbyZone")
        private String standbyZone;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private ReplicaGroups(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.description = builder.description;
            this.destinationRegionId = builder.destinationRegionId;
            this.destinationZoneId = builder.destinationZoneId;
            this.groupName = builder.groupName;
            this.lastRecoverPoint = builder.lastRecoverPoint;
            this.pairIds = builder.pairIds;
            this.pairNumber = builder.pairNumber;
            this.primaryRegion = builder.primaryRegion;
            this.primaryZone = builder.primaryZone;
            this.RPO = builder.RPO;
            this.replicaGroupId = builder.replicaGroupId;
            this.resourceGroupId = builder.resourceGroupId;
            this.site = builder.site;
            this.sourceRegionId = builder.sourceRegionId;
            this.sourceZoneId = builder.sourceZoneId;
            this.standbyRegion = builder.standbyRegion;
            this.standbyZone = builder.standbyZone;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaGroups create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationRegionId
         */
        public String getDestinationRegionId() {
            return this.destinationRegionId;
        }

        /**
         * @return destinationZoneId
         */
        public String getDestinationZoneId() {
            return this.destinationZoneId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return lastRecoverPoint
         */
        public Long getLastRecoverPoint() {
            return this.lastRecoverPoint;
        }

        /**
         * @return pairIds
         */
        public java.util.List < byte[] > getPairIds() {
            return this.pairIds;
        }

        /**
         * @return pairNumber
         */
        public Long getPairNumber() {
            return this.pairNumber;
        }

        /**
         * @return primaryRegion
         */
        public String getPrimaryRegion() {
            return this.primaryRegion;
        }

        /**
         * @return primaryZone
         */
        public String getPrimaryZone() {
            return this.primaryZone;
        }

        /**
         * @return RPO
         */
        public Long getRPO() {
            return this.RPO;
        }

        /**
         * @return replicaGroupId
         */
        public String getReplicaGroupId() {
            return this.replicaGroupId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        /**
         * @return sourceRegionId
         */
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        /**
         * @return sourceZoneId
         */
        public String getSourceZoneId() {
            return this.sourceZoneId;
        }

        /**
         * @return standbyRegion
         */
        public String getStandbyRegion() {
            return this.standbyRegion;
        }

        /**
         * @return standbyZone
         */
        public String getStandbyZone() {
            return this.standbyZone;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long bandwidth; 
            private String description; 
            private String destinationRegionId; 
            private String destinationZoneId; 
            private String groupName; 
            private Long lastRecoverPoint; 
            private java.util.List < byte[] > pairIds; 
            private Long pairNumber; 
            private String primaryRegion; 
            private String primaryZone; 
            private Long RPO; 
            private String replicaGroupId; 
            private String resourceGroupId; 
            private String site; 
            private String sourceRegionId; 
            private String sourceZoneId; 
            private String standbyRegion; 
            private String standbyZone; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * The bandwidth value. Unit: Mbit/s. This parameter is unavailable and has a system-preset value.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The description of the replication pair-consistent group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the region in which the secondary site is deployed.
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * The ID of the zone in which the secondary site is deployed.
             */
            public Builder destinationZoneId(String destinationZoneId) {
                this.destinationZoneId = destinationZoneId;
                return this;
            }

            /**
             * The name of the replication pair-consistent group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The time when data was last replicated from the primary disks to the secondary disks in the replication pair-consistent group. The value of this parameter is a timestamp. Unit: seconds.
             */
            public Builder lastRecoverPoint(Long lastRecoverPoint) {
                this.lastRecoverPoint = lastRecoverPoint;
                return this;
            }

            /**
             * The IDs of the replications pairs that belong to the replication pair-consistent group.
             */
            public Builder pairIds(java.util.List < byte[] > pairIds) {
                this.pairIds = pairIds;
                return this;
            }

            /**
             * The number of replications pairs that belong to the replication pair-consistent group.
             */
            public Builder pairNumber(Long pairNumber) {
                this.pairNumber = pairNumber;
                return this;
            }

            /**
             * The initial source region (primary region) of the replication pair-consistent group.
             */
            public Builder primaryRegion(String primaryRegion) {
                this.primaryRegion = primaryRegion;
                return this;
            }

            /**
             * The initial source zone (primary zone) of the replication pair-consistent group.
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds.
             */
            public Builder RPO(Long RPO) {
                this.RPO = RPO;
                return this;
            }

            /**
             * The ID of the replication pair-consistent group.
             */
            public Builder replicaGroupId(String replicaGroupId) {
                this.replicaGroupId = replicaGroupId;
                return this;
            }

            /**
             * The ID of the resource group to which the replication group belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the site from which the information of the replication pair and replication pair-consistent group is obtained. Valid values:
             * <p>
             * 
             * *   production: primary site
             * *   backup: secondary site
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * The ID of the region in which the primary site is deployed.
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * The ID of the zone in which the primary site is deployed.
             */
            public Builder sourceZoneId(String sourceZoneId) {
                this.sourceZoneId = sourceZoneId;
                return this;
            }

            /**
             * The initial destination region (secondary region) of the replication pair-consistent group.
             */
            public Builder standbyRegion(String standbyRegion) {
                this.standbyRegion = standbyRegion;
                return this;
            }

            /**
             * The initial destination zone (secondary zone) of the replication pair-consistent group.
             */
            public Builder standbyZone(String standbyZone) {
                this.standbyZone = standbyZone;
                return this;
            }

            /**
             * The state of the replication pair-consistent group. Valid values:
             * <p>
             * 
             * *   invalid: The replication pair-consistent group is invalid, which indicates that abnormal replication pairs are present in the replication pair-consistent group.
             * *   creating: The replication pair-consistent group is being created.
             * *   created: The replication pair-consistent group is created.
             * *   create_failed: The replication pair-consistent group cannot be created.
             * *   manual_syncing: Data is being manually synchronized between the disks in the replication pair-consistent group. The first time data is being manually synchronized between the disks in a replication pair-consistent group, the replication pair-consistent group is in this state.
             * *   syncing: Data is being synchronized between the disks in the replication pair-consistent group. While data is being asynchronously replicated from the primary disks to the secondary disks not for the first time, the replication pair-consistent group is in this state.
             * *   normal: The replication pair-consistent group is working as expected. When the system finishes replicating data from the primary disks to the secondary disks within the current replication cycle, the replication pair-consistent group enters this state.
             * *   stopping: The replication pair-consistent group is being stopped.
             * *   stopped: The replication pair-consistent group is stopped.
             * *   stop_failed: The replication pair-consistent group cannot be stopped.
             * *   failovering: A failover is being performed.
             * *   failovered: A failover is performed.
             * *   failover_failed: A failover cannot be performed.
             * *   reprotecting: A reverse replication is being performed.
             * *   reprotect_failed: A reverse replication cannot be performed.
             * *   deleting: The replication pair-consistent group is being deleted.
             * *   delete_failed: The replication pair-consistent group cannot be deleted.
             * *   deleted: The replication pair-consistent group is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the replication pair.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public ReplicaGroups build() {
                return new ReplicaGroups(this);
            } 

        } 

    }
}
