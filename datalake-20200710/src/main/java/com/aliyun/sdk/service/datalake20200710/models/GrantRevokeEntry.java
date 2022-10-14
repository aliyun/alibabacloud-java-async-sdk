// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantRevokeEntry} extends {@link TeaModel}
 *
 * <p>GrantRevokeEntry</p>
 */
public class GrantRevokeEntry extends TeaModel {
    @NameInMap("Accesses")
    private java.util.List < String > accesses;

    @NameInMap("DelegateAccesses")
    private java.util.List < String > delegateAccesses;

    @NameInMap("Id")
    private String id;

    @NameInMap("MetaResource")
    private MetaResource metaResource;

    @NameInMap("Principal")
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
         * 授权的accesses列表
         */
        public Builder accesses(java.util.List < String > accesses) {
            this.accesses = accesses;
            return this;
        }

        /**
         * 授权的grantable accesses列表
         */
        public Builder delegateAccesses(java.util.List < String > delegateAccesses) {
            this.delegateAccesses = delegateAccesses;
            return this;
        }

        /**
         * identifier for this entry
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 授权的资源
         */
        public Builder metaResource(MetaResource metaResource) {
            this.metaResource = metaResource;
            return this;
        }

        /**
         * 授权的用户principal
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
