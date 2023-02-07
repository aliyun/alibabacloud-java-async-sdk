// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityListRequest} extends {@link RequestModel}
 *
 * <p>QueryCommodityListRequest</p>
 */
public class QueryCommodityListRequest extends Request {
    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    private QueryCommodityListRequest(Builder builder) {
        super(builder);
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<QueryCommodityListRequest, Builder> {
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryCommodityListRequest request) {
            super(request);
            this.productCode = request.productCode;
        } 

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public QueryCommodityListRequest build() {
            return new QueryCommodityListRequest(this);
        } 

    } 

}
