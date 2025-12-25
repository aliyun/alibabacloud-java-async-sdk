// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetUserWafRulesetResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserWafRulesetResponseBody</p>
 */
public class GetUserWafRulesetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Ruleset")
    private Ruleset ruleset;

    private GetUserWafRulesetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleset = builder.ruleset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserWafRulesetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleset
     */
    public Ruleset getRuleset() {
        return this.ruleset;
    }

    public static final class Builder {
        private String requestId; 
        private Ruleset ruleset; 

        private Builder() {
        } 

        private Builder(GetUserWafRulesetResponseBody model) {
            this.requestId = model.requestId;
            this.ruleset = model.ruleset;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Ruleset.
         */
        public Builder ruleset(Ruleset ruleset) {
            this.ruleset = ruleset;
            return this;
        }

        public GetUserWafRulesetResponseBody build() {
            return new GetUserWafRulesetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserWafRulesetResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserWafRulesetResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("CharacteristicsFields")
        private java.util.List<String> characteristicsFields;

        @com.aliyun.core.annotation.NameInMap("Config")
        private WafRuleConfig config;

        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List<String> fields;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Long position;

        @com.aliyun.core.annotation.NameInMap("RulesetId")
        private Long rulesetId;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private String skip;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Rules(Builder builder) {
            this.action = builder.action;
            this.characteristicsFields = builder.characteristicsFields;
            this.config = builder.config;
            this.fields = builder.fields;
            this.id = builder.id;
            this.name = builder.name;
            this.phase = builder.phase;
            this.position = builder.position;
            this.rulesetId = builder.rulesetId;
            this.skip = builder.skip;
            this.status = builder.status;
            this.tags = builder.tags;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return characteristicsFields
         */
        public java.util.List<String> getCharacteristicsFields() {
            return this.characteristicsFields;
        }

        /**
         * @return config
         */
        public WafRuleConfig getConfig() {
            return this.config;
        }

        /**
         * @return fields
         */
        public java.util.List<String> getFields() {
            return this.fields;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return position
         */
        public Long getPosition() {
            return this.position;
        }

        /**
         * @return rulesetId
         */
        public Long getRulesetId() {
            return this.rulesetId;
        }

        /**
         * @return skip
         */
        public String getSkip() {
            return this.skip;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String action; 
            private java.util.List<String> characteristicsFields; 
            private WafRuleConfig config; 
            private java.util.List<String> fields; 
            private Long id; 
            private String name; 
            private String phase; 
            private Long position; 
            private Long rulesetId; 
            private String skip; 
            private String status; 
            private java.util.List<String> tags; 
            private String type; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.action = model.action;
                this.characteristicsFields = model.characteristicsFields;
                this.config = model.config;
                this.fields = model.fields;
                this.id = model.id;
                this.name = model.name;
                this.phase = model.phase;
                this.position = model.position;
                this.rulesetId = model.rulesetId;
                this.skip = model.skip;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * CharacteristicsFields.
             */
            public Builder characteristicsFields(java.util.List<String> characteristicsFields) {
                this.characteristicsFields = characteristicsFields;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(WafRuleConfig config) {
                this.config = config;
                return this;
            }

            /**
             * Fields.
             */
            public Builder fields(java.util.List<String> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Long position) {
                this.position = position;
                return this;
            }

            /**
             * RulesetId.
             */
            public Builder rulesetId(Long rulesetId) {
                this.rulesetId = rulesetId;
                return this;
            }

            /**
             * Skip.
             */
            public Builder skip(String skip) {
                this.skip = skip;
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
             * Tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserWafRulesetResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserWafRulesetResponseBody</p>
     */
    public static class Ruleset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("Position")
        private Long position;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        @com.aliyun.core.annotation.NameInMap("Shared")
        private WafBatchRuleShared shared;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Ruleset(Builder builder) {
            this.description = builder.description;
            this.expression = builder.expression;
            this.id = builder.id;
            this.name = builder.name;
            this.phase = builder.phase;
            this.position = builder.position;
            this.rules = builder.rules;
            this.shared = builder.shared;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ruleset create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return position
         */
        public Long getPosition() {
            return this.position;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        /**
         * @return shared
         */
        public WafBatchRuleShared getShared() {
            return this.shared;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String expression; 
            private Long id; 
            private String name; 
            private String phase; 
            private Long position; 
            private java.util.List<Rules> rules; 
            private WafBatchRuleShared shared; 
            private String status; 

            private Builder() {
            } 

            private Builder(Ruleset model) {
                this.description = model.description;
                this.expression = model.expression;
                this.id = model.id;
                this.name = model.name;
                this.phase = model.phase;
                this.position = model.position;
                this.rules = model.rules;
                this.shared = model.shared;
                this.status = model.status;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * Position.
             */
            public Builder position(Long position) {
                this.position = position;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * Shared.
             */
            public Builder shared(WafBatchRuleShared shared) {
                this.shared = shared;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Ruleset build() {
                return new Ruleset(this);
            } 

        } 

    }
}
