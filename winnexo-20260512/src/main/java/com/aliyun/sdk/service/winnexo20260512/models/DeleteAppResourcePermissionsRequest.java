// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link DeleteAppResourcePermissionsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppResourcePermissionsRequest</p>
 */
public class DeleteAppResourcePermissionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceTenantId")
    private String resourceTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private DeleteAppResourcePermissionsRequest(Builder builder) {
        super(builder);
        this.items = builder.items;
        this.resourceTenantId = builder.resourceTenantId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppResourcePermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return resourceTenantId
     */
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DeleteAppResourcePermissionsRequest, Builder> {
        private java.util.List<Items> items; 
        private String resourceTenantId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppResourcePermissionsRequest request) {
            super(request);
            this.items = request.items;
            this.resourceTenantId = request.resourceTenantId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The scope of the permissions to be revoked.</p>
         * <p>This parameter is required.</p>
         */
        public Builder items(java.util.List<Items> items) {
            String itemsShrink = shrink(items, "items", "json");
            this.putBodyParameter("items", itemsShrink);
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the tenant to which the resource belongs. If not specified, the current tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder resourceTenantId(String resourceTenantId) {
            this.putBodyParameter("resourceTenantId", resourceTenantId);
            this.resourceTenantId = resourceTenantId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DeleteAppResourcePermissionsRequest build() {
            return new DeleteAppResourcePermissionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAppResourcePermissionsRequest} extends {@link TeaModel}
     *
     * <p>DeleteAppResourcePermissionsRequest</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("granteeIds")
        private java.util.List<String> granteeIds;

        @com.aliyun.core.annotation.NameInMap("granteeTenantId")
        private String granteeTenantId;

        @com.aliyun.core.annotation.NameInMap("granteeType")
        private String granteeType;

        @com.aliyun.core.annotation.NameInMap("includeDescendants")
        private Boolean includeDescendants;

        @com.aliyun.core.annotation.NameInMap("resourceKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceKey;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("scope")
        @com.aliyun.core.annotation.Validation(required = true)
        private String scope;

        private Items(Builder builder) {
            this.granteeIds = builder.granteeIds;
            this.granteeTenantId = builder.granteeTenantId;
            this.granteeType = builder.granteeType;
            this.includeDescendants = builder.includeDescendants;
            this.resourceKey = builder.resourceKey;
            this.resourceType = builder.resourceType;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return granteeIds
         */
        public java.util.List<String> getGranteeIds() {
            return this.granteeIds;
        }

        /**
         * @return granteeTenantId
         */
        public String getGranteeTenantId() {
            return this.granteeTenantId;
        }

        /**
         * @return granteeType
         */
        public String getGranteeType() {
            return this.granteeType;
        }

        /**
         * @return includeDescendants
         */
        public Boolean getIncludeDescendants() {
            return this.includeDescendants;
        }

        /**
         * @return resourceKey
         */
        public String getResourceKey() {
            return this.resourceKey;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private java.util.List<String> granteeIds; 
            private String granteeTenantId; 
            private String granteeType; 
            private Boolean includeDescendants; 
            private String resourceKey; 
            private String resourceType; 
            private String scope; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.granteeIds = model.granteeIds;
                this.granteeTenantId = model.granteeTenantId;
                this.granteeType = model.granteeType;
                this.includeDescendants = model.includeDescendants;
                this.resourceKey = model.resourceKey;
                this.resourceType = model.resourceType;
                this.scope = model.scope;
            } 

            /**
             * <p>The list of grantee principal IDs.</p>
             */
            public Builder granteeIds(java.util.List<String> granteeIds) {
                this.granteeIds = granteeIds;
                return this;
            }

            /**
             * <p>The ID of the tenant to which the grantee user belongs. This parameter is optional if the user and the resource belong to the same tenant, and is required for cross-tenant users.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder granteeTenantId(String granteeTenantId) {
                this.granteeTenantId = granteeTenantId;
                return this;
            }

            /**
             * <p>The grantee principal type.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder granteeType(String granteeType) {
                this.granteeType = granteeType;
                return this;
            }

            /**
             * <p>Specifies whether to include dot-separated descendant resources for the RESOURCE. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder includeDescendants(Boolean includeDescendants) {
                this.includeDescendants = includeDescendants;
                return this;
            }

            /**
             * <p>The dot-separated resource key whose first segment is the application key of the APP.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>app.demo.resource_1</p>
             */
            public Builder resourceKey(String resourceKey) {
                this.resourceKey = resourceKey;
                return this;
            }

            /**
             * <p>The resource type. Set the value to APP_RESOURCE.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>APP_RESOURCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The deletion scope: by resource or by principal.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RESOURCE</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
