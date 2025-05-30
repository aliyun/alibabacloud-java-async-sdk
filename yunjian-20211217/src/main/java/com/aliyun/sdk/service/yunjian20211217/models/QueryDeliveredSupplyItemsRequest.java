// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link QueryDeliveredSupplyItemsRequest} extends {@link RequestModel}
 *
 * <p>QueryDeliveredSupplyItemsRequest</p>
 */
public class QueryDeliveredSupplyItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("commodityTypeCode")
    private String commodityTypeCode;

    private QueryDeliveredSupplyItemsRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.commodityTypeCode = builder.commodityTypeCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeliveredSupplyItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return commodityTypeCode
     */
    public String getCommodityTypeCode() {
        return this.commodityTypeCode;
    }

    public static final class Builder extends Request.Builder<QueryDeliveredSupplyItemsRequest, Builder> {
        private String accountId; 
        private String commodityTypeCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeliveredSupplyItemsRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.commodityTypeCode = request.commodityTypeCode;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * commodityTypeCode.
         */
        public Builder commodityTypeCode(String commodityTypeCode) {
            this.putQueryParameter("commodityTypeCode", commodityTypeCode);
            this.commodityTypeCode = commodityTypeCode;
            return this;
        }

        @Override
        public QueryDeliveredSupplyItemsRequest build() {
            return new QueryDeliveredSupplyItemsRequest(this);
        } 

    } 

}
