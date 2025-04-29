// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
    private java.util.List<ReplicaGroups> replicaGroups;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ReplicaGroups> getReplicaGroups() {
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
        private java.util.List<ReplicaGroups> replicaGroups; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDiskReplicaGroupsResponseBody model) {
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.replicaGroups = model.replicaGroups;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The information about the replication pair-consistent groups.</p>
         */
        public Builder replicaGroups(java.util.List<ReplicaGroups> replicaGroups) {
            this.replicaGroups = replicaGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAA478A0-BEE6-1D42-BEB6-A9CFEAD6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskReplicaGroupsResponseBody build() {
            return new DescribeDiskReplicaGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiskReplicaGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskReplicaGroupsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
    /**
     * 
     * {@link DescribeDiskReplicaGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskReplicaGroupsResponseBody</p>
     */
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
        private java.util.List<byte[]> pairIds;

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
        private java.util.List<Tags> tags;

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
        public java.util.List<byte[]> getPairIds() {
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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long bandwidth; 
            private String description; 
            private String destinationRegionId; 
            private String destinationZoneId; 
            private String groupName; 
            private Long lastRecoverPoint; 
            private java.util.List<byte[]> pairIds; 
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
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(ReplicaGroups model) {
                this.bandwidth = model.bandwidth;
                this.description = model.description;
                this.destinationRegionId = model.destinationRegionId;
                this.destinationZoneId = model.destinationZoneId;
                this.groupName = model.groupName;
                this.lastRecoverPoint = model.lastRecoverPoint;
                this.pairIds = model.pairIds;
                this.pairNumber = model.pairNumber;
                this.primaryRegion = model.primaryRegion;
                this.primaryZone = model.primaryZone;
                this.RPO = model.RPO;
                this.replicaGroupId = model.replicaGroupId;
                this.resourceGroupId = model.resourceGroupId;
                this.site = model.site;
                this.sourceRegionId = model.sourceRegionId;
                this.sourceZoneId = model.sourceZoneId;
                this.standbyRegion = model.standbyRegion;
                this.standbyZone = model.standbyZone;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The bandwidth value. Unit: Kbit/s. This parameter is not publicly available and has a system-preset value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The description of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the region in which the secondary site is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the secondary site is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-e</p>
             */
            public Builder destinationZoneId(String destinationZoneId) {
                this.destinationZoneId = destinationZoneId;
                return this;
            }

            /**
             * <p>The name of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>myreplicagrouptest</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The time when data was last replicated from the primary disks to the secondary disks in the replication pair-consistent group. The value of this parameter is a timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637835114</p>
             */
            public Builder lastRecoverPoint(Long lastRecoverPoint) {
                this.lastRecoverPoint = lastRecoverPoint;
                return this;
            }

            /**
             * <p>The IDs of replication pairs that belong to the replication pair-consistent group.</p>
             */
            public Builder pairIds(java.util.List<byte[]> pairIds) {
                this.pairIds = pairIds;
                return this;
            }

            /**
             * <p>The number of replication pairs that belong to the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pairNumber(Long pairNumber) {
                this.pairNumber = pairNumber;
                return this;
            }

            /**
             * <p>The initial source region (primary region) of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder primaryRegion(String primaryRegion) {
                this.primaryRegion = primaryRegion;
                return this;
            }

            /**
             * <p>The initial source zone (primary zone) of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-h</p>
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * <p>The recovery point objective (RPO) of the replication pair-consistent group. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder RPO(Long RPO) {
                this.RPO = RPO;
                return this;
            }

            /**
             * <p>The IDs of the replication pair-consistent groups.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-myreplica****</p>
             */
            public Builder replicaGroupId(String replicaGroupId) {
                this.replicaGroupId = replicaGroupId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the replication pair-consistent group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2a*******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The type of the site from which the information about the replication pairs and replication pair-consistent group was obtained. Valid values:</p>
             * <ul>
             * <li>production: primary site</li>
             * <li>backup: secondary site</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>production</p>
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * <p>The ID of the region in which the primary site is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the primary site is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-f</p>
             */
            public Builder sourceZoneId(String sourceZoneId) {
                this.sourceZoneId = sourceZoneId;
                return this;
            }

            /**
             * <p>The initial destination region (secondary region) of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder standbyRegion(String standbyRegion) {
                this.standbyRegion = standbyRegion;
                return this;
            }

            /**
             * <p>The initial destination zone (secondary zone) of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-e</p>
             */
            public Builder standbyZone(String standbyZone) {
                this.standbyZone = standbyZone;
                return this;
            }

            /**
             * <p>The status of the replication pair-consistent group. Valid values:</p>
             * <ul>
             * <li>invalid: The replication pair-consistent group is invalid, which indicates that abnormal replication pairs are present in the replication pair-consistent group.</li>
             * <li>creating: The replication pair-consistent group is being created.</li>
             * <li>created: The replication pair-consistent group was created.</li>
             * <li>create_failed: The replication pair-consistent group failed to be created.</li>
             * <li>manual_syncing: Data was being manually synchronized between the disks in the replication pair-consistent group. When data was being manually synchronized for the first time, the replication pair is in this state.</li>
             * <li>syncing: Data was being synchronized between the disks. When data is being asynchronously replicated from the primary disk to the secondary disk again in subsequent operations, the replication pair is in this state.</li>
             * <li>normal: The replication pair was working as expected. When the system finishes replicating data from the primary disk to the secondary disk within the current replication cycle, the replication pair enters this state.</li>
             * <li>stopping: The replication pair was being stopped.</li>
             * <li>stopped: The replication pair was stopped.</li>
             * <li>stop_failed: The replication pair failed to be stopped.</li>
             * <li>failovering: A failover was being performed.</li>
             * <li>failovered: A failover was performed.</li>
             * <li>failover_failed: A failover failed to be performed.</li>
             * <li>reprotecting: A reverse replication was being performed.</li>
             * <li>reprotect_failed: A reverse replication failed to be performed.</li>
             * <li>deleting: The replication pair was being deleted.</li>
             * <li>delete_failed: The replication pair failed to be deleted.</li>
             * <li>deleted: The replication pair was deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the replication pair-consistent group.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public ReplicaGroups build() {
                return new ReplicaGroups(this);
            } 

        } 

    }
}
