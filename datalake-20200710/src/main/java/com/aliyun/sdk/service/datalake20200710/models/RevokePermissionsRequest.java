// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokePermissionsRequest} extends {@link RequestModel}
 *
 * <p>RevokePermissionsRequest</p>
 */
public class RevokePermissionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accesses")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > accesses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DelegateAccesses")
    private java.util.List < String > delegateAccesses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private MetaResource metaResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Principal")
    @com.aliyun.core.annotation.Validation(required = true)
    private Principal principal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private RevokePermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accesses = builder.accesses;
        this.catalogId = builder.catalogId;
        this.delegateAccesses = builder.delegateAccesses;
        this.metaResource = builder.metaResource;
        this.principal = builder.principal;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokePermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accesses
     */
    public java.util.List < String > getAccesses() {
        return this.accesses;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return delegateAccesses
     */
    public java.util.List < String > getDelegateAccesses() {
        return this.delegateAccesses;
    }

    /**
     * @return metaResource
     */
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    /**
     * @return principal
     */
    public Principal getPrincipal() {
        return this.principal;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<RevokePermissionsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > accesses; 
        private String catalogId; 
        private java.util.List < String > delegateAccesses; 
        private MetaResource metaResource; 
        private Principal principal; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(RevokePermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accesses = request.accesses;
            this.catalogId = request.catalogId;
            this.delegateAccesses = request.delegateAccesses;
            this.metaResource = request.metaResource;
            this.principal = request.principal;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Accesses.
         */
        public Builder accesses(java.util.List < String > accesses) {
            this.putBodyParameter("Accesses", accesses);
            this.accesses = accesses;
            return this;
        }

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DelegateAccesses.
         */
        public Builder delegateAccesses(java.util.List < String > delegateAccesses) {
            this.putBodyParameter("DelegateAccesses", delegateAccesses);
            this.delegateAccesses = delegateAccesses;
            return this;
        }

        /**
         * MetaResource.
         */
        public Builder metaResource(MetaResource metaResource) {
            this.putBodyParameter("MetaResource", metaResource);
            this.metaResource = metaResource;
            return this;
        }

        /**
         * Principal.
         */
        public Builder principal(Principal principal) {
            this.putBodyParameter("Principal", principal);
            this.principal = principal;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public RevokePermissionsRequest build() {
            return new RevokePermissionsRequest(this);
        } 

    } 

}
