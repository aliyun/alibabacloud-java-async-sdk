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
         * 查询凭证（Token）。取值为上一次调用该接口返回的NextToken参数值，初次调用接口时无需设置该参数。如果设置了NextToken，则请求参数PageSize和PageNumber将失效，且返回数据中的TotalCount无效。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 参数页码。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 参数页行数。
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ReplicaPairs.
         */
        public Builder replicaPairs(java.util.List < ReplicaPairs> replicaPairs) {
            this.replicaPairs = replicaPairs;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 分页查询时的结果总条数。
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskReplicaPairsResponseBody build() {
            return new DescribeDiskReplicaPairsResponseBody(this);
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
            this.site = builder.site;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceRegion = builder.sourceRegion;
            this.sourceZoneId = builder.sourceZoneId;
            this.standbyRegion = builder.standbyRegion;
            this.standbyZone = builder.standbyZone;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
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
            private String site; 
            private String sourceDiskId; 
            private String sourceRegion; 
            private String sourceZoneId; 
            private String standbyRegion; 
            private String standbyZone; 
            private String status; 
            private String statusMessage; 

            /**
             * 异步复制时使用的带宽。单位为Kbps。
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * 付费类型。PREPAY：预付费；POSTPAY：后付费。
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * 创建时间。1970年1月1日0点0分以来的秒数。
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * DestinationDiskId.
             */
            public Builder destinationDiskId(String destinationDiskId) {
                this.destinationDiskId = destinationDiskId;
                return this;
            }

            /**
             * DestinationRegion.
             */
            public Builder destinationRegion(String destinationRegion) {
                this.destinationRegion = destinationRegion;
                return this;
            }

            /**
             * 从盘所属的可用区。
             */
            public Builder destinationZoneId(String destinationZoneId) {
                this.destinationZoneId = destinationZoneId;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * 最近一次异步复制操作完成的时间。该参数以时间戳的形式提供返回值。单位为秒。
             */
            public Builder lastRecoverPoint(Long lastRecoverPoint) {
                this.lastRecoverPoint = lastRecoverPoint;
                return this;
            }

            /**
             * PairName.
             */
            public Builder pairName(String pairName) {
                this.pairName = pairName;
                return this;
            }

            /**
             * 复制对的初始源地域。
             */
            public Builder primaryRegion(String primaryRegion) {
                this.primaryRegion = primaryRegion;
                return this;
            }

            /**
             * 复制对的初始源可用区。
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * 复制对的RPO值。单位为秒。
             */
            public Builder RPO(Long RPO) {
                this.RPO = RPO;
                return this;
            }

            /**
             * 所属复制组id。
             */
            public Builder replicaGroupId(String replicaGroupId) {
                this.replicaGroupId = replicaGroupId;
                return this;
            }

            /**
             * 所属复制组名称。
             */
            public Builder replicaGroupName(String replicaGroupName) {
                this.replicaGroupName = replicaGroupName;
                return this;
            }

            /**
             * ReplicaPairId.
             */
            public Builder replicaPairId(String replicaPairId) {
                this.replicaPairId = replicaPairId;
                return this;
            }

            /**
             * 复制对信息的后端站点来源，production或backup。
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * SourceDiskId.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * SourceRegion.
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * 主盘所属的可用区。
             */
            public Builder sourceZoneId(String sourceZoneId) {
                this.sourceZoneId = sourceZoneId;
                return this;
            }

            /**
             * 复制对的初始目的地域。
             */
            public Builder standbyRegion(String standbyRegion) {
                this.standbyRegion = standbyRegion;
                return this;
            }

            /**
             * 复制对的初始目的可用区。
             */
            public Builder standbyZone(String standbyZone) {
                this.standbyZone = standbyZone;
                return this;
            }

            /**
             * 异步复制关系的状态。可能值：
             * <p>
             * 
             * - invalid：失效。该状态表示异步复制关系存在异常。
             * - creating：创建中。
             * - created：已创建。
             * - create_failed：创建失败。
             * - initial_syncing：初始同步中。异步复制在创建并启动后，主盘数据初次异步复制到从盘的过程中，将处于该状态。
             * - syncing：同步中。主盘和从盘之间非第一次进行异步复制数据时，将处于该状态。
             * - manual_syncing：单次同步中。单次同步，同步完成后恢复到stopped状态。如果是第一次单次同步，则同步中也显示为状态manual_syncing。
             * - normal：正常。当异步复制的当前周期内数据复制完成时，将处于该状态。
             * - stopping：停止中。
             * - stopped：已停止。
             * - stop_failed：停止失败。
             * - failovering：故障切换中。
             * - failovered：故障切换完成。
             * - failover_failed：故障切换失败。
             * - reprotecting：反向复制操作中。
             * - reprotect_failed：反向复制失败。
             * - deleting：删除中。
             * - delete_failed：删除失败。
             * - deleted：已删除。
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 复制对的状态提示信息。比如invalid时，可能值：DeviceRemoved：主盘或者从盘被删除。DeviceKeyChanged：主盘或从盘的DeviceKey映射发生变化。
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public ReplicaPairs build() {
                return new ReplicaPairs(this);
            } 

        } 

    }
}
