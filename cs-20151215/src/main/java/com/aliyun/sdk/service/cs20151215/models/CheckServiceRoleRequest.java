// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceRoleRequest} extends {@link RequestModel}
 *
 * <p>CheckServiceRoleRequest</p>
 */
public class CheckServiceRoleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roles")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Roles> roles;

    private CheckServiceRoleRequest(Builder builder) {
        super(builder);
        this.roles = builder.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roles
     */
    public java.util.List < Roles> getRoles() {
        return this.roles;
    }

    public static final class Builder extends Request.Builder<CheckServiceRoleRequest, Builder> {
        private java.util.List < Roles> roles; 

        private Builder() {
            super();
        } 

        private Builder(CheckServiceRoleRequest request) {
            super(request);
            this.roles = request.roles;
        } 

        /**
         * roles.
         */
        public Builder roles(java.util.List < Roles> roles) {
            this.putBodyParameter("roles", roles);
            this.roles = roles;
            return this;
        }

        @Override
        public CheckServiceRoleRequest build() {
            return new CheckServiceRoleRequest(this);
        } 

    } 

    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private Roles(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
}
