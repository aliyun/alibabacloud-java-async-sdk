// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrivilegeResource} extends {@link TeaModel}
 *
 * <p>PrivilegeResource</p>
 */
public class PrivilegeResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Access")
    private String access;

    @com.aliyun.core.annotation.NameInMap("MetaResource")
    private MetaResource metaResource;

    private PrivilegeResource(Builder builder) {
        this.access = builder.access;
        this.metaResource = builder.metaResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrivilegeResource create() {
        return builder().build();
    }

    /**
     * @return access
     */
    public String getAccess() {
        return this.access;
    }

    /**
     * @return metaResource
     */
    public MetaResource getMetaResource() {
        return this.metaResource;
    }

    public static final class Builder {
        private String access; 
        private MetaResource metaResource; 

        /**
         * Access.
         */
        public Builder access(String access) {
            this.access = access;
            return this;
        }

        /**
         * MetaResource.
         */
        public Builder metaResource(MetaResource metaResource) {
            this.metaResource = metaResource;
            return this;
        }

        public PrivilegeResource build() {
            return new PrivilegeResource(this);
        } 

    } 

}
