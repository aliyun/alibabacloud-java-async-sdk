// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductRequest</p>
 */
public class UpdateProductRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

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
    @NameInMap("vendor")
    private String vendor;

    private UpdateProductRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.categories = builder.categories;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.vendor = builder.vendor;
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
     * @return uid
     */
    public String getUid() {
        return this.uid;
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
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<UpdateProductRequest, Builder> {
        private String uid; 
        private java.util.List < String > categories; 
        private String description; 
        private String displayName; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductRequest request) {
            super(request);
            this.uid = request.uid;
            this.categories = request.categories;
            this.description = request.description;
            this.displayName = request.displayName;
            this.vendor = request.vendor;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
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
         * vendor.
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public UpdateProductRequest build() {
            return new UpdateProductRequest(this);
        } 

    } 

}
