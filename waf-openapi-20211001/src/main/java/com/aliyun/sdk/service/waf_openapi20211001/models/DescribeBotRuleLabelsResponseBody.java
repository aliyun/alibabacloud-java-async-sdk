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
 * {@link DescribeBotRuleLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBotRuleLabelsResponseBody</p>
 */
public class DescribeBotRuleLabelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleLabels")
    private java.util.List<RuleLabels> ruleLabels;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeBotRuleLabelsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.ruleLabels = builder.ruleLabels;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBotRuleLabelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ruleLabels
     */
    public java.util.List<RuleLabels> getRuleLabels() {
        return this.ruleLabels;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<RuleLabels> ruleLabels; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBotRuleLabelsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.ruleLabels = model.ruleLabels;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 200. Default value: 20. This parameter is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. If a value is returned for this parameter, the next page exists.</p>
         * <blockquote>
         * <p>If this parameter has a return value, the next page exists. Use the returned NextToken value as a request parameter to retrieve the next page of data. Repeat until no value is returned, which indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of bot management rule tags.</p>
         */
        public Builder ruleLabels(java.util.List<RuleLabels> ruleLabels) {
            this.ruleLabels = ruleLabels;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBotRuleLabelsResponseBody build() {
            return new DescribeBotRuleLabelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBotRuleLabelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBotRuleLabelsResponseBody</p>
     */
    public static class RuleLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotBehavior")
        private String botBehavior;

        @com.aliyun.core.annotation.NameInMap("DefaultAction")
        private String defaultAction;

        @com.aliyun.core.annotation.NameInMap("DefaultConfig")
        private String defaultConfig;

        @com.aliyun.core.annotation.NameInMap("DefaultStatus")
        private Integer defaultStatus;

        @com.aliyun.core.annotation.NameInMap("LabelKey")
        private String labelKey;

        @com.aliyun.core.annotation.NameInMap("LabelStatus")
        private String labelStatus;

        @com.aliyun.core.annotation.NameInMap("LabelType")
        private String labelType;

        @com.aliyun.core.annotation.NameInMap("SubScene")
        private String subScene;

        private RuleLabels(Builder builder) {
            this.botBehavior = builder.botBehavior;
            this.defaultAction = builder.defaultAction;
            this.defaultConfig = builder.defaultConfig;
            this.defaultStatus = builder.defaultStatus;
            this.labelKey = builder.labelKey;
            this.labelStatus = builder.labelStatus;
            this.labelType = builder.labelType;
            this.subScene = builder.subScene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleLabels create() {
            return builder().build();
        }

        /**
         * @return botBehavior
         */
        public String getBotBehavior() {
            return this.botBehavior;
        }

        /**
         * @return defaultAction
         */
        public String getDefaultAction() {
            return this.defaultAction;
        }

        /**
         * @return defaultConfig
         */
        public String getDefaultConfig() {
            return this.defaultConfig;
        }

        /**
         * @return defaultStatus
         */
        public Integer getDefaultStatus() {
            return this.defaultStatus;
        }

        /**
         * @return labelKey
         */
        public String getLabelKey() {
            return this.labelKey;
        }

        /**
         * @return labelStatus
         */
        public String getLabelStatus() {
            return this.labelStatus;
        }

        /**
         * @return labelType
         */
        public String getLabelType() {
            return this.labelType;
        }

        /**
         * @return subScene
         */
        public String getSubScene() {
            return this.subScene;
        }

        public static final class Builder {
            private String botBehavior; 
            private String defaultAction; 
            private String defaultConfig; 
            private Integer defaultStatus; 
            private String labelKey; 
            private String labelStatus; 
            private String labelType; 
            private String subScene; 

            private Builder() {
            } 

            private Builder(RuleLabels model) {
                this.botBehavior = model.botBehavior;
                this.defaultAction = model.defaultAction;
                this.defaultConfig = model.defaultConfig;
                this.defaultStatus = model.defaultStatus;
                this.labelKey = model.labelKey;
                this.labelStatus = model.labelStatus;
                this.labelType = model.labelType;
                this.subScene = model.subScene;
            } 

            /**
             * <p>The crawler behavior corresponding to the rule tag.</p>
             * <ul>
             * <li><strong>malicious</strong>: malicious crawler.</li>
             * <li><strong>suspicious</strong>: suspected crawler.</li>
             * <li><strong>normal</strong>: normal crawler.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>malicious</p>
             */
            public Builder botBehavior(String botBehavior) {
                this.botBehavior = botBehavior;
                return this;
            }

            /**
             * <p>The default action. Valid values:</p>
             * <ul>
             * <li><strong>block</strong>: Block.</li>
             * <li><strong>monitor</strong>: Monitor.</li>
             * <li><strong>js</strong>: JavaScript verification.</li>
             * <li><strong>captcha</strong>: slider CAPTCHA.</li>
             * <li><strong>captcha_strict</strong>: strict slider CAPTCHA.</li>
             * <li><strong>bypass</strong>: Allow.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder defaultAction(String defaultAction) {
                this.defaultAction = defaultAction;
                return this;
            }

            /**
             * <p>The default configurations corresponding to the label.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;crawlerStatusMap&quot;:{&quot;360&quot;:1,&quot;bytedance&quot;:1}}</p>
             */
            public Builder defaultConfig(String defaultConfig) {
                this.defaultConfig = defaultConfig;
                return this;
            }

            /**
             * <p>The default status of the tag rule.</p>
             * <ul>
             * <li><strong>1</strong>: The rule is enabled.</li>
             * <li><strong>0</strong>: The rule is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder defaultStatus(Integer defaultStatus) {
                this.defaultStatus = defaultStatus;
                return this;
            }

            /**
             * <p>The bot management rule tag.</p>
             * 
             * <strong>example:</strong>
             * <p>malicious_crawler_python</p>
             */
            public Builder labelKey(String labelKey) {
                this.labelKey = labelKey;
                return this;
            }

            /**
             * <p>The tag status.</p>
             * <ul>
             * <li><strong>online</strong>: Online.</li>
             * <li><strong>wait_offline</strong>: Pending offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder labelStatus(String labelStatus) {
                this.labelStatus = labelStatus;
                return this;
            }

            /**
             * <p>The type of the bot rule tag.</p>
             * 
             * <strong>example:</strong>
             * <p>human_machine_challenge</p>
             */
            public Builder labelType(String labelType) {
                this.labelType = labelType;
                return this;
            }

            /**
             * <p>The set of bot management protection scenarios to which the rule belongs. Multiple scenarios are separated by commas (,). Valid values:</p>
             * <ul>
             * <li><strong>web</strong>: Web protection scenario.</li>
             * <li><strong>app</strong>: App protection scenario.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>web,app</p>
             */
            public Builder subScene(String subScene) {
                this.subScene = subScene;
                return this;
            }

            public RuleLabels build() {
                return new RuleLabels(this);
            } 

        } 

    }
}
