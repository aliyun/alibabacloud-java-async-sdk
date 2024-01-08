// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaPairsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaPairsResponseBody</p>
 */
public class DescribeDiskReplicaPairsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("ReplicaPairs")
    private java.util.List < ReplicaPairs> replicaPairs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDiskReplicaPairsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.replicaPairs = builder.replicaPairs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaPairsResponseBody create() {
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
     * @return replicaPairs
     */
    public java.util.List < ReplicaPairs> getReplicaPairs() {
        return this.replicaPairs;
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
        private java.util.List < ReplicaPairs> replicaPairs; 
        private String requestId; 
        private Long totalCount; 

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Details about the replication pairs.
         */
        public Builder replicaPairs(java.util.List < ReplicaPairs> replicaPairs) {
            this.replicaPairs = replicaPairs;
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

        public DescribeDiskReplicaPairsResponseBody build() {
            return new DescribeDiskReplicaPairsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * The key of the tag.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class ReplicaPairs extends TeaModel {
        @NameInMap("Bandwidth")
        private Long bandwidth;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationDiskId")
        private String destinationDiskId;

        @NameInMap("DestinationRegion")
        private String destinationRegion;

        @NameInMap("DestinationZoneId")
        private String destinationZoneId;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("LastRecoverPoint")
        private Long lastRecoverPoint;

        @NameInMap("PairName")
        private String pairName;

        @NameInMap("PrimaryRegion")
        private String primaryRegion;

        @NameInMap("PrimaryZone")
        private String primaryZone;

        @NameInMap("RPO")
        private Long RPO;

        @NameInMap("ReplicaGroupId")
        private String replicaGroupId;

        @NameInMap("ReplicaGroupName")
        private String replicaGroupName;

        @NameInMap("ReplicaPairId")
        private String replicaPairId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Site")
        private String site;

        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("SourceRegion")
        private String sourceRegion;

        @NameInMap("SourceZoneId")
        private String sourceZoneId;

        @NameInMap("StandbyRegion")
        private String standbyRegion;

        @NameInMap("StandbyZone")
        private String standbyZone;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private ReplicaPairs(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.destinationDiskId = builder.destinationDiskId;
            this.destinationRegion = builder.destinationRegion;
            this.destinationZoneId = builder.destinationZoneId;
            this.expiredTime = builder.expiredTime;
            this.lastRecoverPoint = builder.lastRecoverPoint;
            this.pairName = builder.pairName;
            this.primaryRegion = builder.primaryRegion;
            this.primaryZone = builder.primaryZone;
            this.RPO = builder.RPO;
            this.replicaGroupId = builder.replicaGroupId;
            this.replicaGroupName = builder.replicaGroupName;
            this.replicaPairId = builder.replicaPairId;
            this.resourceGroupId = builder.resourceGroupId;
            this.site = builder.site;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceRegion = builder.sourceRegion;
            this.sourceZoneId = builder.sourceZoneId;
            this.standbyRegion = builder.standbyRegion;
            this.standbyZone = builder.standbyZone;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaPairs create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationDiskId
         */
        public String getDestinationDiskId() {
            return this.destinationDiskId;
        }

        /**
         * @return destinationRegion
         */
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        /**
         * @return destinationZoneId
         */
        public String getDestinationZoneId() {
            return this.destinationZoneId;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return lastRecoverPoint
         */
        public Long getLastRecoverPoint() {
            return this.lastRecoverPoint;
        }

        /**
         * @return pairName
         */
        public String getPairName() {
            return this.pairName;
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
         * @return replicaGroupName
         */
        public String getReplicaGroupName() {
            return this.replicaGroupName;
        }

        /**
         * @return replicaPairId
         */
        public String getReplicaPairId() {
            return this.replicaPairId;
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
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
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
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long bandwidth; 
            private String chargeType; 
            private Long createTime; 
            private String description; 
            private String destinationDiskId; 
            private String destinationRegion; 
            private String destinationZoneId; 
            private Long expiredTime; 
            private Long lastRecoverPoint; 
            private String pairName; 
            private String primaryRegion; 
            private String primaryZone; 
            private Long RPO; 
            private String replicaGroupId; 
            private String replicaGroupName; 
            private String replicaPairId; 
            private String resourceGroupId; 
            private String site; 
            private String sourceDiskId; 
            private String sourceRegion; 
            private String sourceZoneId; 
            private String standbyRegion; 
            private String standbyZone; 
            private String status; 
            private String statusMessage; 
            private java.util.List < Tags> tags; 

            /**
             * The bandwidth used to asynchronously replicate data from the primary disk to the secondary disk. Unit: Kbit/s.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The billing method of the replication pair. Valid values:
             * <p>
             * 
             * *   PREPAY: subscription
             * *   POSTPAY: pay-as-you-go
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the replication pair was created. The value of this parameter is a timestamp. Unit: seconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the replication pair.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the secondary disk.
             */
            public Builder destinationDiskId(String destinationDiskId) {
                this.destinationDiskId = destinationDiskId;
                return this;
            }

            /**
             * The region ID of the secondary disk.
             */
            public Builder destinationRegion(String destinationRegion) {
                this.destinationRegion = destinationRegion;
                return this;
            }

            /**
             * The zone ID of the secondary disk.
             */
            public Builder destinationZoneId(String destinationZoneId) {
                this.destinationZoneId = destinationZoneId;
                return this;
            }

            /**
             * The time when the replication pair expires. The value of this parameter is a timestamp. Unit: seconds.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The time when data was last replicated from the primary disk to the secondary disk in the replication pair. The value of this parameter is a timestamp. Unit: seconds. 86,400 seconds is equivalent to 24 hours.
             */
            public Builder lastRecoverPoint(Long lastRecoverPoint) {
                this.lastRecoverPoint = lastRecoverPoint;
                return this;
            }

            /**
             * The name of the replication pair.
             */
            public Builder pairName(String pairName) {
                this.pairName = pairName;
                return this;
            }

            /**
             * The initial source region (primary region) of the replication pair.
             */
            public Builder primaryRegion(String primaryRegion) {
                this.primaryRegion = primaryRegion;
                return this;
            }

            /**
             * The initial source zone (primary zone) of the replication pair.
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * The recovery point objective (RPO) of the replication pair. Unit: seconds.
             */
            public Builder RPO(Long RPO) {
                this.RPO = RPO;
                return this;
            }

            /**
             * The ID of the replication pair-consistent group to which the replication pair belongs.
             */
            public Builder replicaGroupId(String replicaGroupId) {
                this.replicaGroupId = replicaGroupId;
                return this;
            }

            /**
             * The name of the replication pair-consistent group to which the replication pair belongs.
             */
            public Builder replicaGroupName(String replicaGroupName) {
                this.replicaGroupName = replicaGroupName;
                return this;
            }

            /**
             * The ID of the replication pair.
             */
            public Builder replicaPairId(String replicaPairId) {
                this.replicaPairId = replicaPairId;
                return this;
            }

            /**
             * The ID of the resource group to which the replication pair belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The type of the site from which the information about the replication pairs and replication pair-consistent group was obtained. Valid values:
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
             * The ID of the primary disk.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * The region ID of the primary disk.
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * The zone ID of the primary disk.
             */
            public Builder sourceZoneId(String sourceZoneId) {
                this.sourceZoneId = sourceZoneId;
                return this;
            }

            /**
             * The initial destination region (secondary region) of the replication pair.
             */
            public Builder standbyRegion(String standbyRegion) {
                this.standbyRegion = standbyRegion;
                return this;
            }

            /**
             * The initial destination zone (secondary zone) of the replication pair.
             */
            public Builder standbyZone(String standbyZone) {
                this.standbyZone = standbyZone;
                return this;
            }

            /**
             * The status of the replication pair. Valid values:
             * <p>
             * 
             * *   invalid: The replication pair was invalid. When a replication pair becomes abnormal, it enters this state.
             * *   creating: The replication pair was being created.
             * *   created: The replication pair was created.
             * *   create_failed: The replication pair failed to be created.
             * *   initial_syncing: Data was synchronized from the primary disk to the secondary disk for the first time. After a replication pair is created and activated, the replication pair is in this state the first time data is synchronized from the primary disk to the secondary disk.
             * *   manual_syncing: Data was being manually synchronized from the primary disk to the secondary disk. After data is manually synchronized from the primary disk to the secondary disk, the replication pair returns to the stopped state. The first time data is manually synchronized from the primary disk to the secondary disk, the replication pair is in the manual_syncing state during the synchronization.
             * *   syncing: Data was being synchronized from the primary disk to the secondary disk. When data is being asynchronously replicated from the primary disk to the secondary disk again in subsequent operations, the replication pair is in this state.
             * *   normal: The replication pair was working as expected. When the system finishes replicating data from the primary disk to the secondary disk within the current replication cycle, the replication pair enters this state.
             * *   stopping: The replication pair was being stopped.
             * *   stopped: The replication pair was stopped.
             * *   stop_failed: The replication pair failed to be stopped.
             * *   failovering: A failover was being performed.
             * *   failovered: A failover was performed.
             * *   failover_failed: A failover failed to be performed.
             * *   reprotecting: A reverse replication was being performed.
             * *   reprotect_failed: A reverse replication failed to be performed.
             * *   deleting: The replication pair was being deleted.
             * *   delete_failed: The replication pair failed to be deleted.
             * *   deleted: The replication pair was deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The message that describes the state of the replication pair. This parameter has a value when `Status` has a value of invalid or `create_failed`. Valid values:
             * <p>
             * 
             * *   PrePayOrderExpired: The replication pair has expired.
             * *   PostPayOrderCeaseService: The pay-as-you-go replication pair has been stopped due to an overdue payment.
             * *   DeviceRemoved: The primary or secondary disk has been deleted.
             * *   DeviceKeyChanged: The `DeviceKey` mapping of the primary or secondary disk has changed.
             * *   DeviceSizeChanged: The `DeviceSize` value of the primary or secondary disk has changed.
             * *   OperationDenied.QuotaExceed: The maximum number of replication pairs that can be created has been reached.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The tags of the replication pair.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public ReplicaPairs build() {
                return new ReplicaPairs(this);
            } 

        } 

    }
}
