// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAiEngineEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiEngineEventsResponseBody</p>
 */
public class DescribeAiEngineEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAiEngineEventsResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAiEngineEventsResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of events.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries to return per page in a paging query. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page. If a next page exists, this field returns a value.</p>
         * <blockquote>
         * <p>If this parameter returns a value, a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to retrieve the next page until no value is returned, which indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>token-demo</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>request-demo</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of events that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAiEngineEventsResponseBody build() {
            return new DescribeAiEngineEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEventsResponseBody</p>
     */
    public static class Sources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Sources(Builder builder) {
            this.attribute = builder.attribute;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String attribute; 
            private String value; 

            private Builder() {
            } 

            private Builder(Sources model) {
                this.attribute = model.attribute;
                this.value = model.value;
            } 

            /**
             * <p>The display attribute of the attack source, such as the region code.</p>
             * 
             * <strong>example:</strong>
             * <p>CN-510100</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The value of the attack source. If the attack source type is IP address (the <strong>Type</strong> parameter is set to <strong>ip</strong>), the value is an IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>203.0.113.109</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAiEngineEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEventsResponseBody</p>
     */
    public static class AttackSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sources")
        private java.util.List<Sources> sources;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AttackSources(Builder builder) {
            this.sources = builder.sources;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackSources create() {
            return builder().build();
        }

        /**
         * @return sources
         */
        public java.util.List<Sources> getSources() {
            return this.sources;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Sources> sources; 
            private String type; 

            private Builder() {
            } 

            private Builder(AttackSources model) {
                this.sources = model.sources;
                this.type = model.type;
            } 

            /**
             * <p>The list of attack sources of the specified type.</p>
             */
            public Builder sources(java.util.List<Sources> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * <p>The type of the attack source. Valid values:</p>
             * <ul>
             * <li><strong>ip</strong>: IP address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AttackSources build() {
                return new AttackSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAiEngineEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEventsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackSources")
        private java.util.List<AttackSources> attackSources;

        @com.aliyun.core.annotation.NameInMap("BypassRequestCount")
        private Long bypassRequestCount;

        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List<String> domains;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventNodeCount")
        private Integer eventNodeCount;

        @com.aliyun.core.annotation.NameInMap("EvidenceRequestCount")
        private Long evidenceRequestCount;

        @com.aliyun.core.annotation.NameInMap("FirstSeenAt")
        private Long firstSeenAt;

        @com.aliyun.core.annotation.NameInMap("HandleStatus")
        private String handleStatus;

        @com.aliyun.core.annotation.NameInMap("LastSeenAt")
        private Long lastSeenAt;

        @com.aliyun.core.annotation.NameInMap("RelatedEventIds")
        private String relatedEventIds;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List<String> resources;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Items(Builder builder) {
            this.attackSources = builder.attackSources;
            this.bypassRequestCount = builder.bypassRequestCount;
            this.domains = builder.domains;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.eventNodeCount = builder.eventNodeCount;
            this.evidenceRequestCount = builder.evidenceRequestCount;
            this.firstSeenAt = builder.firstSeenAt;
            this.handleStatus = builder.handleStatus;
            this.lastSeenAt = builder.lastSeenAt;
            this.relatedEventIds = builder.relatedEventIds;
            this.resources = builder.resources;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return attackSources
         */
        public java.util.List<AttackSources> getAttackSources() {
            return this.attackSources;
        }

        /**
         * @return bypassRequestCount
         */
        public Long getBypassRequestCount() {
            return this.bypassRequestCount;
        }

        /**
         * @return domains
         */
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventNodeCount
         */
        public Integer getEventNodeCount() {
            return this.eventNodeCount;
        }

        /**
         * @return evidenceRequestCount
         */
        public Long getEvidenceRequestCount() {
            return this.evidenceRequestCount;
        }

        /**
         * @return firstSeenAt
         */
        public Long getFirstSeenAt() {
            return this.firstSeenAt;
        }

        /**
         * @return handleStatus
         */
        public String getHandleStatus() {
            return this.handleStatus;
        }

        /**
         * @return lastSeenAt
         */
        public Long getLastSeenAt() {
            return this.lastSeenAt;
        }

        /**
         * @return relatedEventIds
         */
        public String getRelatedEventIds() {
            return this.relatedEventIds;
        }

        /**
         * @return resources
         */
        public java.util.List<String> getResources() {
            return this.resources;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private java.util.List<AttackSources> attackSources; 
            private Long bypassRequestCount; 
            private java.util.List<String> domains; 
            private String eventId; 
            private String eventName; 
            private Integer eventNodeCount; 
            private Long evidenceRequestCount; 
            private Long firstSeenAt; 
            private String handleStatus; 
            private Long lastSeenAt; 
            private String relatedEventIds; 
            private java.util.List<String> resources; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.attackSources = model.attackSources;
                this.bypassRequestCount = model.bypassRequestCount;
                this.domains = model.domains;
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.eventNodeCount = model.eventNodeCount;
                this.evidenceRequestCount = model.evidenceRequestCount;
                this.firstSeenAt = model.firstSeenAt;
                this.handleStatus = model.handleStatus;
                this.lastSeenAt = model.lastSeenAt;
                this.relatedEventIds = model.relatedEventIds;
                this.resources = model.resources;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * <p>The list of attack source groups for the event.</p>
             */
            public Builder attackSources(java.util.List<AttackSources> attackSources) {
                this.attackSources = attackSources;
                return this;
            }

            /**
             * <p>The statistics of suspected bypass evidence requests for the event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bypassRequestCount(Long bypassRequestCount) {
                this.bypassRequestCount = bypassRequestCount;
                return this;
            }

            /**
             * <p>The list of domain names involved in the event.</p>
             */
            public Builder domains(java.util.List<String> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>EVT-20261025-109</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The name of the event in the selected language.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspected injection attack</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The number of nodes included in the event.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventNodeCount(Integer eventNodeCount) {
                this.eventNodeCount = eventNodeCount;
                return this;
            }

            /**
             * <p>The statistics of evidence requests for the event.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder evidenceRequestCount(Long evidenceRequestCount) {
                this.evidenceRequestCount = evidenceRequestCount;
                return this;
            }

            /**
             * <p>The time when the event was first detected. The value is a UNIX timestamp in UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792973400000</p>
             */
            public Builder firstSeenAt(Long firstSeenAt) {
                this.firstSeenAt = firstSeenAt;
                return this;
            }

            /**
             * <p>The current manual handling status. Valid values:</p>
             * <ul>
             * <li><p><strong>unhandled</strong>: Unhandled.</p>
             * </li>
             * <li><p><strong>handling</strong>: In progress.</p>
             * </li>
             * <li><p><strong>handled</strong>: Handled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>unhandled</p>
             */
            public Builder handleStatus(String handleStatus) {
                this.handleStatus = handleStatus;
                return this;
            }

            /**
             * <p>The time when the event was last detected. The value is a UNIX timestamp in UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792973700000</p>
             */
            public Builder lastSeenAt(Long lastSeenAt) {
                this.lastSeenAt = lastSeenAt;
                return this;
            }

            /**
             * <p>The IDs of the related events. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>EVT-0bda6<strong><strong>6b5c174,EVT-0bda6</strong></strong>6b5c175</p>
             */
            public Builder relatedEventIds(String relatedEventIds) {
                this.relatedEventIds = relatedEventIds;
                return this;
            }

            /**
             * <p>The list of protected objects involved in the event.</p>
             */
            public Builder resources(java.util.List<String> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The current risk level. Valid values:</p>
             * <ul>
             * <li><p><strong>critical</strong>: Critical.</p>
             * </li>
             * <li><p><strong>high</strong>: High.</p>
             * </li>
             * <li><p><strong>medium</strong>: Medium.</p>
             * </li>
             * <li><p><strong>low</strong>: Low.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
