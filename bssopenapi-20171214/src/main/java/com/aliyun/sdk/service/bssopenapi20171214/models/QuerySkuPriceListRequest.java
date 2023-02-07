// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySkuPriceListRequest} extends {@link RequestModel}
 *
 * <p>QuerySkuPriceListRequest</p>
 */
public class QuerySkuPriceListRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("PriceEntityCode")
    @Validation(required = true)
    private String priceEntityCode;

    @Query
    @NameInMap("PriceFactorConditionMap")
    private java.util.Map < String, java.util.List<String>> priceFactorConditionMap;

    private QuerySkuPriceListRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.priceEntityCode = builder.priceEntityCode;
        this.priceFactorConditionMap = builder.priceFactorConditionMap;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySkuPriceListRequest create() {
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

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return priceEntityCode
     */
    public String getPriceEntityCode() {
        return this.priceEntityCode;
    }

    /**
     * @return priceFactorConditionMap
     */
    public java.util.Map < String, java.util.List<String>> getPriceFactorConditionMap() {
        return this.priceFactorConditionMap;
    }

    public static final class Builder extends Request.Builder<QuerySkuPriceListRequest, Builder> {
        private String commodityCode; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String priceEntityCode; 
        private java.util.Map < String, java.util.List<String>> priceFactorConditionMap; 

        private Builder() {
            super();
        } 

        private Builder(QuerySkuPriceListRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.priceEntityCode = request.priceEntityCode;
            this.priceFactorConditionMap = request.priceFactorConditionMap;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PriceEntityCode.
         */
        public Builder priceEntityCode(String priceEntityCode) {
            this.putQueryParameter("PriceEntityCode", priceEntityCode);
            this.priceEntityCode = priceEntityCode;
            return this;
        }

        /**
         * PriceFactorConditionMap.
         */
        public Builder priceFactorConditionMap(java.util.Map < String, java.util.List<String>> priceFactorConditionMap) {
            String priceFactorConditionMapShrink = shrink(priceFactorConditionMap, "PriceFactorConditionMap", "json");
            this.putQueryParameter("PriceFactorConditionMap", priceFactorConditionMapShrink);
            this.priceFactorConditionMap = priceFactorConditionMap;
            return this;
        }

        @Override
        public QuerySkuPriceListRequest build() {
            return new QuerySkuPriceListRequest(this);
        } 

    } 

}
