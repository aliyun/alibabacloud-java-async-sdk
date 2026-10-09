// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeIPSRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIPSRulesResponseBody</p>
 */
public class DescribeIPSRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DropCount")
    private Long dropCount;

    @com.aliyun.core.annotation.NameInMap("HighRiskCount")
    private Long highRiskCount;

    @com.aliyun.core.annotation.NameInMap("OpenCount")
    private Long openCount;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UserDefineCount")
    private Long userDefineCount;

    private DescribeIPSRulesResponseBody(Builder builder) {
        this.dropCount = builder.dropCount;
        this.highRiskCount = builder.highRiskCount;
        this.openCount = builder.openCount;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
        this.totalCount = builder.totalCount;
        this.userDefineCount = builder.userDefineCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPSRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dropCount
     */
    public Long getDropCount() {
        return this.dropCount;
    }

    /**
     * @return highRiskCount
     */
    public Long getHighRiskCount() {
        return this.highRiskCount;
    }

    /**
     * @return openCount
     */
    public Long getOpenCount() {
        return this.openCount;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userDefineCount
     */
    public Long getUserDefineCount() {
        return this.userDefineCount;
    }

    public static final class Builder {
        private Long dropCount; 
        private Long highRiskCount; 
        private Long openCount; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<Rules> rules; 
        private Long totalCount; 
        private Long userDefineCount; 

        private Builder() {
        } 

        private Builder(DescribeIPSRulesResponseBody model) {
            this.dropCount = model.dropCount;
            this.highRiskCount = model.highRiskCount;
            this.openCount = model.openCount;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.rules = model.rules;
            this.totalCount = model.totalCount;
            this.userDefineCount = model.userDefineCount;
        } 

        /**
         * <p>The number of rules that have the <code>drop</code> action.</p>
         * 
         * <strong>example:</strong>
         * <p>976</p>
         */
        public Builder dropCount(Long dropCount) {
            this.dropCount = dropCount;
            return this;
        }

        /**
         * <p>The number of high-risk rules.</p>
         * 
         * <strong>example:</strong>
         * <p>518</p>
         */
        public Builder highRiskCount(Long highRiskCount) {
            this.highRiskCount = highRiskCount;
            return this;
        }

        /**
         * <p>The total number of enabled rules.</p>
         * 
         * <strong>example:</strong>
         * <p>1752</p>
         */
        public Builder openCount(Long openCount) {
            this.openCount = openCount;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6DF55258-1448-5386-B263-4771D081****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of user-defined rules.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder userDefineCount(Long userDefineCount) {
            this.userDefineCount = userDefineCount;
            return this;
        }

        public DescribeIPSRulesResponseBody build() {
            return new DescribeIPSRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIPSRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIPSRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackApp")
        private String attackApp;

        @com.aliyun.core.annotation.NameInMap("AttackType")
        private String attackType;

        @com.aliyun.core.annotation.NameInMap("CurrentMode")
        private String currentMode;

        @com.aliyun.core.annotation.NameInMap("Cve")
        private String cve;

        @com.aliyun.core.annotation.NameInMap("DefaultMode")
        private String defaultMode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RuleClass")
        private Integer ruleClass;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleLevel")
        private Long ruleLevel;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleUuid")
        private String ruleUuid;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("UserDefined")
        private String userDefined;

        @com.aliyun.core.annotation.NameInMap("UserStatus")
        private Integer userStatus;

        private Rules(Builder builder) {
            this.attackApp = builder.attackApp;
            this.attackType = builder.attackType;
            this.currentMode = builder.currentMode;
            this.cve = builder.cve;
            this.defaultMode = builder.defaultMode;
            this.description = builder.description;
            this.ruleClass = builder.ruleClass;
            this.ruleId = builder.ruleId;
            this.ruleLevel = builder.ruleLevel;
            this.ruleName = builder.ruleName;
            this.ruleUuid = builder.ruleUuid;
            this.updateTime = builder.updateTime;
            this.userDefined = builder.userDefined;
            this.userStatus = builder.userStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return attackApp
         */
        public String getAttackApp() {
            return this.attackApp;
        }

        /**
         * @return attackType
         */
        public String getAttackType() {
            return this.attackType;
        }

        /**
         * @return currentMode
         */
        public String getCurrentMode() {
            return this.currentMode;
        }

        /**
         * @return cve
         */
        public String getCve() {
            return this.cve;
        }

        /**
         * @return defaultMode
         */
        public String getDefaultMode() {
            return this.defaultMode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ruleClass
         */
        public Integer getRuleClass() {
            return this.ruleClass;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleLevel
         */
        public Long getRuleLevel() {
            return this.ruleLevel;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleUuid
         */
        public String getRuleUuid() {
            return this.ruleUuid;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userDefined
         */
        public String getUserDefined() {
            return this.userDefined;
        }

        /**
         * @return userStatus
         */
        public Integer getUserStatus() {
            return this.userStatus;
        }

        public static final class Builder {
            private String attackApp; 
            private String attackType; 
            private String currentMode; 
            private String cve; 
            private String defaultMode; 
            private String description; 
            private Integer ruleClass; 
            private String ruleId; 
            private Long ruleLevel; 
            private String ruleName; 
            private String ruleUuid; 
            private Long updateTime; 
            private String userDefined; 
            private Integer userStatus; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.attackApp = model.attackApp;
                this.attackType = model.attackType;
                this.currentMode = model.currentMode;
                this.cve = model.cve;
                this.defaultMode = model.defaultMode;
                this.description = model.description;
                this.ruleClass = model.ruleClass;
                this.ruleId = model.ruleId;
                this.ruleLevel = model.ruleLevel;
                this.ruleName = model.ruleName;
                this.ruleUuid = model.ruleUuid;
                this.updateTime = model.updateTime;
                this.userDefined = model.userDefined;
                this.userStatus = model.userStatus;
            } 

            /**
             * <p>The target application.</p>
             * 
             * <strong>example:</strong>
             * <p>SMB</p>
             */
            public Builder attackApp(String attackApp) {
                this.attackApp = attackApp;
                return this;
            }

            /**
             * <p>The attack type.</p>
             * 
             * <strong>example:</strong>
             * <p>Exception connection</p>
             */
            public Builder attackType(String attackType) {
                this.attackType = attackType;
                return this;
            }

            /**
             * <p>The current action.</p>
             * 
             * <strong>example:</strong>
             * <p>alert</p>
             */
            public Builder currentMode(String currentMode) {
                this.currentMode = currentMode;
                return this;
            }

            /**
             * <p>The CVE ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cve-2024-38816</p>
             */
            public Builder cve(String cve) {
                this.cve = cve;
                return this;
            }

            /**
             * <p>The default action.</p>
             * 
             * <strong>example:</strong>
             * <p>alert</p>
             */
            public Builder defaultMode(String defaultMode) {
                this.defaultMode = defaultMode;
                return this;
            }

            /**
             * <p>A description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The engine mode.</p>
             * <p>This parameter takes effect only when <code>DefaultMode</code> is set to <code>drop</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleClass(Integer ruleClass) {
                this.ruleClass = ruleClass;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f532f59d-2026-436b-8209-e04d8ebc2****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The rule level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleLevel(Long ruleLevel) {
                this.ruleLevel = ruleLevel;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>Nmap扫描探测</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The rule UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>d401b0cb-dc64-4bbe-bba0-3e7c744****</p>
             */
            public Builder ruleUuid(String ruleUuid) {
                this.ruleUuid = ruleUuid;
                return this;
            }

            /**
             * <p>The UNIX timestamp for when the rule was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1775101028</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Specifies whether the rule is user-defined.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userDefined(String userDefined) {
                this.userDefined = userDefined;
                return this;
            }

            /**
             * <p>The user-defined status of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userStatus(Integer userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
