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
 * {@link UpdateProductRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductRequest</p>
 */
public class UpdateProductRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

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

    private UpdateProductRequest(Builder builder) {
        super(builder);
        this.productId = builder.productId;
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

    public static UpdateProductRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
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

    public static final class Builder extends Request.Builder<UpdateProductRequest, Builder> {
        private String productId; 
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

        private Builder(UpdateProductRequest request) {
            super(request);
            this.productId = request.productId;
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
         * <p>The ID of the API product. This parameter specifies the API product to be updated, which is the primary ID of the API product resource. This parameter is required. You can obtain this ID from the data.productId field in the response of the CreateProduct operation or the productId field of an item in the ListProducts response. This ID is used in the /himarket/v1/products/{productId} path to locate the API product, which is the same path used by the GetProduct, UpdateProduct, and DeleteProduct operations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        public Builder productId(String productId) {
            this.putPathParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>Specifies whether to automatically approve subscription requests for the API product.</p>
         */
        public Builder autoApprove(Boolean autoApprove) {
            this.putBodyParameter("autoApprove", autoApprove);
            this.autoApprove = autoApprove;
            return this;
        }

        /**
         * <p>The list of product categories to which the API product belongs.</p>
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
         * <p>The documentation content of the API product.</p>
         * 
         * <strong>example:</strong>
         * <p>The call methods, parameters, and billing instructions for this product</p>
         */
        public Builder document(String document) {
            this.putBodyParameter("document", document);
            this.document = document;
            return this;
        }

        /**
         * <p>The capability configuration of the API product. Currently, this configuration includes only the modelFeature member, which contains the model, maxTokens, temperature, streaming, webSearch, enableThinking, and enableMultiModal fields.</p>
         */
        public Builder feature(HiMarketProductFeature feature) {
            this.putBodyParameter("feature", feature);
            this.feature = feature;
            return this;
        }

        /**
         * <p>The icon configuration of the API product, which consists of the icon type (type) and icon information (value) fields.</p>
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
         * <p>The type of the API product. The valid values are not declared in the API definition. Refer to the types displayed in the console.</p>
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
         * <p>The idempotency token. This token is generated by the caller and must be unique to prevent duplicate submissions of the same update request.</p>
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
        public UpdateProductRequest build() {
            return new UpdateProductRequest(this);
        } 

    } 

}
