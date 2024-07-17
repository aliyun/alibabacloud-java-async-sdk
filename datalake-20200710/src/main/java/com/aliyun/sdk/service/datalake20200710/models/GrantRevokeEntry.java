// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantRevokeEntry} extends {@link TeaModel}
 *
 * <p>GrantRevokeEntry</p>
 */
public class GrantRevokeEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accesses")
    private java.util.List < String > accesses;

    @com.aliyun.core.annotation.NameInMap("DelegateAccesses")
    private java.util.List < String > delegateAccesses;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("MetaResource")
    private MetaResource metaResource;

    @com.aliyun.core.annotation.NameInMap("Principal")
    private Principal principal;

    private GrantRevokeEntry(Builder builder) {
        this.accesses = builder.accesses;
        this.delegateAccesses = builder.delegateAccesses;
        this.id = builder.id;
        this.metaResource = builder.metaResource;
        this.principal = builder.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantRevokeEntry create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
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
        private String id; 
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
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
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

        public GrantRevokeEntry build() {
            return new GrantRevokeEntry(this);
        } 

    } 

}
