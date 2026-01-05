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
 * {@link CreateProductRequest} extends {@link RequestModel}
 *
 * <p>CreateProductRequest</p>
 */
public class CreateProductRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String productName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductVersionParameters")
    private ProductVersionParameters productVersionParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProviderName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String providerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private CreateProductRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.productName = builder.productName;
        this.productType = builder.productType;
        this.productVersionParameters = builder.productVersionParameters;
        this.providerName = builder.providerName;
        this.templateType = builder.templateType;
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

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateProductRequest, Builder> {
        private String description; 
        private String productName; 
        private String productType; 
        private ProductVersionParameters productVersionParameters; 
        private String providerName; 
        private String templateType; 

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
            this.templateType = request.templateType;
        } 

        /**
         * <p>The description of the product.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the product.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the product.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO-Create an ECS instance</p>
         */
        public Builder productName(String productName) {
            this.putBodyParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * <p>The type of the product.</p>
         * <p>Set the value to Ros, which specifies Resource Orchestration Service (ROS).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ros</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The information about the product version.</p>
         */
        public Builder productVersionParameters(ProductVersionParameters productVersionParameters) {
            String productVersionParametersShrink = shrink(productVersionParameters, "ProductVersionParameters", "json");
            this.putBodyParameter("ProductVersionParameters", productVersionParametersShrink);
            this.productVersionParameters = productVersionParameters;
            return this;
        }

        /**
         * <p>The provider of the product.</p>
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

        /**
         * <p>The type of the product template. Valid values:</p>
         * <ul>
         * <li>RosTerraformTemplate: the Terraform template that is supported by ROS.</li>
         * <li>RosStandardTemplate: the standard ROS template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RosTerraformTemplate</p>
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateProductRequest build() {
            return new CreateProductRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProductRequest} extends {@link TeaModel}
     *
     * <p>CreateProductRequest</p>
     */
    public static class ProductVersionParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Guidance")
        private String guidance;

        @com.aliyun.core.annotation.NameInMap("ProductVersionName")
        @com.aliyun.core.annotation.Validation(maxLength = 100, minLength = 1)
        private String productVersionName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("TemplateUrl")
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

            private Builder() {
            } 

            private Builder(ProductVersionParameters model) {
                this.active = model.active;
                this.description = model.description;
                this.guidance = model.guidance;
                this.productVersionName = model.productVersionName;
                this.templateType = model.templateType;
                this.templateUrl = model.templateUrl;
            } 

            /**
             * <p>Specifies whether to enable the product version. Valid values:</p>
             * <ul>
             * <li>true (default)</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The description of the product version.</p>
             * <p>The value must be 1 to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the product version.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The recommended product version. Valid values:</p>
             * <ul>
             * <li>Default (default): No product version is recommended.</li>
             * <li>Recommended: the stable version.</li>
             * <li>Latest: the latest version.</li>
             * <li>Deprecated: the version that is about to be deprecated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder guidance(String guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * <p>The name of the product version.</p>
             * <p>The value must be 1 to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder productVersionName(String productVersionName) {
                this.productVersionName = productVersionName;
                return this;
            }

            /**
             * <p>The type of the template.</p>
             * <p>Set the value to RosTerraformTemplate, which indicates the Terraform template that is supported by Resource Orchestration Service (ROS).</p>
             * 
             * <strong>example:</strong>
             * <p>RosTerraformTemplate</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The URL of the template.</p>
             * <p>To obtain the URL of a template, you can call the <a href="~~CreateTemplate~~">CreateTemplate</a> operation.</p>
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
