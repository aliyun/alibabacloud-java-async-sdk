// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link ListUserResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListUserResourcesRequest</p>
 */
public class ListUserResourcesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    private ListUserResourcesRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserResourcesRequest create() {
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

    public static final class Builder extends Request.Builder<ListUserResourcesRequest, Builder> {
        private String commodityCode; 

        private Builder() {
            super();
        } 

        private Builder(ListUserResourcesRequest request) {
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
        public ListUserResourcesRequest build() {
            return new ListUserResourcesRequest(this);
        } 

    } 

}
