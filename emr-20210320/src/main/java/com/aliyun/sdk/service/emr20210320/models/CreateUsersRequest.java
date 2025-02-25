// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Users> users;

    private CreateUsersRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.users = builder.users;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateUsersRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private java.util.List<Users> users; 

        private Builder() {
            super();
        } 

        private Builder(CreateUsersRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.users = request.users;
        } 

        /**
         * <p>集群ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>区域ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>用户列表。</p>
         * <p>This parameter is required.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.putQueryParameter("Users", users);
            this.users = users;
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
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        @com.aliyun.core.annotation.Validation(required = true)
        private String password;

        @com.aliyun.core.annotation.NameInMap("UserName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userName;

        private Users(Builder builder) {
            this.password = builder.password;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
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
            private String password; 
            private String userName; 

            /**
             * <p>用户密码。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>*Ab123</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>用户名。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>xi</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
