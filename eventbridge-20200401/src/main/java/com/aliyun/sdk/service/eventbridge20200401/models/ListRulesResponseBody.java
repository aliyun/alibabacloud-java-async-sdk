// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRulesResponseBody</p>
 */
public class ListRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li><strong>Success</strong>: The request was successful.</li>
         * <li><strong>Other codes</strong>: The request failed. For more information about error codes, see Error codes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Limit is not valid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7043799-F4DA-5290-9249-97C359876D97</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRulesResponseBody build() {
            return new ListRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ErrorsTolerance")
        private String errorsTolerance;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("PushSelector")
        private String pushSelector;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Targets(Builder builder) {
            this.endpoint = builder.endpoint;
            this.errorsTolerance = builder.errorsTolerance;
            this.id = builder.id;
            this.pushSelector = builder.pushSelector;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return errorsTolerance
         */
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return pushSelector
         */
        public String getPushSelector() {
            return this.pushSelector;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endpoint; 
            private String errorsTolerance; 
            private String id; 
            private String pushSelector; 
            private String type; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.endpoint = model.endpoint;
                this.errorsTolerance = model.errorsTolerance;
                this.id = model.id;
                this.pushSelector = model.pushSelector;
                this.type = model.type;
            } 

            /**
             * <p>The endpoint of the event target.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-hangzhou:123456789098****:queues/myqueue</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The fault tolerance policy. Valid values:</p>
             * <ul>
             * <li><strong>ALL</strong>: Fault tolerance is allowed. If an error occurs in an event, event processing is not blocked. If the event fails to be sent after the maximum number of retries specified by the retry policy is reached, the event is delivered to the dead-letter queue or discarded based on your configurations.</li>
             * <li><strong>NONE</strong>: Fault tolerance is prohibited. If an error occurs in an event and the event fails to be sent after the maximum number of retries specified by the retry policy is reached, event processing is blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALL</p>
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * <p>The ID of the custom event target.</p>
             * 
             * <strong>example:</strong>
             * <p>177</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The transformer that is used to push events.</p>
             * 
             * <strong>example:</strong>
             * <p>MATCHED_EVENT</p>
             */
            public Builder pushSelector(String pushSelector) {
                this.pushSelector = pushSelector;
                return this;
            }

            /**
             * <p>The type of the event target. For more information, see <a href="https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters">Event target parameters.</a></p>
             * 
             * <strong>example:</strong>
             * <p>acs.mns.queue</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTimestamp")
        private Long createdTimestamp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DetailMap")
        private java.util.Map<String, ?> detailMap;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("FilterPattern")
        private String filterPattern;

        @com.aliyun.core.annotation.NameInMap("RuleARN")
        private String ruleARN;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Targets")
        private java.util.List<Targets> targets;

        private Rules(Builder builder) {
            this.createdTimestamp = builder.createdTimestamp;
            this.description = builder.description;
            this.detailMap = builder.detailMap;
            this.eventBusName = builder.eventBusName;
            this.filterPattern = builder.filterPattern;
            this.ruleARN = builder.ruleARN;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.targets = builder.targets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return createdTimestamp
         */
        public Long getCreatedTimestamp() {
            return this.createdTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detailMap
         */
        public java.util.Map<String, ?> getDetailMap() {
            return this.detailMap;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return filterPattern
         */
        public String getFilterPattern() {
            return this.filterPattern;
        }

        /**
         * @return ruleARN
         */
        public String getRuleARN() {
            return this.ruleARN;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targets
         */
        public java.util.List<Targets> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private Long createdTimestamp; 
            private String description; 
            private java.util.Map<String, ?> detailMap; 
            private String eventBusName; 
            private String filterPattern; 
            private String ruleARN; 
            private String ruleName; 
            private String status; 
            private java.util.List<Targets> targets; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.createdTimestamp = model.createdTimestamp;
                this.description = model.description;
                this.detailMap = model.detailMap;
                this.eventBusName = model.eventBusName;
                this.filterPattern = model.filterPattern;
                this.ruleARN = model.ruleARN;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.targets = model.targets;
            } 

            /**
             * <p>The creation timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1607071602000</p>
             */
            public Builder createdTimestamp(Long createdTimestamp) {
                this.createdTimestamp = createdTimestamp;
                return this;
            }

            /**
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The details of the event rule.</p>
             */
            public Builder detailMap(java.util.Map<String, ?> detailMap) {
                this.detailMap = detailMap;
                return this;
            }

            /**
             * <p>The name of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * <p>The event pattern, in JSON format. Valid values:</p>
             * <ul>
             * <li><strong>stringEqual</strong>: Up to five expressions in the map data structure can be specified in each field.</li>
             * <li><strong>stringExpression</strong>: Up to five expressions in the map data structure can be specified in each field.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;source&quot;:[&quot;acs.oss&quot;],&quot;type&quot;:[&quot;oss:BucketQueried:GetBucketStat&quot;]}</p>
             */
            public Builder filterPattern(String filterPattern) {
                this.filterPattern = filterPattern;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:123456789098****:eventbus/default/rule/myRule3</p>
             */
            public Builder ruleARN(String ruleARN) {
                this.ruleARN = ruleARN;
                return this;
            }

            /**
             * <p>The name of the event rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tf-testacc-rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The status of the event rule. Valid values:</p>
             * <ul>
             * <li><strong>ENABLE</strong> (default)</li>
             * <li><strong>DISABLE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The event targets.</p>
             */
            public Builder targets(java.util.List<Targets> targets) {
                this.targets = targets;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.rules = builder.rules;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String nextToken; 
            private java.util.List<Rules> rules; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nextToken = model.nextToken;
                this.rules = model.rules;
                this.total = model.total;
            } 

            /**
             * <p>If excess return values exist, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The event rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
