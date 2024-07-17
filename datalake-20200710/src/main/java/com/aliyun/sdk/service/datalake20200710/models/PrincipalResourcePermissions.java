// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrincipalResourcePermissions} extends {@link TeaModel}
 *
 * <p>PrincipalResourcePermissions</p>
 */
public class PrincipalResourcePermissions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accesses")
    private java.util.List < String > accesses;

    @com.aliyun.core.annotation.NameInMap("DelegateAccesses")
    private java.util.List < String > delegateAccesses;

    @com.aliyun.core.annotation.NameInMap("MetaResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private MetaResource metaResource;

    @com.aliyun.core.annotation.NameInMap("Principal")
    @com.aliyun.core.annotation.Validation(required = true)
    private Principal principal;

    private PrincipalResourcePermissions(Builder builder) {
        this.accesses = builder.accesses;
        this.delegateAccesses = builder.delegateAccesses;
        this.metaResource = builder.metaResource;
        this.principal = builder.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrincipalResourcePermissions create() {
        return builder().build();
    }

    /**
     * @return accesses
     */
    public java.util.List < String > getAccesses() {
        return this.accesses;
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

    public static final class Builder {
        private java.util.List < String > accesses; 
        private java.util.List < String > delegateAccesses; 
        private MetaResource metaResource; 
        private Principal principal; 

        /**
         * Accesses.
         */
        public Builder accesses(java.util.List < String > accesses) {
            this.accesses = accesses;
            return this;
        }

        /**
         * DelegateAccesses.
         */
        public Builder delegateAccesses(java.util.List < String > delegateAccesses) {
            this.delegateAccesses = delegateAccesses;
            return this;
        }

        /**
         * MetaResource.
         */
        public Builder metaResource(MetaResource metaResource) {
            this.metaResource = metaResource;
            return this;
        }

        /**
         * Principal.
         */
        public Builder principal(Principal principal) {
            this.principal = principal;
            return this;
        }

        public PrincipalResourcePermissions build() {
            return new PrincipalResourcePermissions(this);
        } 

    } 

}
