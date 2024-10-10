// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CustomHostAlias} extends {@link TeaModel}
 *
 * <p>CustomHostAlias</p>
 */
public class CustomHostAlias extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hostAliases")
    private java.util.List < HostAlias > hostAliases;

    private CustomHostAlias(Builder builder) {
        this.hostAliases = builder.hostAliases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CustomHostAlias create() {
        return builder().build();
    }

    /**
     * @return hostAliases
     */
    public java.util.List < HostAlias > getHostAliases() {
        return this.hostAliases;
    }

    public static final class Builder {
        private java.util.List < HostAlias > hostAliases; 

        /**
         * hostAliases.
         */
        public Builder hostAliases(java.util.List < HostAlias > hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }

        public CustomHostAlias build() {
            return new CustomHostAlias(this);
        } 

    } 

}
