// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link QueryFaultBriefListRequest} extends {@link RequestModel}
 *
 * <p>QueryFaultBriefListRequest</p>
 */
public class QueryFaultBriefListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShopIdList")
    private java.util.List<String> shopIdList;

    private QueryFaultBriefListRequest(Builder builder) {
        super(builder);
        this.shopIdList = builder.shopIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaultBriefListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return shopIdList
     */
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    public static final class Builder extends Request.Builder<QueryFaultBriefListRequest, Builder> {
        private java.util.List<String> shopIdList; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaultBriefListRequest request) {
            super(request);
            this.shopIdList = request.shopIdList;
        } 

        /**
         * ShopIdList.
         */
        public Builder shopIdList(java.util.List<String> shopIdList) {
            String shopIdListShrink = shrink(shopIdList, "ShopIdList", "json");
            this.putBodyParameter("ShopIdList", shopIdListShrink);
            this.shopIdList = shopIdList;
            return this;
        }

        @Override
        public QueryFaultBriefListRequest build() {
            return new QueryFaultBriefListRequest(this);
        } 

    } 

}
