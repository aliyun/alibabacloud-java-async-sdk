// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPurchaserShopRequest} extends {@link RequestModel}
 *
 * <p>GetPurchaserShopRequest</p>
 */
public class GetPurchaserShopRequest extends Request {
    @Path
    @NameInMap("purchaserId")
    @Validation(required = true)
    private String purchaserId;

    private GetPurchaserShopRequest(Builder builder) {
        super(builder);
        this.purchaserId = builder.purchaserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPurchaserShopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public static final class Builder extends Request.Builder<GetPurchaserShopRequest, Builder> {
        private String purchaserId; 

        private Builder() {
            super();
        } 

        private Builder(GetPurchaserShopRequest request) {
            super(request);
            this.purchaserId = request.purchaserId;
        } 

        /**
         * purchaserId.
         */
        public Builder purchaserId(String purchaserId) {
            this.putPathParameter("purchaserId", purchaserId);
            this.purchaserId = purchaserId;
            return this;
        }

        @Override
        public GetPurchaserShopRequest build() {
            return new GetPurchaserShopRequest(this);
        } 

    } 

}
