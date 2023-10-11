// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicaGroupDrillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicaGroupDrillsResponseBody</p>
 */
public class DescribeReplicaGroupDrillsResponseBody extends TeaModel {
    @NameInMap("Drills")
    private java.util.List < Drills> drills;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Drills.
         */
        public Builder drills(java.util.List < Drills> drills) {
            this.drills = drills;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeReplicaGroupDrillsResponseBody build() {
            return new DescribeReplicaGroupDrillsResponseBody(this);
        } 

    } 

    public static class PairsInfo extends TeaModel {
        @NameInMap("DrillDiskId")
        private String drillDiskId;

        @NameInMap("DrillDiskStatus")
        private String drillDiskStatus;

        @NameInMap("PairId")
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
             * DrillDiskId.
             */
            public Builder drillDiskId(String drillDiskId) {
                this.drillDiskId = drillDiskId;
                return this;
            }

            /**
             * DrillDiskStatus.
             */
            public Builder drillDiskStatus(String drillDiskStatus) {
                this.drillDiskStatus = drillDiskStatus;
                return this;
            }

            /**
             * PairId.
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
        @NameInMap("DrillId")
        private String drillId;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("PairsInfo")
        private java.util.List < PairsInfo> pairsInfo;

        @NameInMap("RecoverPoint")
        private Long recoverPoint;

        @NameInMap("StartAt")
        private Long startAt;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
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
             * DrillId.
             */
            public Builder drillId(String drillId) {
                this.drillId = drillId;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * PairsInfo.
             */
            public Builder pairsInfo(java.util.List < PairsInfo> pairsInfo) {
                this.pairsInfo = pairsInfo;
                return this;
            }

            /**
             * RecoverPoint.
             */
            public Builder recoverPoint(Long recoverPoint) {
                this.recoverPoint = recoverPoint;
                return this;
            }

            /**
             * StartAt.
             */
            public Builder startAt(Long startAt) {
                this.startAt = startAt;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusMessage.
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
