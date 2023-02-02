// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUsersRequest} extends {@link RequestModel}
 *
 * <p>AddUsersRequest</p>
 */
public class AddUsersRequest extends Request {
    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("User")
    @Validation(required = true)
    private java.util.List < User> user;

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
    public java.util.List < User> getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<AddUsersRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private java.util.List < User> user; 

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
         * Async.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * User.
         */
        public Builder user(java.util.List < User> user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public AddUsersRequest build() {
            return new AddUsersRequest(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("Group")
        private String group;

        @NameInMap("Name")
        private String name;

        @NameInMap("Password")
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

            /**
             * Group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Password.
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
