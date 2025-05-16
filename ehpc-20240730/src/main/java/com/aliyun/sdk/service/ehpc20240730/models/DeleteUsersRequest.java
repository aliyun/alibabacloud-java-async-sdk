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
 * {@link DeleteUsersRequest} extends {@link RequestModel}
 *
 * <p>DeleteUsersRequest</p>
 */
public class DeleteUsersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("User")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<User> user;

    private DeleteUsersRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUsersRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteUsersRequest, Builder> {
        private String clusterId; 
        private java.util.List<User> user; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUsersRequest request) {
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
         * <p>The users that you want to delete.</p>
         * <p>This parameter is required.</p>
         */
        public Builder user(java.util.List<User> user) {
            String userShrink = shrink(user, "User", "json");
            this.putQueryParameter("User", userShrink);
            this.user = user;
            return this;
        }

        @Override
        public DeleteUsersRequest build() {
            return new DeleteUsersRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteUsersRequest} extends {@link TeaModel}
     *
     * <p>DeleteUsersRequest</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userName;

        private User(Builder builder) {
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userName; 

            private Builder() {
            } 

            private Builder(User model) {
                this.userName = model.userName;
            } 

            /**
             * <p>The name of user N that you want to delete.</p>
             * <p>Valid values of N: 1 to 100.</p>
             * <p>This parameter is required.</p>
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
