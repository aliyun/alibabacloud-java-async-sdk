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
 * {@link UpdateProvisionedProductPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateProvisionedProductPlanRequest</p>
 */
public class UpdateProvisionedProductPlanRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortfolioId")
    private String portfolioId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private UpdateProvisionedProductPlanRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.parameters = builder.parameters;
        this.planId = builder.planId;
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.productVersionId = builder.productVersionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProvisionedProductPlanRequest create() {
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
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
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

    /**
     * @return productVersionId
     */
    public String getProductVersionId() {
        return this.productVersionId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateProvisionedProductPlanRequest, Builder> {
        private String description; 
        private java.util.List<Parameters> parameters; 
        private String planId; 
        private String portfolioId; 
        private String productId; 
        private String productVersionId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProvisionedProductPlanRequest request) {
            super(request);
            this.description = request.description;
            this.parameters = request.parameters;
            this.planId = request.planId;
            this.portfolioId = request.portfolioId;
            this.productId = request.productId;
            this.productVersionId = request.productVersionId;
            this.tags = request.tags;
        } 

        /**
         * <p>The description of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>Create an ECS instance.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>An array that consists of the parameters in the template.</p>
         * <p>Maximum value of N: 200.</p>
         * <blockquote>
         * <p>If you specify Parameters, you must specify ParameterKey and ParameterValue.</p>
         * </blockquote>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-bp1jvmdk2k****</p>
         */
        public Builder planId(String planId) {
            this.putBodyParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>The ID of the product portfolio.</p>
         * <blockquote>
         * <p>If the default launch option exists, you do not need to specify PortfolioId. If the default launch option does not exist, you must specify PortfolioId. For more information about how to obtain the value of PortfolioId, see <a href="~~ListLaunchOptions~~">ListLaunchOptions</a>.</p>
         * </blockquote>
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
         * <p>The ID of the product.</p>
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

        /**
         * <p>The ID of the product version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pv-bp15e79d26****</p>
         */
        public Builder productVersionId(String productVersionId) {
            this.putBodyParameter("ProductVersionId", productVersionId);
            this.productVersionId = productVersionId;
            return this;
        }

        /**
         * <p>An array that consists of custom tags.</p>
         * <p>Maximum value of N: 20.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If you specify Tags, you must specify Tags.N.Key and Tags.N.Value.</li>
         * <li>The tag of a stack is propagated to each resource that supports the tag feature in the stack.</li>
         * </ul>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateProvisionedProductPlanRequest build() {
            return new UpdateProvisionedProductPlanRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProvisionedProductPlanRequest} extends {@link TeaModel}
     *
     * <p>UpdateProvisionedProductPlanRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameterKey = model.parameterKey;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The name of the parameter in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_type</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the parameter in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.s6-c1m1.small</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateProvisionedProductPlanRequest} extends {@link TeaModel}
     *
     * <p>UpdateProvisionedProductPlanRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the custom tag.</p>
             * <p>The key can be up to 128 characters in length, and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the custom tag.</p>
             * <p>The value can be up to 128 characters in length, and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
