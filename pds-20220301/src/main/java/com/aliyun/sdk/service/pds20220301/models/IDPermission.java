// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IDPermission} extends {@link TeaModel}
 *
 * <p>IDPermission</p>
 */
public class IDPermission extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disinherit_sub_group")
    private Boolean disinheritSubGroup;

    @com.aliyun.core.annotation.NameInMap("expire_time")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("permission")
    private Permission permission;

    @com.aliyun.core.annotation.NameInMap("roles")
    private java.util.List < String > roles;

    private IDPermission(Builder builder) {
        this.disinheritSubGroup = builder.disinheritSubGroup;
        this.expireTime = builder.expireTime;
        this.permission = builder.permission;
        this.roles = builder.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IDPermission create() {
        return builder().build();
    }

    /**
     * @return disinheritSubGroup
     */
    public Boolean getDisinheritSubGroup() {
        return this.disinheritSubGroup;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return permission
     */
    public Permission getPermission() {
        return this.permission;
    }

    /**
     * @return roles
     */
    public java.util.List < String > getRoles() {
        return this.roles;
    }

    public static final class Builder {
        private Boolean disinheritSubGroup; 
        private Long expireTime; 
        private Permission permission; 
        private java.util.List < String > roles; 

        /**
         * disinherit_sub_group.
         */
        public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
            this.disinheritSubGroup = disinheritSubGroup;
            return this;
        }

        /**
         * expire_time.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * permission.
         */
        public Builder permission(Permission permission) {
            this.permission = permission;
            return this;
        }

        /**
         * roles.
         */
        public Builder roles(java.util.List < String > roles) {
            this.roles = roles;
            return this;
        }

        public IDPermission build() {
            return new IDPermission(this);
        } 

    } 

}
