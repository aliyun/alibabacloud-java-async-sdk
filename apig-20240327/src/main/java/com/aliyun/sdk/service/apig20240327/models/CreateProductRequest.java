// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
    @com.aliyun.core.annotation.NameInMap("autoApprove")
    private Boolean autoApprove;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("categories")
    private java.util.List<String> categories;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("document")
    private String document;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("feature")
    private HiMarketProductFeature feature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("icon")
    private HiMarketIcon icon;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateProductRequest(Builder builder) {
        super(builder);
        this.autoApprove = builder.autoApprove;
        this.categories = builder.categories;
        this.description = builder.description;
        this.document = builder.document;
        this.feature = builder.feature;
        this.icon = builder.icon;
        this.name = builder.name;
        this.type = builder.type;
        this.clientToken = builder.clientToken;
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
     * @return autoApprove
     */
    public Boolean getAutoApprove() {
        return this.autoApprove;
    }

    /**
     * @return categories
     */
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return document
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * @return feature
     */
    public HiMarketProductFeature getFeature() {
        return this.feature;
    }

    /**
     * @return icon
     */
    public HiMarketIcon getIcon() {
        return this.icon;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CreateProductRequest, Builder> {
        private Boolean autoApprove; 
        private java.util.List<String> categories; 
        private String description; 
        private String document; 
        private HiMarketProductFeature feature; 
        private HiMarketIcon icon; 
        private String name; 
        private String type; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductRequest request) {
            super(request);
            this.autoApprove = request.autoApprove;
            this.categories = request.categories;
            this.description = request.description;
            this.document = request.document;
            this.feature = request.feature;
            this.icon = request.icon;
            this.name = request.name;
            this.type = request.type;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>Specifies whether to automatically approve subscription requests for the product.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoApprove(Boolean autoApprove) {
            this.putBodyParameter("autoApprove", autoApprove);
            this.autoApprove = autoApprove;
            return this;
        }

        /**
         * <p>The list of categories to which the product belongs.</p>
         */
        public Builder categories(java.util.List<String> categories) {
            this.putBodyParameter("categories", categories);
            this.categories = categories;
            return this;
        }

        /**
         * <p>The description of the API product.</p>
         * 
         * <strong>example:</strong>
         * <p>An API product that provides weather query capabilities</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The content of the documentation for the API product.</p>
         * 
         * <strong>example:</strong>
         * <p>The invocation methods, parameters, and billing instructions for this product</p>
         */
        public Builder document(String document) {
            this.putBodyParameter("document", document);
            this.document = document;
            return this;
        }

        /**
         * <p>The capability configuration of the product, which is currently used to describe the invocation capabilities of model-based products (modelFeature).</p>
         */
        public Builder feature(HiMarketProductFeature feature) {
            this.putBodyParameter("feature", feature);
            this.feature = feature;
            return this;
        }

        /**
         * <p>The icon configuration of the API product.</p>
         */
        public Builder icon(HiMarketIcon icon) {
            this.putBodyParameter("icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * <p>The name of the API product.</p>
         * 
         * <strong>example:</strong>
         * <p>weather-query-api</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the API product. The set of valid values is not declared in the API definition. Refer to the types displayed in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The idempotency token. It is generated by the caller and must be unique to prevent the same request from being repeatedly submitted and creating duplicate API products.</p>
         * 
         * <strong>example:</strong>
         * <p>5f7a2c1e-9b3d-4e8f-a1c6-0d2b8e4f7a13</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CreateProductRequest build() {
            return new CreateProductRequest(this);
        } 

    } 

}
