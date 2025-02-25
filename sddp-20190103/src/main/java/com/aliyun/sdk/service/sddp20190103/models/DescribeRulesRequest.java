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
    @com.aliyun.core.annotation.NameInMap("CooperationChannel")
    private String cooperationChannel;

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
    @com.aliyun.core.annotation.NameInMap("Simplify")
    private Boolean simplify;

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
        this.cooperationChannel = builder.cooperationChannel;
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
        this.simplify = builder.simplify;
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
     * @return cooperationChannel
     */
    public String getCooperationChannel() {
        return this.cooperationChannel;
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
     * @return simplify
     */
    public Boolean getSimplify() {
        return this.simplify;
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
        private String cooperationChannel; 
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
        private Boolean simplify; 
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
            this.cooperationChannel = request.cooperationChannel;
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
            this.simplify = request.simplify;
            this.status = request.status;
            this.supportForm = request.supportForm;
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
         * <p>2</p>
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
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
         * <p>The external cooperation channel. Valid values:</p>
         * <ul>
         * <li>DAS</li>
         * <li>YAOCHI</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAS</p>
         */
        public Builder cooperationChannel(String cooperationChannel) {
            this.putQueryParameter("CooperationChannel", cooperationChannel);
            this.cooperationChannel = cooperationChannel;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The type of the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: built-in rule</li>
         * <li><strong>1</strong>: custom rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder customType(Integer customType) {
            this.putQueryParameter("CustomType", customType);
            this.customType = customType;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder featureType(Integer featureType) {
            this.putQueryParameter("FeatureType", featureType);
            this.featureType = featureType;
            return this;
        }

        /**
         * <p>The parent group type of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>4_1</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Specifies whether to allow earlier versions of request parameters to support keywords that are supported in later versions of request parameters. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p>To specify keywords as the content type of the sensitive data detection rule, you can set the Category parameter to 0 for earlier versions of request parameters and set the Category parameter to 5 for later versions of request parameters. You can specify the KeywordCompatible parameter based on your business requirements.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder keywordCompatible(Boolean keywordCompatible) {
            this.putQueryParameter("KeywordCompatible", keywordCompatible);
            this.keywordCompatible = keywordCompatible;
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
         * <li>1: rule-based match</li>
         * <li>2: dictionary-based match</li>
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
         * <p>The name of the sensitive data detection rule. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>*** rule</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the service to which the data asset belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        public Builder productCode(Integer productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID of the service to which the sensitive data detection rule is applied. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates Object Storage Service (OSS). The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>Specifies whether to query a simplified rule. The simplified rule contains only the rule name. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder simplify(Boolean simplify) {
            this.putQueryParameter("Simplify", simplify);
            this.simplify = simplify;
            return this;
        }

        /**
         * <p>The status of the sensitive data detection rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
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
         * <p>The severity level of the alert. Valid values:</p>
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
        public DescribeRulesRequest build() {
            return new DescribeRulesRequest(this);
        } 

    } 

}
