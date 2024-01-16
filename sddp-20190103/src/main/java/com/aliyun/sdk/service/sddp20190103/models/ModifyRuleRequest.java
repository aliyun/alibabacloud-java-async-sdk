// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyRuleRequest</p>
 */
public class ModifyRuleRequest extends Request {
    @Query
    @NameInMap("Category")
    private Integer category;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MatchType")
    private Integer matchType;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductId")
    private Long productId;

    @Query
    @NameInMap("RiskLevelId")
    private Long riskLevelId;

    @Query
    @NameInMap("RuleType")
    private Integer ruleType;

    @Query
    @NameInMap("SupportForm")
    private Integer supportForm;

    @Query
    @NameInMap("WarnLevel")
    private Integer warnLevel;

    private ModifyRuleRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.content = builder.content;
        this.id = builder.id;
        this.lang = builder.lang;
        this.matchType = builder.matchType;
        this.name = builder.name;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleType = builder.ruleType;
        this.supportForm = builder.supportForm;
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
        private String name; 
        private String productCode; 
        private Long productId; 
        private Long riskLevelId; 
        private Integer ruleType; 
        private Integer supportForm; 
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
            this.name = request.name;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleType = request.ruleType;
            this.supportForm = request.supportForm;
            this.warnLevel = request.warnLevel;
        } 

        /**
         * The content type of the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **2**: regular expression
         * *   **3**: algorithm
         * *   **5**: keyword
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The content of the sensitive data detection rule. You can specify a regular expression, an algorithm, or keywords that are used to match sensitive fields or text.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The ID of the sensitive data detection rule.
         * <p>
         * 
         * You can call the [DescribeRules](~~DescribeRules~~) operation to obtain the rule ID.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Simplified Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The match type. Valid values:
         * <p>
         * 
         * *   **1**: rule-based match
         * *   **2**: dictionary-based match
         */
        public Builder matchType(Integer matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * The name of the sensitive data detection rule.
         * <p>
         * 
         * You can call the [DescribeRules](~~DescribeRules~~) operation to obtain the rule name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The service to which the sensitive data detection rule is applied. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The ID of the service to which the sensitive data detection rule is applied. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * The sensitivity level of the sensitive data that hits the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **1**: N/A, which indicates that no sensitive data is detected.
         * *   **2**: S1, which indicates the low sensitivity level.
         * *   **3**: S2, which indicates the medium sensitivity level.
         * *   **4**: S3, which indicates the high sensitivity level.
         * *   **5**: S4, which indicates the highest sensitivity level.
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * The type of the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **1**: data detection rule
         * *   **2**: audit rule
         * *   **3**: anomalous event detection rule
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The data assets supported by the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **0**: all data assets
         * *   **1**: structured data assets
         * *   **2**: unstructured data assets
         */
        public Builder supportForm(Integer supportForm) {
            this.putQueryParameter("SupportForm", supportForm);
            this.supportForm = supportForm;
            return this;
        }

        /**
         * The risk level of the alert that is triggered by the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **1**: low level
         * *   **2**: medium level
         * *   **3**: high level
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
