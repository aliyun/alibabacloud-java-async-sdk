// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCommodityConfigRequest} extends {@link RequestModel}
 *
 * <p>QueryCommodityConfigRequest</p>
 */
public class QueryCommodityConfigRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("QueryModule")
    private Boolean queryModule;

    private QueryCommodityConfigRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.commodityCode = builder.commodityCode;
        this.queryModule = builder.queryModule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCommodityConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return queryModule
     */
    public Boolean getQueryModule() {
        return this.queryModule;
    }

    public static final class Builder extends Request.Builder<QueryCommodityConfigRequest, Builder> {
        private String bizType; 
        private String commodityCode; 
        private Boolean queryModule; 

        private Builder() {
            super();
        } 

        private Builder(QueryCommodityConfigRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.commodityCode = request.commodityCode;
            this.queryModule = request.queryModule;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
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
         * QueryModule.
         */
        public Builder queryModule(Boolean queryModule) {
            this.putQueryParameter("QueryModule", queryModule);
            this.queryModule = queryModule;
            return this;
        }

        @Override
        public QueryCommodityConfigRequest build() {
            return new QueryCommodityConfigRequest(this);
        } 

    } 

}
