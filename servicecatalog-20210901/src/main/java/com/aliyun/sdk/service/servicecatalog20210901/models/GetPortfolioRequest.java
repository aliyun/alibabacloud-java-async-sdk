// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPortfolioRequest} extends {@link RequestModel}
 *
 * <p>GetPortfolioRequest</p>
 */
public class GetPortfolioRequest extends Request {
    @Query
    @NameInMap("PortfolioId")
    @Validation(required = true)
    private String portfolioId;

    private GetPortfolioRequest(Builder builder) {
        super(builder);
        this.portfolioId = builder.portfolioId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPortfolioRequest create() {
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

    public static final class Builder extends Request.Builder<GetPortfolioRequest, Builder> {
        private String portfolioId; 

        private Builder() {
            super();
        } 

        private Builder(GetPortfolioRequest request) {
            super(request);
            this.portfolioId = request.portfolioId;
        } 

        /**
         * The ID of the product portfolio.
         */
        public Builder portfolioId(String portfolioId) {
            this.putQueryParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        @Override
        public GetPortfolioRequest build() {
            return new GetPortfolioRequest(this);
        } 

    } 

}
