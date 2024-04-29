// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddContainerPluginRuleRequest} extends {@link RequestModel}
 *
 * <p>AddContainerPluginRuleRequest</p>
 */
public class AddContainerPluginRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ruleTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectedPolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > selectedPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteImages")
    private java.util.List < String > whiteImages;

    private AddContainerPluginRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.mode = builder.mode;
        this.ruleName = builder.ruleName;
        this.ruleTemplateId = builder.ruleTemplateId;
        this.ruleType = builder.ruleType;
        this.selectedPolicy = builder.selectedPolicy;
        this.whiteImages = builder.whiteImages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddContainerPluginRuleRequest create() {
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
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleTemplateId
     */
    public Integer getRuleTemplateId() {
        return this.ruleTemplateId;
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

    public static final class Builder extends Request.Builder<AddContainerPluginRuleRequest, Builder> {
        private String lang; 
        private Integer mode; 
        private String ruleName; 
        private Integer ruleTemplateId; 
        private Integer ruleType; 
        private java.util.List < String > selectedPolicy; 
        private java.util.List < String > whiteImages; 

        private Builder() {
            super();
        } 

        private Builder(AddContainerPluginRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.mode = request.mode;
            this.ruleName = request.ruleName;
            this.ruleTemplateId = request.ruleTemplateId;
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
         * The action that you want to specify for the rule. Valid values:
         * <p>
         * 
         * *   **1**: triggers alerts.
         * *   **2**: blocks escapes.
         */
        public Builder mode(Integer mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The name of the rule. The name must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_). The names of rules that are created for the same user must be unique.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The ID of the rule template. You can call the ListSystemClientRules operation to query the ID of the rule template.
         */
        public Builder ruleTemplateId(Integer ruleTemplateId) {
            this.putQueryParameter("RuleTemplateId", ruleTemplateId);
            this.ruleTemplateId = ruleTemplateId;
            return this;
        }

        /**
         * The type of the rule. Valid values:
         * <p>
         * 
         * *   **0**: custom rule
         * *   **1**: system rule
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The check items that are enabled for the rule.
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
        public AddContainerPluginRuleRequest build() {
            return new AddContainerPluginRuleRequest(this);
        } 

    } 

}
