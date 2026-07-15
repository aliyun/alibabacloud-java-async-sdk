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
 * {@link SignalTarget} extends {@link TeaModel}
 *
 * <p>SignalTarget</p>
 */
public class SignalTarget extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PodNames")
    private java.util.List<String> podNames;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private java.util.List<String> roles;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private SignalTarget(Builder builder) {
        this.podNames = builder.podNames;
        this.roles = builder.roles;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignalTarget create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return podNames
     */
    public java.util.List<String> getPodNames() {
        return this.podNames;
    }

    /**
     * @return roles
     */
    public java.util.List<String> getRoles() {
        return this.roles;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private java.util.List<String> podNames; 
        private java.util.List<String> roles; 
        private String scope; 

        private Builder() {
        } 

        private Builder(SignalTarget model) {
            this.podNames = model.podNames;
            this.roles = model.roles;
            this.scope = model.scope;
        } 

        /**
         * PodNames.
         */
        public Builder podNames(java.util.List<String> podNames) {
            this.podNames = podNames;
            return this;
        }

        /**
         * Roles.
         */
        public Builder roles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public SignalTarget build() {
            return new SignalTarget(this);
        } 

    } 

}
