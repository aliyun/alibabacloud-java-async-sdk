// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link User} extends {@link TeaModel}
 *
 * <p>User</p>
 */
public class User extends TeaModel {
    @NameInMap("Group")
    private String group;

    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    @NameInMap("UserType")
    private String userType;

    private User(Builder builder) {
        this.group = builder.group;
        this.password = builder.password;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static User create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder {
        private String group; 
        private String password; 
        private String userId; 
        private String userName; 
        private String userType; 

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
         * 用户ID。
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * 用户名称。
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * 用户类型。
         */
        public Builder userType(String userType) {
            this.userType = userType;
            return this;
        }

        public User build() {
            return new User(this);
        } 

    } 

}
