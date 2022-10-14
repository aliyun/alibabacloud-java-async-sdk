// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccessRequest} extends {@link RequestModel}
 *
 * <p>AccessRequest</p>
 */
public class AccessRequest extends Request {
    @NameInMap("CatalogId")
    private String catalogId;

    @NameInMap("Principal")
    private Principal principal;

    @NameInMap("PrivilegeResources")
    private java.util.List < PrivilegeResource > privilegeResources;

    private AccessRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.principal = builder.principal;
        this.privilegeResources = builder.privilegeResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return principal
     */
    public Principal getPrincipal() {
        return this.principal;
    }

    /**
     * @return privilegeResources
     */
    public java.util.List < PrivilegeResource > getPrivilegeResources() {
        return this.privilegeResources;
    }

    public static final class Builder extends Request.Builder<AccessRequest, Builder> {
        private String catalogId; 
        private Principal principal; 
        private java.util.List < PrivilegeResource > privilegeResources; 

        private Builder() {
            super();
        } 

        private Builder(AccessRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.principal = request.principal;
            this.privilegeResources = request.privilegeResources;
        } 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Principal.
         */
        public Builder principal(Principal principal) {
            this.principal = principal;
            return this;
        }

        /**
         * PrivilegeResources.
         */
        public Builder privilegeResources(java.util.List < PrivilegeResource > privilegeResources) {
            this.privilegeResources = privilegeResources;
            return this;
        }

        @Override
        public AccessRequest build() {
            return new AccessRequest(this);
        } 

    } 

}
