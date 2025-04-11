// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    private java.util.List<TrafficQosQueues> trafficQosQueues;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TrafficQosQueues> getTrafficQosQueues() {
        return this.trafficQosQueues;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<TrafficQosQueues> trafficQosQueues; 

        private Builder() {
        } 

        private Builder(ListCenInterRegionTrafficQosQueuesResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.trafficQosQueues = model.trafficQosQueues;
        } 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0151fa6aa1ed****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1D1E15D2-416D-54F3-BDD9-BC27DE4C6352</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the QoS queue.</p>
         */
        public Builder trafficQosQueues(java.util.List<TrafficQosQueues> trafficQosQueues) {
            this.trafficQosQueues = trafficQosQueues;
            return this;
        }

        public ListCenInterRegionTrafficQosQueuesResponseBody build() {
            return new ListCenInterRegionTrafficQosQueuesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCenInterRegionTrafficQosQueuesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCenInterRegionTrafficQosQueuesResponseBody</p>
     */
    public static class TrafficQosQueues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("Dscps")
        private java.util.List<Integer> dscps;

        @com.aliyun.core.annotation.NameInMap("EffectiveBandwidth")
        private String effectiveBandwidth;

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
            this.bandwidth = builder.bandwidth;
            this.dscps = builder.dscps;
            this.effectiveBandwidth = builder.effectiveBandwidth;
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
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return dscps
         */
        public java.util.List<Integer> getDscps() {
            return this.dscps;
        }

        /**
         * @return effectiveBandwidth
         */
        public String getEffectiveBandwidth() {
            return this.effectiveBandwidth;
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
            private String bandwidth; 
            private java.util.List<Integer> dscps; 
            private String effectiveBandwidth; 
            private Integer remainBandwidthPercent; 
            private String status; 
            private String trafficQosPolicyId; 
            private String trafficQosQueueDescription; 
            private String trafficQosQueueId; 
            private String trafficQosQueueName; 
            private String transitRouterAttachmentId; 
            private String transitRouterId; 

            private Builder() {
            } 

            private Builder(TrafficQosQueues model) {
                this.bandwidth = model.bandwidth;
                this.dscps = model.dscps;
                this.effectiveBandwidth = model.effectiveBandwidth;
                this.remainBandwidthPercent = model.remainBandwidthPercent;
                this.status = model.status;
                this.trafficQosPolicyId = model.trafficQosPolicyId;
                this.trafficQosQueueDescription = model.trafficQosQueueDescription;
                this.trafficQosQueueId = model.trafficQosQueueId;
                this.trafficQosQueueName = model.trafficQosQueueName;
                this.transitRouterAttachmentId = model.transitRouterAttachmentId;
                this.transitRouterId = model.transitRouterId;
            } 

            /**
             * <p>The absolute bandwidth value that can be allocated to the current queue.</p>
             * <p>A value of <strong>1</strong> indicates that the QoS queue can consume at most 1 Mbit/s of inter-region bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The Differentiated Services Code Point (DSCP) value that matches the current QoS queue.</p>
             */
            public Builder dscps(java.util.List<Integer> dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * <p>The actual bandwidth of the current queue.</p>
             * 
             * <strong>example:</strong>
             * <p>1.35</p>
             */
            public Builder effectiveBandwidth(String effectiveBandwidth) {
                this.effectiveBandwidth = effectiveBandwidth;
                return this;
            }

            /**
             * <p>The percentage of bandwidth that can be allocated to the current queue.</p>
             * <p>A value of <strong>1</strong> indicates that the QoS queue can consume at most 1% of the inter-region bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder remainBandwidthPercent(Integer remainBandwidthPercent) {
                this.remainBandwidthPercent = remainBandwidthPercent;
                return this;
            }

            /**
             * <p>The status of the QoS queue. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Active</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-fv2qq9yqrsjowp****</p>
             */
            public Builder trafficQosPolicyId(String trafficQosPolicyId) {
                this.trafficQosPolicyId = trafficQosPolicyId;
                return this;
            }

            /**
             * <p>The description of the QoS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>qosQueueDescription</p>
             */
            public Builder trafficQosQueueDescription(String trafficQosQueueDescription) {
                this.trafficQosQueueDescription = trafficQosQueueDescription;
                return this;
            }

            /**
             * <p>The ID of the QoS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-siakjb2nn9gz5z****</p>
             */
            public Builder trafficQosQueueId(String trafficQosQueueId) {
                this.trafficQosQueueId = trafficQosQueueId;
                return this;
            }

            /**
             * <p>The name of the QoS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>qosQueueName</p>
             */
            public Builder trafficQosQueueName(String trafficQosQueueName) {
                this.trafficQosQueueName = trafficQosQueueName;
                return this;
            }

            /**
             * <p>The ID of the inter-region connection.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-nzrcv25d7ezt23****</p>
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * <p>The ID of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-p0wwagjv6fvxt4b7y****</p>
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
