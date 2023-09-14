// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationsDetailForTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaApplicationsDetailForTemplateRequest</p>
 */
public class ListQuotaApplicationsDetailForTemplateRequest extends Request {
    @Body
    @NameInMap("AliyunUid")
    private String aliyunUid;

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

    @Body
    @NameInMap("Status")
    private String status;

    private ListQuotaApplicationsDetailForTemplateRequest(Builder builder) {
        super(builder);
        this.aliyunUid = builder.aliyunUid;
        this.batchQuotaApplicationId = builder.batchQuotaApplicationId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaCategory = builder.quotaCategory;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaApplicationsDetailForTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunUid
     */
    public String getAliyunUid() {
        return this.aliyunUid;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListQuotaApplicationsDetailForTemplateRequest, Builder> {
        private String aliyunUid; 
        private String batchQuotaApplicationId; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaActionCode; 
        private String quotaCategory; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaApplicationsDetailForTemplateRequest request) {
            super(request);
            this.aliyunUid = request.aliyunUid;
            this.batchQuotaApplicationId = request.batchQuotaApplicationId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaCategory = request.quotaCategory;
            this.status = request.status;
        } 

        /**
         * AliyunUid.
         */
        public Builder aliyunUid(String aliyunUid) {
            this.putBodyParameter("AliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListQuotaApplicationsDetailForTemplateRequest build() {
            return new ListQuotaApplicationsDetailForTemplateRequest(this);
        } 

    } 

}
