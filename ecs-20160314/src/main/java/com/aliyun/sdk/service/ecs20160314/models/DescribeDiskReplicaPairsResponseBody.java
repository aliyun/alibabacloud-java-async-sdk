// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

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
    @NameInMap("DiskReplicaPairs")
    private DiskReplicaPairs diskReplicaPairs;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiskReplicaPairsResponseBody(Builder builder) {
        this.diskReplicaPairs = builder.diskReplicaPairs;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskReplicaPairsResponseBody create() {
        return builder().build();
    }

    /**
     * @return diskReplicaPairs
     */
    public DiskReplicaPairs getDiskReplicaPairs() {
        return this.diskReplicaPairs;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DiskReplicaPairs diskReplicaPairs; 
        private String nextToken; 
        private String requestId; 

        /**
         * DiskReplicaPairs.
         */
        public Builder diskReplicaPairs(DiskReplicaPairs diskReplicaPairs) {
            this.diskReplicaPairs = diskReplicaPairs;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskReplicaPairsResponseBody build() {
            return new DescribeDiskReplicaPairsResponseBody(this);
        } 

    } 

    public static class DiskReplicaPair extends TeaModel {
        @NameInMap("AsyncCycle")
        private Integer asyncCycle;

        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationDiskId")
        private String destinationDiskId;

        @NameInMap("DestinationRegion")
        private String destinationRegion;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("PairName")
        private String pairName;

        @NameInMap("ReplicaPairId")
        private String replicaPairId;

        @NameInMap("RpoTime")
        private String rpoTime;

        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("SourceRegion")
        private String sourceRegion;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalCopiedSize")
        private Long totalCopiedSize;

        private DiskReplicaPair(Builder builder) {
            this.asyncCycle = builder.asyncCycle;
            this.bandwidth = builder.bandwidth;
            this.description = builder.description;
            this.destinationDiskId = builder.destinationDiskId;
            this.destinationRegion = builder.destinationRegion;
            this.healthStatus = builder.healthStatus;
            this.pairName = builder.pairName;
            this.replicaPairId = builder.replicaPairId;
            this.rpoTime = builder.rpoTime;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceRegion = builder.sourceRegion;
            this.status = builder.status;
            this.totalCopiedSize = builder.totalCopiedSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskReplicaPair create() {
            return builder().build();
        }

        /**
         * @return asyncCycle
         */
        public Integer getAsyncCycle() {
            return this.asyncCycle;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
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
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return pairName
         */
        public String getPairName() {
            return this.pairName;
        }

        /**
         * @return replicaPairId
         */
        public String getReplicaPairId() {
            return this.replicaPairId;
        }

        /**
         * @return rpoTime
         */
        public String getRpoTime() {
            return this.rpoTime;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCopiedSize
         */
        public Long getTotalCopiedSize() {
            return this.totalCopiedSize;
        }

        public static final class Builder {
            private Integer asyncCycle; 
            private Integer bandwidth; 
            private String description; 
            private String destinationDiskId; 
            private String destinationRegion; 
            private String healthStatus; 
            private String pairName; 
            private String replicaPairId; 
            private String rpoTime; 
            private String sourceDiskId; 
            private String sourceRegion; 
            private String status; 
            private Long totalCopiedSize; 

            /**
             * AsyncCycle.
             */
            public Builder asyncCycle(Integer asyncCycle) {
                this.asyncCycle = asyncCycle;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Integer bandwidth) {
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
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
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
             * ReplicaPairId.
             */
            public Builder replicaPairId(String replicaPairId) {
                this.replicaPairId = replicaPairId;
                return this;
            }

            /**
             * RpoTime.
             */
            public Builder rpoTime(String rpoTime) {
                this.rpoTime = rpoTime;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalCopiedSize.
             */
            public Builder totalCopiedSize(Long totalCopiedSize) {
                this.totalCopiedSize = totalCopiedSize;
                return this;
            }

            public DiskReplicaPair build() {
                return new DiskReplicaPair(this);
            } 

        } 

    }
    public static class DiskReplicaPairs extends TeaModel {
        @NameInMap("DiskReplicaPair")
        private java.util.List < DiskReplicaPair> diskReplicaPair;

        private DiskReplicaPairs(Builder builder) {
            this.diskReplicaPair = builder.diskReplicaPair;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskReplicaPairs create() {
            return builder().build();
        }

        /**
         * @return diskReplicaPair
         */
        public java.util.List < DiskReplicaPair> getDiskReplicaPair() {
            return this.diskReplicaPair;
        }

        public static final class Builder {
            private java.util.List < DiskReplicaPair> diskReplicaPair; 

            /**
             * DiskReplicaPair.
             */
            public Builder diskReplicaPair(java.util.List < DiskReplicaPair> diskReplicaPair) {
                this.diskReplicaPair = diskReplicaPair;
                return this;
            }

            public DiskReplicaPairs build() {
                return new DiskReplicaPairs(this);
            } 

        } 

    }
}
