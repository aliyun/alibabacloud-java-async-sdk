// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductQuotaDimensionsRequest} extends {@link RequestModel}
 *
 * <p>ListProductQuotaDimensionsRequest</p>
 */
public class ListProductQuotaDimensionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaCategory")
    private String quotaCategory;

    private ListProductQuotaDimensionsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaCategory = builder.quotaCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductQuotaDimensionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListProductQuotaDimensionsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaCategory; 

        private Builder() {
            super();
        } 

        private Builder(ListProductQuotaDimensionsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaCategory = request.quotaCategory;
        } 

        /**
         * The maximum number of records that can be returned for the query.
         * <p>
         * 
         * Valid values: 1 to 200. Default value: 30.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position from which you want to start the query. If you leave this parameter empty, the query starts from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The abbreviation of the Alibaba Cloud service name.
         * <p>
         * 
         * > For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The type of the quota. Valid values:
         * <p>
         * 
         * *   FlowControl: API rate limit.
         * *   CommonQuota: general quota. This is the default value.
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        @Override
        public ListProductQuotaDimensionsRequest build() {
            return new ListProductQuotaDimensionsRequest(this);
        } 

    } 

}
