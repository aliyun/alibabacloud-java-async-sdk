// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductRequest} extends {@link RequestModel}
 *
 * <p>CreateProductRequest</p>
 */
public class CreateProductRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("ProductName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String productName;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Body
    @NameInMap("ProductVersionParameters")
    private ProductVersionParameters productVersionParameters;

    @Body
    @NameInMap("ProviderName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String providerName;

    private CreateProductRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.productName = builder.productName;
        this.productType = builder.productType;
        this.productVersionParameters = builder.productVersionParameters;
        this.providerName = builder.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductRequest create() {
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
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return productVersionParameters
     */
    public ProductVersionParameters getProductVersionParameters() {
        return this.productVersionParameters;
    }

    /**
     * @return providerName
     */
    public String getProviderName() {
        return this.providerName;
    }

    public static final class Builder extends Request.Builder<CreateProductRequest, Builder> {
        private String description; 
        private String productName; 
        private String productType; 
        private ProductVersionParameters productVersionParameters; 
        private String providerName; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductRequest request) {
            super(request);
            this.description = request.description;
            this.productName = request.productName;
            this.productType = request.productType;
            this.productVersionParameters = request.productVersionParameters;
            this.providerName = request.providerName;
        } 

        /**
         * The description of the product.
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
         * The name of the product.
         * <p>
         * 
         * The value must be 1 to 128 characters in length.
         */
        public Builder productName(String productName) {
            this.putBodyParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * The type of the product.
         * <p>
         * 
         * Set the value to Ros, which specifies Resource Orchestration Service (ROS).
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * The information about the product version.
         */
        public Builder productVersionParameters(ProductVersionParameters productVersionParameters) {
            String productVersionParametersShrink = shrink(productVersionParameters, "ProductVersionParameters", "json");
            this.putBodyParameter("ProductVersionParameters", productVersionParametersShrink);
            this.productVersionParameters = productVersionParameters;
            return this;
        }

        /**
         * The provider of the product.
         * <p>
         * 
         * The value must be 1 to 128 characters in length.
         */
        public Builder providerName(String providerName) {
            this.putBodyParameter("ProviderName", providerName);
            this.providerName = providerName;
            return this;
        }

        @Override
        public CreateProductRequest build() {
            return new CreateProductRequest(this);
        } 

    } 

    public static class ProductVersionParameters extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Description")
        private String description;

        @NameInMap("Guidance")
        private String guidance;

        @NameInMap("ProductVersionName")
        @Validation(maxLength = 100, minLength = 1)
        private String productVersionName;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("TemplateUrl")
        private String templateUrl;

        private ProductVersionParameters(Builder builder) {
            this.active = builder.active;
            this.description = builder.description;
            this.guidance = builder.guidance;
            this.productVersionName = builder.productVersionName;
            this.templateType = builder.templateType;
            this.templateUrl = builder.templateUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductVersionParameters create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return guidance
         */
        public String getGuidance() {
            return this.guidance;
        }

        /**
         * @return productVersionName
         */
        public String getProductVersionName() {
            return this.productVersionName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return templateUrl
         */
        public String getTemplateUrl() {
            return this.templateUrl;
        }

        public static final class Builder {
            private Boolean active; 
            private String description; 
            private String guidance; 
            private String productVersionName; 
            private String templateType; 
            private String templateUrl; 

            /**
             * Specifies whether to enable the product version. Valid values:
             * <p>
             * 
             * *   true: enables the product version. This is the default value.
             * *   false: disables the product version.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The description of the product version.
             * <p>
             * 
             * The value must be 1 to 128 characters in length.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The recommendation information. Valid values:
             * <p>
             * 
             * *   Default: No recommendation information is provided. This is the default value.
             * *   Recommended: the recommended version.
             * *   Latest: the latest version.
             * *   Deprecated: the version that is about to be discontinued.
             */
            public Builder guidance(String guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * The name of the product version.
             * <p>
             * 
             * The value must be 1 to 128 characters in length.
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * The type of the template.
             * <p>
             * 
             * Set the value to RosTerraformTemplate, which specifies the Terraform template that is supported by ROS.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * The URL of the template.
             * <p>
             * 
             * For more information about how to obtain the URL of a template, see [CreateTemplate](~~CreateTemplate~~).
             */
            public Builder templateUrl(String templateUrl) {
                this.templateUrl = templateUrl;
                return this;
            }

            public ProductVersionParameters build() {
                return new ProductVersionParameters(this);
            } 

        } 

    }
}
