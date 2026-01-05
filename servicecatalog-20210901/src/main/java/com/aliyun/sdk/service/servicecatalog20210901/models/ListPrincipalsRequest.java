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
 * {@link ListPrincipalsRequest} extends {@link RequestModel}
 *
 * <p>ListPrincipalsRequest</p>
 */
public class ListPrincipalsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortfolioId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portfolioId;

    private ListPrincipalsRequest(Builder builder) {
        super(builder);
        this.portfolioId = builder.portfolioId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrincipalsRequest create() {
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

    public static final class Builder extends Request.Builder<ListPrincipalsRequest, Builder> {
        private String portfolioId; 

        private Builder() {
            super();
        } 

        private Builder(ListPrincipalsRequest request) {
            super(request);
            this.portfolioId = request.portfolioId;
        } 

        /**
         * <p>The ID of the product portfolio.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>port-bp1yt7582g****</p>
         */
        public Builder portfolioId(String portfolioId) {
            this.putQueryParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        @Override
        public ListPrincipalsRequest build() {
            return new ListPrincipalsRequest(this);
        } 

    } 

}
