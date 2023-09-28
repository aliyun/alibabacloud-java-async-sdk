// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePortfolioRequest} extends {@link RequestModel}
 *
 * <p>DeletePortfolioRequest</p>
 */
public class DeletePortfolioRequest extends Request {
    @Body
    @NameInMap("PortfolioId")
    @Validation(required = true)
    private String portfolioId;

    private DeletePortfolioRequest(Builder builder) {
        super(builder);
        this.portfolioId = builder.portfolioId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePortfolioRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePortfolioRequest, Builder> {
        private String portfolioId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePortfolioRequest request) {
            super(request);
            this.portfolioId = request.portfolioId;
        } 

        /**
         * The ID of the product portfolio.
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        @Override
        public DeletePortfolioRequest build() {
            return new DeletePortfolioRequest(this);
        } 

    } 

}
