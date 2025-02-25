// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
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

        /**
         * The error code. The value Success indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned if the request failed.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRulesResponseBody build() {
            return new ListRulesResponseBody(this);
        } 

    } 

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

            /**
             * The endpoint of the event target.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * ErrorsTolerance.
             */
            public Builder errorsTolerance(String errorsTolerance) {
                this.errorsTolerance = errorsTolerance;
                return this;
            }

            /**
             * The ID of the custom event target.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The transformer that is used to push events.
             */
            public Builder pushSelector(String pushSelector) {
                this.pushSelector = pushSelector;
                return this;
            }

            /**
             * The type of the event target. For more information, see [Event target parameters.](https://www.alibabacloud.com/help/en/eventbridge/latest/event-target-parameters)
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
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTimestamp")
        private Long createdTimestamp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DetailMap")
        private java.util.Map < String, ? > detailMap;

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
        private java.util.List < Targets> targets;

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
        public java.util.Map < String, ? > getDetailMap() {
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
        public java.util.List < Targets> getTargets() {
            return this.targets;
        }

        public static final class Builder {
            private Long createdTimestamp; 
            private String description; 
            private java.util.Map < String, ? > detailMap; 
            private String eventBusName; 
            private String filterPattern; 
            private String ruleARN; 
            private String ruleName; 
            private String status; 
            private java.util.List < Targets> targets; 

            /**
             * The creation timestamp.
             */
            public Builder createdTimestamp(Long createdTimestamp) {
                this.createdTimestamp = createdTimestamp;
                return this;
            }

            /**
             * The rule description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The details of the event rule.
             */
            public Builder detailMap(java.util.Map < String, ? > detailMap) {
                this.detailMap = detailMap;
                return this;
            }

            /**
             * The name of the event bus.
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * The event pattern, in JSON format. Valid values: stringEqual pattern stringExpression pattern Each field can have a maximum of five expressions in the map data structure.
             * <p>
             * 
             * Each field can have a maximum of five expressions in the map data structure.
             */
            public Builder filterPattern(String filterPattern) {
                this.filterPattern = filterPattern;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the rule.
             */
            public Builder ruleARN(String ruleARN) {
                this.ruleARN = ruleARN;
                return this;
            }

            /**
             * The name of the event rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The status of the event rule. Valid values: ENABLE: The event rule is enabled. It is the default state of the event rule. DISABLE: The event rule is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The event targets.
             */
            public Builder targets(java.util.List < Targets> targets) {
                this.targets = targets;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

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
        public java.util.List < Rules> getRules() {
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
            private java.util.List < Rules> rules; 
            private Integer total; 

            /**
             * If excess return values exist, this parameter is returned.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * The rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The total number of entries.
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
