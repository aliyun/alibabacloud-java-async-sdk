// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCenInterRegionTrafficQosQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCenInterRegionTrafficQosQueuesResponseBody</p>
 */
public class ListCenInterRegionTrafficQosQueuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficQosQueues")
    private java.util.List < TrafficQosQueues> trafficQosQueues;

    private ListCenInterRegionTrafficQosQueuesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.trafficQosQueues = builder.trafficQosQueues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCenInterRegionTrafficQosQueuesResponseBody create() {
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
     * @return trafficQosQueues
     */
    public java.util.List < TrafficQosQueues> getTrafficQosQueues() {
        return this.trafficQosQueues;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < TrafficQosQueues> trafficQosQueues; 

        /**
         * The token that determines the start point of the query. Valid values:
         * <p>
         * 
         * - If NextToken was not returned, it indicates that no additional results exist.
         * - If NextToken was returned in the previous query, specify the value to obtain the next set of results.
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
         * A list of queues.
         */
        public Builder trafficQosQueues(java.util.List < TrafficQosQueues> trafficQosQueues) {
            this.trafficQosQueues = trafficQosQueues;
            return this;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBody build() {
            return new ListCenInterRegionTrafficQosQueuesResponseBody(this);
        } 

    } 

    public static class TrafficQosQueues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dscps")
        private java.util.List < Integer > dscps;

        @com.aliyun.core.annotation.NameInMap("RemainBandwidthPercent")
        private Integer remainBandwidthPercent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyId")
        private String trafficQosPolicyId;

        @com.aliyun.core.annotation.NameInMap("TrafficQosQueueDescription")
        private String trafficQosQueueDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficQosQueueId")
        private String trafficQosQueueId;

        @com.aliyun.core.annotation.NameInMap("TrafficQosQueueName")
        private String trafficQosQueueName;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private TrafficQosQueues(Builder builder) {
            this.dscps = builder.dscps;
            this.remainBandwidthPercent = builder.remainBandwidthPercent;
            this.status = builder.status;
            this.trafficQosPolicyId = builder.trafficQosPolicyId;
            this.trafficQosQueueDescription = builder.trafficQosQueueDescription;
            this.trafficQosQueueId = builder.trafficQosQueueId;
            this.trafficQosQueueName = builder.trafficQosQueueName;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterId = builder.transitRouterId;
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
         * @return remainBandwidthPercent
         */
        public Integer getRemainBandwidthPercent() {
            return this.remainBandwidthPercent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trafficQosPolicyId
         */
        public String getTrafficQosPolicyId() {
            return this.trafficQosPolicyId;
        }

        /**
         * @return trafficQosQueueDescription
         */
        public String getTrafficQosQueueDescription() {
            return this.trafficQosQueueDescription;
        }

        /**
         * @return trafficQosQueueId
         */
        public String getTrafficQosQueueId() {
            return this.trafficQosQueueId;
        }

        /**
         * @return trafficQosQueueName
         */
        public String getTrafficQosQueueName() {
            return this.trafficQosQueueName;
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
            private java.util.List < Integer > dscps; 
            private Integer remainBandwidthPercent; 
            private String status; 
            private String trafficQosPolicyId; 
            private String trafficQosQueueDescription; 
            private String trafficQosQueueId; 
            private String trafficQosQueueName; 
            private String transitRouterAttachmentId; 
            private String transitRouterId; 

            /**
             * The differentiated services code point (DSCP) value that matches the current queue.
             */
            public Builder dscps(java.util.List < Integer > dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * The percentage of bandwidth resources that can be allocated to the current queue.
             * <p>
             * 
             * For example, a value of 1 indicates that 1 percent of bandwidth resources can be allocated to the queue.
             */
            public Builder remainBandwidthPercent(Integer remainBandwidthPercent) {
                this.remainBandwidthPercent = remainBandwidthPercent;
                return this;
            }

            /**
             * The status of the queue. Valid values:
             * <p>
             * 
             * - **Creating**: The queue is being created. 
             * - **Active**: The queue is available. 
             * - **Deleting**: The queue is being deleted.
             */
            public Builder status(String status) {
                this.status = status;
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
             * The description of the queue.
             */
            public Builder trafficQosQueueDescription(String trafficQosQueueDescription) {
                this.trafficQosQueueDescription = trafficQosQueueDescription;
                return this;
            }

            /**
             * The ID of the queue.
             */
            public Builder trafficQosQueueId(String trafficQosQueueId) {
                this.trafficQosQueueId = trafficQosQueueId;
                return this;
            }

            /**
             * The name of the queue.
             */
            public Builder trafficQosQueueName(String trafficQosQueueName) {
                this.trafficQosQueueName = trafficQosQueueName;
                return this;
            }

            /**
             * The ID of the inter-region connection.
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

            public TrafficQosQueues build() {
                return new TrafficQosQueues(this);
            } 

        } 

    }
}
