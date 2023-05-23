// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCenInterRegionTrafficQosQueuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCenInterRegionTrafficQosQueuesResponseBody</p>
 */
public class ListCenInterRegionTrafficQosQueuesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrafficQosQueues")
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

        /**
         * TrafficQosQueues.
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
        @NameInMap("Dscps")
        private java.util.List < Integer > dscps;

        @NameInMap("RemainBandwidthPercent")
        private Integer remainBandwidthPercent;

        @NameInMap("Status")
        private String status;

        @NameInMap("TrafficQosPolicyId")
        private String trafficQosPolicyId;

        @NameInMap("TrafficQosQueueDescription")
        private String trafficQosQueueDescription;

        @NameInMap("TrafficQosQueueId")
        private String trafficQosQueueId;

        @NameInMap("TrafficQosQueueName")
        private String trafficQosQueueName;

        @NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @NameInMap("TransitRouterId")
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
             * Dscps.
             */
            public Builder dscps(java.util.List < Integer > dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * RemainBandwidthPercent.
             */
            public Builder remainBandwidthPercent(Integer remainBandwidthPercent) {
                this.remainBandwidthPercent = remainBandwidthPercent;
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
             * TrafficQosPolicyId.
             */
            public Builder trafficQosPolicyId(String trafficQosPolicyId) {
                this.trafficQosPolicyId = trafficQosPolicyId;
                return this;
            }

            /**
             * TrafficQosQueueDescription.
             */
            public Builder trafficQosQueueDescription(String trafficQosQueueDescription) {
                this.trafficQosQueueDescription = trafficQosQueueDescription;
                return this;
            }

            /**
             * TrafficQosQueueId.
             */
            public Builder trafficQosQueueId(String trafficQosQueueId) {
                this.trafficQosQueueId = trafficQosQueueId;
                return this;
            }

            /**
             * TrafficQosQueueName.
             */
            public Builder trafficQosQueueName(String trafficQosQueueName) {
                this.trafficQosQueueName = trafficQosQueueName;
                return this;
            }

            /**
             * TransitRouterAttachmentId.
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * TransitRouterId.
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
