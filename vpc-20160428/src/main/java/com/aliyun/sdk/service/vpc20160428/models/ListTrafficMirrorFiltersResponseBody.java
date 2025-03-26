// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    private java.util.List<TrafficMirrorFilters> trafficMirrorFilters;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TrafficMirrorFilters> getTrafficMirrorFilters() {
        return this.trafficMirrorFilters;
    }

    public static final class Builder {
        private Integer count; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String totalCount; 
        private java.util.List<TrafficMirrorFilters> trafficMirrorFilters; 

        private Builder() {
        } 

        private Builder(ListTrafficMirrorFiltersResponseBody model) {
            this.count = model.count;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trafficMirrorFilters = model.trafficMirrorFilters;
        } 

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that is used for the next query.</li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>739CA01C-92EB-4C69-BCC0-280149C6F41E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the filters.</p>
         */
        public Builder trafficMirrorFilters(java.util.List<TrafficMirrorFilters> trafficMirrorFilters) {
            this.trafficMirrorFilters = trafficMirrorFilters;
            return this;
        }

        public ListTrafficMirrorFiltersResponseBody build() {
            return new ListTrafficMirrorFiltersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrafficMirrorFiltersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficMirrorFiltersResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(EgressRules model) {
                this.action = model.action;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.destinationPortRange = model.destinationPortRange;
                this.priority = model.priority;
                this.protocol = model.protocol;
                this.sourceCidrBlock = model.sourceCidrBlock;
                this.sourcePortRange = model.sourcePortRange;
                this.trafficDirection = model.trafficDirection;
                this.trafficMirrorFilterId = model.trafficMirrorFilterId;
                this.trafficMirrorFilterRuleId = model.trafficMirrorFilterRuleId;
                this.trafficMirrorFilterRuleStatus = model.trafficMirrorFilterRuleStatus;
            } 

            /**
             * <p>The action of the outbound rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong></li>
             * <li><strong>drop</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The destination CIDR block of the outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The destination port range of the outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>22/40</p>
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * <p>The priority of the outbound rule. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol that is used by the outbound traffic to be mirrored. Valid values:</p>
             * <ul>
             * <li><strong>ALL</strong></li>
             * <li><strong>ICMP</strong></li>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of the outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * <p>The source port range of the outbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>22/40</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * <p>The direction of the network traffic. Valid values:</p>
             * <ul>
             * <li><strong>egress</strong></li>
             * <li><strong>ingress</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>egress</p>
             */
            public Builder trafficDirection(String trafficDirection) {
                this.trafficDirection = trafficDirection;
                return this;
            }

            /**
             * <p>The ID of the filter associated with the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tmf-j6cmls82xnc86vtpe****</p>
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * <p>The ID of the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tmr-j6c89rzmtd3hhdugq****</p>
             */
            public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
                this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
                return this;
            }

            /**
             * <p>The status of the outbound rule. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
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
    /**
     * 
     * {@link ListTrafficMirrorFiltersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficMirrorFiltersResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IngressRules model) {
                this.action = model.action;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.destinationPortRange = model.destinationPortRange;
                this.priority = model.priority;
                this.protocol = model.protocol;
                this.sourceCidrBlock = model.sourceCidrBlock;
                this.sourcePortRange = model.sourcePortRange;
                this.trafficDirection = model.trafficDirection;
                this.trafficMirrorFilterId = model.trafficMirrorFilterId;
                this.trafficMirrorFilterRuleId = model.trafficMirrorFilterRuleId;
                this.trafficMirrorFilterRuleStatus = model.trafficMirrorFilterRuleStatus;
            } 

            /**
             * <p>The action of the inbound rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong></li>
             * <li><strong>drop</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The destination CIDR block of the inbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * <p>The destination port range of the inbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder destinationPortRange(String destinationPortRange) {
                this.destinationPortRange = destinationPortRange;
                return this;
            }

            /**
             * <p>The priority of the inbound rule. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The protocol that is used by the inbound traffic to be mirrored. Valid values:</p>
             * <ul>
             * <li><strong>ALL</strong></li>
             * <li><strong>ICMP</strong></li>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of the inbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder sourceCidrBlock(String sourceCidrBlock) {
                this.sourceCidrBlock = sourceCidrBlock;
                return this;
            }

            /**
             * <p>The destination port range of the inbound traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * <p>The direction of the network traffic. Valid values:</p>
             * <ul>
             * <li><strong>egress</strong></li>
             * <li><strong>ingress</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ingress</p>
             */
            public Builder trafficDirection(String trafficDirection) {
                this.trafficDirection = trafficDirection;
                return this;
            }

            /**
             * <p>The ID of the filter associated with the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tmf-j6cmls82xnc86vtpe****</p>
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * <p>The ID of the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tmr-j6cezu8e68rnpepet****</p>
             */
            public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
                this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
                return this;
            }

            /**
             * <p>The status of the inbound rule. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
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
    /**
     * 
     * {@link ListTrafficMirrorFiltersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficMirrorFiltersResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
    /**
     * 
     * {@link ListTrafficMirrorFiltersResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficMirrorFiltersResponseBody</p>
     */
    public static class TrafficMirrorFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EgressRules")
        private java.util.List<EgressRules> egressRules;

        @com.aliyun.core.annotation.NameInMap("IngressRules")
        private java.util.List<IngressRules> ingressRules;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
        public java.util.List<EgressRules> getEgressRules() {
            return this.egressRules;
        }

        /**
         * @return ingressRules
         */
        public java.util.List<IngressRules> getIngressRules() {
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<EgressRules> egressRules; 
            private java.util.List<IngressRules> ingressRules; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 
            private String trafficMirrorFilterDescription; 
            private String trafficMirrorFilterId; 
            private String trafficMirrorFilterName; 
            private String trafficMirrorFilterStatus; 

            private Builder() {
            } 

            private Builder(TrafficMirrorFilters model) {
                this.creationTime = model.creationTime;
                this.egressRules = model.egressRules;
                this.ingressRules = model.ingressRules;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
                this.trafficMirrorFilterDescription = model.trafficMirrorFilterDescription;
                this.trafficMirrorFilterId = model.trafficMirrorFilterId;
                this.trafficMirrorFilterName = model.trafficMirrorFilterName;
                this.trafficMirrorFilterStatus = model.trafficMirrorFilterStatus;
            } 

            /**
             * <p>The time when the filter is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-05T15:26Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The information about the outbound rules.</p>
             */
            public Builder egressRules(java.util.List<EgressRules> egressRules) {
                this.egressRules = egressRules;
                return this;
            }

            /**
             * <p>The information about the inbound rules.</p>
             */
            public Builder ingressRules(java.util.List<IngressRules> ingressRules) {
                this.ingressRules = ingressRules;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the traffic mirror session belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The description of the filter.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a filter.</p>
             */
            public Builder trafficMirrorFilterDescription(String trafficMirrorFilterDescription) {
                this.trafficMirrorFilterDescription = trafficMirrorFilterDescription;
                return this;
            }

            /**
             * <p>The ID of the filter.</p>
             * 
             * <strong>example:</strong>
             * <p>tmf-j6cmls82xnc86vtpe****</p>
             */
            public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
                this.trafficMirrorFilterId = trafficMirrorFilterId;
                return this;
            }

            /**
             * <p>The filter name.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder trafficMirrorFilterName(String trafficMirrorFilterName) {
                this.trafficMirrorFilterName = trafficMirrorFilterName;
                return this;
            }

            /**
             * <p>The status of the filter. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
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
