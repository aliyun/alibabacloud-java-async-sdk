// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceRoleResponseBody</p>
 */
public class CheckServiceRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("roles")
    private java.util.List < Roles> roles;

    private CheckServiceRoleResponseBody(Builder builder) {
        this.roles = builder.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return roles
     */
    public java.util.List < Roles> getRoles() {
        return this.roles;
    }

    public static final class Builder {
        private java.util.List < Roles> roles; 

        /**
         * The check results.
         */
        public Builder roles(java.util.List < Roles> roles) {
            this.roles = roles;
            return this;
        }

        public CheckServiceRoleResponseBody build() {
            return new CheckServiceRoleResponseBody(this);
        } 

    } 

    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("granted")
        private Boolean granted;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Roles(Builder builder) {
            this.granted = builder.granted;
            this.message = builder.message;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return granted
         */
        public Boolean getGranted() {
            return this.granted;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean granted; 
            private String message; 
            private String name; 

            /**
             * Specifies whether the service role is granted required permissions.
             */
            public Builder granted(Boolean granted) {
                this.granted = granted;
                return this;
            }

            /**
             * The message returned if the service role is not granted required permissions.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The service role name.
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
