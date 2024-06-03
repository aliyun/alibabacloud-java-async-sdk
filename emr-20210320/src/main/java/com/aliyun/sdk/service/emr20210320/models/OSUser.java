// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OSUser} extends {@link TeaModel}
 *
 * <p>OSUser</p>
 */
public class OSUser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.NameInMap("User")
    private String user;

    private OSUser(Builder builder) {
        this.group = builder.group;
        this.password = builder.password;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSUser create() {
        return builder().build();
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    public static final class Builder {
        private String group; 
        private String password; 
        private String user; 

        /**
         * 用户组。
         */
        public Builder group(String group) {
            this.group = group;
            return this;
        }

        /**
         * 用户密码。
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * 用户名称。
         */
        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public OSUser build() {
            return new OSUser(this);
        } 

    } 

}
