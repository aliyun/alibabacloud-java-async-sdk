// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSelectionProductSaleInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSelectionProductSaleInfoRequest</p>
 */
public class GetSelectionProductSaleInfoRequest extends Request {
    @Path
    @NameInMap("productId")
    @Validation(required = true)
    private String productId;

    @Query
    @NameInMap("divisionCode")
    private String divisionCode;

    @Query
    @NameInMap("purchaserId")
    @Validation(required = true)
    private String purchaserId;

    private GetSelectionProductSaleInfoRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.divisionCode = builder.divisionCode;
        this.purchaserId = builder.purchaserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSelectionProductSaleInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public static final class Builder extends Request.Builder<GetSelectionProductSaleInfoRequest, Builder> {
        private String productId; 
        private String divisionCode; 
        private String purchaserId; 

        private Builder() {
            super();
        } 

        private Builder(GetSelectionProductSaleInfoRequest request) {
            super(request);
            this.productId = request.productId;
            this.divisionCode = request.divisionCode;
            this.purchaserId = request.purchaserId;
        } 

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * divisionCode.
         */
        public Builder divisionCode(String divisionCode) {
            this.putQueryParameter("divisionCode", divisionCode);
            this.divisionCode = divisionCode;
            return this;
        }

        /**
         * purchaserId.
         */
        public Builder purchaserId(String purchaserId) {
            this.putQueryParameter("purchaserId", purchaserId);
            this.purchaserId = purchaserId;
            return this;
        }

        @Override
        public GetSelectionProductSaleInfoRequest build() {
            return new GetSelectionProductSaleInfoRequest(this);
        } 

    } 

}
