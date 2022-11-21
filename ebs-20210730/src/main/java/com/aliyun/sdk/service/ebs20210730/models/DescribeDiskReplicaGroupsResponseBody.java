// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskReplicaGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaGroupsResponseBody</p>
 */
public class DescribeDiskReplicaGroupsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("ReplicaGroups")
    private java.util.List < ReplicaGroups> replicaGroups;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * ReplicaGroups.
         */
        public Builder replicaGroups(java.util.List < ReplicaGroups> replicaGroups) {
            this.replicaGroups = replicaGroups;
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

        public DescribeDiskReplicaGroupsResponseBody build() {
            return new DescribeDiskReplicaGroupsResponseBody(this);
        } 

    } 

    public static class ReplicaGroups extends TeaModel {
        @NameInMap("Bandwidth")
        private Long bandwidth;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationRegionId")
        private String destinationRegionId;

        @NameInMap("DestinationZoneId")
        private String destinationZoneId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("LastRecoverPoint")
        private Long lastRecoverPoint;

        @NameInMap("PairIds")
        private java.util.List < byte[] > pairIds;

        @NameInMap("PairNumber")
        private Long pairNumber;

        @NameInMap("PrimaryRegion")
        private String primaryRegion;

        @NameInMap("PrimaryZone")
        private String primaryZone;

        @NameInMap("RPO")
        private Long RPO;

        @NameInMap("ReplicaGroupId")
        private String replicaGroupId;

        @NameInMap("Site")
        private String site;

        @NameInMap("SourceRegionId")
        private String sourceRegionId;

        @NameInMap("SourceZoneId")
        private String sourceZoneId;

        @NameInMap("StandbyRegion")
        private String standbyRegion;

        @NameInMap("StandbyZone")
        private String standbyZone;

        @NameInMap("Status")
        private String status;

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
            this.site = builder.site;
            this.sourceRegionId = builder.sourceRegionId;
            this.sourceZoneId = builder.sourceZoneId;
            this.standbyRegion = builder.standbyRegion;
            this.standbyZone = builder.standbyZone;
            this.status = builder.status;
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
            private String site; 
            private String sourceRegionId; 
            private String sourceZoneId; 
            private String standbyRegion; 
            private String standbyZone; 
            private String status; 

            /**
             * 带宽值，单位为Kbps。公共云暂不支持。
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
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
             * DestinationRegionId.
             */
            public Builder destinationRegionId(String destinationRegionId) {
                this.destinationRegionId = destinationRegionId;
                return this;
            }

            /**
             * DestinationZoneId.
             */
            public Builder destinationZoneId(String destinationZoneId) {
                this.destinationZoneId = destinationZoneId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * LastRecoverPoint.
             */
            public Builder lastRecoverPoint(Long lastRecoverPoint) {
                this.lastRecoverPoint = lastRecoverPoint;
                return this;
            }

            /**
             * PairIds.
             */
            public Builder pairIds(java.util.List < byte[] > pairIds) {
                this.pairIds = pairIds;
                return this;
            }

            /**
             * 复制组中的复制对个数
             */
            public Builder pairNumber(Long pairNumber) {
                this.pairNumber = pairNumber;
                return this;
            }

            /**
             * 复制组的初始源地域。
             */
            public Builder primaryRegion(String primaryRegion) {
                this.primaryRegion = primaryRegion;
                return this;
            }

            /**
             * 复制组的初始源可用区。
             */
            public Builder primaryZone(String primaryZone) {
                this.primaryZone = primaryZone;
                return this;
            }

            /**
             * RPO.
             */
            public Builder RPO(Long RPO) {
                this.RPO = RPO;
                return this;
            }

            /**
             * ReplicaGroupId.
             */
            public Builder replicaGroupId(String replicaGroupId) {
                this.replicaGroupId = replicaGroupId;
                return this;
            }

            /**
             * pair信息的后端站点来源，production或backup
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            /**
             * SourceRegionId.
             */
            public Builder sourceRegionId(String sourceRegionId) {
                this.sourceRegionId = sourceRegionId;
                return this;
            }

            /**
             * SourceZoneId.
             */
            public Builder sourceZoneId(String sourceZoneId) {
                this.sourceZoneId = sourceZoneId;
                return this;
            }

            /**
             * 复制组的初始目的地域。
             */
            public Builder standbyRegion(String standbyRegion) {
                this.standbyRegion = standbyRegion;
                return this;
            }

            /**
             * 复制组的初始目的可用区。
             */
            public Builder standbyZone(String standbyZone) {
                this.standbyZone = standbyZone;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReplicaGroups build() {
                return new ReplicaGroups(this);
            } 

        } 

    }
}
