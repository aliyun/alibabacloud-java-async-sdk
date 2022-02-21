// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReplicaPairsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeReplicaPairsResponseBody</p>
 */
public class DescribeReplicaPairsResponseBody extends TeaModel {
    @NameInMap("DiskReplicaPairs")
    private java.util.List < DiskReplicaPairs> diskReplicaPairs;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeReplicaPairsResponseBody(Builder builder) {
        this.diskReplicaPairs = builder.diskReplicaPairs;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReplicaPairsResponseBody create() {
        return builder().build();
    }

    /**
     * @return diskReplicaPairs
     */
    public java.util.List < DiskReplicaPairs> getDiskReplicaPairs() {
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
        private java.util.List < DiskReplicaPairs> diskReplicaPairs; 
        private String nextToken; 
        private String requestId; 

        /**
         * DiskReplicaPairs.
         */
        public Builder diskReplicaPairs(java.util.List < DiskReplicaPairs> diskReplicaPairs) {
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

        public DescribeReplicaPairsResponseBody build() {
            return new DescribeReplicaPairsResponseBody(this);
        } 

    } 

    public static class DiskReplicaPairs extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestinationDiskId")
        private String destinationDiskId;

        @NameInMap("DestinationRegion")
        private String destinationRegion;

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

        private DiskReplicaPairs(Builder builder) {
            this.description = builder.description;
            this.destinationDiskId = builder.destinationDiskId;
            this.destinationRegion = builder.destinationRegion;
            this.pairName = builder.pairName;
            this.replicaPairId = builder.replicaPairId;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceRegion = builder.sourceRegion;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskReplicaPairs create() {
            return builder().build();
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

        public static final class Builder {
            private String description; 
            private String destinationDiskId; 
            private String destinationRegion; 
            private String pairName; 
            private String replicaPairId; 
            private String sourceDiskId; 
            private String sourceRegion; 
            private String status; 

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

            public DiskReplicaPairs build() {
                return new DiskReplicaPairs(this);
            } 

        } 

    }
}
