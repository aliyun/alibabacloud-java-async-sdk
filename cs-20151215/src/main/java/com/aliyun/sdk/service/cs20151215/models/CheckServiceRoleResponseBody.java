// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CheckServiceRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceRoleResponseBody</p>
 */
public class CheckServiceRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("roles")
    private java.util.List<Roles> roles;

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
    public java.util.List<Roles> getRoles() {
        return this.roles;
    }

    public static final class Builder {
        private java.util.List<Roles> roles; 

        /**
         * <p>The check results.</p>
         */
        public Builder roles(java.util.List<Roles> roles) {
            this.roles = roles;
            return this;
        }

        public CheckServiceRoleResponseBody build() {
            return new CheckServiceRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckServiceRoleResponseBody} extends {@link TeaModel}
     *
     * <p>CheckServiceRoleResponseBody</p>
     */
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
             * <p>Specifies whether the service role is granted required permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder granted(Boolean granted) {
                this.granted = granted;
                return this;
            }

            /**
             * <p>The message returned if the service role is not granted required permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>The role does not exist: AliyunCSManagedAutoScalerRole</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The service role name.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunCSManagedAutoScalerRole</p>
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
