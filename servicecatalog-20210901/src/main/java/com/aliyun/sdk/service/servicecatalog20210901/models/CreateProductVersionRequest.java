// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateProductVersionRequest</p>
 */
public class CreateProductVersionRequest extends Request {
    @Body
    @NameInMap("Active")
    private Boolean active;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Guidance")
    private String guidance;

    @Body
    @NameInMap("ProductId")
    @Validation(required = true)
    private String productId;

    @Body
    @NameInMap("ProductVersionName")
    @Validation(required = true, maxLength = 100, minLength = 1)
    private String productVersionName;

    @Body
    @NameInMap("TemplateType")
    @Validation(required = true)
    private String templateType;

    @Body
    @NameInMap("TemplateUrl")
    @Validation(required = true)
    private String templateUrl;

    private CreateProductVersionRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.description = builder.description;
        this.guidance = builder.guidance;
        this.productId = builder.productId;
        this.productVersionName = builder.productVersionName;
        this.templateType = builder.templateType;
        this.templateUrl = builder.templateUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return productId
     */
    public String getProductId() {
        return this.productId;
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

    public static final class Builder extends Request.Builder<CreateProductVersionRequest, Builder> {
        private Boolean active; 
        private String description; 
        private String guidance; 
        private String productId; 
        private String productVersionName; 
        private String templateType; 
        private String templateUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductVersionRequest request) {
            super(request);
            this.active = request.active;
            this.description = request.description;
            this.guidance = request.guidance;
            this.productId = request.productId;
            this.productVersionName = request.productVersionName;
            this.templateType = request.templateType;
            this.templateUrl = request.templateUrl;
        } 

        /**
         * Specifies whether the product version is active. Valid values:
         * <p>
         * 
         * *   true: The product version is active. This is the default value.
         * *   false: The product version is inactive.
         */
        public Builder active(Boolean active) {
            this.putBodyParameter("Active", active);
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
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The recommendation information. Valid values:
         * <p>
         * 
         * *   Default: No recommendation information is provided. This is the default value.
         * *   Recommended: the recommendation version.
         * *   Latest: the latest version.
         * *   Deprecated: the version that is about to be discontinued.
         */
        public Builder guidance(String guidance) {
            this.putBodyParameter("Guidance", guidance);
            this.guidance = guidance;
            return this;
        }

        /**
         * The ID of the product to which the product version belongs.
         */
        public Builder productId(String productId) {
            this.putBodyParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * The name of the product version.
         * <p>
         * 
         * The value must be 1 to 128 characters in length.
         */
        public Builder productVersionName(String productVersionName) {
            this.putBodyParameter("ProductVersionName", productVersionName);
            this.productVersionName = productVersionName;
            return this;
        }

        /**
         * The type of the template.
         * <p>
         * 
         * The value is fixed as RosTerraformTemplate, which specifies the Terraform template that is supported by Resource Orchestration Service (ROS).
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("TemplateType", templateType);
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
            this.putBodyParameter("TemplateUrl", templateUrl);
            this.templateUrl = templateUrl;
            return this;
        }

        @Override
        public CreateProductVersionRequest build() {
            return new CreateProductVersionRequest(this);
        } 

    } 

}
