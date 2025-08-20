// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link IdpLdapSubConfig} extends {@link TeaModel}
 *
 * <p>IdpLdapSubConfig</p>
 */
public class IdpLdapSubConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaseDn")
    private String baseDn;

    @com.aliyun.core.annotation.NameInMap("GroupBaseDn")
    private String groupBaseDn;

    @com.aliyun.core.annotation.NameInMap("GroupFilter")
    private String groupFilter;

    @com.aliyun.core.annotation.NameInMap("GroupMembershipAttr")
    private String groupMembershipAttr;

    @com.aliyun.core.annotation.NameInMap("GroupNameAttr")
    private String groupNameAttr;

    @com.aliyun.core.annotation.NameInMap("LoginNameAttr")
    private String loginNameAttr;

    @com.aliyun.core.annotation.NameInMap("ServerAddr")
    private String serverAddr;

    @com.aliyun.core.annotation.NameInMap("ServerPort")
    private String serverPort;

    @com.aliyun.core.annotation.NameInMap("ServerType")
    private String serverType;

    @com.aliyun.core.annotation.NameInMap("UseSsl")
    private Boolean useSsl;

    @com.aliyun.core.annotation.NameInMap("UserDn")
    private String userDn;

    @com.aliyun.core.annotation.NameInMap("UserFilter")
    private String userFilter;

    @com.aliyun.core.annotation.NameInMap("UserPassword")
    private String userPassword;

    private IdpLdapSubConfig(Builder builder) {
        this.baseDn = builder.baseDn;
        this.groupBaseDn = builder.groupBaseDn;
        this.groupFilter = builder.groupFilter;
        this.groupMembershipAttr = builder.groupMembershipAttr;
        this.groupNameAttr = builder.groupNameAttr;
        this.loginNameAttr = builder.loginNameAttr;
        this.serverAddr = builder.serverAddr;
        this.serverPort = builder.serverPort;
        this.serverType = builder.serverType;
        this.useSsl = builder.useSsl;
        this.userDn = builder.userDn;
        this.userFilter = builder.userFilter;
        this.userPassword = builder.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpLdapSubConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseDn
     */
    public String getBaseDn() {
        return this.baseDn;
    }

    /**
     * @return groupBaseDn
     */
    public String getGroupBaseDn() {
        return this.groupBaseDn;
    }

    /**
     * @return groupFilter
     */
    public String getGroupFilter() {
        return this.groupFilter;
    }

    /**
     * @return groupMembershipAttr
     */
    public String getGroupMembershipAttr() {
        return this.groupMembershipAttr;
    }

    /**
     * @return groupNameAttr
     */
    public String getGroupNameAttr() {
        return this.groupNameAttr;
    }

    /**
     * @return loginNameAttr
     */
    public String getLoginNameAttr() {
        return this.loginNameAttr;
    }

    /**
     * @return serverAddr
     */
    public String getServerAddr() {
        return this.serverAddr;
    }

    /**
     * @return serverPort
     */
    public String getServerPort() {
        return this.serverPort;
    }

    /**
     * @return serverType
     */
    public String getServerType() {
        return this.serverType;
    }

    /**
     * @return useSsl
     */
    public Boolean getUseSsl() {
        return this.useSsl;
    }

    /**
     * @return userDn
     */
    public String getUserDn() {
        return this.userDn;
    }

    /**
     * @return userFilter
     */
    public String getUserFilter() {
        return this.userFilter;
    }

    /**
     * @return userPassword
     */
    public String getUserPassword() {
        return this.userPassword;
    }

    public static final class Builder {
        private String baseDn; 
        private String groupBaseDn; 
        private String groupFilter; 
        private String groupMembershipAttr; 
        private String groupNameAttr; 
        private String loginNameAttr; 
        private String serverAddr; 
        private String serverPort; 
        private String serverType; 
        private Boolean useSsl; 
        private String userDn; 
        private String userFilter; 
        private String userPassword; 

        private Builder() {
        } 

        private Builder(IdpLdapSubConfig model) {
            this.baseDn = model.baseDn;
            this.groupBaseDn = model.groupBaseDn;
            this.groupFilter = model.groupFilter;
            this.groupMembershipAttr = model.groupMembershipAttr;
            this.groupNameAttr = model.groupNameAttr;
            this.loginNameAttr = model.loginNameAttr;
            this.serverAddr = model.serverAddr;
            this.serverPort = model.serverPort;
            this.serverType = model.serverType;
            this.useSsl = model.useSsl;
            this.userDn = model.userDn;
            this.userFilter = model.userFilter;
            this.userPassword = model.userPassword;
        } 

        /**
         * BaseDn.
         */
        public Builder baseDn(String baseDn) {
            this.baseDn = baseDn;
            return this;
        }

        /**
         * GroupBaseDn.
         */
        public Builder groupBaseDn(String groupBaseDn) {
            this.groupBaseDn = groupBaseDn;
            return this;
        }

        /**
         * GroupFilter.
         */
        public Builder groupFilter(String groupFilter) {
            this.groupFilter = groupFilter;
            return this;
        }

        /**
         * GroupMembershipAttr.
         */
        public Builder groupMembershipAttr(String groupMembershipAttr) {
            this.groupMembershipAttr = groupMembershipAttr;
            return this;
        }

        /**
         * GroupNameAttr.
         */
        public Builder groupNameAttr(String groupNameAttr) {
            this.groupNameAttr = groupNameAttr;
            return this;
        }

        /**
         * LoginNameAttr.
         */
        public Builder loginNameAttr(String loginNameAttr) {
            this.loginNameAttr = loginNameAttr;
            return this;
        }

        /**
         * ServerAddr.
         */
        public Builder serverAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }

        /**
         * ServerPort.
         */
        public Builder serverPort(String serverPort) {
            this.serverPort = serverPort;
            return this;
        }

        /**
         * ServerType.
         */
        public Builder serverType(String serverType) {
            this.serverType = serverType;
            return this;
        }

        /**
         * UseSsl.
         */
        public Builder useSsl(Boolean useSsl) {
            this.useSsl = useSsl;
            return this;
        }

        /**
         * UserDn.
         */
        public Builder userDn(String userDn) {
            this.userDn = userDn;
            return this;
        }

        /**
         * UserFilter.
         */
        public Builder userFilter(String userFilter) {
            this.userFilter = userFilter;
            return this;
        }

        /**
         * UserPassword.
         */
        public Builder userPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public IdpLdapSubConfig build() {
            return new IdpLdapSubConfig(this);
        } 

    } 

}
