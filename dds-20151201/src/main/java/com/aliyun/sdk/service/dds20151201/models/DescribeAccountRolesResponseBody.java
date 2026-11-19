// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeAccountRolesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccountRolesResponseBody</p>
 */
public class DescribeAccountRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private Roles roles;

    private DescribeAccountRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roles = builder.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountRolesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roles
     */
    public Roles getRoles() {
        return this.roles;
    }

    public static final class Builder {
        private String requestId; 
        private Roles roles; 

        private Builder() {
        } 

        private Builder(DescribeAccountRolesResponseBody model) {
            this.requestId = model.requestId;
            this.roles = model.roles;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7FEF1BEF-2842-5758-9126-415A297*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Roles.
         */
        public Builder roles(Roles roles) {
            this.roles = roles;
            return this;
        }

        public DescribeAccountRolesResponseBody build() {
            return new DescribeAccountRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccountRolesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountRolesResponseBody</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBName")
        private String DBName;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private Role(Builder builder) {
            this.DBName = builder.DBName;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String DBName; 
            private String role; 

            private Builder() {
            } 

            private Builder(Role model) {
                this.DBName = model.DBName;
                this.role = model.role;
            } 

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccountRolesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccountRolesResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Role")
        private java.util.List<Role> role;

        private Roles(Builder builder) {
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public java.util.List<Role> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<Role> role; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.role = model.role;
            } 

            /**
             * Role.
             */
            public Builder role(java.util.List<Role> role) {
                this.role = role;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
}
