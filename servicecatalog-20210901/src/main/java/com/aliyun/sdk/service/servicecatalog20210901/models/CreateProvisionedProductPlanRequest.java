// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProvisionedProductPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateProvisionedProductPlanRequest</p>
 */
public class CreateProvisionedProductPlanRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("OperationType")
    private String operationType;

    @Body
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Body
    @NameInMap("PlanName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String planName;

    @Body
    @NameInMap("PlanType")
    @Validation(required = true)
    private String planType;

    @Body
    @NameInMap("PortfolioId")
    private String portfolioId;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    @Body
    @NameInMap("ProductVersionId")
    @Validation(required = true)
    private String productVersionId;

    @Body
    @NameInMap("ProvisionedProductName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String provisionedProductName;

    @Body
    @NameInMap("StackRegionId")
    @Validation(required = true)
    private String stackRegionId;

    @Body
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreateProvisionedProductPlanRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.operationType = builder.operationType;
        this.parameters = builder.parameters;
        this.planName = builder.planName;
        this.planType = builder.planType;
        this.portfolioId = builder.portfolioId;
        this.productId = builder.productId;
        this.productVersionId = builder.productVersionId;
        this.provisionedProductName = builder.provisionedProductName;
        this.stackRegionId = builder.stackRegionId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProvisionedProductPlanRequest create() {
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
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return planType
     */
    public String getPlanType() {
        return this.planType;
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
     * @return provisionedProductName
     */
    public String getProvisionedProductName() {
        return this.provisionedProductName;
    }

    /**
     * @return stackRegionId
     */
    public String getStackRegionId() {
        return this.stackRegionId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateProvisionedProductPlanRequest, Builder> {
        private String description; 
        private String operationType; 
        private java.util.List < Parameters> parameters; 
        private String planName; 
        private String planType; 
        private String portfolioId; 
        private String productId; 
        private String productVersionId; 
        private String provisionedProductName; 
        private String stackRegionId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateProvisionedProductPlanRequest request) {
            super(request);
            this.description = request.description;
            this.operationType = request.operationType;
            this.parameters = request.parameters;
            this.planName = request.planName;
            this.planType = request.planType;
            this.portfolioId = request.portfolioId;
            this.productId = request.productId;
            this.productVersionId = request.productVersionId;
            this.provisionedProductName = request.provisionedProductName;
            this.stackRegionId = request.stackRegionId;
            this.tags = request.tags;
        } 

        /**
         * The description of the plan.
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
         * The type of the operation that you want the plan to perform. Valid values:
         * <p>
         * 
         * *   LaunchProduct: launches the product. This is the default value.
         * *   UpdateProvisionedProduct: updates the information about the product instance.
         * *   TerminateProvisionedProduct: terminates the product instance.
         */
        public Builder operationType(String operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * An array that consists of the parameters in the template.
         * <p>
         * 
         * You can specify up to 200 parameters.
         * 
         * > If you specify Parameters, you must specify ParameterKey and ParameterValue.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The plan name.
         * <p>
         * 
         * The value must be 1 to 128 characters in length.
         */
        public Builder planName(String planName) {
            this.putBodyParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * The plan type.
         * <p>
         * 
         * Set the value to Ros, which specifies Resource Orchestration Service (ROS).
         */
        public Builder planType(String planType) {
            this.putBodyParameter("PlanType", planType);
            this.planType = planType;
            return this;
        }

        /**
         * The product portfolio ID.
         * <p>
         * 
         * > If PortfolioId is not required, you do not need to specify PortfolioId. If PortfolioId is required, you must specify PortfolioId. For more information about how to obtain the value of PortfolioId, see [ListLaunchOptions](~~ListLaunchOptions~~).
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * The product ID.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * The product version ID.
         */
        public Builder productVersionId(String productVersionId) {
            this.putBodyParameter("ProductVersionId", productVersionId);
            this.productVersionId = productVersionId;
            return this;
        }

        /**
         * The product instance name.
         * <p>
         * 
         * The value must be 1 to 128 characters in length.
         */
        public Builder provisionedProductName(String provisionedProductName) {
            this.putBodyParameter("ProvisionedProductName", provisionedProductName);
            this.provisionedProductName = provisionedProductName;
            return this;
        }

        /**
         * The ID of the region to which the ROS stack belongs.
         * <p>
         * 
         * For more information about how to obtain the regions that are supported by ROS, see [DescribeRegions](~~131035~~).
         */
        public Builder stackRegionId(String stackRegionId) {
            this.putBodyParameter("StackRegionId", stackRegionId);
            this.stackRegionId = stackRegionId;
            return this;
        }

        /**
         * An array that consists of custom tags.
         * <p>
         * 
         * Maximum value of N: 20.
         * 
         * > 
         * *   If you specify Tags, you must specify Tags.N.Key and Tags.N.Value.
         * *   The tag of a stack is propagated to each resource that supports the tag feature in the stack.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateProvisionedProductPlanRequest build() {
            return new CreateProvisionedProductPlanRequest(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
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

            /**
             * The name of the parameter in the template.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter in the template.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The key of the custom tag.
             * <p>
             * 
             * The key can be up to 128 characters in length, and cannot start with `acs:` or `aliyun`. The tag key cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the custom tag.
             * <p>
             * 
             * The value can be up to 128 characters in length, and cannot start with `acs:`. The tag value cannot contain `http://` or `https://`.
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
