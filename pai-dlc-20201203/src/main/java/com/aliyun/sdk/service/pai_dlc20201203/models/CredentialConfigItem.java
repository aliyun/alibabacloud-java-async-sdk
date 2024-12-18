// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link CredentialConfigItem} extends {@link TeaModel}
 *
 * <p>CredentialConfigItem</p>
 */
public class CredentialConfigItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private java.util.List<CredentialRole> roles;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CredentialConfigItem(Builder builder) {
        this.key = builder.key;
        this.roles = builder.roles;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialConfigItem create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return roles
     */
    public java.util.List<CredentialRole> getRoles() {
        return this.roles;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String key; 
        private java.util.List<CredentialRole> roles; 
        private String type; 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * Roles.
         */
        public Builder roles(java.util.List<CredentialRole> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CredentialConfigItem build() {
            return new CredentialConfigItem(this);
        } 

    } 

}
