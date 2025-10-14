// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListNormalizationRulesRequest} extends {@link RequestModel}
 *
 * <p>ListNormalizationRulesRequest</p>
 */
public class ListNormalizationRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationCategoryId")
    private String normalizationCategoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleIds")
    private java.util.List<String> normalizationRuleIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleName")
    private String normalizationRuleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleType")
    private String normalizationRuleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
    private String normalizationSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VendorId")
    private String vendorId;

    private ListNormalizationRulesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationCategoryId = builder.normalizationCategoryId;
        this.normalizationRuleIds = builder.normalizationRuleIds;
        this.normalizationRuleName = builder.normalizationRuleName;
        this.normalizationRuleType = builder.normalizationRuleType;
        this.normalizationSchemaId = builder.normalizationSchemaId;
        this.orderField = builder.orderField;
        this.orderType = builder.orderType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productId = builder.productId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.vendorId = builder.vendorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationRulesRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return normalizationCategoryId
     */
    public String getNormalizationCategoryId() {
        return this.normalizationCategoryId;
    }

    /**
     * @return normalizationRuleIds
     */
    public java.util.List<String> getNormalizationRuleIds() {
        return this.normalizationRuleIds;
    }

    /**
     * @return normalizationRuleName
     */
    public String getNormalizationRuleName() {
        return this.normalizationRuleName;
    }

    /**
     * @return normalizationRuleType
     */
    public String getNormalizationRuleType() {
        return this.normalizationRuleType;
    }

    /**
     * @return normalizationSchemaId
     */
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return vendorId
     */
    public String getVendorId() {
        return this.vendorId;
    }

    public static final class Builder extends Request.Builder<ListNormalizationRulesRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String normalizationCategoryId; 
        private java.util.List<String> normalizationRuleIds; 
        private String normalizationRuleName; 
        private String normalizationRuleType; 
        private String normalizationSchemaId; 
        private String orderField; 
        private String orderType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productId; 
        private String regionId; 
        private Long roleFor; 
        private String vendorId; 

        private Builder() {
            super();
        } 

        private Builder(ListNormalizationRulesRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.normalizationCategoryId = request.normalizationCategoryId;
            this.normalizationRuleIds = request.normalizationRuleIds;
            this.normalizationRuleName = request.normalizationRuleName;
            this.normalizationRuleType = request.normalizationRuleType;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.orderField = request.orderField;
            this.orderType = request.orderType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productId = request.productId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.vendorId = request.vendorId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * NormalizationCategoryId.
         */
        public Builder normalizationCategoryId(String normalizationCategoryId) {
            this.putBodyParameter("NormalizationCategoryId", normalizationCategoryId);
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }

        /**
         * NormalizationRuleIds.
         */
        public Builder normalizationRuleIds(java.util.List<String> normalizationRuleIds) {
            String normalizationRuleIdsShrink = shrink(normalizationRuleIds, "NormalizationRuleIds", "simple");
            this.putBodyParameter("NormalizationRuleIds", normalizationRuleIdsShrink);
            this.normalizationRuleIds = normalizationRuleIds;
            return this;
        }

        /**
         * NormalizationRuleName.
         */
        public Builder normalizationRuleName(String normalizationRuleName) {
            this.putBodyParameter("NormalizationRuleName", normalizationRuleName);
            this.normalizationRuleName = normalizationRuleName;
            return this;
        }

        /**
         * NormalizationRuleType.
         */
        public Builder normalizationRuleType(String normalizationRuleType) {
            this.putBodyParameter("NormalizationRuleType", normalizationRuleType);
            this.normalizationRuleType = normalizationRuleType;
            return this;
        }

        /**
         * NormalizationSchemaId.
         */
        public Builder normalizationSchemaId(String normalizationSchemaId) {
            this.putBodyParameter("NormalizationSchemaId", normalizationSchemaId);
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }

        /**
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putBodyParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * VendorId.
         */
        public Builder vendorId(String vendorId) {
            this.putBodyParameter("VendorId", vendorId);
            this.vendorId = vendorId;
            return this;
        }

        @Override
        public ListNormalizationRulesRequest build() {
            return new ListNormalizationRulesRequest(this);
        } 

    } 

}
