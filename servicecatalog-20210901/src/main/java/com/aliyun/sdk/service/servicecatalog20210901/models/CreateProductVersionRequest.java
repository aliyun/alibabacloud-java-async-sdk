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
 * {@link CreateProductVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateProductVersionRequest</p>
 */
public class CreateProductVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Active")
    private Boolean active;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Guidance")
    private String guidance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductVersionName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String productVersionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateUrl")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether the product version is active. Valid values:</p>
         * <ul>
         * <li>true: The product version is active. This is the default value.</li>
         * <li>false: The product version is inactive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder active(Boolean active) {
            this.putBodyParameter("Active", active);
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
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The recommendation information. Valid values:</p>
         * <ul>
         * <li>Default: No recommendation information is provided. This is the default value.</li>
         * <li>Recommended: the recommendation version.</li>
         * <li>Latest: the latest version.</li>
         * <li>Deprecated: the version that is about to be discontinued.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder guidance(String guidance) {
            this.putBodyParameter("Guidance", guidance);
            this.guidance = guidance;
            return this;
        }

        /**
         * <p>The ID of the product to which the product version belongs.</p>
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
         * <p>The name of the product version.</p>
         * <p>The value must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder productVersionName(String productVersionName) {
            this.putBodyParameter("ProductVersionName", productVersionName);
            this.productVersionName = productVersionName;
            return this;
        }

        /**
         * <p>The type of the product template. Valid values:</p>
         * <ul>
         * <li>RosTerraformTemplate: the Terraform template that is supported by Resource Orchestration Service (ROS).</li>
         * <li>RosStandardTemplate: the standard ROS template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RosTerraformTemplate</p>
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>The URL of the template.</p>
         * <p>For more information about how to obtain the URL of a template, see <a href="~~CreateTemplate~~">CreateTemplate</a>.</p>
         * <p>This parameter is required.</p>
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
