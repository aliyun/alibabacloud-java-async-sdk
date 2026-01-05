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
 * {@link UpdateProductVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductVersionRequest</p>
 */
public class UpdateProductVersionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ProductVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductVersionName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String productVersionName;

    private UpdateProductVersionRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.description = builder.description;
        this.guidance = builder.guidance;
        this.productVersionId = builder.productVersionId;
        this.productVersionName = builder.productVersionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductVersionRequest create() {
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
     * @return productVersionId
     */
    public String getProductVersionId() {
        return this.productVersionId;
    }

    /**
     * @return productVersionName
     */
    public String getProductVersionName() {
        return this.productVersionName;
    }

    public static final class Builder extends Request.Builder<UpdateProductVersionRequest, Builder> {
        private Boolean active; 
        private String description; 
        private String guidance; 
        private String productVersionId; 
        private String productVersionName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductVersionRequest request) {
            super(request);
            this.active = request.active;
            this.description = request.description;
            this.guidance = request.guidance;
            this.productVersionId = request.productVersionId;
            this.productVersionName = request.productVersionName;
        } 

        /**
         * <p>Specifies whether to enable the product version. Valid values:</p>
         * <ul>
         * <li>true: enables the product version. This is the default value.</li>
         * <li>false: disables the product version.</li>
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
         * <li>Recommended: the recommended version.</li>
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

        @Override
        public UpdateProductVersionRequest build() {
            return new UpdateProductVersionRequest(this);
        } 

    } 

}
