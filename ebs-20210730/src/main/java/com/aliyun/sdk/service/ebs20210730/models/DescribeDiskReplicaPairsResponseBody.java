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

    @NameInMap("ReplicaPairs")
    private java.util.List < ReplicaPairs> replicaPairs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiskReplicaPairsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.replicaPairs = builder.replicaPairs;
        this.requestId = builder.requestId;
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

    public static final class Builder {
        private String nextToken; 
        private java.util.List < ReplicaPairs> replicaPairs; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public DescribeDiskReplicaPairsResponseBody build() {
            return new DescribeDiskReplicaPairsResponseBody(this);
        } 

    } 

    public static class ReplicaPairs extends TeaModel {
        @NameInMap("AsyncCycle")
        private Long asyncCycle;

        @NameInMap("Bandwidth")
        private Long bandwidth;

        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationDiskId")
        private String destinationDiskId;

        @NameInMap("DestinationRegion")
        private String destinationRegion;

        @NameInMap("LastRPO")
        private Long lastRPO;

        @NameInMap("PairName")
        private String pairName;

        @NameInMap("ReplicaPairId")
        private String replicaPairId;

        @NameInMap("SourceDiskId")
        private String sourceDiskId;

        @NameInMap("SourceRegion")
        private String sourceRegion;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        private ReplicaPairs(Builder builder) {
            this.asyncCycle = builder.asyncCycle;
            this.bandwidth = builder.bandwidth;
            this.description = builder.description;
            this.destinationDiskId = builder.destinationDiskId;
            this.destinationRegion = builder.destinationRegion;
            this.lastRPO = builder.lastRPO;
            this.pairName = builder.pairName;
            this.replicaPairId = builder.replicaPairId;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceRegion = builder.sourceRegion;
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
         * @return asyncCycle
         */
        public Long getAsyncCycle() {
            return this.asyncCycle;
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
         * @return lastRPO
         */
        public Long getLastRPO() {
            return this.lastRPO;
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
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public static final class Builder {
            private Long asyncCycle; 
            private Long bandwidth; 
            private String description; 
            private String destinationDiskId; 
            private String destinationRegion; 
            private Long lastRPO; 
            private String pairName; 
            private String replicaPairId; 
            private String sourceDiskId; 
            private String sourceRegion; 
            private String status; 
            private String statusMessage; 

            /**
             * AsyncCycle.
             */
            public Builder asyncCycle(Long asyncCycle) {
                this.asyncCycle = asyncCycle;
                return this;
            }

            /**
             * Bandwidth.
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
             * LastRPO.
             */
            public Builder lastRPO(Long lastRPO) {
                this.lastRPO = lastRPO;
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
             * StatusMessage.
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
