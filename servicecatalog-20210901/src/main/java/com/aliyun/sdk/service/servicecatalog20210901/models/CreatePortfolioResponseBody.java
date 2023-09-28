// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePortfolioResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePortfolioResponseBody</p>
 */
public class CreatePortfolioResponseBody extends TeaModel {
    @NameInMap("PortfolioId")
    private String portfolioId;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePortfolioResponseBody(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePortfolioResponseBody create() {
        return builder().build();
    }

    /**
     * @return portfolioId
     */
    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String portfolioId; 
        private String requestId; 

        /**
         * The ID of the product portfolio.
         */
        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePortfolioResponseBody build() {
            return new CreatePortfolioResponseBody(this);
        } 

    } 

}
