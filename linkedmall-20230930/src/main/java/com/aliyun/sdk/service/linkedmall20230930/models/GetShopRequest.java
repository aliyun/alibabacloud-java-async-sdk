// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetShopRequest} extends {@link RequestModel}
 *
 * <p>GetShopRequest</p>
 */
public class GetShopRequest extends Request {
    @Path
    @NameInMap("shopId")
    @Validation(required = true)
    private String shopId;

    private GetShopRequest(Builder builder) {
        super(builder);
        this.shopId = builder.shopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetShopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    public static final class Builder extends Request.Builder<GetShopRequest, Builder> {
        private String shopId; 

        private Builder() {
            super();
        } 

        private Builder(GetShopRequest request) {
            super(request);
            this.shopId = request.shopId;
        } 

        /**
         * shopId.
         */
        public Builder shopId(String shopId) {
            this.putPathParameter("shopId", shopId);
            this.shopId = shopId;
            return this;
        }

        @Override
        public GetShopRequest build() {
            return new GetShopRequest(this);
        } 

    } 

}
