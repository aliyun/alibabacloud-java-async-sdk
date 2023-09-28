// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConstraintRequest} extends {@link RequestModel}
 *
 * <p>CreateConstraintRequest</p>
 */
public class CreateConstraintRequest extends Request {
    @Body
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Body
    @NameInMap("ConstraintType")
    @Validation(required = true)
    private String constraintType;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("PortfolioId")
    @Validation(required = true)
    private String portfolioId;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    private CreateConstraintRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.constraintType = builder.constraintType;
        this.description = builder.description;
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConstraintRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return constraintType
     */
    public String getConstraintType() {
        return this.constraintType;
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
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    public static final class Builder extends Request.Builder<CreateConstraintRequest, Builder> {
        private String config; 
        private String constraintType; 
        private String description; 
        private String portfolioId; 
        private String productId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConstraintRequest request) {
            super(request);
            this.config = request.config;
            this.constraintType = request.constraintType;
            this.description = request.description;
            this.portfolioId = request.portfolioId;
            this.productId = request.productId;
        } 

        /**
         * The configuration of the constraint.
         * <p>
         * 
         * Format: { "LocalRoleName": "\<role_name>" }.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The type of the constraint.
         * <p>
         * 
         * The value is fixed as Launch, which specifies the launch constraint.
         */
        public Builder constraintType(String constraintType) {
            this.putBodyParameter("ConstraintType", constraintType);
            this.constraintType = constraintType;
            return this;
        }

        /**
         * The description of the constraint.
         * <p>
         * 
         * The value must be 1 to 128 characters in length.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the product portfolio to which the constraint belongs.
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * The ID of the product for which the constraint is created.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        @Override
        public CreateConstraintRequest build() {
            return new CreateConstraintRequest(this);
        } 

    } 

}
