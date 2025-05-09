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
 * {@link ListWafRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWafRulesResponseBody</p>
 */
public class ListWafRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceUsage")
    private Long instanceUsage;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("SiteUsage")
    private Long siteUsage;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListWafRulesResponseBody(Builder builder) {
        this.instanceUsage = builder.instanceUsage;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.siteUsage = builder.siteUsage;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceUsage
     */
    public Long getInstanceUsage() {
        return this.instanceUsage;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return siteUsage
     */
    public Long getSiteUsage() {
        return this.siteUsage;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long instanceUsage; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Rules> rules; 
        private Long siteUsage; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListWafRulesResponseBody model) {
            this.instanceUsage = model.instanceUsage;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.siteUsage = model.siteUsage;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Number of rules used in this WAF phase for the corresponding instance of the site.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder instanceUsage(Long instanceUsage) {
            this.instanceUsage = instanceUsage;
            return this;
        }

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned list of rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>Site usage.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder siteUsage(Long siteUsage) {
            this.siteUsage = siteUsage;
            return this;
        }

        /**
         * <p>Total number of rules after filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListWafRulesResponseBody build() {
            return new ListWafRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWafRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListWafRulesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Timer")
        private WafTimer timer;

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
            this.timer = builder.timer;
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
         * @return timer
         */
        public WafTimer getTimer() {
            return this.timer;
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
            private WafTimer timer; 
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
                this.timer = model.timer;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The action corresponding to the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>List of statistical objects for frequency control rules.</p>
             */
            public Builder characteristicsFields(java.util.List<String> characteristicsFields) {
                this.characteristicsFields = characteristicsFields;
                return this;
            }

            /**
             * <p>Rule configuration.</p>
             */
            public Builder config(WafRuleConfig config) {
                this.config = config;
                return this;
            }

            /**
             * <p>List of fields for rule matching</p>
             */
            public Builder fields(java.util.List<String> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>Rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>WAF phase.</p>
             * 
             * <strong>example:</strong>
             * <p>http_custom</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>Position order of the rule in the corresponding ruleset.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder position(Long position) {
                this.position = position;
                return this;
            }

            /**
             * <p>Ruleset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10000001</p>
             */
            public Builder rulesetId(Long rulesetId) {
                this.rulesetId = rulesetId;
                return this;
            }

            /**
             * <p>Skip attribute for whitelist rules.</p>
             * 
             * <strong>example:</strong>
             * <p>part</p>
             */
            public Builder skip(String skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>Rule status.</p>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>List of WAF phases to be skipped by whitelist rules.</p>
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Configuration for the effective time of the rule.</p>
             */
            public Builder timer(WafTimer timer) {
                this.timer = timer;
                return this;
            }

            /**
             * <p>Rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>http_custom</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T00:00:00Z</p>
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
}
