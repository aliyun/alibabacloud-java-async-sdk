// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCenInterRegionTrafficQosPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCenInterRegionTrafficQosPoliciesResponseBody</p>
 */
public class ListCenInterRegionTrafficQosPoliciesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TrafficQosPolicies")
    private java.util.List < TrafficQosPolicies> trafficQosPolicies;

    private ListCenInterRegionTrafficQosPoliciesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficQosPolicies = builder.trafficQosPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCenInterRegionTrafficQosPoliciesResponseBody create() {
        return builder().build();
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

    /**
     * @return trafficQosPolicies
     */
    public java.util.List < TrafficQosPolicies> getTrafficQosPolicies() {
        return this.trafficQosPolicies;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TrafficQosPolicies> trafficQosPolicies; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query.
         * <p>
         * 
         * *   If **NextToken** was not returned in the previous query, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * A list of QoS policies.
         */
        public Builder trafficQosPolicies(java.util.List < TrafficQosPolicies> trafficQosPolicies) {
            this.trafficQosPolicies = trafficQosPolicies;
            return this;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBody build() {
            return new ListCenInterRegionTrafficQosPoliciesResponseBody(this);
        } 

    } 

    public static class TrafficQosQueues extends TeaModel {
        @NameInMap("Dscps")
        private java.util.List < Integer > dscps;

        @NameInMap("QosQueueDescription")
        private String qosQueueDescription;

        @NameInMap("QosQueueId")
        private String qosQueueId;

        @NameInMap("QosQueueName")
        private String qosQueueName;

        @NameInMap("RemainBandwidthPercent")
        private Integer remainBandwidthPercent;

        private TrafficQosQueues(Builder builder) {
            this.dscps = builder.dscps;
            this.qosQueueDescription = builder.qosQueueDescription;
            this.qosQueueId = builder.qosQueueId;
            this.qosQueueName = builder.qosQueueName;
            this.remainBandwidthPercent = builder.remainBandwidthPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficQosQueues create() {
            return builder().build();
        }

        /**
         * @return dscps
         */
        public java.util.List < Integer > getDscps() {
            return this.dscps;
        }

        /**
         * @return qosQueueDescription
         */
        public String getQosQueueDescription() {
            return this.qosQueueDescription;
        }

        /**
         * @return qosQueueId
         */
        public String getQosQueueId() {
            return this.qosQueueId;
        }

        /**
         * @return qosQueueName
         */
        public String getQosQueueName() {
            return this.qosQueueName;
        }

        /**
         * @return remainBandwidthPercent
         */
        public Integer getRemainBandwidthPercent() {
            return this.remainBandwidthPercent;
        }

        public static final class Builder {
            private java.util.List < Integer > dscps; 
            private String qosQueueDescription; 
            private String qosQueueId; 
            private String qosQueueName; 
            private Integer remainBandwidthPercent; 

            /**
             * The differentiated services code point (DSCP) value used to match packets in the queue.
             */
            public Builder dscps(java.util.List < Integer > dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * The description of the queue.
             */
            public Builder qosQueueDescription(String qosQueueDescription) {
                this.qosQueueDescription = qosQueueDescription;
                return this;
            }

            /**
             * The ID of the queue.
             */
            public Builder qosQueueId(String qosQueueId) {
                this.qosQueueId = qosQueueId;
                return this;
            }

            /**
             * The name of the queue.
             */
            public Builder qosQueueName(String qosQueueName) {
                this.qosQueueName = qosQueueName;
                return this;
            }

            /**
             * The percentage of the inter-region bandwidth that can be used by the queue.
             */
            public Builder remainBandwidthPercent(Integer remainBandwidthPercent) {
                this.remainBandwidthPercent = remainBandwidthPercent;
                return this;
            }

            public TrafficQosQueues build() {
                return new TrafficQosQueues(this);
            } 

        } 

    }
    public static class TrafficQosPolicies extends TeaModel {
        @NameInMap("TrafficQosPolicyDescription")
        private String trafficQosPolicyDescription;

        @NameInMap("TrafficQosPolicyId")
        private String trafficQosPolicyId;

        @NameInMap("TrafficQosPolicyName")
        private String trafficQosPolicyName;

        @NameInMap("TrafficQosPolicyStatus")
        private String trafficQosPolicyStatus;

        @NameInMap("TrafficQosQueues")
        private java.util.List < TrafficQosQueues> trafficQosQueues;

        @NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        private TrafficQosPolicies(Builder builder) {
            this.trafficQosPolicyDescription = builder.trafficQosPolicyDescription;
            this.trafficQosPolicyId = builder.trafficQosPolicyId;
            this.trafficQosPolicyName = builder.trafficQosPolicyName;
            this.trafficQosPolicyStatus = builder.trafficQosPolicyStatus;
            this.trafficQosQueues = builder.trafficQosQueues;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficQosPolicies create() {
            return builder().build();
        }

        /**
         * @return trafficQosPolicyDescription
         */
        public String getTrafficQosPolicyDescription() {
            return this.trafficQosPolicyDescription;
        }

        /**
         * @return trafficQosPolicyId
         */
        public String getTrafficQosPolicyId() {
            return this.trafficQosPolicyId;
        }

        /**
         * @return trafficQosPolicyName
         */
        public String getTrafficQosPolicyName() {
            return this.trafficQosPolicyName;
        }

        /**
         * @return trafficQosPolicyStatus
         */
        public String getTrafficQosPolicyStatus() {
            return this.trafficQosPolicyStatus;
        }

        /**
         * @return trafficQosQueues
         */
        public java.util.List < TrafficQosQueues> getTrafficQosQueues() {
            return this.trafficQosQueues;
        }

        /**
         * @return transitRouterAttachmentId
         */
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private String trafficQosPolicyDescription; 
            private String trafficQosPolicyId; 
            private String trafficQosPolicyName; 
            private String trafficQosPolicyStatus; 
            private java.util.List < TrafficQosQueues> trafficQosQueues; 
            private String transitRouterAttachmentId; 
            private String transitRouterId; 

            /**
             * The description of the QoS policy.
             */
            public Builder trafficQosPolicyDescription(String trafficQosPolicyDescription) {
                this.trafficQosPolicyDescription = trafficQosPolicyDescription;
                return this;
            }

            /**
             * The ID of the QoS policy.
             */
            public Builder trafficQosPolicyId(String trafficQosPolicyId) {
                this.trafficQosPolicyId = trafficQosPolicyId;
                return this;
            }

            /**
             * The name of the QoS policy.
             */
            public Builder trafficQosPolicyName(String trafficQosPolicyName) {
                this.trafficQosPolicyName = trafficQosPolicyName;
                return this;
            }

            /**
             * The status of the QoS policy. Valid values:
             * <p>
             * 
             * *   **Creating**: The QoS policy is being created.
             * *   **Active**: The QoS policy is available.
             * *   **Modifying**: The QoS policy is being modified
             * *   **Deleting**: The QoS policy is being deleted.
             * *   **Deleted**: The QoS policy is deleted.
             */
            public Builder trafficQosPolicyStatus(String trafficQosPolicyStatus) {
                this.trafficQosPolicyStatus = trafficQosPolicyStatus;
                return this;
            }

            /**
             * A list of queues.
             */
            public Builder trafficQosQueues(java.util.List < TrafficQosQueues> trafficQosQueues) {
                this.trafficQosQueues = trafficQosQueues;
                return this;
            }

            /**
             * The ID of the network instance connection.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * The ID of the transit router.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public TrafficQosPolicies build() {
                return new TrafficQosPolicies(this);
            } 

        } 

    }
}
