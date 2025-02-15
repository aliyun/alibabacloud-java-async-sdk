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
         * <p>The code of the service.</p>
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page. You do not need to set this parameter if you query coverage details for the first time. The response returns a token that you can use to query coverage details of the next page. If a null value is returned for the NextPageToken parameter, no more coverage details can be queried.</p>
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
         * <p>The number of entries to be returned on each page. Maximum value: 50.</p>
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
         * <p>The code of the pricing object.</p>
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
         * <p>The conditions of the pricing factors.</p>
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
