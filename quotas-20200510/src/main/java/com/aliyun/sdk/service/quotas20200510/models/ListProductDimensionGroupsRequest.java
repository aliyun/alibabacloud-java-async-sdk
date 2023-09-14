// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductDimensionGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListProductDimensionGroupsRequest</p>
 */
public class ListProductDimensionGroupsRequest extends Request {
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 200)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    private ListProductDimensionGroupsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductDimensionGroupsRequest create() {
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

    public static final class Builder extends Request.Builder<ListProductDimensionGroupsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(ListProductDimensionGroupsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
        } 

        /**
         * The maximum number of records that can be returned for the query. Valid values: 1 to 200. Default value: 30.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position from which you want to start the query. If you leave this parameter empty, the query starts from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The service code.
         * <p>
         * 
         * > For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public ListProductDimensionGroupsRequest build() {
            return new ListProductDimensionGroupsRequest(this);
        } 

    } 

}
