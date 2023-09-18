// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryCommodityInfoRequest</p>
 */
public class QueryCommodityInfoRequest extends Request {
    @Body
    @NameInMap("CommodityCode")
    private String commodityCode;

    private QueryCommodityInfoRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public static final class Builder extends Request.Builder<QueryCommodityInfoRequest, Builder> {
        private String commodityCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryCommodityInfoRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        @Override
        public QueryCommodityInfoRequest build() {
            return new QueryCommodityInfoRequest(this);
        } 

    } 

}
