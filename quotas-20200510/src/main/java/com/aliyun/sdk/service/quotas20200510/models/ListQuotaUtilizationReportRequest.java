// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link ListQuotaUtilizationReportRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaUtilizationReportRequest</p>
 */
public class ListQuotaUtilizationReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Adjustable")
    private Boolean adjustable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyWords")
    private String keyWords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaCategory")
    private String quotaCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaRegionId")
    private String quotaRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UtilizationStatuses")
    private java.util.List<String> utilizationStatuses;

    private ListQuotaUtilizationReportRequest(Builder builder) {
        super(builder);
        this.adjustable = builder.adjustable;
        this.keyWords = builder.keyWords;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaCategory = builder.quotaCategory;
        this.quotaRegionId = builder.quotaRegionId;
        this.utilizationStatuses = builder.utilizationStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaUtilizationReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adjustable
     */
    public Boolean getAdjustable() {
        return this.adjustable;
    }

    /**
     * @return keyWords
     */
    public String getKeyWords() {
        return this.keyWords;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return quotaCategory
     */
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    /**
     * @return quotaRegionId
     */
    public String getQuotaRegionId() {
        return this.quotaRegionId;
    }

    /**
     * @return utilizationStatuses
     */
    public java.util.List<String> getUtilizationStatuses() {
        return this.utilizationStatuses;
    }

    public static final class Builder extends Request.Builder<ListQuotaUtilizationReportRequest, Builder> {
        private Boolean adjustable; 
        private String keyWords; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaCategory; 
        private String quotaRegionId; 
        private java.util.List<String> utilizationStatuses; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaUtilizationReportRequest request) {
            super(request);
            this.adjustable = request.adjustable;
            this.keyWords = request.keyWords;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaCategory = request.quotaCategory;
            this.quotaRegionId = request.quotaRegionId;
            this.utilizationStatuses = request.utilizationStatuses;
        } 

        /**
         * Adjustable.
         */
        public Builder adjustable(Boolean adjustable) {
            this.putBodyParameter("Adjustable", adjustable);
            this.adjustable = adjustable;
            return this;
        }

        /**
         * KeyWords.
         */
        public Builder keyWords(String keyWords) {
            this.putBodyParameter("KeyWords", keyWords);
            this.keyWords = keyWords;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * QuotaCategory.
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        /**
         * QuotaRegionId.
         */
        public Builder quotaRegionId(String quotaRegionId) {
            this.putBodyParameter("QuotaRegionId", quotaRegionId);
            this.quotaRegionId = quotaRegionId;
            return this;
        }

        /**
         * UtilizationStatuses.
         */
        public Builder utilizationStatuses(java.util.List<String> utilizationStatuses) {
            this.putBodyParameter("UtilizationStatuses", utilizationStatuses);
            this.utilizationStatuses = utilizationStatuses;
            return this;
        }

        @Override
        public ListQuotaUtilizationReportRequest build() {
            return new ListQuotaUtilizationReportRequest(this);
        } 

    } 

}
