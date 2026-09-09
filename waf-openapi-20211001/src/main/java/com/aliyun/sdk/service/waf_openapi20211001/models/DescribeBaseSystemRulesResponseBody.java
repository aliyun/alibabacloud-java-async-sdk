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
 * {@link DescribeBaseSystemRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBaseSystemRulesResponseBody</p>
 */
public class DescribeBaseSystemRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeBaseSystemRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBaseSystemRulesResponseBody create() {
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
        private String requestId; 
        private java.util.List<Rules> rules; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeBaseSystemRulesResponseBody model) {
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>80736FA5-FA87-55F6-AA69-C5477C6FE6D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of system protection rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeBaseSystemRulesResponseBody build() {
            return new DescribeBaseSystemRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBaseSystemRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBaseSystemRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CveId")
        private String cveId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DetectType")
        private String detectType;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleStatus")
        private Integer ruleStatus;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Rules(Builder builder) {
            this.cveId = builder.cveId;
            this.description = builder.description;
            this.detectType = builder.detectType;
            this.riskLevel = builder.riskLevel;
            this.ruleAction = builder.ruleAction;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleStatus = builder.ruleStatus;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detectType
         */
        public String getDetectType() {
            return this.detectType;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
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
         * @return ruleStatus
         */
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String cveId; 
            private String description; 
            private String detectType; 
            private String riskLevel; 
            private String ruleAction; 
            private Long ruleId; 
            private String ruleName; 
            private Integer ruleStatus; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.cveId = model.cveId;
                this.description = model.description;
                this.detectType = model.detectType;
                this.riskLevel = model.riskLevel;
                this.ruleAction = model.ruleAction;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.ruleStatus = model.ruleStatus;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The CVE ID of the vulnerability associated with the system rule.</p>
             * 
             * <strong>example:</strong>
             * <p>CVE-2021-34538</p>
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The detection module. Valid values:</p>
             * <ul>
             * <li><strong>sqli</strong>: SQL injection.</li>
             * <li><strong>xss</strong>: cross-site scripting (XSS).</li>
             * <li><strong>cmdi</strong>: OS command injection.</li>
             * <li><strong>expression_injection</strong>: expression injection.</li>
             * <li><strong>java_deserialization</strong>: Java deserialization.</li>
             * <li><strong>dot_net_deserialization</strong>: .NET deserialization.</li>
             * <li><strong>php_deserialization</strong>: PHP deserialization.</li>
             * <li><strong>code_exec</strong>: code execution.</li>
             * <li><strong>ssrf</strong>: server-side request forgery (SSRF).</li>
             * <li><strong>path_traversal</strong>: path traversal.</li>
             * <li><strong>arbitrary_file_uploading</strong>: arbitrary file upload.</li>
             * <li><strong>webshell</strong>: webshell.</li>
             * <li><strong>rfilei</strong>: remote file inclusion (RFI).</li>
             * <li><strong>lfilei</strong>: local file inclusion (LFI).</li>
             * <li><strong>protocol_violation</strong>: protocol violation.</li>
             * <li><strong>scanner_behavior</strong>: scanner behavior.</li>
             * <li><strong>logic_flaw</strong>: business logic bug.</li>
             * <li><strong>arbitrary_file_reading</strong>: arbitrary file read.</li>
             * <li><strong>arbitrary_file_download</strong>: arbitrary file download.</li>
             * <li><strong>xxe</strong>: XML external entity injection.</li>
             * <li><strong>csrf</strong>: cross-site request forgery.</li>
             * <li><strong>crlf</strong>: CRLF injection.</li>
             * <li><strong>other</strong>: other.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sqli</p>
             */
            public Builder detectType(String detectType) {
                this.detectType = detectType;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><p><strong>super_strict</strong>: super strict.</p>
             * </li>
             * <li><p><strong>strict</strong>: strict.</p>
             * </li>
             * <li><p><strong>medium</strong>: medium.</p>
             * </li>
             * <li><p><strong>loose</strong>: loose.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>super_strict</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The rule action. Valid values:</p>
             * <ul>
             * <li><p><strong>block</strong>: Block.</p>
             * </li>
             * <li><p><strong>monitor</strong>: Monitor.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>113089</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the protection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>systemRuleTest</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The rule status. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: disabled.</li>
             * <li><strong>0</strong>: enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleStatus(Integer ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            /**
             * <p>The time when the rule was last updated. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1665460629000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
