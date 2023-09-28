// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociateProductFromPortfolioRequest} extends {@link RequestModel}
 *
 * <p>DisassociateProductFromPortfolioRequest</p>
 */
public class DisassociateProductFromPortfolioRequest extends Request {
    @Body
    @NameInMap("PortfolioId")
    @Validation(required = true)
    private String portfolioId;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    private DisassociateProductFromPortfolioRequest(Builder builder) {
        super(builder);
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateProductFromPortfolioRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portfolioId
     */
    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<DisassociateProductFromPortfolioRequest, Builder> {
        private String portfolioId; 
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateProductFromPortfolioRequest request) {
            super(request);
            this.portfolioId = request.portfolioId;
            this.productId = request.productId;
        } 

        /**
         * The ID of the product portfolio.
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * The ID of the product.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public DisassociateProductFromPortfolioRequest build() {
            return new DisassociateProductFromPortfolioRequest(this);
        } 

    } 

}
