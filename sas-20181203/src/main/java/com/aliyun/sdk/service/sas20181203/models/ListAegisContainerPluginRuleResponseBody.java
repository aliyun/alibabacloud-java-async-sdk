// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAegisContainerPluginRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListAegisContainerPluginRuleResponseBody</p>
 */
public class ListAegisContainerPluginRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleList")
    private java.util.List < RuleList> ruleList;

    private ListAegisContainerPluginRuleResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.ruleList = builder.ruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAegisContainerPluginRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleList
     */
    public java.util.List < RuleList> getRuleList() {
        return this.ruleList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < RuleList> ruleList; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F3B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The rules.</p>
         */
        public Builder ruleList(java.util.List < RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        public ListAegisContainerPluginRuleResponseBody build() {
            return new ListAegisContainerPluginRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAegisContainerPluginRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListAegisContainerPluginRuleResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAegisContainerPluginRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListAegisContainerPluginRuleResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyKey")
        private String policyKey;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        private Policies(Builder builder) {
            this.policyKey = builder.policyKey;
            this.policyName = builder.policyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return policyKey
         */
        public String getPolicyKey() {
            return this.policyKey;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        public static final class Builder {
            private String policyKey; 
            private String policyName; 

            /**
             * <p>The policy key.</p>
             * 
             * <strong>example:</strong>
             * <p>system_auto_****</p>
             */
            public Builder policyKey(String policyKey) {
                this.policyKey = policyKey;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>System self-starting task****</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAegisContainerPluginRuleResponseBody} extends {@link TeaModel}
     *
     * <p>ListAegisContainerPluginRuleResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private java.util.List < Policies> policies;

        @com.aliyun.core.annotation.NameInMap("RuleDescription")
        private String ruleDescription;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleTemplateId")
        private String ruleTemplateId;

        @com.aliyun.core.annotation.NameInMap("RuleTemplateName")
        private String ruleTemplateName;

        @com.aliyun.core.annotation.NameInMap("SelectedPolicy")
        private java.util.List < String > selectedPolicy;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("WhiteImages")
        private java.util.List < String > whiteImages;

        private RuleList(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.mode = builder.mode;
            this.policies = builder.policies;
            this.ruleDescription = builder.ruleDescription;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleTemplateId = builder.ruleTemplateId;
            this.ruleTemplateName = builder.ruleTemplateName;
            this.selectedPolicy = builder.selectedPolicy;
            this.switchId = builder.switchId;
            this.whiteImages = builder.whiteImages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return policies
         */
        public java.util.List < Policies> getPolicies() {
            return this.policies;
        }

        /**
         * @return ruleDescription
         */
        public String getRuleDescription() {
            return this.ruleDescription;
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
         * @return ruleTemplateId
         */
        public String getRuleTemplateId() {
            return this.ruleTemplateId;
        }

        /**
         * @return ruleTemplateName
         */
        public String getRuleTemplateName() {
            return this.ruleTemplateName;
        }

        /**
         * @return selectedPolicy
         */
        public java.util.List < String > getSelectedPolicy() {
            return this.selectedPolicy;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return whiteImages
         */
        public java.util.List < String > getWhiteImages() {
            return this.whiteImages;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Integer mode; 
            private java.util.List < Policies> policies; 
            private String ruleDescription; 
            private Long ruleId; 
            private String ruleName; 
            private String ruleTemplateId; 
            private String ruleTemplateName; 
            private java.util.List < String > selectedPolicy; 
            private String switchId; 
            private java.util.List < String > whiteImages; 

            /**
             * <p>The time when the rule was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1676355025000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the rule was modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1681985833000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The action of the rule. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Alert</li>
             * <li><strong>2</strong>: Block</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>An array that consists of policies.</p>
             */
            public Builder policies(java.util.List < Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>system_call</p>
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>30****</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-18****</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The ID of the rule template. The ListSystemClientRules operation returns the ID of a rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>868**</p>
             */
            public Builder ruleTemplateId(String ruleTemplateId) {
                this.ruleTemplateId = ruleTemplateId;
                return this;
            }

            /**
             * <p>The name of the rule template.</p>
             * 
             * <strong>example:</strong>
             * <p>system_call</p>
             */
            public Builder ruleTemplateName(String ruleTemplateName) {
                this.ruleTemplateName = ruleTemplateName;
                return this;
            }

            /**
             * <p>The fields in the value of the rule subtype.</p>
             */
            public Builder selectedPolicy(java.util.List < String > selectedPolicy) {
                this.selectedPolicy = selectedPolicy;
                return this;
            }

            /**
             * <p>The switch ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>USER-ENABLE-SWITCH-TYPE_****</p>
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * <p>The images that are added to the whitelist of the rule.</p>
             */
            public Builder whiteImages(java.util.List < String > whiteImages) {
                this.whiteImages = whiteImages;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
}
