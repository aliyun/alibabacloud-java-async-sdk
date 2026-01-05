// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePortfolioResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePortfolioResponseBody</p>
 */
public class CreatePortfolioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortfolioId")
    private String portfolioId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String portfolioId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePortfolioResponseBody model) {
            this.portfolioId = model.portfolioId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the product portfolio.</p>
         * 
         * <strong>example:</strong>
         * <p>port-bp1yt7582g****</p>
         */
        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
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
