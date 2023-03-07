// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserGroupsRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserGroupsRequest</p>
 */
public class ModifyUserGroupsRequest extends Request {
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

    private ModifyUserGroupsRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.clusterId = builder.clusterId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserGroupsRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyUserGroupsRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private java.util.List < User> user; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserGroupsRequest request) {
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
        public ModifyUserGroupsRequest build() {
            return new ModifyUserGroupsRequest(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("Group")
        private String group;

        @NameInMap("Name")
        private String name;

        private User(Builder builder) {
            this.group = builder.group;
            this.name = builder.name;
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

        public static final class Builder {
            private String group; 
            private String name; 

            /**
             * The new permission group of the user. Valid values:
             * <p>
             * 
             * *   users: an ordinary permission group. It is applicable to ordinary users that need only to submit and debug jobs.
             * *   wheel: a sudo permission group. It is applicable to the administrator who needs to manage the cluster. In addition to submitting and debugging jobs, users who have sudo permissions can run sudo commands to install software and restart nodes.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The name of the user whose permissions you want to modify. Valid values of N: 1 to 100.
             * <p>
             * 
             * You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
