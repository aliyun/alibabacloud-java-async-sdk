// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationsForTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaApplicationsForTemplateRequest</p>
 */
public class ListQuotaApplicationsForTemplateRequest extends Request {
    @Body
    @NameInMap("ApplyEndTime")
    private String applyEndTime;

    @Body
    @NameInMap("ApplyStartTime")
    private String applyStartTime;

    @Body
    @NameInMap("BatchQuotaApplicationId")
    private String batchQuotaApplicationId;

    @Body
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("ProductCode")
    private String productCode;

    @Body
    @NameInMap("QuotaActionCode")
    private String quotaActionCode;

    @Body
    @NameInMap("QuotaCategory")
    private String quotaCategory;

    private ListQuotaApplicationsForTemplateRequest(Builder builder) {
        super(builder);
        this.applyEndTime = builder.applyEndTime;
        this.applyStartTime = builder.applyStartTime;
        this.batchQuotaApplicationId = builder.batchQuotaApplicationId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaCategory = builder.quotaCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaApplicationsForTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyEndTime
     */
    public String getApplyEndTime() {
        return this.applyEndTime;
    }

    /**
     * @return applyStartTime
     */
    public String getApplyStartTime() {
        return this.applyStartTime;
    }

    /**
     * @return batchQuotaApplicationId
     */
    public String getBatchQuotaApplicationId() {
        return this.batchQuotaApplicationId;
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
     * @return quotaActionCode
     */
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    /**
     * @return quotaCategory
     */
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public static final class Builder extends Request.Builder<ListQuotaApplicationsForTemplateRequest, Builder> {
        private String applyEndTime; 
        private String applyStartTime; 
        private String batchQuotaApplicationId; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaActionCode; 
        private String quotaCategory; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaApplicationsForTemplateRequest request) {
            super(request);
            this.applyEndTime = request.applyEndTime;
            this.applyStartTime = request.applyStartTime;
            this.batchQuotaApplicationId = request.batchQuotaApplicationId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaCategory = request.quotaCategory;
        } 

        /**
         * ApplyEndTime.
         */
        public Builder applyEndTime(String applyEndTime) {
            this.putBodyParameter("ApplyEndTime", applyEndTime);
            this.applyEndTime = applyEndTime;
            return this;
        }

        /**
         * ApplyStartTime.
         */
        public Builder applyStartTime(String applyStartTime) {
            this.putBodyParameter("ApplyStartTime", applyStartTime);
            this.applyStartTime = applyStartTime;
            return this;
        }

        /**
         * BatchQuotaApplicationId.
         */
        public Builder batchQuotaApplicationId(String batchQuotaApplicationId) {
            this.putBodyParameter("BatchQuotaApplicationId", batchQuotaApplicationId);
            this.batchQuotaApplicationId = batchQuotaApplicationId;
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
         * QuotaActionCode.
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
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

        @Override
        public ListQuotaApplicationsForTemplateRequest build() {
            return new ListQuotaApplicationsForTemplateRequest(this);
        } 

    } 

}
