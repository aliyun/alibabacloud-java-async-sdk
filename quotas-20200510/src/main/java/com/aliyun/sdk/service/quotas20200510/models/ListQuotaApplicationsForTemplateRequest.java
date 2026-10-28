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
 * {@link ListQuotaApplicationsForTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaApplicationsForTemplateRequest</p>
 */
public class ListQuotaApplicationsForTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplyEndTime")
    private String applyEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplyStartTime")
    private String applyStartTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BatchQuotaApplicationId")
    private String batchQuotaApplicationId;

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
    @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
    private String quotaActionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaCategory")
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
         * <p>The end of the time range to query. The value is in UTC.</p>
         * <blockquote>
         * <p>The interval between <code>ApplyStartTime</code> and <code>ApplyEndTime</code> must be 7 days or less. If you do not set these two parameters, quota applications submitted within the last 7 days are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-05-22T16:00:00Z</p>
         */
        public Builder applyEndTime(String applyEndTime) {
            this.putBodyParameter("ApplyEndTime", applyEndTime);
            this.applyEndTime = applyEndTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is in UTC.</p>
         * <blockquote>
         * <p>The interval between <code>ApplyStartTime</code> and <code>ApplyEndTime</code> must be 7 days or less. If you do not set these two parameters, quota applications submitted within the last 7 days are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2023-05-22T16:00:00Z</p>
         */
        public Builder applyStartTime(String applyStartTime) {
            this.putBodyParameter("ApplyStartTime", applyStartTime);
            this.applyStartTime = applyStartTime;
            return this;
        }

        /**
         * <p>The ID of the batch quota application.</p>
         * 
         * <strong>example:</strong>
         * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
         */
        public Builder batchQuotaApplicationId(String batchQuotaApplicationId) {
            this.putBodyParameter("BatchQuotaApplicationId", batchQuotaApplicationId);
            this.batchQuotaApplicationId = batchQuotaApplicationId;
            return this;
        }

        /**
         * <p>The maximum number of results to return for a single request.</p>
         * <p>Valid values: 1 to 100. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the start of the data to read.</p>
         * <blockquote>
         * <p>If you do not set this parameter, the query starts from the beginning.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The abbreviation of the Alibaba Cloud service.</p>
         * <blockquote>
         * <p>For more information about how to obtain the abbreviation of an Alibaba Cloud service, see the <code>ProductCode</code> parameter in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs-spec</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.2xlarge</p>
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * <p>The type of the quota. Valid values:</p>
         * <ul>
         * <li><p>CommonQuota: general quota.</p>
         * </li>
         * <li><p>FlowControl: API rate limit.</p>
         * </li>
         * <li><p>WhiteListLabel: privilege.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonQuota</p>
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
