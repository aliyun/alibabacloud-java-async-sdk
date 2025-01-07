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
    private java.util.List<String> selectedPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteImages")
    private java.util.List<String> whiteImages;

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
    public java.util.List<String> getSelectedPolicy() {
        return this.selectedPolicy;
    }

    /**
     * @return whiteImages
     */
    public java.util.List<String> getWhiteImages() {
        return this.whiteImages;
    }

    public static final class Builder extends Request.Builder<AddContainerPluginRuleRequest, Builder> {
        private String lang; 
        private Integer mode; 
        private String ruleName; 
        private Integer ruleTemplateId; 
        private Integer ruleType; 
        private java.util.List<String> selectedPolicy; 
        private java.util.List<String> whiteImages; 

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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The action that you want to specify for the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: triggers alerts.</li>
         * <li><strong>2</strong>: blocks escapes.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mode(Integer mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The name of the rule. The name must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_). The names of rules that are created for the same user must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tyest111</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The ID of the rule template. You can call the ListSystemClientRules operation to query the ID of the rule template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86863</p>
         */
        public Builder ruleTemplateId(Integer ruleTemplateId) {
            this.putQueryParameter("RuleTemplateId", ruleTemplateId);
            this.ruleTemplateId = ruleTemplateId;
            return this;
        }

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: custom rule</li>
         * <li><strong>1</strong>: system rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The check items that are enabled for the rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder selectedPolicy(java.util.List<String> selectedPolicy) {
            this.putQueryParameter("SelectedPolicy", selectedPolicy);
            this.selectedPolicy = selectedPolicy;
            return this;
        }

        /**
         * <p>The images that are added to the whitelist.</p>
         */
        public Builder whiteImages(java.util.List<String> whiteImages) {
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
