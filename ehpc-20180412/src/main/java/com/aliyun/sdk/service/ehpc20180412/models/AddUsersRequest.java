// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link AddUsersRequest} extends {@link RequestModel}
 *
 * <p>AddUsersRequest</p>
 */
public class AddUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Async")
    private Boolean async;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<User> user;

    private AddUsersRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
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

    public static final class Builder extends Request.Builder<AddUsersRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private java.util.List<User> user; 

        private Builder() {
            super();
        } 

        private Builder(AddUsersRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
            this.user = request.user;
        } 

        /**
         * <p>Specifies whether to use asynchronous message links to add the users.</p>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to obtain the cluster ID.</p>
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
         * <p>The users. You can specify 1 to 100 users.</p>
         * <p>This parameter is required.</p>
         */
        public Builder user(java.util.List<User> user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public AddUsersRequest build() {
            return new AddUsersRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddUsersRequest} extends {@link TeaModel}
     *
     * <p>AddUsersRequest</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        private User(Builder builder) {
            this.group = builder.group;
            this.name = builder.name;
            this.password = builder.password;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        public static final class Builder {
            private String group; 
            private String name; 
            private String password; 

            private Builder() {
            } 

            private Builder(User model) {
                this.group = model.group;
                this.name = model.name;
                this.password = model.password;
            } 

            /**
             * <p>The permission group of the new user. Valid values:</p>
             * <ul>
             * <li>users: ordinary permissions, which are suitable for ordinary users that need only to submit and debug jobs.</li>
             * <li>wheel: sudo permissions, which are suitable for administrators who need to manage clusters. In addition to submitting and debugging jobs, you can also run sudo commands to install software and restart nodes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>users</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The username of the new user. The username must be 6 to 30 characters in length, and can contain letters, digits and periods (.). The username must start with a letter.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The password of the new user. The password must be 8 to 30 characters in length and must contain at least three of the following character types:</p>
             * <ul>
             * <li>Uppercase letter</li>
             * <li>Lowercase letter</li>
             * <li>Digit</li>
             * <li>Special character: <code>()~!@#$%^&amp;*-_+=|{}[]:;\&quot;/&lt;&gt;,.?/</code></li>
             * </ul>
             * <blockquote>
             * <p> We recommend that you use HTTPS to call this operation to avoid password leaks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1@a2****</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
