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
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
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
             * The permission group to which the user belongs. Valid values:
             * <p>
             * 
             * *   users: an ordinary permission group. It is applicable to ordinary users that need only to submit and debug jobs.
             * *   wheel: a sudo permission group. It is applicable to the administrator who needs to manage the cluster. In addition to submitting and debugging jobs, users who have sudo permissions can run sudo commands to install software and restart nodes.
             * 
             * Valid values of N: 1 to 100
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The name of the user that you want to add. The name must be 6 to 30 characters in length and can contain letters, digits, and periods (.). It must start with a letter.
             * <p>
             * 
             * Valid values of N: 1 to 100
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The password of the user. The password must be 8 to 30 characters in length and contain three of the following items:
             * <p>
             * 
             * *   Uppercase letter
             * *   Lowercase letter
             * *   Digit
             * *   Special character: `()~!@#$%^&*-_+=|{}[]:;\"/<>,.?/`
             * 
             * Valid values of N: 1 to 100
             * 
             * >  We recommend that you use HTTPS to call the AddUsers operation to ensure that the password remains confidential.
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
