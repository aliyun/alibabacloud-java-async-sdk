// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>MaxResults.</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>NextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>TotalCount.</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>TrafficQosPolicies.</p>
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
             * <p>Dscps.</p>
             */
            public Builder dscps(java.util.List < Integer > dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * <p>QosQueueDescription.</p>
             */
            public Builder qosQueueDescription(String qosQueueDescription) {
                this.qosQueueDescription = qosQueueDescription;
                return this;
            }

            /**
             * <p>QosQueueId.</p>
             */
            public Builder qosQueueId(String qosQueueId) {
                this.qosQueueId = qosQueueId;
                return this;
            }

            /**
             * <p>QosQueueName.</p>
             */
            public Builder qosQueueName(String qosQueueName) {
                this.qosQueueName = qosQueueName;
                return this;
            }

            /**
             * <p>RemainBandwidthPercent.</p>
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


        private TrafficQosPolicies(Builder builder) {
            this.trafficQosPolicyDescription = builder.trafficQosPolicyDescription;
            this.trafficQosPolicyId = builder.trafficQosPolicyId;
            this.trafficQosPolicyName = builder.trafficQosPolicyName;
            this.trafficQosPolicyStatus = builder.trafficQosPolicyStatus;
            this.trafficQosQueues = builder.trafficQosQueues;
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

        public static final class Builder {
            private String trafficQosPolicyDescription; 
            private String trafficQosPolicyId; 
            private String trafficQosPolicyName; 
            private String trafficQosPolicyStatus; 
            private java.util.List < TrafficQosQueues> trafficQosQueues; 

            /**
             * <p>TrafficQosPolicyDescription.</p>
             */
            public Builder trafficQosPolicyDescription(String trafficQosPolicyDescription) {
                this.trafficQosPolicyDescription = trafficQosPolicyDescription;
                return this;
            }

            /**
             * <p>TrafficQosPolicyId.</p>
             */
            public Builder trafficQosPolicyId(String trafficQosPolicyId) {
                this.trafficQosPolicyId = trafficQosPolicyId;
                return this;
            }

            /**
             * <p>TrafficQosPolicyName.</p>
             */
            public Builder trafficQosPolicyName(String trafficQosPolicyName) {
                this.trafficQosPolicyName = trafficQosPolicyName;
                return this;
            }

            /**
             * <p>TrafficQosPolicyStatus.</p>
             */
            public Builder trafficQosPolicyStatus(String trafficQosPolicyStatus) {
                this.trafficQosPolicyStatus = trafficQosPolicyStatus;
                return this;
            }

            /**
             * <p>TrafficQosQueues.</p>
             */
            public Builder trafficQosQueues(java.util.List < TrafficQosQueues> trafficQosQueues) {
                this.trafficQosQueues = trafficQosQueues;
                return this;
            }

            public TrafficQosPolicies build() {
                return new TrafficQosPolicies(this);
            } 

        } 

    }
}
