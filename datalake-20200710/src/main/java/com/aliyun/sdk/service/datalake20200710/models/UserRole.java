// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UserRole} extends {@link TeaModel}
 *
 * <p>UserRole</p>
 */
public class UserRole extends TeaModel {
    @NameInMap("GrantTime")
    private Long grantTime;

    @NameInMap("Role")
    private Role role;

    @NameInMap("User")
    private Principal user;

    private UserRole(Builder builder) {
        this.grantTime = builder.grantTime;
        this.role = builder.role;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserRole create() {
        return builder().build();
    }

    /**
     * @return grantTime
     */
    public Long getGrantTime() {
        return this.grantTime;
    }

    /**
     * @return role
     */
    public Role getRole() {
        return this.role;
    }

    /**
     * @return user
     */
    public Principal getUser() {
        return this.user;
    }

    public static final class Builder {
        private Long grantTime; 
        private Role role; 
        private Principal user; 

        /**
         * GrantTime.
         */
        public Builder grantTime(Long grantTime) {
            this.grantTime = grantTime;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        /**
         * User.
         */
        public Builder user(Principal user) {
            this.user = user;
            return this;
        }

        public UserRole build() {
            return new UserRole(this);
        } 

    } 

}
