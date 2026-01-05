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
 * {@link CreatePortfolioRequest} extends {@link RequestModel}
 *
 * <p>CreatePortfolioRequest</p>
 */
public class CreatePortfolioRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortfolioName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String portfolioName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String providerName;

    private CreatePortfolioRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.portfolioName = builder.portfolioName;
        this.providerName = builder.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePortfolioRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return portfolioName
     */
    public String getPortfolioName() {
        return this.portfolioName;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    public static final class Builder extends Request.Builder<CreatePortfolioRequest, Builder> {
        private String description; 
        private String portfolioName; 
        private String providerName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePortfolioRequest request) {
            super(request);
            this.description = request.description;
            this.portfolioName = request.portfolioName;
            this.providerName = request.providerName;
        } 

        /**
         * <p>The description of the product portfolio.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the product portfolio.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the product portfolio.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO-IT services</p>
         */
        public Builder portfolioName(String portfolioName) {
            this.putBodyParameter("PortfolioName", portfolioName);
            this.portfolioName = portfolioName;
            return this;
        }

        /**
         * <p>The provider of the product portfolio.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IT team</p>
         */
        public Builder providerName(String providerName) {
            this.putBodyParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        @Override
        public CreatePortfolioRequest build() {
            return new CreatePortfolioRequest(this);
        } 

    } 

}
