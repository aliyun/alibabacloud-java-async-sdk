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
 * {@link ListCenInterRegionTrafficQosPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCenInterRegionTrafficQosPoliciesResponseBody</p>
 */
public class ListCenInterRegionTrafficQosPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicies")
    private java.util.List<TrafficQosPolicies> trafficQosPolicies;

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
    public java.util.List<TrafficQosPolicies> getTrafficQosPolicies() {
        return this.trafficQosPolicies;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TrafficQosPolicies> trafficQosPolicies; 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that determines the start point of the query.</p>
         * <ul>
         * <li>If <strong>NextToken</strong> was not returned in the previous query, it indicates that no additional results exist.</li>
         * <li>If <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>113BFD47-63DF-5D9D-972C-033FB9C360CD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>A list of QoS policies.</p>
         */
        public Builder trafficQosPolicies(java.util.List<TrafficQosPolicies> trafficQosPolicies) {
            this.trafficQosPolicies = trafficQosPolicies;
            return this;
        }

        public ListCenInterRegionTrafficQosPoliciesResponseBody build() {
            return new ListCenInterRegionTrafficQosPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCenInterRegionTrafficQosPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCenInterRegionTrafficQosPoliciesResponseBody</p>
     */
    public static class TrafficQosQueues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("Dscps")
        private java.util.List<Integer> dscps;

        @com.aliyun.core.annotation.NameInMap("EffectiveBandwidth")
        private String effectiveBandwidth;

        @com.aliyun.core.annotation.NameInMap("QosQueueDescription")
        private String qosQueueDescription;

        @com.aliyun.core.annotation.NameInMap("QosQueueId")
        private String qosQueueId;

        @com.aliyun.core.annotation.NameInMap("QosQueueName")
        private String qosQueueName;

        @com.aliyun.core.annotation.NameInMap("RemainBandwidthPercent")
        private Integer remainBandwidthPercent;

        private TrafficQosQueues(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.dscps = builder.dscps;
            this.effectiveBandwidth = builder.effectiveBandwidth;
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
            private String bandwidth; 
            private java.util.List<Integer> dscps; 
            private String effectiveBandwidth; 
            private String qosQueueDescription; 
            private String qosQueueId; 
            private String qosQueueName; 
            private Integer remainBandwidthPercent; 

            /**
             * <p>If the QoS queues are assigned absolute bandwidth values, this parameter indicates the absolute bandwidth value that is allocated to the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The differentiated services code point (DSCP) value that is used to match packets.</p>
             */
            public Builder dscps(java.util.List<Integer> dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * <p>The actual bandwidth value of the current queue.</p>
             * 
             * <strong>example:</strong>
             * <p>1.35</p>
             */
            public Builder effectiveBandwidth(String effectiveBandwidth) {
                this.effectiveBandwidth = effectiveBandwidth;
                return this;
            }

            /**
             * <p>The description of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder qosQueueDescription(String qosQueueDescription) {
                this.qosQueueDescription = qosQueueDescription;
                return this;
            }

            /**
             * <p>The queue ID.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-queue-njcrmr9fiu1jii****</p>
             */
            public Builder qosQueueId(String qosQueueId) {
                this.qosQueueId = qosQueueId;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>namtest</p>
             */
            public Builder qosQueueName(String qosQueueName) {
                this.qosQueueName = qosQueueName;
                return this;
            }

            /**
             * <p>If the QoS queues are assigned bandwidth percentages, this parameter indicates the percentage of bandwidth that is allocated to the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListCenInterRegionTrafficQosPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCenInterRegionTrafficQosPoliciesResponseBody</p>
     */
    public static class TrafficQosPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthGuaranteeMode")
        private String bandwidthGuaranteeMode;

        @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyDescription")
        private String trafficQosPolicyDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyId")
        private String trafficQosPolicyId;

        @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyName")
        private String trafficQosPolicyName;

        @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyStatus")
        private String trafficQosPolicyStatus;

        @com.aliyun.core.annotation.NameInMap("TrafficQosQueues")
        private java.util.List<TrafficQosQueues> trafficQosQueues;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private TrafficQosPolicies(Builder builder) {
            this.bandwidthGuaranteeMode = builder.bandwidthGuaranteeMode;
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
         * @return bandwidthGuaranteeMode
         */
        public String getBandwidthGuaranteeMode() {
            return this.bandwidthGuaranteeMode;
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
        public java.util.List<TrafficQosQueues> getTrafficQosQueues() {
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
            private String bandwidthGuaranteeMode; 
            private String trafficQosPolicyDescription; 
            private String trafficQosPolicyId; 
            private String trafficQosPolicyName; 
            private String trafficQosPolicyStatus; 
            private java.util.List<TrafficQosQueues> trafficQosQueues; 
            private String transitRouterAttachmentId; 
            private String transitRouterId; 

            /**
             * <p>The guaranteed bandwidth mode.</p>
             * <ul>
             * <li><strong>byBandwidth</strong>: allocates absolute bandwidth values to QoS queues.</li>
             * <li><strong>byBandwidthPercent</strong>: assigns bandwidth percentages to QoS queues.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>byBandwidthPercent</p>
             */
            public Builder bandwidthGuaranteeMode(String bandwidthGuaranteeMode) {
                this.bandwidthGuaranteeMode = bandwidthGuaranteeMode;
                return this;
            }

            /**
             * <p>The description of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder trafficQosPolicyDescription(String trafficQosPolicyDescription) {
                this.trafficQosPolicyDescription = trafficQosPolicyDescription;
                return this;
            }

            /**
             * <p>The ID of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>qos-rnghap5gc8155x****</p>
             */
            public Builder trafficQosPolicyId(String trafficQosPolicyId) {
                this.trafficQosPolicyId = trafficQosPolicyId;
                return this;
            }

            /**
             * <p>The name of the QoS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder trafficQosPolicyName(String trafficQosPolicyName) {
                this.trafficQosPolicyName = trafficQosPolicyName;
                return this;
            }

            /**
             * <p>The status of the QoS policy.</p>
             * <ul>
             * <li><strong>Creating</strong>: The QoS policy is being created.</li>
             * <li><strong>Active</strong>: The QoS policy is available.</li>
             * <li><strong>Modifying</strong>: The policy is being modified.</li>
             * <li><strong>Deleting</strong>: The QoS policy is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Creating</p>
             */
            public Builder trafficQosPolicyStatus(String trafficQosPolicyStatus) {
                this.trafficQosPolicyStatus = trafficQosPolicyStatus;
                return this;
            }

            /**
             * <p>A list of queues.</p>
             */
            public Builder trafficQosQueues(java.util.List<TrafficQosQueues> trafficQosQueues) {
                this.trafficQosQueues = trafficQosQueues;
                return this;
            }

            /**
             * <p>The ID of the network instance connection.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-q7ct7c06jpw***</p>
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * <p>The ID of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-2ze4ta4v32umj0rb***</p>
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
