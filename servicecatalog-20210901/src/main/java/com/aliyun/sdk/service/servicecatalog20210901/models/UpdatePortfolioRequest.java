// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePortfolioRequest} extends {@link RequestModel}
 *
 * <p>UpdatePortfolioRequest</p>
 */
public class UpdatePortfolioRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("PortfolioId")
    @Validation(required = true)
    private String portfolioId;

    @Body
    @NameInMap("PortfolioName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String portfolioName;

    @Body
    @NameInMap("ProviderName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String providerName;

    private UpdatePortfolioRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.portfolioId = builder.portfolioId;
        this.portfolioName = builder.portfolioName;
        this.providerName = builder.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePortfolioRequest create() {
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
     * @return portfolioId
     */
    public String getPortfolioId() {
        return this.portfolioId;
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

    public static final class Builder extends Request.Builder<UpdatePortfolioRequest, Builder> {
        private String description; 
        private String portfolioId; 
        private String portfolioName; 
        private String providerName; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePortfolioRequest request) {
            super(request);
            this.description = request.description;
            this.portfolioId = request.portfolioId;
            this.portfolioName = request.portfolioName;
            this.providerName = request.providerName;
        } 

        /**
         * 产品组合描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * 代表资源名称的资源属性字段
         */
        public Builder portfolioName(String portfolioName) {
            this.putBodyParameter("PortfolioName", portfolioName);
            this.portfolioName = portfolioName;
            return this;
        }

        /**
         * 产品组合提供方
         */
        public Builder providerName(String providerName) {
            this.putBodyParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        @Override
        public UpdatePortfolioRequest build() {
            return new UpdatePortfolioRequest(this);
        } 

    } 

}
