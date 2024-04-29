// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyContainerPluginRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyContainerPluginRuleRequest</p>
 */
public class ModifyContainerPluginRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private Integer mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectedPolicy")
    private java.util.List < String > selectedPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteImages")
    private java.util.List < String > whiteImages;

    private ModifyContainerPluginRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.mode = builder.mode;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.selectedPolicy = builder.selectedPolicy;
        this.whiteImages = builder.whiteImages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyContainerPluginRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return mode
     */
    public Integer getMode() {
        return this.mode;
    }

    /**
     * @return ruleId
     */
    public Integer getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return selectedPolicy
     */
    public java.util.List < String > getSelectedPolicy() {
        return this.selectedPolicy;
    }

    /**
     * @return whiteImages
     */
    public java.util.List < String > getWhiteImages() {
        return this.whiteImages;
    }

    public static final class Builder extends Request.Builder<ModifyContainerPluginRuleRequest, Builder> {
        private String lang; 
        private Integer mode; 
        private Integer ruleId; 
        private String ruleName; 
        private Integer ruleType; 
        private java.util.List < String > selectedPolicy; 
        private java.util.List < String > whiteImages; 

        private Builder() {
            super();
        } 

        private Builder(ModifyContainerPluginRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.mode = request.mode;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.selectedPolicy = request.selectedPolicy;
            this.whiteImages = request.whiteImages;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The action mode of the rule. Valid values:
         * <p>
         * 
         * *   **1**: alerts
         * *   **2**: block
         */
        public Builder mode(Integer mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The ID of the rule.
         */
        public Builder ruleId(Integer ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The type of the rule. Valid values:
         * <p>
         * 
         * *   **0**: user-defined rule
         * *   **1**: built-in rule
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The rule items.
         */
        public Builder selectedPolicy(java.util.List < String > selectedPolicy) {
            this.putQueryParameter("SelectedPolicy", selectedPolicy);
            this.selectedPolicy = selectedPolicy;
            return this;
        }

        /**
         * The images that are added to the whitelist.
         */
        public Builder whiteImages(java.util.List < String > whiteImages) {
            this.putQueryParameter("WhiteImages", whiteImages);
            this.whiteImages = whiteImages;
            return this;
        }

        @Override
        public ModifyContainerPluginRuleRequest build() {
            return new ModifyContainerPluginRuleRequest(this);
        } 

    } 

}
