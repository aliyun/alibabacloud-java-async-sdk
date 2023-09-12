// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductSaleInfoRequest} extends {@link RequestModel}
 *
 * <p>GetProductSaleInfoRequest</p>
 */
public class GetProductSaleInfoRequest extends Request {
    @Path
    @NameInMap("productId")
    @Validation(required = true)
    private String productId;

    @Query
    @NameInMap("distributorShopId")
    @Validation(required = true)
    private String distributorShopId;

    @Query
    @NameInMap("divisionCode")
    private String divisionCode;

    private GetProductSaleInfoRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
        this.distributorShopId = builder.distributorShopId;
        this.divisionCode = builder.divisionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductSaleInfoRequest create() {
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
     * @return distributorShopId
     */
    public String getDistributorShopId() {
        return this.distributorShopId;
    }

    /**
     * @return divisionCode
     */
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public static final class Builder extends Request.Builder<GetProductSaleInfoRequest, Builder> {
        private String productId; 
        private String distributorShopId; 
        private String divisionCode; 

        private Builder() {
            super();
        } 

        private Builder(GetProductSaleInfoRequest request) {
            super(request);
            this.productId = request.productId;
            this.distributorShopId = request.distributorShopId;
            this.divisionCode = request.divisionCode;
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
         * distributorShopId.
         */
        public Builder distributorShopId(String distributorShopId) {
            this.putQueryParameter("distributorShopId", distributorShopId);
            this.distributorShopId = distributorShopId;
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

        @Override
        public GetProductSaleInfoRequest build() {
            return new GetProductSaleInfoRequest(this);
        } 

    } 

}
