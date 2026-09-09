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
 * {@link DescribeRelatedDefenseRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRelatedDefenseRulesResponseBody</p>
 */
public class DescribeRelatedDefenseRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeRelatedDefenseRulesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRelatedDefenseRulesResponseBody create() {
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
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Rules> rules; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRelatedDefenseRulesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token (<strong>Token</strong>) for the next page. If a next page exists, this field has a return value.</p>
         * <blockquote>
         * <p>If this parameter has a return value, a next page exists. Use the returned <strong>NextToken</strong> as a request parameter to obtain the data on the next page. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of associated rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRelatedDefenseRulesResponseBody build() {
            return new DescribeRelatedDefenseRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRelatedDefenseRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRelatedDefenseRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseScene")
        private String defenseScene;

        @com.aliyun.core.annotation.NameInMap("DefenseType")
        private String defenseType;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private Rules(Builder builder) {
            this.defenseScene = builder.defenseScene;
            this.defenseType = builder.defenseType;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return defenseScene
         */
        public String getDefenseScene() {
            return this.defenseScene;
        }

        /**
         * @return defenseType
         */
        public String getDefenseType() {
            return this.defenseType;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String defenseScene; 
            private String defenseType; 
            private Long ruleId; 
            private String ruleName; 
            private Long templateId; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.defenseScene = model.defenseScene;
                this.defenseType = model.defenseType;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The protection scenario of the protection rule. For more information, refer to the <strong>DefenseScene</strong> parameter in <a href="https://help.aliyun.com/document_detail/461426.html">DescribeDefenseRules</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_acl</p>
             */
            public Builder defenseScene(String defenseScene) {
                this.defenseScene = defenseScene;
                return this;
            }

            /**
             * <p>The type of the protection rule. Valid values:</p>
             * <ul>
             * <li><p><strong>template</strong> (default): a template-based protection rule.</p>
             * </li>
             * <li><p><strong>resource</strong>: a protection object-level rule.</p>
             * </li>
             * <li><p><strong>global</strong>: a global-level rule.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>template</p>
             */
            public Builder defenseType(String defenseType) {
                this.defenseType = defenseType;
                return this;
            }

            /**
             * <p>The ID of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>2456789</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ruleTest</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The ID of the protection rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>81501</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
