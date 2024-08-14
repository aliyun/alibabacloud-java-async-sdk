// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicaGroupDrillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicaGroupDrillsResponseBody</p>
 */
public class DescribeReplicaGroupDrillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Drills")
    private java.util.List < Drills> drills;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeReplicaGroupDrillsResponseBody(Builder builder) {
        this.drills = builder.drills;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicaGroupDrillsResponseBody create() {
        return builder().build();
    }

    /**
     * @return drills
     */
    public java.util.List < Drills> getDrills() {
        return this.drills;
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
        private java.util.List < Drills> drills; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The information of disaster recovery drills that were performed on the replication pair-consistent group.
         */
        public Builder drills(java.util.List < Drills> drills) {
            this.drills = drills;
            return this;
        }

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
         * The request ID.
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

        public DescribeReplicaGroupDrillsResponseBody build() {
            return new DescribeReplicaGroupDrillsResponseBody(this);
        } 

    } 

    public static class PairsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrillDiskId")
        private String drillDiskId;

        @com.aliyun.core.annotation.NameInMap("DrillDiskStatus")
        private String drillDiskStatus;

        @com.aliyun.core.annotation.NameInMap("PairId")
        private String pairId;

        private PairsInfo(Builder builder) {
            this.drillDiskId = builder.drillDiskId;
            this.drillDiskStatus = builder.drillDiskStatus;
            this.pairId = builder.pairId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PairsInfo create() {
            return builder().build();
        }

        /**
         * @return drillDiskId
         */
        public String getDrillDiskId() {
            return this.drillDiskId;
        }

        /**
         * @return drillDiskStatus
         */
        public String getDrillDiskStatus() {
            return this.drillDiskStatus;
        }

        /**
         * @return pairId
         */
        public String getPairId() {
            return this.pairId;
        }

        public static final class Builder {
            private String drillDiskId; 
            private String drillDiskStatus; 
            private String pairId; 

            /**
             * The ID of the drill disk.
             */
            public Builder drillDiskId(String drillDiskId) {
                this.drillDiskId = drillDiskId;
                return this;
            }

            /**
             * The status of the drill disk. Valid values:
             * <p>
             * 
             * *   created
             * *   deleted
             * *   creating
             * *   deleting
             * 
             * >  This parameter can also display error code details if your drill disk fails to be created or deleted.
             */
            public Builder drillDiskStatus(String drillDiskStatus) {
                this.drillDiskStatus = drillDiskStatus;
                return this;
            }

            /**
             * The ID of the replication pair.
             */
            public Builder pairId(String pairId) {
                this.pairId = pairId;
                return this;
            }

            public PairsInfo build() {
                return new PairsInfo(this);
            } 

        } 

    }
    public static class Drills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DrillId")
        private String drillId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("PairsInfo")
        private java.util.List < PairsInfo> pairsInfo;

        @com.aliyun.core.annotation.NameInMap("RecoverPoint")
        private Long recoverPoint;

        @com.aliyun.core.annotation.NameInMap("StartAt")
        private Long startAt;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        private Drills(Builder builder) {
            this.drillId = builder.drillId;
            this.groupId = builder.groupId;
            this.pairsInfo = builder.pairsInfo;
            this.recoverPoint = builder.recoverPoint;
            this.startAt = builder.startAt;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Drills create() {
            return builder().build();
        }

        /**
         * @return drillId
         */
        public String getDrillId() {
            return this.drillId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return pairsInfo
         */
        public java.util.List < PairsInfo> getPairsInfo() {
            return this.pairsInfo;
        }

        /**
         * @return recoverPoint
         */
        public Long getRecoverPoint() {
            return this.recoverPoint;
        }

        /**
         * @return startAt
         */
        public Long getStartAt() {
            return this.startAt;
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
            private String drillId; 
            private String groupId; 
            private java.util.List < PairsInfo> pairsInfo; 
            private Long recoverPoint; 
            private Long startAt; 
            private String status; 
            private String statusMessage; 

            /**
             * The ID of the drill.
             */
            public Builder drillId(String drillId) {
                this.drillId = drillId;
                return this;
            }

            /**
             * The ID of the replication pair-consistent group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The information of replication pairs.
             */
            public Builder pairsInfo(java.util.List < PairsInfo> pairsInfo) {
                this.pairsInfo = pairsInfo;
                return this;
            }

            /**
             * The recovery point of the drill. The value of this parameter is a timestamp. Unit: seconds.
             */
            public Builder recoverPoint(Long recoverPoint) {
                this.recoverPoint = recoverPoint;
                return this;
            }

            /**
             * The beginning time of the drill. The value of this parameter is a timestamp. Unit: seconds.
             */
            public Builder startAt(Long startAt) {
                this.startAt = startAt;
                return this;
            }

            /**
             * The status of the drill. Valid values:
             * <p>
             * 
             * *   execute_failed
             * *   executed
             * *   executing
             * *   clear_failed
             * *   clearing
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The error message that appears if the drill fails to be executed.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public Drills build() {
                return new Drills(this);
            } 

        } 

    }
}
