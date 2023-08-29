// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CatalogInput} extends {@link TeaModel}
 *
 * <p>CatalogInput</p>
 */
public class CatalogInput extends TeaModel {
    @NameInMap("CatalogId")
    @Validation(required = true)
    private String catalogId;

    @NameInMap("Description")
    private String description;

    @NameInMap("LocationUri")
    private String locationUri;

    @NameInMap("Owner")
    private String owner;

    private CatalogInput(Builder builder) {
        this.catalogId = builder.catalogId;
        this.description = builder.description;
        this.locationUri = builder.locationUri;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogInput create() {
        return builder().build();
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return locationUri
     */
    public String getLocationUri() {
        return this.locationUri;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    public static final class Builder {
        private String catalogId; 
        private String description; 
        private String locationUri; 
        private String owner; 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * LocationUri.
         */
        public Builder locationUri(String locationUri) {
            this.locationUri = locationUri;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public CatalogInput build() {
            return new CatalogInput(this);
        } 

    } 

}
