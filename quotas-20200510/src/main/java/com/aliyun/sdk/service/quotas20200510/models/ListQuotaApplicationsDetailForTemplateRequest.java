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
 * {@link ListQuotaApplicationsDetailForTemplateRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaApplicationsDetailForTemplateRequest</p>
 */
public class ListQuotaApplicationsDetailForTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AliyunUid")
    private String aliyunUid;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The Alibaba Cloud account for which the quota increase is requested.</p>
         * 
         * <strong>example:</strong>
         * <p>135048337611****</p>
         */
        public Builder aliyunUid(String aliyunUid) {
            this.putBodyParameter("AliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * <p>The ID of the quota application batch.</p>
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
         * <p>The maximum number of records to return for the current query.</p>
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
         * <p>The token that marks the position from which the query starts.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the query starts from the beginning.</p>
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
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * <blockquote>
         * <p>For more information about how to obtain the abbreviation of an Alibaba Cloud service name, see the <code>ProductCode</code> parameter in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
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
         * <p>ecs.c5.large</p>
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * <p>The quota type. Valid values:</p>
         * <ul>
         * <li><p>CommonQuota: General quota.</p>
         * </li>
         * <li><p>FlowControl: API rate limit quota.</p>
         * </li>
         * <li><p>WhiteListLabel: Privilege quota.</p>
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

        /**
         * <p>The approval status of the quota increase request. Valid values:</p>
         * <ul>
         * <li><p>Disagree: The request is rejected.</p>
         * </li>
         * <li><p>Agree: The request is approved.</p>
         * </li>
         * <li><p>Process: The request is in review.</p>
         * </li>
         * <li><p>Cancel: The request is closed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Agree</p>
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
