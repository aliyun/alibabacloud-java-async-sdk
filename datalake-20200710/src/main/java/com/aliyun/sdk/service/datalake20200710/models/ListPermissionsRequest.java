// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionsRequest} extends {@link RequestModel}
 *
 * <p>ListPermissionsRequest</p>
 */
public class ListPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsListUserRolePermissions")
    private Boolean isListUserRolePermissions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaResource")
    private MetaResource metaResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaResourceType")
    private String metaResourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Principal")
    private Principal principal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ListPermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.isListUserRolePermissions = builder.isListUserRolePermissions;
        this.metaResource = builder.metaResource;
        this.metaResourceType = builder.metaResourceType;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.principal = builder.principal;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionsRequest create() {
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
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return isListUserRolePermissions
     */
    public Boolean getIsListUserRolePermissions() {
        return this.isListUserRolePermissions;
    }

    /**
     * @return metaResource
     */
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    /**
     * @return metaResourceType
     */
    public String getMetaResourceType() {
        return this.metaResourceType;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<ListPermissionsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private Boolean isListUserRolePermissions; 
        private MetaResource metaResource; 
        private String metaResourceType; 
        private String nextPageToken; 
        private Integer pageSize; 
        private Principal principal; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.isListUserRolePermissions = request.isListUserRolePermissions;
            this.metaResource = request.metaResource;
            this.metaResourceType = request.metaResourceType;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
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
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * IsListUserRolePermissions.
         */
        public Builder isListUserRolePermissions(Boolean isListUserRolePermissions) {
            this.putBodyParameter("IsListUserRolePermissions", isListUserRolePermissions);
            this.isListUserRolePermissions = isListUserRolePermissions;
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
         * MetaResourceType.
         */
        public Builder metaResourceType(String metaResourceType) {
            this.putBodyParameter("MetaResourceType", metaResourceType);
            this.metaResourceType = metaResourceType;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putBodyParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListPermissionsRequest build() {
            return new ListPermissionsRequest(this);
        } 

    } 

}
