// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QuerySkuPriceListRequest} extends {@link RequestModel}
 *
 * <p>QuerySkuPriceListRequest</p>
 */
public class QuerySkuPriceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PriceEntityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String priceEntityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PriceFactorConditionMap")
    private java.util.Map<String, java.util.List<String>> priceFactorConditionMap;

    private QuerySkuPriceListRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.lang = builder.lang;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
    public java.util.Map<String, java.util.List<String>> getPriceFactorConditionMap() {
        return this.priceFactorConditionMap;
    }

    public static final class Builder extends Request.Builder<QuerySkuPriceListRequest, Builder> {
        private String commodityCode; 
        private String lang; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String priceEntityCode; 
        private java.util.Map<String, java.util.List<String>> priceFactorConditionMap; 

        private Builder() {
            super();
        } 

        private Builder(QuerySkuPriceListRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.lang = request.lang;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.priceEntityCode = request.priceEntityCode;
            this.priceFactorConditionMap = request.priceFactorConditionMap;
        } 

        /**
         * <p>The commodity code. You can call the <strong>QueryCommodityList</strong> operation to query the commodity code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The language. Default value: zh (Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The pagination token. Leave this parameter empty for the first page query. The query result returns a token for the next page. An empty token in the result indicates that all data has been retrieved. You can obtain the next page token from the <strong>NextPageToken</strong> field in the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>080112060a0422020800180022490a470342000000315333303332363436363336333433393636333136333338333733373333333133373336363336323634363336363337333836333636333636313336363433363332</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The pricing entity code. You can call the <strong>QueryPriceEntityList</strong> operation to query the pricing entity code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_type</p>
         */
        public Builder priceEntityCode(String priceEntityCode) {
            this.putQueryParameter("PriceEntityCode", priceEntityCode);
            this.priceEntityCode = priceEntityCode;
            return this;
        }

        /**
         * <p>The collection of pricing factor conditions. You can call the <strong>QueryPriceEntityList</strong> operation to query pricing factor codes and pricing factor values.</p>
         */
        public Builder priceFactorConditionMap(java.util.Map<String, java.util.List<String>> priceFactorConditionMap) {
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
