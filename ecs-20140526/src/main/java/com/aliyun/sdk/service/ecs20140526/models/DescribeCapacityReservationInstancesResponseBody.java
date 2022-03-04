// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapacityReservationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapacityReservationInstancesResponseBody</p>
 */
public class DescribeCapacityReservationInstancesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("CapacityReservationItem")
    private CapacityReservationItem capacityReservationItem;

    private DescribeCapacityReservationInstancesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.maxResults = builder.maxResults;
        this.capacityReservationItem = builder.capacityReservationItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityReservationInstancesResponseBody create() {
        return builder().build();
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

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return capacityReservationItem
     */
    public CapacityReservationItem getCapacityReservationItem() {
        return this.capacityReservationItem;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private Integer maxResults; 
        private CapacityReservationItem capacityReservationItem; 

        /**
         * The start flag of the next query in the capacity reservation service.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of records that meet the query criteria.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The number of rows displayed on each page of the capacity reservation service.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The list of instances that have been matched by the capacity reservation service.
         */
        public Builder capacityReservationItem(CapacityReservationItem capacityReservationItem) {
            this.capacityReservationItem = capacityReservationItem;
            return this;
        }

        public DescribeCapacityReservationInstancesResponseBody build() {
            return new DescribeCapacityReservationInstancesResponseBody(this);
        } 

    } 

    public static class InstanceIdSet extends TeaModel {
        @NameInMap("InstanceId")
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
             * The ID of the instance.
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
        @NameInMap("InstanceIdSet")
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
