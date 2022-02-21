// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHdfsCapacityStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetHdfsCapacityStatisticInfoResponseBody</p>
 */
public class GetHdfsCapacityStatisticInfoResponseBody extends TeaModel {
    @NameInMap("HdfsCapacityList")
    private HdfsCapacityList hdfsCapacityList;

    @NameInMap("RequestId")
    private String requestId;

    private GetHdfsCapacityStatisticInfoResponseBody(Builder builder) {
        this.hdfsCapacityList = builder.hdfsCapacityList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHdfsCapacityStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return hdfsCapacityList
     */
    public HdfsCapacityList getHdfsCapacityList() {
        return this.hdfsCapacityList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HdfsCapacityList hdfsCapacityList; 
        private String requestId; 

        /**
         * HdfsCapacityList.
         */
        public Builder hdfsCapacityList(HdfsCapacityList hdfsCapacityList) {
            this.hdfsCapacityList = hdfsCapacityList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHdfsCapacityStatisticInfoResponseBody build() {
            return new GetHdfsCapacityStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatHdfsCapacity extends TeaModel {
        @NameInMap("CapacityRemaining")
        private Long capacityRemaining;

        @NameInMap("CapacityRemainingGB")
        private Long capacityRemainingGB;

        @NameInMap("CapacityTotal")
        private Long capacityTotal;

        @NameInMap("CapacityTotalGB")
        private Long capacityTotalGB;

        @NameInMap("CapacityUsed")
        private Long capacityUsed;

        @NameInMap("CapacityUsedGB")
        private Long capacityUsedGB;

        @NameInMap("CapacityUsedNonDfs")
        private Long capacityUsedNonDfs;

        @NameInMap("ClusterBizId")
        private String clusterBizId;

        @NameInMap("DateTime")
        private String dateTime;

        private ClusterStatHdfsCapacity(Builder builder) {
            this.capacityRemaining = builder.capacityRemaining;
            this.capacityRemainingGB = builder.capacityRemainingGB;
            this.capacityTotal = builder.capacityTotal;
            this.capacityTotalGB = builder.capacityTotalGB;
            this.capacityUsed = builder.capacityUsed;
            this.capacityUsedGB = builder.capacityUsedGB;
            this.capacityUsedNonDfs = builder.capacityUsedNonDfs;
            this.clusterBizId = builder.clusterBizId;
            this.dateTime = builder.dateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatHdfsCapacity create() {
            return builder().build();
        }

        /**
         * @return capacityRemaining
         */
        public Long getCapacityRemaining() {
            return this.capacityRemaining;
        }

        /**
         * @return capacityRemainingGB
         */
        public Long getCapacityRemainingGB() {
            return this.capacityRemainingGB;
        }

        /**
         * @return capacityTotal
         */
        public Long getCapacityTotal() {
            return this.capacityTotal;
        }

        /**
         * @return capacityTotalGB
         */
        public Long getCapacityTotalGB() {
            return this.capacityTotalGB;
        }

        /**
         * @return capacityUsed
         */
        public Long getCapacityUsed() {
            return this.capacityUsed;
        }

        /**
         * @return capacityUsedGB
         */
        public Long getCapacityUsedGB() {
            return this.capacityUsedGB;
        }

        /**
         * @return capacityUsedNonDfs
         */
        public Long getCapacityUsedNonDfs() {
            return this.capacityUsedNonDfs;
        }

        /**
         * @return clusterBizId
         */
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        public static final class Builder {
            private Long capacityRemaining; 
            private Long capacityRemainingGB; 
            private Long capacityTotal; 
            private Long capacityTotalGB; 
            private Long capacityUsed; 
            private Long capacityUsedGB; 
            private Long capacityUsedNonDfs; 
            private String clusterBizId; 
            private String dateTime; 

            /**
             * CapacityRemaining.
             */
            public Builder capacityRemaining(Long capacityRemaining) {
                this.capacityRemaining = capacityRemaining;
                return this;
            }

            /**
             * CapacityRemainingGB.
             */
            public Builder capacityRemainingGB(Long capacityRemainingGB) {
                this.capacityRemainingGB = capacityRemainingGB;
                return this;
            }

            /**
             * CapacityTotal.
             */
            public Builder capacityTotal(Long capacityTotal) {
                this.capacityTotal = capacityTotal;
                return this;
            }

            /**
             * CapacityTotalGB.
             */
            public Builder capacityTotalGB(Long capacityTotalGB) {
                this.capacityTotalGB = capacityTotalGB;
                return this;
            }

            /**
             * CapacityUsed.
             */
            public Builder capacityUsed(Long capacityUsed) {
                this.capacityUsed = capacityUsed;
                return this;
            }

            /**
             * CapacityUsedGB.
             */
            public Builder capacityUsedGB(Long capacityUsedGB) {
                this.capacityUsedGB = capacityUsedGB;
                return this;
            }

            /**
             * CapacityUsedNonDfs.
             */
            public Builder capacityUsedNonDfs(Long capacityUsedNonDfs) {
                this.capacityUsedNonDfs = capacityUsedNonDfs;
                return this;
            }

            /**
             * ClusterBizId.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * DateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            public ClusterStatHdfsCapacity build() {
                return new ClusterStatHdfsCapacity(this);
            } 

        } 

    }
    public static class HdfsCapacityList extends TeaModel {
        @NameInMap("ClusterStatHdfsCapacity")
        private java.util.List < ClusterStatHdfsCapacity> clusterStatHdfsCapacity;

        private HdfsCapacityList(Builder builder) {
            this.clusterStatHdfsCapacity = builder.clusterStatHdfsCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HdfsCapacityList create() {
            return builder().build();
        }

        /**
         * @return clusterStatHdfsCapacity
         */
        public java.util.List < ClusterStatHdfsCapacity> getClusterStatHdfsCapacity() {
            return this.clusterStatHdfsCapacity;
        }

        public static final class Builder {
            private java.util.List < ClusterStatHdfsCapacity> clusterStatHdfsCapacity; 

            /**
             * ClusterStatHdfsCapacity.
             */
            public Builder clusterStatHdfsCapacity(java.util.List < ClusterStatHdfsCapacity> clusterStatHdfsCapacity) {
                this.clusterStatHdfsCapacity = clusterStatHdfsCapacity;
                return this;
            }

            public HdfsCapacityList build() {
                return new HdfsCapacityList(this);
            } 

        } 

    }
}
