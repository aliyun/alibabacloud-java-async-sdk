// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @Query
    @NameInMap("Category")
    private Integer category;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("ContentCategory")
    private Integer contentCategory;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Lang")
    private String lang;

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
    @NameInMap("StatExpress")
    private String statExpress;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("Target")
    private String target;

    @Query
    @NameInMap("WarnLevel")
    private Integer warnLevel;

    private CreateRuleRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.content = builder.content;
        this.contentCategory = builder.contentCategory;
        this.description = builder.description;
        this.lang = builder.lang;
        this.name = builder.name;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.riskLevelId = builder.riskLevelId;
        this.ruleType = builder.ruleType;
        this.statExpress = builder.statExpress;
        this.status = builder.status;
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
        private String name; 
        private String productCode; 
        private Long productId; 
        private Long riskLevelId; 
        private Integer ruleType; 
        private String statExpress; 
        private Integer status; 
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
            this.name = request.name;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.riskLevelId = request.riskLevelId;
            this.ruleType = request.ruleType;
            this.statExpress = request.statExpress;
            this.status = request.status;
            this.target = request.target;
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
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
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
         * StatExpress.
         */
        public Builder statExpress(String statExpress) {
            this.putQueryParameter("StatExpress", statExpress);
            this.statExpress = statExpress;
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
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
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
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

}
