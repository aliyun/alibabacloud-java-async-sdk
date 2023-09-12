// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPurchaseOrderStatusRequest} extends {@link RequestModel}
 *
 * <p>GetPurchaseOrderStatusRequest</p>
 */
public class GetPurchaseOrderStatusRequest extends Request {
    @Path
    @NameInMap("purchaseOrderId")
    @Validation(required = true)
    private String purchaseOrderId;

    private GetPurchaseOrderStatusRequest(Builder builder) {
        super(builder);
        this.purchaseOrderId = builder.purchaseOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPurchaseOrderStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return purchaseOrderId
     */
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

    public static final class Builder extends Request.Builder<GetPurchaseOrderStatusRequest, Builder> {
        private String purchaseOrderId; 

        private Builder() {
            super();
        } 

        private Builder(GetPurchaseOrderStatusRequest request) {
            super(request);
            this.purchaseOrderId = request.purchaseOrderId;
        } 

        /**
         * purchaseOrderId.
         */
        public Builder purchaseOrderId(String purchaseOrderId) {
            this.putPathParameter("purchaseOrderId", purchaseOrderId);
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }

        @Override
        public GetPurchaseOrderStatusRequest build() {
            return new GetPurchaseOrderStatusRequest(this);
        } 

    } 

}
