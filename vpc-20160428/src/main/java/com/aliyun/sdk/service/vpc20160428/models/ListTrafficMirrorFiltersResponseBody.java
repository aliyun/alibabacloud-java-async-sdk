// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMirrorFiltersResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficMirrorFiltersResponseBody</p>
 */
public class ListTrafficMirrorFiltersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilters")
    private java.util.List < TrafficMirrorFilters> trafficMirrorFilters;

    private ListTrafficMirrorFiltersResponseBody(Builder builder) {
        this.count = builder.count;
        this.maxResults = builder.maxResults;
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
        private Integer count; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 
        private java.util.List < TrafficMirrorFilters> trafficMirrorFilters; 

        /**
         * The number of entries returned.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information about the filters.
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
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("DestinationPortRange")
        private String destinationPortRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        @com.aliyun.core.annotation.NameInMap("TrafficDirection")
        private String trafficDirection;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterId")
        private String trafficMirrorFilterId;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterRuleId")
        private String trafficMirrorFilterRuleId;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterRuleStatus")
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
             * The action of the outbound rule. Valid values:
             * <p>
             * 
             * *   **accept**
             * *   **drop**
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The destination CIDR block of the outbound traffic.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The destination port range of the outbound traffic.
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * The priority of the outbound rule. A smaller value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The protocol that is used by the outbound traffic to be mirrored. Valid values:
             * <p>
             * 
             * *   **ALL**
             * *   **ICMP**
             * *   **TCP**
             * *   **UDP**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The source CIDR block of the outbound traffic.
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * The source port range of the outbound traffic.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * The direction of the network traffic. Valid values:
             * <p>
             * 
             * *   **egress**
             * *   **ingress**
             */
            public Builder trafficDirection(String trafficDirection) {
                this.trafficDirection = trafficDirection;
                return this;
            }

            /**
             * The ID of the filter associated with the outbound rule.
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * The ID of the outbound rule.
             */
            public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
                this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
                return this;
            }

            /**
             * The status of the outbound rule. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Created**
             * *   **Modifying**
             * *   **Deleting**
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
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("DestinationPortRange")
        private String destinationPortRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrBlock")
        private String sourceCidrBlock;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        @com.aliyun.core.annotation.NameInMap("TrafficDirection")
        private String trafficDirection;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterId")
        private String trafficMirrorFilterId;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterRuleId")
        private String trafficMirrorFilterRuleId;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterRuleStatus")
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
             * The action of the inbound rule. Valid values:
             * <p>
             * 
             * *   **accept**
             * *   **drop**
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The destination CIDR block of the inbound traffic.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The destination port range of the inbound traffic.
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * The priority of the inbound rule. A smaller value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The protocol that is used by the inbound traffic to be mirrored. Valid values:
             * <p>
             * 
             * *   **ALL**
             * *   **ICMP**
             * *   **TCP**
             * *   **UDP**
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The source CIDR block of the inbound traffic.
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * The destination port range of the inbound traffic.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * The direction of the network traffic. Valid values:
             * <p>
             * 
             * *   **egress**
             * *   **ingress**
             */
            public Builder trafficDirection(String trafficDirection) {
                this.trafficDirection = trafficDirection;
                return this;
            }

            /**
             * The ID of the filter associated with the inbound rule.
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * The ID of the inbound rule.
             */
            public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
                this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
                return this;
            }

            /**
             * The status of the inbound rule. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Created**
             * *   **Modifying**
             * *   **Deleting**
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class TrafficMirrorFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EgressRules")
        private java.util.List < EgressRules> egressRules;

        @com.aliyun.core.annotation.NameInMap("IngressRules")
        private java.util.List < IngressRules> ingressRules;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterDescription")
        private String trafficMirrorFilterDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterId")
        private String trafficMirrorFilterId;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterName")
        private String trafficMirrorFilterName;

        @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterStatus")
        private String trafficMirrorFilterStatus;

        private TrafficMirrorFilters(Builder builder) {
            this.creationTime = builder.creationTime;
            this.egressRules = builder.egressRules;
            this.ingressRules = builder.ingressRules;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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
            private String creationTime; 
            private java.util.List < EgressRules> egressRules; 
            private java.util.List < IngressRules> ingressRules; 
            private String resourceGroupId; 
            private java.util.List < Tags> tags; 
            private String trafficMirrorFilterDescription; 
            private String trafficMirrorFilterId; 
            private String trafficMirrorFilterName; 
            private String trafficMirrorFilterStatus; 

            /**
             * The time when the filter is created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The information about the outbound rules.
             */
            public Builder egressRules(java.util.List < EgressRules> egressRules) {
                this.egressRules = egressRules;
                return this;
            }

            /**
             * The information about the inbound rules.
             */
            public Builder ingressRules(java.util.List < IngressRules> ingressRules) {
                this.ingressRules = ingressRules;
                return this;
            }

            /**
             * The ID of the resource group to which the traffic mirror session belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The description of the filter.
             */
            public Builder trafficMirrorFilterDescription(String trafficMirrorFilterDescription) {
                this.trafficMirrorFilterDescription = trafficMirrorFilterDescription;
                return this;
            }

            /**
             * The ID of the filter.
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * The filter name.
             */
            public Builder trafficMirrorFilterName(String trafficMirrorFilterName) {
                this.trafficMirrorFilterName = trafficMirrorFilterName;
                return this;
            }

            /**
             * The status of the filter. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Created**
             * *   **Modifying**
             * *   **Deleting**
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
