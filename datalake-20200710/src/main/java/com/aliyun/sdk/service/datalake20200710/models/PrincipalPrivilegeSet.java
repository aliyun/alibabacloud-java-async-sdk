// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrincipalPrivilegeSet} extends {@link TeaModel}
 *
 * <p>PrincipalPrivilegeSet</p>
 */
public class PrincipalPrivilegeSet extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupPrivileges")
    private java.util.Map < String, java.util.List<PrivilegeGrantInfo>> groupPrivileges;

    @com.aliyun.core.annotation.NameInMap("RolePrivileges")
    private java.util.Map < String, java.util.List<PrivilegeGrantInfo>> rolePrivileges;

    @com.aliyun.core.annotation.NameInMap("UserPrivileges")
    private java.util.Map < String, java.util.List<PrivilegeGrantInfo>> userPrivileges;

    private PrincipalPrivilegeSet(Builder builder) {
        this.groupPrivileges = builder.groupPrivileges;
        this.rolePrivileges = builder.rolePrivileges;
        this.userPrivileges = builder.userPrivileges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrincipalPrivilegeSet create() {
        return builder().build();
    }

    /**
     * @return groupPrivileges
     */
    public java.util.Map < String, java.util.List<PrivilegeGrantInfo>> getGroupPrivileges() {
        return this.groupPrivileges;
    }

    /**
     * @return rolePrivileges
     */
    public java.util.Map < String, java.util.List<PrivilegeGrantInfo>> getRolePrivileges() {
        return this.rolePrivileges;
    }

    /**
     * @return userPrivileges
     */
    public java.util.Map < String, java.util.List<PrivilegeGrantInfo>> getUserPrivileges() {
        return this.userPrivileges;
    }

    public static final class Builder {
        private java.util.Map < String, java.util.List<PrivilegeGrantInfo>> groupPrivileges; 
        private java.util.Map < String, java.util.List<PrivilegeGrantInfo>> rolePrivileges; 
        private java.util.Map < String, java.util.List<PrivilegeGrantInfo>> userPrivileges; 

        /**
         * GroupPrivileges.
         */
        public Builder groupPrivileges(java.util.Map < String, java.util.List<PrivilegeGrantInfo>> groupPrivileges) {
            this.groupPrivileges = groupPrivileges;
            return this;
        }

        /**
         * RolePrivileges.
         */
        public Builder rolePrivileges(java.util.Map < String, java.util.List<PrivilegeGrantInfo>> rolePrivileges) {
            this.rolePrivileges = rolePrivileges;
            return this;
        }

        /**
         * UserPrivileges.
         */
        public Builder userPrivileges(java.util.Map < String, java.util.List<PrivilegeGrantInfo>> userPrivileges) {
            this.userPrivileges = userPrivileges;
            return this;
        }

        public PrincipalPrivilegeSet build() {
            return new PrincipalPrivilegeSet(this);
        } 

    } 

}
