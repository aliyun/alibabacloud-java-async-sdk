// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link CreateUsersRequest} extends {@link RequestModel}
 *
 * <p>CreateUsersRequest</p>
 */
public class CreateUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    private java.util.List<User> user;

    private CreateUsersRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return user
     */
    public java.util.List<User> getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<CreateUsersRequest, Builder> {
        private String clusterId; 
        private java.util.List<User> user; 

        private Builder() {
            super();
        } 

        private Builder(CreateUsersRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.user = request.user;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The users that you want to add.</p>
         */
        public Builder user(java.util.List<User> user) {
            String userShrink = shrink(user, "User", "json");
            this.putQueryParameter("User", userShrink);
            this.user = user;
            return this;
        }

        @Override
        public CreateUsersRequest build() {
            return new CreateUsersRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateUsersRequest} extends {@link TeaModel}
     *
     * <p>CreateUsersRequest</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.authKey = builder.authKey;
            this.group = builder.group;
            this.password = builder.password;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
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
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String authKey; 
            private String group; 
            private String password; 
            private String userName; 

            /**
             * <p>The public key of the user.</p>
             * <p>You can add up to 20 users in a call.</p>
             * <p>Specify one of the Password and AuthKey parameters. The AuthKey parameter takes effect only when the cluster authentication method is set to Key. Key authentication is not recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>Abc****</p>
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * <p>The permission group to which the user belongs. Valid values:</p>
             * <p>users: ordinary permissions, which are suitable for ordinary users that need only to submit and debug jobs. wheel: sudo permissions, which are suitable for administrators who need to manage clusters. In addition to submitting and debugging jobs, you can also run sudo commands to install software and restart nodes. You can add up to 20 users in a call.</p>
             * 
             * <strong>example:</strong>
             * <p>users</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The password of the user. The password must be 6 to 30 characters in length and must contain three of the following character types:</p>
             * <ul>
             * <li>Uppercase letters</li>
             * <li>Lowercase letters</li>
             * <li>Digits</li>
             * <li>Special characters ()~!@#$%^&amp;*-_+=|{}[]:;&quot;/&lt;&gt;,.?/</li>
             * </ul>
             * <p>You can add up to 20 users in a call.</p>
             * <p>Specify one of the Password and AuthKey parameters. The Password parameter takes effect only when the cluster authentication method is set to Password. Password authentication is recommended.</p>
             * 
             * <strong>example:</strong>
             * <p>1@a2****</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The username. The username must be 1 to 30 characters in length. It must start with a letter and can contain digits, letters, and periods (.).</p>
             * <p>You can add up to 20 users in a call.</p>
             * 
             * <strong>example:</strong>
             * <p>testuser</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
