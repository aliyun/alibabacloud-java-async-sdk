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
 * {@link CreateConstraintRequest} extends {@link RequestModel}
 *
 * <p>CreateConstraintRequest</p>
 */
public class CreateConstraintRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConstraintType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String constraintType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortfolioId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portfolioId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The configuration of the constraint.</p>
         * <p>Format: { &quot;LocalRoleName&quot;: &quot;&lt;role_name&gt;&quot; }.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;LocalRoleName&quot;: &quot;TestRole&quot; }</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The type of the constraint.</p>
         * <p>The value is fixed as Launch, which specifies the launch constraint.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Launch</p>
         */
        public Builder constraintType(String constraintType) {
            this.putBodyParameter("ConstraintType", constraintType);
            this.constraintType = constraintType;
            return this;
        }

        /**
         * <p>The description of the constraint.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Launch as local role TestRole</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the product portfolio to which the constraint belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>port-bp1yt7582g****</p>
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * <p>The ID of the product for which the constraint is created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-bp18r7q127****</p>
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
