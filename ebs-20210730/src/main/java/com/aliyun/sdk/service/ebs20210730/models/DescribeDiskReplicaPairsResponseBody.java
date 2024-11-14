// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDiskReplicaPairsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaPairsResponseBody</p>
 */
public class DescribeDiskReplicaPairsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ReplicaPairs")
    private java.util.List < ReplicaPairs> replicaPairs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
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
         * <p>Details about the replication pairs.</p>
         */
        public Builder replicaPairs(java.util.List < ReplicaPairs> replicaPairs) {
            this.replicaPairs = replicaPairs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

        public DescribeDiskReplicaPairsResponseBody build() {
            return new DescribeDiskReplicaPairsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiskReplicaPairsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskReplicaPairsResponseBody</p>
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

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
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
     * {@link DescribeDiskReplicaPairsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskReplicaPairsResponseBody</p>
     */
    public static class ReplicaPairs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationDiskId")
        private String destinationDiskId;

        @com.aliyun.core.annotation.NameInMap("DestinationRegion")
        private String destinationRegion;

        @com.aliyun.core.annotation.NameInMap("DestinationZoneId")
        private String destinationZoneId;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private Long expiredTime;

        @com.aliyun.core.annotation.NameInMap("LastRecoverPoint")
        private Long lastRecoverPoint;

        @com.aliyun.core.annotation.NameInMap("PairName")
        private String pairName;

        @com.aliyun.core.annotation.NameInMap("PrimaryRegion")
        private String primaryRegion;

        @com.aliyun.core.annotation.NameInMap("PrimaryZone")
        private String primaryZone;

        @com.aliyun.core.annotation.NameInMap("RPO")
        private Long RPO;

        @com.aliyun.core.annotation.NameInMap("ReplicaGroupId")
        private String replicaGroupId;

        @com.aliyun.core.annotation.NameInMap("ReplicaGroupName")
        private String replicaGroupName;

        @com.aliyun.core.annotation.NameInMap("ReplicaPairId")
        private String replicaPairId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

        @com.aliyun.core.annotation.NameInMap("SourceRegion")
        private String sourceRegion;

        @com.aliyun.core.annotation.NameInMap("SourceZoneId")
        private String sourceZoneId;

        @com.aliyun.core.annotation.NameInMap("StandbyRegion")
        private String standbyRegion;

        @com.aliyun.core.annotation.NameInMap("StandbyZone")
        private String standbyZone;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("Tags")
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
             * <p>The bandwidth used to asynchronously replicate data from the primary disk to the secondary disk. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The billing method of the replication pair. Valid values:</p>
             * <ul>
             * <li>PREPAY: subscription</li>
             * <li>POSTPAY: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the replication pair was created. The value of this parameter is a timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649750977</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the replication pair.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the secondary disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-asdfjl2342kj2l3k4****</p>
             */
            public Builder destinationDiskId(String destinationDiskId) {
                this.destinationDiskId = destinationDiskId;
                return this;
            }

            /**
             * <p>The region ID of the secondary disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder destinationRegion(String destinationRegion) {
                this.destinationRegion = destinationRegion;
                return this;
            }

            /**
             * <p>The zone ID of the secondary disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
             */
            public Builder destinationZoneId(String destinationZoneId) {
                this.destinationZoneId = destinationZoneId;
                return this;
            }

            /**
             * <p>The time when the replication pair expires. The value of this parameter is a timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649750977</p>
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The time when data was last replicated from the primary disk to the secondary disk in the replication pair. The value of this parameter is a timestamp. Unit: seconds. 86,400 seconds is equivalent to 24 hours.</p>
             * 
             * <strong>example:</strong>
             * <p>1649751977</p>
             */
            public Builder lastRecoverPoint(Long lastRecoverPoint) {
                this.lastRecoverPoint = lastRecoverPoint;
                return this;
            }

            /**
             * <p>The name of the replication pair.</p>
             * 
             * <strong>example:</strong>
             * <p>TestReplicaPair</p>
             */
            public Builder pairName(String pairName) {
                this.pairName = pairName;
                return this;
            }

            /**
             * <p>The initial source region (primary region) of the replication pair.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder primaryRegion(String primaryRegion) {
                this.primaryRegion = primaryRegion;
                return this;
            }

            /**
             * <p>The initial source zone (primary zone) of the replication pair.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-a</p>
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * <p>The recovery point objective (RPO) of the replication pair. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder RPO(Long RPO) {
                this.RPO = RPO;
                return this;
            }

            /**
             * <p>The ID of the replication pair-consistent group to which the replication pair belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-xxxx****</p>
             */
            public Builder replicaGroupId(String replicaGroupId) {
                this.replicaGroupId = replicaGroupId;
                return this;
            }

            /**
             * <p>The name of the replication pair-consistent group to which the replication pair belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-name****</p>
             */
            public Builder replicaGroupName(String replicaGroupName) {
                this.replicaGroupName = replicaGroupName;
                return this;
            }

            /**
             * <p>The ID of the replication pair.</p>
             * 
             * <strong>example:</strong>
             * <p>pair-cn-dsa****</p>
             */
            public Builder replicaPairId(String replicaPairId) {
                this.replicaPairId = replicaPairId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the replication pair belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmvs*****</p>
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
             * <p>The ID of the primary disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp131n0q38u3a4zi****</p>
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * <p>The region ID of the primary disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * <p>The zone ID of the primary disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-a</p>
             */
            public Builder sourceZoneId(String sourceZoneId) {
                this.sourceZoneId = sourceZoneId;
                return this;
            }

            /**
             * <p>The initial destination region (secondary region) of the replication pair.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder standbyRegion(String standbyRegion) {
                this.standbyRegion = standbyRegion;
                return this;
            }

            /**
             * <p>The initial destination zone (secondary zone) of the replication pair.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
             */
            public Builder standbyZone(String standbyZone) {
                this.standbyZone = standbyZone;
                return this;
            }

            /**
             * <p>The status of the replication pair. Valid values:</p>
             * <ul>
             * <li>invalid: The replication pair was invalid. When a replication pair becomes abnormal, it enters this state.</li>
             * <li>creating: The replication pair was being created.</li>
             * <li>created: The replication pair was created.</li>
             * <li>create_failed: The replication pair failed to be created.</li>
             * <li>initial_syncing: Data was synchronized from the primary disk to the secondary disk for the first time. After a replication pair is created and activated, the replication pair is in this state the first time data is synchronized from the primary disk to the secondary disk.</li>
             * <li>manual_syncing: Data was being manually synchronized from the primary disk to the secondary disk. After data is manually synchronized from the primary disk to the secondary disk, the replication pair returns to the stopped state. The first time data is manually synchronized from the primary disk to the secondary disk, the replication pair is in the manual_syncing state during the synchronization.</li>
             * <li>syncing: Data was being synchronized from the primary disk to the secondary disk. When data is being asynchronously replicated from the primary disk to the secondary disk again in subsequent operations, the replication pair is in this state.</li>
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
             * <p>The message that describes the state of the replication pair. This parameter has a value when <code>Status</code> has a value of invalid or <code>create_failed</code>. Valid values:</p>
             * <ul>
             * <li>PrePayOrderExpired: The replication pair has expired.</li>
             * <li>PostPayOrderCeaseService: The pay-as-you-go replication pair has been stopped due to an overdue payment.</li>
             * <li>DeviceRemoved: The primary or secondary disk has been deleted.</li>
             * <li>DeviceKeyChanged: The <code>DeviceKey</code> mapping of the primary or secondary disk has changed.</li>
             * <li>DeviceSizeChanged: The <code>DeviceSize</code> value of the primary or secondary disk has changed.</li>
             * <li>OperationDenied.QuotaExceed: The maximum number of replication pairs that can be created has been reached.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePayOrderExpired</p>
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * <p>The tags of the replication pair.</p>
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
