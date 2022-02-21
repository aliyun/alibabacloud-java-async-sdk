// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMirrorFiltersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficMirrorFiltersResponseBody</p>
 */
public class ListTrafficMirrorFiltersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("TrafficMirrorFilters")
    private java.util.List < TrafficMirrorFilters> trafficMirrorFilters;

    private ListTrafficMirrorFiltersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficMirrorFilters = builder.trafficMirrorFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficMirrorFiltersResponseBody create() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trafficMirrorFilters
     */
    public java.util.List < TrafficMirrorFilters> getTrafficMirrorFilters() {
        return this.trafficMirrorFilters;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private String totalCount; 
        private java.util.List < TrafficMirrorFilters> trafficMirrorFilters; 

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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TrafficMirrorFilters.
         */
        public Builder trafficMirrorFilters(java.util.List < TrafficMirrorFilters> trafficMirrorFilters) {
            this.trafficMirrorFilters = trafficMirrorFilters;
            return this;
        }

        public ListTrafficMirrorFiltersResponseBody build() {
            return new ListTrafficMirrorFiltersResponseBody(this);
        } 

    } 

    public static class EgressRules extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("DestinationPortRange")
        private String destinationPortRange;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        @NameInMap("TrafficDirection")
        private String trafficDirection;

        @NameInMap("TrafficMirrorFilterId")
        private String trafficMirrorFilterId;

        @NameInMap("TrafficMirrorFilterRuleId")
        private String trafficMirrorFilterRuleId;

        @NameInMap("TrafficMirrorFilterRuleStatus")
        private String trafficMirrorFilterRuleStatus;

        private EgressRules(Builder builder) {
            this.action = builder.action;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.destinationPortRange = builder.destinationPortRange;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.sourceCidrBlock = builder.sourceCidrBlock;
            this.sourcePortRange = builder.sourcePortRange;
            this.trafficDirection = builder.trafficDirection;
            this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
            this.trafficMirrorFilterRuleId = builder.trafficMirrorFilterRuleId;
            this.trafficMirrorFilterRuleStatus = builder.trafficMirrorFilterRuleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return destinationPortRange
         */
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrBlock
         */
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        /**
         * @return trafficDirection
         */
        public String getTrafficDirection() {
            return this.trafficDirection;
        }

        /**
         * @return trafficMirrorFilterId
         */
        public String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        /**
         * @return trafficMirrorFilterRuleId
         */
        public String getTrafficMirrorFilterRuleId() {
            return this.trafficMirrorFilterRuleId;
        }

        /**
         * @return trafficMirrorFilterRuleStatus
         */
        public String getTrafficMirrorFilterRuleStatus() {
            return this.trafficMirrorFilterRuleStatus;
        }

        public static final class Builder {
            private String action; 
            private String destinationCidrBlock; 
            private String destinationPortRange; 
            private Integer priority; 
            private String protocol; 
            private String sourceCidrBlock; 
            private String sourcePortRange; 
            private String trafficDirection; 
            private String trafficMirrorFilterId; 
            private String trafficMirrorFilterRuleId; 
            private String trafficMirrorFilterRuleStatus; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * DestinationPortRange.
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * SourceCidrBlock.
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * TrafficDirection.
             */
            public Builder trafficDirection(String trafficDirection) {
                this.trafficDirection = trafficDirection;
                return this;
            }

            /**
             * TrafficMirrorFilterId.
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * TrafficMirrorFilterRuleId.
             */
            public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
                this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
                return this;
            }

            /**
             * TrafficMirrorFilterRuleStatus.
             */
            public Builder trafficMirrorFilterRuleStatus(String trafficMirrorFilterRuleStatus) {
                this.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
                return this;
            }

            public EgressRules build() {
                return new EgressRules(this);
            } 

        } 

    }
    public static class IngressRules extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @NameInMap("DestinationPortRange")
        private String destinationPortRange;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        @NameInMap("TrafficDirection")
        private String trafficDirection;

        @NameInMap("TrafficMirrorFilterId")
        private String trafficMirrorFilterId;

        @NameInMap("TrafficMirrorFilterRuleId")
        private String trafficMirrorFilterRuleId;

        @NameInMap("TrafficMirrorFilterRuleStatus")
        private String trafficMirrorFilterRuleStatus;

        private IngressRules(Builder builder) {
            this.action = builder.action;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.destinationPortRange = builder.destinationPortRange;
            this.priority = builder.priority;
            this.protocol = builder.protocol;
            this.sourceCidrBlock = builder.sourceCidrBlock;
            this.sourcePortRange = builder.sourcePortRange;
            this.trafficDirection = builder.trafficDirection;
            this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
            this.trafficMirrorFilterRuleId = builder.trafficMirrorFilterRuleId;
            this.trafficMirrorFilterRuleStatus = builder.trafficMirrorFilterRuleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return destinationPortRange
         */
        public String getDestinationPortRange() {
            return this.destinationPortRange;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrBlock
         */
        public String getSourceCidrBlock() {
            return this.sourceCidrBlock;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        /**
         * @return trafficDirection
         */
        public String getTrafficDirection() {
            return this.trafficDirection;
        }

        /**
         * @return trafficMirrorFilterId
         */
        public String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        /**
         * @return trafficMirrorFilterRuleId
         */
        public String getTrafficMirrorFilterRuleId() {
            return this.trafficMirrorFilterRuleId;
        }

        /**
         * @return trafficMirrorFilterRuleStatus
         */
        public String getTrafficMirrorFilterRuleStatus() {
            return this.trafficMirrorFilterRuleStatus;
        }

        public static final class Builder {
            private String action; 
            private String destinationCidrBlock; 
            private String destinationPortRange; 
            private Integer priority; 
            private String protocol; 
            private String sourceCidrBlock; 
            private String sourcePortRange; 
            private String trafficDirection; 
            private String trafficMirrorFilterId; 
            private String trafficMirrorFilterRuleId; 
            private String trafficMirrorFilterRuleStatus; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * DestinationPortRange.
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * SourceCidrBlock.
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * TrafficDirection.
             */
            public Builder trafficDirection(String trafficDirection) {
                this.trafficDirection = trafficDirection;
                return this;
            }

            /**
             * TrafficMirrorFilterId.
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * TrafficMirrorFilterRuleId.
             */
            public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
                this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
                return this;
            }

            /**
             * TrafficMirrorFilterRuleStatus.
             */
            public Builder trafficMirrorFilterRuleStatus(String trafficMirrorFilterRuleStatus) {
                this.trafficMirrorFilterRuleStatus = trafficMirrorFilterRuleStatus;
                return this;
            }

            public IngressRules build() {
                return new IngressRules(this);
            } 

        } 

    }
    public static class TrafficMirrorFilters extends TeaModel {
        @NameInMap("EgressRules")
        private java.util.List < EgressRules> egressRules;

        @NameInMap("IngressRules")
        private java.util.List < IngressRules> ingressRules;

        @NameInMap("TrafficMirrorFilterDescription")
        private String trafficMirrorFilterDescription;

        @NameInMap("TrafficMirrorFilterId")
        private String trafficMirrorFilterId;

        @NameInMap("TrafficMirrorFilterName")
        private String trafficMirrorFilterName;

        @NameInMap("TrafficMirrorFilterStatus")
        private String trafficMirrorFilterStatus;

        private TrafficMirrorFilters(Builder builder) {
            this.egressRules = builder.egressRules;
            this.ingressRules = builder.ingressRules;
            this.trafficMirrorFilterDescription = builder.trafficMirrorFilterDescription;
            this.trafficMirrorFilterId = builder.trafficMirrorFilterId;
            this.trafficMirrorFilterName = builder.trafficMirrorFilterName;
            this.trafficMirrorFilterStatus = builder.trafficMirrorFilterStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMirrorFilters create() {
            return builder().build();
        }

        /**
         * @return egressRules
         */
        public java.util.List < EgressRules> getEgressRules() {
            return this.egressRules;
        }

        /**
         * @return ingressRules
         */
        public java.util.List < IngressRules> getIngressRules() {
            return this.ingressRules;
        }

        /**
         * @return trafficMirrorFilterDescription
         */
        public String getTrafficMirrorFilterDescription() {
            return this.trafficMirrorFilterDescription;
        }

        /**
         * @return trafficMirrorFilterId
         */
        public String getTrafficMirrorFilterId() {
            return this.trafficMirrorFilterId;
        }

        /**
         * @return trafficMirrorFilterName
         */
        public String getTrafficMirrorFilterName() {
            return this.trafficMirrorFilterName;
        }

        /**
         * @return trafficMirrorFilterStatus
         */
        public String getTrafficMirrorFilterStatus() {
            return this.trafficMirrorFilterStatus;
        }

        public static final class Builder {
            private java.util.List < EgressRules> egressRules; 
            private java.util.List < IngressRules> ingressRules; 
            private String trafficMirrorFilterDescription; 
            private String trafficMirrorFilterId; 
            private String trafficMirrorFilterName; 
            private String trafficMirrorFilterStatus; 

            /**
             * EgressRules.
             */
            public Builder egressRules(java.util.List < EgressRules> egressRules) {
                this.egressRules = egressRules;
                return this;
            }

            /**
             * IngressRules.
             */
            public Builder ingressRules(java.util.List < IngressRules> ingressRules) {
                this.ingressRules = ingressRules;
                return this;
            }

            /**
             * TrafficMirrorFilterDescription.
             */
            public Builder trafficMirrorFilterDescription(String trafficMirrorFilterDescription) {
                this.trafficMirrorFilterDescription = trafficMirrorFilterDescription;
                return this;
            }

            /**
             * TrafficMirrorFilterId.
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * TrafficMirrorFilterName.
             */
            public Builder trafficMirrorFilterName(String trafficMirrorFilterName) {
                this.trafficMirrorFilterName = trafficMirrorFilterName;
                return this;
            }

            /**
             * TrafficMirrorFilterStatus.
             */
            public Builder trafficMirrorFilterStatus(String trafficMirrorFilterStatus) {
                this.trafficMirrorFilterStatus = trafficMirrorFilterStatus;
                return this;
            }

            public TrafficMirrorFilters build() {
                return new TrafficMirrorFilters(this);
            } 

        } 

    }
}
