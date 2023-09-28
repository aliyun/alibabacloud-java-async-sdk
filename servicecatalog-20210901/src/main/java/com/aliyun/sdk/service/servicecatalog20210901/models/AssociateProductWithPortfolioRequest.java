// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateProductWithPortfolioRequest} extends {@link RequestModel}
 *
 * <p>AssociateProductWithPortfolioRequest</p>
 */
public class AssociateProductWithPortfolioRequest extends Request {
    @Body
    @NameInMap("PortfolioId")
    @Validation(required = true)
    private String portfolioId;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    private AssociateProductWithPortfolioRequest(Builder builder) {
        super(builder);
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateProductWithPortfolioRequest create() {
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

    public static final class Builder extends Request.Builder<AssociateProductWithPortfolioRequest, Builder> {
        private String portfolioId; 
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateProductWithPortfolioRequest request) {
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
        public AssociateProductWithPortfolioRequest build() {
            return new AssociateProductWithPortfolioRequest(this);
        } 

    } 

}
