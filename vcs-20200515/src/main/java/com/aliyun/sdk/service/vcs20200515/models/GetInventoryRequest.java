// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventoryRequest} extends {@link RequestModel}
 *
 * <p>GetInventoryRequest</p>
 */
public class GetInventoryRequest extends Request {
    @Body
    @NameInMap("CommodityCode")
    private String commodityCode;

    private GetInventoryRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInventoryRequest create() {
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

    public static final class Builder extends Request.Builder<GetInventoryRequest, Builder> {
        private String commodityCode; 

        private Builder() {
            super();
        } 

        private Builder(GetInventoryRequest response) {
            super(response);
            this.commodityCode = response.commodityCode;
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
        public GetInventoryRequest build() {
            return new GetInventoryRequest(this);
        } 

    } 

}
