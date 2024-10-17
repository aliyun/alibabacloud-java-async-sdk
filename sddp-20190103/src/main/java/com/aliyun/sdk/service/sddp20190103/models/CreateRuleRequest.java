// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private Integer category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentCategory")
    private Integer contentCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private Integer matchType;

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
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatExpress")
    private String statExpress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportForm")
    private Integer supportForm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarnLevel")
    private Integer warnLevel;

    private CreateRuleRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.content = builder.content;
        this.contentCategory = builder.contentCategory;
        this.description = builder.description;
        this.lang = builder.lang;
        this.matchType = builder.matchType;
        this.name = builder.name;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleType = builder.ruleType;
        this.sourceIp = builder.sourceIp;
        this.statExpress = builder.statExpress;
        this.status = builder.status;
        this.supportForm = builder.supportForm;
        this.target = builder.target;
        this.warnLevel = builder.warnLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleRequest create() {
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
     * @return contentCategory
     */
    public Integer getContentCategory() {
        return this.contentCategory;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return statExpress
     */
    public String getStatExpress() {
        return this.statExpress;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return supportForm
     */
    public Integer getSupportForm() {
        return this.supportForm;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return warnLevel
     */
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

    public static final class Builder extends Request.Builder<CreateRuleRequest, Builder> {
        private Integer category; 
        private String content; 
        private Integer contentCategory; 
        private String description; 
        private String lang; 
        private Integer matchType; 
        private String name; 
        private String productCode; 
        private Long productId; 
        private Long riskLevelId; 
        private Integer ruleType; 
        private String sourceIp; 
        private String statExpress; 
        private Integer status; 
        private Integer supportForm; 
        private String target; 
        private Integer warnLevel; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleRequest request) {
            super(request);
            this.category = request.category;
            this.content = request.content;
            this.contentCategory = request.contentCategory;
            this.description = request.description;
            this.lang = request.lang;
            this.matchType = request.matchType;
            this.name = request.name;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleType = request.ruleType;
            this.sourceIp = request.sourceIp;
            this.statExpress = request.statExpress;
            this.status = request.status;
            this.supportForm = request.supportForm;
            this.target = request.target;
            this.warnLevel = request.warnLevel;
        } 

        /**
         * <p>The content type of the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: keyword</li>
         * <li><strong>2</strong>: regular expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The content of the sensitive data detection rule. You can specify a regular expression or keywords that are used to match sensitive fields or text.</p>
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
         * <p>The type of the content in the sensitive data detection rule. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder contentCategory(Integer contentCategory) {
            this.putQueryParameter("ContentCategory", contentCategory);
            this.contentCategory = contentCategory;
            return this;
        }

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ID card</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
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
         * <p>The name of the sensitive data detection rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-tst</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the service to which data in the column of the table belongs. Valid values include <strong>MaxCompute</strong>, <strong>OSS</strong>, <strong>ADS</strong>, <strong>OTS</strong>, and <strong>RDS</strong>.</p>
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
         * <p>The ID of the service to which the data asset belongs. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <li><strong>1</strong>: sensitive data detection rule</li>
         * <li><strong>2</strong>: audit rule</li>
         * <li><strong>3</strong>: anomalous event detection rule</li>
         * <li><strong>99</strong>: custom rule</li>
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>39.170.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The statistical expression.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder statExpress(String statExpress) {
            this.putQueryParameter("StatExpress", statExpress);
            this.statExpress = statExpress;
            return this;
        }

        /**
         * <p>Specifies whether to enable the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the data asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: all data assets</li>
         * <li><strong>1</strong>: structured data asset</li>
         * <li><strong>2</strong>: unstructured data asset</li>
         * </ul>
         * <blockquote>
         * <p>If you set the parameter to 1 or 2, rules that support all data assets and rules that support the queried data asset type are returned.</p>
         * </blockquote>
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
         * <p>The code of the service to which the sensitive data detection rule is applied. Valid values include <strong>MaxCompute</strong>, <strong>OSS</strong>, <strong>ADS</strong>, <strong>OTS</strong>, and <strong>RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The risk level of the alert that is triggered. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low</li>
         * <li><strong>2</strong>: medium</li>
         * <li><strong>3</strong>: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder warnLevel(Integer warnLevel) {
            this.putQueryParameter("WarnLevel", warnLevel);
            this.warnLevel = warnLevel;
            return this;
        }

        @Override
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

}
