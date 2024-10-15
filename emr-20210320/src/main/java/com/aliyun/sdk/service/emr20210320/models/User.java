// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link User} extends {@link TeaModel}
 *
 * <p>User</p>
 */
public class User extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Group")
    private String group;

    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.NameInMap("UserType")
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
         * <p>用户组。</p>
         * 
         * <strong>example:</strong>
         * <p>hadoop</p>
         */
        public Builder group(String group) {
            this.group = group;
            return this;
        }

        /**
         * <p>用户密码。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345****</p>
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * <p>用户ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1238539****</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>用户名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>王五</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * <p>用户类型。</p>
         * 
         * <strong>example:</strong>
         * <p>LDAP</p>
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
