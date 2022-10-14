// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrincipalResourcePermissions} extends {@link TeaModel}
 *
 * <p>PrincipalResourcePermissions</p>
 */
public class PrincipalResourcePermissions extends TeaModel {
    @NameInMap("Accesses")
    private java.util.List < String > accesses;

    @NameInMap("DelegateAccesses")
    private java.util.List < String > delegateAccesses;

    @NameInMap("MetaResource")
    @Validation(required = true)
    private MetaResource metaResource;

    @NameInMap("Principal")
    @Validation(required = true)
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
         * 权限
         */
        public Builder accesses(java.util.List < String > accesses) {
            this.accesses = accesses;
            return this;
        }

        /**
         * grantable权限
         */
        public Builder delegateAccesses(java.util.List < String > delegateAccesses) {
            this.delegateAccesses = delegateAccesses;
            return this;
        }

        /**
         * 权限信息所属的Hive元数据资源
         */
        public Builder metaResource(MetaResource metaResource) {
            this.metaResource = metaResource;
            return this;
        }

        /**
         * 权限信息所属的Principal
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
