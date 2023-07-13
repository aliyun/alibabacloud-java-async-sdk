// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUsersRequest} extends {@link RequestModel}
 *
 * <p>DeleteUsersRequest</p>
 */
public class DeleteUsersRequest extends Request {
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

    private DeleteUsersRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
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

    public static final class Builder extends Request.Builder<DeleteUsersRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private java.util.List < User> user; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUsersRequest request) {
            super(request);
            this.async = request.async;
            this.clusterId = request.clusterId;
            this.user = request.user;
        } 

        /**
         * Specifies whether to enable the asynchronous mode for this request.
         * <p>
         * 
         * Default value: false.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
            return this;
        }

        /**
         * The cluster ID.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to obtain the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The information about the user.
         */
        public Builder user(java.util.List < User> user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        @Override
        public DeleteUsersRequest build() {
            return new DeleteUsersRequest(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        private User(Builder builder) {
            this.name = builder.name;
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

        public static final class Builder {
            private String name; 

            /**
             * The name of the user N that you want to delete. Valid values of N: 1 to 100.
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
