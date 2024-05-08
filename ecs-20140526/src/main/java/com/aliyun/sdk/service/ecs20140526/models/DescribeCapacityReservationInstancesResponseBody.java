// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapacityReservationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapacityReservationInstancesResponseBody</p>
 */
public class DescribeCapacityReservationInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapacityReservationItem")
    private CapacityReservationItem capacityReservationItem;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCapacityReservationInstancesResponseBody(Builder builder) {
        this.capacityReservationItem = builder.capacityReservationItem;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityReservationInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return capacityReservationItem
     */
    public CapacityReservationItem getCapacityReservationItem() {
        return this.capacityReservationItem;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CapacityReservationItem capacityReservationItem; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The instance ID.
         */
        public Builder capacityReservationItem(CapacityReservationItem capacityReservationItem) {
            this.capacityReservationItem = capacityReservationItem;
            return this;
        }

        /**
         * Details about the instances that match the capacity reservation.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The maximum number of entries returned per page.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCapacityReservationInstancesResponseBody build() {
            return new DescribeCapacityReservationInstancesResponseBody(this);
        } 

    } 

    public static class InstanceIdSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private InstanceIdSet(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceIdSet create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceIdSet build() {
                return new InstanceIdSet(this);
            } 

        } 

    }
    public static class CapacityReservationItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceIdSet")
        private java.util.List < InstanceIdSet> instanceIdSet;

        private CapacityReservationItem(Builder builder) {
            this.instanceIdSet = builder.instanceIdSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityReservationItem create() {
            return builder().build();
        }

        /**
         * @return instanceIdSet
         */
        public java.util.List < InstanceIdSet> getInstanceIdSet() {
            return this.instanceIdSet;
        }

        public static final class Builder {
            private java.util.List < InstanceIdSet> instanceIdSet; 

            /**
             * InstanceIdSet.
             */
            public Builder instanceIdSet(java.util.List < InstanceIdSet> instanceIdSet) {
                this.instanceIdSet = instanceIdSet;
                return this;
            }

            public CapacityReservationItem build() {
                return new CapacityReservationItem(this);
            } 

        } 

    }
}
