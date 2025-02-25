// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link ModifyRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyRuleRequest</p>
 */
public class ModifyRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private Integer category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private Integer matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelRuleIds")
    private String modelRuleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelId")
    private Long riskLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportForm")
    private Integer supportForm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateRuleIds")
    private String templateRuleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarnLevel")
    private Integer warnLevel;

    private ModifyRuleRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.content = builder.content;
        this.id = builder.id;
        this.lang = builder.lang;
        this.matchType = builder.matchType;
        this.modelRuleIds = builder.modelRuleIds;
        this.name = builder.name;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleType = builder.ruleType;
        this.supportForm = builder.supportForm;
        this.templateRuleIds = builder.templateRuleIds;
        this.warnLevel = builder.warnLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public Integer getCategory() {
        return this.category;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return matchType
     */
    public Integer getMatchType() {
        return this.matchType;
    }

    /**
     * @return modelRuleIds
     */
    public String getModelRuleIds() {
        return this.modelRuleIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return riskLevelId
     */
    public Long getRiskLevelId() {
        return this.riskLevelId;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return supportForm
     */
    public Integer getSupportForm() {
        return this.supportForm;
    }

    /**
     * @return templateRuleIds
     */
    public String getTemplateRuleIds() {
        return this.templateRuleIds;
    }

    /**
     * @return warnLevel
     */
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

    public static final class Builder extends Request.Builder<ModifyRuleRequest, Builder> {
        private Integer category; 
        private String content; 
        private Long id; 
        private String lang; 
        private Integer matchType; 
        private String modelRuleIds; 
        private String name; 
        private String productCode; 
        private Long productId; 
        private Long riskLevelId; 
        private Integer ruleType; 
        private Integer supportForm; 
        private String templateRuleIds; 
        private Integer warnLevel; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRuleRequest request) {
            super(request);
            this.category = request.category;
            this.content = request.content;
            this.id = request.id;
            this.lang = request.lang;
            this.matchType = request.matchType;
            this.modelRuleIds = request.modelRuleIds;
            this.name = request.name;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleType = request.ruleType;
            this.supportForm = request.supportForm;
            this.templateRuleIds = request.templateRuleIds;
            this.warnLevel = request.warnLevel;
        } 

        /**
         * <p>The content type of the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: regular expression</li>
         * <li><strong>3</strong>: algorithm</li>
         * <li><strong>5</strong>: keyword</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The content of the sensitive data detection rule. You can specify a regular expression, an algorithm, or keywords that are used to match sensitive fields or text.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>(?:\D|^)((?:(?:25[0-4]|2[0-4]\d|1\d{2}|[1-9]\d{1})\.)(?:(?:25[0-5]|2[0-4]\d|[01]?\d?\d)\.){2}(?:25[0-5]|2[0-4]\d|1[0-9]\d|[1-9]\d|[1-9]))(?:\D|$)</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the sensitive data detection rule.</p>
         * <p>You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to obtain the rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1****</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Simplified Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The match type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: rule-based match</li>
         * <li><strong>2</strong>: dictionary-based match</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder matchType(Integer matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * <p>The IDs of the models for sensitive data audit.</p>
         * 
         * <strong>example:</strong>
         * <p>1452</p>
         */
        public Builder modelRuleIds(String modelRuleIds) {
            this.putQueryParameter("ModelRuleIds", modelRuleIds);
            this.modelRuleIds = modelRuleIds;
            return this;
        }

        /**
         * <p>The name of the sensitive data detection rule.</p>
         * <p>You can call the <a href="~~DescribeRules~~">DescribeRules</a> operation to obtain the rule name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esw</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The service to which the sensitive data detection rule is applied. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID of the service to which the sensitive data detection rule is applied. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
         * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
         * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
         * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
         * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * <p>The type of the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: data detection rule</li>
         * <li><strong>2</strong>: audit rule</li>
         * <li><strong>3</strong>: anomalous event detection rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The data assets supported by the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: all data assets</li>
         * <li><strong>1</strong>: structured data assets</li>
         * <li><strong>2</strong>: unstructured data assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder supportForm(Integer supportForm) {
            this.putQueryParameter("SupportForm", supportForm);
            this.supportForm = supportForm;
            return this;
        }

        /**
         * <p>The IDs of the templates that are used to audit sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateRuleIds(String templateRuleIds) {
            this.putQueryParameter("TemplateRuleIds", templateRuleIds);
            this.templateRuleIds = templateRuleIds;
            return this;
        }

        /**
         * <p>The risk level of the alert that is triggered by the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low level</li>
         * <li><strong>2</strong>: medium level</li>
         * <li><strong>3</strong>: high level</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder warnLevel(Integer warnLevel) {
            this.putQueryParameter("WarnLevel", warnLevel);
            this.warnLevel = warnLevel;
            return this;
        }

        @Override
        public ModifyRuleRequest build() {
            return new ModifyRuleRequest(this);
        } 

    } 

}
