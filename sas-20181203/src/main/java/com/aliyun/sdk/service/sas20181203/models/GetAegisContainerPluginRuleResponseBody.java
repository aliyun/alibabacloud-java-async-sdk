// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAegisContainerPluginRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetAegisContainerPluginRuleResponseBody</p>
 */
public class GetAegisContainerPluginRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAegisContainerPluginRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAegisContainerPluginRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-***0DEF8BF6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAegisContainerPluginRuleResponseBody build() {
            return new GetAegisContainerPluginRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAegisContainerPluginRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetAegisContainerPluginRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

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
        private java.util.List<String> selectedPolicy;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("WhiteImages")
        private java.util.List<String> whiteImages;

        private Data(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.mode = builder.mode;
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

        public static Data create() {
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
        public java.util.List<String> getSelectedPolicy() {
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
        public java.util.List<String> getWhiteImages() {
            return this.whiteImages;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Integer mode; 
            private String ruleDescription; 
            private Long ruleId; 
            private String ruleName; 
            private String ruleTemplateId; 
            private String ruleTemplateName; 
            private java.util.List<String> selectedPolicy; 
            private String switchId; 
            private java.util.List<String> whiteImages; 

            /**
             * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1671607025000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timestamp when the rule was modified. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1671607025000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The action mode of the rule. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: allows escape behavior.</li>
             * <li><strong>1</strong>: triggers alerts.</li>
             * <li><strong>2</strong>: blocks escape behavior.</li>
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
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>autoTest</p>
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>21**</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_test_rule-EmzIXZ</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The template ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>100**</p>
             */
            public Builder ruleTemplateId(String ruleTemplateId) {
                this.ruleTemplateId = ruleTemplateId;
                return this;
            }

            /**
             * <p>The template name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>template01</p>
             */
            public Builder ruleTemplateName(String ruleTemplateName) {
                this.ruleTemplateName = ruleTemplateName;
                return this;
            }

            /**
             * <p>The rule items.</p>
             */
            public Builder selectedPolicy(java.util.List<String> selectedPolicy) {
                this.selectedPolicy = selectedPolicy;
                return this;
            }

            /**
             * <p>The ID of the switch.</p>
             * 
             * <strong>example:</strong>
             * <p>USER-CONTAINER-RULE-SWITCH-TYPE_***</p>
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * <p>The images that are added to the whitelist.</p>
             */
            public Builder whiteImages(java.util.List<String> whiteImages) {
                this.whiteImages = whiteImages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
