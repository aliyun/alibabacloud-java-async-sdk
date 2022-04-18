// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRulesRequest</p>
 */
public class DescribeRulesRequest extends Request {
    @Query
    @NameInMap("Category")
    private Integer category;

    @Query
    @NameInMap("ContentCategory")
    private Integer contentCategory;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("CustomType")
    private Integer customType;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("KeywordCompatible")
    private Boolean keywordCompatible;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductCode")
    private Integer productCode;

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
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("WarnLevel")
    private Integer warnLevel;

    private DescribeRulesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.contentCategory = builder.contentCategory;
        this.currentPage = builder.currentPage;
        this.customType = builder.customType;
        this.groupId = builder.groupId;
        this.keywordCompatible = builder.keywordCompatible;
        this.lang = builder.lang;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleType = builder.ruleType;
        this.status = builder.status;
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
        private String groupId; 
        private Boolean keywordCompatible; 
        private String lang; 
        private String name; 
        private Integer pageSize; 
        private Integer productCode; 
        private Long productId; 
        private Long riskLevelId; 
        private Integer ruleType; 
        private Integer status; 
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
            this.groupId = request.groupId;
            this.keywordCompatible = request.keywordCompatible;
            this.lang = request.lang;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleType = request.ruleType;
            this.status = request.status;
            this.warnLevel = request.warnLevel;
        } 

        /**
         * Category.
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ContentCategory.
         */
        public Builder contentCategory(Integer contentCategory) {
            this.putQueryParameter("ContentCategory", contentCategory);
            this.contentCategory = contentCategory;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * CustomType.
         */
        public Builder customType(Integer customType) {
            this.putQueryParameter("CustomType", customType);
            this.customType = customType;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * KeywordCompatible.
         */
        public Builder keywordCompatible(Boolean keywordCompatible) {
            this.putQueryParameter("KeywordCompatible", keywordCompatible);
            this.keywordCompatible = keywordCompatible;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(Integer productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RiskLevelId.
         */
        public Builder riskLevelId(Long riskLevelId) {
            this.putQueryParameter("RiskLevelId", riskLevelId);
            this.riskLevelId = riskLevelId;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * WarnLevel.
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
