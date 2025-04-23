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
 * {@link ModifyUserPasswordsRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserPasswordsRequest</p>
 */
public class ModifyUserPasswordsRequest extends Request {
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

    private ModifyUserPasswordsRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserPasswordsRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyUserPasswordsRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private java.util.List<User> user; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserPasswordsRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
            this.user = request.user;
        } 

        /**
         * <p>Specifies whether to enable the asynchronous mode for this request.</p>
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
        public ModifyUserPasswordsRequest build() {
            return new ModifyUserPasswordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyUserPasswordsRequest} extends {@link TeaModel}
     *
     * <p>ModifyUserPasswordsRequest</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        private User(Builder builder) {
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
            private String name; 
            private String password; 

            private Builder() {
            } 

            private Builder(User model) {
                this.name = model.name;
                this.password = model.password;
            } 

            /**
             * <p>The username of the user whose password you want to change.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/188572.html">ListUsers</a> operation to query the usernames in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>user1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The new password for the user. The password must be 8 to 30 characters in length and contain at least three of the following character types:</p>
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
             * <p>1@a****</p>
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
