// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantPermissionsRequest} extends {@link RequestModel}
 *
 * <p>GrantPermissionsRequest</p>
 */
public class GrantPermissionsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Accesses")
    @Validation(required = true)
    private java.util.List < String > accesses;

    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DelegateAccesses")
    @Validation(required = true)
    private java.util.List < String > delegateAccesses;

    @Body
    @NameInMap("MetaResource")
    @Validation(required = true)
    private MetaResource metaResource;

    @Body
    @NameInMap("Principal")
    @Validation(required = true)
    private Principal principal;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private GrantPermissionsRequest(Builder builder) {
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

    public static GrantPermissionsRequest create() {
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

    public static final class Builder extends Request.Builder<GrantPermissionsRequest, Builder> {
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

        private Builder(GrantPermissionsRequest request) {
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
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 授权的accesses列表
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
         * 授权的grantable accesses列表
         */
        public Builder delegateAccesses(java.util.List < String > delegateAccesses) {
            this.putBodyParameter("DelegateAccesses", delegateAccesses);
            this.delegateAccesses = delegateAccesses;
            return this;
        }

        /**
         * 授权meta资源
         */
        public Builder metaResource(MetaResource metaResource) {
            this.putBodyParameter("MetaResource", metaResource);
            this.metaResource = metaResource;
            return this;
        }

        /**
         * 授权的用户/角色principal
         */
        public Builder principal(Principal principal) {
            this.putBodyParameter("Principal", principal);
            this.principal = principal;
            return this;
        }

        /**
         * 授权的类型，目前仅支持hive
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GrantPermissionsRequest build() {
            return new GrantPermissionsRequest(this);
        } 

    } 

}
