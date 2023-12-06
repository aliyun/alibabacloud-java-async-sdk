// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

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
    @Header
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("categories")
    private java.util.List < String > categories;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("displayName")
    private String displayName;

    @Body
    @NameInMap("foundationVersionUID")
    private String foundationVersionUID;

    @Body
    @NameInMap("productName")
    @Validation(required = true)
    private String productName;

    @Body
    @NameInMap("vendor")
    private String vendor;

    @Body
    @NameInMap("withoutProductVersion")
    private Boolean withoutProductVersion;

    private CreateProductRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.categories = builder.categories;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.foundationVersionUID = builder.foundationVersionUID;
        this.productName = builder.productName;
        this.vendor = builder.vendor;
        this.withoutProductVersion = builder.withoutProductVersion;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return categories
     */
    public java.util.List < String > getCategories() {
        return this.categories;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return foundationVersionUID
     */
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    /**
     * @return withoutProductVersion
     */
    public Boolean getWithoutProductVersion() {
        return this.withoutProductVersion;
    }

    public static final class Builder extends Request.Builder<CreateProductRequest, Builder> {
        private String clientToken; 
        private java.util.List < String > categories; 
        private String description; 
        private String displayName; 
        private String foundationVersionUID; 
        private String productName; 
        private String vendor; 
        private Boolean withoutProductVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.categories = request.categories;
            this.description = request.description;
            this.displayName = request.displayName;
            this.foundationVersionUID = request.foundationVersionUID;
            this.productName = request.productName;
            this.vendor = request.vendor;
            this.withoutProductVersion = request.withoutProductVersion;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putHeaderParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * categories.
         */
        public Builder categories(java.util.List < String > categories) {
            this.putBodyParameter("categories", categories);
            this.categories = categories;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * foundationVersionUID.
         */
        public Builder foundationVersionUID(String foundationVersionUID) {
            this.putBodyParameter("foundationVersionUID", foundationVersionUID);
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.putBodyParameter("productName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * vendor.
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        /**
         * withoutProductVersion.
         */
        public Builder withoutProductVersion(Boolean withoutProductVersion) {
            this.putBodyParameter("withoutProductVersion", withoutProductVersion);
            this.withoutProductVersion = withoutProductVersion;
            return this;
        }

        @Override
        public CreateProductRequest build() {
            return new CreateProductRequest(this);
        } 

    } 

}
