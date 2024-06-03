// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRulesRequest</p>
 */
public class DescribeRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private Integer category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentCategory")
    private Integer contentCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomType")
    private Integer customType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureType")
    private Integer featureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeywordCompatible")
    private Boolean keywordCompatible;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchType")
    private Integer matchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private Integer productCode;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportForm")
    private Integer supportForm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarnLevel")
    private Integer warnLevel;

    private DescribeRulesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.contentCategory = builder.contentCategory;
        this.currentPage = builder.currentPage;
        this.customType = builder.customType;
        this.featureType = builder.featureType;
        this.groupId = builder.groupId;
        this.keywordCompatible = builder.keywordCompatible;
        this.lang = builder.lang;
        this.matchType = builder.matchType;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleType = builder.ruleType;
        this.status = builder.status;
        this.supportForm = builder.supportForm;
        this.warnLevel = builder.warnLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRulesRequest create() {
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
     * @return contentCategory
     */
    public Integer getContentCategory() {
        return this.contentCategory;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return customType
     */
    public Integer getCustomType() {
        return this.customType;
    }

    /**
     * @return featureType
     */
    public Integer getFeatureType() {
        return this.featureType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return keywordCompatible
     */
    public Boolean getKeywordCompatible() {
        return this.keywordCompatible;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public Integer getProductCode() {
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
     * @return warnLevel
     */
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

    public static final class Builder extends Request.Builder<DescribeRulesRequest, Builder> {
        private Integer category; 
        private Integer contentCategory; 
        private Integer currentPage; 
        private Integer customType; 
        private Integer featureType; 
        private String groupId; 
        private Boolean keywordCompatible; 
        private String lang; 
        private Integer matchType; 
        private String name; 
        private Integer pageSize; 
        private Integer productCode; 
        private Long productId; 
        private Long riskLevelId; 
        private Integer ruleType; 
        private Integer status; 
        private Integer supportForm; 
        private Integer warnLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRulesRequest request) {
            super(request);
            this.category = request.category;
            this.contentCategory = request.contentCategory;
            this.currentPage = request.currentPage;
            this.customType = request.customType;
            this.featureType = request.featureType;
            this.groupId = request.groupId;
            this.keywordCompatible = request.keywordCompatible;
            this.lang = request.lang;
            this.matchType = request.matchType;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleType = request.ruleType;
            this.status = request.status;
            this.supportForm = request.supportForm;
            this.warnLevel = request.warnLevel;
        } 

        /**
         * The content type of the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **0**: keyword
         * *   **2**: regular expression
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The type of the content in the sensitive data detection rule. Valid values include **1**, **2**, **3**, **4**, and **5**. The value 1 indicates attempts to exploit SQL injections. The value 2 indicates bypass by using SQL injections. The value 3 indicates abuse of stored procedures. The value 4 indicates buffer overflow. The value 5 indicates SQL injections based on errors.
         */
        public Builder contentCategory(Integer contentCategory) {
            this.putQueryParameter("ContentCategory", contentCategory);
            this.contentCategory = contentCategory;
            return this;
        }

        /**
         * The page number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The type of the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **0**: built-in rule
         * *   **1**: custom rule
         */
        public Builder customType(Integer customType) {
            this.putQueryParameter("CustomType", customType);
            this.customType = customType;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * The parent group type of the rule.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Specifies whether to allow earlier versions of request parameters to support keywords that are supported in later versions of request parameters. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         * 
         * > To specify keywords as the content type of the sensitive data detection rule, you can set the Category parameter to 0 for earlier versions of request parameters and set the Category parameter to 5 for later versions of request parameters. You can specify the KeywordCompatible parameter based on your business requirements.
         */
        public Builder keywordCompatible(Boolean keywordCompatible) {
            this.putQueryParameter("KeywordCompatible", keywordCompatible);
            this.keywordCompatible = keywordCompatible;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
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
         * The match type. Valid values:
         * <p>
         * 
         * *   1: rule-based match
         * *   2: dictionary-based match
         */
        public Builder matchType(Integer matchType) {
            this.putQueryParameter("MatchType", matchType);
            this.matchType = matchType;
            return this;
        }

        /**
         * The name of the sensitive data detection rule. Fuzzy match is supported.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the service to which the data asset belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
         */
        public Builder productCode(Integer productCode) {
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
         * *   **1**: sensitive data detection rule
         * *   **2**: audit rule
         * *   **3**: anomalous event detection rule
         * *   **99**: custom rule
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The status of the sensitive data detection rule. Valid values:
         * <p>
         * 
         * *   **1**: enabled
         * *   **0**: disabled
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the data asset. Valid values:
         * <p>
         * 
         * *   **0**: all data assets
         * *   **1**: structured data asset
         * *   **2**: unstructured data asset
         * 
         * > If you set the parameter to 1 or 2, rules that support all data assets and rules that support the queried data asset type are returned.
         */
        public Builder supportForm(Integer supportForm) {
            this.putQueryParameter("SupportForm", supportForm);
            this.supportForm = supportForm;
            return this;
        }

        /**
         * The severity level of the alert. Valid values:
         * <p>
         * 
         * *   **1**: low
         * *   **2**: medium
         * *   **3**: high
         */
        public Builder warnLevel(Integer warnLevel) {
            this.putQueryParameter("WarnLevel", warnLevel);
            this.warnLevel = warnLevel;
            return this;
        }

        @Override
        public DescribeRulesRequest build() {
            return new DescribeRulesRequest(this);
        } 

    } 

}
