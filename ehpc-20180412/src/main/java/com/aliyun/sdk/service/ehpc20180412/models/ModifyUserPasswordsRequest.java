// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserPasswordsRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserPasswordsRequest</p>
 */
public class ModifyUserPasswordsRequest extends Request {
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
    public java.util.List < User> getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<ModifyUserPasswordsRequest, Builder> {
        private Boolean async; 
        private String clusterId; 
        private java.util.List < User> user; 

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
        public ModifyUserPasswordsRequest build() {
            return new ModifyUserPasswordsRequest(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Password")
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

            /**
             * The name of the user N whose password you want to modify. Valid values of N: 1 to 100.
             * <p>
             * 
             * You can call the [ListUsers](~~188572~~) operation to query the users of the cluster.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The password of the Nth user. The password must be 8 to 30 characters in length and contain three of the following items:
             * <p>
             * 
             * *   Uppercase letter
             * *   Lowercase letter
             * *   Digit
             * *   Special character: `()~!@#$%^&*-_+=|{}[]:;\"/<>,.?/`
             * 
             * Valid values of N: 1 to 100.
             * 
             * >  We recommend that you use HTTPS to call API operations to avoid password leaks.
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
